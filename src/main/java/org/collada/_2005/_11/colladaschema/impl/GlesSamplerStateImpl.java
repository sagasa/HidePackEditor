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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.FxSamplerFilterCommon;
import org.collada._2005._11.colladaschema.GlesSamplerState;
import org.collada._2005._11.colladaschema.GlesSamplerWrap;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gles_sampler_state", propOrder = {
    "wrapS",
    "wrapT",
    "minfilter",
    "magfilter",
    "mipfilter",
    "mipmapMaxlevel",
    "mipmapBias",
    "extras"
})
public class GlesSamplerStateImpl
    implements GlesSamplerState
{

    @XmlElement(name = "wrap_s", defaultValue = "REPEAT")
    @XmlSchemaType(name = "NMTOKEN")
    protected GlesSamplerWrap wrapS;
    @XmlElement(name = "wrap_t", defaultValue = "REPEAT")
    @XmlSchemaType(name = "NMTOKEN")
    protected GlesSamplerWrap wrapT;
    @XmlElement(defaultValue = "NONE")
    @XmlSchemaType(name = "NMTOKEN")
    protected FxSamplerFilterCommon minfilter;
    @XmlElement(defaultValue = "NONE")
    @XmlSchemaType(name = "NMTOKEN")
    protected FxSamplerFilterCommon magfilter;
    @XmlElement(defaultValue = "NONE")
    @XmlSchemaType(name = "NMTOKEN")
    protected FxSamplerFilterCommon mipfilter;
    @XmlElement(name = "mipmap_maxlevel", defaultValue = "255")
    @XmlSchemaType(name = "unsignedByte")
    protected Short mipmapMaxlevel;
    @XmlElement(name = "mipmap_bias", defaultValue = "0.0")
    protected Float mipmapBias;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;
    @XmlAttribute(name = "sid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sid;

    public GlesSamplerWrap getWrapS() {
        return wrapS;
    }

    public void setWrapS(GlesSamplerWrap value) {
        this.wrapS = value;
    }

    public GlesSamplerWrap getWrapT() {
        return wrapT;
    }

    public void setWrapT(GlesSamplerWrap value) {
        this.wrapT = value;
    }

    public FxSamplerFilterCommon getMinfilter() {
        return minfilter;
    }

    public void setMinfilter(FxSamplerFilterCommon value) {
        this.minfilter = value;
    }

    public FxSamplerFilterCommon getMagfilter() {
        return magfilter;
    }

    public void setMagfilter(FxSamplerFilterCommon value) {
        this.magfilter = value;
    }

    public FxSamplerFilterCommon getMipfilter() {
        return mipfilter;
    }

    public void setMipfilter(FxSamplerFilterCommon value) {
        this.mipfilter = value;
    }

    public Short getMipmapMaxlevel() {
        return mipmapMaxlevel;
    }

    public void setMipmapMaxlevel(Short value) {
        this.mipmapMaxlevel = value;
    }

    public Float getMipmapBias() {
        return mipmapBias;
    }

    public void setMipmapBias(Float value) {
        this.mipmapBias = value;
    }

    public List<Extra> getExtras() {
        if (extras == null) {
            extras = new ArrayList<Extra>();
        }
        return this.extras;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String value) {
        this.sid = value;
    }

}
