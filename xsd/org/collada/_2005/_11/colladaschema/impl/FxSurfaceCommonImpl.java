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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.FxSurfaceCommon;
import org.collada._2005._11.colladaschema.FxSurfaceFormatHintCommon;
import org.collada._2005._11.colladaschema.FxSurfaceInitCubeCommon;
import org.collada._2005._11.colladaschema.FxSurfaceInitFromCommon;
import org.collada._2005._11.colladaschema.FxSurfaceInitPlanarCommon;
import org.collada._2005._11.colladaschema.FxSurfaceInitVolumeCommon;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fx_surface_common", propOrder = {
    "initFroms",
    "initPlanar",
    "initVolume",
    "initCube",
    "initAsTarget",
    "initAsNull",
    "format",
    "formatHint",
    "viewportRatio",
    "size",
    "mipLevels",
    "mipmapGenerate",
    "extras"
})
@XmlSeeAlso({
    GlslSurfaceTypeImpl.class,
    CgSurfaceTypeImpl.class
})
public class FxSurfaceCommonImpl implements FxSurfaceCommon
{

    @XmlElement(name = "init_from", type = FxSurfaceInitFromCommonImpl.class)
    protected List<FxSurfaceInitFromCommon> initFroms;
    @XmlElement(name = "init_planar", type = FxSurfaceInitPlanarCommonImpl.class)
    protected FxSurfaceInitPlanarCommonImpl initPlanar;
    @XmlElement(name = "init_volume", type = FxSurfaceInitVolumeCommonImpl.class)
    protected FxSurfaceInitVolumeCommonImpl initVolume;
    @XmlElement(name = "init_cube", type = FxSurfaceInitCubeCommonImpl.class)
    protected FxSurfaceInitCubeCommonImpl initCube;
    @XmlElement(name = "init_as_target")
    protected Object initAsTarget;
    @XmlElement(name = "init_as_null")
    protected Object initAsNull;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String format;
    @XmlElement(name = "format_hint", type = FxSurfaceFormatHintCommonImpl.class)
    protected FxSurfaceFormatHintCommonImpl formatHint;
    @XmlList
    @XmlElement(name = "viewport_ratio", type = Double.class, defaultValue = "1 1")
    protected List<Double> viewportRatio;
    @XmlList
    @XmlElement(type = Long.class, defaultValue = "0 0 0")
    protected List<Long> size;
    @XmlElement(name = "mip_levels", defaultValue = "0")
    @XmlSchemaType(name = "unsignedInt")
    protected Long mipLevels;
    @XmlElement(name = "mipmap_generate")
    protected Boolean mipmapGenerate;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    public List<FxSurfaceInitFromCommon> getInitFroms() {
        if (initFroms == null) {
            initFroms = new ArrayList<FxSurfaceInitFromCommon>();
        }
        return this.initFroms;
    }

    public FxSurfaceInitPlanarCommon getInitPlanar() {
        return initPlanar;
    }

    public void setInitPlanar(FxSurfaceInitPlanarCommon value) {
        this.initPlanar = ((FxSurfaceInitPlanarCommonImpl) value);
    }

    public FxSurfaceInitVolumeCommon getInitVolume() {
        return initVolume;
    }

    public void setInitVolume(FxSurfaceInitVolumeCommon value) {
        this.initVolume = ((FxSurfaceInitVolumeCommonImpl) value);
    }

    public FxSurfaceInitCubeCommon getInitCube() {
        return initCube;
    }

    public void setInitCube(FxSurfaceInitCubeCommon value) {
        this.initCube = ((FxSurfaceInitCubeCommonImpl) value);
    }

    public Object getInitAsTarget() {
        return initAsTarget;
    }

    public void setInitAsTarget(Object value) {
        this.initAsTarget = value;
    }

    public Object getInitAsNull() {
        return initAsNull;
    }

    public void setInitAsNull(Object value) {
        this.initAsNull = value;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String value) {
        this.format = value;
    }

    public FxSurfaceFormatHintCommon getFormatHint() {
        return formatHint;
    }

    public void setFormatHint(FxSurfaceFormatHintCommon value) {
        this.formatHint = ((FxSurfaceFormatHintCommonImpl) value);
    }

    public List<Double> getViewportRatio() {
        if (viewportRatio == null) {
            viewportRatio = new ArrayList<Double>();
        }
        return this.viewportRatio;
    }

    public List<Long> getSize() {
        if (size == null) {
            size = new ArrayList<Long>();
        }
        return this.size;
    }

    public Long getMipLevels() {
        return mipLevels;
    }

    public void setMipLevels(Long value) {
        this.mipLevels = value;
    }

    public Boolean isMipmapGenerate() {
        return mipmapGenerate;
    }

    public void setMipmapGenerate(Boolean value) {
        this.mipmapGenerate = value;
    }

    public List<Extra> getExtras() {
        if (extras == null) {
            extras = new ArrayList<Extra>();
        }
        return this.extras;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

}
