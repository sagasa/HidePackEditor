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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.Asset;
import org.collada._2005._11.colladaschema.CgPipelineStage;
import org.collada._2005._11.colladaschema.CgSampler1D;
import org.collada._2005._11.colladaschema.CgSampler2D;
import org.collada._2005._11.colladaschema.CgSampler3D;
import org.collada._2005._11.colladaschema.CgSamplerCUBE;
import org.collada._2005._11.colladaschema.CgSamplerDEPTH;
import org.collada._2005._11.colladaschema.CgSamplerRECT;
import org.collada._2005._11.colladaschema.CgSurfaceType;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.FxAnnotateCommon;
import org.collada._2005._11.colladaschema.FxClearcolorCommon;
import org.collada._2005._11.colladaschema.FxCleardepthCommon;
import org.collada._2005._11.colladaschema.FxClearstencilCommon;
import org.collada._2005._11.colladaschema.FxColortargetCommon;
import org.collada._2005._11.colladaschema.FxDepthtargetCommon;
import org.collada._2005._11.colladaschema.FxStenciltargetCommon;
import org.collada._2005._11.colladaschema.GlBlendEquationType;
import org.collada._2005._11.colladaschema.GlBlendType;
import org.collada._2005._11.colladaschema.GlFaceType;
import org.collada._2005._11.colladaschema.GlFogCoordSrcType;
import org.collada._2005._11.colladaschema.GlFogType;
import org.collada._2005._11.colladaschema.GlFrontFaceType;
import org.collada._2005._11.colladaschema.GlFuncType;
import org.collada._2005._11.colladaschema.GlLightModelColorControlType;
import org.collada._2005._11.colladaschema.GlLogicOpType;
import org.collada._2005._11.colladaschema.GlMaterialType;
import org.collada._2005._11.colladaschema.GlPolygonModeType;
import org.collada._2005._11.colladaschema.GlSampler1D;
import org.collada._2005._11.colladaschema.GlSampler2D;
import org.collada._2005._11.colladaschema.GlSampler3D;
import org.collada._2005._11.colladaschema.GlSamplerCUBE;
import org.collada._2005._11.colladaschema.GlSamplerDEPTH;
import org.collada._2005._11.colladaschema.GlSamplerRECT;
import org.collada._2005._11.colladaschema.GlShadeModelType;
import org.collada._2005._11.colladaschema.GlStencilOpType;
import org.collada._2005._11.colladaschema.ProfileCG;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asset",
    "codesAndIncludes",
    "imagesAndNewparams",
    "techniques",
    "extras"
})
public class ProfileCGImpl implements ProfileCG
{

    @XmlElement(type = AssetImpl.class)
    protected AssetImpl asset;
    @XmlElements({
        @XmlElement(name = "code", type = FxCodeProfileImpl.class),
        @XmlElement(name = "include", type = FxIncludeCommonImpl.class)
    })
    protected List<Object> codesAndIncludes;
    @XmlElements({
        @XmlElement(name = "image", type = ImageImpl.class),
        @XmlElement(name = "newparam", type = CgNewparamImpl.class)
    })
    protected List<Object> imagesAndNewparams;
    @XmlElement(name = "technique", required = true, type = ProfileCGImpl.TechniqueImpl.class)
    protected List<ProfileCG.Technique> techniques;
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

    public List<Object> getCodesAndIncludes() {
        if (codesAndIncludes == null) {
            codesAndIncludes = new ArrayList<Object>();
        }
        return this.codesAndIncludes;
    }

    public List<Object> getImagesAndNewparams() {
        if (imagesAndNewparams == null) {
            imagesAndNewparams = new ArrayList<Object>();
        }
        return this.imagesAndNewparams;
    }

    public List<ProfileCG.Technique> getTechniques() {
        if (techniques == null) {
            techniques = new ArrayList<ProfileCG.Technique>();
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
        "codesAndIncludes",
        "imagesAndNewparamsAndSetparams",
        "passes",
        "extras"
    })
    public static class TechniqueImpl
        implements ProfileCG.Technique
    {

        @XmlElement(type = AssetImpl.class)
        protected AssetImpl asset;
        @XmlElement(name = "annotate", type = FxAnnotateCommonImpl.class)
        protected List<FxAnnotateCommon> annotates;
        @XmlElements({
            @XmlElement(name = "code", type = FxCodeProfileImpl.class),
            @XmlElement(name = "include", type = FxIncludeCommonImpl.class)
        })
        protected List<Object> codesAndIncludes;
        @XmlElements({
            @XmlElement(name = "image", type = ImageImpl.class),
            @XmlElement(name = "newparam", type = CgNewparamImpl.class),
            @XmlElement(name = "setparam", type = CgSetparamImpl.class)
        })
        protected List<Object> imagesAndNewparamsAndSetparams;
        @XmlElement(name = "pass", required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.class)
        protected List<ProfileCG.Technique.Pass> passes;
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

        public List<Object> getCodesAndIncludes() {
            if (codesAndIncludes == null) {
                codesAndIncludes = new ArrayList<Object>();
            }
            return this.codesAndIncludes;
        }

        public List<Object> getImagesAndNewparamsAndSetparams() {
            if (imagesAndNewparamsAndSetparams == null) {
                imagesAndNewparamsAndSetparams = new ArrayList<Object>();
            }
            return this.imagesAndNewparamsAndSetparams;
        }

        public List<ProfileCG.Technique.Pass> getPasses() {
            if (passes == null) {
                passes = new ArrayList<ProfileCG.Technique.Pass>();
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
            "colorTargets",
            "depthTargets",
            "stencilTargets",
            "colorClears",
            "depthClears",
            "stencilClears",
            "draw",
            "alphaFuncsAndBlendFuncsAndBlendFuncSeparates",
            "extras"
        })
        public static class PassImpl
            implements ProfileCG.Technique.Pass
        {

            @XmlElement(name = "annotate", type = FxAnnotateCommonImpl.class)
            protected List<FxAnnotateCommon> annotates;
            @XmlElement(name = "color_target", type = FxColortargetCommonImpl.class)
            protected List<FxColortargetCommon> colorTargets;
            @XmlElement(name = "depth_target", type = FxDepthtargetCommonImpl.class)
            protected List<FxDepthtargetCommon> depthTargets;
            @XmlElement(name = "stencil_target", type = FxStenciltargetCommonImpl.class)
            protected List<FxStenciltargetCommon> stencilTargets;
            @XmlElement(name = "color_clear", type = FxClearcolorCommonImpl.class)
            protected List<FxClearcolorCommon> colorClears;
            @XmlElement(name = "depth_clear", type = FxCleardepthCommonImpl.class)
            protected List<FxCleardepthCommon> depthClears;
            @XmlElement(name = "stencil_clear", type = FxClearstencilCommonImpl.class)
            protected List<FxClearstencilCommon> stencilClears;
            protected String draw;
            @XmlElements({
                @XmlElement(name = "alpha_func", type = ProfileCGImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.class),
                @XmlElement(name = "blend_func", type = ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncImpl.class),
                @XmlElement(name = "blend_func_separate", type = ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.class),
                @XmlElement(name = "blend_equation", type = ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationImpl.class),
                @XmlElement(name = "blend_equation_separate", type = ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationSeparateImpl.class),
                @XmlElement(name = "color_material", type = ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialImpl.class),
                @XmlElement(name = "cull_face", type = ProfileCGImpl.TechniqueImpl.PassImpl.CullFaceImpl.class),
                @XmlElement(name = "depth_func", type = ProfileCGImpl.TechniqueImpl.PassImpl.DepthFuncImpl.class),
                @XmlElement(name = "fog_mode", type = ProfileCGImpl.TechniqueImpl.PassImpl.FogModeImpl.class),
                @XmlElement(name = "fog_coord_src", type = ProfileCGImpl.TechniqueImpl.PassImpl.FogCoordSrcImpl.class),
                @XmlElement(name = "front_face", type = ProfileCGImpl.TechniqueImpl.PassImpl.FrontFaceImpl.class),
                @XmlElement(name = "light_model_color_control", type = ProfileCGImpl.TechniqueImpl.PassImpl.LightModelColorControlImpl.class),
                @XmlElement(name = "logic_op", type = ProfileCGImpl.TechniqueImpl.PassImpl.LogicOpImpl.class),
                @XmlElement(name = "polygon_mode", type = ProfileCGImpl.TechniqueImpl.PassImpl.PolygonModeImpl.class),
                @XmlElement(name = "shade_model", type = ProfileCGImpl.TechniqueImpl.PassImpl.ShadeModelImpl.class),
                @XmlElement(name = "stencil_func", type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl.class),
                @XmlElement(name = "stencil_op", type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl.class),
                @XmlElement(name = "stencil_func_separate", type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.class),
                @XmlElement(name = "stencil_op_separate", type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.class),
                @XmlElement(name = "stencil_mask_separate", type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskSeparateImpl.class),
                @XmlElement(name = "light_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.LightEnableImpl.class),
                @XmlElement(name = "light_ambient", type = ProfileCGImpl.TechniqueImpl.PassImpl.LightAmbientImpl.class),
                @XmlElement(name = "light_diffuse", type = ProfileCGImpl.TechniqueImpl.PassImpl.LightDiffuseImpl.class),
                @XmlElement(name = "light_specular", type = ProfileCGImpl.TechniqueImpl.PassImpl.LightSpecularImpl.class),
                @XmlElement(name = "light_position", type = ProfileCGImpl.TechniqueImpl.PassImpl.LightPositionImpl.class),
                @XmlElement(name = "light_constant_attenuation", type = ProfileCGImpl.TechniqueImpl.PassImpl.LightConstantAttenuationImpl.class),
                @XmlElement(name = "light_linear_attenuation", type = ProfileCGImpl.TechniqueImpl.PassImpl.LightLinearAttenuationImpl.class),
                @XmlElement(name = "light_quadratic_attenuation", type = ProfileCGImpl.TechniqueImpl.PassImpl.LightQuadraticAttenuationImpl.class),
                @XmlElement(name = "light_spot_cutoff", type = ProfileCGImpl.TechniqueImpl.PassImpl.LightSpotCutoffImpl.class),
                @XmlElement(name = "light_spot_direction", type = ProfileCGImpl.TechniqueImpl.PassImpl.LightSpotDirectionImpl.class),
                @XmlElement(name = "light_spot_exponent", type = ProfileCGImpl.TechniqueImpl.PassImpl.LightSpotExponentImpl.class),
                @XmlElement(name = "texture1D", type = ProfileCGImpl.TechniqueImpl.PassImpl.Texture1DImpl.class),
                @XmlElement(name = "texture2D", type = ProfileCGImpl.TechniqueImpl.PassImpl.Texture2DImpl.class),
                @XmlElement(name = "texture3D", type = ProfileCGImpl.TechniqueImpl.PassImpl.Texture3DImpl.class),
                @XmlElement(name = "textureCUBE", type = ProfileCGImpl.TechniqueImpl.PassImpl.TextureCUBEImpl.class),
                @XmlElement(name = "textureRECT", type = ProfileCGImpl.TechniqueImpl.PassImpl.TextureRECTImpl.class),
                @XmlElement(name = "textureDEPTH", type = ProfileCGImpl.TechniqueImpl.PassImpl.TextureDEPTHImpl.class),
                @XmlElement(name = "texture1D_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.Texture1DEnableImpl.class),
                @XmlElement(name = "texture2D_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.Texture2DEnableImpl.class),
                @XmlElement(name = "texture3D_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.Texture3DEnableImpl.class),
                @XmlElement(name = "textureCUBE_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.TextureCUBEEnableImpl.class),
                @XmlElement(name = "textureRECT_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.TextureRECTEnableImpl.class),
                @XmlElement(name = "textureDEPTH_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.TextureDEPTHEnableImpl.class),
                @XmlElement(name = "texture_env_color", type = ProfileCGImpl.TechniqueImpl.PassImpl.TextureEnvColorImpl.class),
                @XmlElement(name = "texture_env_mode", type = ProfileCGImpl.TechniqueImpl.PassImpl.TextureEnvModeImpl.class),
                @XmlElement(name = "clip_plane", type = ProfileCGImpl.TechniqueImpl.PassImpl.ClipPlaneImpl.class),
                @XmlElement(name = "clip_plane_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.ClipPlaneEnableImpl.class),
                @XmlElement(name = "blend_color", type = ProfileCGImpl.TechniqueImpl.PassImpl.BlendColorImpl.class),
                @XmlElement(name = "clear_color", type = ProfileCGImpl.TechniqueImpl.PassImpl.ClearColorImpl.class),
                @XmlElement(name = "clear_stencil", type = ProfileCGImpl.TechniqueImpl.PassImpl.ClearStencilImpl.class),
                @XmlElement(name = "clear_depth", type = ProfileCGImpl.TechniqueImpl.PassImpl.ClearDepthImpl.class),
                @XmlElement(name = "color_mask", type = ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaskImpl.class),
                @XmlElement(name = "depth_bounds", type = ProfileCGImpl.TechniqueImpl.PassImpl.DepthBoundsImpl.class),
                @XmlElement(name = "depth_mask", type = ProfileCGImpl.TechniqueImpl.PassImpl.DepthMaskImpl.class),
                @XmlElement(name = "depth_range", type = ProfileCGImpl.TechniqueImpl.PassImpl.DepthRangeImpl.class),
                @XmlElement(name = "fog_density", type = ProfileCGImpl.TechniqueImpl.PassImpl.FogDensityImpl.class),
                @XmlElement(name = "fog_start", type = ProfileCGImpl.TechniqueImpl.PassImpl.FogStartImpl.class),
                @XmlElement(name = "fog_end", type = ProfileCGImpl.TechniqueImpl.PassImpl.FogEndImpl.class),
                @XmlElement(name = "fog_color", type = ProfileCGImpl.TechniqueImpl.PassImpl.FogColorImpl.class),
                @XmlElement(name = "light_model_ambient", type = ProfileCGImpl.TechniqueImpl.PassImpl.LightModelAmbientImpl.class),
                @XmlElement(name = "lighting_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.LightingEnableImpl.class),
                @XmlElement(name = "line_stipple", type = ProfileCGImpl.TechniqueImpl.PassImpl.LineStippleImpl.class),
                @XmlElement(name = "line_width", type = ProfileCGImpl.TechniqueImpl.PassImpl.LineWidthImpl.class),
                @XmlElement(name = "material_ambient", type = ProfileCGImpl.TechniqueImpl.PassImpl.MaterialAmbientImpl.class),
                @XmlElement(name = "material_diffuse", type = ProfileCGImpl.TechniqueImpl.PassImpl.MaterialDiffuseImpl.class),
                @XmlElement(name = "material_emission", type = ProfileCGImpl.TechniqueImpl.PassImpl.MaterialEmissionImpl.class),
                @XmlElement(name = "material_shininess", type = ProfileCGImpl.TechniqueImpl.PassImpl.MaterialShininessImpl.class),
                @XmlElement(name = "material_specular", type = ProfileCGImpl.TechniqueImpl.PassImpl.MaterialSpecularImpl.class),
                @XmlElement(name = "model_view_matrix", type = ProfileCGImpl.TechniqueImpl.PassImpl.ModelViewMatrixImpl.class),
                @XmlElement(name = "point_distance_attenuation", type = ProfileCGImpl.TechniqueImpl.PassImpl.PointDistanceAttenuationImpl.class),
                @XmlElement(name = "point_fade_threshold_size", type = ProfileCGImpl.TechniqueImpl.PassImpl.PointFadeThresholdSizeImpl.class),
                @XmlElement(name = "point_size", type = ProfileCGImpl.TechniqueImpl.PassImpl.PointSizeImpl.class),
                @XmlElement(name = "point_size_min", type = ProfileCGImpl.TechniqueImpl.PassImpl.PointSizeMinImpl.class),
                @XmlElement(name = "point_size_max", type = ProfileCGImpl.TechniqueImpl.PassImpl.PointSizeMaxImpl.class),
                @XmlElement(name = "polygon_offset", type = ProfileCGImpl.TechniqueImpl.PassImpl.PolygonOffsetImpl.class),
                @XmlElement(name = "projection_matrix", type = ProfileCGImpl.TechniqueImpl.PassImpl.ProjectionMatrixImpl.class),
                @XmlElement(name = "scissor", type = ProfileCGImpl.TechniqueImpl.PassImpl.ScissorImpl.class),
                @XmlElement(name = "stencil_mask", type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskImpl.class),
                @XmlElement(name = "alpha_test_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.AlphaTestEnableImpl.class),
                @XmlElement(name = "auto_normal_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.AutoNormalEnableImpl.class),
                @XmlElement(name = "blend_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.BlendEnableImpl.class),
                @XmlElement(name = "color_logic_op_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.ColorLogicOpEnableImpl.class),
                @XmlElement(name = "color_material_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialEnableImpl.class),
                @XmlElement(name = "cull_face_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.CullFaceEnableImpl.class),
                @XmlElement(name = "depth_bounds_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.DepthBoundsEnableImpl.class),
                @XmlElement(name = "depth_clamp_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.DepthClampEnableImpl.class),
                @XmlElement(name = "depth_test_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.DepthTestEnableImpl.class),
                @XmlElement(name = "dither_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.DitherEnableImpl.class),
                @XmlElement(name = "fog_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.FogEnableImpl.class),
                @XmlElement(name = "light_model_local_viewer_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.LightModelLocalViewerEnableImpl.class),
                @XmlElement(name = "light_model_two_side_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.LightModelTwoSideEnableImpl.class),
                @XmlElement(name = "line_smooth_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.LineSmoothEnableImpl.class),
                @XmlElement(name = "line_stipple_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.LineStippleEnableImpl.class),
                @XmlElement(name = "logic_op_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.LogicOpEnableImpl.class),
                @XmlElement(name = "multisample_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.MultisampleEnableImpl.class),
                @XmlElement(name = "normalize_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.NormalizeEnableImpl.class),
                @XmlElement(name = "point_smooth_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.PointSmoothEnableImpl.class),
                @XmlElement(name = "polygon_offset_fill_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.PolygonOffsetFillEnableImpl.class),
                @XmlElement(name = "polygon_offset_line_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.PolygonOffsetLineEnableImpl.class),
                @XmlElement(name = "polygon_offset_point_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.PolygonOffsetPointEnableImpl.class),
                @XmlElement(name = "polygon_smooth_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.PolygonSmoothEnableImpl.class),
                @XmlElement(name = "polygon_stipple_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.PolygonStippleEnableImpl.class),
                @XmlElement(name = "rescale_normal_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.RescaleNormalEnableImpl.class),
                @XmlElement(name = "sample_alpha_to_coverage_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.SampleAlphaToCoverageEnableImpl.class),
                @XmlElement(name = "sample_alpha_to_one_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.SampleAlphaToOneEnableImpl.class),
                @XmlElement(name = "sample_coverage_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.SampleCoverageEnableImpl.class),
                @XmlElement(name = "scissor_test_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.ScissorTestEnableImpl.class),
                @XmlElement(name = "stencil_test_enable", type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilTestEnableImpl.class),
                @XmlElement(name = "gl_hook_abstract"),
                @XmlElement(name = "shader", type = ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.class)
            })
            protected List<Object> alphaFuncsAndBlendFuncsAndBlendFuncSeparates;
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

            public List<FxColortargetCommon> getColorTargets() {
                if (colorTargets == null) {
                    colorTargets = new ArrayList<FxColortargetCommon>();
                }
                return this.colorTargets;
            }

            public List<FxDepthtargetCommon> getDepthTargets() {
                if (depthTargets == null) {
                    depthTargets = new ArrayList<FxDepthtargetCommon>();
                }
                return this.depthTargets;
            }

            public List<FxStenciltargetCommon> getStencilTargets() {
                if (stencilTargets == null) {
                    stencilTargets = new ArrayList<FxStenciltargetCommon>();
                }
                return this.stencilTargets;
            }

            public List<FxClearcolorCommon> getColorClears() {
                if (colorClears == null) {
                    colorClears = new ArrayList<FxClearcolorCommon>();
                }
                return this.colorClears;
            }

            public List<FxCleardepthCommon> getDepthClears() {
                if (depthClears == null) {
                    depthClears = new ArrayList<FxCleardepthCommon>();
                }
                return this.depthClears;
            }

            public List<FxClearstencilCommon> getStencilClears() {
                if (stencilClears == null) {
                    stencilClears = new ArrayList<FxClearstencilCommon>();
                }
                return this.stencilClears;
            }

            public String getDraw() {
                return draw;
            }

            public void setDraw(String value) {
                this.draw = value;
            }

            public List<Object> getAlphaFuncsAndBlendFuncsAndBlendFuncSeparates() {
                if (alphaFuncsAndBlendFuncsAndBlendFuncSeparates == null) {
                    alphaFuncsAndBlendFuncsAndBlendFuncSeparates = new ArrayList<Object>();
                }
                return this.alphaFuncsAndBlendFuncsAndBlendFuncSeparates;
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
            public static class AlphaFuncImpl implements ProfileCG.Technique.Pass.AlphaFunc
            {

                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.FuncImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.FuncImpl func;
                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.ValueImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.ValueImpl value;

                public ProfileCG.Technique.Pass.AlphaFunc.Func getFunc() {
                    return func;
                }

                public void setFunc(ProfileCG.Technique.Pass.AlphaFunc.Func value) {
                    this.func = ((ProfileCGImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.FuncImpl) value);
                }

                public ProfileCG.Technique.Pass.AlphaFunc.Value getValue() {
                    return value;
                }

                public void setValue(ProfileCG.Technique.Pass.AlphaFunc.Value value) {
                    this.value = ((ProfileCGImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.ValueImpl) value);
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class FuncImpl
                    implements ProfileCG.Technique.Pass.AlphaFunc.Func
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
                    implements ProfileCG.Technique.Pass.AlphaFunc.Value
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
            public static class AlphaTestEnableImpl implements ProfileCG.Technique.Pass.AlphaTestEnable
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
            public static class AutoNormalEnableImpl implements ProfileCG.Technique.Pass.AutoNormalEnable
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
            public static class BlendColorImpl implements ProfileCG.Technique.Pass.BlendColor
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
            public static class BlendEnableImpl implements ProfileCG.Technique.Pass.BlendEnable
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
            public static class BlendEquationImpl implements ProfileCG.Technique.Pass.BlendEquation
            {

                @XmlAttribute(name = "value")
                protected GlBlendEquationType value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public GlBlendEquationType getValue() {
                    if (value == null) {
                        return GlBlendEquationType.FUNC_ADD;
                    } else {
                        return value;
                    }
                }

                public void setValue(GlBlendEquationType value) {
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
                "rgb",
                "alpha"
            })
            public static class BlendEquationSeparateImpl implements ProfileCG.Technique.Pass.BlendEquationSeparate
            {

                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationSeparateImpl.RgbImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationSeparateImpl.RgbImpl rgb;
                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationSeparateImpl.AlphaImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationSeparateImpl.AlphaImpl alpha;

                public ProfileCG.Technique.Pass.BlendEquationSeparate.Rgb getRgb() {
                    return rgb;
                }

                public void setRgb(ProfileCG.Technique.Pass.BlendEquationSeparate.Rgb value) {
                    this.rgb = ((ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationSeparateImpl.RgbImpl) value);
                }

                public ProfileCG.Technique.Pass.BlendEquationSeparate.Alpha getAlpha() {
                    return alpha;
                }

                public void setAlpha(ProfileCG.Technique.Pass.BlendEquationSeparate.Alpha value) {
                    this.alpha = ((ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationSeparateImpl.AlphaImpl) value);
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class AlphaImpl
                    implements ProfileCG.Technique.Pass.BlendEquationSeparate.Alpha
                {

                    @XmlAttribute(name = "value")
                    protected GlBlendEquationType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlBlendEquationType getValue() {
                        if (value == null) {
                            return GlBlendEquationType.FUNC_ADD;
                        } else {
                            return value;
                        }
                    }

                    public void setValue(GlBlendEquationType value) {
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
                public static class RgbImpl
                    implements ProfileCG.Technique.Pass.BlendEquationSeparate.Rgb
                {

                    @XmlAttribute(name = "value")
                    protected GlBlendEquationType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlBlendEquationType getValue() {
                        if (value == null) {
                            return GlBlendEquationType.FUNC_ADD;
                        } else {
                            return value;
                        }
                    }

                    public void setValue(GlBlendEquationType value) {
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
            @XmlType(name = "", propOrder = {
                "src",
                "dest"
            })
            public static class BlendFuncImpl implements ProfileCG.Technique.Pass.BlendFunc
            {

                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncImpl.SrcImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncImpl.SrcImpl src;
                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncImpl.DestImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncImpl.DestImpl dest;

                public ProfileCG.Technique.Pass.BlendFunc.Src getSrc() {
                    return src;
                }

                public void setSrc(ProfileCG.Technique.Pass.BlendFunc.Src value) {
                    this.src = ((ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncImpl.SrcImpl) value);
                }

                public ProfileCG.Technique.Pass.BlendFunc.Dest getDest() {
                    return dest;
                }

                public void setDest(ProfileCG.Technique.Pass.BlendFunc.Dest value) {
                    this.dest = ((ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncImpl.DestImpl) value);
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class DestImpl
                    implements ProfileCG.Technique.Pass.BlendFunc.Dest
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
                    implements ProfileCG.Technique.Pass.BlendFunc.Src
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
            @XmlType(name = "", propOrder = {
                "srcRgb",
                "destRgb",
                "srcAlpha",
                "destAlpha"
            })
            public static class BlendFuncSeparateImpl implements ProfileCG.Technique.Pass.BlendFuncSeparate
            {

                @XmlElement(name = "src_rgb", required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.SrcRgbImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.SrcRgbImpl srcRgb;
                @XmlElement(name = "dest_rgb", required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.DestRgbImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.DestRgbImpl destRgb;
                @XmlElement(name = "src_alpha", required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.SrcAlphaImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.SrcAlphaImpl srcAlpha;
                @XmlElement(name = "dest_alpha", required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.DestAlphaImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.DestAlphaImpl destAlpha;

                public ProfileCG.Technique.Pass.BlendFuncSeparate.SrcRgb getSrcRgb() {
                    return srcRgb;
                }

                public void setSrcRgb(ProfileCG.Technique.Pass.BlendFuncSeparate.SrcRgb value) {
                    this.srcRgb = ((ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.SrcRgbImpl) value);
                }

                public ProfileCG.Technique.Pass.BlendFuncSeparate.DestRgb getDestRgb() {
                    return destRgb;
                }

                public void setDestRgb(ProfileCG.Technique.Pass.BlendFuncSeparate.DestRgb value) {
                    this.destRgb = ((ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.DestRgbImpl) value);
                }

                public ProfileCG.Technique.Pass.BlendFuncSeparate.SrcAlpha getSrcAlpha() {
                    return srcAlpha;
                }

                public void setSrcAlpha(ProfileCG.Technique.Pass.BlendFuncSeparate.SrcAlpha value) {
                    this.srcAlpha = ((ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.SrcAlphaImpl) value);
                }

                public ProfileCG.Technique.Pass.BlendFuncSeparate.DestAlpha getDestAlpha() {
                    return destAlpha;
                }

                public void setDestAlpha(ProfileCG.Technique.Pass.BlendFuncSeparate.DestAlpha value) {
                    this.destAlpha = ((ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.DestAlphaImpl) value);
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class DestAlphaImpl
                    implements ProfileCG.Technique.Pass.BlendFuncSeparate.DestAlpha
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
                public static class DestRgbImpl
                    implements ProfileCG.Technique.Pass.BlendFuncSeparate.DestRgb
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
                public static class SrcAlphaImpl
                    implements ProfileCG.Technique.Pass.BlendFuncSeparate.SrcAlpha
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

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class SrcRgbImpl
                    implements ProfileCG.Technique.Pass.BlendFuncSeparate.SrcRgb
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
            public static class ClearColorImpl implements ProfileCG.Technique.Pass.ClearColor
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
            public static class ClearDepthImpl implements ProfileCG.Technique.Pass.ClearDepth
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
            public static class ClearStencilImpl implements ProfileCG.Technique.Pass.ClearStencil
            {

                @XmlAttribute(name = "value")
                protected Long value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public long getValue() {
                    if (value == null) {
                        return  0L;
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
            @XmlType(name = "")
            public static class ClipPlaneEnableImpl implements ProfileCG.Technique.Pass.ClipPlaneEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index")
                protected BigInteger index;

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

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ClipPlaneImpl implements ProfileCG.Technique.Pass.ClipPlane
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index")
                protected BigInteger index;

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

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ColorLogicOpEnableImpl implements ProfileCG.Technique.Pass.ColorLogicOpEnable
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
            public static class ColorMaskImpl implements ProfileCG.Technique.Pass.ColorMask
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
            public static class ColorMaterialEnableImpl implements ProfileCG.Technique.Pass.ColorMaterialEnable
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
            @XmlType(name = "", propOrder = {
                "face",
                "mode"
            })
            public static class ColorMaterialImpl implements ProfileCG.Technique.Pass.ColorMaterial
            {

                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialImpl.FaceImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialImpl.FaceImpl face;
                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialImpl.ModeImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialImpl.ModeImpl mode;

                public ProfileCG.Technique.Pass.ColorMaterial.Face getFace() {
                    return face;
                }

                public void setFace(ProfileCG.Technique.Pass.ColorMaterial.Face value) {
                    this.face = ((ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialImpl.FaceImpl) value);
                }

                public ProfileCG.Technique.Pass.ColorMaterial.Mode getMode() {
                    return mode;
                }

                public void setMode(ProfileCG.Technique.Pass.ColorMaterial.Mode value) {
                    this.mode = ((ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialImpl.ModeImpl) value);
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class FaceImpl
                    implements ProfileCG.Technique.Pass.ColorMaterial.Face
                {

                    @XmlAttribute(name = "value")
                    protected GlFaceType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlFaceType getValue() {
                        if (value == null) {
                            return GlFaceType.FRONT_AND_BACK;
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
                public static class ModeImpl
                    implements ProfileCG.Technique.Pass.ColorMaterial.Mode
                {

                    @XmlAttribute(name = "value")
                    protected GlMaterialType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlMaterialType getValue() {
                        if (value == null) {
                            return GlMaterialType.AMBIENT_AND_DIFFUSE;
                        } else {
                            return value;
                        }
                    }

                    public void setValue(GlMaterialType value) {
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
            public static class CullFaceEnableImpl implements ProfileCG.Technique.Pass.CullFaceEnable
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
            public static class CullFaceImpl implements ProfileCG.Technique.Pass.CullFace
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
            public static class DepthBoundsEnableImpl implements ProfileCG.Technique.Pass.DepthBoundsEnable
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
            public static class DepthBoundsImpl implements ProfileCG.Technique.Pass.DepthBounds
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
            public static class DepthClampEnableImpl implements ProfileCG.Technique.Pass.DepthClampEnable
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
            public static class DepthFuncImpl implements ProfileCG.Technique.Pass.DepthFunc
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
            public static class DepthMaskImpl implements ProfileCG.Technique.Pass.DepthMask
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
            public static class DepthRangeImpl implements ProfileCG.Technique.Pass.DepthRange
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
            public static class DepthTestEnableImpl implements ProfileCG.Technique.Pass.DepthTestEnable
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
            public static class DitherEnableImpl implements ProfileCG.Technique.Pass.DitherEnable
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
            public static class FogColorImpl implements ProfileCG.Technique.Pass.FogColor
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
            public static class FogCoordSrcImpl implements ProfileCG.Technique.Pass.FogCoordSrc
            {

                @XmlAttribute(name = "value")
                protected GlFogCoordSrcType value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public GlFogCoordSrcType getValue() {
                    if (value == null) {
                        return GlFogCoordSrcType.FOG_COORDINATE;
                    } else {
                        return value;
                    }
                }

                public void setValue(GlFogCoordSrcType value) {
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
            public static class FogDensityImpl implements ProfileCG.Technique.Pass.FogDensity
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
            public static class FogEnableImpl implements ProfileCG.Technique.Pass.FogEnable
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
            public static class FogEndImpl implements ProfileCG.Technique.Pass.FogEnd
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
            public static class FogModeImpl implements ProfileCG.Technique.Pass.FogMode
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
            public static class FogStartImpl implements ProfileCG.Technique.Pass.FogStart
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
            public static class FrontFaceImpl implements ProfileCG.Technique.Pass.FrontFace
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
            public static class LightAmbientImpl implements ProfileCG.Technique.Pass.LightAmbient
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected BigInteger index;

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

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightConstantAttenuationImpl implements ProfileCG.Technique.Pass.LightConstantAttenuation
            {

                @XmlAttribute(name = "value")
                protected Double value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected BigInteger index;

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

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightDiffuseImpl implements ProfileCG.Technique.Pass.LightDiffuse
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected BigInteger index;

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

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightEnableImpl implements ProfileCG.Technique.Pass.LightEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected BigInteger index;

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

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightLinearAttenuationImpl implements ProfileCG.Technique.Pass.LightLinearAttenuation
            {

                @XmlAttribute(name = "value")
                protected Double value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected BigInteger index;

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

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightModelAmbientImpl implements ProfileCG.Technique.Pass.LightModelAmbient
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
            public static class LightModelColorControlImpl implements ProfileCG.Technique.Pass.LightModelColorControl
            {

                @XmlAttribute(name = "value")
                protected GlLightModelColorControlType value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;

                public GlLightModelColorControlType getValue() {
                    if (value == null) {
                        return GlLightModelColorControlType.SINGLE_COLOR;
                    } else {
                        return value;
                    }
                }

                public void setValue(GlLightModelColorControlType value) {
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
            public static class LightModelLocalViewerEnableImpl implements ProfileCG.Technique.Pass.LightModelLocalViewerEnable
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
            public static class LightModelTwoSideEnableImpl implements ProfileCG.Technique.Pass.LightModelTwoSideEnable
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
            public static class LightPositionImpl implements ProfileCG.Technique.Pass.LightPosition
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected BigInteger index;

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

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightQuadraticAttenuationImpl implements ProfileCG.Technique.Pass.LightQuadraticAttenuation
            {

                @XmlAttribute(name = "value")
                protected Double value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected BigInteger index;

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

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightSpecularImpl implements ProfileCG.Technique.Pass.LightSpecular
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected BigInteger index;

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

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightSpotCutoffImpl implements ProfileCG.Technique.Pass.LightSpotCutoff
            {

                @XmlAttribute(name = "value")
                protected Double value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected BigInteger index;

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

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightSpotDirectionImpl implements ProfileCG.Technique.Pass.LightSpotDirection
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected BigInteger index;

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

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightSpotExponentImpl implements ProfileCG.Technique.Pass.LightSpotExponent
            {

                @XmlAttribute(name = "value")
                protected Double value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index", required = true)
                protected BigInteger index;

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

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LightingEnableImpl implements ProfileCG.Technique.Pass.LightingEnable
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
            public static class LineSmoothEnableImpl implements ProfileCG.Technique.Pass.LineSmoothEnable
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
            public static class LineStippleEnableImpl implements ProfileCG.Technique.Pass.LineStippleEnable
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
            public static class LineStippleImpl implements ProfileCG.Technique.Pass.LineStipple
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
            public static class LineWidthImpl implements ProfileCG.Technique.Pass.LineWidth
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
            public static class LogicOpEnableImpl implements ProfileCG.Technique.Pass.LogicOpEnable
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
            public static class LogicOpImpl implements ProfileCG.Technique.Pass.LogicOp
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
            public static class MaterialAmbientImpl implements ProfileCG.Technique.Pass.MaterialAmbient
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
            public static class MaterialDiffuseImpl implements ProfileCG.Technique.Pass.MaterialDiffuse
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
            public static class MaterialEmissionImpl implements ProfileCG.Technique.Pass.MaterialEmission
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
            public static class MaterialShininessImpl implements ProfileCG.Technique.Pass.MaterialShininess
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
            public static class MaterialSpecularImpl implements ProfileCG.Technique.Pass.MaterialSpecular
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
            public static class ModelViewMatrixImpl implements ProfileCG.Technique.Pass.ModelViewMatrix
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
            public static class MultisampleEnableImpl implements ProfileCG.Technique.Pass.MultisampleEnable
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
            public static class NormalizeEnableImpl implements ProfileCG.Technique.Pass.NormalizeEnable
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
            public static class PointDistanceAttenuationImpl implements ProfileCG.Technique.Pass.PointDistanceAttenuation
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
            public static class PointFadeThresholdSizeImpl implements ProfileCG.Technique.Pass.PointFadeThresholdSize
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
            public static class PointSizeImpl implements ProfileCG.Technique.Pass.PointSize
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
            public static class PointSizeMaxImpl implements ProfileCG.Technique.Pass.PointSizeMax
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
            public static class PointSizeMinImpl implements ProfileCG.Technique.Pass.PointSizeMin
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
            public static class PointSmoothEnableImpl implements ProfileCG.Technique.Pass.PointSmoothEnable
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
                "face",
                "mode"
            })
            public static class PolygonModeImpl implements ProfileCG.Technique.Pass.PolygonMode
            {

                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.PolygonModeImpl.FaceImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.PolygonModeImpl.FaceImpl face;
                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.PolygonModeImpl.ModeImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.PolygonModeImpl.ModeImpl mode;

                public ProfileCG.Technique.Pass.PolygonMode.Face getFace() {
                    return face;
                }

                public void setFace(ProfileCG.Technique.Pass.PolygonMode.Face value) {
                    this.face = ((ProfileCGImpl.TechniqueImpl.PassImpl.PolygonModeImpl.FaceImpl) value);
                }

                public ProfileCG.Technique.Pass.PolygonMode.Mode getMode() {
                    return mode;
                }

                public void setMode(ProfileCG.Technique.Pass.PolygonMode.Mode value) {
                    this.mode = ((ProfileCGImpl.TechniqueImpl.PassImpl.PolygonModeImpl.ModeImpl) value);
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class FaceImpl
                    implements ProfileCG.Technique.Pass.PolygonMode.Face
                {

                    @XmlAttribute(name = "value")
                    protected GlFaceType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlFaceType getValue() {
                        if (value == null) {
                            return GlFaceType.FRONT_AND_BACK;
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
                public static class ModeImpl
                    implements ProfileCG.Technique.Pass.PolygonMode.Mode
                {

                    @XmlAttribute(name = "value")
                    protected GlPolygonModeType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlPolygonModeType getValue() {
                        if (value == null) {
                            return GlPolygonModeType.FILL;
                        } else {
                            return value;
                        }
                    }

                    public void setValue(GlPolygonModeType value) {
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
            public static class PolygonOffsetFillEnableImpl implements ProfileCG.Technique.Pass.PolygonOffsetFillEnable
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
            public static class PolygonOffsetImpl implements ProfileCG.Technique.Pass.PolygonOffset
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
            public static class PolygonOffsetLineEnableImpl implements ProfileCG.Technique.Pass.PolygonOffsetLineEnable
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
            public static class PolygonOffsetPointEnableImpl implements ProfileCG.Technique.Pass.PolygonOffsetPointEnable
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
            public static class PolygonSmoothEnableImpl implements ProfileCG.Technique.Pass.PolygonSmoothEnable
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
            public static class PolygonStippleEnableImpl implements ProfileCG.Technique.Pass.PolygonStippleEnable
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
            public static class ProjectionMatrixImpl implements ProfileCG.Technique.Pass.ProjectionMatrix
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
            public static class RescaleNormalEnableImpl implements ProfileCG.Technique.Pass.RescaleNormalEnable
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
            public static class SampleAlphaToCoverageEnableImpl implements ProfileCG.Technique.Pass.SampleAlphaToCoverageEnable
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
            public static class SampleAlphaToOneEnableImpl implements ProfileCG.Technique.Pass.SampleAlphaToOneEnable
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
            public static class SampleCoverageEnableImpl implements ProfileCG.Technique.Pass.SampleCoverageEnable
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
            public static class ScissorImpl implements ProfileCG.Technique.Pass.Scissor
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
            public static class ScissorTestEnableImpl implements ProfileCG.Technique.Pass.ScissorTestEnable
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
            public static class ShadeModelImpl implements ProfileCG.Technique.Pass.ShadeModel
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
                "annotates",
                "compilerTarget",
                "compilerOptions",
                "name",
                "binds"
            })
            public static class ShaderImpl implements ProfileCG.Technique.Pass.Shader
            {

                @XmlElement(name = "annotate", type = FxAnnotateCommonImpl.class)
                protected List<FxAnnotateCommon> annotates;
                @XmlElement(name = "compiler_target", type = ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.CompilerTargetImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.CompilerTargetImpl compilerTarget;
                @XmlElement(name = "compiler_options")
                protected String compilerOptions;
                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.NameImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.NameImpl name;
                @XmlElement(name = "bind", type = ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.BindImpl.class)
                protected List<ProfileCG.Technique.Pass.Shader.Bind> binds;
                @XmlAttribute(name = "stage")
                protected CgPipelineStage stage;

                public List<FxAnnotateCommon> getAnnotates() {
                    if (annotates == null) {
                        annotates = new ArrayList<FxAnnotateCommon>();
                    }
                    return this.annotates;
                }

                public ProfileCG.Technique.Pass.Shader.CompilerTarget getCompilerTarget() {
                    return compilerTarget;
                }

                public void setCompilerTarget(ProfileCG.Technique.Pass.Shader.CompilerTarget value) {
                    this.compilerTarget = ((ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.CompilerTargetImpl) value);
                }

                public String getCompilerOptions() {
                    return compilerOptions;
                }

                public void setCompilerOptions(String value) {
                    this.compilerOptions = value;
                }

                public ProfileCG.Technique.Pass.Shader.Name getName() {
                    return name;
                }

                public void setName(ProfileCG.Technique.Pass.Shader.Name value) {
                    this.name = ((ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.NameImpl) value);
                }

                public List<ProfileCG.Technique.Pass.Shader.Bind> getBinds() {
                    if (binds == null) {
                        binds = new ArrayList<ProfileCG.Technique.Pass.Shader.Bind>();
                    }
                    return this.binds;
                }

                public CgPipelineStage getStage() {
                    return stage;
                }

                public void setStage(CgPipelineStage value) {
                    this.stage = value;
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "param",
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
                public static class BindImpl
                    implements ProfileCG.Technique.Pass.Shader.Bind
                {

                    @XmlElement(type = ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.BindImpl.ParamImpl.class)
                    protected ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.BindImpl.ParamImpl param;
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
                    @XmlAttribute(name = "symbol", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String symbol;

                    public ProfileCG.Technique.Pass.Shader.Bind.Param getParam() {
                        return param;
                    }

                    public void setParam(ProfileCG.Technique.Pass.Shader.Bind.Param value) {
                        this.param = ((ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.BindImpl.ParamImpl) value);
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

                    public String getSymbol() {
                        return symbol;
                    }

                    public void setSymbol(String value) {
                        this.symbol = value;
                    }

                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class ParamImpl
                        implements ProfileCG.Technique.Pass.Shader.Bind.Param
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

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class CompilerTargetImpl
                    implements ProfileCG.Technique.Pass.Shader.CompilerTarget
                {

                    @XmlValue
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NMTOKEN")
                    protected String value;

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }

                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class NameImpl
                    implements ProfileCG.Technique.Pass.Shader.Name
                {

                    @XmlValue
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String value;
                    @XmlAttribute(name = "source")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String source;

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }

                    public String getSource() {
                        return source;
                    }

                    public void setSource(String value) {
                        this.source = value;
                    }

                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "func",
                "ref",
                "mask"
            })
            public static class StencilFuncImpl implements ProfileCG.Technique.Pass.StencilFunc
            {

                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl.FuncImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl.FuncImpl func;
                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl.RefImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl.RefImpl ref;
                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl.MaskImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl.MaskImpl mask;

                public ProfileCG.Technique.Pass.StencilFunc.Func getFunc() {
                    return func;
                }

                public void setFunc(ProfileCG.Technique.Pass.StencilFunc.Func value) {
                    this.func = ((ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl.FuncImpl) value);
                }

                public ProfileCG.Technique.Pass.StencilFunc.Ref getRef() {
                    return ref;
                }

                public void setRef(ProfileCG.Technique.Pass.StencilFunc.Ref value) {
                    this.ref = ((ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl.RefImpl) value);
                }

                public ProfileCG.Technique.Pass.StencilFunc.Mask getMask() {
                    return mask;
                }

                public void setMask(ProfileCG.Technique.Pass.StencilFunc.Mask value) {
                    this.mask = ((ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl.MaskImpl) value);
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class FuncImpl
                    implements ProfileCG.Technique.Pass.StencilFunc.Func
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
                    implements ProfileCG.Technique.Pass.StencilFunc.Mask
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
                    implements ProfileCG.Technique.Pass.StencilFunc.Ref
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
            @XmlType(name = "", propOrder = {
                "front",
                "back",
                "ref",
                "mask"
            })
            public static class StencilFuncSeparateImpl implements ProfileCG.Technique.Pass.StencilFuncSeparate
            {

                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.FrontImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.FrontImpl front;
                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.BackImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.BackImpl back;
                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.RefImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.RefImpl ref;
                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.MaskImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.MaskImpl mask;

                public ProfileCG.Technique.Pass.StencilFuncSeparate.Front getFront() {
                    return front;
                }

                public void setFront(ProfileCG.Technique.Pass.StencilFuncSeparate.Front value) {
                    this.front = ((ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.FrontImpl) value);
                }

                public ProfileCG.Technique.Pass.StencilFuncSeparate.Back getBack() {
                    return back;
                }

                public void setBack(ProfileCG.Technique.Pass.StencilFuncSeparate.Back value) {
                    this.back = ((ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.BackImpl) value);
                }

                public ProfileCG.Technique.Pass.StencilFuncSeparate.Ref getRef() {
                    return ref;
                }

                public void setRef(ProfileCG.Technique.Pass.StencilFuncSeparate.Ref value) {
                    this.ref = ((ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.RefImpl) value);
                }

                public ProfileCG.Technique.Pass.StencilFuncSeparate.Mask getMask() {
                    return mask;
                }

                public void setMask(ProfileCG.Technique.Pass.StencilFuncSeparate.Mask value) {
                    this.mask = ((ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.MaskImpl) value);
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class BackImpl
                    implements ProfileCG.Technique.Pass.StencilFuncSeparate.Back
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
                public static class FrontImpl
                    implements ProfileCG.Technique.Pass.StencilFuncSeparate.Front
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
                    implements ProfileCG.Technique.Pass.StencilFuncSeparate.Mask
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
                    implements ProfileCG.Technique.Pass.StencilFuncSeparate.Ref
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
            public static class StencilMaskImpl implements ProfileCG.Technique.Pass.StencilMask
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
                "face",
                "mask"
            })
            public static class StencilMaskSeparateImpl implements ProfileCG.Technique.Pass.StencilMaskSeparate
            {

                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskSeparateImpl.FaceImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskSeparateImpl.FaceImpl face;
                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskSeparateImpl.MaskImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskSeparateImpl.MaskImpl mask;

                public ProfileCG.Technique.Pass.StencilMaskSeparate.Face getFace() {
                    return face;
                }

                public void setFace(ProfileCG.Technique.Pass.StencilMaskSeparate.Face value) {
                    this.face = ((ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskSeparateImpl.FaceImpl) value);
                }

                public ProfileCG.Technique.Pass.StencilMaskSeparate.Mask getMask() {
                    return mask;
                }

                public void setMask(ProfileCG.Technique.Pass.StencilMaskSeparate.Mask value) {
                    this.mask = ((ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskSeparateImpl.MaskImpl) value);
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class FaceImpl
                    implements ProfileCG.Technique.Pass.StencilMaskSeparate.Face
                {

                    @XmlAttribute(name = "value")
                    protected GlFaceType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlFaceType getValue() {
                        if (value == null) {
                            return GlFaceType.FRONT_AND_BACK;
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
                public static class MaskImpl
                    implements ProfileCG.Technique.Pass.StencilMaskSeparate.Mask
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

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "fail",
                "zfail",
                "zpass"
            })
            public static class StencilOpImpl implements ProfileCG.Technique.Pass.StencilOp
            {

                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl.FailImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl.FailImpl fail;
                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZfailImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZfailImpl zfail;
                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZpassImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZpassImpl zpass;

                public ProfileCG.Technique.Pass.StencilOp.Fail getFail() {
                    return fail;
                }

                public void setFail(ProfileCG.Technique.Pass.StencilOp.Fail value) {
                    this.fail = ((ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl.FailImpl) value);
                }

                public ProfileCG.Technique.Pass.StencilOp.Zfail getZfail() {
                    return zfail;
                }

                public void setZfail(ProfileCG.Technique.Pass.StencilOp.Zfail value) {
                    this.zfail = ((ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZfailImpl) value);
                }

                public ProfileCG.Technique.Pass.StencilOp.Zpass getZpass() {
                    return zpass;
                }

                public void setZpass(ProfileCG.Technique.Pass.StencilOp.Zpass value) {
                    this.zpass = ((ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZpassImpl) value);
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class FailImpl
                    implements ProfileCG.Technique.Pass.StencilOp.Fail
                {

                    @XmlAttribute(name = "value")
                    protected GlStencilOpType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlStencilOpType getValue() {
                        if (value == null) {
                            return GlStencilOpType.KEEP;
                        } else {
                            return value;
                        }
                    }

                    public void setValue(GlStencilOpType value) {
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
                    implements ProfileCG.Technique.Pass.StencilOp.Zfail
                {

                    @XmlAttribute(name = "value")
                    protected GlStencilOpType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlStencilOpType getValue() {
                        if (value == null) {
                            return GlStencilOpType.KEEP;
                        } else {
                            return value;
                        }
                    }

                    public void setValue(GlStencilOpType value) {
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
                    implements ProfileCG.Technique.Pass.StencilOp.Zpass
                {

                    @XmlAttribute(name = "value")
                    protected GlStencilOpType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlStencilOpType getValue() {
                        if (value == null) {
                            return GlStencilOpType.KEEP;
                        } else {
                            return value;
                        }
                    }

                    public void setValue(GlStencilOpType value) {
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
            @XmlType(name = "", propOrder = {
                "face",
                "fail",
                "zfail",
                "zpass"
            })
            public static class StencilOpSeparateImpl implements ProfileCG.Technique.Pass.StencilOpSeparate
            {

                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.FaceImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.FaceImpl face;
                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.FailImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.FailImpl fail;
                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.ZfailImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.ZfailImpl zfail;
                @XmlElement(required = true, type = ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.ZpassImpl.class)
                protected ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.ZpassImpl zpass;

                public ProfileCG.Technique.Pass.StencilOpSeparate.Face getFace() {
                    return face;
                }

                public void setFace(ProfileCG.Technique.Pass.StencilOpSeparate.Face value) {
                    this.face = ((ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.FaceImpl) value);
                }

                public ProfileCG.Technique.Pass.StencilOpSeparate.Fail getFail() {
                    return fail;
                }

                public void setFail(ProfileCG.Technique.Pass.StencilOpSeparate.Fail value) {
                    this.fail = ((ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.FailImpl) value);
                }

                public ProfileCG.Technique.Pass.StencilOpSeparate.Zfail getZfail() {
                    return zfail;
                }

                public void setZfail(ProfileCG.Technique.Pass.StencilOpSeparate.Zfail value) {
                    this.zfail = ((ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.ZfailImpl) value);
                }

                public ProfileCG.Technique.Pass.StencilOpSeparate.Zpass getZpass() {
                    return zpass;
                }

                public void setZpass(ProfileCG.Technique.Pass.StencilOpSeparate.Zpass value) {
                    this.zpass = ((ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.ZpassImpl) value);
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class FaceImpl
                    implements ProfileCG.Technique.Pass.StencilOpSeparate.Face
                {

                    @XmlAttribute(name = "value")
                    protected GlFaceType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlFaceType getValue() {
                        if (value == null) {
                            return GlFaceType.FRONT_AND_BACK;
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
                public static class FailImpl
                    implements ProfileCG.Technique.Pass.StencilOpSeparate.Fail
                {

                    @XmlAttribute(name = "value")
                    protected GlStencilOpType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlStencilOpType getValue() {
                        if (value == null) {
                            return GlStencilOpType.KEEP;
                        } else {
                            return value;
                        }
                    }

                    public void setValue(GlStencilOpType value) {
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
                    implements ProfileCG.Technique.Pass.StencilOpSeparate.Zfail
                {

                    @XmlAttribute(name = "value")
                    protected GlStencilOpType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlStencilOpType getValue() {
                        if (value == null) {
                            return GlStencilOpType.KEEP;
                        } else {
                            return value;
                        }
                    }

                    public void setValue(GlStencilOpType value) {
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
                    implements ProfileCG.Technique.Pass.StencilOpSeparate.Zpass
                {

                    @XmlAttribute(name = "value")
                    protected GlStencilOpType value;
                    @XmlAttribute(name = "param")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String param;

                    public GlStencilOpType getValue() {
                        if (value == null) {
                            return GlStencilOpType.KEEP;
                        } else {
                            return value;
                        }
                    }

                    public void setValue(GlStencilOpType value) {
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
            public static class StencilTestEnableImpl implements ProfileCG.Technique.Pass.StencilTestEnable
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
            public static class Texture1DEnableImpl implements ProfileCG.Technique.Pass.Texture1DEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index")
                protected BigInteger index;

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

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "param",
                "value"
            })
            public static class Texture1DImpl implements ProfileCG.Technique.Pass.Texture1D
            {

                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlElement(type = GlSampler1DImpl.class)
                protected GlSampler1DImpl value;
                @XmlAttribute(name = "index", required = true)
                protected BigInteger index;

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

                public GlSampler1D getValue() {
                    return value;
                }

                public void setValue(GlSampler1D value) {
                    this.value = ((GlSampler1DImpl) value);
                }

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Texture2DEnableImpl implements ProfileCG.Technique.Pass.Texture2DEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index")
                protected BigInteger index;

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

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "param",
                "value"
            })
            public static class Texture2DImpl implements ProfileCG.Technique.Pass.Texture2D
            {

                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlElement(type = GlSampler2DImpl.class)
                protected GlSampler2DImpl value;
                @XmlAttribute(name = "index", required = true)
                protected BigInteger index;

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

                public GlSampler2D getValue() {
                    return value;
                }

                public void setValue(GlSampler2D value) {
                    this.value = ((GlSampler2DImpl) value);
                }

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Texture3DEnableImpl implements ProfileCG.Technique.Pass.Texture3DEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index")
                protected BigInteger index;

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

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "param",
                "value"
            })
            public static class Texture3DImpl implements ProfileCG.Technique.Pass.Texture3D
            {

                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlElement(type = GlSampler3DImpl.class)
                protected GlSampler3DImpl value;
                @XmlAttribute(name = "index", required = true)
                protected BigInteger index;

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

                public GlSampler3D getValue() {
                    return value;
                }

                public void setValue(GlSampler3D value) {
                    this.value = ((GlSampler3DImpl) value);
                }

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TextureCUBEEnableImpl implements ProfileCG.Technique.Pass.TextureCUBEEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index")
                protected BigInteger index;

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

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "param",
                "value"
            })
            public static class TextureCUBEImpl implements ProfileCG.Technique.Pass.TextureCUBE
            {

                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlElement(type = GlSamplerCUBEImpl.class)
                protected GlSamplerCUBEImpl value;
                @XmlAttribute(name = "index", required = true)
                protected BigInteger index;

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

                public GlSamplerCUBE getValue() {
                    return value;
                }

                public void setValue(GlSamplerCUBE value) {
                    this.value = ((GlSamplerCUBEImpl) value);
                }

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TextureDEPTHEnableImpl implements ProfileCG.Technique.Pass.TextureDEPTHEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index")
                protected BigInteger index;

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

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "param",
                "value"
            })
            public static class TextureDEPTHImpl implements ProfileCG.Technique.Pass.TextureDEPTH
            {

                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlElement(type = GlSamplerDEPTHImpl.class)
                protected GlSamplerDEPTHImpl value;
                @XmlAttribute(name = "index", required = true)
                protected BigInteger index;

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

                public GlSamplerDEPTH getValue() {
                    return value;
                }

                public void setValue(GlSamplerDEPTH value) {
                    this.value = ((GlSamplerDEPTHImpl) value);
                }

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TextureEnvColorImpl implements ProfileCG.Technique.Pass.TextureEnvColor
            {

                @XmlAttribute(name = "value")
                protected List<Double> values;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index")
                protected BigInteger index;

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

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TextureEnvModeImpl implements ProfileCG.Technique.Pass.TextureEnvMode
            {

                @XmlAttribute(name = "value")
                protected String value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index")
                protected BigInteger index;

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TextureRECTEnableImpl implements ProfileCG.Technique.Pass.TextureRECTEnable
            {

                @XmlAttribute(name = "value")
                protected Boolean value;
                @XmlAttribute(name = "param")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlAttribute(name = "index")
                protected BigInteger index;

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

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "param",
                "value"
            })
            public static class TextureRECTImpl implements ProfileCG.Technique.Pass.TextureRECT
            {

                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String param;
                @XmlElement(type = GlSamplerRECTImpl.class)
                protected GlSamplerRECTImpl value;
                @XmlAttribute(name = "index", required = true)
                protected BigInteger index;

                public String getParam() {
                    return param;
                }

                public void setParam(String value) {
                    this.param = value;
                }

                public GlSamplerRECT getValue() {
                    return value;
                }

                public void setValue(GlSamplerRECT value) {
                    this.value = ((GlSamplerRECTImpl) value);
                }

                public BigInteger getIndex() {
                    return index;
                }

                public void setIndex(BigInteger value) {
                    this.index = value;
                }

            }

        }

    }

}
