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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.CgSampler1D;
import org.collada._2005._11.colladaschema.CgSampler2D;
import org.collada._2005._11.colladaschema.CgSampler3D;
import org.collada._2005._11.colladaschema.CgSamplerCUBE;
import org.collada._2005._11.colladaschema.CgSamplerDEPTH;
import org.collada._2005._11.colladaschema.CgSamplerRECT;
import org.collada._2005._11.colladaschema.CgSetparamSimple;
import org.collada._2005._11.colladaschema.CgSurfaceType;
import org.collada._2005._11.colladaschema.FxAnnotateCommon;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cg_setparam_simple", propOrder = {
    "annotates",
    "_enum",
    "string",
    "samplerDEPTH",
    "samplerCUBE",
    "samplerRECT",
    "sampler3D",
    "sampler2D",
    "sampler1D",
    "surface",
    "fixed4X4",
    "fixed4X3",
    "fixed4X2",
    "fixed4X1",
    "fixed3X4",
    "fixed3X3",
    "fixed3X2",
    "fixed3X1",
    "fixed2X4",
    "fixed2X3",
    "fixed2X2",
    "fixed2X1",
    "fixed1X4",
    "fixed1X3",
    "fixed1X2",
    "fixed1X1",
    "fixed4",
    "fixed3",
    "fixed2",
    "fixed1",
    "fixed",
    "half4X4",
    "half4X3",
    "half4X2",
    "half4X1",
    "half3X4",
    "half3X3",
    "half3X2",
    "half3X1",
    "half2X4",
    "half2X3",
    "half2X2",
    "half2X1",
    "half1X4",
    "half1X3",
    "half1X2",
    "half1X1",
    "half4",
    "half3",
    "half2",
    "half1",
    "half",
    "int4X4",
    "int4X3",
    "int4X2",
    "int4X1",
    "int3X4",
    "int3X3",
    "int3X2",
    "int3X1",
    "int2X4",
    "int2X3",
    "int2X2",
    "int2X1",
    "int1X4",
    "int1X3",
    "int1X2",
    "int1X1",
    "int4",
    "int3",
    "int2",
    "int1",
    "_int",
    "float4X4",
    "float4X3",
    "float4X2",
    "float4X1",
    "float3X4",
    "float3X3",
    "float3X2",
    "float3X1",
    "float2X4",
    "float2X3",
    "float2X2",
    "float2X1",
    "float1X4",
    "float1X3",
    "float1X2",
    "float1X1",
    "float4",
    "float3",
    "float2",
    "float1",
    "_float",
    "bool4X4",
    "bool4X3",
    "bool4X2",
    "bool4X1",
    "bool3X4",
    "bool3X3",
    "bool3X2",
    "bool3X1",
    "bool2X4",
    "bool2X3",
    "bool2X2",
    "bool2X1",
    "bool1X4",
    "bool1X3",
    "bool1X2",
    "bool1X1",
    "bool4",
    "bool3",
    "bool2",
    "bool1",
    "bool"
})
public class CgSetparamSimpleImpl
    implements CgSetparamSimple
{

    @XmlElement(name = "annotate", type = FxAnnotateCommonImpl.class)
    protected List<FxAnnotateCommon> annotates;
    @XmlElement(name = "enum")
    protected String _enum;
    protected String string;
    @XmlElement(type = CgSamplerDEPTHImpl.class)
    protected CgSamplerDEPTHImpl samplerDEPTH;
    @XmlElement(type = CgSamplerCUBEImpl.class)
    protected CgSamplerCUBEImpl samplerCUBE;
    @XmlElement(type = CgSamplerRECTImpl.class)
    protected CgSamplerRECTImpl samplerRECT;
    @XmlElement(type = CgSampler3DImpl.class)
    protected CgSampler3DImpl sampler3D;
    @XmlElement(type = CgSampler2DImpl.class)
    protected CgSampler2DImpl sampler2D;
    @XmlElement(type = CgSampler1DImpl.class)
    protected CgSampler1DImpl sampler1D;
    @XmlElement(type = CgSurfaceTypeImpl.class)
    protected CgSurfaceTypeImpl surface;
    @XmlList
    @XmlElement(name = "fixed4x4", type = Float.class)
    protected List<Float> fixed4X4;
    @XmlList
    @XmlElement(name = "fixed4x3", type = Float.class)
    protected List<Float> fixed4X3;
    @XmlList
    @XmlElement(name = "fixed4x2", type = Float.class)
    protected List<Float> fixed4X2;
    @XmlList
    @XmlElement(name = "fixed4x1", type = Float.class)
    protected List<Float> fixed4X1;
    @XmlList
    @XmlElement(name = "fixed3x4", type = Float.class)
    protected List<Float> fixed3X4;
    @XmlList
    @XmlElement(name = "fixed3x3", type = Float.class)
    protected List<Float> fixed3X3;
    @XmlList
    @XmlElement(name = "fixed3x2", type = Float.class)
    protected List<Float> fixed3X2;
    @XmlList
    @XmlElement(name = "fixed3x1", type = Float.class)
    protected List<Float> fixed3X1;
    @XmlList
    @XmlElement(name = "fixed2x4", type = Float.class)
    protected List<Float> fixed2X4;
    @XmlList
    @XmlElement(name = "fixed2x3", type = Float.class)
    protected List<Float> fixed2X3;
    @XmlList
    @XmlElement(name = "fixed2x2", type = Float.class)
    protected List<Float> fixed2X2;
    @XmlList
    @XmlElement(name = "fixed2x1", type = Float.class)
    protected List<Float> fixed2X1;
    @XmlList
    @XmlElement(name = "fixed1x4", type = Float.class)
    protected List<Float> fixed1X4;
    @XmlList
    @XmlElement(name = "fixed1x3", type = Float.class)
    protected List<Float> fixed1X3;
    @XmlList
    @XmlElement(name = "fixed1x2", type = Float.class)
    protected List<Float> fixed1X2;
    @XmlList
    @XmlElement(name = "fixed1x1", type = Float.class)
    protected List<Float> fixed1X1;
    @XmlList
    @XmlElement(type = Float.class)
    protected List<Float> fixed4;
    @XmlList
    @XmlElement(type = Float.class)
    protected List<Float> fixed3;
    @XmlList
    @XmlElement(type = Float.class)
    protected List<Float> fixed2;
    protected Float fixed1;
    protected Float fixed;
    @XmlList
    @XmlElement(name = "half4x4", type = Float.class)
    protected List<Float> half4X4;
    @XmlList
    @XmlElement(name = "half4x3", type = Float.class)
    protected List<Float> half4X3;
    @XmlList
    @XmlElement(name = "half4x2", type = Float.class)
    protected List<Float> half4X2;
    @XmlList
    @XmlElement(name = "half4x1", type = Float.class)
    protected List<Float> half4X1;
    @XmlList
    @XmlElement(name = "half3x4", type = Float.class)
    protected List<Float> half3X4;
    @XmlList
    @XmlElement(name = "half3x3", type = Float.class)
    protected List<Float> half3X3;
    @XmlList
    @XmlElement(name = "half3x2", type = Float.class)
    protected List<Float> half3X2;
    @XmlList
    @XmlElement(name = "half3x1", type = Float.class)
    protected List<Float> half3X1;
    @XmlList
    @XmlElement(name = "half2x4", type = Float.class)
    protected List<Float> half2X4;
    @XmlList
    @XmlElement(name = "half2x3", type = Float.class)
    protected List<Float> half2X3;
    @XmlList
    @XmlElement(name = "half2x2", type = Float.class)
    protected List<Float> half2X2;
    @XmlList
    @XmlElement(name = "half2x1", type = Float.class)
    protected List<Float> half2X1;
    @XmlList
    @XmlElement(name = "half1x4", type = Float.class)
    protected List<Float> half1X4;
    @XmlList
    @XmlElement(name = "half1x3", type = Float.class)
    protected List<Float> half1X3;
    @XmlList
    @XmlElement(name = "half1x2", type = Float.class)
    protected List<Float> half1X2;
    @XmlList
    @XmlElement(name = "half1x1", type = Float.class)
    protected List<Float> half1X1;
    @XmlList
    @XmlElement(type = Float.class)
    protected List<Float> half4;
    @XmlList
    @XmlElement(type = Float.class)
    protected List<Float> half3;
    @XmlList
    @XmlElement(type = Float.class)
    protected List<Float> half2;
    protected Float half1;
    protected Float half;
    @XmlList
    @XmlElement(name = "int4x4", type = Integer.class)
    protected List<Integer> int4X4;
    @XmlList
    @XmlElement(name = "int4x3", type = Integer.class)
    protected List<Integer> int4X3;
    @XmlList
    @XmlElement(name = "int4x2", type = Integer.class)
    protected List<Integer> int4X2;
    @XmlList
    @XmlElement(name = "int4x1", type = Integer.class)
    protected List<Integer> int4X1;
    @XmlList
    @XmlElement(name = "int3x4", type = Integer.class)
    protected List<Integer> int3X4;
    @XmlList
    @XmlElement(name = "int3x3", type = Integer.class)
    protected List<Integer> int3X3;
    @XmlList
    @XmlElement(name = "int3x2", type = Integer.class)
    protected List<Integer> int3X2;
    @XmlList
    @XmlElement(name = "int3x1", type = Integer.class)
    protected List<Integer> int3X1;
    @XmlList
    @XmlElement(name = "int2x4", type = Integer.class)
    protected List<Integer> int2X4;
    @XmlList
    @XmlElement(name = "int2x3", type = Integer.class)
    protected List<Integer> int2X3;
    @XmlList
    @XmlElement(name = "int2x2", type = Integer.class)
    protected List<Integer> int2X2;
    @XmlList
    @XmlElement(name = "int2x1", type = Integer.class)
    protected List<Integer> int2X1;
    @XmlList
    @XmlElement(name = "int1x4", type = Integer.class)
    protected List<Integer> int1X4;
    @XmlList
    @XmlElement(name = "int1x3", type = Integer.class)
    protected List<Integer> int1X3;
    @XmlList
    @XmlElement(name = "int1x2", type = Integer.class)
    protected List<Integer> int1X2;
    @XmlList
    @XmlElement(name = "int1x1", type = Integer.class)
    protected List<Integer> int1X1;
    @XmlList
    @XmlElement(type = Integer.class)
    protected List<Integer> int4;
    @XmlList
    @XmlElement(type = Integer.class)
    protected List<Integer> int3;
    @XmlList
    @XmlElement(type = Integer.class)
    protected List<Integer> int2;
    protected Integer int1;
    @XmlElement(name = "int")
    protected Integer _int;
    @XmlList
    @XmlElement(name = "float4x4", type = Float.class)
    protected List<Float> float4X4;
    @XmlList
    @XmlElement(name = "float4x3", type = Float.class)
    protected List<Float> float4X3;
    @XmlList
    @XmlElement(name = "float4x2", type = Float.class)
    protected List<Float> float4X2;
    @XmlList
    @XmlElement(name = "float4x1", type = Float.class)
    protected List<Float> float4X1;
    @XmlList
    @XmlElement(name = "float3x4", type = Float.class)
    protected List<Float> float3X4;
    @XmlList
    @XmlElement(name = "float3x3", type = Float.class)
    protected List<Float> float3X3;
    @XmlList
    @XmlElement(name = "float3x2", type = Float.class)
    protected List<Float> float3X2;
    @XmlList
    @XmlElement(name = "float3x1", type = Float.class)
    protected List<Float> float3X1;
    @XmlList
    @XmlElement(name = "float2x4", type = Float.class)
    protected List<Float> float2X4;
    @XmlList
    @XmlElement(name = "float2x3", type = Float.class)
    protected List<Float> float2X3;
    @XmlList
    @XmlElement(name = "float2x2", type = Float.class)
    protected List<Float> float2X2;
    @XmlList
    @XmlElement(name = "float2x1", type = Float.class)
    protected List<Float> float2X1;
    @XmlList
    @XmlElement(name = "float1x4", type = Float.class)
    protected List<Float> float1X4;
    @XmlList
    @XmlElement(name = "float1x3", type = Float.class)
    protected List<Float> float1X3;
    @XmlList
    @XmlElement(name = "float1x2", type = Float.class)
    protected List<Float> float1X2;
    @XmlList
    @XmlElement(name = "float1x1", type = Float.class)
    protected List<Float> float1X1;
    @XmlList
    @XmlElement(type = Float.class)
    protected List<Float> float4;
    @XmlList
    @XmlElement(type = Float.class)
    protected List<Float> float3;
    @XmlList
    @XmlElement(type = Float.class)
    protected List<Float> float2;
    protected Float float1;
    @XmlElement(name = "float")
    protected Float _float;
    @XmlList
    @XmlElement(name = "bool4x4", type = Boolean.class)
    protected List<Boolean> bool4X4;
    @XmlList
    @XmlElement(name = "bool4x3", type = Boolean.class)
    protected List<Boolean> bool4X3;
    @XmlList
    @XmlElement(name = "bool4x2", type = Boolean.class)
    protected List<Boolean> bool4X2;
    @XmlList
    @XmlElement(name = "bool4x1", type = Boolean.class)
    protected List<Boolean> bool4X1;
    @XmlList
    @XmlElement(name = "bool3x4", type = Boolean.class)
    protected List<Boolean> bool3X4;
    @XmlList
    @XmlElement(name = "bool3x3", type = Boolean.class)
    protected List<Boolean> bool3X3;
    @XmlList
    @XmlElement(name = "bool3x2", type = Boolean.class)
    protected List<Boolean> bool3X2;
    @XmlList
    @XmlElement(name = "bool3x1", type = Boolean.class)
    protected List<Boolean> bool3X1;
    @XmlList
    @XmlElement(name = "bool2x4", type = Boolean.class)
    protected List<Boolean> bool2X4;
    @XmlList
    @XmlElement(name = "bool2x3", type = Boolean.class)
    protected List<Boolean> bool2X3;
    @XmlList
    @XmlElement(name = "bool2x2", type = Boolean.class)
    protected List<Boolean> bool2X2;
    @XmlList
    @XmlElement(name = "bool2x1", type = Boolean.class)
    protected List<Boolean> bool2X1;
    @XmlList
    @XmlElement(name = "bool1x4", type = Boolean.class)
    protected List<Boolean> bool1X4;
    @XmlList
    @XmlElement(name = "bool1x3", type = Boolean.class)
    protected List<Boolean> bool1X3;
    @XmlList
    @XmlElement(name = "bool1x2", type = Boolean.class)
    protected List<Boolean> bool1X2;
    @XmlList
    @XmlElement(name = "bool1x1", type = Boolean.class)
    protected List<Boolean> bool1X1;
    @XmlList
    @XmlElement(type = Boolean.class)
    protected List<Boolean> bool4;
    @XmlList
    @XmlElement(type = Boolean.class)
    protected List<Boolean> bool3;
    @XmlList
    @XmlElement(type = Boolean.class)
    protected List<Boolean> bool2;
    protected Boolean bool1;
    protected Boolean bool;
    @XmlAttribute(name = "ref", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ref;

    public List<FxAnnotateCommon> getAnnotates() {
        if (annotates == null) {
            annotates = new ArrayList<FxAnnotateCommon>();
        }
        return this.annotates;
    }

    public String getEnum() {
        return _enum;
    }

    public void setEnum(String value) {
        this._enum = value;
    }

    public String getString() {
        return string;
    }

    public void setString(String value) {
        this.string = value;
    }

    public CgSamplerDEPTH getSamplerDEPTH() {
        return samplerDEPTH;
    }

    public void setSamplerDEPTH(CgSamplerDEPTH value) {
        this.samplerDEPTH = ((CgSamplerDEPTHImpl) value);
    }

    public CgSamplerCUBE getSamplerCUBE() {
        return samplerCUBE;
    }

    public void setSamplerCUBE(CgSamplerCUBE value) {
        this.samplerCUBE = ((CgSamplerCUBEImpl) value);
    }

    public CgSamplerRECT getSamplerRECT() {
        return samplerRECT;
    }

    public void setSamplerRECT(CgSamplerRECT value) {
        this.samplerRECT = ((CgSamplerRECTImpl) value);
    }

    public CgSampler3D getSampler3D() {
        return sampler3D;
    }

    public void setSampler3D(CgSampler3D value) {
        this.sampler3D = ((CgSampler3DImpl) value);
    }

    public CgSampler2D getSampler2D() {
        return sampler2D;
    }

    public void setSampler2D(CgSampler2D value) {
        this.sampler2D = ((CgSampler2DImpl) value);
    }

    public CgSampler1D getSampler1D() {
        return sampler1D;
    }

    public void setSampler1D(CgSampler1D value) {
        this.sampler1D = ((CgSampler1DImpl) value);
    }

    public CgSurfaceType getSurface() {
        return surface;
    }

    public void setSurface(CgSurfaceType value) {
        this.surface = ((CgSurfaceTypeImpl) value);
    }

    public List<Float> getFixed4X4() {
        if (fixed4X4 == null) {
            fixed4X4 = new ArrayList<Float>();
        }
        return this.fixed4X4;
    }

    public List<Float> getFixed4X3() {
        if (fixed4X3 == null) {
            fixed4X3 = new ArrayList<Float>();
        }
        return this.fixed4X3;
    }

    public List<Float> getFixed4X2() {
        if (fixed4X2 == null) {
            fixed4X2 = new ArrayList<Float>();
        }
        return this.fixed4X2;
    }

    public List<Float> getFixed4X1() {
        if (fixed4X1 == null) {
            fixed4X1 = new ArrayList<Float>();
        }
        return this.fixed4X1;
    }

    public List<Float> getFixed3X4() {
        if (fixed3X4 == null) {
            fixed3X4 = new ArrayList<Float>();
        }
        return this.fixed3X4;
    }

    public List<Float> getFixed3X3() {
        if (fixed3X3 == null) {
            fixed3X3 = new ArrayList<Float>();
        }
        return this.fixed3X3;
    }

    public List<Float> getFixed3X2() {
        if (fixed3X2 == null) {
            fixed3X2 = new ArrayList<Float>();
        }
        return this.fixed3X2;
    }

    public List<Float> getFixed3X1() {
        if (fixed3X1 == null) {
            fixed3X1 = new ArrayList<Float>();
        }
        return this.fixed3X1;
    }

    public List<Float> getFixed2X4() {
        if (fixed2X4 == null) {
            fixed2X4 = new ArrayList<Float>();
        }
        return this.fixed2X4;
    }

    public List<Float> getFixed2X3() {
        if (fixed2X3 == null) {
            fixed2X3 = new ArrayList<Float>();
        }
        return this.fixed2X3;
    }

    public List<Float> getFixed2X2() {
        if (fixed2X2 == null) {
            fixed2X2 = new ArrayList<Float>();
        }
        return this.fixed2X2;
    }

    public List<Float> getFixed2X1() {
        if (fixed2X1 == null) {
            fixed2X1 = new ArrayList<Float>();
        }
        return this.fixed2X1;
    }

    public List<Float> getFixed1X4() {
        if (fixed1X4 == null) {
            fixed1X4 = new ArrayList<Float>();
        }
        return this.fixed1X4;
    }

    public List<Float> getFixed1X3() {
        if (fixed1X3 == null) {
            fixed1X3 = new ArrayList<Float>();
        }
        return this.fixed1X3;
    }

    public List<Float> getFixed1X2() {
        if (fixed1X2 == null) {
            fixed1X2 = new ArrayList<Float>();
        }
        return this.fixed1X2;
    }

    public List<Float> getFixed1X1() {
        if (fixed1X1 == null) {
            fixed1X1 = new ArrayList<Float>();
        }
        return this.fixed1X1;
    }

    public List<Float> getFixed4() {
        if (fixed4 == null) {
            fixed4 = new ArrayList<Float>();
        }
        return this.fixed4;
    }

    public List<Float> getFixed3() {
        if (fixed3 == null) {
            fixed3 = new ArrayList<Float>();
        }
        return this.fixed3;
    }

    public List<Float> getFixed2() {
        if (fixed2 == null) {
            fixed2 = new ArrayList<Float>();
        }
        return this.fixed2;
    }

    public Float getFixed1() {
        return fixed1;
    }

    public void setFixed1(Float value) {
        this.fixed1 = value;
    }

    public Float getFixed() {
        return fixed;
    }

    public void setFixed(Float value) {
        this.fixed = value;
    }

    public List<Float> getHalf4X4() {
        if (half4X4 == null) {
            half4X4 = new ArrayList<Float>();
        }
        return this.half4X4;
    }

    public List<Float> getHalf4X3() {
        if (half4X3 == null) {
            half4X3 = new ArrayList<Float>();
        }
        return this.half4X3;
    }

    public List<Float> getHalf4X2() {
        if (half4X2 == null) {
            half4X2 = new ArrayList<Float>();
        }
        return this.half4X2;
    }

    public List<Float> getHalf4X1() {
        if (half4X1 == null) {
            half4X1 = new ArrayList<Float>();
        }
        return this.half4X1;
    }

    public List<Float> getHalf3X4() {
        if (half3X4 == null) {
            half3X4 = new ArrayList<Float>();
        }
        return this.half3X4;
    }

    public List<Float> getHalf3X3() {
        if (half3X3 == null) {
            half3X3 = new ArrayList<Float>();
        }
        return this.half3X3;
    }

    public List<Float> getHalf3X2() {
        if (half3X2 == null) {
            half3X2 = new ArrayList<Float>();
        }
        return this.half3X2;
    }

    public List<Float> getHalf3X1() {
        if (half3X1 == null) {
            half3X1 = new ArrayList<Float>();
        }
        return this.half3X1;
    }

    public List<Float> getHalf2X4() {
        if (half2X4 == null) {
            half2X4 = new ArrayList<Float>();
        }
        return this.half2X4;
    }

    public List<Float> getHalf2X3() {
        if (half2X3 == null) {
            half2X3 = new ArrayList<Float>();
        }
        return this.half2X3;
    }

    public List<Float> getHalf2X2() {
        if (half2X2 == null) {
            half2X2 = new ArrayList<Float>();
        }
        return this.half2X2;
    }

    public List<Float> getHalf2X1() {
        if (half2X1 == null) {
            half2X1 = new ArrayList<Float>();
        }
        return this.half2X1;
    }

    public List<Float> getHalf1X4() {
        if (half1X4 == null) {
            half1X4 = new ArrayList<Float>();
        }
        return this.half1X4;
    }

    public List<Float> getHalf1X3() {
        if (half1X3 == null) {
            half1X3 = new ArrayList<Float>();
        }
        return this.half1X3;
    }

    public List<Float> getHalf1X2() {
        if (half1X2 == null) {
            half1X2 = new ArrayList<Float>();
        }
        return this.half1X2;
    }

    public List<Float> getHalf1X1() {
        if (half1X1 == null) {
            half1X1 = new ArrayList<Float>();
        }
        return this.half1X1;
    }

    public List<Float> getHalf4() {
        if (half4 == null) {
            half4 = new ArrayList<Float>();
        }
        return this.half4;
    }

    public List<Float> getHalf3() {
        if (half3 == null) {
            half3 = new ArrayList<Float>();
        }
        return this.half3;
    }

    public List<Float> getHalf2() {
        if (half2 == null) {
            half2 = new ArrayList<Float>();
        }
        return this.half2;
    }

    public Float getHalf1() {
        return half1;
    }

    public void setHalf1(Float value) {
        this.half1 = value;
    }

    public Float getHalf() {
        return half;
    }

    public void setHalf(Float value) {
        this.half = value;
    }

    public List<Integer> getInt4X4() {
        if (int4X4 == null) {
            int4X4 = new ArrayList<Integer>();
        }
        return this.int4X4;
    }

    public List<Integer> getInt4X3() {
        if (int4X3 == null) {
            int4X3 = new ArrayList<Integer>();
        }
        return this.int4X3;
    }

    public List<Integer> getInt4X2() {
        if (int4X2 == null) {
            int4X2 = new ArrayList<Integer>();
        }
        return this.int4X2;
    }

    public List<Integer> getInt4X1() {
        if (int4X1 == null) {
            int4X1 = new ArrayList<Integer>();
        }
        return this.int4X1;
    }

    public List<Integer> getInt3X4() {
        if (int3X4 == null) {
            int3X4 = new ArrayList<Integer>();
        }
        return this.int3X4;
    }

    public List<Integer> getInt3X3() {
        if (int3X3 == null) {
            int3X3 = new ArrayList<Integer>();
        }
        return this.int3X3;
    }

    public List<Integer> getInt3X2() {
        if (int3X2 == null) {
            int3X2 = new ArrayList<Integer>();
        }
        return this.int3X2;
    }

    public List<Integer> getInt3X1() {
        if (int3X1 == null) {
            int3X1 = new ArrayList<Integer>();
        }
        return this.int3X1;
    }

    public List<Integer> getInt2X4() {
        if (int2X4 == null) {
            int2X4 = new ArrayList<Integer>();
        }
        return this.int2X4;
    }

    public List<Integer> getInt2X3() {
        if (int2X3 == null) {
            int2X3 = new ArrayList<Integer>();
        }
        return this.int2X3;
    }

    public List<Integer> getInt2X2() {
        if (int2X2 == null) {
            int2X2 = new ArrayList<Integer>();
        }
        return this.int2X2;
    }

    public List<Integer> getInt2X1() {
        if (int2X1 == null) {
            int2X1 = new ArrayList<Integer>();
        }
        return this.int2X1;
    }

    public List<Integer> getInt1X4() {
        if (int1X4 == null) {
            int1X4 = new ArrayList<Integer>();
        }
        return this.int1X4;
    }

    public List<Integer> getInt1X3() {
        if (int1X3 == null) {
            int1X3 = new ArrayList<Integer>();
        }
        return this.int1X3;
    }

    public List<Integer> getInt1X2() {
        if (int1X2 == null) {
            int1X2 = new ArrayList<Integer>();
        }
        return this.int1X2;
    }

    public List<Integer> getInt1X1() {
        if (int1X1 == null) {
            int1X1 = new ArrayList<Integer>();
        }
        return this.int1X1;
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

    public Integer getInt1() {
        return int1;
    }

    public void setInt1(Integer value) {
        this.int1 = value;
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

    public List<Float> getFloat4X3() {
        if (float4X3 == null) {
            float4X3 = new ArrayList<Float>();
        }
        return this.float4X3;
    }

    public List<Float> getFloat4X2() {
        if (float4X2 == null) {
            float4X2 = new ArrayList<Float>();
        }
        return this.float4X2;
    }

    public List<Float> getFloat4X1() {
        if (float4X1 == null) {
            float4X1 = new ArrayList<Float>();
        }
        return this.float4X1;
    }

    public List<Float> getFloat3X4() {
        if (float3X4 == null) {
            float3X4 = new ArrayList<Float>();
        }
        return this.float3X4;
    }

    public List<Float> getFloat3X3() {
        if (float3X3 == null) {
            float3X3 = new ArrayList<Float>();
        }
        return this.float3X3;
    }

    public List<Float> getFloat3X2() {
        if (float3X2 == null) {
            float3X2 = new ArrayList<Float>();
        }
        return this.float3X2;
    }

    public List<Float> getFloat3X1() {
        if (float3X1 == null) {
            float3X1 = new ArrayList<Float>();
        }
        return this.float3X1;
    }

    public List<Float> getFloat2X4() {
        if (float2X4 == null) {
            float2X4 = new ArrayList<Float>();
        }
        return this.float2X4;
    }

    public List<Float> getFloat2X3() {
        if (float2X3 == null) {
            float2X3 = new ArrayList<Float>();
        }
        return this.float2X3;
    }

    public List<Float> getFloat2X2() {
        if (float2X2 == null) {
            float2X2 = new ArrayList<Float>();
        }
        return this.float2X2;
    }

    public List<Float> getFloat2X1() {
        if (float2X1 == null) {
            float2X1 = new ArrayList<Float>();
        }
        return this.float2X1;
    }

    public List<Float> getFloat1X4() {
        if (float1X4 == null) {
            float1X4 = new ArrayList<Float>();
        }
        return this.float1X4;
    }

    public List<Float> getFloat1X3() {
        if (float1X3 == null) {
            float1X3 = new ArrayList<Float>();
        }
        return this.float1X3;
    }

    public List<Float> getFloat1X2() {
        if (float1X2 == null) {
            float1X2 = new ArrayList<Float>();
        }
        return this.float1X2;
    }

    public List<Float> getFloat1X1() {
        if (float1X1 == null) {
            float1X1 = new ArrayList<Float>();
        }
        return this.float1X1;
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

    public Float getFloat1() {
        return float1;
    }

    public void setFloat1(Float value) {
        this.float1 = value;
    }

    public Float getFloat() {
        return _float;
    }

    public void setFloat(Float value) {
        this._float = value;
    }

    public List<Boolean> getBool4X4() {
        if (bool4X4 == null) {
            bool4X4 = new ArrayList<Boolean>();
        }
        return this.bool4X4;
    }

    public List<Boolean> getBool4X3() {
        if (bool4X3 == null) {
            bool4X3 = new ArrayList<Boolean>();
        }
        return this.bool4X3;
    }

    public List<Boolean> getBool4X2() {
        if (bool4X2 == null) {
            bool4X2 = new ArrayList<Boolean>();
        }
        return this.bool4X2;
    }

    public List<Boolean> getBool4X1() {
        if (bool4X1 == null) {
            bool4X1 = new ArrayList<Boolean>();
        }
        return this.bool4X1;
    }

    public List<Boolean> getBool3X4() {
        if (bool3X4 == null) {
            bool3X4 = new ArrayList<Boolean>();
        }
        return this.bool3X4;
    }

    public List<Boolean> getBool3X3() {
        if (bool3X3 == null) {
            bool3X3 = new ArrayList<Boolean>();
        }
        return this.bool3X3;
    }

    public List<Boolean> getBool3X2() {
        if (bool3X2 == null) {
            bool3X2 = new ArrayList<Boolean>();
        }
        return this.bool3X2;
    }

    public List<Boolean> getBool3X1() {
        if (bool3X1 == null) {
            bool3X1 = new ArrayList<Boolean>();
        }
        return this.bool3X1;
    }

    public List<Boolean> getBool2X4() {
        if (bool2X4 == null) {
            bool2X4 = new ArrayList<Boolean>();
        }
        return this.bool2X4;
    }

    public List<Boolean> getBool2X3() {
        if (bool2X3 == null) {
            bool2X3 = new ArrayList<Boolean>();
        }
        return this.bool2X3;
    }

    public List<Boolean> getBool2X2() {
        if (bool2X2 == null) {
            bool2X2 = new ArrayList<Boolean>();
        }
        return this.bool2X2;
    }

    public List<Boolean> getBool2X1() {
        if (bool2X1 == null) {
            bool2X1 = new ArrayList<Boolean>();
        }
        return this.bool2X1;
    }

    public List<Boolean> getBool1X4() {
        if (bool1X4 == null) {
            bool1X4 = new ArrayList<Boolean>();
        }
        return this.bool1X4;
    }

    public List<Boolean> getBool1X3() {
        if (bool1X3 == null) {
            bool1X3 = new ArrayList<Boolean>();
        }
        return this.bool1X3;
    }

    public List<Boolean> getBool1X2() {
        if (bool1X2 == null) {
            bool1X2 = new ArrayList<Boolean>();
        }
        return this.bool1X2;
    }

    public List<Boolean> getBool1X1() {
        if (bool1X1 == null) {
            bool1X1 = new ArrayList<Boolean>();
        }
        return this.bool1X1;
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

    public Boolean isBool1() {
        return bool1;
    }

    public void setBool1(Boolean value) {
        this.bool1 = value;
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

}
