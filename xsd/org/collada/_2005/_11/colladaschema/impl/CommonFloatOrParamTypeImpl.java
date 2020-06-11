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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.CommonFloatOrParamType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "common_float_or_param_type", propOrder = {
    "param",
    "_float"
})
public class CommonFloatOrParamTypeImpl
    implements CommonFloatOrParamType
{

    @XmlElement(type = CommonFloatOrParamTypeImpl.ParamImpl.class)
    protected CommonFloatOrParamTypeImpl.ParamImpl param;
    @XmlElement(name = "float", type = CommonFloatOrParamTypeImpl.FloatImpl.class)
    protected CommonFloatOrParamTypeImpl.FloatImpl _float;

    public CommonFloatOrParamType.Param getParam() {
        return param;
    }

    public void setParam(CommonFloatOrParamType.Param value) {
        this.param = ((CommonFloatOrParamTypeImpl.ParamImpl) value);
    }

    public CommonFloatOrParamType.Float getFloat() {
        return _float;
    }

    public void setFloat(CommonFloatOrParamType.Float value) {
        this._float = ((CommonFloatOrParamTypeImpl.FloatImpl) value);
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class FloatImpl
        implements CommonFloatOrParamType.Float
    {

        @XmlValue
        protected double value;
        @XmlAttribute(name = "sid")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String sid;

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public String getSid() {
            return sid;
        }

        public void setSid(String value) {
            this.sid = value;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ParamImpl
        implements CommonFloatOrParamType.Param
    {

        @XmlAttribute(name = "ref", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String ref;

        public String getRef() {
            return ref;
        }

        public void setRef(String value) {
            this.ref = value;
        }

    }

}
