//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.collada._2005._11.colladaschema.FxSurfaceFaceEnum;
import org.collada._2005._11.colladaschema.FxSurfaceInitFromCommon;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fx_surface_init_from_common", propOrder = {
    "value"
})
public class FxSurfaceInitFromCommonImpl
    implements FxSurfaceInitFromCommon
{

    @XmlValue
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object value;
    @XmlAttribute(name = "mip")
    @XmlSchemaType(name = "unsignedInt")
    protected Long mip;
    @XmlAttribute(name = "slice")
    @XmlSchemaType(name = "unsignedInt")
    protected Long slice;
    @XmlAttribute(name = "face")
    protected FxSurfaceFaceEnum face;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public long getMip() {
        if (mip == null) {
            return  0L;
        } else {
            return mip;
        }
    }

    public void setMip(Long value) {
        this.mip = value;
    }

    public long getSlice() {
        if (slice == null) {
            return  0L;
        } else {
            return slice;
        }
    }

    public void setSlice(Long value) {
        this.slice = value;
    }

    public FxSurfaceFaceEnum getFace() {
        if (face == null) {
            return FxSurfaceFaceEnum.POSITIVE_X;
        } else {
            return face;
        }
    }

    public void setFace(FxSurfaceFaceEnum value) {
        this.face = value;
    }

}
