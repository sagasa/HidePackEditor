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
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.Light;
import org.collada._2005._11.colladaschema.TargetableFloat;
import org.collada._2005._11.colladaschema.TargetableFloat3;
import org.collada._2005._11.colladaschema.Technique;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asset",
    "techniqueCommon",
    "techniques",
    "extras"
})
@XmlRootElement(name = "light")
public class LightImpl
    implements Light
{

    @XmlElement(type = AssetImpl.class)
    protected AssetImpl asset;
    @XmlElement(name = "technique_common", required = true, type = LightImpl.TechniqueCommonImpl.class)
    protected LightImpl.TechniqueCommonImpl techniqueCommon;
    @XmlElement(name = "technique", type = TechniqueImpl.class)
    protected List<Technique> techniques;
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

    public Light.TechniqueCommon getTechniqueCommon() {
        return techniqueCommon;
    }

    public void setTechniqueCommon(Light.TechniqueCommon value) {
        this.techniqueCommon = ((LightImpl.TechniqueCommonImpl) value);
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
        "spot",
        "point",
        "directional",
        "ambient"
    })
    public static class TechniqueCommonImpl
        implements Light.TechniqueCommon
    {

        @XmlElement(type = LightImpl.TechniqueCommonImpl.SpotImpl.class)
        protected LightImpl.TechniqueCommonImpl.SpotImpl spot;
        @XmlElement(type = LightImpl.TechniqueCommonImpl.PointImpl.class)
        protected LightImpl.TechniqueCommonImpl.PointImpl point;
        @XmlElement(type = LightImpl.TechniqueCommonImpl.DirectionalImpl.class)
        protected LightImpl.TechniqueCommonImpl.DirectionalImpl directional;
        @XmlElement(type = LightImpl.TechniqueCommonImpl.AmbientImpl.class)
        protected LightImpl.TechniqueCommonImpl.AmbientImpl ambient;

        public Light.TechniqueCommon.Spot getSpot() {
            return spot;
        }

        public void setSpot(Light.TechniqueCommon.Spot value) {
            this.spot = ((LightImpl.TechniqueCommonImpl.SpotImpl) value);
        }

        public Light.TechniqueCommon.Point getPoint() {
            return point;
        }

        public void setPoint(Light.TechniqueCommon.Point value) {
            this.point = ((LightImpl.TechniqueCommonImpl.PointImpl) value);
        }

        public Light.TechniqueCommon.Directional getDirectional() {
            return directional;
        }

        public void setDirectional(Light.TechniqueCommon.Directional value) {
            this.directional = ((LightImpl.TechniqueCommonImpl.DirectionalImpl) value);
        }

        public Light.TechniqueCommon.Ambient getAmbient() {
            return ambient;
        }

        public void setAmbient(Light.TechniqueCommon.Ambient value) {
            this.ambient = ((LightImpl.TechniqueCommonImpl.AmbientImpl) value);
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "color"
        })
        public static class AmbientImpl
            implements Light.TechniqueCommon.Ambient
        {

            @XmlElement(required = true, type = TargetableFloat3Impl.class)
            protected TargetableFloat3Impl color;

            public TargetableFloat3 getColor() {
                return color;
            }

            public void setColor(TargetableFloat3 value) {
                this.color = ((TargetableFloat3Impl) value);
            }

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "color"
        })
        public static class DirectionalImpl
            implements Light.TechniqueCommon.Directional
        {

            @XmlElement(required = true, type = TargetableFloat3Impl.class)
            protected TargetableFloat3Impl color;

            public TargetableFloat3 getColor() {
                return color;
            }

            public void setColor(TargetableFloat3 value) {
                this.color = ((TargetableFloat3Impl) value);
            }

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "color",
            "constantAttenuation",
            "linearAttenuation",
            "quadraticAttenuation"
        })
        public static class PointImpl
            implements Light.TechniqueCommon.Point
        {

            @XmlElement(required = true, type = TargetableFloat3Impl.class)
            protected TargetableFloat3Impl color;
            @XmlElement(name = "constant_attenuation", type = TargetableFloatImpl.class, defaultValue = "1.0")
            protected TargetableFloatImpl constantAttenuation;
            @XmlElement(name = "linear_attenuation", type = TargetableFloatImpl.class, defaultValue = "0.0")
            protected TargetableFloatImpl linearAttenuation;
            @XmlElement(name = "quadratic_attenuation", type = TargetableFloatImpl.class, defaultValue = "0.0")
            protected TargetableFloatImpl quadraticAttenuation;

            public TargetableFloat3 getColor() {
                return color;
            }

            public void setColor(TargetableFloat3 value) {
                this.color = ((TargetableFloat3Impl) value);
            }

            public TargetableFloat getConstantAttenuation() {
                return constantAttenuation;
            }

            public void setConstantAttenuation(TargetableFloat value) {
                this.constantAttenuation = ((TargetableFloatImpl) value);
            }

            public TargetableFloat getLinearAttenuation() {
                return linearAttenuation;
            }

            public void setLinearAttenuation(TargetableFloat value) {
                this.linearAttenuation = ((TargetableFloatImpl) value);
            }

            public TargetableFloat getQuadraticAttenuation() {
                return quadraticAttenuation;
            }

            public void setQuadraticAttenuation(TargetableFloat value) {
                this.quadraticAttenuation = ((TargetableFloatImpl) value);
            }

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "color",
            "constantAttenuation",
            "linearAttenuation",
            "quadraticAttenuation",
            "falloffAngle",
            "falloffExponent"
        })
        public static class SpotImpl
            implements Light.TechniqueCommon.Spot
        {

            @XmlElement(required = true, type = TargetableFloat3Impl.class)
            protected TargetableFloat3Impl color;
            @XmlElement(name = "constant_attenuation", type = TargetableFloatImpl.class, defaultValue = "1.0")
            protected TargetableFloatImpl constantAttenuation;
            @XmlElement(name = "linear_attenuation", type = TargetableFloatImpl.class, defaultValue = "0.0")
            protected TargetableFloatImpl linearAttenuation;
            @XmlElement(name = "quadratic_attenuation", type = TargetableFloatImpl.class, defaultValue = "0.0")
            protected TargetableFloatImpl quadraticAttenuation;
            @XmlElement(name = "falloff_angle", type = TargetableFloatImpl.class, defaultValue = "180.0")
            protected TargetableFloatImpl falloffAngle;
            @XmlElement(name = "falloff_exponent", type = TargetableFloatImpl.class, defaultValue = "0.0")
            protected TargetableFloatImpl falloffExponent;

            public TargetableFloat3 getColor() {
                return color;
            }

            public void setColor(TargetableFloat3 value) {
                this.color = ((TargetableFloat3Impl) value);
            }

            public TargetableFloat getConstantAttenuation() {
                return constantAttenuation;
            }

            public void setConstantAttenuation(TargetableFloat value) {
                this.constantAttenuation = ((TargetableFloatImpl) value);
            }

            public TargetableFloat getLinearAttenuation() {
                return linearAttenuation;
            }

            public void setLinearAttenuation(TargetableFloat value) {
                this.linearAttenuation = ((TargetableFloatImpl) value);
            }

            public TargetableFloat getQuadraticAttenuation() {
                return quadraticAttenuation;
            }

            public void setQuadraticAttenuation(TargetableFloat value) {
                this.quadraticAttenuation = ((TargetableFloatImpl) value);
            }

            public TargetableFloat getFalloffAngle() {
                return falloffAngle;
            }

            public void setFalloffAngle(TargetableFloat value) {
                this.falloffAngle = ((TargetableFloatImpl) value);
            }

            public TargetableFloat getFalloffExponent() {
                return falloffExponent;
            }

            public void setFalloffExponent(TargetableFloat value) {
                this.falloffExponent = ((TargetableFloatImpl) value);
            }

        }

    }

}
