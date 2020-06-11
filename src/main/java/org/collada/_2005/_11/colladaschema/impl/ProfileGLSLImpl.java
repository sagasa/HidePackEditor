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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.Asset;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.FxAnnotateCommon;
import org.collada._2005._11.colladaschema.FxClearcolorCommon;
import org.collada._2005._11.colladaschema.FxCleardepthCommon;
import org.collada._2005._11.colladaschema.FxClearstencilCommon;
import org.collada._2005._11.colladaschema.FxColortargetCommon;
import org.collada._2005._11.colladaschema.FxDepthtargetCommon;
import org.collada._2005._11.colladaschema.FxStenciltargetCommon;
import org.collada._2005._11.colladaschema.GlSampler1D;
import org.collada._2005._11.colladaschema.GlSampler2D;
import org.collada._2005._11.colladaschema.GlSampler3D;
import org.collada._2005._11.colladaschema.GlSamplerCUBE;
import org.collada._2005._11.colladaschema.GlSamplerDEPTH;
import org.collada._2005._11.colladaschema.GlSamplerRECT;
import org.collada._2005._11.colladaschema.GlslPipelineStage;
import org.collada._2005._11.colladaschema.GlslSurfaceType;
import org.collada._2005._11.colladaschema.ProfileGLSL;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asset",
    "codesAndIncludes",
    "imagesAndNewparams",
    "techniques",
    "extras"
})
public class ProfileGLSLImpl implements ProfileGLSL
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
        @XmlElement(name = "newparam", type = GlslNewparamImpl.class)
    })
    protected List<Object> imagesAndNewparams;
    @XmlElement(name = "technique", required = true, type = ProfileGLSLImpl.TechniqueImpl.class)
    protected List<ProfileGLSL.Technique> techniques;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

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

    public List<ProfileGLSL.Technique> getTechniques() {
        if (techniques == null) {
            techniques = new ArrayList<ProfileGLSL.Technique>();
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

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "annotates",
        "codesAndIncludes",
        "imagesAndNewparamsAndSetparams",
        "passes",
        "extras"
    })
    public static class TechniqueImpl
        implements ProfileGLSL.Technique
    {

        @XmlElement(name = "annotate", type = FxAnnotateCommonImpl.class)
        protected List<FxAnnotateCommon> annotates;
        @XmlElements({
            @XmlElement(name = "code", type = FxCodeProfileImpl.class),
            @XmlElement(name = "include", type = FxIncludeCommonImpl.class)
        })
        protected List<Object> codesAndIncludes;
        @XmlElements({
            @XmlElement(name = "image", type = ImageImpl.class),
            @XmlElement(name = "newparam", type = GlslNewparamImpl.class),
            @XmlElement(name = "setparam", type = GlslSetparamImpl.class)
        })
        protected List<Object> imagesAndNewparamsAndSetparams;
        @XmlElement(name = "pass", required = true, type = ProfileGLSLImpl.TechniqueImpl.PassImpl.class)
        protected List<ProfileGLSL.Technique.Pass> passes;
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

        public List<ProfileGLSL.Technique.Pass> getPasses() {
            if (passes == null) {
                passes = new ArrayList<ProfileGLSL.Technique.Pass>();
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
            implements ProfileGLSL.Technique.Pass
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
                @XmlElement(name = "alpha_func", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.class),
                @XmlElement(name = "blend_func", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncImpl.class),
                @XmlElement(name = "blend_func_separate", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.class),
                @XmlElement(name = "blend_equation", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationImpl.class),
                @XmlElement(name = "blend_equation_separate", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationSeparateImpl.class),
                @XmlElement(name = "color_material", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialImpl.class),
                @XmlElement(name = "cull_face", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.CullFaceImpl.class),
                @XmlElement(name = "depth_func", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.DepthFuncImpl.class),
                @XmlElement(name = "fog_mode", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.FogModeImpl.class),
                @XmlElement(name = "fog_coord_src", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.FogCoordSrcImpl.class),
                @XmlElement(name = "front_face", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.FrontFaceImpl.class),
                @XmlElement(name = "light_model_color_control", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LightModelColorControlImpl.class),
                @XmlElement(name = "logic_op", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LogicOpImpl.class),
                @XmlElement(name = "polygon_mode", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.PolygonModeImpl.class),
                @XmlElement(name = "shade_model", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.ShadeModelImpl.class),
                @XmlElement(name = "stencil_func", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl.class),
                @XmlElement(name = "stencil_op", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl.class),
                @XmlElement(name = "stencil_func_separate", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.class),
                @XmlElement(name = "stencil_op_separate", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.class),
                @XmlElement(name = "stencil_mask_separate", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskSeparateImpl.class),
                @XmlElement(name = "light_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LightEnableImpl.class),
                @XmlElement(name = "light_ambient", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LightAmbientImpl.class),
                @XmlElement(name = "light_diffuse", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LightDiffuseImpl.class),
                @XmlElement(name = "light_specular", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LightSpecularImpl.class),
                @XmlElement(name = "light_position", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LightPositionImpl.class),
                @XmlElement(name = "light_constant_attenuation", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LightConstantAttenuationImpl.class),
                @XmlElement(name = "light_linear_attenuation", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LightLinearAttenuationImpl.class),
                @XmlElement(name = "light_quadratic_attenuation", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LightQuadraticAttenuationImpl.class),
                @XmlElement(name = "light_spot_cutoff", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LightSpotCutoffImpl.class),
                @XmlElement(name = "light_spot_direction", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LightSpotDirectionImpl.class),
                @XmlElement(name = "light_spot_exponent", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LightSpotExponentImpl.class),
                @XmlElement(name = "texture1D", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.Texture1DImpl.class),
                @XmlElement(name = "texture2D", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.Texture2DImpl.class),
                @XmlElement(name = "texture3D", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.Texture3DImpl.class),
                @XmlElement(name = "textureCUBE", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.TextureCUBEImpl.class),
                @XmlElement(name = "textureRECT", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.TextureRECTImpl.class),
                @XmlElement(name = "textureDEPTH", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.TextureDEPTHImpl.class),
                @XmlElement(name = "texture1D_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.Texture1DEnableImpl.class),
                @XmlElement(name = "texture2D_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.Texture2DEnableImpl.class),
                @XmlElement(name = "texture3D_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.Texture3DEnableImpl.class),
                @XmlElement(name = "textureCUBE_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.TextureCUBEEnableImpl.class),
                @XmlElement(name = "textureRECT_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.TextureRECTEnableImpl.class),
                @XmlElement(name = "textureDEPTH_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.TextureDEPTHEnableImpl.class),
                @XmlElement(name = "texture_env_color", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.TextureEnvColorImpl.class),
                @XmlElement(name = "texture_env_mode", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.TextureEnvModeImpl.class),
                @XmlElement(name = "clip_plane", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.ClipPlaneImpl.class),
                @XmlElement(name = "clip_plane_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.ClipPlaneEnableImpl.class),
                @XmlElement(name = "blend_color", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.BlendColorImpl.class),
                @XmlElement(name = "clear_color", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.ClearColorImpl.class),
                @XmlElement(name = "clear_stencil", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.ClearStencilImpl.class),
                @XmlElement(name = "clear_depth", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.ClearDepthImpl.class),
                @XmlElement(name = "color_mask", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaskImpl.class),
                @XmlElement(name = "depth_bounds", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.DepthBoundsImpl.class),
                @XmlElement(name = "depth_mask", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.DepthMaskImpl.class),
                @XmlElement(name = "depth_range", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.DepthRangeImpl.class),
                @XmlElement(name = "fog_density", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.FogDensityImpl.class),
                @XmlElement(name = "fog_start", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.FogStartImpl.class),
                @XmlElement(name = "fog_end", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.FogEndImpl.class),
                @XmlElement(name = "fog_color", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.FogColorImpl.class),
                @XmlElement(name = "light_model_ambient", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LightModelAmbientImpl.class),
                @XmlElement(name = "lighting_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LightingEnableImpl.class),
                @XmlElement(name = "line_stipple", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LineStippleImpl.class),
                @XmlElement(name = "line_width", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LineWidthImpl.class),
                @XmlElement(name = "material_ambient", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.MaterialAmbientImpl.class),
                @XmlElement(name = "material_diffuse", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.MaterialDiffuseImpl.class),
                @XmlElement(name = "material_emission", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.MaterialEmissionImpl.class),
                @XmlElement(name = "material_shininess", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.MaterialShininessImpl.class),
                @XmlElement(name = "material_specular", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.MaterialSpecularImpl.class),
                @XmlElement(name = "model_view_matrix", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.ModelViewMatrixImpl.class),
                @XmlElement(name = "point_distance_attenuation", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.PointDistanceAttenuationImpl.class),
                @XmlElement(name = "point_fade_threshold_size", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.PointFadeThresholdSizeImpl.class),
                @XmlElement(name = "point_size", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.PointSizeImpl.class),
                @XmlElement(name = "point_size_min", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.PointSizeMinImpl.class),
                @XmlElement(name = "point_size_max", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.PointSizeMaxImpl.class),
                @XmlElement(name = "polygon_offset", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.PolygonOffsetImpl.class),
                @XmlElement(name = "projection_matrix", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.ProjectionMatrixImpl.class),
                @XmlElement(name = "scissor", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.ScissorImpl.class),
                @XmlElement(name = "stencil_mask", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskImpl.class),
                @XmlElement(name = "alpha_test_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.AlphaTestEnableImpl.class),
                @XmlElement(name = "auto_normal_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.AutoNormalEnableImpl.class),
                @XmlElement(name = "blend_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.BlendEnableImpl.class),
                @XmlElement(name = "color_logic_op_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.ColorLogicOpEnableImpl.class),
                @XmlElement(name = "color_material_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialEnableImpl.class),
                @XmlElement(name = "cull_face_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.CullFaceEnableImpl.class),
                @XmlElement(name = "depth_bounds_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.DepthBoundsEnableImpl.class),
                @XmlElement(name = "depth_clamp_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.DepthClampEnableImpl.class),
                @XmlElement(name = "depth_test_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.DepthTestEnableImpl.class),
                @XmlElement(name = "dither_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.DitherEnableImpl.class),
                @XmlElement(name = "fog_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.FogEnableImpl.class),
                @XmlElement(name = "light_model_local_viewer_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LightModelLocalViewerEnableImpl.class),
                @XmlElement(name = "light_model_two_side_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LightModelTwoSideEnableImpl.class),
                @XmlElement(name = "line_smooth_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LineSmoothEnableImpl.class),
                @XmlElement(name = "line_stipple_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LineStippleEnableImpl.class),
                @XmlElement(name = "logic_op_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.LogicOpEnableImpl.class),
                @XmlElement(name = "multisample_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.MultisampleEnableImpl.class),
                @XmlElement(name = "normalize_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.NormalizeEnableImpl.class),
                @XmlElement(name = "point_smooth_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.PointSmoothEnableImpl.class),
                @XmlElement(name = "polygon_offset_fill_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.PolygonOffsetFillEnableImpl.class),
                @XmlElement(name = "polygon_offset_line_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.PolygonOffsetLineEnableImpl.class),
                @XmlElement(name = "polygon_offset_point_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.PolygonOffsetPointEnableImpl.class),
                @XmlElement(name = "polygon_smooth_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.PolygonSmoothEnableImpl.class),
                @XmlElement(name = "polygon_stipple_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.PolygonStippleEnableImpl.class),
                @XmlElement(name = "rescale_normal_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.RescaleNormalEnableImpl.class),
                @XmlElement(name = "sample_alpha_to_coverage_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.SampleAlphaToCoverageEnableImpl.class),
                @XmlElement(name = "sample_alpha_to_one_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.SampleAlphaToOneEnableImpl.class),
                @XmlElement(name = "sample_coverage_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.SampleCoverageEnableImpl.class),
                @XmlElement(name = "scissor_test_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.ScissorTestEnableImpl.class),
                @XmlElement(name = "stencil_test_enable", type = org.collada._2005._11.colladaschema.impl.ProfileCGImpl.TechniqueImpl.PassImpl.StencilTestEnableImpl.class),
                @XmlElement(name = "gl_hook_abstract"),
                @XmlElement(name = "shader", type = ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.class)
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
                "annotates",
                "compilerTarget",
                "compilerOptions",
                "name",
                "binds"
            })
            public static class ShaderImpl implements ProfileGLSL.Technique.Pass.Shader
            {

                @XmlElement(name = "annotate", type = FxAnnotateCommonImpl.class)
                protected List<FxAnnotateCommon> annotates;
                @XmlElement(name = "compiler_target", type = ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.CompilerTargetImpl.class)
                protected ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.CompilerTargetImpl compilerTarget;
                @XmlElement(name = "compiler_options")
                protected String compilerOptions;
                @XmlElement(required = true, type = ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.NameImpl.class)
                protected ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.NameImpl name;
                @XmlElement(name = "bind", type = ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.BindImpl.class)
                protected List<ProfileGLSL.Technique.Pass.Shader.Bind> binds;
                @XmlAttribute(name = "stage")
                protected GlslPipelineStage stage;

                public List<FxAnnotateCommon> getAnnotates() {
                    if (annotates == null) {
                        annotates = new ArrayList<FxAnnotateCommon>();
                    }
                    return this.annotates;
                }

                public ProfileGLSL.Technique.Pass.Shader.CompilerTarget getCompilerTarget() {
                    return compilerTarget;
                }

                public void setCompilerTarget(ProfileGLSL.Technique.Pass.Shader.CompilerTarget value) {
                    this.compilerTarget = ((ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.CompilerTargetImpl) value);
                }

                public String getCompilerOptions() {
                    return compilerOptions;
                }

                public void setCompilerOptions(String value) {
                    this.compilerOptions = value;
                }

                public ProfileGLSL.Technique.Pass.Shader.Name getName() {
                    return name;
                }

                public void setName(ProfileGLSL.Technique.Pass.Shader.Name value) {
                    this.name = ((ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.NameImpl) value);
                }

                public List<ProfileGLSL.Technique.Pass.Shader.Bind> getBinds() {
                    if (binds == null) {
                        binds = new ArrayList<ProfileGLSL.Technique.Pass.Shader.Bind>();
                    }
                    return this.binds;
                }

                public GlslPipelineStage getStage() {
                    return stage;
                }

                public void setStage(GlslPipelineStage value) {
                    this.stage = value;
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "param",
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
                public static class BindImpl
                    implements ProfileGLSL.Technique.Pass.Shader.Bind
                {

                    @XmlElement(type = ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.BindImpl.ParamImpl.class)
                    protected ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.BindImpl.ParamImpl param;
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
                    @XmlAttribute(name = "symbol", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String symbol;

                    public ProfileGLSL.Technique.Pass.Shader.Bind.Param getParam() {
                        return param;
                    }

                    public void setParam(ProfileGLSL.Technique.Pass.Shader.Bind.Param value) {
                        this.param = ((ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.BindImpl.ParamImpl) value);
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

                    public String getSymbol() {
                        return symbol;
                    }

                    public void setSymbol(String value) {
                        this.symbol = value;
                    }

                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class ParamImpl
                        implements ProfileGLSL.Technique.Pass.Shader.Bind.Param
                    {

                        @XmlAttribute(name = "ref", required = true)
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
                    implements ProfileGLSL.Technique.Pass.Shader.CompilerTarget
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
                    implements ProfileGLSL.Technique.Pass.Shader.Name
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

        }

    }

}
