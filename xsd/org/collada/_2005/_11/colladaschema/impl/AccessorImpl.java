//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.collada._2005._11.colladaschema.Accessor;
import org.collada._2005._11.colladaschema.Param;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "params"
})
@XmlRootElement(name = "accessor")
public class AccessorImpl
    implements Accessor
{

    @XmlElement(name = "param", type = ParamImpl.class)
    protected List<Param> params;
    @XmlAttribute(name = "count", required = true)
    protected BigInteger count;
    @XmlAttribute(name = "offset")
    protected BigInteger offset;
    @XmlAttribute(name = "source")
    @XmlSchemaType(name = "anyURI")
    protected String source;
    @XmlAttribute(name = "stride")
    protected BigInteger stride;

    public List<Param> getParams() {
        if (params == null) {
            params = new ArrayList<Param>();
        }
        return this.params;
    }

    public BigInteger getCount() {
        return count;
    }

    public void setCount(BigInteger value) {
        this.count = value;
    }

    public BigInteger getOffset() {
        if (offset == null) {
            return new BigInteger("0");
        } else {
            return offset;
        }
    }

    public void setOffset(BigInteger value) {
        this.offset = value;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String value) {
        this.source = value;
    }

    public BigInteger getStride() {
        if (stride == null) {
            return new BigInteger("1");
        } else {
            return stride;
        }
    }

    public void setStride(BigInteger value) {
        this.stride = value;
    }

}
