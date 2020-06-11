//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;

import java.math.BigInteger;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.collada._2005._11.colladaschema.impl.AccessorImpl;
import org.collada._2005._11.colladaschema.impl.AnimationClipImpl;
import org.collada._2005._11.colladaschema.impl.AnimationImpl;
import org.collada._2005._11.colladaschema.impl.AssetImpl;
import org.collada._2005._11.colladaschema.impl.BindMaterialImpl;
import org.collada._2005._11.colladaschema.impl.BoolArrayImpl;
import org.collada._2005._11.colladaschema.impl.BoxImpl;
import org.collada._2005._11.colladaschema.impl.COLLADAImpl;
import org.collada._2005._11.colladaschema.impl.CameraImpl;
import org.collada._2005._11.colladaschema.impl.CapsuleImpl;
import org.collada._2005._11.colladaschema.impl.CgConnectParamImpl;
import org.collada._2005._11.colladaschema.impl.CgNewarrayTypeImpl;
import org.collada._2005._11.colladaschema.impl.CgNewparamImpl;
import org.collada._2005._11.colladaschema.impl.CgSampler1DImpl;
import org.collada._2005._11.colladaschema.impl.CgSampler2DImpl;
import org.collada._2005._11.colladaschema.impl.CgSampler3DImpl;
import org.collada._2005._11.colladaschema.impl.CgSamplerCUBEImpl;
import org.collada._2005._11.colladaschema.impl.CgSamplerDEPTHImpl;
import org.collada._2005._11.colladaschema.impl.CgSamplerRECTImpl;
import org.collada._2005._11.colladaschema.impl.CgSetarrayTypeImpl;
import org.collada._2005._11.colladaschema.impl.CgSetparamImpl;
import org.collada._2005._11.colladaschema.impl.CgSetparamSimpleImpl;
import org.collada._2005._11.colladaschema.impl.CgSetuserTypeImpl;
import org.collada._2005._11.colladaschema.impl.CgSurfaceTypeImpl;
import org.collada._2005._11.colladaschema.impl.ChannelImpl;
import org.collada._2005._11.colladaschema.impl.CommonColorOrTextureTypeImpl;
import org.collada._2005._11.colladaschema.impl.CommonFloatOrParamTypeImpl;
import org.collada._2005._11.colladaschema.impl.CommonNewparamTypeImpl;
import org.collada._2005._11.colladaschema.impl.CommonTransparentTypeImpl;
import org.collada._2005._11.colladaschema.impl.ControllerImpl;
import org.collada._2005._11.colladaschema.impl.ConvexMeshImpl;
import org.collada._2005._11.colladaschema.impl.CylinderImpl;
import org.collada._2005._11.colladaschema.impl.EffectImpl;
import org.collada._2005._11.colladaschema.impl.EllipsoidImpl;
import org.collada._2005._11.colladaschema.impl.ExtraImpl;
import org.collada._2005._11.colladaschema.impl.FloatArrayImpl;
import org.collada._2005._11.colladaschema.impl.ForceFieldImpl;
import org.collada._2005._11.colladaschema.impl.FxAnnotateCommonImpl;
import org.collada._2005._11.colladaschema.impl.FxClearcolorCommonImpl;
import org.collada._2005._11.colladaschema.impl.FxCleardepthCommonImpl;
import org.collada._2005._11.colladaschema.impl.FxClearstencilCommonImpl;
import org.collada._2005._11.colladaschema.impl.FxCodeProfileImpl;
import org.collada._2005._11.colladaschema.impl.FxColortargetCommonImpl;
import org.collada._2005._11.colladaschema.impl.FxDepthtargetCommonImpl;
import org.collada._2005._11.colladaschema.impl.FxIncludeCommonImpl;
import org.collada._2005._11.colladaschema.impl.FxNewparamCommonImpl;
import org.collada._2005._11.colladaschema.impl.FxSampler1DCommonImpl;
import org.collada._2005._11.colladaschema.impl.FxSampler2DCommonImpl;
import org.collada._2005._11.colladaschema.impl.FxSampler3DCommonImpl;
import org.collada._2005._11.colladaschema.impl.FxSamplerCUBECommonImpl;
import org.collada._2005._11.colladaschema.impl.FxSamplerDEPTHCommonImpl;
import org.collada._2005._11.colladaschema.impl.FxSamplerRECTCommonImpl;
import org.collada._2005._11.colladaschema.impl.FxStenciltargetCommonImpl;
import org.collada._2005._11.colladaschema.impl.FxSurfaceCommonImpl;
import org.collada._2005._11.colladaschema.impl.FxSurfaceFormatHintCommonImpl;
import org.collada._2005._11.colladaschema.impl.FxSurfaceInitCubeCommonImpl;
import org.collada._2005._11.colladaschema.impl.FxSurfaceInitFromCommonImpl;
import org.collada._2005._11.colladaschema.impl.FxSurfaceInitPlanarCommonImpl;
import org.collada._2005._11.colladaschema.impl.FxSurfaceInitVolumeCommonImpl;
import org.collada._2005._11.colladaschema.impl.GeometryImpl;
import org.collada._2005._11.colladaschema.impl.GlSampler1DImpl;
import org.collada._2005._11.colladaschema.impl.GlSampler2DImpl;
import org.collada._2005._11.colladaschema.impl.GlSampler3DImpl;
import org.collada._2005._11.colladaschema.impl.GlSamplerCUBEImpl;
import org.collada._2005._11.colladaschema.impl.GlSamplerDEPTHImpl;
import org.collada._2005._11.colladaschema.impl.GlSamplerRECTImpl;
import org.collada._2005._11.colladaschema.impl.GlesNewparamImpl;
import org.collada._2005._11.colladaschema.impl.GlesSamplerStateImpl;
import org.collada._2005._11.colladaschema.impl.GlesTexcombinerArgumentAlphaTypeImpl;
import org.collada._2005._11.colladaschema.impl.GlesTexcombinerArgumentRGBTypeImpl;
import org.collada._2005._11.colladaschema.impl.GlesTexcombinerCommandAlphaTypeImpl;
import org.collada._2005._11.colladaschema.impl.GlesTexcombinerCommandRGBTypeImpl;
import org.collada._2005._11.colladaschema.impl.GlesTexcombinerCommandTypeImpl;
import org.collada._2005._11.colladaschema.impl.GlesTexenvCommandTypeImpl;
import org.collada._2005._11.colladaschema.impl.GlesTextureConstantTypeImpl;
import org.collada._2005._11.colladaschema.impl.GlesTexturePipelineImpl;
import org.collada._2005._11.colladaschema.impl.GlesTextureUnitImpl;
import org.collada._2005._11.colladaschema.impl.GlslNewarrayTypeImpl;
import org.collada._2005._11.colladaschema.impl.GlslNewparamImpl;
import org.collada._2005._11.colladaschema.impl.GlslSetarrayTypeImpl;
import org.collada._2005._11.colladaschema.impl.GlslSetparamImpl;
import org.collada._2005._11.colladaschema.impl.GlslSetparamSimpleImpl;
import org.collada._2005._11.colladaschema.impl.GlslSurfaceTypeImpl;
import org.collada._2005._11.colladaschema.impl.IDREFArrayImpl;
import org.collada._2005._11.colladaschema.impl.ImageImpl;
import org.collada._2005._11.colladaschema.impl.InputGlobalImpl;
import org.collada._2005._11.colladaschema.impl.InputLocalImpl;
import org.collada._2005._11.colladaschema.impl.InputLocalOffsetImpl;
import org.collada._2005._11.colladaschema.impl.InstanceControllerImpl;
import org.collada._2005._11.colladaschema.impl.InstanceEffectImpl;
import org.collada._2005._11.colladaschema.impl.InstanceGeometryImpl;
import org.collada._2005._11.colladaschema.impl.InstanceMaterialImpl;
import org.collada._2005._11.colladaschema.impl.InstancePhysicsModelImpl;
import org.collada._2005._11.colladaschema.impl.InstanceRigidBodyImpl;
import org.collada._2005._11.colladaschema.impl.InstanceRigidConstraintImpl;
import org.collada._2005._11.colladaschema.impl.InstanceWithExtraImpl;
import org.collada._2005._11.colladaschema.impl.IntArrayImpl;
import org.collada._2005._11.colladaschema.impl.LibraryAnimationClipsImpl;
import org.collada._2005._11.colladaschema.impl.LibraryAnimationsImpl;
import org.collada._2005._11.colladaschema.impl.LibraryCamerasImpl;
import org.collada._2005._11.colladaschema.impl.LibraryControllersImpl;
import org.collada._2005._11.colladaschema.impl.LibraryEffectsImpl;
import org.collada._2005._11.colladaschema.impl.LibraryForceFieldsImpl;
import org.collada._2005._11.colladaschema.impl.LibraryGeometriesImpl;
import org.collada._2005._11.colladaschema.impl.LibraryImagesImpl;
import org.collada._2005._11.colladaschema.impl.LibraryLightsImpl;
import org.collada._2005._11.colladaschema.impl.LibraryMaterialsImpl;
import org.collada._2005._11.colladaschema.impl.LibraryNodesImpl;
import org.collada._2005._11.colladaschema.impl.LibraryPhysicsMaterialsImpl;
import org.collada._2005._11.colladaschema.impl.LibraryPhysicsModelsImpl;
import org.collada._2005._11.colladaschema.impl.LibraryPhysicsScenesImpl;
import org.collada._2005._11.colladaschema.impl.LibraryVisualScenesImpl;
import org.collada._2005._11.colladaschema.impl.LightImpl;
import org.collada._2005._11.colladaschema.impl.LinesImpl;
import org.collada._2005._11.colladaschema.impl.LinestripsImpl;
import org.collada._2005._11.colladaschema.impl.LookatImpl;
import org.collada._2005._11.colladaschema.impl.MaterialImpl;
import org.collada._2005._11.colladaschema.impl.MatrixImpl;
import org.collada._2005._11.colladaschema.impl.MeshImpl;
import org.collada._2005._11.colladaschema.impl.MorphImpl;
import org.collada._2005._11.colladaschema.impl.NameArrayImpl;
import org.collada._2005._11.colladaschema.impl.NodeImpl;
import org.collada._2005._11.colladaschema.impl.PhysicsMaterialImpl;
import org.collada._2005._11.colladaschema.impl.PhysicsModelImpl;
import org.collada._2005._11.colladaschema.impl.PhysicsSceneImpl;
import org.collada._2005._11.colladaschema.impl.PlaneImpl;
import org.collada._2005._11.colladaschema.impl.PolygonsImpl;
import org.collada._2005._11.colladaschema.impl.PolylistImpl;
import org.collada._2005._11.colladaschema.impl.ProfileCGImpl;
import org.collada._2005._11.colladaschema.impl.ProfileCOMMONImpl;
import org.collada._2005._11.colladaschema.impl.ProfileGLESImpl;
import org.collada._2005._11.colladaschema.impl.ProfileGLSLImpl;
import org.collada._2005._11.colladaschema.impl.RigidBodyImpl;
import org.collada._2005._11.colladaschema.impl.RigidConstraintImpl;
import org.collada._2005._11.colladaschema.impl.RotateImpl;
import org.collada._2005._11.colladaschema.impl.SamplerImpl;
import org.collada._2005._11.colladaschema.impl.SkewImpl;
import org.collada._2005._11.colladaschema.impl.SkinImpl;
import org.collada._2005._11.colladaschema.impl.SourceImpl;
import org.collada._2005._11.colladaschema.impl.SphereImpl;
import org.collada._2005._11.colladaschema.impl.SplineImpl;
import org.collada._2005._11.colladaschema.impl.TaperedCapsuleImpl;
import org.collada._2005._11.colladaschema.impl.TaperedCylinderImpl;
import org.collada._2005._11.colladaschema.impl.TargetableFloat3Impl;
import org.collada._2005._11.colladaschema.impl.TargetableFloatImpl;
import org.collada._2005._11.colladaschema.impl.TrianglesImpl;
import org.collada._2005._11.colladaschema.impl.TrifansImpl;
import org.collada._2005._11.colladaschema.impl.TristripsImpl;
import org.collada._2005._11.colladaschema.impl.VerticesImpl;
import org.collada._2005._11.colladaschema.impl.VisualSceneImpl;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.collada._2005._11.colladaschema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static Void _useJAXBProperties = null;
    private final static QName _Translate_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "translate");
    private final static QName _Scale_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "scale");
    private final static QName _ProfileGLSL_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "profile_GLSL");
    private final static QName _InstancePhysicsMaterial_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "instance_physics_material");
    private final static QName _ProfileGLES_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "profile_GLES");
    private final static QName _P_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "p");
    private final static QName _FxProfileAbstract_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fx_profile_abstract");
    private final static QName _InstanceForceField_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "instance_force_field");
    private final static QName _InstanceCamera_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "instance_camera");
    private final static QName _ProfileCG_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "profile_CG");
    private final static QName _GlHookAbstract_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "gl_hook_abstract");
    private final static QName _ProfileCOMMON_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "profile_COMMON");
    private final static QName _InstanceNode_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "instance_node");
    private final static QName _InstanceLight_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "instance_light");
    private final static QName _GlslSetarrayTypeBool_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool");
    private final static QName _GlslSetarrayTypeSurface_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "surface");
    private final static QName _GlslSetarrayTypeFloat2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float2");
    private final static QName _GlslSetarrayTypeFloat3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float3");
    private final static QName _GlslSetarrayTypeFloat_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float");
    private final static QName _GlslSetarrayTypeFloat4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float4");
    private final static QName _GlslSetarrayTypeSampler1D_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "sampler1D");
    private final static QName _GlslSetarrayTypeSampler2D_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "sampler2D");
    private final static QName _GlslSetarrayTypeInt_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int");
    private final static QName _GlslSetarrayTypeSampler3D_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "sampler3D");
    private final static QName _GlslSetarrayTypeEnum_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "enum");
    private final static QName _GlslSetarrayTypeSamplerCUBE_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "samplerCUBE");
    private final static QName _GlslSetarrayTypeInt4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int4");
    private final static QName _GlslSetarrayTypeInt3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int3");
    private final static QName _GlslSetarrayTypeArray_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "array");
    private final static QName _GlslSetarrayTypeBool3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool3");
    private final static QName _GlslSetarrayTypeBool2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool2");
    private final static QName _GlslSetarrayTypeInt2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int2");
    private final static QName _GlslSetarrayTypeSamplerRECT_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "samplerRECT");
    private final static QName _GlslSetarrayTypeBool4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool4");
    private final static QName _GlslSetarrayTypeFloat3X3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float3x3");
    private final static QName _GlslSetarrayTypeSamplerDEPTH_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "samplerDEPTH");
    private final static QName _GlslSetarrayTypeFloat2X2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float2x2");
    private final static QName _GlslSetarrayTypeFloat4X4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float4x4");
    private final static QName _PolygonsPh_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "ph");
    private final static QName _PolygonsPhH_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "h");
    private final static QName _CgSetuserTypeInt3X1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int3x1");
    private final static QName _CgSetuserTypeInt3X2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int3x2");
    private final static QName _CgSetuserTypeInt3X3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int3x3");
    private final static QName _CgSetuserTypeUsertype_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "usertype");
    private final static QName _CgSetuserTypeHalf1X4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half1x4");
    private final static QName _CgSetuserTypeHalf1X3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half1x3");
    private final static QName _CgSetuserTypeHalf1X2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half1x2");
    private final static QName _CgSetuserTypeHalf2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half2");
    private final static QName _CgSetuserTypeHalf1X1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half1x1");
    private final static QName _CgSetuserTypeHalf1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half1");
    private final static QName _CgSetuserTypeFixed_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed");
    private final static QName _CgSetuserTypeHalf4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half4");
    private final static QName _CgSetuserTypeHalf3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half3");
    private final static QName _CgSetuserTypeInt3X4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int3x4");
    private final static QName _CgSetuserTypeFixed3X2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed3x2");
    private final static QName _CgSetuserTypeFixed3X1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed3x1");
    private final static QName _CgSetuserTypeFixed3X4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed3x4");
    private final static QName _CgSetuserTypeFixed3X3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed3x3");
    private final static QName _CgSetuserTypeFloat3X4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float3x4");
    private final static QName _CgSetuserTypeBool2X4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool2x4");
    private final static QName _CgSetuserTypeFloat3X2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float3x2");
    private final static QName _CgSetuserTypeFloat3X1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float3x1");
    private final static QName _CgSetuserTypeBool2X2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool2x2");
    private final static QName _CgSetuserTypeBool2X3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool2x3");
    private final static QName _CgSetuserTypeConnectParam_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "connect_param");
    private final static QName _CgSetuserTypeBool2X1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool2x1");
    private final static QName _CgSetuserTypeInt4X1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int4x1");
    private final static QName _CgSetuserTypeInt4X2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int4x2");
    private final static QName _CgSetuserTypeHalf4X2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half4x2");
    private final static QName _CgSetuserTypeHalf4X1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half4x1");
    private final static QName _CgSetuserTypeHalf4X4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half4x4");
    private final static QName _CgSetuserTypeHalf4X3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half4x3");
    private final static QName _CgSetuserTypeString_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "string");
    private final static QName _CgSetuserTypeInt4X3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int4x3");
    private final static QName _CgSetuserTypeFixed2X3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed2x3");
    private final static QName _CgSetuserTypeInt4X4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int4x4");
    private final static QName _CgSetuserTypeFixed2X2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed2x2");
    private final static QName _CgSetuserTypeFixed2X4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed2x4");
    private final static QName _CgSetuserTypeFloat4X3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float4x3");
    private final static QName _CgSetuserTypeFloat4X2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float4x2");
    private final static QName _CgSetuserTypeBool3X3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool3x3");
    private final static QName _CgSetuserTypeFloat4X1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float4x1");
    private final static QName _CgSetuserTypeFixed2X1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed2x1");
    private final static QName _CgSetuserTypeBool3X4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool3x4");
    private final static QName _CgSetuserTypeBool3X1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool3x1");
    private final static QName _CgSetuserTypeBool3X2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool3x2");
    private final static QName _CgSetuserTypeInt1X2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int1x2");
    private final static QName _CgSetuserTypeInt1X3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int1x3");
    private final static QName _CgSetuserTypeInt1X4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int1x4");
    private final static QName _CgSetuserTypeInt1X1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int1x1");
    private final static QName _CgSetuserTypeHalf3X3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half3x3");
    private final static QName _CgSetuserTypeHalf3X2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half3x2");
    private final static QName _CgSetuserTypeHalf3X1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half3x1");
    private final static QName _CgSetuserTypeFixed2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed2");
    private final static QName _CgSetuserTypeFixed3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed3");
    private final static QName _CgSetuserTypeHalf3X4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half3x4");
    private final static QName _CgSetuserTypeFixed1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed1");
    private final static QName _CgSetuserTypeFloat1X2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float1x2");
    private final static QName _CgSetuserTypeFloat1X1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float1x1");
    private final static QName _CgSetuserTypeHalf_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half");
    private final static QName _CgSetuserTypeFixed1X4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed1x4");
    private final static QName _CgSetuserTypeFixed1X3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed1x3");
    private final static QName _CgSetuserTypeInt1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int1");
    private final static QName _CgSetuserTypeBool4X4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool4x4");
    private final static QName _CgSetuserTypeBool1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool1");
    private final static QName _CgSetuserTypeBool4X2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool4x2");
    private final static QName _CgSetuserTypeFloat1X4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float1x4");
    private final static QName _CgSetuserTypeFixed1X2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed1x2");
    private final static QName _CgSetuserTypeBool4X3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool4x3");
    private final static QName _CgSetuserTypeFloat1X3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float1x3");
    private final static QName _CgSetuserTypeFixed1X1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed1x1");
    private final static QName _CgSetuserTypeBool4X1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool4x1");
    private final static QName _CgSetuserTypeFloat1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float1");
    private final static QName _CgSetuserTypeInt2X1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int2x1");
    private final static QName _CgSetuserTypeInt2X2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int2x2");
    private final static QName _CgSetuserTypeInt2X3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int2x3");
    private final static QName _CgSetuserTypeInt2X4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "int2x4");
    private final static QName _CgSetuserTypeHalf2X4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half2x4");
    private final static QName _CgSetuserTypeHalf2X3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half2x3");
    private final static QName _CgSetuserTypeHalf2X2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half2x2");
    private final static QName _CgSetuserTypeHalf2X1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "half2x1");
    private final static QName _CgSetuserTypeFloat2X1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float2x1");
    private final static QName _CgSetuserTypeFixed4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed4");
    private final static QName _CgSetuserTypeFixed4X4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed4x4");
    private final static QName _CgSetuserTypeFixed4X1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed4x1");
    private final static QName _CgSetuserTypeFixed4X3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed4x3");
    private final static QName _CgSetuserTypeFixed4X2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "fixed4x2");
    private final static QName _CgSetuserTypeFloat2X4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float2x4");
    private final static QName _CgSetuserTypeFloat2X3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "float2x3");
    private final static QName _CgSetuserTypeBool1X3_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool1x3");
    private final static QName _CgSetuserTypeBool1X4_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool1x4");
    private final static QName _CgSetuserTypeBool1X1_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool1x1");
    private final static QName _CgSetuserTypeBool1X2_QNAME = new QName("http://www.collada.org/2005/11/COLLADASchema", "bool1x2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.collada._2005._11.colladaschema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BindMaterial }
     * 
     */
    public BindMaterial createBindMaterial() {
        return new BindMaterialImpl();
    }

    /**
     * Create an instance of {@link Asset }
     * 
     */
    public Asset createAsset() {
        return new AssetImpl();
    }

    /**
     * Create an instance of {@link PhysicsMaterial }
     * 
     */
    public PhysicsMaterial createPhysicsMaterial() {
        return new PhysicsMaterialImpl();
    }

    /**
     * Create an instance of {@link Polygons }
     * 
     */
    public Polygons createPolygons() {
        return new PolygonsImpl();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new SourceImpl();
    }

    /**
     * Create an instance of {@link Morph }
     * 
     */
    public Morph createMorph() {
        return new MorphImpl();
    }

    /**
     * Create an instance of {@link Skin }
     * 
     */
    public Skin createSkin() {
        return new SkinImpl();
    }

    /**
     * Create an instance of {@link InstanceMaterial }
     * 
     */
    public InstanceMaterial createInstanceMaterial() {
        return new InstanceMaterialImpl();
    }

    /**
     * Create an instance of {@link Camera }
     * 
     */
    public Camera createCamera() {
        return new CameraImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint }
     * 
     */
    public RigidConstraint createRigidConstraint() {
        return new RigidConstraintImpl();
    }

    /**
     * Create an instance of {@link InstanceRigidBody }
     * 
     */
    public InstanceRigidBody createInstanceRigidBody() {
        return new InstanceRigidBodyImpl();
    }

    /**
     * Create an instance of {@link PhysicsScene }
     * 
     */
    public PhysicsScene createPhysicsScene() {
        return new PhysicsSceneImpl();
    }

    /**
     * Create an instance of {@link Light }
     * 
     */
    public Light createLight() {
        return new LightImpl();
    }

    /**
     * Create an instance of {@link Spline }
     * 
     */
    public Spline createSpline() {
        return new SplineImpl();
    }

    /**
     * Create an instance of {@link InstanceEffect }
     * 
     */
    public InstanceEffect createInstanceEffect() {
        return new InstanceEffectImpl();
    }

    /**
     * Create an instance of {@link RigidBody }
     * 
     */
    public RigidBody createRigidBody() {
        return new RigidBodyImpl();
    }

    /**
     * Create an instance of {@link VisualScene }
     * 
     */
    public VisualScene createVisualScene() {
        return new VisualSceneImpl();
    }

    /**
     * Create an instance of {@link COLLADA }
     * 
     */
    public COLLADA createCOLLADA() {
        return new COLLADAImpl();
    }

    /**
     * Create an instance of {@link GlesTextureUnit }
     * 
     */
    public GlesTextureUnit createGlesTextureUnit() {
        return new GlesTextureUnitImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceInitCubeCommon }
     * 
     */
    public FxSurfaceInitCubeCommon createFxSurfaceInitCubeCommon() {
        return new FxSurfaceInitCubeCommonImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceInitVolumeCommon }
     * 
     */
    public FxSurfaceInitVolumeCommon createFxSurfaceInitVolumeCommon() {
        return new FxSurfaceInitVolumeCommonImpl();
    }

    /**
     * Create an instance of {@link CommonFloatOrParamType }
     * 
     */
    public CommonFloatOrParamType createCommonFloatOrParamType() {
        return new CommonFloatOrParamTypeImpl();
    }

    /**
     * Create an instance of {@link CgSurfaceType }
     * 
     */
    public CgSurfaceType createCgSurfaceType() {
        return new CgSurfaceTypeImpl();
    }

    /**
     * Create an instance of {@link CgSurfaceType.Generator }
     * 
     */
    public CgSurfaceType.Generator createCgSurfaceTypeGenerator() {
        return new CgSurfaceTypeImpl.GeneratorImpl();
    }

    /**
     * Create an instance of {@link CommonColorOrTextureType }
     * 
     */
    public CommonColorOrTextureType createCommonColorOrTextureType() {
        return new CommonColorOrTextureTypeImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceInitPlanarCommon }
     * 
     */
    public FxSurfaceInitPlanarCommon createFxSurfaceInitPlanarCommon() {
        return new FxSurfaceInitPlanarCommonImpl();
    }

    /**
     * Create an instance of {@link GlslSurfaceType }
     * 
     */
    public GlslSurfaceType createGlslSurfaceType() {
        return new GlslSurfaceTypeImpl();
    }

    /**
     * Create an instance of {@link GlslSurfaceType.Generator }
     * 
     */
    public GlslSurfaceType.Generator createGlslSurfaceTypeGenerator() {
        return new GlslSurfaceTypeImpl.GeneratorImpl();
    }

    /**
     * Create an instance of {@link ProfileCG }
     * 
     */
    public ProfileCG createProfileCG() {
        return new ProfileCGImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique }
     * 
     */
    public ProfileCG.Technique createProfileCGTechnique() {
        return new ProfileCGImpl.TechniqueImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass }
     * 
     */
    public ProfileCG.Technique.Pass createProfileCGTechniquePass() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Shader }
     * 
     */
    public ProfileCG.Technique.Pass.Shader createProfileCGTechniquePassShader() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Shader.Bind }
     * 
     */
    public ProfileCG.Technique.Pass.Shader.Bind createProfileCGTechniquePassShaderBind() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.BindImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilMaskSeparate }
     * 
     */
    public ProfileCG.Technique.Pass.StencilMaskSeparate createProfileCGTechniquePassStencilMaskSeparate() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskSeparateImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilOpSeparate }
     * 
     */
    public ProfileCG.Technique.Pass.StencilOpSeparate createProfileCGTechniquePassStencilOpSeparate() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilFuncSeparate }
     * 
     */
    public ProfileCG.Technique.Pass.StencilFuncSeparate createProfileCGTechniquePassStencilFuncSeparate() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilOp }
     * 
     */
    public ProfileCG.Technique.Pass.StencilOp createProfileCGTechniquePassStencilOp() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilFunc }
     * 
     */
    public ProfileCG.Technique.Pass.StencilFunc createProfileCGTechniquePassStencilFunc() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PolygonMode }
     * 
     */
    public ProfileCG.Technique.Pass.PolygonMode createProfileCGTechniquePassPolygonMode() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PolygonModeImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ColorMaterial }
     * 
     */
    public ProfileCG.Technique.Pass.ColorMaterial createProfileCGTechniquePassColorMaterial() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendEquationSeparate }
     * 
     */
    public ProfileCG.Technique.Pass.BlendEquationSeparate createProfileCGTechniquePassBlendEquationSeparate() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationSeparateImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendFuncSeparate }
     * 
     */
    public ProfileCG.Technique.Pass.BlendFuncSeparate createProfileCGTechniquePassBlendFuncSeparate() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendFunc }
     * 
     */
    public ProfileCG.Technique.Pass.BlendFunc createProfileCGTechniquePassBlendFunc() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.AlphaFunc }
     * 
     */
    public ProfileCG.Technique.Pass.AlphaFunc createProfileCGTechniquePassAlphaFunc() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.AlphaFuncImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES }
     * 
     */
    public ProfileGLES createProfileGLES() {
        return new ProfileGLESImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique }
     * 
     */
    public ProfileGLES.Technique createProfileGLESTechnique() {
        return new ProfileGLESImpl.TechniqueImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass }
     * 
     */
    public ProfileGLES.Technique.Pass createProfileGLESTechniquePass() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.StencilOp }
     * 
     */
    public ProfileGLES.Technique.Pass.StencilOp createProfileGLESTechniquePassStencilOp() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.StencilFunc }
     * 
     */
    public ProfileGLES.Technique.Pass.StencilFunc createProfileGLESTechniquePassStencilFunc() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.BlendFunc }
     * 
     */
    public ProfileGLES.Technique.Pass.BlendFunc createProfileGLESTechniquePassBlendFunc() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.BlendFuncImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.AlphaFunc }
     * 
     */
    public ProfileGLES.Technique.Pass.AlphaFunc createProfileGLESTechniquePassAlphaFunc() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.AlphaFuncImpl();
    }

    /**
     * Create an instance of {@link ProfileCOMMON }
     * 
     */
    public ProfileCOMMON createProfileCOMMON() {
        return new ProfileCOMMONImpl();
    }

    /**
     * Create an instance of {@link ProfileCOMMON.Technique }
     * 
     */
    public ProfileCOMMON.Technique createProfileCOMMONTechnique() {
        return new ProfileCOMMONImpl.TechniqueImpl();
    }

    /**
     * Create an instance of {@link VisualScene.EvaluateScene }
     * 
     */
    public VisualScene.EvaluateScene createVisualSceneEvaluateScene() {
        return new VisualSceneImpl.EvaluateSceneImpl();
    }

    /**
     * Create an instance of {@link RigidBody.TechniqueCommon }
     * 
     */
    public RigidBody.TechniqueCommon createRigidBodyTechniqueCommon() {
        return new RigidBodyImpl.TechniqueCommonImpl();
    }

    /**
     * Create an instance of {@link RigidBody.TechniqueCommon.Shape }
     * 
     */
    public RigidBody.TechniqueCommon.Shape createRigidBodyTechniqueCommonShape() {
        return new RigidBodyImpl.TechniqueCommonImpl.ShapeImpl();
    }

    /**
     * Create an instance of {@link Light.TechniqueCommon }
     * 
     */
    public Light.TechniqueCommon createLightTechniqueCommon() {
        return new LightImpl.TechniqueCommonImpl();
    }

    /**
     * Create an instance of {@link InstanceRigidBody.TechniqueCommon }
     * 
     */
    public InstanceRigidBody.TechniqueCommon createInstanceRigidBodyTechniqueCommon() {
        return new InstanceRigidBodyImpl.TechniqueCommonImpl();
    }

    /**
     * Create an instance of {@link InstanceRigidBody.TechniqueCommon.Shape }
     * 
     */
    public InstanceRigidBody.TechniqueCommon.Shape createInstanceRigidBodyTechniqueCommonShape() {
        return new InstanceRigidBodyImpl.TechniqueCommonImpl.ShapeImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.TechniqueCommon }
     * 
     */
    public RigidConstraint.TechniqueCommon createRigidConstraintTechniqueCommon() {
        return new RigidConstraintImpl.TechniqueCommonImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.TechniqueCommon.Spring }
     * 
     */
    public RigidConstraint.TechniqueCommon.Spring createRigidConstraintTechniqueCommonSpring() {
        return new RigidConstraintImpl.TechniqueCommonImpl.SpringImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.TechniqueCommon.Limits }
     * 
     */
    public RigidConstraint.TechniqueCommon.Limits createRigidConstraintTechniqueCommonLimits() {
        return new RigidConstraintImpl.TechniqueCommonImpl.LimitsImpl();
    }

    /**
     * Create an instance of {@link Camera.Optics }
     * 
     */
    public Camera.Optics createCameraOptics() {
        return new CameraImpl.OpticsImpl();
    }

    /**
     * Create an instance of {@link Camera.Optics.TechniqueCommon }
     * 
     */
    public Camera.Optics.TechniqueCommon createCameraOpticsTechniqueCommon() {
        return new CameraImpl.OpticsImpl.TechniqueCommonImpl();
    }

    /**
     * Create an instance of {@link ProfileGLSL }
     * 
     */
    public ProfileGLSL createProfileGLSL() {
        return new ProfileGLSLImpl();
    }

    /**
     * Create an instance of {@link ProfileGLSL.Technique }
     * 
     */
    public ProfileGLSL.Technique createProfileGLSLTechnique() {
        return new ProfileGLSLImpl.TechniqueImpl();
    }

    /**
     * Create an instance of {@link ProfileGLSL.Technique.Pass }
     * 
     */
    public ProfileGLSL.Technique.Pass createProfileGLSLTechniquePass() {
        return new ProfileGLSLImpl.TechniqueImpl.PassImpl();
    }

    /**
     * Create an instance of {@link ProfileGLSL.Technique.Pass.Shader }
     * 
     */
    public ProfileGLSL.Technique.Pass.Shader createProfileGLSLTechniquePassShader() {
        return new ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl();
    }

    /**
     * Create an instance of {@link ProfileGLSL.Technique.Pass.Shader.Bind }
     * 
     */
    public ProfileGLSL.Technique.Pass.Shader.Bind createProfileGLSLTechniquePassShaderBind() {
        return new ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.BindImpl();
    }

    /**
     * Create an instance of {@link InstanceController }
     * 
     */
    public InstanceController createInstanceController() {
        return new InstanceControllerImpl();
    }

    /**
     * Create an instance of {@link org.collada._2005._11.colladaschema.Param }
     * 
     */
    public org.collada._2005._11.colladaschema.Param createParam() {
        return new org.collada._2005._11.colladaschema.impl.ParamImpl();
    }

    /**
     * Create an instance of {@link BindMaterial.TechniqueCommon }
     * 
     */
    public BindMaterial.TechniqueCommon createBindMaterialTechniqueCommon() {
        return new BindMaterialImpl.TechniqueCommonImpl();
    }

    /**
     * Create an instance of {@link org.collada._2005._11.colladaschema.Technique }
     * 
     */
    public org.collada._2005._11.colladaschema.Technique createTechnique() {
        return new org.collada._2005._11.colladaschema.impl.TechniqueImpl();
    }

    /**
     * Create an instance of {@link Extra }
     * 
     */
    public Extra createExtra() {
        return new ExtraImpl();
    }

    /**
     * Create an instance of {@link Asset.Contributor }
     * 
     */
    public Asset.Contributor createAssetContributor() {
        return new AssetImpl.ContributorImpl();
    }

    /**
     * Create an instance of {@link Asset.Unit }
     * 
     */
    public Asset.Unit createAssetUnit() {
        return new AssetImpl.UnitImpl();
    }

    /**
     * Create an instance of {@link LibraryPhysicsMaterials }
     * 
     */
    public LibraryPhysicsMaterials createLibraryPhysicsMaterials() {
        return new LibraryPhysicsMaterialsImpl();
    }

    /**
     * Create an instance of {@link PhysicsMaterial.TechniqueCommon }
     * 
     */
    public PhysicsMaterial.TechniqueCommon createPhysicsMaterialTechniqueCommon() {
        return new PhysicsMaterialImpl.TechniqueCommonImpl();
    }

    /**
     * Create an instance of {@link Plane }
     * 
     */
    public Plane createPlane() {
        return new PlaneImpl();
    }

    /**
     * Create an instance of {@link Rotate }
     * 
     */
    public Rotate createRotate() {
        return new RotateImpl();
    }

    /**
     * Create an instance of {@link InputLocalOffset }
     * 
     */
    public InputLocalOffset createInputLocalOffset() {
        return new InputLocalOffsetImpl();
    }

    /**
     * Create an instance of {@link Polygons.Ph }
     * 
     */
    public Polygons.Ph createPolygonsPh() {
        return new PolygonsImpl.PhImpl();
    }

    /**
     * Create an instance of {@link Channel }
     * 
     */
    public Channel createChannel() {
        return new ChannelImpl();
    }

    /**
     * Create an instance of {@link Lookat }
     * 
     */
    public Lookat createLookat() {
        return new LookatImpl();
    }

    /**
     * Create an instance of {@link IntArray }
     * 
     */
    public IntArray createIntArray() {
        return new IntArrayImpl();
    }

    /**
     * Create an instance of {@link FloatArray }
     * 
     */
    public FloatArray createFloatArray() {
        return new FloatArrayImpl();
    }

    /**
     * Create an instance of {@link BoolArray }
     * 
     */
    public BoolArray createBoolArray() {
        return new BoolArrayImpl();
    }

    /**
     * Create an instance of {@link NameArray }
     * 
     */
    public NameArray createNameArray() {
        return new NameArrayImpl();
    }

    /**
     * Create an instance of {@link IDREFArray }
     * 
     */
    public IDREFArray createIDREFArray() {
        return new IDREFArrayImpl();
    }

    /**
     * Create an instance of {@link Source.TechniqueCommon }
     * 
     */
    public Source.TechniqueCommon createSourceTechniqueCommon() {
        return new SourceImpl.TechniqueCommonImpl();
    }

    /**
     * Create an instance of {@link TargetableFloat3 }
     * 
     */
    public TargetableFloat3 createTargetableFloat3() {
        return new TargetableFloat3Impl();
    }

    /**
     * Create an instance of {@link Triangles }
     * 
     */
    public Triangles createTriangles() {
        return new TrianglesImpl();
    }

    /**
     * Create an instance of {@link LibraryControllers }
     * 
     */
    public LibraryControllers createLibraryControllers() {
        return new LibraryControllersImpl();
    }

    /**
     * Create an instance of {@link Controller }
     * 
     */
    public Controller createController() {
        return new ControllerImpl();
    }

    /**
     * Create an instance of {@link Morph.Targets }
     * 
     */
    public Morph.Targets createMorphTargets() {
        return new MorphImpl.TargetsImpl();
    }

    /**
     * Create an instance of {@link Skin.Joints }
     * 
     */
    public Skin.Joints createSkinJoints() {
        return new SkinImpl.JointsImpl();
    }

    /**
     * Create an instance of {@link Skin.VertexWeights }
     * 
     */
    public Skin.VertexWeights createSkinVertexWeights() {
        return new SkinImpl.VertexWeightsImpl();
    }

    /**
     * Create an instance of {@link Polylist }
     * 
     */
    public Polylist createPolylist() {
        return new PolylistImpl();
    }

    /**
     * Create an instance of {@link InstanceMaterial.Bind }
     * 
     */
    public InstanceMaterial.Bind createInstanceMaterialBind() {
        return new InstanceMaterialImpl.BindImpl();
    }

    /**
     * Create an instance of {@link InstanceMaterial.BindVertexInput }
     * 
     */
    public InstanceMaterial.BindVertexInput createInstanceMaterialBindVertexInput() {
        return new InstanceMaterialImpl.BindVertexInputImpl();
    }

    /**
     * Create an instance of {@link InstanceWithExtra }
     * 
     */
    public InstanceWithExtra createInstanceWithExtra() {
        return new InstanceWithExtraImpl();
    }

    /**
     * Create an instance of {@link AnimationClip }
     * 
     */
    public AnimationClip createAnimationClip() {
        return new AnimationClipImpl();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new ImageImpl();
    }

    /**
     * Create an instance of {@link LibraryCameras }
     * 
     */
    public LibraryCameras createLibraryCameras() {
        return new LibraryCamerasImpl();
    }

    /**
     * Create an instance of {@link Camera.Imager }
     * 
     */
    public Camera.Imager createCameraImager() {
        return new CameraImpl.ImagerImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.RefAttachment }
     * 
     */
    public RigidConstraint.RefAttachment createRigidConstraintRefAttachment() {
        return new RigidConstraintImpl.RefAttachmentImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.Attachment }
     * 
     */
    public RigidConstraint.Attachment createRigidConstraintAttachment() {
        return new RigidConstraintImpl.AttachmentImpl();
    }

    /**
     * Create an instance of {@link LibraryPhysicsScenes }
     * 
     */
    public LibraryPhysicsScenes createLibraryPhysicsScenes() {
        return new LibraryPhysicsScenesImpl();
    }

    /**
     * Create an instance of {@link InstancePhysicsModel }
     * 
     */
    public InstancePhysicsModel createInstancePhysicsModel() {
        return new InstancePhysicsModelImpl();
    }

    /**
     * Create an instance of {@link InstanceRigidConstraint }
     * 
     */
    public InstanceRigidConstraint createInstanceRigidConstraint() {
        return new InstanceRigidConstraintImpl();
    }

    /**
     * Create an instance of {@link PhysicsScene.TechniqueCommon }
     * 
     */
    public PhysicsScene.TechniqueCommon createPhysicsSceneTechniqueCommon() {
        return new PhysicsSceneImpl.TechniqueCommonImpl();
    }

    /**
     * Create an instance of {@link Animation }
     * 
     */
    public Animation createAnimation() {
        return new AnimationImpl();
    }

    /**
     * Create an instance of {@link Sampler }
     * 
     */
    public Sampler createSampler() {
        return new SamplerImpl();
    }

    /**
     * Create an instance of {@link InputLocal }
     * 
     */
    public InputLocal createInputLocal() {
        return new InputLocalImpl();
    }

    /**
     * Create an instance of {@link Ellipsoid }
     * 
     */
    public Ellipsoid createEllipsoid() {
        return new EllipsoidImpl();
    }

    /**
     * Create an instance of {@link Node }
     * 
     */
    public Node createNode() {
        return new NodeImpl();
    }

    /**
     * Create an instance of {@link Matrix }
     * 
     */
    public Matrix createMatrix() {
        return new MatrixImpl();
    }

    /**
     * Create an instance of {@link Skew }
     * 
     */
    public Skew createSkew() {
        return new SkewImpl();
    }

    /**
     * Create an instance of {@link InstanceGeometry }
     * 
     */
    public InstanceGeometry createInstanceGeometry() {
        return new InstanceGeometryImpl();
    }

    /**
     * Create an instance of {@link Linestrips }
     * 
     */
    public Linestrips createLinestrips() {
        return new LinestripsImpl();
    }

    /**
     * Create an instance of {@link LibraryGeometries }
     * 
     */
    public LibraryGeometries createLibraryGeometries() {
        return new LibraryGeometriesImpl();
    }

    /**
     * Create an instance of {@link Geometry }
     * 
     */
    public Geometry createGeometry() {
        return new GeometryImpl();
    }

    /**
     * Create an instance of {@link Spline.ControlVertices }
     * 
     */
    public Spline.ControlVertices createSplineControlVertices() {
        return new SplineImpl.ControlVerticesImpl();
    }

    /**
     * Create an instance of {@link Mesh }
     * 
     */
    public Mesh createMesh() {
        return new MeshImpl();
    }

    /**
     * Create an instance of {@link Vertices }
     * 
     */
    public Vertices createVertices() {
        return new VerticesImpl();
    }

    /**
     * Create an instance of {@link Lines }
     * 
     */
    public Lines createLines() {
        return new LinesImpl();
    }

    /**
     * Create an instance of {@link Trifans }
     * 
     */
    public Trifans createTrifans() {
        return new TrifansImpl();
    }

    /**
     * Create an instance of {@link Tristrips }
     * 
     */
    public Tristrips createTristrips() {
        return new TristripsImpl();
    }

    /**
     * Create an instance of {@link ConvexMesh }
     * 
     */
    public ConvexMesh createConvexMesh() {
        return new ConvexMeshImpl();
    }

    /**
     * Create an instance of {@link LibraryLights }
     * 
     */
    public LibraryLights createLibraryLights() {
        return new LibraryLightsImpl();
    }

    /**
     * Create an instance of {@link Effect }
     * 
     */
    public Effect createEffect() {
        return new EffectImpl();
    }

    /**
     * Create an instance of {@link FxAnnotateCommon }
     * 
     */
    public FxAnnotateCommon createFxAnnotateCommon() {
        return new FxAnnotateCommonImpl();
    }

    /**
     * Create an instance of {@link FxNewparamCommon }
     * 
     */
    public FxNewparamCommon createFxNewparamCommon() {
        return new FxNewparamCommonImpl();
    }

    /**
     * Create an instance of {@link InstanceEffect.TechniqueHint }
     * 
     */
    public InstanceEffect.TechniqueHint createInstanceEffectTechniqueHint() {
        return new InstanceEffectImpl.TechniqueHintImpl();
    }

    /**
     * Create an instance of {@link InstanceEffect.Setparam }
     * 
     */
    public InstanceEffect.Setparam createInstanceEffectSetparam() {
        return new InstanceEffectImpl.SetparamImpl();
    }

    /**
     * Create an instance of {@link LibraryEffects }
     * 
     */
    public LibraryEffects createLibraryEffects() {
        return new LibraryEffectsImpl();
    }

    /**
     * Create an instance of {@link LibraryAnimations }
     * 
     */
    public LibraryAnimations createLibraryAnimations() {
        return new LibraryAnimationsImpl();
    }

    /**
     * Create an instance of {@link Capsule }
     * 
     */
    public Capsule createCapsule() {
        return new CapsuleImpl();
    }

    /**
     * Create an instance of {@link PhysicsModel }
     * 
     */
    public PhysicsModel createPhysicsModel() {
        return new PhysicsModelImpl();
    }

    /**
     * Create an instance of {@link Accessor }
     * 
     */
    public Accessor createAccessor() {
        return new AccessorImpl();
    }

    /**
     * Create an instance of {@link Box }
     * 
     */
    public Box createBox() {
        return new BoxImpl();
    }

    /**
     * Create an instance of {@link LibraryImages }
     * 
     */
    public LibraryImages createLibraryImages() {
        return new LibraryImagesImpl();
    }

    /**
     * Create an instance of {@link LibraryPhysicsModels }
     * 
     */
    public LibraryPhysicsModels createLibraryPhysicsModels() {
        return new LibraryPhysicsModelsImpl();
    }

    /**
     * Create an instance of {@link Sphere }
     * 
     */
    public Sphere createSphere() {
        return new SphereImpl();
    }

    /**
     * Create an instance of {@link LibraryMaterials }
     * 
     */
    public LibraryMaterials createLibraryMaterials() {
        return new LibraryMaterialsImpl();
    }

    /**
     * Create an instance of {@link Material }
     * 
     */
    public Material createMaterial() {
        return new MaterialImpl();
    }

    /**
     * Create an instance of {@link LibraryAnimationClips }
     * 
     */
    public LibraryAnimationClips createLibraryAnimationClips() {
        return new LibraryAnimationClipsImpl();
    }

    /**
     * Create an instance of {@link ForceField }
     * 
     */
    public ForceField createForceField() {
        return new ForceFieldImpl();
    }

    /**
     * Create an instance of {@link LibraryNodes }
     * 
     */
    public LibraryNodes createLibraryNodes() {
        return new LibraryNodesImpl();
    }

    /**
     * Create an instance of {@link TaperedCylinder }
     * 
     */
    public TaperedCylinder createTaperedCylinder() {
        return new TaperedCylinderImpl();
    }

    /**
     * Create an instance of {@link LibraryForceFields }
     * 
     */
    public LibraryForceFields createLibraryForceFields() {
        return new LibraryForceFieldsImpl();
    }

    /**
     * Create an instance of {@link LibraryVisualScenes }
     * 
     */
    public LibraryVisualScenes createLibraryVisualScenes() {
        return new LibraryVisualScenesImpl();
    }

    /**
     * Create an instance of {@link COLLADA.Scene }
     * 
     */
    public COLLADA.Scene createCOLLADAScene() {
        return new COLLADAImpl.SceneImpl();
    }

    /**
     * Create an instance of {@link TaperedCapsule }
     * 
     */
    public TaperedCapsule createTaperedCapsule() {
        return new TaperedCapsuleImpl();
    }

    /**
     * Create an instance of {@link Cylinder }
     * 
     */
    public Cylinder createCylinder() {
        return new CylinderImpl();
    }

    /**
     * Create an instance of {@link FxStenciltargetCommon }
     * 
     */
    public FxStenciltargetCommon createFxStenciltargetCommon() {
        return new FxStenciltargetCommonImpl();
    }

    /**
     * Create an instance of {@link CgConnectParam }
     * 
     */
    public CgConnectParam createCgConnectParam() {
        return new CgConnectParamImpl();
    }

    /**
     * Create an instance of {@link CgNewparam }
     * 
     */
    public CgNewparam createCgNewparam() {
        return new CgNewparamImpl();
    }

    /**
     * Create an instance of {@link CgSamplerDEPTH }
     * 
     */
    public CgSamplerDEPTH createCgSamplerDEPTH() {
        return new CgSamplerDEPTHImpl();
    }

    /**
     * Create an instance of {@link FxSampler1DCommon }
     * 
     */
    public FxSampler1DCommon createFxSampler1DCommon() {
        return new FxSampler1DCommonImpl();
    }

    /**
     * Create an instance of {@link FxCleardepthCommon }
     * 
     */
    public FxCleardepthCommon createFxCleardepthCommon() {
        return new FxCleardepthCommonImpl();
    }

    /**
     * Create an instance of {@link FxSamplerCUBECommon }
     * 
     */
    public FxSamplerCUBECommon createFxSamplerCUBECommon() {
        return new FxSamplerCUBECommonImpl();
    }

    /**
     * Create an instance of {@link CgSamplerRECT }
     * 
     */
    public CgSamplerRECT createCgSamplerRECT() {
        return new CgSamplerRECTImpl();
    }

    /**
     * Create an instance of {@link GlesNewparam }
     * 
     */
    public GlesNewparam createGlesNewparam() {
        return new GlesNewparamImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceFormatHintCommon }
     * 
     */
    public FxSurfaceFormatHintCommon createFxSurfaceFormatHintCommon() {
        return new FxSurfaceFormatHintCommonImpl();
    }

    /**
     * Create an instance of {@link FxDepthtargetCommon }
     * 
     */
    public FxDepthtargetCommon createFxDepthtargetCommon() {
        return new FxDepthtargetCommonImpl();
    }

    /**
     * Create an instance of {@link FxColortargetCommon }
     * 
     */
    public FxColortargetCommon createFxColortargetCommon() {
        return new FxColortargetCommonImpl();
    }

    /**
     * Create an instance of {@link CgSetuserType }
     * 
     */
    public CgSetuserType createCgSetuserType() {
        return new CgSetuserTypeImpl();
    }

    /**
     * Create an instance of {@link CgSetparam }
     * 
     */
    public CgSetparam createCgSetparam() {
        return new CgSetparamImpl();
    }

    /**
     * Create an instance of {@link GlslNewarrayType }
     * 
     */
    public GlslNewarrayType createGlslNewarrayType() {
        return new GlslNewarrayTypeImpl();
    }

    /**
     * Create an instance of {@link CgSamplerCUBE }
     * 
     */
    public CgSamplerCUBE createCgSamplerCUBE() {
        return new CgSamplerCUBEImpl();
    }

    /**
     * Create an instance of {@link GlesTexturePipeline }
     * 
     */
    public GlesTexturePipeline createGlesTexturePipeline() {
        return new GlesTexturePipelineImpl();
    }

    /**
     * Create an instance of {@link GlslSetparam }
     * 
     */
    public GlslSetparam createGlslSetparam() {
        return new GlslSetparamImpl();
    }

    /**
     * Create an instance of {@link FxSampler3DCommon }
     * 
     */
    public FxSampler3DCommon createFxSampler3DCommon() {
        return new FxSampler3DCommonImpl();
    }

    /**
     * Create an instance of {@link CommonNewparamType }
     * 
     */
    public CommonNewparamType createCommonNewparamType() {
        return new CommonNewparamTypeImpl();
    }

    /**
     * Create an instance of {@link FxSamplerDEPTHCommon }
     * 
     */
    public FxSamplerDEPTHCommon createFxSamplerDEPTHCommon() {
        return new FxSamplerDEPTHCommonImpl();
    }

    /**
     * Create an instance of {@link GlesTexcombinerCommandType }
     * 
     */
    public GlesTexcombinerCommandType createGlesTexcombinerCommandType() {
        return new GlesTexcombinerCommandTypeImpl();
    }

    /**
     * Create an instance of {@link FxClearstencilCommon }
     * 
     */
    public FxClearstencilCommon createFxClearstencilCommon() {
        return new FxClearstencilCommonImpl();
    }

    /**
     * Create an instance of {@link CommonTransparentType }
     * 
     */
    public CommonTransparentType createCommonTransparentType() {
        return new CommonTransparentTypeImpl();
    }

    /**
     * Create an instance of {@link GlesTexcombinerArgumentRGBType }
     * 
     */
    public GlesTexcombinerArgumentRGBType createGlesTexcombinerArgumentRGBType() {
        return new GlesTexcombinerArgumentRGBTypeImpl();
    }

    /**
     * Create an instance of {@link GlesTexcombinerCommandRGBType }
     * 
     */
    public GlesTexcombinerCommandRGBType createGlesTexcombinerCommandRGBType() {
        return new GlesTexcombinerCommandRGBTypeImpl();
    }

    /**
     * Create an instance of {@link GlesTexcombinerCommandAlphaType }
     * 
     */
    public GlesTexcombinerCommandAlphaType createGlesTexcombinerCommandAlphaType() {
        return new GlesTexcombinerCommandAlphaTypeImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceCommon }
     * 
     */
    public FxSurfaceCommon createFxSurfaceCommon() {
        return new FxSurfaceCommonImpl();
    }

    /**
     * Create an instance of {@link GlslSetarrayType }
     * 
     */
    public GlslSetarrayType createGlslSetarrayType() {
        return new GlslSetarrayTypeImpl();
    }

    /**
     * Create an instance of {@link GlSamplerDEPTH }
     * 
     */
    public GlSamplerDEPTH createGlSamplerDEPTH() {
        return new GlSamplerDEPTHImpl();
    }

    /**
     * Create an instance of {@link GlesSamplerState }
     * 
     */
    public GlesSamplerState createGlesSamplerState() {
        return new GlesSamplerStateImpl();
    }

    /**
     * Create an instance of {@link FxCodeProfile }
     * 
     */
    public FxCodeProfile createFxCodeProfile() {
        return new FxCodeProfileImpl();
    }

    /**
     * Create an instance of {@link GlSampler2D }
     * 
     */
    public GlSampler2D createGlSampler2D() {
        return new GlSampler2DImpl();
    }

    /**
     * Create an instance of {@link CgNewarrayType }
     * 
     */
    public CgNewarrayType createCgNewarrayType() {
        return new CgNewarrayTypeImpl();
    }

    /**
     * Create an instance of {@link CgSampler3D }
     * 
     */
    public CgSampler3D createCgSampler3D() {
        return new CgSampler3DImpl();
    }

    /**
     * Create an instance of {@link GlSampler3D }
     * 
     */
    public GlSampler3D createGlSampler3D() {
        return new GlSampler3DImpl();
    }

    /**
     * Create an instance of {@link GlSamplerRECT }
     * 
     */
    public GlSamplerRECT createGlSamplerRECT() {
        return new GlSamplerRECTImpl();
    }

    /**
     * Create an instance of {@link GlesTexenvCommandType }
     * 
     */
    public GlesTexenvCommandType createGlesTexenvCommandType() {
        return new GlesTexenvCommandTypeImpl();
    }

    /**
     * Create an instance of {@link FxSampler2DCommon }
     * 
     */
    public FxSampler2DCommon createFxSampler2DCommon() {
        return new FxSampler2DCommonImpl();
    }

    /**
     * Create an instance of {@link GlesTextureConstantType }
     * 
     */
    public GlesTextureConstantType createGlesTextureConstantType() {
        return new GlesTextureConstantTypeImpl();
    }

    /**
     * Create an instance of {@link GlSamplerCUBE }
     * 
     */
    public GlSamplerCUBE createGlSamplerCUBE() {
        return new GlSamplerCUBEImpl();
    }

    /**
     * Create an instance of {@link CgSampler1D }
     * 
     */
    public CgSampler1D createCgSampler1D() {
        return new CgSampler1DImpl();
    }

    /**
     * Create an instance of {@link CgSampler2D }
     * 
     */
    public CgSampler2D createCgSampler2D() {
        return new CgSampler2DImpl();
    }

    /**
     * Create an instance of {@link GlslSetparamSimple }
     * 
     */
    public GlslSetparamSimple createGlslSetparamSimple() {
        return new GlslSetparamSimpleImpl();
    }

    /**
     * Create an instance of {@link GlesTexcombinerArgumentAlphaType }
     * 
     */
    public GlesTexcombinerArgumentAlphaType createGlesTexcombinerArgumentAlphaType() {
        return new GlesTexcombinerArgumentAlphaTypeImpl();
    }

    /**
     * Create an instance of {@link TargetableFloat }
     * 
     */
    public TargetableFloat createTargetableFloat() {
        return new TargetableFloatImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceInitFromCommon }
     * 
     */
    public FxSurfaceInitFromCommon createFxSurfaceInitFromCommon() {
        return new FxSurfaceInitFromCommonImpl();
    }

    /**
     * Create an instance of {@link InputGlobal }
     * 
     */
    public InputGlobal createInputGlobal() {
        return new InputGlobalImpl();
    }

    /**
     * Create an instance of {@link FxClearcolorCommon }
     * 
     */
    public FxClearcolorCommon createFxClearcolorCommon() {
        return new FxClearcolorCommonImpl();
    }

    /**
     * Create an instance of {@link FxSamplerRECTCommon }
     * 
     */
    public FxSamplerRECTCommon createFxSamplerRECTCommon() {
        return new FxSamplerRECTCommonImpl();
    }

    /**
     * Create an instance of {@link GlslNewparam }
     * 
     */
    public GlslNewparam createGlslNewparam() {
        return new GlslNewparamImpl();
    }

    /**
     * Create an instance of {@link FxIncludeCommon }
     * 
     */
    public FxIncludeCommon createFxIncludeCommon() {
        return new FxIncludeCommonImpl();
    }

    /**
     * Create an instance of {@link CgSetarrayType }
     * 
     */
    public CgSetarrayType createCgSetarrayType() {
        return new CgSetarrayTypeImpl();
    }

    /**
     * Create an instance of {@link GlSampler1D }
     * 
     */
    public GlSampler1D createGlSampler1D() {
        return new GlSampler1DImpl();
    }

    /**
     * Create an instance of {@link CgSetparamSimple }
     * 
     */
    public CgSetparamSimple createCgSetparamSimple() {
        return new CgSetparamSimpleImpl();
    }

    /**
     * Create an instance of {@link GlesTextureUnit.Texcoord }
     * 
     */
    public GlesTextureUnit.Texcoord createGlesTextureUnitTexcoord() {
        return new GlesTextureUnitImpl.TexcoordImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceInitCubeCommon.Face }
     * 
     */
    public FxSurfaceInitCubeCommon.Face createFxSurfaceInitCubeCommonFace() {
        return new FxSurfaceInitCubeCommonImpl.FaceImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceInitCubeCommon.Primary }
     * 
     */
    public FxSurfaceInitCubeCommon.Primary createFxSurfaceInitCubeCommonPrimary() {
        return new FxSurfaceInitCubeCommonImpl.PrimaryImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceInitCubeCommon.All }
     * 
     */
    public FxSurfaceInitCubeCommon.All createFxSurfaceInitCubeCommonAll() {
        return new FxSurfaceInitCubeCommonImpl.AllImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceInitVolumeCommon.Primary }
     * 
     */
    public FxSurfaceInitVolumeCommon.Primary createFxSurfaceInitVolumeCommonPrimary() {
        return new FxSurfaceInitVolumeCommonImpl.PrimaryImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceInitVolumeCommon.All }
     * 
     */
    public FxSurfaceInitVolumeCommon.All createFxSurfaceInitVolumeCommonAll() {
        return new FxSurfaceInitVolumeCommonImpl.AllImpl();
    }

    /**
     * Create an instance of {@link CommonFloatOrParamType.Param }
     * 
     */
    public CommonFloatOrParamType.Param createCommonFloatOrParamTypeParam() {
        return new CommonFloatOrParamTypeImpl.ParamImpl();
    }

    /**
     * Create an instance of {@link CommonFloatOrParamType.Float }
     * 
     */
    public CommonFloatOrParamType.Float createCommonFloatOrParamTypeFloat() {
        return new CommonFloatOrParamTypeImpl.FloatImpl();
    }

    /**
     * Create an instance of {@link CgSurfaceType.Generator.Name }
     * 
     */
    public CgSurfaceType.Generator.Name createCgSurfaceTypeGeneratorName() {
        return new CgSurfaceTypeImpl.GeneratorImpl.NameImpl();
    }

    /**
     * Create an instance of {@link CommonColorOrTextureType.Texture }
     * 
     */
    public CommonColorOrTextureType.Texture createCommonColorOrTextureTypeTexture() {
        return new CommonColorOrTextureTypeImpl.TextureImpl();
    }

    /**
     * Create an instance of {@link CommonColorOrTextureType.Param }
     * 
     */
    public CommonColorOrTextureType.Param createCommonColorOrTextureTypeParam() {
        return new CommonColorOrTextureTypeImpl.ParamImpl();
    }

    /**
     * Create an instance of {@link CommonColorOrTextureType.Color }
     * 
     */
    public CommonColorOrTextureType.Color createCommonColorOrTextureTypeColor() {
        return new CommonColorOrTextureTypeImpl.ColorImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceInitPlanarCommon.All }
     * 
     */
    public FxSurfaceInitPlanarCommon.All createFxSurfaceInitPlanarCommonAll() {
        return new FxSurfaceInitPlanarCommonImpl.AllImpl();
    }

    /**
     * Create an instance of {@link GlslSurfaceType.Generator.Name }
     * 
     */
    public GlslSurfaceType.Generator.Name createGlslSurfaceTypeGeneratorName() {
        return new GlslSurfaceTypeImpl.GeneratorImpl.NameImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendEquation }
     * 
     */
    public ProfileCG.Technique.Pass.BlendEquation createProfileCGTechniquePassBlendEquation() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.CullFace }
     * 
     */
    public ProfileCG.Technique.Pass.CullFace createProfileCGTechniquePassCullFace() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.CullFaceImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.DepthFunc }
     * 
     */
    public ProfileCG.Technique.Pass.DepthFunc createProfileCGTechniquePassDepthFunc() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.DepthFuncImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.FogMode }
     * 
     */
    public ProfileCG.Technique.Pass.FogMode createProfileCGTechniquePassFogMode() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.FogModeImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.FogCoordSrc }
     * 
     */
    public ProfileCG.Technique.Pass.FogCoordSrc createProfileCGTechniquePassFogCoordSrc() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.FogCoordSrcImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.FrontFace }
     * 
     */
    public ProfileCG.Technique.Pass.FrontFace createProfileCGTechniquePassFrontFace() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.FrontFaceImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightModelColorControl }
     * 
     */
    public ProfileCG.Technique.Pass.LightModelColorControl createProfileCGTechniquePassLightModelColorControl() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightModelColorControlImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LogicOp }
     * 
     */
    public ProfileCG.Technique.Pass.LogicOp createProfileCGTechniquePassLogicOp() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LogicOpImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ShadeModel }
     * 
     */
    public ProfileCG.Technique.Pass.ShadeModel createProfileCGTechniquePassShadeModel() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ShadeModelImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightEnable }
     * 
     */
    public ProfileCG.Technique.Pass.LightEnable createProfileCGTechniquePassLightEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightAmbient }
     * 
     */
    public ProfileCG.Technique.Pass.LightAmbient createProfileCGTechniquePassLightAmbient() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightAmbientImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightDiffuse }
     * 
     */
    public ProfileCG.Technique.Pass.LightDiffuse createProfileCGTechniquePassLightDiffuse() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightDiffuseImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightSpecular }
     * 
     */
    public ProfileCG.Technique.Pass.LightSpecular createProfileCGTechniquePassLightSpecular() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightSpecularImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightPosition }
     * 
     */
    public ProfileCG.Technique.Pass.LightPosition createProfileCGTechniquePassLightPosition() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightPositionImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightConstantAttenuation }
     * 
     */
    public ProfileCG.Technique.Pass.LightConstantAttenuation createProfileCGTechniquePassLightConstantAttenuation() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightConstantAttenuationImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightLinearAttenuation }
     * 
     */
    public ProfileCG.Technique.Pass.LightLinearAttenuation createProfileCGTechniquePassLightLinearAttenuation() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightLinearAttenuationImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightQuadraticAttenuation }
     * 
     */
    public ProfileCG.Technique.Pass.LightQuadraticAttenuation createProfileCGTechniquePassLightQuadraticAttenuation() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightQuadraticAttenuationImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightSpotCutoff }
     * 
     */
    public ProfileCG.Technique.Pass.LightSpotCutoff createProfileCGTechniquePassLightSpotCutoff() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightSpotCutoffImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightSpotDirection }
     * 
     */
    public ProfileCG.Technique.Pass.LightSpotDirection createProfileCGTechniquePassLightSpotDirection() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightSpotDirectionImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightSpotExponent }
     * 
     */
    public ProfileCG.Technique.Pass.LightSpotExponent createProfileCGTechniquePassLightSpotExponent() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightSpotExponentImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Texture1D }
     * 
     */
    public ProfileCG.Technique.Pass.Texture1D createProfileCGTechniquePassTexture1D() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.Texture1DImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Texture2D }
     * 
     */
    public ProfileCG.Technique.Pass.Texture2D createProfileCGTechniquePassTexture2D() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.Texture2DImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Texture3D }
     * 
     */
    public ProfileCG.Technique.Pass.Texture3D createProfileCGTechniquePassTexture3D() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.Texture3DImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.TextureCUBE }
     * 
     */
    public ProfileCG.Technique.Pass.TextureCUBE createProfileCGTechniquePassTextureCUBE() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.TextureCUBEImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.TextureRECT }
     * 
     */
    public ProfileCG.Technique.Pass.TextureRECT createProfileCGTechniquePassTextureRECT() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.TextureRECTImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.TextureDEPTH }
     * 
     */
    public ProfileCG.Technique.Pass.TextureDEPTH createProfileCGTechniquePassTextureDEPTH() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.TextureDEPTHImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Texture1DEnable }
     * 
     */
    public ProfileCG.Technique.Pass.Texture1DEnable createProfileCGTechniquePassTexture1DEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.Texture1DEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Texture2DEnable }
     * 
     */
    public ProfileCG.Technique.Pass.Texture2DEnable createProfileCGTechniquePassTexture2DEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.Texture2DEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Texture3DEnable }
     * 
     */
    public ProfileCG.Technique.Pass.Texture3DEnable createProfileCGTechniquePassTexture3DEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.Texture3DEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.TextureCUBEEnable }
     * 
     */
    public ProfileCG.Technique.Pass.TextureCUBEEnable createProfileCGTechniquePassTextureCUBEEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.TextureCUBEEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.TextureRECTEnable }
     * 
     */
    public ProfileCG.Technique.Pass.TextureRECTEnable createProfileCGTechniquePassTextureRECTEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.TextureRECTEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.TextureDEPTHEnable }
     * 
     */
    public ProfileCG.Technique.Pass.TextureDEPTHEnable createProfileCGTechniquePassTextureDEPTHEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.TextureDEPTHEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.TextureEnvColor }
     * 
     */
    public ProfileCG.Technique.Pass.TextureEnvColor createProfileCGTechniquePassTextureEnvColor() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.TextureEnvColorImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.TextureEnvMode }
     * 
     */
    public ProfileCG.Technique.Pass.TextureEnvMode createProfileCGTechniquePassTextureEnvMode() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.TextureEnvModeImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ClipPlane }
     * 
     */
    public ProfileCG.Technique.Pass.ClipPlane createProfileCGTechniquePassClipPlane() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ClipPlaneImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ClipPlaneEnable }
     * 
     */
    public ProfileCG.Technique.Pass.ClipPlaneEnable createProfileCGTechniquePassClipPlaneEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ClipPlaneEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendColor }
     * 
     */
    public ProfileCG.Technique.Pass.BlendColor createProfileCGTechniquePassBlendColor() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendColorImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ClearColor }
     * 
     */
    public ProfileCG.Technique.Pass.ClearColor createProfileCGTechniquePassClearColor() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ClearColorImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ClearStencil }
     * 
     */
    public ProfileCG.Technique.Pass.ClearStencil createProfileCGTechniquePassClearStencil() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ClearStencilImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ClearDepth }
     * 
     */
    public ProfileCG.Technique.Pass.ClearDepth createProfileCGTechniquePassClearDepth() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ClearDepthImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ColorMask }
     * 
     */
    public ProfileCG.Technique.Pass.ColorMask createProfileCGTechniquePassColorMask() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaskImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.DepthBounds }
     * 
     */
    public ProfileCG.Technique.Pass.DepthBounds createProfileCGTechniquePassDepthBounds() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.DepthBoundsImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.DepthMask }
     * 
     */
    public ProfileCG.Technique.Pass.DepthMask createProfileCGTechniquePassDepthMask() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.DepthMaskImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.DepthRange }
     * 
     */
    public ProfileCG.Technique.Pass.DepthRange createProfileCGTechniquePassDepthRange() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.DepthRangeImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.FogDensity }
     * 
     */
    public ProfileCG.Technique.Pass.FogDensity createProfileCGTechniquePassFogDensity() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.FogDensityImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.FogStart }
     * 
     */
    public ProfileCG.Technique.Pass.FogStart createProfileCGTechniquePassFogStart() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.FogStartImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.FogEnd }
     * 
     */
    public ProfileCG.Technique.Pass.FogEnd createProfileCGTechniquePassFogEnd() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.FogEndImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.FogColor }
     * 
     */
    public ProfileCG.Technique.Pass.FogColor createProfileCGTechniquePassFogColor() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.FogColorImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightModelAmbient }
     * 
     */
    public ProfileCG.Technique.Pass.LightModelAmbient createProfileCGTechniquePassLightModelAmbient() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightModelAmbientImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightingEnable }
     * 
     */
    public ProfileCG.Technique.Pass.LightingEnable createProfileCGTechniquePassLightingEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightingEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LineStipple }
     * 
     */
    public ProfileCG.Technique.Pass.LineStipple createProfileCGTechniquePassLineStipple() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LineStippleImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LineWidth }
     * 
     */
    public ProfileCG.Technique.Pass.LineWidth createProfileCGTechniquePassLineWidth() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LineWidthImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.MaterialAmbient }
     * 
     */
    public ProfileCG.Technique.Pass.MaterialAmbient createProfileCGTechniquePassMaterialAmbient() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.MaterialAmbientImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.MaterialDiffuse }
     * 
     */
    public ProfileCG.Technique.Pass.MaterialDiffuse createProfileCGTechniquePassMaterialDiffuse() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.MaterialDiffuseImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.MaterialEmission }
     * 
     */
    public ProfileCG.Technique.Pass.MaterialEmission createProfileCGTechniquePassMaterialEmission() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.MaterialEmissionImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.MaterialShininess }
     * 
     */
    public ProfileCG.Technique.Pass.MaterialShininess createProfileCGTechniquePassMaterialShininess() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.MaterialShininessImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.MaterialSpecular }
     * 
     */
    public ProfileCG.Technique.Pass.MaterialSpecular createProfileCGTechniquePassMaterialSpecular() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.MaterialSpecularImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ModelViewMatrix }
     * 
     */
    public ProfileCG.Technique.Pass.ModelViewMatrix createProfileCGTechniquePassModelViewMatrix() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ModelViewMatrixImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PointDistanceAttenuation }
     * 
     */
    public ProfileCG.Technique.Pass.PointDistanceAttenuation createProfileCGTechniquePassPointDistanceAttenuation() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PointDistanceAttenuationImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PointFadeThresholdSize }
     * 
     */
    public ProfileCG.Technique.Pass.PointFadeThresholdSize createProfileCGTechniquePassPointFadeThresholdSize() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PointFadeThresholdSizeImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PointSize }
     * 
     */
    public ProfileCG.Technique.Pass.PointSize createProfileCGTechniquePassPointSize() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PointSizeImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PointSizeMin }
     * 
     */
    public ProfileCG.Technique.Pass.PointSizeMin createProfileCGTechniquePassPointSizeMin() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PointSizeMinImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PointSizeMax }
     * 
     */
    public ProfileCG.Technique.Pass.PointSizeMax createProfileCGTechniquePassPointSizeMax() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PointSizeMaxImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PolygonOffset }
     * 
     */
    public ProfileCG.Technique.Pass.PolygonOffset createProfileCGTechniquePassPolygonOffset() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PolygonOffsetImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ProjectionMatrix }
     * 
     */
    public ProfileCG.Technique.Pass.ProjectionMatrix createProfileCGTechniquePassProjectionMatrix() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ProjectionMatrixImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Scissor }
     * 
     */
    public ProfileCG.Technique.Pass.Scissor createProfileCGTechniquePassScissor() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ScissorImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilMask }
     * 
     */
    public ProfileCG.Technique.Pass.StencilMask createProfileCGTechniquePassStencilMask() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.AlphaTestEnable }
     * 
     */
    public ProfileCG.Technique.Pass.AlphaTestEnable createProfileCGTechniquePassAlphaTestEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.AlphaTestEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.AutoNormalEnable }
     * 
     */
    public ProfileCG.Technique.Pass.AutoNormalEnable createProfileCGTechniquePassAutoNormalEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.AutoNormalEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendEnable }
     * 
     */
    public ProfileCG.Technique.Pass.BlendEnable createProfileCGTechniquePassBlendEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ColorLogicOpEnable }
     * 
     */
    public ProfileCG.Technique.Pass.ColorLogicOpEnable createProfileCGTechniquePassColorLogicOpEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ColorLogicOpEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ColorMaterialEnable }
     * 
     */
    public ProfileCG.Technique.Pass.ColorMaterialEnable createProfileCGTechniquePassColorMaterialEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.CullFaceEnable }
     * 
     */
    public ProfileCG.Technique.Pass.CullFaceEnable createProfileCGTechniquePassCullFaceEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.CullFaceEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.DepthBoundsEnable }
     * 
     */
    public ProfileCG.Technique.Pass.DepthBoundsEnable createProfileCGTechniquePassDepthBoundsEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.DepthBoundsEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.DepthClampEnable }
     * 
     */
    public ProfileCG.Technique.Pass.DepthClampEnable createProfileCGTechniquePassDepthClampEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.DepthClampEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.DepthTestEnable }
     * 
     */
    public ProfileCG.Technique.Pass.DepthTestEnable createProfileCGTechniquePassDepthTestEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.DepthTestEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.DitherEnable }
     * 
     */
    public ProfileCG.Technique.Pass.DitherEnable createProfileCGTechniquePassDitherEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.DitherEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.FogEnable }
     * 
     */
    public ProfileCG.Technique.Pass.FogEnable createProfileCGTechniquePassFogEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.FogEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightModelLocalViewerEnable }
     * 
     */
    public ProfileCG.Technique.Pass.LightModelLocalViewerEnable createProfileCGTechniquePassLightModelLocalViewerEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightModelLocalViewerEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightModelTwoSideEnable }
     * 
     */
    public ProfileCG.Technique.Pass.LightModelTwoSideEnable createProfileCGTechniquePassLightModelTwoSideEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightModelTwoSideEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LineSmoothEnable }
     * 
     */
    public ProfileCG.Technique.Pass.LineSmoothEnable createProfileCGTechniquePassLineSmoothEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LineSmoothEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LineStippleEnable }
     * 
     */
    public ProfileCG.Technique.Pass.LineStippleEnable createProfileCGTechniquePassLineStippleEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LineStippleEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LogicOpEnable }
     * 
     */
    public ProfileCG.Technique.Pass.LogicOpEnable createProfileCGTechniquePassLogicOpEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LogicOpEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.MultisampleEnable }
     * 
     */
    public ProfileCG.Technique.Pass.MultisampleEnable createProfileCGTechniquePassMultisampleEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.MultisampleEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.NormalizeEnable }
     * 
     */
    public ProfileCG.Technique.Pass.NormalizeEnable createProfileCGTechniquePassNormalizeEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.NormalizeEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PointSmoothEnable }
     * 
     */
    public ProfileCG.Technique.Pass.PointSmoothEnable createProfileCGTechniquePassPointSmoothEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PointSmoothEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PolygonOffsetFillEnable }
     * 
     */
    public ProfileCG.Technique.Pass.PolygonOffsetFillEnable createProfileCGTechniquePassPolygonOffsetFillEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PolygonOffsetFillEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PolygonOffsetLineEnable }
     * 
     */
    public ProfileCG.Technique.Pass.PolygonOffsetLineEnable createProfileCGTechniquePassPolygonOffsetLineEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PolygonOffsetLineEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PolygonOffsetPointEnable }
     * 
     */
    public ProfileCG.Technique.Pass.PolygonOffsetPointEnable createProfileCGTechniquePassPolygonOffsetPointEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PolygonOffsetPointEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PolygonSmoothEnable }
     * 
     */
    public ProfileCG.Technique.Pass.PolygonSmoothEnable createProfileCGTechniquePassPolygonSmoothEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PolygonSmoothEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PolygonStippleEnable }
     * 
     */
    public ProfileCG.Technique.Pass.PolygonStippleEnable createProfileCGTechniquePassPolygonStippleEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PolygonStippleEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.RescaleNormalEnable }
     * 
     */
    public ProfileCG.Technique.Pass.RescaleNormalEnable createProfileCGTechniquePassRescaleNormalEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.RescaleNormalEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.SampleAlphaToCoverageEnable }
     * 
     */
    public ProfileCG.Technique.Pass.SampleAlphaToCoverageEnable createProfileCGTechniquePassSampleAlphaToCoverageEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.SampleAlphaToCoverageEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.SampleAlphaToOneEnable }
     * 
     */
    public ProfileCG.Technique.Pass.SampleAlphaToOneEnable createProfileCGTechniquePassSampleAlphaToOneEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.SampleAlphaToOneEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.SampleCoverageEnable }
     * 
     */
    public ProfileCG.Technique.Pass.SampleCoverageEnable createProfileCGTechniquePassSampleCoverageEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.SampleCoverageEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ScissorTestEnable }
     * 
     */
    public ProfileCG.Technique.Pass.ScissorTestEnable createProfileCGTechniquePassScissorTestEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ScissorTestEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilTestEnable }
     * 
     */
    public ProfileCG.Technique.Pass.StencilTestEnable createProfileCGTechniquePassStencilTestEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilTestEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Shader.CompilerTarget }
     * 
     */
    public ProfileCG.Technique.Pass.Shader.CompilerTarget createProfileCGTechniquePassShaderCompilerTarget() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.CompilerTargetImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Shader.Name }
     * 
     */
    public ProfileCG.Technique.Pass.Shader.Name createProfileCGTechniquePassShaderName() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.NameImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Shader.Bind.Param }
     * 
     */
    public ProfileCG.Technique.Pass.Shader.Bind.Param createProfileCGTechniquePassShaderBindParam() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.BindImpl.ParamImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilMaskSeparate.Face }
     * 
     */
    public ProfileCG.Technique.Pass.StencilMaskSeparate.Face createProfileCGTechniquePassStencilMaskSeparateFace() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskSeparateImpl.FaceImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilMaskSeparate.Mask }
     * 
     */
    public ProfileCG.Technique.Pass.StencilMaskSeparate.Mask createProfileCGTechniquePassStencilMaskSeparateMask() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskSeparateImpl.MaskImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilOpSeparate.Face }
     * 
     */
    public ProfileCG.Technique.Pass.StencilOpSeparate.Face createProfileCGTechniquePassStencilOpSeparateFace() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.FaceImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilOpSeparate.Fail }
     * 
     */
    public ProfileCG.Technique.Pass.StencilOpSeparate.Fail createProfileCGTechniquePassStencilOpSeparateFail() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.FailImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilOpSeparate.Zfail }
     * 
     */
    public ProfileCG.Technique.Pass.StencilOpSeparate.Zfail createProfileCGTechniquePassStencilOpSeparateZfail() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.ZfailImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilOpSeparate.Zpass }
     * 
     */
    public ProfileCG.Technique.Pass.StencilOpSeparate.Zpass createProfileCGTechniquePassStencilOpSeparateZpass() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.ZpassImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilFuncSeparate.Front }
     * 
     */
    public ProfileCG.Technique.Pass.StencilFuncSeparate.Front createProfileCGTechniquePassStencilFuncSeparateFront() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.FrontImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilFuncSeparate.Back }
     * 
     */
    public ProfileCG.Technique.Pass.StencilFuncSeparate.Back createProfileCGTechniquePassStencilFuncSeparateBack() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.BackImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilFuncSeparate.Ref }
     * 
     */
    public ProfileCG.Technique.Pass.StencilFuncSeparate.Ref createProfileCGTechniquePassStencilFuncSeparateRef() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.RefImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilFuncSeparate.Mask }
     * 
     */
    public ProfileCG.Technique.Pass.StencilFuncSeparate.Mask createProfileCGTechniquePassStencilFuncSeparateMask() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.MaskImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilOp.Fail }
     * 
     */
    public ProfileCG.Technique.Pass.StencilOp.Fail createProfileCGTechniquePassStencilOpFail() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl.FailImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilOp.Zfail }
     * 
     */
    public ProfileCG.Technique.Pass.StencilOp.Zfail createProfileCGTechniquePassStencilOpZfail() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZfailImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilOp.Zpass }
     * 
     */
    public ProfileCG.Technique.Pass.StencilOp.Zpass createProfileCGTechniquePassStencilOpZpass() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZpassImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilFunc.Func }
     * 
     */
    public ProfileCG.Technique.Pass.StencilFunc.Func createProfileCGTechniquePassStencilFuncFunc() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl.FuncImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilFunc.Ref }
     * 
     */
    public ProfileCG.Technique.Pass.StencilFunc.Ref createProfileCGTechniquePassStencilFuncRef() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl.RefImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilFunc.Mask }
     * 
     */
    public ProfileCG.Technique.Pass.StencilFunc.Mask createProfileCGTechniquePassStencilFuncMask() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl.MaskImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PolygonMode.Face }
     * 
     */
    public ProfileCG.Technique.Pass.PolygonMode.Face createProfileCGTechniquePassPolygonModeFace() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PolygonModeImpl.FaceImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PolygonMode.Mode }
     * 
     */
    public ProfileCG.Technique.Pass.PolygonMode.Mode createProfileCGTechniquePassPolygonModeMode() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PolygonModeImpl.ModeImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ColorMaterial.Face }
     * 
     */
    public ProfileCG.Technique.Pass.ColorMaterial.Face createProfileCGTechniquePassColorMaterialFace() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialImpl.FaceImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ColorMaterial.Mode }
     * 
     */
    public ProfileCG.Technique.Pass.ColorMaterial.Mode createProfileCGTechniquePassColorMaterialMode() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialImpl.ModeImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendEquationSeparate.Rgb }
     * 
     */
    public ProfileCG.Technique.Pass.BlendEquationSeparate.Rgb createProfileCGTechniquePassBlendEquationSeparateRgb() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationSeparateImpl.RgbImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendEquationSeparate.Alpha }
     * 
     */
    public ProfileCG.Technique.Pass.BlendEquationSeparate.Alpha createProfileCGTechniquePassBlendEquationSeparateAlpha() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationSeparateImpl.AlphaImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendFuncSeparate.SrcRgb }
     * 
     */
    public ProfileCG.Technique.Pass.BlendFuncSeparate.SrcRgb createProfileCGTechniquePassBlendFuncSeparateSrcRgb() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.SrcRgbImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendFuncSeparate.DestRgb }
     * 
     */
    public ProfileCG.Technique.Pass.BlendFuncSeparate.DestRgb createProfileCGTechniquePassBlendFuncSeparateDestRgb() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.DestRgbImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendFuncSeparate.SrcAlpha }
     * 
     */
    public ProfileCG.Technique.Pass.BlendFuncSeparate.SrcAlpha createProfileCGTechniquePassBlendFuncSeparateSrcAlpha() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.SrcAlphaImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendFuncSeparate.DestAlpha }
     * 
     */
    public ProfileCG.Technique.Pass.BlendFuncSeparate.DestAlpha createProfileCGTechniquePassBlendFuncSeparateDestAlpha() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.DestAlphaImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendFunc.Src }
     * 
     */
    public ProfileCG.Technique.Pass.BlendFunc.Src createProfileCGTechniquePassBlendFuncSrc() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncImpl.SrcImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendFunc.Dest }
     * 
     */
    public ProfileCG.Technique.Pass.BlendFunc.Dest createProfileCGTechniquePassBlendFuncDest() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncImpl.DestImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.AlphaFunc.Func }
     * 
     */
    public ProfileCG.Technique.Pass.AlphaFunc.Func createProfileCGTechniquePassAlphaFuncFunc() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.FuncImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.AlphaFunc.Value }
     * 
     */
    public ProfileCG.Technique.Pass.AlphaFunc.Value createProfileCGTechniquePassAlphaFuncValue() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.ValueImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Setparam }
     * 
     */
    public ProfileGLES.Technique.Setparam createProfileGLESTechniqueSetparam() {
        return new ProfileGLESImpl.TechniqueImpl.SetparamImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ClearColor }
     * 
     */
    public ProfileGLES.Technique.Pass.ClearColor createProfileGLESTechniquePassClearColor() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ClearColorImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ClearStencil }
     * 
     */
    public ProfileGLES.Technique.Pass.ClearStencil createProfileGLESTechniquePassClearStencil() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ClearStencilImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ClearDepth }
     * 
     */
    public ProfileGLES.Technique.Pass.ClearDepth createProfileGLESTechniquePassClearDepth() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ClearDepthImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ClipPlane }
     * 
     */
    public ProfileGLES.Technique.Pass.ClipPlane createProfileGLESTechniquePassClipPlane() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ClipPlaneImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ColorMask }
     * 
     */
    public ProfileGLES.Technique.Pass.ColorMask createProfileGLESTechniquePassColorMask() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ColorMaskImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.CullFace }
     * 
     */
    public ProfileGLES.Technique.Pass.CullFace createProfileGLESTechniquePassCullFace() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.CullFaceImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.DepthFunc }
     * 
     */
    public ProfileGLES.Technique.Pass.DepthFunc createProfileGLESTechniquePassDepthFunc() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.DepthFuncImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.DepthMask }
     * 
     */
    public ProfileGLES.Technique.Pass.DepthMask createProfileGLESTechniquePassDepthMask() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.DepthMaskImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.DepthRange }
     * 
     */
    public ProfileGLES.Technique.Pass.DepthRange createProfileGLESTechniquePassDepthRange() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.DepthRangeImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.FogColor }
     * 
     */
    public ProfileGLES.Technique.Pass.FogColor createProfileGLESTechniquePassFogColor() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.FogColorImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.FogDensity }
     * 
     */
    public ProfileGLES.Technique.Pass.FogDensity createProfileGLESTechniquePassFogDensity() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.FogDensityImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.FogMode }
     * 
     */
    public ProfileGLES.Technique.Pass.FogMode createProfileGLESTechniquePassFogMode() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.FogModeImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.FogStart }
     * 
     */
    public ProfileGLES.Technique.Pass.FogStart createProfileGLESTechniquePassFogStart() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.FogStartImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.FogEnd }
     * 
     */
    public ProfileGLES.Technique.Pass.FogEnd createProfileGLESTechniquePassFogEnd() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.FogEndImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.FrontFace }
     * 
     */
    public ProfileGLES.Technique.Pass.FrontFace createProfileGLESTechniquePassFrontFace() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.FrontFaceImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.TexturePipeline }
     * 
     */
    public ProfileGLES.Technique.Pass.TexturePipeline createProfileGLESTechniquePassTexturePipeline() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.TexturePipelineImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LogicOp }
     * 
     */
    public ProfileGLES.Technique.Pass.LogicOp createProfileGLESTechniquePassLogicOp() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LogicOpImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightAmbient }
     * 
     */
    public ProfileGLES.Technique.Pass.LightAmbient createProfileGLESTechniquePassLightAmbient() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightAmbientImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightDiffuse }
     * 
     */
    public ProfileGLES.Technique.Pass.LightDiffuse createProfileGLESTechniquePassLightDiffuse() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightDiffuseImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightSpecular }
     * 
     */
    public ProfileGLES.Technique.Pass.LightSpecular createProfileGLESTechniquePassLightSpecular() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightSpecularImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightPosition }
     * 
     */
    public ProfileGLES.Technique.Pass.LightPosition createProfileGLESTechniquePassLightPosition() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightPositionImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightConstantAttenuation }
     * 
     */
    public ProfileGLES.Technique.Pass.LightConstantAttenuation createProfileGLESTechniquePassLightConstantAttenuation() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightConstantAttenuationImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightLinearAttenutation }
     * 
     */
    public ProfileGLES.Technique.Pass.LightLinearAttenutation createProfileGLESTechniquePassLightLinearAttenutation() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightLinearAttenutationImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightQuadraticAttenuation }
     * 
     */
    public ProfileGLES.Technique.Pass.LightQuadraticAttenuation createProfileGLESTechniquePassLightQuadraticAttenuation() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightQuadraticAttenuationImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightSpotCutoff }
     * 
     */
    public ProfileGLES.Technique.Pass.LightSpotCutoff createProfileGLESTechniquePassLightSpotCutoff() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightSpotCutoffImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightSpotDirection }
     * 
     */
    public ProfileGLES.Technique.Pass.LightSpotDirection createProfileGLESTechniquePassLightSpotDirection() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightSpotDirectionImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightSpotExponent }
     * 
     */
    public ProfileGLES.Technique.Pass.LightSpotExponent createProfileGLESTechniquePassLightSpotExponent() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightSpotExponentImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightModelAmbient }
     * 
     */
    public ProfileGLES.Technique.Pass.LightModelAmbient createProfileGLESTechniquePassLightModelAmbient() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightModelAmbientImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LineWidth }
     * 
     */
    public ProfileGLES.Technique.Pass.LineWidth createProfileGLESTechniquePassLineWidth() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LineWidthImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.MaterialAmbient }
     * 
     */
    public ProfileGLES.Technique.Pass.MaterialAmbient createProfileGLESTechniquePassMaterialAmbient() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.MaterialAmbientImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.MaterialDiffuse }
     * 
     */
    public ProfileGLES.Technique.Pass.MaterialDiffuse createProfileGLESTechniquePassMaterialDiffuse() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.MaterialDiffuseImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.MaterialEmission }
     * 
     */
    public ProfileGLES.Technique.Pass.MaterialEmission createProfileGLESTechniquePassMaterialEmission() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.MaterialEmissionImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.MaterialShininess }
     * 
     */
    public ProfileGLES.Technique.Pass.MaterialShininess createProfileGLESTechniquePassMaterialShininess() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.MaterialShininessImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.MaterialSpecular }
     * 
     */
    public ProfileGLES.Technique.Pass.MaterialSpecular createProfileGLESTechniquePassMaterialSpecular() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.MaterialSpecularImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ModelViewMatrix }
     * 
     */
    public ProfileGLES.Technique.Pass.ModelViewMatrix createProfileGLESTechniquePassModelViewMatrix() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ModelViewMatrixImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.PointDistanceAttenuation }
     * 
     */
    public ProfileGLES.Technique.Pass.PointDistanceAttenuation createProfileGLESTechniquePassPointDistanceAttenuation() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.PointDistanceAttenuationImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.PointFadeThresholdSize }
     * 
     */
    public ProfileGLES.Technique.Pass.PointFadeThresholdSize createProfileGLESTechniquePassPointFadeThresholdSize() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.PointFadeThresholdSizeImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.PointSize }
     * 
     */
    public ProfileGLES.Technique.Pass.PointSize createProfileGLESTechniquePassPointSize() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.PointSizeImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.PointSizeMin }
     * 
     */
    public ProfileGLES.Technique.Pass.PointSizeMin createProfileGLESTechniquePassPointSizeMin() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.PointSizeMinImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.PointSizeMax }
     * 
     */
    public ProfileGLES.Technique.Pass.PointSizeMax createProfileGLESTechniquePassPointSizeMax() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.PointSizeMaxImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.PolygonOffset }
     * 
     */
    public ProfileGLES.Technique.Pass.PolygonOffset createProfileGLESTechniquePassPolygonOffset() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.PolygonOffsetImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ProjectionMatrix }
     * 
     */
    public ProfileGLES.Technique.Pass.ProjectionMatrix createProfileGLESTechniquePassProjectionMatrix() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ProjectionMatrixImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.Scissor }
     * 
     */
    public ProfileGLES.Technique.Pass.Scissor createProfileGLESTechniquePassScissor() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ScissorImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ShadeModel }
     * 
     */
    public ProfileGLES.Technique.Pass.ShadeModel createProfileGLESTechniquePassShadeModel() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ShadeModelImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.StencilMask }
     * 
     */
    public ProfileGLES.Technique.Pass.StencilMask createProfileGLESTechniquePassStencilMask() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.StencilMaskImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.AlphaTestEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.AlphaTestEnable createProfileGLESTechniquePassAlphaTestEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.AlphaTestEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.BlendEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.BlendEnable createProfileGLESTechniquePassBlendEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.BlendEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ClipPlaneEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.ClipPlaneEnable createProfileGLESTechniquePassClipPlaneEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ClipPlaneEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ColorLogicOpEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.ColorLogicOpEnable createProfileGLESTechniquePassColorLogicOpEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ColorLogicOpEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ColorMaterialEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.ColorMaterialEnable createProfileGLESTechniquePassColorMaterialEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ColorMaterialEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.CullFaceEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.CullFaceEnable createProfileGLESTechniquePassCullFaceEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.CullFaceEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.DepthTestEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.DepthTestEnable createProfileGLESTechniquePassDepthTestEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.DepthTestEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.DitherEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.DitherEnable createProfileGLESTechniquePassDitherEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.DitherEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.FogEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.FogEnable createProfileGLESTechniquePassFogEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.FogEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.TexturePipelineEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.TexturePipelineEnable createProfileGLESTechniquePassTexturePipelineEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.TexturePipelineEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.LightEnable createProfileGLESTechniquePassLightEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightingEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.LightingEnable createProfileGLESTechniquePassLightingEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightingEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightModelTwoSideEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.LightModelTwoSideEnable createProfileGLESTechniquePassLightModelTwoSideEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightModelTwoSideEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LineSmoothEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.LineSmoothEnable createProfileGLESTechniquePassLineSmoothEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LineSmoothEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.MultisampleEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.MultisampleEnable createProfileGLESTechniquePassMultisampleEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.MultisampleEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.NormalizeEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.NormalizeEnable createProfileGLESTechniquePassNormalizeEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.NormalizeEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.PointSmoothEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.PointSmoothEnable createProfileGLESTechniquePassPointSmoothEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.PointSmoothEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.PolygonOffsetFillEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.PolygonOffsetFillEnable createProfileGLESTechniquePassPolygonOffsetFillEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.PolygonOffsetFillEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.RescaleNormalEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.RescaleNormalEnable createProfileGLESTechniquePassRescaleNormalEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.RescaleNormalEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.SampleAlphaToCoverageEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.SampleAlphaToCoverageEnable createProfileGLESTechniquePassSampleAlphaToCoverageEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.SampleAlphaToCoverageEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.SampleAlphaToOneEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.SampleAlphaToOneEnable createProfileGLESTechniquePassSampleAlphaToOneEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.SampleAlphaToOneEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.SampleCoverageEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.SampleCoverageEnable createProfileGLESTechniquePassSampleCoverageEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.SampleCoverageEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ScissorTestEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.ScissorTestEnable createProfileGLESTechniquePassScissorTestEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ScissorTestEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.StencilTestEnable }
     * 
     */
    public ProfileGLES.Technique.Pass.StencilTestEnable createProfileGLESTechniquePassStencilTestEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.StencilTestEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.StencilOp.Fail }
     * 
     */
    public ProfileGLES.Technique.Pass.StencilOp.Fail createProfileGLESTechniquePassStencilOpFail() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl.FailImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.StencilOp.Zfail }
     * 
     */
    public ProfileGLES.Technique.Pass.StencilOp.Zfail createProfileGLESTechniquePassStencilOpZfail() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZfailImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.StencilOp.Zpass }
     * 
     */
    public ProfileGLES.Technique.Pass.StencilOp.Zpass createProfileGLESTechniquePassStencilOpZpass() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZpassImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.StencilFunc.Func }
     * 
     */
    public ProfileGLES.Technique.Pass.StencilFunc.Func createProfileGLESTechniquePassStencilFuncFunc() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl.FuncImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.StencilFunc.Ref }
     * 
     */
    public ProfileGLES.Technique.Pass.StencilFunc.Ref createProfileGLESTechniquePassStencilFuncRef() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl.RefImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.StencilFunc.Mask }
     * 
     */
    public ProfileGLES.Technique.Pass.StencilFunc.Mask createProfileGLESTechniquePassStencilFuncMask() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl.MaskImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.BlendFunc.Src }
     * 
     */
    public ProfileGLES.Technique.Pass.BlendFunc.Src createProfileGLESTechniquePassBlendFuncSrc() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.BlendFuncImpl.SrcImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.BlendFunc.Dest }
     * 
     */
    public ProfileGLES.Technique.Pass.BlendFunc.Dest createProfileGLESTechniquePassBlendFuncDest() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.BlendFuncImpl.DestImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.AlphaFunc.Func }
     * 
     */
    public ProfileGLES.Technique.Pass.AlphaFunc.Func createProfileGLESTechniquePassAlphaFuncFunc() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.FuncImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.AlphaFunc.Value }
     * 
     */
    public ProfileGLES.Technique.Pass.AlphaFunc.Value createProfileGLESTechniquePassAlphaFuncValue() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.ValueImpl();
    }

    /**
     * Create an instance of {@link ProfileCOMMON.Technique.Blinn }
     * 
     */
    public ProfileCOMMON.Technique.Blinn createProfileCOMMONTechniqueBlinn() {
        return new ProfileCOMMONImpl.TechniqueImpl.BlinnImpl();
    }

    /**
     * Create an instance of {@link ProfileCOMMON.Technique.Phong }
     * 
     */
    public ProfileCOMMON.Technique.Phong createProfileCOMMONTechniquePhong() {
        return new ProfileCOMMONImpl.TechniqueImpl.PhongImpl();
    }

    /**
     * Create an instance of {@link ProfileCOMMON.Technique.Lambert }
     * 
     */
    public ProfileCOMMON.Technique.Lambert createProfileCOMMONTechniqueLambert() {
        return new ProfileCOMMONImpl.TechniqueImpl.LambertImpl();
    }

    /**
     * Create an instance of {@link ProfileCOMMON.Technique.Constant }
     * 
     */
    public ProfileCOMMON.Technique.Constant createProfileCOMMONTechniqueConstant() {
        return new ProfileCOMMONImpl.TechniqueImpl.ConstantImpl();
    }

    /**
     * Create an instance of {@link VisualScene.EvaluateScene.Render }
     * 
     */
    public VisualScene.EvaluateScene.Render createVisualSceneEvaluateSceneRender() {
        return new VisualSceneImpl.EvaluateSceneImpl.RenderImpl();
    }

    /**
     * Create an instance of {@link RigidBody.TechniqueCommon.Dynamic }
     * 
     */
    public RigidBody.TechniqueCommon.Dynamic createRigidBodyTechniqueCommonDynamic() {
        return new RigidBodyImpl.TechniqueCommonImpl.DynamicImpl();
    }

    /**
     * Create an instance of {@link RigidBody.TechniqueCommon.MassFrame }
     * 
     */
    public RigidBody.TechniqueCommon.MassFrame createRigidBodyTechniqueCommonMassFrame() {
        return new RigidBodyImpl.TechniqueCommonImpl.MassFrameImpl();
    }

    /**
     * Create an instance of {@link RigidBody.TechniqueCommon.Shape.Hollow }
     * 
     */
    public RigidBody.TechniqueCommon.Shape.Hollow createRigidBodyTechniqueCommonShapeHollow() {
        return new RigidBodyImpl.TechniqueCommonImpl.ShapeImpl.HollowImpl();
    }

    /**
     * Create an instance of {@link Light.TechniqueCommon.Spot }
     * 
     */
    public Light.TechniqueCommon.Spot createLightTechniqueCommonSpot() {
        return new LightImpl.TechniqueCommonImpl.SpotImpl();
    }

    /**
     * Create an instance of {@link Light.TechniqueCommon.Point }
     * 
     */
    public Light.TechniqueCommon.Point createLightTechniqueCommonPoint() {
        return new LightImpl.TechniqueCommonImpl.PointImpl();
    }

    /**
     * Create an instance of {@link Light.TechniqueCommon.Directional }
     * 
     */
    public Light.TechniqueCommon.Directional createLightTechniqueCommonDirectional() {
        return new LightImpl.TechniqueCommonImpl.DirectionalImpl();
    }

    /**
     * Create an instance of {@link Light.TechniqueCommon.Ambient }
     * 
     */
    public Light.TechniqueCommon.Ambient createLightTechniqueCommonAmbient() {
        return new LightImpl.TechniqueCommonImpl.AmbientImpl();
    }

    /**
     * Create an instance of {@link InstanceRigidBody.TechniqueCommon.Dynamic }
     * 
     */
    public InstanceRigidBody.TechniqueCommon.Dynamic createInstanceRigidBodyTechniqueCommonDynamic() {
        return new InstanceRigidBodyImpl.TechniqueCommonImpl.DynamicImpl();
    }

    /**
     * Create an instance of {@link InstanceRigidBody.TechniqueCommon.MassFrame }
     * 
     */
    public InstanceRigidBody.TechniqueCommon.MassFrame createInstanceRigidBodyTechniqueCommonMassFrame() {
        return new InstanceRigidBodyImpl.TechniqueCommonImpl.MassFrameImpl();
    }

    /**
     * Create an instance of {@link InstanceRigidBody.TechniqueCommon.Shape.Hollow }
     * 
     */
    public InstanceRigidBody.TechniqueCommon.Shape.Hollow createInstanceRigidBodyTechniqueCommonShapeHollow() {
        return new InstanceRigidBodyImpl.TechniqueCommonImpl.ShapeImpl.HollowImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.TechniqueCommon.Enabled }
     * 
     */
    public RigidConstraint.TechniqueCommon.Enabled createRigidConstraintTechniqueCommonEnabled() {
        return new RigidConstraintImpl.TechniqueCommonImpl.EnabledImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.TechniqueCommon.Interpenetrate }
     * 
     */
    public RigidConstraint.TechniqueCommon.Interpenetrate createRigidConstraintTechniqueCommonInterpenetrate() {
        return new RigidConstraintImpl.TechniqueCommonImpl.InterpenetrateImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.TechniqueCommon.Spring.Angular }
     * 
     */
    public RigidConstraint.TechniqueCommon.Spring.Angular createRigidConstraintTechniqueCommonSpringAngular() {
        return new RigidConstraintImpl.TechniqueCommonImpl.SpringImpl.AngularImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.TechniqueCommon.Spring.Linear }
     * 
     */
    public RigidConstraint.TechniqueCommon.Spring.Linear createRigidConstraintTechniqueCommonSpringLinear() {
        return new RigidConstraintImpl.TechniqueCommonImpl.SpringImpl.LinearImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.TechniqueCommon.Limits.SwingConeAndTwist }
     * 
     */
    public RigidConstraint.TechniqueCommon.Limits.SwingConeAndTwist createRigidConstraintTechniqueCommonLimitsSwingConeAndTwist() {
        return new RigidConstraintImpl.TechniqueCommonImpl.LimitsImpl.SwingConeAndTwistImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.TechniqueCommon.Limits.Linear }
     * 
     */
    public RigidConstraint.TechniqueCommon.Limits.Linear createRigidConstraintTechniqueCommonLimitsLinear() {
        return new RigidConstraintImpl.TechniqueCommonImpl.LimitsImpl.LinearImpl();
    }

    /**
     * Create an instance of {@link Camera.Optics.TechniqueCommon.Perspective }
     * 
     */
    public Camera.Optics.TechniqueCommon.Perspective createCameraOpticsTechniqueCommonPerspective() {
        return new CameraImpl.OpticsImpl.TechniqueCommonImpl.PerspectiveImpl();
    }

    /**
     * Create an instance of {@link Camera.Optics.TechniqueCommon.Orthographic }
     * 
     */
    public Camera.Optics.TechniqueCommon.Orthographic createCameraOpticsTechniqueCommonOrthographic() {
        return new CameraImpl.OpticsImpl.TechniqueCommonImpl.OrthographicImpl();
    }

    /**
     * Create an instance of {@link ProfileGLSL.Technique.Pass.Shader.CompilerTarget }
     * 
     */
    public ProfileGLSL.Technique.Pass.Shader.CompilerTarget createProfileGLSLTechniquePassShaderCompilerTarget() {
        return new ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.CompilerTargetImpl();
    }

    /**
     * Create an instance of {@link ProfileGLSL.Technique.Pass.Shader.Name }
     * 
     */
    public ProfileGLSL.Technique.Pass.Shader.Name createProfileGLSLTechniquePassShaderName() {
        return new ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.NameImpl();
    }

    /**
     * Create an instance of {@link ProfileGLSL.Technique.Pass.Shader.Bind.Param }
     * 
     */
    public ProfileGLSL.Technique.Pass.Shader.Bind.Param createProfileGLSLTechniquePassShaderBindParam() {
        return new ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.BindImpl.ParamImpl();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetableFloat3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "translate")
    public JAXBElement<TargetableFloat3> createTranslate(TargetableFloat3 value) {
        return new JAXBElement<TargetableFloat3>(_Translate_QNAME, ((Class) TargetableFloat3Impl.class), null, ((TargetableFloat3Impl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetableFloat3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "scale")
    public JAXBElement<TargetableFloat3> createScale(TargetableFloat3 value) {
        return new JAXBElement<TargetableFloat3>(_Scale_QNAME, ((Class) TargetableFloat3Impl.class), null, ((TargetableFloat3Impl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileGLSL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "profile_GLSL", substitutionHeadNamespace = "http://www.collada.org/2005/11/COLLADASchema", substitutionHeadName = "fx_profile_abstract")
    public JAXBElement<ProfileGLSL> createProfileGLSL(ProfileGLSL value) {
        return new JAXBElement<ProfileGLSL>(_ProfileGLSL_QNAME, ((Class) ProfileGLSLImpl.class), null, ((ProfileGLSLImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstanceWithExtra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "instance_physics_material")
    public JAXBElement<InstanceWithExtra> createInstancePhysicsMaterial(InstanceWithExtra value) {
        return new JAXBElement<InstanceWithExtra>(_InstancePhysicsMaterial_QNAME, ((Class) InstanceWithExtraImpl.class), null, ((InstanceWithExtraImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileGLES }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "profile_GLES", substitutionHeadNamespace = "http://www.collada.org/2005/11/COLLADASchema", substitutionHeadName = "fx_profile_abstract")
    public JAXBElement<ProfileGLES> createProfileGLES(ProfileGLES value) {
        return new JAXBElement<ProfileGLES>(_ProfileGLES_QNAME, ((Class) ProfileGLESImpl.class), null, ((ProfileGLESImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link BigInteger }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "p")
    public JAXBElement<List<BigInteger>> createP(List<BigInteger> value) {
        return new JAXBElement<List<BigInteger>>(_P_QNAME, ((Class) List.class), null, ((List<BigInteger> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fx_profile_abstract")
    public JAXBElement<Object> createFxProfileAbstract(Object value) {
        return new JAXBElement<Object>(_FxProfileAbstract_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstanceWithExtra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "instance_force_field")
    public JAXBElement<InstanceWithExtra> createInstanceForceField(InstanceWithExtra value) {
        return new JAXBElement<InstanceWithExtra>(_InstanceForceField_QNAME, ((Class) InstanceWithExtraImpl.class), null, ((InstanceWithExtraImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstanceWithExtra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "instance_camera")
    public JAXBElement<InstanceWithExtra> createInstanceCamera(InstanceWithExtra value) {
        return new JAXBElement<InstanceWithExtra>(_InstanceCamera_QNAME, ((Class) InstanceWithExtraImpl.class), null, ((InstanceWithExtraImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileCG }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "profile_CG", substitutionHeadNamespace = "http://www.collada.org/2005/11/COLLADASchema", substitutionHeadName = "fx_profile_abstract")
    public JAXBElement<ProfileCG> createProfileCG(ProfileCG value) {
        return new JAXBElement<ProfileCG>(_ProfileCG_QNAME, ((Class) ProfileCGImpl.class), null, ((ProfileCGImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "gl_hook_abstract")
    public JAXBElement<Object> createGlHookAbstract(Object value) {
        return new JAXBElement<Object>(_GlHookAbstract_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileCOMMON }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "profile_COMMON", substitutionHeadNamespace = "http://www.collada.org/2005/11/COLLADASchema", substitutionHeadName = "fx_profile_abstract")
    public JAXBElement<ProfileCOMMON> createProfileCOMMON(ProfileCOMMON value) {
        return new JAXBElement<ProfileCOMMON>(_ProfileCOMMON_QNAME, ((Class) ProfileCOMMONImpl.class), null, ((ProfileCOMMONImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstanceWithExtra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "instance_node")
    public JAXBElement<InstanceWithExtra> createInstanceNode(InstanceWithExtra value) {
        return new JAXBElement<InstanceWithExtra>(_InstanceNode_QNAME, ((Class) InstanceWithExtraImpl.class), null, ((InstanceWithExtraImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstanceWithExtra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "instance_light")
    public JAXBElement<InstanceWithExtra> createInstanceLight(InstanceWithExtra value) {
        return new JAXBElement<InstanceWithExtra>(_InstanceLight_QNAME, ((Class) InstanceWithExtraImpl.class), null, ((InstanceWithExtraImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<Boolean> createGlslSetarrayTypeBool(Boolean value) {
        return new JAXBElement<Boolean>(_GlslSetarrayTypeBool_QNAME, Boolean.class, GlslSetarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlslSurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "surface", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<GlslSurfaceType> createGlslSetarrayTypeSurface(GlslSurfaceType value) {
        return new JAXBElement<GlslSurfaceType>(_GlslSetarrayTypeSurface_QNAME, ((Class) GlslSurfaceTypeImpl.class), GlslSetarrayTypeImpl.class, ((GlslSurfaceTypeImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float2", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createGlslSetarrayTypeFloat2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat2_QNAME, ((Class) List.class), GlslSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float3", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createGlslSetarrayTypeFloat3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat3_QNAME, ((Class) List.class), GlslSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<java.lang.Float> createGlslSetarrayTypeFloat(java.lang.Float value) {
        return new JAXBElement<java.lang.Float>(_GlslSetarrayTypeFloat_QNAME, java.lang.Float.class, GlslSetarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float4", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createGlslSetarrayTypeFloat4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat4_QNAME, ((Class) List.class), GlslSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSampler1D }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler1D", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<GlSampler1D> createGlslSetarrayTypeSampler1D(GlSampler1D value) {
        return new JAXBElement<GlSampler1D>(_GlslSetarrayTypeSampler1D_QNAME, ((Class) GlSampler1DImpl.class), GlslSetarrayTypeImpl.class, ((GlSampler1DImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSampler2D }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler2D", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<GlSampler2D> createGlslSetarrayTypeSampler2D(GlSampler2D value) {
        return new JAXBElement<GlSampler2D>(_GlslSetarrayTypeSampler2D_QNAME, ((Class) GlSampler2DImpl.class), GlslSetarrayTypeImpl.class, ((GlSampler2DImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<Integer> createGlslSetarrayTypeInt(Integer value) {
        return new JAXBElement<Integer>(_GlslSetarrayTypeInt_QNAME, Integer.class, GlslSetarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSampler3D }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler3D", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<GlSampler3D> createGlslSetarrayTypeSampler3D(GlSampler3D value) {
        return new JAXBElement<GlSampler3D>(_GlslSetarrayTypeSampler3D_QNAME, ((Class) GlSampler3DImpl.class), GlslSetarrayTypeImpl.class, ((GlSampler3DImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "enum", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<String> createGlslSetarrayTypeEnum(String value) {
        return new JAXBElement<String>(_GlslSetarrayTypeEnum_QNAME, String.class, GlslSetarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSamplerCUBE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerCUBE", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<GlSamplerCUBE> createGlslSetarrayTypeSamplerCUBE(GlSamplerCUBE value) {
        return new JAXBElement<GlSamplerCUBE>(_GlslSetarrayTypeSamplerCUBE_QNAME, ((Class) GlSamplerCUBEImpl.class), GlslSetarrayTypeImpl.class, ((GlSamplerCUBEImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int4", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createGlslSetarrayTypeInt4(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_GlslSetarrayTypeInt4_QNAME, ((Class) List.class), GlslSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int3", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createGlslSetarrayTypeInt3(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_GlslSetarrayTypeInt3_QNAME, ((Class) List.class), GlslSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlslSetarrayType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "array", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<GlslSetarrayType> createGlslSetarrayTypeArray(GlslSetarrayType value) {
        return new JAXBElement<GlslSetarrayType>(_GlslSetarrayTypeArray_QNAME, ((Class) GlslSetarrayTypeImpl.class), GlslSetarrayTypeImpl.class, ((GlslSetarrayTypeImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool3", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createGlslSetarrayTypeBool3(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_GlslSetarrayTypeBool3_QNAME, ((Class) List.class), GlslSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool2", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createGlslSetarrayTypeBool2(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_GlslSetarrayTypeBool2_QNAME, ((Class) List.class), GlslSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int2", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createGlslSetarrayTypeInt2(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_GlslSetarrayTypeInt2_QNAME, ((Class) List.class), GlslSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSamplerRECT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerRECT", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<GlSamplerRECT> createGlslSetarrayTypeSamplerRECT(GlSamplerRECT value) {
        return new JAXBElement<GlSamplerRECT>(_GlslSetarrayTypeSamplerRECT_QNAME, ((Class) GlSamplerRECTImpl.class), GlslSetarrayTypeImpl.class, ((GlSamplerRECTImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool4", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createGlslSetarrayTypeBool4(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_GlslSetarrayTypeBool4_QNAME, ((Class) List.class), GlslSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float3x3", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createGlslSetarrayTypeFloat3X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat3X3_QNAME, ((Class) List.class), GlslSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSamplerDEPTH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerDEPTH", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<GlSamplerDEPTH> createGlslSetarrayTypeSamplerDEPTH(GlSamplerDEPTH value) {
        return new JAXBElement<GlSamplerDEPTH>(_GlslSetarrayTypeSamplerDEPTH_QNAME, ((Class) GlSamplerDEPTHImpl.class), GlslSetarrayTypeImpl.class, ((GlSamplerDEPTHImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float2x2", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createGlslSetarrayTypeFloat2X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat2X2_QNAME, ((Class) List.class), GlslSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float4x4", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createGlslSetarrayTypeFloat4X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat4X4_QNAME, ((Class) List.class), GlslSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Polygons.Ph }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "ph", scope = PolygonsImpl.class)
    public JAXBElement<Polygons.Ph> createPolygonsPh(Polygons.Ph value) {
        return new JAXBElement<Polygons.Ph>(_PolygonsPh_QNAME, ((Class) PolygonsImpl.PhImpl.class), PolygonsImpl.class, ((PolygonsImpl.PhImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<Boolean> createGlslNewarrayTypeBool(Boolean value) {
        return new JAXBElement<Boolean>(_GlslSetarrayTypeBool_QNAME, Boolean.class, GlslNewarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlslSurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "surface", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<GlslSurfaceType> createGlslNewarrayTypeSurface(GlslSurfaceType value) {
        return new JAXBElement<GlslSurfaceType>(_GlslSetarrayTypeSurface_QNAME, ((Class) GlslSurfaceTypeImpl.class), GlslNewarrayTypeImpl.class, ((GlslSurfaceTypeImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float2", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createGlslNewarrayTypeFloat2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat2_QNAME, ((Class) List.class), GlslNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float3", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createGlslNewarrayTypeFloat3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat3_QNAME, ((Class) List.class), GlslNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<java.lang.Float> createGlslNewarrayTypeFloat(java.lang.Float value) {
        return new JAXBElement<java.lang.Float>(_GlslSetarrayTypeFloat_QNAME, java.lang.Float.class, GlslNewarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float4", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createGlslNewarrayTypeFloat4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat4_QNAME, ((Class) List.class), GlslNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSampler1D }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler1D", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<GlSampler1D> createGlslNewarrayTypeSampler1D(GlSampler1D value) {
        return new JAXBElement<GlSampler1D>(_GlslSetarrayTypeSampler1D_QNAME, ((Class) GlSampler1DImpl.class), GlslNewarrayTypeImpl.class, ((GlSampler1DImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSampler2D }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler2D", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<GlSampler2D> createGlslNewarrayTypeSampler2D(GlSampler2D value) {
        return new JAXBElement<GlSampler2D>(_GlslSetarrayTypeSampler2D_QNAME, ((Class) GlSampler2DImpl.class), GlslNewarrayTypeImpl.class, ((GlSampler2DImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<Integer> createGlslNewarrayTypeInt(Integer value) {
        return new JAXBElement<Integer>(_GlslSetarrayTypeInt_QNAME, Integer.class, GlslNewarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSampler3D }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler3D", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<GlSampler3D> createGlslNewarrayTypeSampler3D(GlSampler3D value) {
        return new JAXBElement<GlSampler3D>(_GlslSetarrayTypeSampler3D_QNAME, ((Class) GlSampler3DImpl.class), GlslNewarrayTypeImpl.class, ((GlSampler3DImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "enum", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<String> createGlslNewarrayTypeEnum(String value) {
        return new JAXBElement<String>(_GlslSetarrayTypeEnum_QNAME, String.class, GlslNewarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSamplerCUBE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerCUBE", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<GlSamplerCUBE> createGlslNewarrayTypeSamplerCUBE(GlSamplerCUBE value) {
        return new JAXBElement<GlSamplerCUBE>(_GlslSetarrayTypeSamplerCUBE_QNAME, ((Class) GlSamplerCUBEImpl.class), GlslNewarrayTypeImpl.class, ((GlSamplerCUBEImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int4", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createGlslNewarrayTypeInt4(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_GlslSetarrayTypeInt4_QNAME, ((Class) List.class), GlslNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int3", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createGlslNewarrayTypeInt3(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_GlslSetarrayTypeInt3_QNAME, ((Class) List.class), GlslNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlslNewarrayType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "array", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<GlslNewarrayType> createGlslNewarrayTypeArray(GlslNewarrayType value) {
        return new JAXBElement<GlslNewarrayType>(_GlslSetarrayTypeArray_QNAME, ((Class) GlslNewarrayTypeImpl.class), GlslNewarrayTypeImpl.class, ((GlslNewarrayTypeImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool3", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createGlslNewarrayTypeBool3(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_GlslSetarrayTypeBool3_QNAME, ((Class) List.class), GlslNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool2", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createGlslNewarrayTypeBool2(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_GlslSetarrayTypeBool2_QNAME, ((Class) List.class), GlslNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int2", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createGlslNewarrayTypeInt2(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_GlslSetarrayTypeInt2_QNAME, ((Class) List.class), GlslNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSamplerRECT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerRECT", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<GlSamplerRECT> createGlslNewarrayTypeSamplerRECT(GlSamplerRECT value) {
        return new JAXBElement<GlSamplerRECT>(_GlslSetarrayTypeSamplerRECT_QNAME, ((Class) GlSamplerRECTImpl.class), GlslNewarrayTypeImpl.class, ((GlSamplerRECTImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool4", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createGlslNewarrayTypeBool4(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_GlslSetarrayTypeBool4_QNAME, ((Class) List.class), GlslNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float3x3", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createGlslNewarrayTypeFloat3X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat3X3_QNAME, ((Class) List.class), GlslNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSamplerDEPTH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerDEPTH", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<GlSamplerDEPTH> createGlslNewarrayTypeSamplerDEPTH(GlSamplerDEPTH value) {
        return new JAXBElement<GlSamplerDEPTH>(_GlslSetarrayTypeSamplerDEPTH_QNAME, ((Class) GlSamplerDEPTHImpl.class), GlslNewarrayTypeImpl.class, ((GlSamplerDEPTHImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float2x2", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createGlslNewarrayTypeFloat2X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat2X2_QNAME, ((Class) List.class), GlslNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float4x4", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createGlslNewarrayTypeFloat4X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat4X4_QNAME, ((Class) List.class), GlslNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link BigInteger }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "h", scope = PolygonsImpl.PhImpl.class)
    public JAXBElement<List<BigInteger>> createPolygonsPhH(List<BigInteger> value) {
        return new JAXBElement<List<BigInteger>>(_PolygonsPhH_QNAME, ((Class) List.class), PolygonsImpl.PhImpl.class, ((List<BigInteger> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int3x1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetuserTypeInt3X1(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt3X1_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int3x2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetuserTypeInt3X2(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt3X2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int3x3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetuserTypeInt3X3(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt3X3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSetuserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "usertype", scope = CgSetuserTypeImpl.class)
    public JAXBElement<CgSetuserType> createCgSetuserTypeUsertype(CgSetuserType value) {
        return new JAXBElement<CgSetuserType>(_CgSetuserTypeUsertype_QNAME, ((Class) CgSetuserTypeImpl.class), CgSetuserTypeImpl.class, ((CgSetuserTypeImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half1x4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeHalf1X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf1X4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half1x3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeHalf1X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf1X3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half1x2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeHalf1X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf1X2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeHalf2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half1x1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeHalf1X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf1X1_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<java.lang.Float> createCgSetuserTypeHalf1(java.lang.Float value) {
        return new JAXBElement<java.lang.Float>(_CgSetuserTypeHalf1_QNAME, java.lang.Float.class, CgSetuserTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed", scope = CgSetuserTypeImpl.class)
    public JAXBElement<java.lang.Float> createCgSetuserTypeFixed(java.lang.Float value) {
        return new JAXBElement<java.lang.Float>(_CgSetuserTypeFixed_QNAME, java.lang.Float.class, CgSetuserTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeHalf4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeHalf3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float", scope = CgSetuserTypeImpl.class)
    public JAXBElement<java.lang.Float> createCgSetuserTypeFloat(java.lang.Float value) {
        return new JAXBElement<java.lang.Float>(_GlslSetarrayTypeFloat_QNAME, java.lang.Float.class, CgSetuserTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int3x4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetuserTypeInt3X4(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt3X4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed3x2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFixed3X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed3X2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed3x1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFixed3X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed3X1_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed3x4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFixed3X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed3X4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed3x3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFixed3X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed3X3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float3x4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFloat3X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat3X4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float3x3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFloat3X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat3X3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool2x4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetuserTypeBool2X4(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool2X4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float3x2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFloat3X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat3X2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float3x1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFloat3X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat3X1_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool2x2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetuserTypeBool2X2(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool2X2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool2x3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetuserTypeBool2X3(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool2X3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgConnectParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "connect_param", scope = CgSetuserTypeImpl.class)
    public JAXBElement<CgConnectParam> createCgSetuserTypeConnectParam(CgConnectParam value) {
        return new JAXBElement<CgConnectParam>(_CgSetuserTypeConnectParam_QNAME, ((Class) CgConnectParamImpl.class), CgSetuserTypeImpl.class, ((CgConnectParamImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool2x1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetuserTypeBool2X1(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool2X1_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int", scope = CgSetuserTypeImpl.class)
    public JAXBElement<Integer> createCgSetuserTypeInt(Integer value) {
        return new JAXBElement<Integer>(_GlslSetarrayTypeInt_QNAME, Integer.class, CgSetuserTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int4x1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetuserTypeInt4X1(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt4X1_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int4x2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetuserTypeInt4X2(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt4X2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half4x2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeHalf4X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf4X2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half4x1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeHalf4X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf4X1_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half4x4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeHalf4X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf4X4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSamplerRECT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerRECT", scope = CgSetuserTypeImpl.class)
    public JAXBElement<CgSamplerRECT> createCgSetuserTypeSamplerRECT(CgSamplerRECT value) {
        return new JAXBElement<CgSamplerRECT>(_GlslSetarrayTypeSamplerRECT_QNAME, ((Class) CgSamplerRECTImpl.class), CgSetuserTypeImpl.class, ((CgSamplerRECTImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half4x3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeHalf4X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf4X3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool", scope = CgSetuserTypeImpl.class)
    public JAXBElement<Boolean> createCgSetuserTypeBool(Boolean value) {
        return new JAXBElement<Boolean>(_GlslSetarrayTypeBool_QNAME, Boolean.class, CgSetuserTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "string", scope = CgSetuserTypeImpl.class)
    public JAXBElement<String> createCgSetuserTypeString(String value) {
        return new JAXBElement<String>(_CgSetuserTypeString_QNAME, String.class, CgSetuserTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSetarrayType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "array", scope = CgSetuserTypeImpl.class)
    public JAXBElement<CgSetarrayType> createCgSetuserTypeArray(CgSetarrayType value) {
        return new JAXBElement<CgSetarrayType>(_GlslSetarrayTypeArray_QNAME, ((Class) CgSetarrayTypeImpl.class), CgSetuserTypeImpl.class, ((CgSetarrayTypeImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int4x3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetuserTypeInt4X3(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt4X3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed2x3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFixed2X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed2X3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int4x4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetuserTypeInt4X4(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt4X4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed2x2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFixed2X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed2X2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed2x4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFixed2X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed2X4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float4x3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFloat4X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat4X3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float4x2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFloat4X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat4X2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool3x3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetuserTypeBool3X3(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool3X3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float4x1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFloat4X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat4X1_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed2x1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFixed2X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed2X1_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool3x4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetuserTypeBool3X4(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool3X4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool3x1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetuserTypeBool3X1(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool3X1_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool3x2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetuserTypeBool3X2(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool3X2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float4x4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFloat4X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat4X4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "surface", scope = CgSetuserTypeImpl.class)
    public JAXBElement<CgSurfaceType> createCgSetuserTypeSurface(CgSurfaceType value) {
        return new JAXBElement<CgSurfaceType>(_GlslSetarrayTypeSurface_QNAME, ((Class) CgSurfaceTypeImpl.class), CgSetuserTypeImpl.class, ((CgSurfaceTypeImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int1x2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetuserTypeInt1X2(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt1X2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int1x3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetuserTypeInt1X3(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt1X3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int1x4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetuserTypeInt1X4(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt1X4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSampler3D }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler3D", scope = CgSetuserTypeImpl.class)
    public JAXBElement<CgSampler3D> createCgSetuserTypeSampler3D(CgSampler3D value) {
        return new JAXBElement<CgSampler3D>(_GlslSetarrayTypeSampler3D_QNAME, ((Class) CgSampler3DImpl.class), CgSetuserTypeImpl.class, ((CgSampler3DImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "enum", scope = CgSetuserTypeImpl.class)
    public JAXBElement<String> createCgSetuserTypeEnum(String value) {
        return new JAXBElement<String>(_GlslSetarrayTypeEnum_QNAME, String.class, CgSetuserTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSamplerCUBE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerCUBE", scope = CgSetuserTypeImpl.class)
    public JAXBElement<CgSamplerCUBE> createCgSetuserTypeSamplerCUBE(CgSamplerCUBE value) {
        return new JAXBElement<CgSamplerCUBE>(_GlslSetarrayTypeSamplerCUBE_QNAME, ((Class) CgSamplerCUBEImpl.class), CgSetuserTypeImpl.class, ((CgSamplerCUBEImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int1x1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetuserTypeInt1X1(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt1X1_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half3x3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeHalf3X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf3X3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half3x2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeHalf3X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf3X2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half3x1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeHalf3X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf3X1_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFixed2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFixed3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half3x4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeHalf3X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf3X4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<java.lang.Float> createCgSetuserTypeFixed1(java.lang.Float value) {
        return new JAXBElement<java.lang.Float>(_CgSetuserTypeFixed1_QNAME, java.lang.Float.class, CgSetuserTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float1x2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFloat1X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat1X2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float1x1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFloat1X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat1X1_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half", scope = CgSetuserTypeImpl.class)
    public JAXBElement<java.lang.Float> createCgSetuserTypeHalf(java.lang.Float value) {
        return new JAXBElement<java.lang.Float>(_CgSetuserTypeHalf_QNAME, java.lang.Float.class, CgSetuserTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSampler2D }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler2D", scope = CgSetuserTypeImpl.class)
    public JAXBElement<CgSampler2D> createCgSetuserTypeSampler2D(CgSampler2D value) {
        return new JAXBElement<CgSampler2D>(_GlslSetarrayTypeSampler2D_QNAME, ((Class) CgSampler2DImpl.class), CgSetuserTypeImpl.class, ((CgSampler2DImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetuserTypeInt4(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_GlslSetarrayTypeInt4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetuserTypeInt3(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_GlslSetarrayTypeInt3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetuserTypeBool3(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_GlslSetarrayTypeBool3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed1x4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFixed1X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed1X4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetuserTypeBool2(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_GlslSetarrayTypeBool2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed1x3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFixed1X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed1X3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetuserTypeInt2(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_GlslSetarrayTypeInt2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetuserTypeBool4(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_GlslSetarrayTypeBool4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<Integer> createCgSetuserTypeInt1(Integer value) {
        return new JAXBElement<Integer>(_CgSetuserTypeInt1_QNAME, Integer.class, CgSetuserTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool4x4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetuserTypeBool4X4(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool4X4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<Boolean> createCgSetuserTypeBool1(Boolean value) {
        return new JAXBElement<Boolean>(_CgSetuserTypeBool1_QNAME, Boolean.class, CgSetuserTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool4x2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetuserTypeBool4X2(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool4X2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float1x4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFloat1X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat1X4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed1x2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFixed1X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed1X2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool4x3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetuserTypeBool4X3(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool4X3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float1x3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFloat1X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat1X3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed1x1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFixed1X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed1X1_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool4x1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetuserTypeBool4X1(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool4X1_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<java.lang.Float> createCgSetuserTypeFloat1(java.lang.Float value) {
        return new JAXBElement<java.lang.Float>(_CgSetuserTypeFloat1_QNAME, java.lang.Float.class, CgSetuserTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFloat2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFloat3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFloat4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int2x1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetuserTypeInt2X1(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt2X1_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSampler1D }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler1D", scope = CgSetuserTypeImpl.class)
    public JAXBElement<CgSampler1D> createCgSetuserTypeSampler1D(CgSampler1D value) {
        return new JAXBElement<CgSampler1D>(_GlslSetarrayTypeSampler1D_QNAME, ((Class) CgSampler1DImpl.class), CgSetuserTypeImpl.class, ((CgSampler1DImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int2x2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetuserTypeInt2X2(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt2X2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int2x3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetuserTypeInt2X3(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt2X3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int2x4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetuserTypeInt2X4(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt2X4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half2x4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeHalf2X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf2X4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half2x3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeHalf2X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf2X3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half2x2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeHalf2X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf2X2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half2x1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeHalf2X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf2X1_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSamplerDEPTH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerDEPTH", scope = CgSetuserTypeImpl.class)
    public JAXBElement<CgSamplerDEPTH> createCgSetuserTypeSamplerDEPTH(CgSamplerDEPTH value) {
        return new JAXBElement<CgSamplerDEPTH>(_GlslSetarrayTypeSamplerDEPTH_QNAME, ((Class) CgSamplerDEPTHImpl.class), CgSetuserTypeImpl.class, ((CgSamplerDEPTHImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float2x1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFloat2X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat2X1_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFixed4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed4x4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFixed4X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed4X4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed4x1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFixed4X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed4X1_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed4x3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFixed4X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed4X3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed4x2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFixed4X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed4X2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float2x4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFloat2X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat2X4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float2x3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFloat2X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat2X3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float2x2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetuserTypeFloat2X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat2X2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool1x3", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetuserTypeBool1X3(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool1X3_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool1x4", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetuserTypeBool1X4(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool1X4_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool1x1", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetuserTypeBool1X1(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool1X1_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool1x2", scope = CgSetuserTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetuserTypeBool1X2(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool1X2_QNAME, ((Class) List.class), CgSetuserTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int3x1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetarrayTypeInt3X1(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt3X1_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int3x2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetarrayTypeInt3X2(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt3X2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int3x3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetarrayTypeInt3X3(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt3X3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSetuserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "usertype", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<CgSetuserType> createCgSetarrayTypeUsertype(CgSetuserType value) {
        return new JAXBElement<CgSetuserType>(_CgSetuserTypeUsertype_QNAME, ((Class) CgSetuserTypeImpl.class), CgSetarrayTypeImpl.class, ((CgSetuserTypeImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half1x4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeHalf1X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf1X4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half1x3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeHalf1X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf1X3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half1x2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeHalf1X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf1X2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeHalf2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half1x1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeHalf1X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf1X1_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<java.lang.Float> createCgSetarrayTypeHalf1(java.lang.Float value) {
        return new JAXBElement<java.lang.Float>(_CgSetuserTypeHalf1_QNAME, java.lang.Float.class, CgSetarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<java.lang.Float> createCgSetarrayTypeFixed(java.lang.Float value) {
        return new JAXBElement<java.lang.Float>(_CgSetuserTypeFixed_QNAME, java.lang.Float.class, CgSetarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeHalf4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeHalf3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<java.lang.Float> createCgSetarrayTypeFloat(java.lang.Float value) {
        return new JAXBElement<java.lang.Float>(_GlslSetarrayTypeFloat_QNAME, java.lang.Float.class, CgSetarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int3x4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetarrayTypeInt3X4(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt3X4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed3x2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFixed3X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed3X2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed3x1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFixed3X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed3X1_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed3x4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFixed3X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed3X4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed3x3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFixed3X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed3X3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float3x4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFloat3X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat3X4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float3x3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFloat3X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat3X3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool2x4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetarrayTypeBool2X4(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool2X4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float3x2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFloat3X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat3X2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float3x1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFloat3X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat3X1_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool2x2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetarrayTypeBool2X2(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool2X2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool2x3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetarrayTypeBool2X3(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool2X3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool2x1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetarrayTypeBool2X1(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool2X1_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<Integer> createCgSetarrayTypeInt(Integer value) {
        return new JAXBElement<Integer>(_GlslSetarrayTypeInt_QNAME, Integer.class, CgSetarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int4x1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetarrayTypeInt4X1(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt4X1_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int4x2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetarrayTypeInt4X2(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt4X2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half4x2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeHalf4X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf4X2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half4x1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeHalf4X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf4X1_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half4x4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeHalf4X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf4X4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSamplerRECT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerRECT", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<CgSamplerRECT> createCgSetarrayTypeSamplerRECT(CgSamplerRECT value) {
        return new JAXBElement<CgSamplerRECT>(_GlslSetarrayTypeSamplerRECT_QNAME, ((Class) CgSamplerRECTImpl.class), CgSetarrayTypeImpl.class, ((CgSamplerRECTImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half4x3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeHalf4X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf4X3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<Boolean> createCgSetarrayTypeBool(Boolean value) {
        return new JAXBElement<Boolean>(_GlslSetarrayTypeBool_QNAME, Boolean.class, CgSetarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "string", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<String> createCgSetarrayTypeString(String value) {
        return new JAXBElement<String>(_CgSetuserTypeString_QNAME, String.class, CgSetarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSetarrayType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "array", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<CgSetarrayType> createCgSetarrayTypeArray(CgSetarrayType value) {
        return new JAXBElement<CgSetarrayType>(_GlslSetarrayTypeArray_QNAME, ((Class) CgSetarrayTypeImpl.class), CgSetarrayTypeImpl.class, ((CgSetarrayTypeImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int4x3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetarrayTypeInt4X3(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt4X3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed2x3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFixed2X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed2X3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int4x4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetarrayTypeInt4X4(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt4X4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed2x2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFixed2X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed2X2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed2x4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFixed2X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed2X4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float4x3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFloat4X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat4X3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float4x2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFloat4X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat4X2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool3x3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetarrayTypeBool3X3(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool3X3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float4x1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFloat4X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat4X1_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed2x1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFixed2X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed2X1_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool3x4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetarrayTypeBool3X4(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool3X4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool3x1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetarrayTypeBool3X1(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool3X1_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool3x2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetarrayTypeBool3X2(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool3X2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float4x4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFloat4X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat4X4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "surface", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<CgSurfaceType> createCgSetarrayTypeSurface(CgSurfaceType value) {
        return new JAXBElement<CgSurfaceType>(_GlslSetarrayTypeSurface_QNAME, ((Class) CgSurfaceTypeImpl.class), CgSetarrayTypeImpl.class, ((CgSurfaceTypeImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int1x2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetarrayTypeInt1X2(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt1X2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int1x3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetarrayTypeInt1X3(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt1X3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int1x4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetarrayTypeInt1X4(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt1X4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSampler3D }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler3D", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<CgSampler3D> createCgSetarrayTypeSampler3D(CgSampler3D value) {
        return new JAXBElement<CgSampler3D>(_GlslSetarrayTypeSampler3D_QNAME, ((Class) CgSampler3DImpl.class), CgSetarrayTypeImpl.class, ((CgSampler3DImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "enum", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<String> createCgSetarrayTypeEnum(String value) {
        return new JAXBElement<String>(_GlslSetarrayTypeEnum_QNAME, String.class, CgSetarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSamplerCUBE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerCUBE", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<CgSamplerCUBE> createCgSetarrayTypeSamplerCUBE(CgSamplerCUBE value) {
        return new JAXBElement<CgSamplerCUBE>(_GlslSetarrayTypeSamplerCUBE_QNAME, ((Class) CgSamplerCUBEImpl.class), CgSetarrayTypeImpl.class, ((CgSamplerCUBEImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int1x1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetarrayTypeInt1X1(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt1X1_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half3x3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeHalf3X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf3X3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half3x2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeHalf3X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf3X2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half3x1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeHalf3X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf3X1_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFixed2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFixed3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half3x4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeHalf3X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf3X4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<java.lang.Float> createCgSetarrayTypeFixed1(java.lang.Float value) {
        return new JAXBElement<java.lang.Float>(_CgSetuserTypeFixed1_QNAME, java.lang.Float.class, CgSetarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float1x2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFloat1X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat1X2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float1x1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFloat1X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat1X1_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<java.lang.Float> createCgSetarrayTypeHalf(java.lang.Float value) {
        return new JAXBElement<java.lang.Float>(_CgSetuserTypeHalf_QNAME, java.lang.Float.class, CgSetarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSampler2D }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler2D", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<CgSampler2D> createCgSetarrayTypeSampler2D(CgSampler2D value) {
        return new JAXBElement<CgSampler2D>(_GlslSetarrayTypeSampler2D_QNAME, ((Class) CgSampler2DImpl.class), CgSetarrayTypeImpl.class, ((CgSampler2DImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetarrayTypeInt4(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_GlslSetarrayTypeInt4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetarrayTypeInt3(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_GlslSetarrayTypeInt3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetarrayTypeBool3(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_GlslSetarrayTypeBool3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed1x4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFixed1X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed1X4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetarrayTypeBool2(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_GlslSetarrayTypeBool2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed1x3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFixed1X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed1X3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetarrayTypeInt2(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_GlslSetarrayTypeInt2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetarrayTypeBool4(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_GlslSetarrayTypeBool4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<Integer> createCgSetarrayTypeInt1(Integer value) {
        return new JAXBElement<Integer>(_CgSetuserTypeInt1_QNAME, Integer.class, CgSetarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool4x4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetarrayTypeBool4X4(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool4X4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<Boolean> createCgSetarrayTypeBool1(Boolean value) {
        return new JAXBElement<Boolean>(_CgSetuserTypeBool1_QNAME, Boolean.class, CgSetarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool4x2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetarrayTypeBool4X2(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool4X2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float1x4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFloat1X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat1X4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed1x2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFixed1X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed1X2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool4x3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetarrayTypeBool4X3(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool4X3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float1x3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFloat1X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat1X3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed1x1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFixed1X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed1X1_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool4x1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetarrayTypeBool4X1(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool4X1_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<java.lang.Float> createCgSetarrayTypeFloat1(java.lang.Float value) {
        return new JAXBElement<java.lang.Float>(_CgSetuserTypeFloat1_QNAME, java.lang.Float.class, CgSetarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFloat2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFloat3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFloat4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int2x1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetarrayTypeInt2X1(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt2X1_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSampler1D }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler1D", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<CgSampler1D> createCgSetarrayTypeSampler1D(CgSampler1D value) {
        return new JAXBElement<CgSampler1D>(_GlslSetarrayTypeSampler1D_QNAME, ((Class) CgSampler1DImpl.class), CgSetarrayTypeImpl.class, ((CgSampler1DImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int2x2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetarrayTypeInt2X2(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt2X2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int2x3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetarrayTypeInt2X3(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt2X3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int2x4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgSetarrayTypeInt2X4(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt2X4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half2x4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeHalf2X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf2X4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half2x3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeHalf2X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf2X3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half2x2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeHalf2X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf2X2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half2x1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeHalf2X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf2X1_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSamplerDEPTH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerDEPTH", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<CgSamplerDEPTH> createCgSetarrayTypeSamplerDEPTH(CgSamplerDEPTH value) {
        return new JAXBElement<CgSamplerDEPTH>(_GlslSetarrayTypeSamplerDEPTH_QNAME, ((Class) CgSamplerDEPTHImpl.class), CgSetarrayTypeImpl.class, ((CgSamplerDEPTHImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float2x1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFloat2X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat2X1_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFixed4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed4x4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFixed4X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed4X4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed4x1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFixed4X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed4X1_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed4x3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFixed4X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed4X3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed4x2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFixed4X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed4X2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float2x4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFloat2X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat2X4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float2x3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFloat2X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat2X3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float2x2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgSetarrayTypeFloat2X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat2X2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool1x3", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetarrayTypeBool1X3(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool1X3_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool1x4", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetarrayTypeBool1X4(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool1X4_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool1x1", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetarrayTypeBool1X1(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool1X1_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool1x2", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgSetarrayTypeBool1X2(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool1X2_QNAME, ((Class) List.class), CgSetarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int3x1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgNewarrayTypeInt3X1(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt3X1_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int3x2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgNewarrayTypeInt3X2(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt3X2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int3x3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgNewarrayTypeInt3X3(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt3X3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSetuserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "usertype", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<CgSetuserType> createCgNewarrayTypeUsertype(CgSetuserType value) {
        return new JAXBElement<CgSetuserType>(_CgSetuserTypeUsertype_QNAME, ((Class) CgSetuserTypeImpl.class), CgNewarrayTypeImpl.class, ((CgSetuserTypeImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half1x4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeHalf1X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf1X4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half1x3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeHalf1X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf1X3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half1x2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeHalf1X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf1X2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeHalf2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half1x1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeHalf1X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf1X1_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<java.lang.Float> createCgNewarrayTypeHalf1(java.lang.Float value) {
        return new JAXBElement<java.lang.Float>(_CgSetuserTypeHalf1_QNAME, java.lang.Float.class, CgNewarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<java.lang.Float> createCgNewarrayTypeFixed(java.lang.Float value) {
        return new JAXBElement<java.lang.Float>(_CgSetuserTypeFixed_QNAME, java.lang.Float.class, CgNewarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeHalf4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeHalf3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<java.lang.Float> createCgNewarrayTypeFloat(java.lang.Float value) {
        return new JAXBElement<java.lang.Float>(_GlslSetarrayTypeFloat_QNAME, java.lang.Float.class, CgNewarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int3x4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgNewarrayTypeInt3X4(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt3X4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed3x2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFixed3X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed3X2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed3x1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFixed3X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed3X1_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed3x4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFixed3X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed3X4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed3x3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFixed3X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed3X3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float3x4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFloat3X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat3X4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float3x3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFloat3X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat3X3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool2x4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgNewarrayTypeBool2X4(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool2X4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float3x2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFloat3X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat3X2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float3x1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFloat3X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat3X1_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool2x2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgNewarrayTypeBool2X2(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool2X2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool2x3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgNewarrayTypeBool2X3(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool2X3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgConnectParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "connect_param", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<CgConnectParam> createCgNewarrayTypeConnectParam(CgConnectParam value) {
        return new JAXBElement<CgConnectParam>(_CgSetuserTypeConnectParam_QNAME, ((Class) CgConnectParamImpl.class), CgNewarrayTypeImpl.class, ((CgConnectParamImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool2x1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgNewarrayTypeBool2X1(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool2X1_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<Integer> createCgNewarrayTypeInt(Integer value) {
        return new JAXBElement<Integer>(_GlslSetarrayTypeInt_QNAME, Integer.class, CgNewarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int4x1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgNewarrayTypeInt4X1(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt4X1_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int4x2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgNewarrayTypeInt4X2(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt4X2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half4x2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeHalf4X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf4X2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half4x1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeHalf4X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf4X1_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half4x4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeHalf4X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf4X4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSamplerRECT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerRECT", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<CgSamplerRECT> createCgNewarrayTypeSamplerRECT(CgSamplerRECT value) {
        return new JAXBElement<CgSamplerRECT>(_GlslSetarrayTypeSamplerRECT_QNAME, ((Class) CgSamplerRECTImpl.class), CgNewarrayTypeImpl.class, ((CgSamplerRECTImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half4x3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeHalf4X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf4X3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<Boolean> createCgNewarrayTypeBool(Boolean value) {
        return new JAXBElement<Boolean>(_GlslSetarrayTypeBool_QNAME, Boolean.class, CgNewarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "string", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<String> createCgNewarrayTypeString(String value) {
        return new JAXBElement<String>(_CgSetuserTypeString_QNAME, String.class, CgNewarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgNewarrayType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "array", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<CgNewarrayType> createCgNewarrayTypeArray(CgNewarrayType value) {
        return new JAXBElement<CgNewarrayType>(_GlslSetarrayTypeArray_QNAME, ((Class) CgNewarrayTypeImpl.class), CgNewarrayTypeImpl.class, ((CgNewarrayTypeImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int4x3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgNewarrayTypeInt4X3(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt4X3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed2x3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFixed2X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed2X3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int4x4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgNewarrayTypeInt4X4(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt4X4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed2x2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFixed2X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed2X2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed2x4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFixed2X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed2X4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float4x3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFloat4X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat4X3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float4x2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFloat4X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat4X2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool3x3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgNewarrayTypeBool3X3(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool3X3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float4x1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFloat4X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat4X1_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed2x1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFixed2X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed2X1_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool3x4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgNewarrayTypeBool3X4(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool3X4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool3x1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgNewarrayTypeBool3X1(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool3X1_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool3x2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgNewarrayTypeBool3X2(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool3X2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float4x4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFloat4X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat4X4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "surface", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<CgSurfaceType> createCgNewarrayTypeSurface(CgSurfaceType value) {
        return new JAXBElement<CgSurfaceType>(_GlslSetarrayTypeSurface_QNAME, ((Class) CgSurfaceTypeImpl.class), CgNewarrayTypeImpl.class, ((CgSurfaceTypeImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int1x2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgNewarrayTypeInt1X2(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt1X2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int1x3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgNewarrayTypeInt1X3(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt1X3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int1x4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgNewarrayTypeInt1X4(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt1X4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSampler3D }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler3D", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<CgSampler3D> createCgNewarrayTypeSampler3D(CgSampler3D value) {
        return new JAXBElement<CgSampler3D>(_GlslSetarrayTypeSampler3D_QNAME, ((Class) CgSampler3DImpl.class), CgNewarrayTypeImpl.class, ((CgSampler3DImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "enum", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<String> createCgNewarrayTypeEnum(String value) {
        return new JAXBElement<String>(_GlslSetarrayTypeEnum_QNAME, String.class, CgNewarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSamplerCUBE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerCUBE", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<CgSamplerCUBE> createCgNewarrayTypeSamplerCUBE(CgSamplerCUBE value) {
        return new JAXBElement<CgSamplerCUBE>(_GlslSetarrayTypeSamplerCUBE_QNAME, ((Class) CgSamplerCUBEImpl.class), CgNewarrayTypeImpl.class, ((CgSamplerCUBEImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int1x1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgNewarrayTypeInt1X1(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt1X1_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half3x3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeHalf3X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf3X3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half3x2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeHalf3X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf3X2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half3x1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeHalf3X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf3X1_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFixed2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFixed3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half3x4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeHalf3X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf3X4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<java.lang.Float> createCgNewarrayTypeFixed1(java.lang.Float value) {
        return new JAXBElement<java.lang.Float>(_CgSetuserTypeFixed1_QNAME, java.lang.Float.class, CgNewarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float1x2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFloat1X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat1X2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float1x1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFloat1X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat1X1_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<java.lang.Float> createCgNewarrayTypeHalf(java.lang.Float value) {
        return new JAXBElement<java.lang.Float>(_CgSetuserTypeHalf_QNAME, java.lang.Float.class, CgNewarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSampler2D }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler2D", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<CgSampler2D> createCgNewarrayTypeSampler2D(CgSampler2D value) {
        return new JAXBElement<CgSampler2D>(_GlslSetarrayTypeSampler2D_QNAME, ((Class) CgSampler2DImpl.class), CgNewarrayTypeImpl.class, ((CgSampler2DImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgNewarrayTypeInt4(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_GlslSetarrayTypeInt4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgNewarrayTypeInt3(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_GlslSetarrayTypeInt3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgNewarrayTypeBool3(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_GlslSetarrayTypeBool3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed1x4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFixed1X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed1X4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgNewarrayTypeBool2(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_GlslSetarrayTypeBool2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed1x3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFixed1X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed1X3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgNewarrayTypeInt2(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_GlslSetarrayTypeInt2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgNewarrayTypeBool4(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_GlslSetarrayTypeBool4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<Integer> createCgNewarrayTypeInt1(Integer value) {
        return new JAXBElement<Integer>(_CgSetuserTypeInt1_QNAME, Integer.class, CgNewarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool4x4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgNewarrayTypeBool4X4(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool4X4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<Boolean> createCgNewarrayTypeBool1(Boolean value) {
        return new JAXBElement<Boolean>(_CgSetuserTypeBool1_QNAME, Boolean.class, CgNewarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool4x2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgNewarrayTypeBool4X2(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool4X2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float1x4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFloat1X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat1X4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed1x2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFixed1X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed1X2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool4x3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgNewarrayTypeBool4X3(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool4X3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float1x3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFloat1X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat1X3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed1x1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFixed1X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed1X1_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool4x1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgNewarrayTypeBool4X1(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool4X1_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<java.lang.Float> createCgNewarrayTypeFloat1(java.lang.Float value) {
        return new JAXBElement<java.lang.Float>(_CgSetuserTypeFloat1_QNAME, java.lang.Float.class, CgNewarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFloat2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFloat3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFloat4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int2x1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgNewarrayTypeInt2X1(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt2X1_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSampler1D }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler1D", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<CgSampler1D> createCgNewarrayTypeSampler1D(CgSampler1D value) {
        return new JAXBElement<CgSampler1D>(_GlslSetarrayTypeSampler1D_QNAME, ((Class) CgSampler1DImpl.class), CgNewarrayTypeImpl.class, ((CgSampler1DImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int2x2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgNewarrayTypeInt2X2(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt2X2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int2x3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgNewarrayTypeInt2X3(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt2X3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Integer }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "int2x4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Integer>> createCgNewarrayTypeInt2X4(List<Integer> value) {
        return new JAXBElement<List<Integer>>(_CgSetuserTypeInt2X4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Integer> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half2x4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeHalf2X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf2X4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half2x3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeHalf2X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf2X3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half2x2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeHalf2X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf2X2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "half2x1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeHalf2X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeHalf2X1_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSamplerDEPTH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerDEPTH", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<CgSamplerDEPTH> createCgNewarrayTypeSamplerDEPTH(CgSamplerDEPTH value) {
        return new JAXBElement<CgSamplerDEPTH>(_GlslSetarrayTypeSamplerDEPTH_QNAME, ((Class) CgSamplerDEPTHImpl.class), CgNewarrayTypeImpl.class, ((CgSamplerDEPTHImpl) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float2x1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFloat2X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat2X1_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFixed4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed4x4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFixed4X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed4X4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed4x1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFixed4X1(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed4X1_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed4x3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFixed4X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed4X3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "fixed4x2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFixed4X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFixed4X2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float2x4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFloat2X4(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat2X4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float2x3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFloat2X3(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_CgSetuserTypeFloat2X3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link java.lang.Float }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "float2x2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<java.lang.Float>> createCgNewarrayTypeFloat2X2(List<java.lang.Float> value) {
        return new JAXBElement<List<java.lang.Float>>(_GlslSetarrayTypeFloat2X2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<java.lang.Float> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool1x3", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgNewarrayTypeBool1X3(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool1X3_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool1x4", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgNewarrayTypeBool1X4(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool1X4_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool1x1", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgNewarrayTypeBool1X1(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool1X1_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Boolean }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "bool1x2", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<List<Boolean>> createCgNewarrayTypeBool1X2(List<Boolean> value) {
        return new JAXBElement<List<Boolean>>(_CgSetuserTypeBool1X2_QNAME, ((Class) List.class), CgNewarrayTypeImpl.class, ((List<Boolean> ) value));
    }

}
