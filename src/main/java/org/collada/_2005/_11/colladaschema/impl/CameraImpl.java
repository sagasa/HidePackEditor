//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.Asset;
import org.collada._2005._11.colladaschema.Camera;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.TargetableFloat;
import org.collada._2005._11.colladaschema.Technique;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asset",
    "optics",
    "imager",
    "extras"
})
@XmlRootElement(name = "camera")
public class CameraImpl
    implements Camera
{

    @XmlElement(type = AssetImpl.class)
    protected AssetImpl asset;
    @XmlElement(required = true, type = CameraImpl.OpticsImpl.class)
    protected CameraImpl.OpticsImpl optics;
    @XmlElement(type = CameraImpl.ImagerImpl.class)
    protected CameraImpl.ImagerImpl imager;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset value) {
        this.asset = ((AssetImpl) value);
    }

    public Camera.Optics getOptics() {
        return optics;
    }

    public void setOptics(Camera.Optics value) {
        this.optics = ((CameraImpl.OpticsImpl) value);
    }

    public Camera.Imager getImager() {
        return imager;
    }

    public void setImager(Camera.Imager value) {
        this.imager = ((CameraImpl.ImagerImpl) value);
    }

    public List<Extra> getExtras() {
        if (extras == null) {
            extras = new ArrayList<Extra>();
        }
        return this.extras;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "techniques",
        "extras"
    })
    public static class ImagerImpl
        implements Camera.Imager
    {

        @XmlElement(name = "technique", required = true, type = TechniqueImpl.class)
        protected List<Technique> techniques;
        @XmlElement(name = "extra", type = ExtraImpl.class)
        protected List<Extra> extras;

        public List<Technique> getTechniques() {
            if (techniques == null) {
                techniques = new ArrayList<Technique>();
            }
            return this.techniques;
        }

        public List<Extra> getExtras() {
            if (extras == null) {
                extras = new ArrayList<Extra>();
            }
            return this.extras;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "techniqueCommon",
        "techniques",
        "extras"
    })
    public static class OpticsImpl
        implements Camera.Optics
    {

        @XmlElement(name = "technique_common", required = true, type = CameraImpl.OpticsImpl.TechniqueCommonImpl.class)
        protected CameraImpl.OpticsImpl.TechniqueCommonImpl techniqueCommon;
        @XmlElement(name = "technique", type = TechniqueImpl.class)
        protected List<Technique> techniques;
        @XmlElement(name = "extra", type = ExtraImpl.class)
        protected List<Extra> extras;

        public Camera.Optics.TechniqueCommon getTechniqueCommon() {
            return techniqueCommon;
        }

        public void setTechniqueCommon(Camera.Optics.TechniqueCommon value) {
            this.techniqueCommon = ((CameraImpl.OpticsImpl.TechniqueCommonImpl) value);
        }

        public List<Technique> getTechniques() {
            if (techniques == null) {
                techniques = new ArrayList<Technique>();
            }
            return this.techniques;
        }

        public List<Extra> getExtras() {
            if (extras == null) {
                extras = new ArrayList<Extra>();
            }
            return this.extras;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "perspective",
            "orthographic"
        })
        public static class TechniqueCommonImpl
            implements Camera.Optics.TechniqueCommon
        {

            @XmlElement(type = CameraImpl.OpticsImpl.TechniqueCommonImpl.PerspectiveImpl.class)
            protected CameraImpl.OpticsImpl.TechniqueCommonImpl.PerspectiveImpl perspective;
            @XmlElement(type = CameraImpl.OpticsImpl.TechniqueCommonImpl.OrthographicImpl.class)
            protected CameraImpl.OpticsImpl.TechniqueCommonImpl.OrthographicImpl orthographic;

            public Camera.Optics.TechniqueCommon.Perspective getPerspective() {
                return perspective;
            }

            public void setPerspective(Camera.Optics.TechniqueCommon.Perspective value) {
                this.perspective = ((CameraImpl.OpticsImpl.TechniqueCommonImpl.PerspectiveImpl) value);
            }

            public Camera.Optics.TechniqueCommon.Orthographic getOrthographic() {
                return orthographic;
            }

            public void setOrthographic(Camera.Optics.TechniqueCommon.Orthographic value) {
                this.orthographic = ((CameraImpl.OpticsImpl.TechniqueCommonImpl.OrthographicImpl) value);
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "xmag",
                "ymag",
                "aspectRatio",
                "znear",
                "zfar"
            })
            public static class OrthographicImpl
                implements Camera.Optics.TechniqueCommon.Orthographic
            {

                @XmlElement(type = TargetableFloatImpl.class)
                protected TargetableFloatImpl xmag;
                @XmlElement(type = TargetableFloatImpl.class)
                protected TargetableFloatImpl ymag;
                @XmlElement(name = "aspect_ratio", type = TargetableFloatImpl.class)
                protected TargetableFloatImpl aspectRatio;
                @XmlElement(required = true, type = TargetableFloatImpl.class)
                protected TargetableFloatImpl znear;
                @XmlElement(required = true, type = TargetableFloatImpl.class)
                protected TargetableFloatImpl zfar;

                public TargetableFloat getXmag() {
                    return xmag;
                }

                public void setXmag(TargetableFloat value) {
                    this.xmag = ((TargetableFloatImpl) value);
                }

                public TargetableFloat getYmag() {
                    return ymag;
                }

                public void setYmag(TargetableFloat value) {
                    this.ymag = ((TargetableFloatImpl) value);
                }

                public TargetableFloat getAspectRatio() {
                    return aspectRatio;
                }

                public void setAspectRatio(TargetableFloat value) {
                    this.aspectRatio = ((TargetableFloatImpl) value);
                }

                public TargetableFloat getZnear() {
                    return znear;
                }

                public void setZnear(TargetableFloat value) {
                    this.znear = ((TargetableFloatImpl) value);
                }

                public TargetableFloat getZfar() {
                    return zfar;
                }

                public void setZfar(TargetableFloat value) {
                    this.zfar = ((TargetableFloatImpl) value);
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "xfov",
                "yfov",
                "aspectRatio",
                "znear",
                "zfar"
            })
            public static class PerspectiveImpl
                implements Camera.Optics.TechniqueCommon.Perspective
            {

                @XmlElement(type = TargetableFloatImpl.class)
                protected TargetableFloatImpl xfov;
                @XmlElement(type = TargetableFloatImpl.class)
                protected TargetableFloatImpl yfov;
                @XmlElement(name = "aspect_ratio", type = TargetableFloatImpl.class)
                protected TargetableFloatImpl aspectRatio;
                @XmlElement(required = true, type = TargetableFloatImpl.class)
                protected TargetableFloatImpl znear;
                @XmlElement(required = true, type = TargetableFloatImpl.class)
                protected TargetableFloatImpl zfar;

                public TargetableFloat getXfov() {
                    return xfov;
                }

                public void setXfov(TargetableFloat value) {
                    this.xfov = ((TargetableFloatImpl) value);
                }

                public TargetableFloat getYfov() {
                    return yfov;
                }

                public void setYfov(TargetableFloat value) {
                    this.yfov = ((TargetableFloatImpl) value);
                }

                public TargetableFloat getAspectRatio() {
                    return aspectRatio;
                }

                public void setAspectRatio(TargetableFloat value) {
                    this.aspectRatio = ((TargetableFloatImpl) value);
                }

                public TargetableFloat getZnear() {
                    return znear;
                }

                public void setZnear(TargetableFloat value) {
                    this.znear = ((TargetableFloatImpl) value);
                }

                public TargetableFloat getZfar() {
                    return zfar;
                }

                public void setZfar(TargetableFloat value) {
                    this.zfar = ((TargetableFloatImpl) value);
                }

            }

        }

    }

}
