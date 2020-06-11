//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema.impl;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.FxColortargetCommon;
import org.collada._2005._11.colladaschema.FxSurfaceFaceEnum;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fx_colortarget_common", propOrder = {
    "value"
})
public class FxColortargetCommonImpl
    implements FxColortargetCommon
{

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String value;
    @XmlAttribute(name = "index")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger index;
    @XmlAttribute(name = "face")
    protected FxSurfaceFaceEnum face;
    @XmlAttribute(name = "mip")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger mip;
    @XmlAttribute(name = "slice")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger slice;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public BigInteger getIndex() {
        if (index == null) {
            return new BigInteger("0");
        } else {
            return index;
        }
    }

    public void setIndex(BigInteger value) {
        this.index = value;
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

    public BigInteger getMip() {
        if (mip == null) {
            return new BigInteger("0");
        } else {
            return mip;
        }
    }

    public void setMip(BigInteger value) {
        this.mip = value;
    }

    public BigInteger getSlice() {
        if (slice == null) {
            return new BigInteger("0");
        } else {
            return slice;
        }
    }

    public void setSlice(BigInteger value) {
        this.slice = value;
    }

}
