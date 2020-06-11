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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.FxAnnotateCommon;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fx_annotate_common", propOrder = {
    "string",
    "float4X4",
    "float3X3",
    "float2X2",
    "float4",
    "float3",
    "float2",
    "_float",
    "int4",
    "int3",
    "int2",
    "_int",
    "bool4",
    "bool3",
    "bool2",
    "bool"
})
public class FxAnnotateCommonImpl
    implements FxAnnotateCommon
{

    protected String string;
    @XmlList
    @XmlElement(name = "float4x4", type = Double.class)
    protected List<Double> float4X4;
    @XmlList
    @XmlElement(name = "float3x3", type = Double.class)
    protected List<Double> float3X3;
    @XmlList
    @XmlElement(name = "float2x2", type = Double.class)
    protected List<Double> float2X2;
    @XmlList
    @XmlElement(type = Double.class)
    protected List<Double> float4;
    @XmlList
    @XmlElement(type = Double.class)
    protected List<Double> float3;
    @XmlList
    @XmlElement(type = Double.class)
    protected List<Double> float2;
    @XmlElement(name = "float")
    protected Double _float;
    @XmlList
    @XmlElement(type = Long.class)
    protected List<Long> int4;
    @XmlList
    @XmlElement(type = Long.class)
    protected List<Long> int3;
    @XmlList
    @XmlElement(type = Long.class)
    protected List<Long> int2;
    @XmlElement(name = "int")
    protected Long _int;
    @XmlList
    @XmlElement(type = Boolean.class)
    protected List<Boolean> bool4;
    @XmlList
    @XmlElement(type = Boolean.class)
    protected List<Boolean> bool3;
    @XmlList
    @XmlElement(type = Boolean.class)
    protected List<Boolean> bool2;
    protected Boolean bool;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;

    public String getString() {
        return string;
    }

    public void setString(String value) {
        this.string = value;
    }

    public List<Double> getFloat4X4() {
        if (float4X4 == null) {
            float4X4 = new ArrayList<Double>();
        }
        return this.float4X4;
    }

    public List<Double> getFloat3X3() {
        if (float3X3 == null) {
            float3X3 = new ArrayList<Double>();
        }
        return this.float3X3;
    }

    public List<Double> getFloat2X2() {
        if (float2X2 == null) {
            float2X2 = new ArrayList<Double>();
        }
        return this.float2X2;
    }

    public List<Double> getFloat4() {
        if (float4 == null) {
            float4 = new ArrayList<Double>();
        }
        return this.float4;
    }

    public List<Double> getFloat3() {
        if (float3 == null) {
            float3 = new ArrayList<Double>();
        }
        return this.float3;
    }

    public List<Double> getFloat2() {
        if (float2 == null) {
            float2 = new ArrayList<Double>();
        }
        return this.float2;
    }

    public Double getFloat() {
        return _float;
    }

    public void setFloat(Double value) {
        this._float = value;
    }

    public List<Long> getInt4() {
        if (int4 == null) {
            int4 = new ArrayList<Long>();
        }
        return this.int4;
    }

    public List<Long> getInt3() {
        if (int3 == null) {
            int3 = new ArrayList<Long>();
        }
        return this.int3;
    }

    public List<Long> getInt2() {
        if (int2 == null) {
            int2 = new ArrayList<Long>();
        }
        return this.int2;
    }

    public Long getInt() {
        return _int;
    }

    public void setInt(Long value) {
        this._int = value;
    }

    public List<Boolean> getBool4() {
        if (bool4 == null) {
            bool4 = new ArrayList<Boolean>();
        }
        return this.bool4;
    }

    public List<Boolean> getBool3() {
        if (bool3 == null) {
            bool3 = new ArrayList<Boolean>();
        }
        return this.bool3;
    }

    public List<Boolean> getBool2() {
        if (bool2 == null) {
            bool2 = new ArrayList<Boolean>();
        }
        return this.bool2;
    }

    public Boolean isBool() {
        return bool;
    }

    public void setBool(Boolean value) {
        this.bool = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

}
