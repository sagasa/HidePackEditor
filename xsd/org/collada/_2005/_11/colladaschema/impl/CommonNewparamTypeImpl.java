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
import org.collada._2005._11.colladaschema.CommonNewparamType;
import org.collada._2005._11.colladaschema.FxSampler2DCommon;
import org.collada._2005._11.colladaschema.FxSurfaceCommon;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "common_newparam_type", propOrder = {
    "semantic",
    "sampler2D",
    "surface",
    "float4",
    "float3",
    "float2",
    "_float"
})
public class CommonNewparamTypeImpl implements CommonNewparamType
{

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String semantic;
    @XmlElement(type = FxSampler2DCommonImpl.class)
    protected FxSampler2DCommonImpl sampler2D;
    @XmlElement(type = FxSurfaceCommonImpl.class)
    protected FxSurfaceCommonImpl surface;
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
    @XmlAttribute(name = "sid", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sid;

    public String getSemantic() {
        return semantic;
    }

    public void setSemantic(String value) {
        this.semantic = value;
    }

    public FxSampler2DCommon getSampler2D() {
        return sampler2D;
    }

    public void setSampler2D(FxSampler2DCommon value) {
        this.sampler2D = ((FxSampler2DCommonImpl) value);
    }

    public FxSurfaceCommon getSurface() {
        return surface;
    }

    public void setSurface(FxSurfaceCommon value) {
        this.surface = ((FxSurfaceCommonImpl) value);
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

    public String getSid() {
        return sid;
    }

    public void setSid(String value) {
        this.sid = value;
    }

}
