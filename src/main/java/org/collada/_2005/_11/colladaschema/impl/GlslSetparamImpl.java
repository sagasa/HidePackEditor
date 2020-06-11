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
import org.collada._2005._11.colladaschema.GlSampler1D;
import org.collada._2005._11.colladaschema.GlSampler2D;
import org.collada._2005._11.colladaschema.GlSampler3D;
import org.collada._2005._11.colladaschema.GlSamplerCUBE;
import org.collada._2005._11.colladaschema.GlSamplerDEPTH;
import org.collada._2005._11.colladaschema.GlSamplerRECT;
import org.collada._2005._11.colladaschema.GlslSetarrayType;
import org.collada._2005._11.colladaschema.GlslSetparam;
import org.collada._2005._11.colladaschema.GlslSurfaceType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "glsl_setparam", propOrder = {
    "annotates",
    "array",
    "_enum",
    "samplerDEPTH",
    "samplerRECT",
    "samplerCUBE",
    "sampler3D",
    "sampler2D",
    "sampler1D",
    "surface",
    "int4",
    "int3",
    "int2",
    "_int",
    "float4X4",
    "float3X3",
    "float2X2",
    "float4",
    "float3",
    "float2",
    "_float",
    "bool4",
    "bool3",
    "bool2",
    "bool"
})
public class GlslSetparamImpl implements GlslSetparam
{

    @XmlElement(name = "annotate", type = FxAnnotateCommonImpl.class)
    protected List<FxAnnotateCommon> annotates;
    @XmlElement(type = GlslSetarrayTypeImpl.class)
    protected GlslSetarrayTypeImpl array;
    @XmlElement(name = "enum")
    protected String _enum;
    @XmlElement(type = GlSamplerDEPTHImpl.class)
    protected GlSamplerDEPTHImpl samplerDEPTH;
    @XmlElement(type = GlSamplerRECTImpl.class)
    protected GlSamplerRECTImpl samplerRECT;
    @XmlElement(type = GlSamplerCUBEImpl.class)
    protected GlSamplerCUBEImpl samplerCUBE;
    @XmlElement(type = GlSampler3DImpl.class)
    protected GlSampler3DImpl sampler3D;
    @XmlElement(type = GlSampler2DImpl.class)
    protected GlSampler2DImpl sampler2D;
    @XmlElement(type = GlSampler1DImpl.class)
    protected GlSampler1DImpl sampler1D;
    @XmlElement(type = GlslSurfaceTypeImpl.class)
    protected GlslSurfaceTypeImpl surface;
    @XmlList
    @XmlElement(type = Integer.class)
    protected List<Integer> int4;
    @XmlList
    @XmlElement(type = Integer.class)
    protected List<Integer> int3;
    @XmlList
    @XmlElement(type = Integer.class)
    protected List<Integer> int2;
    @XmlElement(name = "int")
    protected Integer _int;
    @XmlList
    @XmlElement(name = "float4x4", type = Float.class)
    protected List<Float> float4X4;
    @XmlList
    @XmlElement(name = "float3x3", type = Float.class)
    protected List<Float> float3X3;
    @XmlList
    @XmlElement(name = "float2x2", type = Float.class)
    protected List<Float> float2X2;
    @XmlList
    @XmlElement(type = Float.class)
    protected List<Float> float4;
    @XmlList
    @XmlElement(type = Float.class)
    protected List<Float> float3;
    @XmlList
    @XmlElement(type = Float.class)
    protected List<Float> float2;
    @XmlElement(name = "float")
    protected Float _float;
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
    @XmlAttribute(name = "ref", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ref;
    @XmlAttribute(name = "program")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String program;

    public List<FxAnnotateCommon> getAnnotates() {
        if (annotates == null) {
            annotates = new ArrayList<FxAnnotateCommon>();
        }
        return this.annotates;
    }

    public GlslSetarrayType getArray() {
        return array;
    }

    public void setArray(GlslSetarrayType value) {
        this.array = ((GlslSetarrayTypeImpl) value);
    }

    public String getEnum() {
        return _enum;
    }

    public void setEnum(String value) {
        this._enum = value;
    }

    public GlSamplerDEPTH getSamplerDEPTH() {
        return samplerDEPTH;
    }

    public void setSamplerDEPTH(GlSamplerDEPTH value) {
        this.samplerDEPTH = ((GlSamplerDEPTHImpl) value);
    }

    public GlSamplerRECT getSamplerRECT() {
        return samplerRECT;
    }

    public void setSamplerRECT(GlSamplerRECT value) {
        this.samplerRECT = ((GlSamplerRECTImpl) value);
    }

    public GlSamplerCUBE getSamplerCUBE() {
        return samplerCUBE;
    }

    public void setSamplerCUBE(GlSamplerCUBE value) {
        this.samplerCUBE = ((GlSamplerCUBEImpl) value);
    }

    public GlSampler3D getSampler3D() {
        return sampler3D;
    }

    public void setSampler3D(GlSampler3D value) {
        this.sampler3D = ((GlSampler3DImpl) value);
    }

    public GlSampler2D getSampler2D() {
        return sampler2D;
    }

    public void setSampler2D(GlSampler2D value) {
        this.sampler2D = ((GlSampler2DImpl) value);
    }

    public GlSampler1D getSampler1D() {
        return sampler1D;
    }

    public void setSampler1D(GlSampler1D value) {
        this.sampler1D = ((GlSampler1DImpl) value);
    }

    public GlslSurfaceType getSurface() {
        return surface;
    }

    public void setSurface(GlslSurfaceType value) {
        this.surface = ((GlslSurfaceTypeImpl) value);
    }

    public List<Integer> getInt4() {
        if (int4 == null) {
            int4 = new ArrayList<Integer>();
        }
        return this.int4;
    }

    public List<Integer> getInt3() {
        if (int3 == null) {
            int3 = new ArrayList<Integer>();
        }
        return this.int3;
    }

    public List<Integer> getInt2() {
        if (int2 == null) {
            int2 = new ArrayList<Integer>();
        }
        return this.int2;
    }

    public Integer getInt() {
        return _int;
    }

    public void setInt(Integer value) {
        this._int = value;
    }

    public List<Float> getFloat4X4() {
        if (float4X4 == null) {
            float4X4 = new ArrayList<Float>();
        }
        return this.float4X4;
    }

    public List<Float> getFloat3X3() {
        if (float3X3 == null) {
            float3X3 = new ArrayList<Float>();
        }
        return this.float3X3;
    }

    public List<Float> getFloat2X2() {
        if (float2X2 == null) {
            float2X2 = new ArrayList<Float>();
        }
        return this.float2X2;
    }

    public List<Float> getFloat4() {
        if (float4 == null) {
            float4 = new ArrayList<Float>();
        }
        return this.float4;
    }

    public List<Float> getFloat3() {
        if (float3 == null) {
            float3 = new ArrayList<Float>();
        }
        return this.float3;
    }

    public List<Float> getFloat2() {
        if (float2 == null) {
            float2 = new ArrayList<Float>();
        }
        return this.float2;
    }

    public Float getFloat() {
        return _float;
    }

    public void setFloat(Float value) {
        this._float = value;
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

    public String getRef() {
        return ref;
    }

    public void setRef(String value) {
        this.ref = value;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String value) {
        this.program = value;
    }

}
