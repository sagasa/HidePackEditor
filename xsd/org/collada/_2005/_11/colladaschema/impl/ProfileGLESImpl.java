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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.Asset;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.FxAnnotateCommon;
import org.collada._2005._11.colladaschema.FxSurfaceCommon;
import org.collada._2005._11.colladaschema.GlBlendType;
import org.collada._2005._11.colladaschema.GlFaceType;
import org.collada._2005._11.colladaschema.GlFogType;
import org.collada._2005._11.colladaschema.GlFrontFaceType;
import org.collada._2005._11.colladaschema.GlFuncType;
import org.collada._2005._11.colladaschema.GlLogicOpType;
import org.collada._2005._11.colladaschema.GlShadeModelType;
import org.collada._2005._11.colladaschema.GlesSamplerState;
import org.collada._2005._11.colladaschema.GlesStencilOpType;
import org.collada._2005._11.colladaschema.GlesTexturePipeline;
import org.collada._2005._11.colladaschema.GlesTextureUnit;
import org.collada._2005._11.colladaschema.ProfileGLES;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asset",
    "imagesAndNewparams",
    "techniques",
    "extras"
})
public class ProfileGLESImpl implements ProfileGLES
{

    @XmlElement(type = AssetImpl.class)
    protected AssetImpl asset;
    @XmlElements({
        @XmlElement(name = "image", type = ImageImpl.class),
        @XmlElement(name = "newparam", type = GlesNewparamImpl.class)
    })
    protected List<Object> imagesAndNewparams;
    @XmlElement(name = "technique", required = true, type = ProfileGLESImpl.TechniqueImpl.class)
    protected List<ProfileGLES.Technique> techniques;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "platform")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String platform;

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset value) {
        this.asset = ((AssetImpl) value);
    }

    public List<Object> getImagesAndNewparams() {
        if (imagesAndNewparams == null) {
            imagesAndNewparams = new ArrayList<Object>();
        }
        return this.imagesAndNewparams;
    }

    public List<ProfileGLES.Technique> getTechniques() {
        if (techniques == null) {
            techniques = new ArrayList<ProfileGLES.Technique>();
        }
        return this.techniques;
    }

    public List<Extra> getExtras() {
        if (extras == null) {
            extras = new ArrayList<Extra>();
        }
        return this.extras;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getPlatform() {
        if (platform == null) {
            return "PC";
        } else {
            return platform;
        }
    }

    public void setPlatform(String value) {
        this.platform = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "asset",
        "annotates",
        "imagesAndNewparamsAndSetparams",
        "passes",
        "extras"
    })
    public static class TechniqueImpl
        implements ProfileGLES.Technique
    {

        @XmlElement(type = AssetImpl.class)
        protected AssetImpl asset;
        @XmlElement(name = "annotate", type = FxAnnotateCommonImpl.class)
        protected List<FxAnnotateCommon> annotates;
        @XmlElements({
            @XmlElement(name = "image", type = ImageImpl.class),
            @XmlElement(name = "newparam", type = GlesNewparamImpl.class),
            @XmlElement(name = "setparam", type = ProfileGLESImpl.TechniqueImpl.SetparamImpl.class)
        })
        protected List<Object> imagesAndNewparamsAndSetparams;
        @XmlElement(name = "pass", required = true, type = ProfileGLESImpl.TechniqueImpl.PassImpl.class)
        protected List<ProfileGLES.Technique.Pass> passes;
        @XmlElement(name = "extra", type = ExtraImpl.class)
        protected List<Extra> extras;
        @XmlAttribute(name = "id")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "sid", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String sid;

        public Asset getAsset() {
            return asset;
        }

        public void setAsset(Asset value) {
            this.asset = ((AssetImpl) value);
        }

        public List<FxAnnotateCommon> getAnnotates() {
            if (annotates == null) {
                annotates = new ArrayList<FxAnnotateCommon>();
            }
            return this.annotates;
        }

        public List<Object> getImagesAndNewparamsAndSetparams() {
            if (imagesAndNewparamsAndSetparams == null) {
                imagesAndNewparamsAndSetparams = new ArrayList<Object>();
            }
            return this.imagesAndNewparamsAndSetparams;
        }

        public List<ProfileGLES.Technique.Pass> getPasses() {
            if (passes == null) {
                passes = new ArrayList<ProfileGLES.Technique.Pass>();
            }
            return this.passes;
        }

        public List<Extra> getExtras() {
            if (extras == null) {
                extras = new ArrayList<Extra>();
            }
            return this.extras;
        }

        public String getId() {
            return id;
        }

        public void setId(String value) {
            this.id = value;
        }

        public String getSid() {
            return sid;
        }

        public void setSid(String value) {
            this.sid = value;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "annotates",
            "colorTarget",
            "depthTarget",
            "stencilTarget",
            "colorClear",
            "depthClear",
            "stencilClear",
            "draw",
            "alphaFuncsAndBlendFuncsAndClearColors",
            "extras"
        })
        public static class PassImpl
            implements ProfileGLES.Technique.Pass
        {

            @XmlElement(name = "annotate", type = FxAnnotateCommonImpl.class)
            protected List<FxAnnotateCommon> annotates;
            @XmlElement(name = "color_target")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String colorTarget;
            @XmlElement(name = "depth_target")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String depthTarget;
            @XmlElement(name = "stencil_target")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String stencilTarget;
            @XmlList
            @XmlElement(name = "color_clear", type = Double.class)
            protected List<Double> colorClear;
            @XmlElement(name = "depth_clear")
            protected Double depthClear;
            @XmlElement(name = "stencil_clear")
            protected Byte stencilClear;
            protected String draw;
            @XmlElements({
                @XmlElement(name = "alpha_func", type = ProfileGLESImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.class),
                @XmlElement(name = "blend_func", type = ProfileGLESImpl.TechniqueImpl.PassImpl.BlendFuncImpl.class),
                @XmlElement(name = "clear_color", type = ProfileGLESImpl.TechniqueImpl.PassImpl.ClearColorImpl.class),
                @XmlElement(name = "clear_stencil", type = ProfileGLESImpl.TechniqueImpl.PassImpl.ClearStencilImpl.class),
                @XmlElement(name = "clear_depth", type = ProfileGLESImpl.TechniqueImpl.PassImpl.ClearDepthImpl.class),
                @XmlElement(name = "clip_plane", type = ProfileGLESImpl.TechniqueImpl.PassImpl.ClipPlaneImpl.class),
                @XmlElement(name = "color_mask", type = ProfileGLESImpl.TechniqueImpl.PassImpl.ColorMaskImpl.class),
                @XmlElement(name = "cull_face", type = ProfileGLESImpl.TechniqueImpl.PassImpl.CullFaceImpl.class),
                @XmlElement(name = "depth_func", type = ProfileGLESImpl.TechniqueImpl.PassImpl.DepthFuncImpl.class),
                @XmlElement(name = "depth_mask", type = ProfileGLESImpl.TechniqueImpl.PassImpl.DepthMaskImpl.class),
                @XmlElement(name = "depth_range", type = ProfileGLESImpl.TechniqueImpl.PassImpl.DepthRangeImpl.class),
                @XmlElement(name = "fog_color", type = ProfileGLESImpl.TechniqueImpl.PassImpl.FogColorImpl.class),
                @XmlElement(name = "fog_density", type = ProfileGLESImpl.TechniqueImpl.PassImpl.FogDensityImpl.class),
                @XmlElement(name = "fog_mode", type = ProfileGLESImpl.TechniqueImpl.PassImpl.FogModeImpl.class),
                @XmlElement(name = "fog_start", type = ProfileGLESImpl.TechniqueImpl.PassImpl.FogStartImpl.class),
                @XmlElement(name = "fog_end", type = ProfileGLESImpl.TechniqueImpl.PassImpl.FogEndImpl.class),
                @XmlElement(name = "front_face", type = ProfileGLESImpl.TechniqueImpl.PassImpl.FrontFaceImpl.class),
                @XmlElement(name = "texture_pipeline", type = ProfileGLESImpl.TechniqueImpl.PassImpl.TexturePipelineImpl.class),
                @XmlElement(name = "logic_op", type = ProfileGLESImpl.TechniqueImpl.PassImpl.LogicOpImpl.class),
                @XmlElement(name = "light_ambient", type = ProfileGLESImpl.TechniqueImpl.PassImpl.LightAmbientImpl.class),
                @XmlElement(name = "light_diffuse", type = ProfileGLESImpl.TechniqueImpl.PassImpl.LightDiffuseImpl.class),
                @XmlElement(name = "light_specular", type = ProfileGLESImpl.TechniqueImpl.PassImpl.LightSpecularImpl.class),
                @XmlElement(name = "light_position", type = ProfileGLESImpl.TechniqueImpl.PassImpl.LightPositionImpl.class),
                @XmlElement(name = "light_constant_attenuation", type = ProfileGLESImpl.TechniqueImpl.PassImpl.LightConstantAttenuationImpl.class),
                @XmlElement(name = "light_linear_attenutation", type = ProfileGLESImpl.TechniqueImpl.PassImpl.LightLinearAttenutationImpl.class),
                @XmlElement(name = "light_quadratic_attenuation", type = ProfileGLESImpl.TechniqueImpl.PassImpl.LightQuadraticAttenuationImpl.class),
                @XmlElement(name = "light_spot_cutoff", type = ProfileGLESImpl.TechniqueImpl.PassImpl.LightSpotCutoffImpl.class),
                @XmlElement(name = "light_spot_direction", type = ProfileGLESImpl.TechniqueImpl.PassImpl.LightSpotDirectionImpl.class),
                @XmlElement(name = "light_spot_exponent", type = ProfileGLESImpl.TechniqueImpl.PassImpl.LightSpotExponentImpl.class),
                @XmlElement(name = "light_model_ambient", type = ProfileGLESImpl.TechniqueImpl.PassImpl.LightModelAmbientImpl.class),
                @XmlElement(name = "line_width", type = ProfileGLESImpl.TechniqueImpl.PassImpl.LineWidthImpl.class),
                @XmlElement(name = "material_ambient", type = ProfileGLESImpl.TechniqueImpl.PassImpl.MaterialAmbientImpl.class),
                @XmlElement(name = "material_diffuse", type = ProfileGLESImpl.TechniqueImpl.PassImpl.MaterialDiffuseImpl.class),
                @XmlElement(name = "material_emission", type = ProfileGLESImpl.TechniqueImpl.PassImpl.MaterialEmissionImpl.class),
                @XmlElement(name = "material_shininess", type = ProfileGLESImpl.TechniqueImpl.PassImpl.MaterialShininessImpl.class),
                @XmlElement(name = "material_specular", type = ProfileGLESImpl.TechniqueImpl.PassImpl.MaterialSpecularImpl.class),
                @XmlElement(name = "model_view_matrix", type = ProfileGLESImpl.TechniqueImpl.PassImpl.ModelViewMatrixImpl.class),
                @XmlElement(name = "point_distance_attenuation", type = ProfileGLESImpl.TechniqueImpl.PassImpl.PointDistanceAttenuationImpl.class),
                @XmlElement(name = "point_fade_threshold_size", type = ProfileGLESImpl.TechniqueImpl.PassImpl.PointFadeThresholdSizeImpl.class),
                @XmlElement(name = "point_size", type = ProfileGLESImpl.TechniqueImpl.PassImpl.PointSizeImpl.class),
                @XmlElement(name = "point_size_min", type = ProfileGLESImpl.TechniqueImpl.PassImpl.PointSizeMinImpl.class),
                @XmlElement(name = "point_size_max", type = ProfileGLESImpl.TechniqueImpl.PassImpl.PointSizeMaxImpl.class),
                @XmlElement(name = "polygon_offset", type = ProfileGLESImpl.TechniqueImpl.PassImpl.PolygonOffsetImpl.class),
                @XmlElement(name = "projection_matrix", type = ProfileGLESImpl.TechniqueImpl.PassImpl.ProjectionMatrixImpl.class),
                @XmlElement(name = "scissor", type = ProfileGLESImpl.TechniqueImpl.PassImpl.ScissorImpl.class),
                @XmlElement(name = "shade_model", type = ProfileGLESImpl.TechniqueImpl.PassImpl.ShadeModelImpl.class),
                @XmlElement(name = "stencil_func", type = ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl.class),
                @XmlElement(name = "stencil_mask", type = ProfileGLESImpl.TechniqueImpl.PassImpl.StencilMaskImpl.class),
                @XmlElement(name = "stencil_op", type = ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl.class),
                @XmlElement(name = "alpha_test_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.AlphaTestEnableImpl.class),
                @XmlElement(name = "blend_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.BlendEnableImpl.class),
                @XmlElement(name = "clip_plane_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.ClipPlaneEnableImpl.class),
                @XmlElement(name = "color_logic_op_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.ColorLogicOpEnableImpl.class),
                @XmlElement(name = "color_material_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.ColorMaterialEnableImpl.class),
                @XmlElement(name = "cull_face_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.CullFaceEnableImpl.class),
                @XmlElement(name = "depth_test_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.DepthTestEnableImpl.class),
                @XmlElement(name = "dither_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.DitherEnableImpl.class),
                @XmlElement(name = "fog_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.FogEnableImpl.class),
                @XmlElement(name = "texture_pipeline_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.TexturePipelineEnableImpl.class),
                @XmlElement(name = "light_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.LightEnableImpl.class),
                @XmlElement(name = "lighting_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.LightingEnableImpl.class),
                @XmlElement(name = "light_model_two_side_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.LightModelTwoSideEnableImpl.class),
                @XmlElement(name = "line_smooth_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.LineSmoothEnableImpl.class),
                @XmlElement(name = "multisample_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.MultisampleEnableImpl.class),
                @XmlElement(name = "normalize_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.NormalizeEnableImpl.class),
                @XmlElement(name = "point_smooth_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.PointSmoothEnableImpl.class),
                @XmlElement(name = "polygon_offset_fill_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.PolygonOffsetFillEnableImpl.class),
                @XmlElement(name = "rescale_normal_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.RescaleNormalEnableImpl.class),
                @XmlElement(name = "sample_alpha_to_coverage_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.SampleAlphaToCoverageEnableImpl.class),
                @XmlElement(name = "sample_alpha_to_one_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.SampleAlphaToOneEnableImpl.class),
                @XmlElement(name = "sample_coverage_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.SampleCoverageEnableImpl.class),
                @XmlElement(name = "scissor_test_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.ScissorTestEnableImpl.class),
                @XmlElement(name = "stencil_test_enable", type = ProfileGLESImpl.TechniqueImpl.PassImpl.StencilTestEnableImpl.class)
            })
            protected List<Object> alphaFuncsAndBlendFuncsAndClearColors;
            @XmlElement(name = "extra", type = ExtraImpl.class)
            protected List<Extra> extras;
            @XmlAttribute(name = "sid")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String sid;

            public List<FxAnnotateCommon> getAnnotates() {
                if (annotates == null) {
                    annotates = new ArrayList<FxAnnotateCommon>();
                }
                return this.annotates;
            }

            public String getColorTarget() {
                return colorTarget;
            }

            public void setColorTarget(String value) {
                this.colorTarget = value;
            }

            public String getDepthTarget() {
                return depthTarget;
            }

            public void setDepthTarget(String value) {
                this.depthTarget = value;
            }

            public String getStencilTarget() {
                return stencilTarget;
            }

            public void setStencilTarget(String value) {
                this.stencilTarget = value;
            }

            public List<Double> getColorClear() {
                if (colorClear == null) {
                    colorClear = new ArrayList<Double>();
                }
                return this.colorClear;
            }

            public Double getDepthClear() {
                return depthClear;
            }

            public void setDepthClear(Double value) {
                this.depthClear = value;
            }

            public Byte getStencilClear() {
                return stencilClear;
            }

            public void setStencilClear(Byte value) {
                this.stencilClear = value;
            }

            public String getDraw() {
                return draw;
            }

            public void setDraw(String value) {
                this.draw = value;
            }

            public List<Object> getAlphaFuncsAndBlendFuncsAndClearColors() {
                if (alphaFuncsAndBlendFuncsAndClearColors == null) {
                    alphaFuncsAndBlendFuncsAndClearColors = new ArrayList<Object>();
                }
                return this.alphaFuncsAndBlendFuncsAndClearColors;
            }

            public List<Extra> getExtras() {
                if (extras == null) {
                    extras = new ArrayList<Extra>();
                }
                return this.extras;
            }

            public String getSid() {
                return sid;
            }

            public void setSid(String value) {
                this.sid = value;
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "func",
                "value"
            })
            public static class AlphaFuncImpl implements ProfileGLES.Technique.Pass.AlphaFunc
            {

                @XmlElement(required = true, type = ProfileGLESImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.FuncImpl.class)
                protected ProfileGLESImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.FuncImpl func;
                @XmlElement(required = true, type = ProfileGLESImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.ValueImpl.class)
                protected ProfileGLESImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.ValueImpl value;

                public ProfileGLES.Technique.Pass.AlphaFunc.Func getFunc() {
                    return func;
                }

                public void setFunc(ProfileGLES.Technique.Pass.AlphaFunc.Func value) {
                    this.func = ((ProfileGLESImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.FuncImpl) value);
                }

                public ProfileGLES.Technique.Pass.AlphaFunc.Value getValue() {
                    return value;
                }

                public void setValue(ProfileGLES.Technique.Pass.AlphaFunc.Value value) {
                    this.value = ((ProfileGLESImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.ValueImpl) value);
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class FuncImpl
                    implements ProfileGLES.Technique.Pass.AlphaFunc.Func
                {

                    @XmlAttribute(name = "value")
                    protected GlFuncType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlFuncType getValue() {
                        if (value == null) {
                            return GlFuncType.ALWAYS;
                        } else {
                            return value;
                        }
                    }

                    public void setValue(GlFuncType value) {
                        this.value = value;
                    }

                    public String getParam() {
                        return param;
                    }

                    public void setParam(String value) {
                        this.param = value;
                    }

                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class ValueImpl
                    implements ProfileGLES.Technique.Pass.AlphaFunc.Value
                {

                    @XmlAttribute(name = "value")
                    protected Float value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public float getValue() {
                        if (value == null) {
                            return  0.0F;
                        } else {
                            return value;
                        }
                    }

                    public void setValue(Float value) {
                        this.value = value;
                    }

                    public String getParam() {
                        return param;
                    }

                    public void setParam(String value) {
                        this.param = value;
                    }

                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AlphaTestEnableImpl implements ProfileGLES.Technique.Pass.AlphaTestEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class BlendEnableImpl implements ProfileGLES.Technique.Pass.BlendEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "src",
                "dest"
            })
            public static class BlendFuncImpl implements ProfileGLES.Technique.Pass.BlendFunc
            {

                @XmlElement(required = true, type = ProfileGLESImpl.TechniqueImpl.PassImpl.BlendFuncImpl.SrcImpl.class)
                protected ProfileGLESImpl.TechniqueImpl.PassImpl.BlendFuncImpl.SrcImpl src;
                @XmlElement(required = true, type = ProfileGLESImpl.TechniqueImpl.PassImpl.BlendFuncImpl.DestImpl.class)
                protected ProfileGLESImpl.TechniqueImpl.PassImpl.BlendFuncImpl.DestImpl dest;

                public ProfileGLES.Technique.Pass.BlendFunc.Src getSrc() {
                    return src;
                }

                public void setSrc(ProfileGLES.Technique.Pass.BlendFunc.Src value) {
                    this.src = ((ProfileGLESImpl.TechniqueImpl.PassImpl.BlendFuncImpl.SrcImpl) value);
                }

                public ProfileGLES.Technique.Pass.BlendFunc.Dest getDest() {
                    return dest;
                }

                public void setDest(ProfileGLES.Technique.Pass.BlendFunc.Dest value) {
                    this.dest = ((ProfileGLESImpl.TechniqueImpl.PassImpl.BlendFuncImpl.DestImpl) value);
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class DestImpl
                    implements ProfileGLES.Technique.Pass.BlendFunc.Dest
                {

                    @XmlAttribute(name = "value")
                    protected GlBlendType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlBlendType getValue() {
                        if (value == null) {
                            return GlBlendType.ZERO;
                        } else {
                            return value;
                        }
                    }

                    public void setValue(GlBlendType value) {
                        this.value = value;
                    }

                    public String getParam() {
                        return param;
                    }

                    public void setParam(String value) {
                        this.param = value;
                    }

                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class SrcImpl
                    implements ProfileGLES.Technique.Pass.BlendFunc.Src
                {

                    @XmlAttribute(name = "value")
                    protected GlBlendType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlBlendType getValue() {
                        if (value == null) {
                            return GlBlendType.ONE;
                        } else {
                            return value;
                        }
                    }

                    public void setValue(GlBlendType value) {
                        this.value = value;
                    }

                    public String getParam() {
                        return param;
                    }

                    public void setParam(String value) {
                        this.param = value;
                    }

                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ClearColorImpl implements ProfileGLES.Technique.Pass.ClearColor
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public List<Double> getValues() {
                    if (values == null) {
                        values = new ArrayList<Double>();
                    }
                    return this.values;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ClearDepthImpl implements ProfileGLES.Technique.Pass.ClearDepth
            {

                @XmlAttribute(name = "value")
                protected Double value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public Double getValue() {
                    return value;
                }

                public void setValue(Double value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ClearStencilImpl implements ProfileGLES.Technique.Pass.ClearStencil
            {

                @XmlAttribute(name = "value")
                protected Long value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public Long getValue() {
                    return value;
                }

                public void setValue(Long value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ClipPlaneEnableImpl implements ProfileGLES.Technique.Pass.ClipPlaneEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index")
                protected Integer index;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

                public Integer getIndex() {
                    return index;
                }

                public void setIndex(Integer value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ClipPlaneImpl implements ProfileGLES.Technique.Pass.ClipPlane
            {

                @XmlAttribute(name = "value")
                protected List<Boolean> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected int index;

                public List<Boolean> getValues() {
                    if (values == null) {
                        values = new ArrayList<Boolean>();
                    }
                    return this.values;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

                public int getIndex() {
                    return index;
                }

                public void setIndex(int value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ColorLogicOpEnableImpl implements ProfileGLES.Technique.Pass.ColorLogicOpEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ColorMaskImpl implements ProfileGLES.Technique.Pass.ColorMask
            {

                @XmlAttribute(name = "value")
                protected List<Boolean> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public List<Boolean> getValues() {
                    if (values == null) {
                        values = new ArrayList<Boolean>();
                    }
                    return this.values;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ColorMaterialEnableImpl implements ProfileGLES.Technique.Pass.ColorMaterialEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return true;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CullFaceEnableImpl implements ProfileGLES.Technique.Pass.CullFaceEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CullFaceImpl implements ProfileGLES.Technique.Pass.CullFace
            {

                @XmlAttribute(name = "value")
                protected GlFaceType value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public GlFaceType getValue() {
                    if (value == null) {
                        return GlFaceType.BACK;
                    } else {
                        return value;
                    }
                }

                public void setValue(GlFaceType value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DepthFuncImpl implements ProfileGLES.Technique.Pass.DepthFunc
            {

                @XmlAttribute(name = "value")
                protected GlFuncType value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public GlFuncType getValue() {
                    if (value == null) {
                        return GlFuncType.ALWAYS;
                    } else {
                        return value;
                    }
                }

                public void setValue(GlFuncType value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DepthMaskImpl implements ProfileGLES.Technique.Pass.DepthMask
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DepthRangeImpl implements ProfileGLES.Technique.Pass.DepthRange
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public List<Double> getValues() {
                    if (values == null) {
                        values = new ArrayList<Double>();
                    }
                    return this.values;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DepthTestEnableImpl implements ProfileGLES.Technique.Pass.DepthTestEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DitherEnableImpl implements ProfileGLES.Technique.Pass.DitherEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FogColorImpl implements ProfileGLES.Technique.Pass.FogColor
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public List<Double> getValues() {
                    if (values == null) {
                        values = new ArrayList<Double>();
                    }
                    return this.values;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FogDensityImpl implements ProfileGLES.Technique.Pass.FogDensity
            {

                @XmlAttribute(name = "value")
                protected Double value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public double getValue() {
                    if (value == null) {
                        return  1.0D;
                    } else {
                        return value;
                    }
                }

                public void setValue(Double value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FogEnableImpl implements ProfileGLES.Technique.Pass.FogEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FogEndImpl implements ProfileGLES.Technique.Pass.FogEnd
            {

                @XmlAttribute(name = "value")
                protected Double value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public double getValue() {
                    if (value == null) {
                        return  1.0D;
                    } else {
                        return value;
                    }
                }

                public void setValue(Double value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FogModeImpl implements ProfileGLES.Technique.Pass.FogMode
            {

                @XmlAttribute(name = "value")
                protected GlFogType value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public GlFogType getValue() {
                    if (value == null) {
                        return GlFogType.EXP;
                    } else {
                        return value;
                    }
                }

                public void setValue(GlFogType value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FogStartImpl implements ProfileGLES.Technique.Pass.FogStart
            {

                @XmlAttribute(name = "value")
                protected Double value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public double getValue() {
                    if (value == null) {
                        return  0.0D;
                    } else {
                        return value;
                    }
                }

                public void setValue(Double value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FrontFaceImpl implements ProfileGLES.Technique.Pass.FrontFace
            {

                @XmlAttribute(name = "value")
                protected GlFrontFaceType value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public GlFrontFaceType getValue() {
                    if (value == null) {
                        return GlFrontFaceType.CCW;
                    } else {
                        return value;
                    }
                }

                public void setValue(GlFrontFaceType value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightAmbientImpl implements ProfileGLES.Technique.Pass.LightAmbient
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected int index;

                public List<Double> getValues() {
                    if (values == null) {
                        values = new ArrayList<Double>();
                    }
                    return this.values;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

                public int getIndex() {
                    return index;
                }

                public void setIndex(int value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightConstantAttenuationImpl implements ProfileGLES.Technique.Pass.LightConstantAttenuation
            {

                @XmlAttribute(name = "value")
                protected Double value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected int index;

                public double getValue() {
                    if (value == null) {
                        return  1.0D;
                    } else {
                        return value;
                    }
                }

                public void setValue(Double value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

                public int getIndex() {
                    return index;
                }

                public void setIndex(int value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightDiffuseImpl implements ProfileGLES.Technique.Pass.LightDiffuse
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected int index;

                public List<Double> getValues() {
                    if (values == null) {
                        values = new ArrayList<Double>();
                    }
                    return this.values;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

                public int getIndex() {
                    return index;
                }

                public void setIndex(int value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightEnableImpl implements ProfileGLES.Technique.Pass.LightEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected int index;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

                public int getIndex() {
                    return index;
                }

                public void setIndex(int value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightLinearAttenutationImpl implements ProfileGLES.Technique.Pass.LightLinearAttenutation
            {

                @XmlAttribute(name = "value")
                protected Double value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected int index;

                public double getValue() {
                    if (value == null) {
                        return  1.0D;
                    } else {
                        return value;
                    }
                }

                public void setValue(Double value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

                public int getIndex() {
                    return index;
                }

                public void setIndex(int value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightModelAmbientImpl implements ProfileGLES.Technique.Pass.LightModelAmbient
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public List<Double> getValues() {
                    if (values == null) {
                        values = new ArrayList<Double>();
                    }
                    return this.values;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightModelTwoSideEnableImpl implements ProfileGLES.Technique.Pass.LightModelTwoSideEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightPositionImpl implements ProfileGLES.Technique.Pass.LightPosition
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected int index;

                public List<Double> getValues() {
                    if (values == null) {
                        values = new ArrayList<Double>();
                    }
                    return this.values;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

                public int getIndex() {
                    return index;
                }

                public void setIndex(int value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightQuadraticAttenuationImpl implements ProfileGLES.Technique.Pass.LightQuadraticAttenuation
            {

                @XmlAttribute(name = "value")
                protected Double value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected int index;

                public double getValue() {
                    if (value == null) {
                        return  1.0D;
                    } else {
                        return value;
                    }
                }

                public void setValue(Double value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

                public int getIndex() {
                    return index;
                }

                public void setIndex(int value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightSpecularImpl implements ProfileGLES.Technique.Pass.LightSpecular
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected int index;

                public List<Double> getValues() {
                    if (values == null) {
                        values = new ArrayList<Double>();
                    }
                    return this.values;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

                public int getIndex() {
                    return index;
                }

                public void setIndex(int value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightSpotCutoffImpl implements ProfileGLES.Technique.Pass.LightSpotCutoff
            {

                @XmlAttribute(name = "value")
                protected Double value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected int index;

                public double getValue() {
                    if (value == null) {
                        return  180.0D;
                    } else {
                        return value;
                    }
                }

                public void setValue(Double value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

                public int getIndex() {
                    return index;
                }

                public void setIndex(int value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightSpotDirectionImpl implements ProfileGLES.Technique.Pass.LightSpotDirection
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected int index;

                public List<Double> getValues() {
                    if (values == null) {
                        values = new ArrayList<Double>();
                    }
                    return this.values;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

                public int getIndex() {
                    return index;
                }

                public void setIndex(int value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightSpotExponentImpl implements ProfileGLES.Technique.Pass.LightSpotExponent
            {

                @XmlAttribute(name = "value")
                protected Double value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected int index;

                public double getValue() {
                    if (value == null) {
                        return  0.0D;
                    } else {
                        return value;
                    }
                }

                public void setValue(Double value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

                public int getIndex() {
                    return index;
                }

                public void setIndex(int value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightingEnableImpl implements ProfileGLES.Technique.Pass.LightingEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LineSmoothEnableImpl implements ProfileGLES.Technique.Pass.LineSmoothEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LineWidthImpl implements ProfileGLES.Technique.Pass.LineWidth
            {

                @XmlAttribute(name = "value")
                protected Double value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public double getValue() {
                    if (value == null) {
                        return  1.0D;
                    } else {
                        return value;
                    }
                }

                public void setValue(Double value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LogicOpImpl implements ProfileGLES.Technique.Pass.LogicOp
            {

                @XmlAttribute(name = "value")
                protected GlLogicOpType value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public GlLogicOpType getValue() {
                    if (value == null) {
                        return GlLogicOpType.COPY;
                    } else {
                        return value;
                    }
                }

                public void setValue(GlLogicOpType value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MaterialAmbientImpl implements ProfileGLES.Technique.Pass.MaterialAmbient
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public List<Double> getValues() {
                    if (values == null) {
                        values = new ArrayList<Double>();
                    }
                    return this.values;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MaterialDiffuseImpl implements ProfileGLES.Technique.Pass.MaterialDiffuse
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public List<Double> getValues() {
                    if (values == null) {
                        values = new ArrayList<Double>();
                    }
                    return this.values;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MaterialEmissionImpl implements ProfileGLES.Technique.Pass.MaterialEmission
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public List<Double> getValues() {
                    if (values == null) {
                        values = new ArrayList<Double>();
                    }
                    return this.values;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MaterialShininessImpl implements ProfileGLES.Technique.Pass.MaterialShininess
            {

                @XmlAttribute(name = "value")
                protected Double value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public double getValue() {
                    if (value == null) {
                        return  0.0D;
                    } else {
                        return value;
                    }
                }

                public void setValue(Double value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MaterialSpecularImpl implements ProfileGLES.Technique.Pass.MaterialSpecular
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public List<Double> getValues() {
                    if (values == null) {
                        values = new ArrayList<Double>();
                    }
                    return this.values;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ModelViewMatrixImpl implements ProfileGLES.Technique.Pass.ModelViewMatrix
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public List<Double> getValues() {
                    if (values == null) {
                        values = new ArrayList<Double>();
                    }
                    return this.values;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class MultisampleEnableImpl implements ProfileGLES.Technique.Pass.MultisampleEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class NormalizeEnableImpl implements ProfileGLES.Technique.Pass.NormalizeEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PointDistanceAttenuationImpl implements ProfileGLES.Technique.Pass.PointDistanceAttenuation
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public List<Double> getValues() {
                    if (values == null) {
                        values = new ArrayList<Double>();
                    }
                    return this.values;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PointFadeThresholdSizeImpl implements ProfileGLES.Technique.Pass.PointFadeThresholdSize
            {

                @XmlAttribute(name = "value")
                protected Double value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public double getValue() {
                    if (value == null) {
                        return  1.0D;
                    } else {
                        return value;
                    }
                }

                public void setValue(Double value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PointSizeImpl implements ProfileGLES.Technique.Pass.PointSize
            {

                @XmlAttribute(name = "value")
                protected Double value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public double getValue() {
                    if (value == null) {
                        return  1.0D;
                    } else {
                        return value;
                    }
                }

                public void setValue(Double value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PointSizeMaxImpl implements ProfileGLES.Technique.Pass.PointSizeMax
            {

                @XmlAttribute(name = "value")
                protected Double value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public double getValue() {
                    if (value == null) {
                        return  1.0D;
                    } else {
                        return value;
                    }
                }

                public void setValue(Double value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PointSizeMinImpl implements ProfileGLES.Technique.Pass.PointSizeMin
            {

                @XmlAttribute(name = "value")
                protected Double value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public double getValue() {
                    if (value == null) {
                        return  0.0D;
                    } else {
                        return value;
                    }
                }

                public void setValue(Double value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PointSmoothEnableImpl implements ProfileGLES.Technique.Pass.PointSmoothEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PolygonOffsetFillEnableImpl implements ProfileGLES.Technique.Pass.PolygonOffsetFillEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PolygonOffsetImpl implements ProfileGLES.Technique.Pass.PolygonOffset
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public List<Double> getValues() {
                    if (values == null) {
                        values = new ArrayList<Double>();
                    }
                    return this.values;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ProjectionMatrixImpl implements ProfileGLES.Technique.Pass.ProjectionMatrix
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public List<Double> getValues() {
                    if (values == null) {
                        values = new ArrayList<Double>();
                    }
                    return this.values;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RescaleNormalEnableImpl implements ProfileGLES.Technique.Pass.RescaleNormalEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SampleAlphaToCoverageEnableImpl implements ProfileGLES.Technique.Pass.SampleAlphaToCoverageEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SampleAlphaToOneEnableImpl implements ProfileGLES.Technique.Pass.SampleAlphaToOneEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SampleCoverageEnableImpl implements ProfileGLES.Technique.Pass.SampleCoverageEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ScissorImpl implements ProfileGLES.Technique.Pass.Scissor
            {

                @XmlAttribute(name = "value")
                protected List<Long> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public List<Long> getValues() {
                    if (values == null) {
                        values = new ArrayList<Long>();
                    }
                    return this.values;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ScissorTestEnableImpl implements ProfileGLES.Technique.Pass.ScissorTestEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ShadeModelImpl implements ProfileGLES.Technique.Pass.ShadeModel
            {

                @XmlAttribute(name = "value")
                protected GlShadeModelType value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public GlShadeModelType getValue() {
                    if (value == null) {
                        return GlShadeModelType.SMOOTH;
                    } else {
                        return value;
                    }
                }

                public void setValue(GlShadeModelType value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "func",
                "ref",
                "mask"
            })
            public static class StencilFuncImpl implements ProfileGLES.Technique.Pass.StencilFunc
            {

                @XmlElement(required = true, type = ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl.FuncImpl.class)
                protected ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl.FuncImpl func;
                @XmlElement(required = true, type = ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl.RefImpl.class)
                protected ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl.RefImpl ref;
                @XmlElement(required = true, type = ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl.MaskImpl.class)
                protected ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl.MaskImpl mask;

                public ProfileGLES.Technique.Pass.StencilFunc.Func getFunc() {
                    return func;
                }

                public void setFunc(ProfileGLES.Technique.Pass.StencilFunc.Func value) {
                    this.func = ((ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl.FuncImpl) value);
                }

                public ProfileGLES.Technique.Pass.StencilFunc.Ref getRef() {
                    return ref;
                }

                public void setRef(ProfileGLES.Technique.Pass.StencilFunc.Ref value) {
                    this.ref = ((ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl.RefImpl) value);
                }

                public ProfileGLES.Technique.Pass.StencilFunc.Mask getMask() {
                    return mask;
                }

                public void setMask(ProfileGLES.Technique.Pass.StencilFunc.Mask value) {
                    this.mask = ((ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl.MaskImpl) value);
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class FuncImpl
                    implements ProfileGLES.Technique.Pass.StencilFunc.Func
                {

                    @XmlAttribute(name = "value")
                    protected GlFuncType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlFuncType getValue() {
                        if (value == null) {
                            return GlFuncType.ALWAYS;
                        } else {
                            return value;
                        }
                    }

                    public void setValue(GlFuncType value) {
                        this.value = value;
                    }

                    public String getParam() {
                        return param;
                    }

                    public void setParam(String value) {
                        this.param = value;
                    }

                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class MaskImpl
                    implements ProfileGLES.Technique.Pass.StencilFunc.Mask
                {

                    @XmlAttribute(name = "value")
                    @XmlSchemaType(name = "unsignedByte")
                    protected Short value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public short getValue() {
                        if (value == null) {
                            return ((short) 255);
                        } else {
                            return value;
                        }
                    }

                    public void setValue(Short value) {
                        this.value = value;
                    }

                    public String getParam() {
                        return param;
                    }

                    public void setParam(String value) {
                        this.param = value;
                    }

                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class RefImpl
                    implements ProfileGLES.Technique.Pass.StencilFunc.Ref
                {

                    @XmlAttribute(name = "value")
                    @XmlSchemaType(name = "unsignedByte")
                    protected Short value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public short getValue() {
                        if (value == null) {
                            return ((short) 0);
                        } else {
                            return value;
                        }
                    }

                    public void setValue(Short value) {
                        this.value = value;
                    }

                    public String getParam() {
                        return param;
                    }

                    public void setParam(String value) {
                        this.param = value;
                    }

                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class StencilMaskImpl implements ProfileGLES.Technique.Pass.StencilMask
            {

                @XmlAttribute(name = "value")
                protected Long value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public long getValue() {
                    if (value == null) {
                        return  4294967295L;
                    } else {
                        return value;
                    }
                }

                public void setValue(Long value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "fail",
                "zfail",
                "zpass"
            })
            public static class StencilOpImpl implements ProfileGLES.Technique.Pass.StencilOp
            {

                @XmlElement(required = true, type = ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl.FailImpl.class)
                protected ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl.FailImpl fail;
                @XmlElement(required = true, type = ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZfailImpl.class)
                protected ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZfailImpl zfail;
                @XmlElement(required = true, type = ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZpassImpl.class)
                protected ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZpassImpl zpass;

                public ProfileGLES.Technique.Pass.StencilOp.Fail getFail() {
                    return fail;
                }

                public void setFail(ProfileGLES.Technique.Pass.StencilOp.Fail value) {
                    this.fail = ((ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl.FailImpl) value);
                }

                public ProfileGLES.Technique.Pass.StencilOp.Zfail getZfail() {
                    return zfail;
                }

                public void setZfail(ProfileGLES.Technique.Pass.StencilOp.Zfail value) {
                    this.zfail = ((ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZfailImpl) value);
                }

                public ProfileGLES.Technique.Pass.StencilOp.Zpass getZpass() {
                    return zpass;
                }

                public void setZpass(ProfileGLES.Technique.Pass.StencilOp.Zpass value) {
                    this.zpass = ((ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZpassImpl) value);
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class FailImpl
                    implements ProfileGLES.Technique.Pass.StencilOp.Fail
                {

                    @XmlAttribute(name = "value")
                    protected GlesStencilOpType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlesStencilOpType getValue() {
                        if (value == null) {
                            return GlesStencilOpType.KEEP;
                        } else {
                            return value;
                        }
                    }

                    public void setValue(GlesStencilOpType value) {
                        this.value = value;
                    }

                    public String getParam() {
                        return param;
                    }

                    public void setParam(String value) {
                        this.param = value;
                    }

                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class ZfailImpl
                    implements ProfileGLES.Technique.Pass.StencilOp.Zfail
                {

                    @XmlAttribute(name = "value")
                    protected GlesStencilOpType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlesStencilOpType getValue() {
                        if (value == null) {
                            return GlesStencilOpType.KEEP;
                        } else {
                            return value;
                        }
                    }

                    public void setValue(GlesStencilOpType value) {
                        this.value = value;
                    }

                    public String getParam() {
                        return param;
                    }

                    public void setParam(String value) {
                        this.param = value;
                    }

                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class ZpassImpl
                    implements ProfileGLES.Technique.Pass.StencilOp.Zpass
                {

                    @XmlAttribute(name = "value")
                    protected GlesStencilOpType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlesStencilOpType getValue() {
                        if (value == null) {
                            return GlesStencilOpType.KEEP;
                        } else {
                            return value;
                        }
                    }

                    public void setValue(GlesStencilOpType value) {
                        this.value = value;
                    }

                    public String getParam() {
                        return param;
                    }

                    public void setParam(String value) {
                        this.param = value;
                    }

                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class StencilTestEnableImpl implements ProfileGLES.Technique.Pass.StencilTestEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TexturePipelineEnableImpl implements ProfileGLES.Technique.Pass.TexturePipelineEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public boolean isValue() {
                    if (value == null) {
                        return false;
                    } else {
                        return value;
                    }
                }

                public void setValue(Boolean value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class TexturePipelineImpl implements ProfileGLES.Technique.Pass.TexturePipeline
            {

                @XmlElement(type = GlesTexturePipelineImpl.class)
                protected GlesTexturePipelineImpl value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public GlesTexturePipeline getValue() {
                    return value;
                }

                public void setValue(GlesTexturePipeline value) {
                    this.value = ((GlesTexturePipelineImpl) value);
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

            }

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "annotates",
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
        public static class SetparamImpl implements ProfileGLES.Technique.Setparam
        {

            @XmlElement(name = "annotate", type = FxAnnotateCommonImpl.class)
            protected List<FxAnnotateCommon> annotates;
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
            @XmlAttribute(name = "ref", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
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

            public String getRef() {
                return ref;
            }

            public void setRef(String value) {
                this.ref = value;
            }

        }

    }

}
