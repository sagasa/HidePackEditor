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
import org.collada._2005._11.colladaschema.FxModifierEnumCommon;
import org.collada._2005._11.colladaschema.FxSurfaceCommon;
import org.collada._2005._11.colladaschema.GlesNewparam;
import org.collada._2005._11.colladaschema.GlesSamplerState;
import org.collada._2005._11.colladaschema.GlesTexturePipeline;
import org.collada._2005._11.colladaschema.GlesTextureUnit;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gles_newparam", propOrder = {
    "annotates",
    "semantic",
    "modifier",
    "_enum",
    "textureUnit",
    "samplerState",
    "texturePipeline",
    "surface",
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
public class GlesNewparamImpl implements GlesNewparam
{

    @XmlElement(name = "annotate", type = FxAnnotateCommonImpl.class)
    protected List<FxAnnotateCommon> annotates;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String semantic;
    @XmlSchemaType(name = "NMTOKEN")
    protected FxModifierEnumCommon modifier;
    @XmlElement(name = "enum")
    protected String _enum;
    @XmlElement(name = "texture_unit", type = GlesTextureUnitImpl.class)
    protected GlesTextureUnitImpl textureUnit;
    @XmlElement(name = "sampler_state", type = GlesSamplerStateImpl.class)
    protected GlesSamplerStateImpl samplerState;
    @XmlElement(name = "texture_pipeline", type = GlesTexturePipelineImpl.class)
    protected GlesTexturePipelineImpl texturePipeline;
    @XmlElement(type = FxSurfaceCommonImpl.class)
    protected FxSurfaceCommonImpl surface;
    @XmlList
    @XmlElement(name = "float4x4", type = Double.class)
    protected List<Double> float4X4;
    @XmlList
    @XmlElement(name = "float4x3", type = Double.class)
    protected List<Double> float4X3;
    @XmlList
    @XmlElement(name = "float4x2", type = Double.class)
    protected List<Double> float4X2;
    @XmlList
    @XmlElement(name = "float4x1", type = Double.class)
    protected List<Double> float4X1;
    @XmlList
    @XmlElement(name = "float3x4", type = Double.class)
    protected List<Double> float3X4;
    @XmlList
    @XmlElement(name = "float3x3", type = Double.class)
    protected List<Double> float3X3;
    @XmlList
    @XmlElement(name = "float3x2", type = Double.class)
    protected List<Double> float3X2;
    @XmlList
    @XmlElement(name = "float3x1", type = Double.class)
    protected List<Double> float3X1;
    @XmlList
    @XmlElement(name = "float2x4", type = Double.class)
    protected List<Double> float2X4;
    @XmlList
    @XmlElement(name = "float2x3", type = Double.class)
    protected List<Double> float2X3;
    @XmlList
    @XmlElement(name = "float2x2", type = Double.class)
    protected List<Double> float2X2;
    @XmlList
    @XmlElement(name = "float2x1", type = Double.class)
    protected List<Double> float2X1;
    @XmlList
    @XmlElement(name = "float1x4", type = Double.class)
    protected List<Double> float1X4;
    @XmlList
    @XmlElement(name = "float1x3", type = Double.class)
    protected List<Double> float1X3;
    @XmlList
    @XmlElement(name = "float1x2", type = Double.class)
    protected List<Double> float1X2;
    @XmlElement(name = "float1x1")
    protected Double float1X1;
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
    @XmlAttribute(name = "sid", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sid;

    public List<FxAnnotateCommon> getAnnotates() {
        if (annotates == null) {
            annotates = new ArrayList<FxAnnotateCommon>();
        }
        return this.annotates;
    }

    public String getSemantic() {
        return semantic;
    }

    public void setSemantic(String value) {
        this.semantic = value;
    }

    public FxModifierEnumCommon getModifier() {
        return modifier;
    }

    public void setModifier(FxModifierEnumCommon value) {
        this.modifier = value;
    }

    public String getEnum() {
        return _enum;
    }

    public void setEnum(String value) {
        this._enum = value;
    }

    public GlesTextureUnit getTextureUnit() {
        return textureUnit;
    }

    public void setTextureUnit(GlesTextureUnit value) {
        this.textureUnit = ((GlesTextureUnitImpl) value);
    }

    public GlesSamplerState getSamplerState() {
        return samplerState;
    }

    public void setSamplerState(GlesSamplerState value) {
        this.samplerState = ((GlesSamplerStateImpl) value);
    }

    public GlesTexturePipeline getTexturePipeline() {
        return texturePipeline;
    }

    public void setTexturePipeline(GlesTexturePipeline value) {
        this.texturePipeline = ((GlesTexturePipelineImpl) value);
    }

    public FxSurfaceCommon getSurface() {
        return surface;
    }

    public void setSurface(FxSurfaceCommon value) {
        this.surface = ((FxSurfaceCommonImpl) value);
    }

    public List<Double> getFloat4X4() {
        if (float4X4 == null) {
            float4X4 = new ArrayList<Double>();
        }
        return this.float4X4;
    }

    public List<Double> getFloat4X3() {
        if (float4X3 == null) {
            float4X3 = new ArrayList<Double>();
        }
        return this.float4X3;
    }

    public List<Double> getFloat4X2() {
        if (float4X2 == null) {
            float4X2 = new ArrayList<Double>();
        }
        return this.float4X2;
    }

    public List<Double> getFloat4X1() {
        if (float4X1 == null) {
            float4X1 = new ArrayList<Double>();
        }
        return this.float4X1;
    }

    public List<Double> getFloat3X4() {
        if (float3X4 == null) {
            float3X4 = new ArrayList<Double>();
        }
        return this.float3X4;
    }

    public List<Double> getFloat3X3() {
        if (float3X3 == null) {
            float3X3 = new ArrayList<Double>();
        }
        return this.float3X3;
    }

    public List<Double> getFloat3X2() {
        if (float3X2 == null) {
            float3X2 = new ArrayList<Double>();
        }
        return this.float3X2;
    }

    public List<Double> getFloat3X1() {
        if (float3X1 == null) {
            float3X1 = new ArrayList<Double>();
        }
        return this.float3X1;
    }

    public List<Double> getFloat2X4() {
        if (float2X4 == null) {
            float2X4 = new ArrayList<Double>();
        }
        return this.float2X4;
    }

    public List<Double> getFloat2X3() {
        if (float2X3 == null) {
            float2X3 = new ArrayList<Double>();
        }
        return this.float2X3;
    }

    public List<Double> getFloat2X2() {
        if (float2X2 == null) {
            float2X2 = new ArrayList<Double>();
        }
        return this.float2X2;
    }

    public List<Double> getFloat2X1() {
        if (float2X1 == null) {
            float2X1 = new ArrayList<Double>();
        }
        return this.float2X1;
    }

    public List<Double> getFloat1X4() {
        if (float1X4 == null) {
            float1X4 = new ArrayList<Double>();
        }
        return this.float1X4;
    }

    public List<Double> getFloat1X3() {
        if (float1X3 == null) {
            float1X3 = new ArrayList<Double>();
        }
        return this.float1X3;
    }

    public List<Double> getFloat1X2() {
        if (float1X2 == null) {
            float1X2 = new ArrayList<Double>();
        }
        return this.float1X2;
    }

    public Double getFloat1X1() {
        return float1X1;
    }

    public void setFloat1X1(Double value) {
        this.float1X1 = value;
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

    public String getSid() {
        return sid;
    }

    public void setSid(String value) {
        this.sid = value;
    }

}
