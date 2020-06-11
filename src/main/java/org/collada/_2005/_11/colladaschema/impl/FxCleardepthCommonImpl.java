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
import org.collada._2005._11.colladaschema.FxCleardepthCommon;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fx_cleardepth_common", propOrder = {
    "value"
})
public class FxCleardepthCommonImpl
    implements FxCleardepthCommon
{

    @XmlValue
    protected double value;
    @XmlAttribute(name = "index")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger index;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
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

}
