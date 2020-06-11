//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema.impl;

import java.math.BigInteger;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.collada._2005._11.colladaschema.Accessor;
import org.collada._2005._11.colladaschema.Animation;
import org.collada._2005._11.colladaschema.AnimationClip;
import org.collada._2005._11.colladaschema.Asset;
import org.collada._2005._11.colladaschema.BindMaterial;
import org.collada._2005._11.colladaschema.BoolArray;
import org.collada._2005._11.colladaschema.Box;
import org.collada._2005._11.colladaschema.COLLADA;
import org.collada._2005._11.colladaschema.Camera;
import org.collada._2005._11.colladaschema.Capsule;
import org.collada._2005._11.colladaschema.CgConnectParam;
import org.collada._2005._11.colladaschema.CgNewarrayType;
import org.collada._2005._11.colladaschema.CgNewparam;
import org.collada._2005._11.colladaschema.CgSampler1D;
import org.collada._2005._11.colladaschema.CgSampler2D;
import org.collada._2005._11.colladaschema.CgSampler3D;
import org.collada._2005._11.colladaschema.CgSamplerCUBE;
import org.collada._2005._11.colladaschema.CgSamplerDEPTH;
import org.collada._2005._11.colladaschema.CgSamplerRECT;
import org.collada._2005._11.colladaschema.CgSetarrayType;
import org.collada._2005._11.colladaschema.CgSetparam;
import org.collada._2005._11.colladaschema.CgSetparamSimple;
import org.collada._2005._11.colladaschema.CgSetuserType;
import org.collada._2005._11.colladaschema.CgSurfaceType;
import org.collada._2005._11.colladaschema.Channel;
import org.collada._2005._11.colladaschema.CommonColorOrTextureType;
import org.collada._2005._11.colladaschema.CommonFloatOrParamType;
import org.collada._2005._11.colladaschema.CommonNewparamType;
import org.collada._2005._11.colladaschema.CommonTransparentType;
import org.collada._2005._11.colladaschema.Controller;
import org.collada._2005._11.colladaschema.ConvexMesh;
import org.collada._2005._11.colladaschema.Cylinder;
import org.collada._2005._11.colladaschema.Effect;
import org.collada._2005._11.colladaschema.Ellipsoid;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.FloatArray;
import org.collada._2005._11.colladaschema.ForceField;
import org.collada._2005._11.colladaschema.FxAnnotateCommon;
import org.collada._2005._11.colladaschema.FxClearcolorCommon;
import org.collada._2005._11.colladaschema.FxCleardepthCommon;
import org.collada._2005._11.colladaschema.FxClearstencilCommon;
import org.collada._2005._11.colladaschema.FxCodeProfile;
import org.collada._2005._11.colladaschema.FxColortargetCommon;
import org.collada._2005._11.colladaschema.FxDepthtargetCommon;
import org.collada._2005._11.colladaschema.FxIncludeCommon;
import org.collada._2005._11.colladaschema.FxNewparamCommon;
import org.collada._2005._11.colladaschema.FxSampler1DCommon;
import org.collada._2005._11.colladaschema.FxSampler2DCommon;
import org.collada._2005._11.colladaschema.FxSampler3DCommon;
import org.collada._2005._11.colladaschema.FxSamplerCUBECommon;
import org.collada._2005._11.colladaschema.FxSamplerDEPTHCommon;
import org.collada._2005._11.colladaschema.FxSamplerRECTCommon;
import org.collada._2005._11.colladaschema.FxStenciltargetCommon;
import org.collada._2005._11.colladaschema.FxSurfaceCommon;
import org.collada._2005._11.colladaschema.FxSurfaceFormatHintCommon;
import org.collada._2005._11.colladaschema.FxSurfaceInitCubeCommon;
import org.collada._2005._11.colladaschema.FxSurfaceInitFromCommon;
import org.collada._2005._11.colladaschema.FxSurfaceInitPlanarCommon;
import org.collada._2005._11.colladaschema.FxSurfaceInitVolumeCommon;
import org.collada._2005._11.colladaschema.Geometry;
import org.collada._2005._11.colladaschema.GlSampler1D;
import org.collada._2005._11.colladaschema.GlSampler2D;
import org.collada._2005._11.colladaschema.GlSampler3D;
import org.collada._2005._11.colladaschema.GlSamplerCUBE;
import org.collada._2005._11.colladaschema.GlSamplerDEPTH;
import org.collada._2005._11.colladaschema.GlSamplerRECT;
import org.collada._2005._11.colladaschema.GlesNewparam;
import org.collada._2005._11.colladaschema.GlesSamplerState;
import org.collada._2005._11.colladaschema.GlesTexcombinerArgumentAlphaType;
import org.collada._2005._11.colladaschema.GlesTexcombinerArgumentRGBType;
import org.collada._2005._11.colladaschema.GlesTexcombinerCommandAlphaType;
import org.collada._2005._11.colladaschema.GlesTexcombinerCommandRGBType;
import org.collada._2005._11.colladaschema.GlesTexcombinerCommandType;
import org.collada._2005._11.colladaschema.GlesTexenvCommandType;
import org.collada._2005._11.colladaschema.GlesTextureConstantType;
import org.collada._2005._11.colladaschema.GlesTexturePipeline;
import org.collada._2005._11.colladaschema.GlesTextureUnit;
import org.collada._2005._11.colladaschema.GlslNewarrayType;
import org.collada._2005._11.colladaschema.GlslNewparam;
import org.collada._2005._11.colladaschema.GlslSetarrayType;
import org.collada._2005._11.colladaschema.GlslSetparam;
import org.collada._2005._11.colladaschema.GlslSetparamSimple;
import org.collada._2005._11.colladaschema.GlslSurfaceType;
import org.collada._2005._11.colladaschema.IDREFArray;
import org.collada._2005._11.colladaschema.Image;
import org.collada._2005._11.colladaschema.InputGlobal;
import org.collada._2005._11.colladaschema.InputLocal;
import org.collada._2005._11.colladaschema.InputLocalOffset;
import org.collada._2005._11.colladaschema.InstanceController;
import org.collada._2005._11.colladaschema.InstanceEffect;
import org.collada._2005._11.colladaschema.InstanceGeometry;
import org.collada._2005._11.colladaschema.InstanceMaterial;
import org.collada._2005._11.colladaschema.InstancePhysicsModel;
import org.collada._2005._11.colladaschema.InstanceRigidBody;
import org.collada._2005._11.colladaschema.InstanceRigidConstraint;
import org.collada._2005._11.colladaschema.InstanceWithExtra;
import org.collada._2005._11.colladaschema.IntArray;
import org.collada._2005._11.colladaschema.LibraryAnimationClips;
import org.collada._2005._11.colladaschema.LibraryAnimations;
import org.collada._2005._11.colladaschema.LibraryCameras;
import org.collada._2005._11.colladaschema.LibraryControllers;
import org.collada._2005._11.colladaschema.LibraryEffects;
import org.collada._2005._11.colladaschema.LibraryForceFields;
import org.collada._2005._11.colladaschema.LibraryGeometries;
import org.collada._2005._11.colladaschema.LibraryImages;
import org.collada._2005._11.colladaschema.LibraryLights;
import org.collada._2005._11.colladaschema.LibraryMaterials;
import org.collada._2005._11.colladaschema.LibraryNodes;
import org.collada._2005._11.colladaschema.LibraryPhysicsMaterials;
import org.collada._2005._11.colladaschema.LibraryPhysicsModels;
import org.collada._2005._11.colladaschema.LibraryPhysicsScenes;
import org.collada._2005._11.colladaschema.LibraryVisualScenes;
import org.collada._2005._11.colladaschema.Light;
import org.collada._2005._11.colladaschema.Lines;
import org.collada._2005._11.colladaschema.Linestrips;
import org.collada._2005._11.colladaschema.Lookat;
import org.collada._2005._11.colladaschema.Material;
import org.collada._2005._11.colladaschema.Matrix;
import org.collada._2005._11.colladaschema.Mesh;
import org.collada._2005._11.colladaschema.Morph;
import org.collada._2005._11.colladaschema.NameArray;
import org.collada._2005._11.colladaschema.Node;
import org.collada._2005._11.colladaschema.PhysicsMaterial;
import org.collada._2005._11.colladaschema.PhysicsModel;
import org.collada._2005._11.colladaschema.PhysicsScene;
import org.collada._2005._11.colladaschema.Plane;
import org.collada._2005._11.colladaschema.Polygons;
import org.collada._2005._11.colladaschema.Polylist;
import org.collada._2005._11.colladaschema.ProfileCG;
import org.collada._2005._11.colladaschema.ProfileCOMMON;
import org.collada._2005._11.colladaschema.ProfileGLES;
import org.collada._2005._11.colladaschema.ProfileGLSL;
import org.collada._2005._11.colladaschema.RigidBody;
import org.collada._2005._11.colladaschema.RigidConstraint;
import org.collada._2005._11.colladaschema.Rotate;
import org.collada._2005._11.colladaschema.Sampler;
import org.collada._2005._11.colladaschema.Skew;
import org.collada._2005._11.colladaschema.Skin;
import org.collada._2005._11.colladaschema.Source;
import org.collada._2005._11.colladaschema.Sphere;
import org.collada._2005._11.colladaschema.Spline;
import org.collada._2005._11.colladaschema.TaperedCapsule;
import org.collada._2005._11.colladaschema.TaperedCylinder;
import org.collada._2005._11.colladaschema.TargetableFloat;
import org.collada._2005._11.colladaschema.TargetableFloat3;
import org.collada._2005._11.colladaschema.Triangles;
import org.collada._2005._11.colladaschema.Trifans;
import org.collada._2005._11.colladaschema.Tristrips;
import org.collada._2005._11.colladaschema.Vertices;
import org.collada._2005._11.colladaschema.VisualScene;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.collada._2005._11.colladaschema.impl package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.collada._2005._11.colladaschema.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BindMaterial }
     * 
     */
    public BindMaterialImpl createBindMaterial() {
        return new BindMaterialImpl();
    }

    /**
     * Create an instance of {@link Asset }
     * 
     */
    public AssetImpl createAsset() {
        return new AssetImpl();
    }

    /**
     * Create an instance of {@link PhysicsMaterial }
     * 
     */
    public PhysicsMaterialImpl createPhysicsMaterial() {
        return new PhysicsMaterialImpl();
    }

    /**
     * Create an instance of {@link Polygons }
     * 
     */
    public PolygonsImpl createPolygons() {
        return new PolygonsImpl();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public SourceImpl createSource() {
        return new SourceImpl();
    }

    /**
     * Create an instance of {@link Morph }
     * 
     */
    public MorphImpl createMorph() {
        return new MorphImpl();
    }

    /**
     * Create an instance of {@link Skin }
     * 
     */
    public SkinImpl createSkin() {
        return new SkinImpl();
    }

    /**
     * Create an instance of {@link InstanceMaterial }
     * 
     */
    public InstanceMaterialImpl createInstanceMaterial() {
        return new InstanceMaterialImpl();
    }

    /**
     * Create an instance of {@link Camera }
     * 
     */
    public CameraImpl createCamera() {
        return new CameraImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint }
     * 
     */
    public RigidConstraintImpl createRigidConstraint() {
        return new RigidConstraintImpl();
    }

    /**
     * Create an instance of {@link InstanceRigidBody }
     * 
     */
    public InstanceRigidBodyImpl createInstanceRigidBody() {
        return new InstanceRigidBodyImpl();
    }

    /**
     * Create an instance of {@link PhysicsScene }
     * 
     */
    public PhysicsSceneImpl createPhysicsScene() {
        return new PhysicsSceneImpl();
    }

    /**
     * Create an instance of {@link Light }
     * 
     */
    public LightImpl createLight() {
        return new LightImpl();
    }

    /**
     * Create an instance of {@link Spline }
     * 
     */
    public SplineImpl createSpline() {
        return new SplineImpl();
    }

    /**
     * Create an instance of {@link InstanceEffect }
     * 
     */
    public InstanceEffectImpl createInstanceEffect() {
        return new InstanceEffectImpl();
    }

    /**
     * Create an instance of {@link RigidBody }
     * 
     */
    public RigidBodyImpl createRigidBody() {
        return new RigidBodyImpl();
    }

    /**
     * Create an instance of {@link VisualScene }
     * 
     */
    public VisualSceneImpl createVisualScene() {
        return new VisualSceneImpl();
    }

    /**
     * Create an instance of {@link COLLADA }
     * 
     */
    public COLLADAImpl createCOLLADA() {
        return new COLLADAImpl();
    }

    /**
     * Create an instance of {@link GlesTextureUnit }
     * 
     */
    public GlesTextureUnitImpl createGlesTextureUnit() {
        return new GlesTextureUnitImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceInitCubeCommon }
     * 
     */
    public FxSurfaceInitCubeCommonImpl createFxSurfaceInitCubeCommon() {
        return new FxSurfaceInitCubeCommonImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceInitVolumeCommon }
     * 
     */
    public FxSurfaceInitVolumeCommonImpl createFxSurfaceInitVolumeCommon() {
        return new FxSurfaceInitVolumeCommonImpl();
    }

    /**
     * Create an instance of {@link CommonFloatOrParamType }
     * 
     */
    public CommonFloatOrParamTypeImpl createCommonFloatOrParamType() {
        return new CommonFloatOrParamTypeImpl();
    }

    /**
     * Create an instance of {@link CgSurfaceType }
     * 
     */
    public CgSurfaceTypeImpl createCgSurfaceType() {
        return new CgSurfaceTypeImpl();
    }

    /**
     * Create an instance of {@link CgSurfaceType.Generator }
     * 
     */
    public CgSurfaceTypeImpl.GeneratorImpl createCgSurfaceTypeGenerator() {
        return new CgSurfaceTypeImpl.GeneratorImpl();
    }

    /**
     * Create an instance of {@link CommonColorOrTextureType }
     * 
     */
    public CommonColorOrTextureTypeImpl createCommonColorOrTextureType() {
        return new CommonColorOrTextureTypeImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceInitPlanarCommon }
     * 
     */
    public FxSurfaceInitPlanarCommonImpl createFxSurfaceInitPlanarCommon() {
        return new FxSurfaceInitPlanarCommonImpl();
    }

    /**
     * Create an instance of {@link GlslSurfaceType }
     * 
     */
    public GlslSurfaceTypeImpl createGlslSurfaceType() {
        return new GlslSurfaceTypeImpl();
    }

    /**
     * Create an instance of {@link GlslSurfaceType.Generator }
     * 
     */
    public GlslSurfaceTypeImpl.GeneratorImpl createGlslSurfaceTypeGenerator() {
        return new GlslSurfaceTypeImpl.GeneratorImpl();
    }

    /**
     * Create an instance of {@link ProfileCG }
     * 
     */
    public ProfileCGImpl createProfileCG() {
        return new ProfileCGImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique }
     * 
     */
    public ProfileCGImpl.TechniqueImpl createProfileCGTechnique() {
        return new ProfileCGImpl.TechniqueImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl createProfileCGTechniquePass() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Shader }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl createProfileCGTechniquePassShader() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Shader.Bind }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.BindImpl createProfileCGTechniquePassShaderBind() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.BindImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilMaskSeparate }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskSeparateImpl createProfileCGTechniquePassStencilMaskSeparate() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskSeparateImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilOpSeparate }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl createProfileCGTechniquePassStencilOpSeparate() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilFuncSeparate }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl createProfileCGTechniquePassStencilFuncSeparate() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilOp }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl createProfileCGTechniquePassStencilOp() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilFunc }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl createProfileCGTechniquePassStencilFunc() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PolygonMode }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.PolygonModeImpl createProfileCGTechniquePassPolygonMode() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PolygonModeImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ColorMaterial }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialImpl createProfileCGTechniquePassColorMaterial() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendEquationSeparate }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationSeparateImpl createProfileCGTechniquePassBlendEquationSeparate() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationSeparateImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendFuncSeparate }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl createProfileCGTechniquePassBlendFuncSeparate() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendFunc }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncImpl createProfileCGTechniquePassBlendFunc() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.AlphaFunc }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.AlphaFuncImpl createProfileCGTechniquePassAlphaFunc() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.AlphaFuncImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES }
     * 
     */
    public ProfileGLESImpl createProfileGLES() {
        return new ProfileGLESImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl createProfileGLESTechnique() {
        return new ProfileGLESImpl.TechniqueImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl createProfileGLESTechniquePass() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.StencilOp }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl createProfileGLESTechniquePassStencilOp() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.StencilFunc }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl createProfileGLESTechniquePassStencilFunc() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.BlendFunc }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.BlendFuncImpl createProfileGLESTechniquePassBlendFunc() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.BlendFuncImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.AlphaFunc }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.AlphaFuncImpl createProfileGLESTechniquePassAlphaFunc() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.AlphaFuncImpl();
    }

    /**
     * Create an instance of {@link ProfileCOMMON }
     * 
     */
    public ProfileCOMMONImpl createProfileCOMMON() {
        return new ProfileCOMMONImpl();
    }

    /**
     * Create an instance of {@link ProfileCOMMON.Technique }
     * 
     */
    public ProfileCOMMONImpl.TechniqueImpl createProfileCOMMONTechnique() {
        return new ProfileCOMMONImpl.TechniqueImpl();
    }

    /**
     * Create an instance of {@link VisualScene.EvaluateScene }
     * 
     */
    public VisualSceneImpl.EvaluateSceneImpl createVisualSceneEvaluateScene() {
        return new VisualSceneImpl.EvaluateSceneImpl();
    }

    /**
     * Create an instance of {@link RigidBody.TechniqueCommon }
     * 
     */
    public RigidBodyImpl.TechniqueCommonImpl createRigidBodyTechniqueCommon() {
        return new RigidBodyImpl.TechniqueCommonImpl();
    }

    /**
     * Create an instance of {@link RigidBody.TechniqueCommon.Shape }
     * 
     */
    public RigidBodyImpl.TechniqueCommonImpl.ShapeImpl createRigidBodyTechniqueCommonShape() {
        return new RigidBodyImpl.TechniqueCommonImpl.ShapeImpl();
    }

    /**
     * Create an instance of {@link Light.TechniqueCommon }
     * 
     */
    public LightImpl.TechniqueCommonImpl createLightTechniqueCommon() {
        return new LightImpl.TechniqueCommonImpl();
    }

    /**
     * Create an instance of {@link InstanceRigidBody.TechniqueCommon }
     * 
     */
    public InstanceRigidBodyImpl.TechniqueCommonImpl createInstanceRigidBodyTechniqueCommon() {
        return new InstanceRigidBodyImpl.TechniqueCommonImpl();
    }

    /**
     * Create an instance of {@link InstanceRigidBody.TechniqueCommon.Shape }
     * 
     */
    public InstanceRigidBodyImpl.TechniqueCommonImpl.ShapeImpl createInstanceRigidBodyTechniqueCommonShape() {
        return new InstanceRigidBodyImpl.TechniqueCommonImpl.ShapeImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.TechniqueCommon }
     * 
     */
    public RigidConstraintImpl.TechniqueCommonImpl createRigidConstraintTechniqueCommon() {
        return new RigidConstraintImpl.TechniqueCommonImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.TechniqueCommon.Spring }
     * 
     */
    public RigidConstraintImpl.TechniqueCommonImpl.SpringImpl createRigidConstraintTechniqueCommonSpring() {
        return new RigidConstraintImpl.TechniqueCommonImpl.SpringImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.TechniqueCommon.Limits }
     * 
     */
    public RigidConstraintImpl.TechniqueCommonImpl.LimitsImpl createRigidConstraintTechniqueCommonLimits() {
        return new RigidConstraintImpl.TechniqueCommonImpl.LimitsImpl();
    }

    /**
     * Create an instance of {@link Camera.Optics }
     * 
     */
    public CameraImpl.OpticsImpl createCameraOptics() {
        return new CameraImpl.OpticsImpl();
    }

    /**
     * Create an instance of {@link Camera.Optics.TechniqueCommon }
     * 
     */
    public CameraImpl.OpticsImpl.TechniqueCommonImpl createCameraOpticsTechniqueCommon() {
        return new CameraImpl.OpticsImpl.TechniqueCommonImpl();
    }

    /**
     * Create an instance of {@link ProfileGLSL }
     * 
     */
    public ProfileGLSLImpl createProfileGLSL() {
        return new ProfileGLSLImpl();
    }

    /**
     * Create an instance of {@link ProfileGLSL.Technique }
     * 
     */
    public ProfileGLSLImpl.TechniqueImpl createProfileGLSLTechnique() {
        return new ProfileGLSLImpl.TechniqueImpl();
    }

    /**
     * Create an instance of {@link ProfileGLSL.Technique.Pass }
     * 
     */
    public ProfileGLSLImpl.TechniqueImpl.PassImpl createProfileGLSLTechniquePass() {
        return new ProfileGLSLImpl.TechniqueImpl.PassImpl();
    }

    /**
     * Create an instance of {@link ProfileGLSL.Technique.Pass.Shader }
     * 
     */
    public ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl createProfileGLSLTechniquePassShader() {
        return new ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl();
    }

    /**
     * Create an instance of {@link ProfileGLSL.Technique.Pass.Shader.Bind }
     * 
     */
    public ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.BindImpl createProfileGLSLTechniquePassShaderBind() {
        return new ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.BindImpl();
    }

    /**
     * Create an instance of {@link InstanceController }
     * 
     */
    public InstanceControllerImpl createInstanceController() {
        return new InstanceControllerImpl();
    }

    /**
     * Create an instance of {@link org.collada._2005._11.colladaschema.Param }
     * 
     */
    public org.collada._2005._11.colladaschema.impl.ParamImpl createParam() {
        return new org.collada._2005._11.colladaschema.impl.ParamImpl();
    }

    /**
     * Create an instance of {@link BindMaterial.TechniqueCommon }
     * 
     */
    public BindMaterialImpl.TechniqueCommonImpl createBindMaterialTechniqueCommon() {
        return new BindMaterialImpl.TechniqueCommonImpl();
    }

    /**
     * Create an instance of {@link org.collada._2005._11.colladaschema.Technique }
     * 
     */
    public org.collada._2005._11.colladaschema.impl.TechniqueImpl createTechnique() {
        return new org.collada._2005._11.colladaschema.impl.TechniqueImpl();
    }

    /**
     * Create an instance of {@link Extra }
     * 
     */
    public ExtraImpl createExtra() {
        return new ExtraImpl();
    }

    /**
     * Create an instance of {@link Asset.Contributor }
     * 
     */
    public AssetImpl.ContributorImpl createAssetContributor() {
        return new AssetImpl.ContributorImpl();
    }

    /**
     * Create an instance of {@link Asset.Unit }
     * 
     */
    public AssetImpl.UnitImpl createAssetUnit() {
        return new AssetImpl.UnitImpl();
    }

    /**
     * Create an instance of {@link LibraryPhysicsMaterials }
     * 
     */
    public LibraryPhysicsMaterialsImpl createLibraryPhysicsMaterials() {
        return new LibraryPhysicsMaterialsImpl();
    }

    /**
     * Create an instance of {@link PhysicsMaterial.TechniqueCommon }
     * 
     */
    public PhysicsMaterialImpl.TechniqueCommonImpl createPhysicsMaterialTechniqueCommon() {
        return new PhysicsMaterialImpl.TechniqueCommonImpl();
    }

    /**
     * Create an instance of {@link Plane }
     * 
     */
    public PlaneImpl createPlane() {
        return new PlaneImpl();
    }

    /**
     * Create an instance of {@link Rotate }
     * 
     */
    public RotateImpl createRotate() {
        return new RotateImpl();
    }

    /**
     * Create an instance of {@link InputLocalOffset }
     * 
     */
    public InputLocalOffsetImpl createInputLocalOffset() {
        return new InputLocalOffsetImpl();
    }

    /**
     * Create an instance of {@link Polygons.Ph }
     * 
     */
    public PolygonsImpl.PhImpl createPolygonsPh() {
        return new PolygonsImpl.PhImpl();
    }

    /**
     * Create an instance of {@link Channel }
     * 
     */
    public ChannelImpl createChannel() {
        return new ChannelImpl();
    }

    /**
     * Create an instance of {@link Lookat }
     * 
     */
    public LookatImpl createLookat() {
        return new LookatImpl();
    }

    /**
     * Create an instance of {@link IntArray }
     * 
     */
    public IntArrayImpl createIntArray() {
        return new IntArrayImpl();
    }

    /**
     * Create an instance of {@link FloatArray }
     * 
     */
    public FloatArrayImpl createFloatArray() {
        return new FloatArrayImpl();
    }

    /**
     * Create an instance of {@link BoolArray }
     * 
     */
    public BoolArrayImpl createBoolArray() {
        return new BoolArrayImpl();
    }

    /**
     * Create an instance of {@link NameArray }
     * 
     */
    public NameArrayImpl createNameArray() {
        return new NameArrayImpl();
    }

    /**
     * Create an instance of {@link IDREFArray }
     * 
     */
    public IDREFArrayImpl createIDREFArray() {
        return new IDREFArrayImpl();
    }

    /**
     * Create an instance of {@link Source.TechniqueCommon }
     * 
     */
    public SourceImpl.TechniqueCommonImpl createSourceTechniqueCommon() {
        return new SourceImpl.TechniqueCommonImpl();
    }

    /**
     * Create an instance of {@link TargetableFloat3 }
     * 
     */
    public TargetableFloat3Impl createTargetableFloat3() {
        return new TargetableFloat3Impl();
    }

    /**
     * Create an instance of {@link Triangles }
     * 
     */
    public TrianglesImpl createTriangles() {
        return new TrianglesImpl();
    }

    /**
     * Create an instance of {@link LibraryControllers }
     * 
     */
    public LibraryControllersImpl createLibraryControllers() {
        return new LibraryControllersImpl();
    }

    /**
     * Create an instance of {@link Controller }
     * 
     */
    public ControllerImpl createController() {
        return new ControllerImpl();
    }

    /**
     * Create an instance of {@link Morph.Targets }
     * 
     */
    public MorphImpl.TargetsImpl createMorphTargets() {
        return new MorphImpl.TargetsImpl();
    }

    /**
     * Create an instance of {@link Skin.Joints }
     * 
     */
    public SkinImpl.JointsImpl createSkinJoints() {
        return new SkinImpl.JointsImpl();
    }

    /**
     * Create an instance of {@link Skin.VertexWeights }
     * 
     */
    public SkinImpl.VertexWeightsImpl createSkinVertexWeights() {
        return new SkinImpl.VertexWeightsImpl();
    }

    /**
     * Create an instance of {@link Polylist }
     * 
     */
    public PolylistImpl createPolylist() {
        return new PolylistImpl();
    }

    /**
     * Create an instance of {@link InstanceMaterial.Bind }
     * 
     */
    public InstanceMaterialImpl.BindImpl createInstanceMaterialBind() {
        return new InstanceMaterialImpl.BindImpl();
    }

    /**
     * Create an instance of {@link InstanceMaterial.BindVertexInput }
     * 
     */
    public InstanceMaterialImpl.BindVertexInputImpl createInstanceMaterialBindVertexInput() {
        return new InstanceMaterialImpl.BindVertexInputImpl();
    }

    /**
     * Create an instance of {@link InstanceWithExtra }
     * 
     */
    public InstanceWithExtraImpl createInstanceWithExtra() {
        return new InstanceWithExtraImpl();
    }

    /**
     * Create an instance of {@link AnimationClip }
     * 
     */
    public AnimationClipImpl createAnimationClip() {
        return new AnimationClipImpl();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public ImageImpl createImage() {
        return new ImageImpl();
    }

    /**
     * Create an instance of {@link LibraryCameras }
     * 
     */
    public LibraryCamerasImpl createLibraryCameras() {
        return new LibraryCamerasImpl();
    }

    /**
     * Create an instance of {@link Camera.Imager }
     * 
     */
    public CameraImpl.ImagerImpl createCameraImager() {
        return new CameraImpl.ImagerImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.RefAttachment }
     * 
     */
    public RigidConstraintImpl.RefAttachmentImpl createRigidConstraintRefAttachment() {
        return new RigidConstraintImpl.RefAttachmentImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.Attachment }
     * 
     */
    public RigidConstraintImpl.AttachmentImpl createRigidConstraintAttachment() {
        return new RigidConstraintImpl.AttachmentImpl();
    }

    /**
     * Create an instance of {@link LibraryPhysicsScenes }
     * 
     */
    public LibraryPhysicsScenesImpl createLibraryPhysicsScenes() {
        return new LibraryPhysicsScenesImpl();
    }

    /**
     * Create an instance of {@link InstancePhysicsModel }
     * 
     */
    public InstancePhysicsModelImpl createInstancePhysicsModel() {
        return new InstancePhysicsModelImpl();
    }

    /**
     * Create an instance of {@link InstanceRigidConstraint }
     * 
     */
    public InstanceRigidConstraintImpl createInstanceRigidConstraint() {
        return new InstanceRigidConstraintImpl();
    }

    /**
     * Create an instance of {@link PhysicsScene.TechniqueCommon }
     * 
     */
    public PhysicsSceneImpl.TechniqueCommonImpl createPhysicsSceneTechniqueCommon() {
        return new PhysicsSceneImpl.TechniqueCommonImpl();
    }

    /**
     * Create an instance of {@link Animation }
     * 
     */
    public AnimationImpl createAnimation() {
        return new AnimationImpl();
    }

    /**
     * Create an instance of {@link Sampler }
     * 
     */
    public SamplerImpl createSampler() {
        return new SamplerImpl();
    }

    /**
     * Create an instance of {@link InputLocal }
     * 
     */
    public InputLocalImpl createInputLocal() {
        return new InputLocalImpl();
    }

    /**
     * Create an instance of {@link Ellipsoid }
     * 
     */
    public EllipsoidImpl createEllipsoid() {
        return new EllipsoidImpl();
    }

    /**
     * Create an instance of {@link Node }
     * 
     */
    public NodeImpl createNode() {
        return new NodeImpl();
    }

    /**
     * Create an instance of {@link Matrix }
     * 
     */
    public MatrixImpl createMatrix() {
        return new MatrixImpl();
    }

    /**
     * Create an instance of {@link Skew }
     * 
     */
    public SkewImpl createSkew() {
        return new SkewImpl();
    }

    /**
     * Create an instance of {@link InstanceGeometry }
     * 
     */
    public InstanceGeometryImpl createInstanceGeometry() {
        return new InstanceGeometryImpl();
    }

    /**
     * Create an instance of {@link Linestrips }
     * 
     */
    public LinestripsImpl createLinestrips() {
        return new LinestripsImpl();
    }

    /**
     * Create an instance of {@link LibraryGeometries }
     * 
     */
    public LibraryGeometriesImpl createLibraryGeometries() {
        return new LibraryGeometriesImpl();
    }

    /**
     * Create an instance of {@link Geometry }
     * 
     */
    public GeometryImpl createGeometry() {
        return new GeometryImpl();
    }

    /**
     * Create an instance of {@link Spline.ControlVertices }
     * 
     */
    public SplineImpl.ControlVerticesImpl createSplineControlVertices() {
        return new SplineImpl.ControlVerticesImpl();
    }

    /**
     * Create an instance of {@link Mesh }
     * 
     */
    public MeshImpl createMesh() {
        return new MeshImpl();
    }

    /**
     * Create an instance of {@link Vertices }
     * 
     */
    public VerticesImpl createVertices() {
        return new VerticesImpl();
    }

    /**
     * Create an instance of {@link Lines }
     * 
     */
    public LinesImpl createLines() {
        return new LinesImpl();
    }

    /**
     * Create an instance of {@link Trifans }
     * 
     */
    public TrifansImpl createTrifans() {
        return new TrifansImpl();
    }

    /**
     * Create an instance of {@link Tristrips }
     * 
     */
    public TristripsImpl createTristrips() {
        return new TristripsImpl();
    }

    /**
     * Create an instance of {@link ConvexMesh }
     * 
     */
    public ConvexMeshImpl createConvexMesh() {
        return new ConvexMeshImpl();
    }

    /**
     * Create an instance of {@link LibraryLights }
     * 
     */
    public LibraryLightsImpl createLibraryLights() {
        return new LibraryLightsImpl();
    }

    /**
     * Create an instance of {@link Effect }
     * 
     */
    public EffectImpl createEffect() {
        return new EffectImpl();
    }

    /**
     * Create an instance of {@link FxAnnotateCommon }
     * 
     */
    public FxAnnotateCommonImpl createFxAnnotateCommon() {
        return new FxAnnotateCommonImpl();
    }

    /**
     * Create an instance of {@link FxNewparamCommon }
     * 
     */
    public FxNewparamCommonImpl createFxNewparamCommon() {
        return new FxNewparamCommonImpl();
    }

    /**
     * Create an instance of {@link InstanceEffect.TechniqueHint }
     * 
     */
    public InstanceEffectImpl.TechniqueHintImpl createInstanceEffectTechniqueHint() {
        return new InstanceEffectImpl.TechniqueHintImpl();
    }

    /**
     * Create an instance of {@link InstanceEffect.Setparam }
     * 
     */
    public InstanceEffectImpl.SetparamImpl createInstanceEffectSetparam() {
        return new InstanceEffectImpl.SetparamImpl();
    }

    /**
     * Create an instance of {@link LibraryEffects }
     * 
     */
    public LibraryEffectsImpl createLibraryEffects() {
        return new LibraryEffectsImpl();
    }

    /**
     * Create an instance of {@link LibraryAnimations }
     * 
     */
    public LibraryAnimationsImpl createLibraryAnimations() {
        return new LibraryAnimationsImpl();
    }

    /**
     * Create an instance of {@link Capsule }
     * 
     */
    public CapsuleImpl createCapsule() {
        return new CapsuleImpl();
    }

    /**
     * Create an instance of {@link PhysicsModel }
     * 
     */
    public PhysicsModelImpl createPhysicsModel() {
        return new PhysicsModelImpl();
    }

    /**
     * Create an instance of {@link Accessor }
     * 
     */
    public AccessorImpl createAccessor() {
        return new AccessorImpl();
    }

    /**
     * Create an instance of {@link Box }
     * 
     */
    public BoxImpl createBox() {
        return new BoxImpl();
    }

    /**
     * Create an instance of {@link LibraryImages }
     * 
     */
    public LibraryImagesImpl createLibraryImages() {
        return new LibraryImagesImpl();
    }

    /**
     * Create an instance of {@link LibraryPhysicsModels }
     * 
     */
    public LibraryPhysicsModelsImpl createLibraryPhysicsModels() {
        return new LibraryPhysicsModelsImpl();
    }

    /**
     * Create an instance of {@link Sphere }
     * 
     */
    public SphereImpl createSphere() {
        return new SphereImpl();
    }

    /**
     * Create an instance of {@link LibraryMaterials }
     * 
     */
    public LibraryMaterialsImpl createLibraryMaterials() {
        return new LibraryMaterialsImpl();
    }

    /**
     * Create an instance of {@link Material }
     * 
     */
    public MaterialImpl createMaterial() {
        return new MaterialImpl();
    }

    /**
     * Create an instance of {@link LibraryAnimationClips }
     * 
     */
    public LibraryAnimationClipsImpl createLibraryAnimationClips() {
        return new LibraryAnimationClipsImpl();
    }

    /**
     * Create an instance of {@link ForceField }
     * 
     */
    public ForceFieldImpl createForceField() {
        return new ForceFieldImpl();
    }

    /**
     * Create an instance of {@link LibraryNodes }
     * 
     */
    public LibraryNodesImpl createLibraryNodes() {
        return new LibraryNodesImpl();
    }

    /**
     * Create an instance of {@link TaperedCylinder }
     * 
     */
    public TaperedCylinderImpl createTaperedCylinder() {
        return new TaperedCylinderImpl();
    }

    /**
     * Create an instance of {@link LibraryForceFields }
     * 
     */
    public LibraryForceFieldsImpl createLibraryForceFields() {
        return new LibraryForceFieldsImpl();
    }

    /**
     * Create an instance of {@link LibraryVisualScenes }
     * 
     */
    public LibraryVisualScenesImpl createLibraryVisualScenes() {
        return new LibraryVisualScenesImpl();
    }

    /**
     * Create an instance of {@link COLLADA.Scene }
     * 
     */
    public COLLADAImpl.SceneImpl createCOLLADAScene() {
        return new COLLADAImpl.SceneImpl();
    }

    /**
     * Create an instance of {@link TaperedCapsule }
     * 
     */
    public TaperedCapsuleImpl createTaperedCapsule() {
        return new TaperedCapsuleImpl();
    }

    /**
     * Create an instance of {@link Cylinder }
     * 
     */
    public CylinderImpl createCylinder() {
        return new CylinderImpl();
    }

    /**
     * Create an instance of {@link FxStenciltargetCommon }
     * 
     */
    public FxStenciltargetCommonImpl createFxStenciltargetCommon() {
        return new FxStenciltargetCommonImpl();
    }

    /**
     * Create an instance of {@link CgConnectParam }
     * 
     */
    public CgConnectParamImpl createCgConnectParam() {
        return new CgConnectParamImpl();
    }

    /**
     * Create an instance of {@link CgNewparam }
     * 
     */
    public CgNewparamImpl createCgNewparam() {
        return new CgNewparamImpl();
    }

    /**
     * Create an instance of {@link CgSamplerDEPTH }
     * 
     */
    public CgSamplerDEPTHImpl createCgSamplerDEPTH() {
        return new CgSamplerDEPTHImpl();
    }

    /**
     * Create an instance of {@link FxSampler1DCommon }
     * 
     */
    public FxSampler1DCommonImpl createFxSampler1DCommon() {
        return new FxSampler1DCommonImpl();
    }

    /**
     * Create an instance of {@link FxCleardepthCommon }
     * 
     */
    public FxCleardepthCommonImpl createFxCleardepthCommon() {
        return new FxCleardepthCommonImpl();
    }

    /**
     * Create an instance of {@link FxSamplerCUBECommon }
     * 
     */
    public FxSamplerCUBECommonImpl createFxSamplerCUBECommon() {
        return new FxSamplerCUBECommonImpl();
    }

    /**
     * Create an instance of {@link CgSamplerRECT }
     * 
     */
    public CgSamplerRECTImpl createCgSamplerRECT() {
        return new CgSamplerRECTImpl();
    }

    /**
     * Create an instance of {@link GlesNewparam }
     * 
     */
    public GlesNewparamImpl createGlesNewparam() {
        return new GlesNewparamImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceFormatHintCommon }
     * 
     */
    public FxSurfaceFormatHintCommonImpl createFxSurfaceFormatHintCommon() {
        return new FxSurfaceFormatHintCommonImpl();
    }

    /**
     * Create an instance of {@link FxDepthtargetCommon }
     * 
     */
    public FxDepthtargetCommonImpl createFxDepthtargetCommon() {
        return new FxDepthtargetCommonImpl();
    }

    /**
     * Create an instance of {@link FxColortargetCommon }
     * 
     */
    public FxColortargetCommonImpl createFxColortargetCommon() {
        return new FxColortargetCommonImpl();
    }

    /**
     * Create an instance of {@link CgSetuserType }
     * 
     */
    public CgSetuserTypeImpl createCgSetuserType() {
        return new CgSetuserTypeImpl();
    }

    /**
     * Create an instance of {@link CgSetparam }
     * 
     */
    public CgSetparamImpl createCgSetparam() {
        return new CgSetparamImpl();
    }

    /**
     * Create an instance of {@link GlslNewarrayType }
     * 
     */
    public GlslNewarrayTypeImpl createGlslNewarrayType() {
        return new GlslNewarrayTypeImpl();
    }

    /**
     * Create an instance of {@link CgSamplerCUBE }
     * 
     */
    public CgSamplerCUBEImpl createCgSamplerCUBE() {
        return new CgSamplerCUBEImpl();
    }

    /**
     * Create an instance of {@link GlesTexturePipeline }
     * 
     */
    public GlesTexturePipelineImpl createGlesTexturePipeline() {
        return new GlesTexturePipelineImpl();
    }

    /**
     * Create an instance of {@link GlslSetparam }
     * 
     */
    public GlslSetparamImpl createGlslSetparam() {
        return new GlslSetparamImpl();
    }

    /**
     * Create an instance of {@link FxSampler3DCommon }
     * 
     */
    public FxSampler3DCommonImpl createFxSampler3DCommon() {
        return new FxSampler3DCommonImpl();
    }

    /**
     * Create an instance of {@link CommonNewparamType }
     * 
     */
    public CommonNewparamTypeImpl createCommonNewparamType() {
        return new CommonNewparamTypeImpl();
    }

    /**
     * Create an instance of {@link FxSamplerDEPTHCommon }
     * 
     */
    public FxSamplerDEPTHCommonImpl createFxSamplerDEPTHCommon() {
        return new FxSamplerDEPTHCommonImpl();
    }

    /**
     * Create an instance of {@link GlesTexcombinerCommandType }
     * 
     */
    public GlesTexcombinerCommandTypeImpl createGlesTexcombinerCommandType() {
        return new GlesTexcombinerCommandTypeImpl();
    }

    /**
     * Create an instance of {@link FxClearstencilCommon }
     * 
     */
    public FxClearstencilCommonImpl createFxClearstencilCommon() {
        return new FxClearstencilCommonImpl();
    }

    /**
     * Create an instance of {@link CommonTransparentType }
     * 
     */
    public CommonTransparentTypeImpl createCommonTransparentType() {
        return new CommonTransparentTypeImpl();
    }

    /**
     * Create an instance of {@link GlesTexcombinerArgumentRGBType }
     * 
     */
    public GlesTexcombinerArgumentRGBTypeImpl createGlesTexcombinerArgumentRGBType() {
        return new GlesTexcombinerArgumentRGBTypeImpl();
    }

    /**
     * Create an instance of {@link GlesTexcombinerCommandRGBType }
     * 
     */
    public GlesTexcombinerCommandRGBTypeImpl createGlesTexcombinerCommandRGBType() {
        return new GlesTexcombinerCommandRGBTypeImpl();
    }

    /**
     * Create an instance of {@link GlesTexcombinerCommandAlphaType }
     * 
     */
    public GlesTexcombinerCommandAlphaTypeImpl createGlesTexcombinerCommandAlphaType() {
        return new GlesTexcombinerCommandAlphaTypeImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceCommon }
     * 
     */
    public FxSurfaceCommonImpl createFxSurfaceCommon() {
        return new FxSurfaceCommonImpl();
    }

    /**
     * Create an instance of {@link GlslSetarrayType }
     * 
     */
    public GlslSetarrayTypeImpl createGlslSetarrayType() {
        return new GlslSetarrayTypeImpl();
    }

    /**
     * Create an instance of {@link GlSamplerDEPTH }
     * 
     */
    public GlSamplerDEPTHImpl createGlSamplerDEPTH() {
        return new GlSamplerDEPTHImpl();
    }

    /**
     * Create an instance of {@link GlesSamplerState }
     * 
     */
    public GlesSamplerStateImpl createGlesSamplerState() {
        return new GlesSamplerStateImpl();
    }

    /**
     * Create an instance of {@link FxCodeProfile }
     * 
     */
    public FxCodeProfileImpl createFxCodeProfile() {
        return new FxCodeProfileImpl();
    }

    /**
     * Create an instance of {@link GlSampler2D }
     * 
     */
    public GlSampler2DImpl createGlSampler2D() {
        return new GlSampler2DImpl();
    }

    /**
     * Create an instance of {@link CgNewarrayType }
     * 
     */
    public CgNewarrayTypeImpl createCgNewarrayType() {
        return new CgNewarrayTypeImpl();
    }

    /**
     * Create an instance of {@link CgSampler3D }
     * 
     */
    public CgSampler3DImpl createCgSampler3D() {
        return new CgSampler3DImpl();
    }

    /**
     * Create an instance of {@link GlSampler3D }
     * 
     */
    public GlSampler3DImpl createGlSampler3D() {
        return new GlSampler3DImpl();
    }

    /**
     * Create an instance of {@link GlSamplerRECT }
     * 
     */
    public GlSamplerRECTImpl createGlSamplerRECT() {
        return new GlSamplerRECTImpl();
    }

    /**
     * Create an instance of {@link GlesTexenvCommandType }
     * 
     */
    public GlesTexenvCommandTypeImpl createGlesTexenvCommandType() {
        return new GlesTexenvCommandTypeImpl();
    }

    /**
     * Create an instance of {@link FxSampler2DCommon }
     * 
     */
    public FxSampler2DCommonImpl createFxSampler2DCommon() {
        return new FxSampler2DCommonImpl();
    }

    /**
     * Create an instance of {@link GlesTextureConstantType }
     * 
     */
    public GlesTextureConstantTypeImpl createGlesTextureConstantType() {
        return new GlesTextureConstantTypeImpl();
    }

    /**
     * Create an instance of {@link GlSamplerCUBE }
     * 
     */
    public GlSamplerCUBEImpl createGlSamplerCUBE() {
        return new GlSamplerCUBEImpl();
    }

    /**
     * Create an instance of {@link CgSampler1D }
     * 
     */
    public CgSampler1DImpl createCgSampler1D() {
        return new CgSampler1DImpl();
    }

    /**
     * Create an instance of {@link CgSampler2D }
     * 
     */
    public CgSampler2DImpl createCgSampler2D() {
        return new CgSampler2DImpl();
    }

    /**
     * Create an instance of {@link GlslSetparamSimple }
     * 
     */
    public GlslSetparamSimpleImpl createGlslSetparamSimple() {
        return new GlslSetparamSimpleImpl();
    }

    /**
     * Create an instance of {@link GlesTexcombinerArgumentAlphaType }
     * 
     */
    public GlesTexcombinerArgumentAlphaTypeImpl createGlesTexcombinerArgumentAlphaType() {
        return new GlesTexcombinerArgumentAlphaTypeImpl();
    }

    /**
     * Create an instance of {@link TargetableFloat }
     * 
     */
    public TargetableFloatImpl createTargetableFloat() {
        return new TargetableFloatImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceInitFromCommon }
     * 
     */
    public FxSurfaceInitFromCommonImpl createFxSurfaceInitFromCommon() {
        return new FxSurfaceInitFromCommonImpl();
    }

    /**
     * Create an instance of {@link InputGlobal }
     * 
     */
    public InputGlobalImpl createInputGlobal() {
        return new InputGlobalImpl();
    }

    /**
     * Create an instance of {@link FxClearcolorCommon }
     * 
     */
    public FxClearcolorCommonImpl createFxClearcolorCommon() {
        return new FxClearcolorCommonImpl();
    }

    /**
     * Create an instance of {@link FxSamplerRECTCommon }
     * 
     */
    public FxSamplerRECTCommonImpl createFxSamplerRECTCommon() {
        return new FxSamplerRECTCommonImpl();
    }

    /**
     * Create an instance of {@link GlslNewparam }
     * 
     */
    public GlslNewparamImpl createGlslNewparam() {
        return new GlslNewparamImpl();
    }

    /**
     * Create an instance of {@link FxIncludeCommon }
     * 
     */
    public FxIncludeCommonImpl createFxIncludeCommon() {
        return new FxIncludeCommonImpl();
    }

    /**
     * Create an instance of {@link CgSetarrayType }
     * 
     */
    public CgSetarrayTypeImpl createCgSetarrayType() {
        return new CgSetarrayTypeImpl();
    }

    /**
     * Create an instance of {@link GlSampler1D }
     * 
     */
    public GlSampler1DImpl createGlSampler1D() {
        return new GlSampler1DImpl();
    }

    /**
     * Create an instance of {@link CgSetparamSimple }
     * 
     */
    public CgSetparamSimpleImpl createCgSetparamSimple() {
        return new CgSetparamSimpleImpl();
    }

    /**
     * Create an instance of {@link GlesTextureUnit.Texcoord }
     * 
     */
    public GlesTextureUnitImpl.TexcoordImpl createGlesTextureUnitTexcoord() {
        return new GlesTextureUnitImpl.TexcoordImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceInitCubeCommon.Face }
     * 
     */
    public FxSurfaceInitCubeCommonImpl.FaceImpl createFxSurfaceInitCubeCommonFace() {
        return new FxSurfaceInitCubeCommonImpl.FaceImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceInitCubeCommon.Primary }
     * 
     */
    public FxSurfaceInitCubeCommonImpl.PrimaryImpl createFxSurfaceInitCubeCommonPrimary() {
        return new FxSurfaceInitCubeCommonImpl.PrimaryImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceInitCubeCommon.All }
     * 
     */
    public FxSurfaceInitCubeCommonImpl.AllImpl createFxSurfaceInitCubeCommonAll() {
        return new FxSurfaceInitCubeCommonImpl.AllImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceInitVolumeCommon.Primary }
     * 
     */
    public FxSurfaceInitVolumeCommonImpl.PrimaryImpl createFxSurfaceInitVolumeCommonPrimary() {
        return new FxSurfaceInitVolumeCommonImpl.PrimaryImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceInitVolumeCommon.All }
     * 
     */
    public FxSurfaceInitVolumeCommonImpl.AllImpl createFxSurfaceInitVolumeCommonAll() {
        return new FxSurfaceInitVolumeCommonImpl.AllImpl();
    }

    /**
     * Create an instance of {@link CommonFloatOrParamType.Param }
     * 
     */
    public CommonFloatOrParamTypeImpl.ParamImpl createCommonFloatOrParamTypeParam() {
        return new CommonFloatOrParamTypeImpl.ParamImpl();
    }

    /**
     * Create an instance of {@link CommonFloatOrParamType.Float }
     * 
     */
    public CommonFloatOrParamTypeImpl.FloatImpl createCommonFloatOrParamTypeFloat() {
        return new CommonFloatOrParamTypeImpl.FloatImpl();
    }

    /**
     * Create an instance of {@link CgSurfaceType.Generator.Name }
     * 
     */
    public CgSurfaceTypeImpl.GeneratorImpl.NameImpl createCgSurfaceTypeGeneratorName() {
        return new CgSurfaceTypeImpl.GeneratorImpl.NameImpl();
    }

    /**
     * Create an instance of {@link CommonColorOrTextureType.Texture }
     * 
     */
    public CommonColorOrTextureTypeImpl.TextureImpl createCommonColorOrTextureTypeTexture() {
        return new CommonColorOrTextureTypeImpl.TextureImpl();
    }

    /**
     * Create an instance of {@link CommonColorOrTextureType.Param }
     * 
     */
    public CommonColorOrTextureTypeImpl.ParamImpl createCommonColorOrTextureTypeParam() {
        return new CommonColorOrTextureTypeImpl.ParamImpl();
    }

    /**
     * Create an instance of {@link CommonColorOrTextureType.Color }
     * 
     */
    public CommonColorOrTextureTypeImpl.ColorImpl createCommonColorOrTextureTypeColor() {
        return new CommonColorOrTextureTypeImpl.ColorImpl();
    }

    /**
     * Create an instance of {@link FxSurfaceInitPlanarCommon.All }
     * 
     */
    public FxSurfaceInitPlanarCommonImpl.AllImpl createFxSurfaceInitPlanarCommonAll() {
        return new FxSurfaceInitPlanarCommonImpl.AllImpl();
    }

    /**
     * Create an instance of {@link GlslSurfaceType.Generator.Name }
     * 
     */
    public GlslSurfaceTypeImpl.GeneratorImpl.NameImpl createGlslSurfaceTypeGeneratorName() {
        return new GlslSurfaceTypeImpl.GeneratorImpl.NameImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendEquation }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationImpl createProfileCGTechniquePassBlendEquation() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.CullFace }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.CullFaceImpl createProfileCGTechniquePassCullFace() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.CullFaceImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.DepthFunc }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.DepthFuncImpl createProfileCGTechniquePassDepthFunc() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.DepthFuncImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.FogMode }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.FogModeImpl createProfileCGTechniquePassFogMode() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.FogModeImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.FogCoordSrc }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.FogCoordSrcImpl createProfileCGTechniquePassFogCoordSrc() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.FogCoordSrcImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.FrontFace }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.FrontFaceImpl createProfileCGTechniquePassFrontFace() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.FrontFaceImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightModelColorControl }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LightModelColorControlImpl createProfileCGTechniquePassLightModelColorControl() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightModelColorControlImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LogicOp }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LogicOpImpl createProfileCGTechniquePassLogicOp() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LogicOpImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ShadeModel }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ShadeModelImpl createProfileCGTechniquePassShadeModel() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ShadeModelImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LightEnableImpl createProfileCGTechniquePassLightEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightAmbient }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LightAmbientImpl createProfileCGTechniquePassLightAmbient() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightAmbientImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightDiffuse }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LightDiffuseImpl createProfileCGTechniquePassLightDiffuse() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightDiffuseImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightSpecular }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LightSpecularImpl createProfileCGTechniquePassLightSpecular() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightSpecularImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightPosition }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LightPositionImpl createProfileCGTechniquePassLightPosition() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightPositionImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightConstantAttenuation }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LightConstantAttenuationImpl createProfileCGTechniquePassLightConstantAttenuation() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightConstantAttenuationImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightLinearAttenuation }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LightLinearAttenuationImpl createProfileCGTechniquePassLightLinearAttenuation() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightLinearAttenuationImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightQuadraticAttenuation }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LightQuadraticAttenuationImpl createProfileCGTechniquePassLightQuadraticAttenuation() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightQuadraticAttenuationImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightSpotCutoff }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LightSpotCutoffImpl createProfileCGTechniquePassLightSpotCutoff() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightSpotCutoffImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightSpotDirection }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LightSpotDirectionImpl createProfileCGTechniquePassLightSpotDirection() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightSpotDirectionImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightSpotExponent }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LightSpotExponentImpl createProfileCGTechniquePassLightSpotExponent() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightSpotExponentImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Texture1D }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.Texture1DImpl createProfileCGTechniquePassTexture1D() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.Texture1DImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Texture2D }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.Texture2DImpl createProfileCGTechniquePassTexture2D() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.Texture2DImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Texture3D }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.Texture3DImpl createProfileCGTechniquePassTexture3D() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.Texture3DImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.TextureCUBE }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.TextureCUBEImpl createProfileCGTechniquePassTextureCUBE() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.TextureCUBEImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.TextureRECT }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.TextureRECTImpl createProfileCGTechniquePassTextureRECT() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.TextureRECTImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.TextureDEPTH }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.TextureDEPTHImpl createProfileCGTechniquePassTextureDEPTH() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.TextureDEPTHImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Texture1DEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.Texture1DEnableImpl createProfileCGTechniquePassTexture1DEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.Texture1DEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Texture2DEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.Texture2DEnableImpl createProfileCGTechniquePassTexture2DEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.Texture2DEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Texture3DEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.Texture3DEnableImpl createProfileCGTechniquePassTexture3DEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.Texture3DEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.TextureCUBEEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.TextureCUBEEnableImpl createProfileCGTechniquePassTextureCUBEEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.TextureCUBEEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.TextureRECTEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.TextureRECTEnableImpl createProfileCGTechniquePassTextureRECTEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.TextureRECTEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.TextureDEPTHEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.TextureDEPTHEnableImpl createProfileCGTechniquePassTextureDEPTHEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.TextureDEPTHEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.TextureEnvColor }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.TextureEnvColorImpl createProfileCGTechniquePassTextureEnvColor() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.TextureEnvColorImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.TextureEnvMode }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.TextureEnvModeImpl createProfileCGTechniquePassTextureEnvMode() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.TextureEnvModeImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ClipPlane }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ClipPlaneImpl createProfileCGTechniquePassClipPlane() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ClipPlaneImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ClipPlaneEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ClipPlaneEnableImpl createProfileCGTechniquePassClipPlaneEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ClipPlaneEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendColor }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.BlendColorImpl createProfileCGTechniquePassBlendColor() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendColorImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ClearColor }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ClearColorImpl createProfileCGTechniquePassClearColor() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ClearColorImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ClearStencil }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ClearStencilImpl createProfileCGTechniquePassClearStencil() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ClearStencilImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ClearDepth }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ClearDepthImpl createProfileCGTechniquePassClearDepth() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ClearDepthImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ColorMask }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaskImpl createProfileCGTechniquePassColorMask() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaskImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.DepthBounds }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.DepthBoundsImpl createProfileCGTechniquePassDepthBounds() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.DepthBoundsImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.DepthMask }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.DepthMaskImpl createProfileCGTechniquePassDepthMask() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.DepthMaskImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.DepthRange }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.DepthRangeImpl createProfileCGTechniquePassDepthRange() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.DepthRangeImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.FogDensity }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.FogDensityImpl createProfileCGTechniquePassFogDensity() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.FogDensityImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.FogStart }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.FogStartImpl createProfileCGTechniquePassFogStart() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.FogStartImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.FogEnd }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.FogEndImpl createProfileCGTechniquePassFogEnd() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.FogEndImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.FogColor }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.FogColorImpl createProfileCGTechniquePassFogColor() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.FogColorImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightModelAmbient }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LightModelAmbientImpl createProfileCGTechniquePassLightModelAmbient() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightModelAmbientImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightingEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LightingEnableImpl createProfileCGTechniquePassLightingEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightingEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LineStipple }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LineStippleImpl createProfileCGTechniquePassLineStipple() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LineStippleImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LineWidth }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LineWidthImpl createProfileCGTechniquePassLineWidth() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LineWidthImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.MaterialAmbient }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.MaterialAmbientImpl createProfileCGTechniquePassMaterialAmbient() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.MaterialAmbientImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.MaterialDiffuse }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.MaterialDiffuseImpl createProfileCGTechniquePassMaterialDiffuse() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.MaterialDiffuseImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.MaterialEmission }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.MaterialEmissionImpl createProfileCGTechniquePassMaterialEmission() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.MaterialEmissionImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.MaterialShininess }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.MaterialShininessImpl createProfileCGTechniquePassMaterialShininess() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.MaterialShininessImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.MaterialSpecular }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.MaterialSpecularImpl createProfileCGTechniquePassMaterialSpecular() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.MaterialSpecularImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ModelViewMatrix }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ModelViewMatrixImpl createProfileCGTechniquePassModelViewMatrix() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ModelViewMatrixImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PointDistanceAttenuation }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.PointDistanceAttenuationImpl createProfileCGTechniquePassPointDistanceAttenuation() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PointDistanceAttenuationImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PointFadeThresholdSize }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.PointFadeThresholdSizeImpl createProfileCGTechniquePassPointFadeThresholdSize() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PointFadeThresholdSizeImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PointSize }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.PointSizeImpl createProfileCGTechniquePassPointSize() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PointSizeImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PointSizeMin }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.PointSizeMinImpl createProfileCGTechniquePassPointSizeMin() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PointSizeMinImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PointSizeMax }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.PointSizeMaxImpl createProfileCGTechniquePassPointSizeMax() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PointSizeMaxImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PolygonOffset }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.PolygonOffsetImpl createProfileCGTechniquePassPolygonOffset() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PolygonOffsetImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ProjectionMatrix }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ProjectionMatrixImpl createProfileCGTechniquePassProjectionMatrix() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ProjectionMatrixImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Scissor }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ScissorImpl createProfileCGTechniquePassScissor() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ScissorImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilMask }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskImpl createProfileCGTechniquePassStencilMask() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.AlphaTestEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.AlphaTestEnableImpl createProfileCGTechniquePassAlphaTestEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.AlphaTestEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.AutoNormalEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.AutoNormalEnableImpl createProfileCGTechniquePassAutoNormalEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.AutoNormalEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.BlendEnableImpl createProfileCGTechniquePassBlendEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ColorLogicOpEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ColorLogicOpEnableImpl createProfileCGTechniquePassColorLogicOpEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ColorLogicOpEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ColorMaterialEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialEnableImpl createProfileCGTechniquePassColorMaterialEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.CullFaceEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.CullFaceEnableImpl createProfileCGTechniquePassCullFaceEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.CullFaceEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.DepthBoundsEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.DepthBoundsEnableImpl createProfileCGTechniquePassDepthBoundsEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.DepthBoundsEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.DepthClampEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.DepthClampEnableImpl createProfileCGTechniquePassDepthClampEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.DepthClampEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.DepthTestEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.DepthTestEnableImpl createProfileCGTechniquePassDepthTestEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.DepthTestEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.DitherEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.DitherEnableImpl createProfileCGTechniquePassDitherEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.DitherEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.FogEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.FogEnableImpl createProfileCGTechniquePassFogEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.FogEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightModelLocalViewerEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LightModelLocalViewerEnableImpl createProfileCGTechniquePassLightModelLocalViewerEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightModelLocalViewerEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LightModelTwoSideEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LightModelTwoSideEnableImpl createProfileCGTechniquePassLightModelTwoSideEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LightModelTwoSideEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LineSmoothEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LineSmoothEnableImpl createProfileCGTechniquePassLineSmoothEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LineSmoothEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LineStippleEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LineStippleEnableImpl createProfileCGTechniquePassLineStippleEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LineStippleEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.LogicOpEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.LogicOpEnableImpl createProfileCGTechniquePassLogicOpEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.LogicOpEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.MultisampleEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.MultisampleEnableImpl createProfileCGTechniquePassMultisampleEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.MultisampleEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.NormalizeEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.NormalizeEnableImpl createProfileCGTechniquePassNormalizeEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.NormalizeEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PointSmoothEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.PointSmoothEnableImpl createProfileCGTechniquePassPointSmoothEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PointSmoothEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PolygonOffsetFillEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.PolygonOffsetFillEnableImpl createProfileCGTechniquePassPolygonOffsetFillEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PolygonOffsetFillEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PolygonOffsetLineEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.PolygonOffsetLineEnableImpl createProfileCGTechniquePassPolygonOffsetLineEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PolygonOffsetLineEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PolygonOffsetPointEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.PolygonOffsetPointEnableImpl createProfileCGTechniquePassPolygonOffsetPointEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PolygonOffsetPointEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PolygonSmoothEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.PolygonSmoothEnableImpl createProfileCGTechniquePassPolygonSmoothEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PolygonSmoothEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PolygonStippleEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.PolygonStippleEnableImpl createProfileCGTechniquePassPolygonStippleEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PolygonStippleEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.RescaleNormalEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.RescaleNormalEnableImpl createProfileCGTechniquePassRescaleNormalEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.RescaleNormalEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.SampleAlphaToCoverageEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.SampleAlphaToCoverageEnableImpl createProfileCGTechniquePassSampleAlphaToCoverageEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.SampleAlphaToCoverageEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.SampleAlphaToOneEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.SampleAlphaToOneEnableImpl createProfileCGTechniquePassSampleAlphaToOneEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.SampleAlphaToOneEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.SampleCoverageEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.SampleCoverageEnableImpl createProfileCGTechniquePassSampleCoverageEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.SampleCoverageEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ScissorTestEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ScissorTestEnableImpl createProfileCGTechniquePassScissorTestEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ScissorTestEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilTestEnable }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilTestEnableImpl createProfileCGTechniquePassStencilTestEnable() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilTestEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Shader.CompilerTarget }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.CompilerTargetImpl createProfileCGTechniquePassShaderCompilerTarget() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.CompilerTargetImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Shader.Name }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.NameImpl createProfileCGTechniquePassShaderName() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.NameImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.Shader.Bind.Param }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.BindImpl.ParamImpl createProfileCGTechniquePassShaderBindParam() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ShaderImpl.BindImpl.ParamImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilMaskSeparate.Face }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskSeparateImpl.FaceImpl createProfileCGTechniquePassStencilMaskSeparateFace() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskSeparateImpl.FaceImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilMaskSeparate.Mask }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskSeparateImpl.MaskImpl createProfileCGTechniquePassStencilMaskSeparateMask() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilMaskSeparateImpl.MaskImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilOpSeparate.Face }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.FaceImpl createProfileCGTechniquePassStencilOpSeparateFace() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.FaceImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilOpSeparate.Fail }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.FailImpl createProfileCGTechniquePassStencilOpSeparateFail() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.FailImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilOpSeparate.Zfail }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.ZfailImpl createProfileCGTechniquePassStencilOpSeparateZfail() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.ZfailImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilOpSeparate.Zpass }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.ZpassImpl createProfileCGTechniquePassStencilOpSeparateZpass() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpSeparateImpl.ZpassImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilFuncSeparate.Front }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.FrontImpl createProfileCGTechniquePassStencilFuncSeparateFront() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.FrontImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilFuncSeparate.Back }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.BackImpl createProfileCGTechniquePassStencilFuncSeparateBack() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.BackImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilFuncSeparate.Ref }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.RefImpl createProfileCGTechniquePassStencilFuncSeparateRef() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.RefImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilFuncSeparate.Mask }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.MaskImpl createProfileCGTechniquePassStencilFuncSeparateMask() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncSeparateImpl.MaskImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilOp.Fail }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl.FailImpl createProfileCGTechniquePassStencilOpFail() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl.FailImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilOp.Zfail }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZfailImpl createProfileCGTechniquePassStencilOpZfail() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZfailImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilOp.Zpass }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZpassImpl createProfileCGTechniquePassStencilOpZpass() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZpassImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilFunc.Func }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl.FuncImpl createProfileCGTechniquePassStencilFuncFunc() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl.FuncImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilFunc.Ref }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl.RefImpl createProfileCGTechniquePassStencilFuncRef() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl.RefImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.StencilFunc.Mask }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl.MaskImpl createProfileCGTechniquePassStencilFuncMask() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.StencilFuncImpl.MaskImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PolygonMode.Face }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.PolygonModeImpl.FaceImpl createProfileCGTechniquePassPolygonModeFace() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PolygonModeImpl.FaceImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.PolygonMode.Mode }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.PolygonModeImpl.ModeImpl createProfileCGTechniquePassPolygonModeMode() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.PolygonModeImpl.ModeImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ColorMaterial.Face }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialImpl.FaceImpl createProfileCGTechniquePassColorMaterialFace() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialImpl.FaceImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.ColorMaterial.Mode }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialImpl.ModeImpl createProfileCGTechniquePassColorMaterialMode() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.ColorMaterialImpl.ModeImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendEquationSeparate.Rgb }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationSeparateImpl.RgbImpl createProfileCGTechniquePassBlendEquationSeparateRgb() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationSeparateImpl.RgbImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendEquationSeparate.Alpha }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationSeparateImpl.AlphaImpl createProfileCGTechniquePassBlendEquationSeparateAlpha() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendEquationSeparateImpl.AlphaImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendFuncSeparate.SrcRgb }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.SrcRgbImpl createProfileCGTechniquePassBlendFuncSeparateSrcRgb() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.SrcRgbImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendFuncSeparate.DestRgb }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.DestRgbImpl createProfileCGTechniquePassBlendFuncSeparateDestRgb() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.DestRgbImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendFuncSeparate.SrcAlpha }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.SrcAlphaImpl createProfileCGTechniquePassBlendFuncSeparateSrcAlpha() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.SrcAlphaImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendFuncSeparate.DestAlpha }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.DestAlphaImpl createProfileCGTechniquePassBlendFuncSeparateDestAlpha() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncSeparateImpl.DestAlphaImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendFunc.Src }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncImpl.SrcImpl createProfileCGTechniquePassBlendFuncSrc() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncImpl.SrcImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.BlendFunc.Dest }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncImpl.DestImpl createProfileCGTechniquePassBlendFuncDest() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.BlendFuncImpl.DestImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.AlphaFunc.Func }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.FuncImpl createProfileCGTechniquePassAlphaFuncFunc() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.FuncImpl();
    }

    /**
     * Create an instance of {@link ProfileCG.Technique.Pass.AlphaFunc.Value }
     * 
     */
    public ProfileCGImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.ValueImpl createProfileCGTechniquePassAlphaFuncValue() {
        return new ProfileCGImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.ValueImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Setparam }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.SetparamImpl createProfileGLESTechniqueSetparam() {
        return new ProfileGLESImpl.TechniqueImpl.SetparamImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ClearColor }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.ClearColorImpl createProfileGLESTechniquePassClearColor() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ClearColorImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ClearStencil }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.ClearStencilImpl createProfileGLESTechniquePassClearStencil() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ClearStencilImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ClearDepth }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.ClearDepthImpl createProfileGLESTechniquePassClearDepth() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ClearDepthImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ClipPlane }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.ClipPlaneImpl createProfileGLESTechniquePassClipPlane() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ClipPlaneImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ColorMask }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.ColorMaskImpl createProfileGLESTechniquePassColorMask() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ColorMaskImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.CullFace }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.CullFaceImpl createProfileGLESTechniquePassCullFace() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.CullFaceImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.DepthFunc }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.DepthFuncImpl createProfileGLESTechniquePassDepthFunc() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.DepthFuncImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.DepthMask }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.DepthMaskImpl createProfileGLESTechniquePassDepthMask() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.DepthMaskImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.DepthRange }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.DepthRangeImpl createProfileGLESTechniquePassDepthRange() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.DepthRangeImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.FogColor }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.FogColorImpl createProfileGLESTechniquePassFogColor() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.FogColorImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.FogDensity }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.FogDensityImpl createProfileGLESTechniquePassFogDensity() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.FogDensityImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.FogMode }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.FogModeImpl createProfileGLESTechniquePassFogMode() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.FogModeImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.FogStart }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.FogStartImpl createProfileGLESTechniquePassFogStart() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.FogStartImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.FogEnd }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.FogEndImpl createProfileGLESTechniquePassFogEnd() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.FogEndImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.FrontFace }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.FrontFaceImpl createProfileGLESTechniquePassFrontFace() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.FrontFaceImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.TexturePipeline }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.TexturePipelineImpl createProfileGLESTechniquePassTexturePipeline() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.TexturePipelineImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LogicOp }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.LogicOpImpl createProfileGLESTechniquePassLogicOp() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LogicOpImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightAmbient }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.LightAmbientImpl createProfileGLESTechniquePassLightAmbient() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightAmbientImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightDiffuse }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.LightDiffuseImpl createProfileGLESTechniquePassLightDiffuse() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightDiffuseImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightSpecular }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.LightSpecularImpl createProfileGLESTechniquePassLightSpecular() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightSpecularImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightPosition }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.LightPositionImpl createProfileGLESTechniquePassLightPosition() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightPositionImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightConstantAttenuation }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.LightConstantAttenuationImpl createProfileGLESTechniquePassLightConstantAttenuation() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightConstantAttenuationImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightLinearAttenutation }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.LightLinearAttenutationImpl createProfileGLESTechniquePassLightLinearAttenutation() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightLinearAttenutationImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightQuadraticAttenuation }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.LightQuadraticAttenuationImpl createProfileGLESTechniquePassLightQuadraticAttenuation() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightQuadraticAttenuationImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightSpotCutoff }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.LightSpotCutoffImpl createProfileGLESTechniquePassLightSpotCutoff() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightSpotCutoffImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightSpotDirection }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.LightSpotDirectionImpl createProfileGLESTechniquePassLightSpotDirection() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightSpotDirectionImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightSpotExponent }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.LightSpotExponentImpl createProfileGLESTechniquePassLightSpotExponent() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightSpotExponentImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightModelAmbient }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.LightModelAmbientImpl createProfileGLESTechniquePassLightModelAmbient() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightModelAmbientImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LineWidth }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.LineWidthImpl createProfileGLESTechniquePassLineWidth() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LineWidthImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.MaterialAmbient }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.MaterialAmbientImpl createProfileGLESTechniquePassMaterialAmbient() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.MaterialAmbientImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.MaterialDiffuse }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.MaterialDiffuseImpl createProfileGLESTechniquePassMaterialDiffuse() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.MaterialDiffuseImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.MaterialEmission }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.MaterialEmissionImpl createProfileGLESTechniquePassMaterialEmission() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.MaterialEmissionImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.MaterialShininess }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.MaterialShininessImpl createProfileGLESTechniquePassMaterialShininess() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.MaterialShininessImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.MaterialSpecular }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.MaterialSpecularImpl createProfileGLESTechniquePassMaterialSpecular() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.MaterialSpecularImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ModelViewMatrix }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.ModelViewMatrixImpl createProfileGLESTechniquePassModelViewMatrix() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ModelViewMatrixImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.PointDistanceAttenuation }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.PointDistanceAttenuationImpl createProfileGLESTechniquePassPointDistanceAttenuation() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.PointDistanceAttenuationImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.PointFadeThresholdSize }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.PointFadeThresholdSizeImpl createProfileGLESTechniquePassPointFadeThresholdSize() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.PointFadeThresholdSizeImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.PointSize }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.PointSizeImpl createProfileGLESTechniquePassPointSize() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.PointSizeImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.PointSizeMin }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.PointSizeMinImpl createProfileGLESTechniquePassPointSizeMin() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.PointSizeMinImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.PointSizeMax }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.PointSizeMaxImpl createProfileGLESTechniquePassPointSizeMax() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.PointSizeMaxImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.PolygonOffset }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.PolygonOffsetImpl createProfileGLESTechniquePassPolygonOffset() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.PolygonOffsetImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ProjectionMatrix }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.ProjectionMatrixImpl createProfileGLESTechniquePassProjectionMatrix() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ProjectionMatrixImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.Scissor }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.ScissorImpl createProfileGLESTechniquePassScissor() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ScissorImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ShadeModel }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.ShadeModelImpl createProfileGLESTechniquePassShadeModel() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ShadeModelImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.StencilMask }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.StencilMaskImpl createProfileGLESTechniquePassStencilMask() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.StencilMaskImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.AlphaTestEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.AlphaTestEnableImpl createProfileGLESTechniquePassAlphaTestEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.AlphaTestEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.BlendEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.BlendEnableImpl createProfileGLESTechniquePassBlendEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.BlendEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ClipPlaneEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.ClipPlaneEnableImpl createProfileGLESTechniquePassClipPlaneEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ClipPlaneEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ColorLogicOpEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.ColorLogicOpEnableImpl createProfileGLESTechniquePassColorLogicOpEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ColorLogicOpEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ColorMaterialEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.ColorMaterialEnableImpl createProfileGLESTechniquePassColorMaterialEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ColorMaterialEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.CullFaceEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.CullFaceEnableImpl createProfileGLESTechniquePassCullFaceEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.CullFaceEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.DepthTestEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.DepthTestEnableImpl createProfileGLESTechniquePassDepthTestEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.DepthTestEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.DitherEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.DitherEnableImpl createProfileGLESTechniquePassDitherEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.DitherEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.FogEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.FogEnableImpl createProfileGLESTechniquePassFogEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.FogEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.TexturePipelineEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.TexturePipelineEnableImpl createProfileGLESTechniquePassTexturePipelineEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.TexturePipelineEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.LightEnableImpl createProfileGLESTechniquePassLightEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightingEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.LightingEnableImpl createProfileGLESTechniquePassLightingEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightingEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LightModelTwoSideEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.LightModelTwoSideEnableImpl createProfileGLESTechniquePassLightModelTwoSideEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LightModelTwoSideEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.LineSmoothEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.LineSmoothEnableImpl createProfileGLESTechniquePassLineSmoothEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.LineSmoothEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.MultisampleEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.MultisampleEnableImpl createProfileGLESTechniquePassMultisampleEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.MultisampleEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.NormalizeEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.NormalizeEnableImpl createProfileGLESTechniquePassNormalizeEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.NormalizeEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.PointSmoothEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.PointSmoothEnableImpl createProfileGLESTechniquePassPointSmoothEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.PointSmoothEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.PolygonOffsetFillEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.PolygonOffsetFillEnableImpl createProfileGLESTechniquePassPolygonOffsetFillEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.PolygonOffsetFillEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.RescaleNormalEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.RescaleNormalEnableImpl createProfileGLESTechniquePassRescaleNormalEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.RescaleNormalEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.SampleAlphaToCoverageEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.SampleAlphaToCoverageEnableImpl createProfileGLESTechniquePassSampleAlphaToCoverageEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.SampleAlphaToCoverageEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.SampleAlphaToOneEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.SampleAlphaToOneEnableImpl createProfileGLESTechniquePassSampleAlphaToOneEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.SampleAlphaToOneEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.SampleCoverageEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.SampleCoverageEnableImpl createProfileGLESTechniquePassSampleCoverageEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.SampleCoverageEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.ScissorTestEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.ScissorTestEnableImpl createProfileGLESTechniquePassScissorTestEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.ScissorTestEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.StencilTestEnable }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.StencilTestEnableImpl createProfileGLESTechniquePassStencilTestEnable() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.StencilTestEnableImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.StencilOp.Fail }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl.FailImpl createProfileGLESTechniquePassStencilOpFail() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl.FailImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.StencilOp.Zfail }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZfailImpl createProfileGLESTechniquePassStencilOpZfail() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZfailImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.StencilOp.Zpass }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZpassImpl createProfileGLESTechniquePassStencilOpZpass() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.StencilOpImpl.ZpassImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.StencilFunc.Func }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl.FuncImpl createProfileGLESTechniquePassStencilFuncFunc() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl.FuncImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.StencilFunc.Ref }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl.RefImpl createProfileGLESTechniquePassStencilFuncRef() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl.RefImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.StencilFunc.Mask }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl.MaskImpl createProfileGLESTechniquePassStencilFuncMask() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.StencilFuncImpl.MaskImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.BlendFunc.Src }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.BlendFuncImpl.SrcImpl createProfileGLESTechniquePassBlendFuncSrc() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.BlendFuncImpl.SrcImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.BlendFunc.Dest }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.BlendFuncImpl.DestImpl createProfileGLESTechniquePassBlendFuncDest() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.BlendFuncImpl.DestImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.AlphaFunc.Func }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.FuncImpl createProfileGLESTechniquePassAlphaFuncFunc() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.FuncImpl();
    }

    /**
     * Create an instance of {@link ProfileGLES.Technique.Pass.AlphaFunc.Value }
     * 
     */
    public ProfileGLESImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.ValueImpl createProfileGLESTechniquePassAlphaFuncValue() {
        return new ProfileGLESImpl.TechniqueImpl.PassImpl.AlphaFuncImpl.ValueImpl();
    }

    /**
     * Create an instance of {@link ProfileCOMMON.Technique.Blinn }
     * 
     */
    public ProfileCOMMONImpl.TechniqueImpl.BlinnImpl createProfileCOMMONTechniqueBlinn() {
        return new ProfileCOMMONImpl.TechniqueImpl.BlinnImpl();
    }

    /**
     * Create an instance of {@link ProfileCOMMON.Technique.Phong }
     * 
     */
    public ProfileCOMMONImpl.TechniqueImpl.PhongImpl createProfileCOMMONTechniquePhong() {
        return new ProfileCOMMONImpl.TechniqueImpl.PhongImpl();
    }

    /**
     * Create an instance of {@link ProfileCOMMON.Technique.Lambert }
     * 
     */
    public ProfileCOMMONImpl.TechniqueImpl.LambertImpl createProfileCOMMONTechniqueLambert() {
        return new ProfileCOMMONImpl.TechniqueImpl.LambertImpl();
    }

    /**
     * Create an instance of {@link ProfileCOMMON.Technique.Constant }
     * 
     */
    public ProfileCOMMONImpl.TechniqueImpl.ConstantImpl createProfileCOMMONTechniqueConstant() {
        return new ProfileCOMMONImpl.TechniqueImpl.ConstantImpl();
    }

    /**
     * Create an instance of {@link VisualScene.EvaluateScene.Render }
     * 
     */
    public VisualSceneImpl.EvaluateSceneImpl.RenderImpl createVisualSceneEvaluateSceneRender() {
        return new VisualSceneImpl.EvaluateSceneImpl.RenderImpl();
    }

    /**
     * Create an instance of {@link RigidBody.TechniqueCommon.Dynamic }
     * 
     */
    public RigidBodyImpl.TechniqueCommonImpl.DynamicImpl createRigidBodyTechniqueCommonDynamic() {
        return new RigidBodyImpl.TechniqueCommonImpl.DynamicImpl();
    }

    /**
     * Create an instance of {@link RigidBody.TechniqueCommon.MassFrame }
     * 
     */
    public RigidBodyImpl.TechniqueCommonImpl.MassFrameImpl createRigidBodyTechniqueCommonMassFrame() {
        return new RigidBodyImpl.TechniqueCommonImpl.MassFrameImpl();
    }

    /**
     * Create an instance of {@link RigidBody.TechniqueCommon.Shape.Hollow }
     * 
     */
    public RigidBodyImpl.TechniqueCommonImpl.ShapeImpl.HollowImpl createRigidBodyTechniqueCommonShapeHollow() {
        return new RigidBodyImpl.TechniqueCommonImpl.ShapeImpl.HollowImpl();
    }

    /**
     * Create an instance of {@link Light.TechniqueCommon.Spot }
     * 
     */
    public LightImpl.TechniqueCommonImpl.SpotImpl createLightTechniqueCommonSpot() {
        return new LightImpl.TechniqueCommonImpl.SpotImpl();
    }

    /**
     * Create an instance of {@link Light.TechniqueCommon.Point }
     * 
     */
    public LightImpl.TechniqueCommonImpl.PointImpl createLightTechniqueCommonPoint() {
        return new LightImpl.TechniqueCommonImpl.PointImpl();
    }

    /**
     * Create an instance of {@link Light.TechniqueCommon.Directional }
     * 
     */
    public LightImpl.TechniqueCommonImpl.DirectionalImpl createLightTechniqueCommonDirectional() {
        return new LightImpl.TechniqueCommonImpl.DirectionalImpl();
    }

    /**
     * Create an instance of {@link Light.TechniqueCommon.Ambient }
     * 
     */
    public LightImpl.TechniqueCommonImpl.AmbientImpl createLightTechniqueCommonAmbient() {
        return new LightImpl.TechniqueCommonImpl.AmbientImpl();
    }

    /**
     * Create an instance of {@link InstanceRigidBody.TechniqueCommon.Dynamic }
     * 
     */
    public InstanceRigidBodyImpl.TechniqueCommonImpl.DynamicImpl createInstanceRigidBodyTechniqueCommonDynamic() {
        return new InstanceRigidBodyImpl.TechniqueCommonImpl.DynamicImpl();
    }

    /**
     * Create an instance of {@link InstanceRigidBody.TechniqueCommon.MassFrame }
     * 
     */
    public InstanceRigidBodyImpl.TechniqueCommonImpl.MassFrameImpl createInstanceRigidBodyTechniqueCommonMassFrame() {
        return new InstanceRigidBodyImpl.TechniqueCommonImpl.MassFrameImpl();
    }

    /**
     * Create an instance of {@link InstanceRigidBody.TechniqueCommon.Shape.Hollow }
     * 
     */
    public InstanceRigidBodyImpl.TechniqueCommonImpl.ShapeImpl.HollowImpl createInstanceRigidBodyTechniqueCommonShapeHollow() {
        return new InstanceRigidBodyImpl.TechniqueCommonImpl.ShapeImpl.HollowImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.TechniqueCommon.Enabled }
     * 
     */
    public RigidConstraintImpl.TechniqueCommonImpl.EnabledImpl createRigidConstraintTechniqueCommonEnabled() {
        return new RigidConstraintImpl.TechniqueCommonImpl.EnabledImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.TechniqueCommon.Interpenetrate }
     * 
     */
    public RigidConstraintImpl.TechniqueCommonImpl.InterpenetrateImpl createRigidConstraintTechniqueCommonInterpenetrate() {
        return new RigidConstraintImpl.TechniqueCommonImpl.InterpenetrateImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.TechniqueCommon.Spring.Angular }
     * 
     */
    public RigidConstraintImpl.TechniqueCommonImpl.SpringImpl.AngularImpl createRigidConstraintTechniqueCommonSpringAngular() {
        return new RigidConstraintImpl.TechniqueCommonImpl.SpringImpl.AngularImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.TechniqueCommon.Spring.Linear }
     * 
     */
    public RigidConstraintImpl.TechniqueCommonImpl.SpringImpl.LinearImpl createRigidConstraintTechniqueCommonSpringLinear() {
        return new RigidConstraintImpl.TechniqueCommonImpl.SpringImpl.LinearImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.TechniqueCommon.Limits.SwingConeAndTwist }
     * 
     */
    public RigidConstraintImpl.TechniqueCommonImpl.LimitsImpl.SwingConeAndTwistImpl createRigidConstraintTechniqueCommonLimitsSwingConeAndTwist() {
        return new RigidConstraintImpl.TechniqueCommonImpl.LimitsImpl.SwingConeAndTwistImpl();
    }

    /**
     * Create an instance of {@link RigidConstraint.TechniqueCommon.Limits.Linear }
     * 
     */
    public RigidConstraintImpl.TechniqueCommonImpl.LimitsImpl.LinearImpl createRigidConstraintTechniqueCommonLimitsLinear() {
        return new RigidConstraintImpl.TechniqueCommonImpl.LimitsImpl.LinearImpl();
    }

    /**
     * Create an instance of {@link Camera.Optics.TechniqueCommon.Perspective }
     * 
     */
    public CameraImpl.OpticsImpl.TechniqueCommonImpl.PerspectiveImpl createCameraOpticsTechniqueCommonPerspective() {
        return new CameraImpl.OpticsImpl.TechniqueCommonImpl.PerspectiveImpl();
    }

    /**
     * Create an instance of {@link Camera.Optics.TechniqueCommon.Orthographic }
     * 
     */
    public CameraImpl.OpticsImpl.TechniqueCommonImpl.OrthographicImpl createCameraOpticsTechniqueCommonOrthographic() {
        return new CameraImpl.OpticsImpl.TechniqueCommonImpl.OrthographicImpl();
    }

    /**
     * Create an instance of {@link ProfileGLSL.Technique.Pass.Shader.CompilerTarget }
     * 
     */
    public ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.CompilerTargetImpl createProfileGLSLTechniquePassShaderCompilerTarget() {
        return new ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.CompilerTargetImpl();
    }

    /**
     * Create an instance of {@link ProfileGLSL.Technique.Pass.Shader.Name }
     * 
     */
    public ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.NameImpl createProfileGLSLTechniquePassShaderName() {
        return new ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.NameImpl();
    }

    /**
     * Create an instance of {@link ProfileGLSL.Technique.Pass.Shader.Bind.Param }
     * 
     */
    public ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.BindImpl.ParamImpl createProfileGLSLTechniquePassShaderBindParam() {
        return new ProfileGLSLImpl.TechniqueImpl.PassImpl.ShaderImpl.BindImpl.ParamImpl();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetableFloat3Impl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "translate")
    public JAXBElement<TargetableFloat3Impl> createTranslate(TargetableFloat3Impl value) {
        return new JAXBElement<TargetableFloat3Impl>(_Translate_QNAME, TargetableFloat3Impl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetableFloat3Impl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "scale")
    public JAXBElement<TargetableFloat3Impl> createScale(TargetableFloat3Impl value) {
        return new JAXBElement<TargetableFloat3Impl>(_Scale_QNAME, TargetableFloat3Impl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileGLSLImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "profile_GLSL", substitutionHeadNamespace = "http://www.collada.org/2005/11/COLLADASchema", substitutionHeadName = "fx_profile_abstract")
    public JAXBElement<ProfileGLSLImpl> createProfileGLSL(ProfileGLSLImpl value) {
        return new JAXBElement<ProfileGLSLImpl>(_ProfileGLSL_QNAME, ProfileGLSLImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstanceWithExtraImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "instance_physics_material")
    public JAXBElement<InstanceWithExtraImpl> createInstancePhysicsMaterial(InstanceWithExtraImpl value) {
        return new JAXBElement<InstanceWithExtraImpl>(_InstancePhysicsMaterial_QNAME, InstanceWithExtraImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileGLESImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "profile_GLES", substitutionHeadNamespace = "http://www.collada.org/2005/11/COLLADASchema", substitutionHeadName = "fx_profile_abstract")
    public JAXBElement<ProfileGLESImpl> createProfileGLES(ProfileGLESImpl value) {
        return new JAXBElement<ProfileGLESImpl>(_ProfileGLES_QNAME, ProfileGLESImpl.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InstanceWithExtraImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "instance_force_field")
    public JAXBElement<InstanceWithExtraImpl> createInstanceForceField(InstanceWithExtraImpl value) {
        return new JAXBElement<InstanceWithExtraImpl>(_InstanceForceField_QNAME, InstanceWithExtraImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstanceWithExtraImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "instance_camera")
    public JAXBElement<InstanceWithExtraImpl> createInstanceCamera(InstanceWithExtraImpl value) {
        return new JAXBElement<InstanceWithExtraImpl>(_InstanceCamera_QNAME, InstanceWithExtraImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileCGImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "profile_CG", substitutionHeadNamespace = "http://www.collada.org/2005/11/COLLADASchema", substitutionHeadName = "fx_profile_abstract")
    public JAXBElement<ProfileCGImpl> createProfileCG(ProfileCGImpl value) {
        return new JAXBElement<ProfileCGImpl>(_ProfileCG_QNAME, ProfileCGImpl.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileCOMMONImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "profile_COMMON", substitutionHeadNamespace = "http://www.collada.org/2005/11/COLLADASchema", substitutionHeadName = "fx_profile_abstract")
    public JAXBElement<ProfileCOMMONImpl> createProfileCOMMON(ProfileCOMMONImpl value) {
        return new JAXBElement<ProfileCOMMONImpl>(_ProfileCOMMON_QNAME, ProfileCOMMONImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstanceWithExtraImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "instance_node")
    public JAXBElement<InstanceWithExtraImpl> createInstanceNode(InstanceWithExtraImpl value) {
        return new JAXBElement<InstanceWithExtraImpl>(_InstanceNode_QNAME, InstanceWithExtraImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstanceWithExtraImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "instance_light")
    public JAXBElement<InstanceWithExtraImpl> createInstanceLight(InstanceWithExtraImpl value) {
        return new JAXBElement<InstanceWithExtraImpl>(_InstanceLight_QNAME, InstanceWithExtraImpl.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GlslSurfaceTypeImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "surface", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<GlslSurfaceTypeImpl> createGlslSetarrayTypeSurface(GlslSurfaceTypeImpl value) {
        return new JAXBElement<GlslSurfaceTypeImpl>(_GlslSetarrayTypeSurface_QNAME, GlslSurfaceTypeImpl.class, GlslSetarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSampler1DImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler1D", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<GlSampler1DImpl> createGlslSetarrayTypeSampler1D(GlSampler1DImpl value) {
        return new JAXBElement<GlSampler1DImpl>(_GlslSetarrayTypeSampler1D_QNAME, GlSampler1DImpl.class, GlslSetarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSampler2DImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler2D", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<GlSampler2DImpl> createGlslSetarrayTypeSampler2D(GlSampler2DImpl value) {
        return new JAXBElement<GlSampler2DImpl>(_GlslSetarrayTypeSampler2D_QNAME, GlSampler2DImpl.class, GlslSetarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSampler3DImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler3D", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<GlSampler3DImpl> createGlslSetarrayTypeSampler3D(GlSampler3DImpl value) {
        return new JAXBElement<GlSampler3DImpl>(_GlslSetarrayTypeSampler3D_QNAME, GlSampler3DImpl.class, GlslSetarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSamplerCUBEImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerCUBE", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<GlSamplerCUBEImpl> createGlslSetarrayTypeSamplerCUBE(GlSamplerCUBEImpl value) {
        return new JAXBElement<GlSamplerCUBEImpl>(_GlslSetarrayTypeSamplerCUBE_QNAME, GlSamplerCUBEImpl.class, GlslSetarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GlslSetarrayTypeImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "array", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<GlslSetarrayTypeImpl> createGlslSetarrayTypeArray(GlslSetarrayTypeImpl value) {
        return new JAXBElement<GlslSetarrayTypeImpl>(_GlslSetarrayTypeArray_QNAME, GlslSetarrayTypeImpl.class, GlslSetarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSamplerRECTImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerRECT", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<GlSamplerRECTImpl> createGlslSetarrayTypeSamplerRECT(GlSamplerRECTImpl value) {
        return new JAXBElement<GlSamplerRECTImpl>(_GlslSetarrayTypeSamplerRECT_QNAME, GlSamplerRECTImpl.class, GlslSetarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSamplerDEPTHImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerDEPTH", scope = GlslSetarrayTypeImpl.class)
    public JAXBElement<GlSamplerDEPTHImpl> createGlslSetarrayTypeSamplerDEPTH(GlSamplerDEPTHImpl value) {
        return new JAXBElement<GlSamplerDEPTHImpl>(_GlslSetarrayTypeSamplerDEPTH_QNAME, GlSamplerDEPTHImpl.class, GlslSetarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PolygonsImpl.PhImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "ph", scope = PolygonsImpl.class)
    public JAXBElement<PolygonsImpl.PhImpl> createPolygonsPh(PolygonsImpl.PhImpl value) {
        return new JAXBElement<PolygonsImpl.PhImpl>(_PolygonsPh_QNAME, PolygonsImpl.PhImpl.class, PolygonsImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GlslSurfaceTypeImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "surface", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<GlslSurfaceTypeImpl> createGlslNewarrayTypeSurface(GlslSurfaceTypeImpl value) {
        return new JAXBElement<GlslSurfaceTypeImpl>(_GlslSetarrayTypeSurface_QNAME, GlslSurfaceTypeImpl.class, GlslNewarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSampler1DImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler1D", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<GlSampler1DImpl> createGlslNewarrayTypeSampler1D(GlSampler1DImpl value) {
        return new JAXBElement<GlSampler1DImpl>(_GlslSetarrayTypeSampler1D_QNAME, GlSampler1DImpl.class, GlslNewarrayTypeImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSampler2DImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler2D", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<GlSampler2DImpl> createGlslNewarrayTypeSampler2D(GlSampler2DImpl value) {
        return new JAXBElement<GlSampler2DImpl>(_GlslSetarrayTypeSampler2D_QNAME, GlSampler2DImpl.class, GlslNewarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSampler3DImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler3D", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<GlSampler3DImpl> createGlslNewarrayTypeSampler3D(GlSampler3DImpl value) {
        return new JAXBElement<GlSampler3DImpl>(_GlslSetarrayTypeSampler3D_QNAME, GlSampler3DImpl.class, GlslNewarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSamplerCUBEImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerCUBE", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<GlSamplerCUBEImpl> createGlslNewarrayTypeSamplerCUBE(GlSamplerCUBEImpl value) {
        return new JAXBElement<GlSamplerCUBEImpl>(_GlslSetarrayTypeSamplerCUBE_QNAME, GlSamplerCUBEImpl.class, GlslNewarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GlslNewarrayTypeImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "array", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<GlslNewarrayTypeImpl> createGlslNewarrayTypeArray(GlslNewarrayTypeImpl value) {
        return new JAXBElement<GlslNewarrayTypeImpl>(_GlslSetarrayTypeArray_QNAME, GlslNewarrayTypeImpl.class, GlslNewarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSamplerRECTImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerRECT", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<GlSamplerRECTImpl> createGlslNewarrayTypeSamplerRECT(GlSamplerRECTImpl value) {
        return new JAXBElement<GlSamplerRECTImpl>(_GlslSetarrayTypeSamplerRECT_QNAME, GlSamplerRECTImpl.class, GlslNewarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GlSamplerDEPTHImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerDEPTH", scope = GlslNewarrayTypeImpl.class)
    public JAXBElement<GlSamplerDEPTHImpl> createGlslNewarrayTypeSamplerDEPTH(GlSamplerDEPTHImpl value) {
        return new JAXBElement<GlSamplerDEPTHImpl>(_GlslSetarrayTypeSamplerDEPTH_QNAME, GlSamplerDEPTHImpl.class, GlslNewarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSetuserTypeImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "usertype", scope = CgSetuserTypeImpl.class)
    public JAXBElement<CgSetuserTypeImpl> createCgSetuserTypeUsertype(CgSetuserTypeImpl value) {
        return new JAXBElement<CgSetuserTypeImpl>(_CgSetuserTypeUsertype_QNAME, CgSetuserTypeImpl.class, CgSetuserTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgConnectParamImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "connect_param", scope = CgSetuserTypeImpl.class)
    public JAXBElement<CgConnectParamImpl> createCgSetuserTypeConnectParam(CgConnectParamImpl value) {
        return new JAXBElement<CgConnectParamImpl>(_CgSetuserTypeConnectParam_QNAME, CgConnectParamImpl.class, CgSetuserTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSamplerRECTImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerRECT", scope = CgSetuserTypeImpl.class)
    public JAXBElement<CgSamplerRECTImpl> createCgSetuserTypeSamplerRECT(CgSamplerRECTImpl value) {
        return new JAXBElement<CgSamplerRECTImpl>(_GlslSetarrayTypeSamplerRECT_QNAME, CgSamplerRECTImpl.class, CgSetuserTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSetarrayTypeImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "array", scope = CgSetuserTypeImpl.class)
    public JAXBElement<CgSetarrayTypeImpl> createCgSetuserTypeArray(CgSetarrayTypeImpl value) {
        return new JAXBElement<CgSetarrayTypeImpl>(_GlslSetarrayTypeArray_QNAME, CgSetarrayTypeImpl.class, CgSetuserTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSurfaceTypeImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "surface", scope = CgSetuserTypeImpl.class)
    public JAXBElement<CgSurfaceTypeImpl> createCgSetuserTypeSurface(CgSurfaceTypeImpl value) {
        return new JAXBElement<CgSurfaceTypeImpl>(_GlslSetarrayTypeSurface_QNAME, CgSurfaceTypeImpl.class, CgSetuserTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSampler3DImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler3D", scope = CgSetuserTypeImpl.class)
    public JAXBElement<CgSampler3DImpl> createCgSetuserTypeSampler3D(CgSampler3DImpl value) {
        return new JAXBElement<CgSampler3DImpl>(_GlslSetarrayTypeSampler3D_QNAME, CgSampler3DImpl.class, CgSetuserTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSamplerCUBEImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerCUBE", scope = CgSetuserTypeImpl.class)
    public JAXBElement<CgSamplerCUBEImpl> createCgSetuserTypeSamplerCUBE(CgSamplerCUBEImpl value) {
        return new JAXBElement<CgSamplerCUBEImpl>(_GlslSetarrayTypeSamplerCUBE_QNAME, CgSamplerCUBEImpl.class, CgSetuserTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSampler2DImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler2D", scope = CgSetuserTypeImpl.class)
    public JAXBElement<CgSampler2DImpl> createCgSetuserTypeSampler2D(CgSampler2DImpl value) {
        return new JAXBElement<CgSampler2DImpl>(_GlslSetarrayTypeSampler2D_QNAME, CgSampler2DImpl.class, CgSetuserTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSampler1DImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler1D", scope = CgSetuserTypeImpl.class)
    public JAXBElement<CgSampler1DImpl> createCgSetuserTypeSampler1D(CgSampler1DImpl value) {
        return new JAXBElement<CgSampler1DImpl>(_GlslSetarrayTypeSampler1D_QNAME, CgSampler1DImpl.class, CgSetuserTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSamplerDEPTHImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerDEPTH", scope = CgSetuserTypeImpl.class)
    public JAXBElement<CgSamplerDEPTHImpl> createCgSetuserTypeSamplerDEPTH(CgSamplerDEPTHImpl value) {
        return new JAXBElement<CgSamplerDEPTHImpl>(_GlslSetarrayTypeSamplerDEPTH_QNAME, CgSamplerDEPTHImpl.class, CgSetuserTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSetuserTypeImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "usertype", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<CgSetuserTypeImpl> createCgSetarrayTypeUsertype(CgSetuserTypeImpl value) {
        return new JAXBElement<CgSetuserTypeImpl>(_CgSetuserTypeUsertype_QNAME, CgSetuserTypeImpl.class, CgSetarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSamplerRECTImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerRECT", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<CgSamplerRECTImpl> createCgSetarrayTypeSamplerRECT(CgSamplerRECTImpl value) {
        return new JAXBElement<CgSamplerRECTImpl>(_GlslSetarrayTypeSamplerRECT_QNAME, CgSamplerRECTImpl.class, CgSetarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSetarrayTypeImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "array", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<CgSetarrayTypeImpl> createCgSetarrayTypeArray(CgSetarrayTypeImpl value) {
        return new JAXBElement<CgSetarrayTypeImpl>(_GlslSetarrayTypeArray_QNAME, CgSetarrayTypeImpl.class, CgSetarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSurfaceTypeImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "surface", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<CgSurfaceTypeImpl> createCgSetarrayTypeSurface(CgSurfaceTypeImpl value) {
        return new JAXBElement<CgSurfaceTypeImpl>(_GlslSetarrayTypeSurface_QNAME, CgSurfaceTypeImpl.class, CgSetarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSampler3DImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler3D", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<CgSampler3DImpl> createCgSetarrayTypeSampler3D(CgSampler3DImpl value) {
        return new JAXBElement<CgSampler3DImpl>(_GlslSetarrayTypeSampler3D_QNAME, CgSampler3DImpl.class, CgSetarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSamplerCUBEImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerCUBE", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<CgSamplerCUBEImpl> createCgSetarrayTypeSamplerCUBE(CgSamplerCUBEImpl value) {
        return new JAXBElement<CgSamplerCUBEImpl>(_GlslSetarrayTypeSamplerCUBE_QNAME, CgSamplerCUBEImpl.class, CgSetarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSampler2DImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler2D", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<CgSampler2DImpl> createCgSetarrayTypeSampler2D(CgSampler2DImpl value) {
        return new JAXBElement<CgSampler2DImpl>(_GlslSetarrayTypeSampler2D_QNAME, CgSampler2DImpl.class, CgSetarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSampler1DImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler1D", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<CgSampler1DImpl> createCgSetarrayTypeSampler1D(CgSampler1DImpl value) {
        return new JAXBElement<CgSampler1DImpl>(_GlslSetarrayTypeSampler1D_QNAME, CgSampler1DImpl.class, CgSetarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSamplerDEPTHImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerDEPTH", scope = CgSetarrayTypeImpl.class)
    public JAXBElement<CgSamplerDEPTHImpl> createCgSetarrayTypeSamplerDEPTH(CgSamplerDEPTHImpl value) {
        return new JAXBElement<CgSamplerDEPTHImpl>(_GlslSetarrayTypeSamplerDEPTH_QNAME, CgSamplerDEPTHImpl.class, CgSetarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSetuserTypeImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "usertype", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<CgSetuserTypeImpl> createCgNewarrayTypeUsertype(CgSetuserTypeImpl value) {
        return new JAXBElement<CgSetuserTypeImpl>(_CgSetuserTypeUsertype_QNAME, CgSetuserTypeImpl.class, CgNewarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgConnectParamImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "connect_param", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<CgConnectParamImpl> createCgNewarrayTypeConnectParam(CgConnectParamImpl value) {
        return new JAXBElement<CgConnectParamImpl>(_CgSetuserTypeConnectParam_QNAME, CgConnectParamImpl.class, CgNewarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSamplerRECTImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerRECT", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<CgSamplerRECTImpl> createCgNewarrayTypeSamplerRECT(CgSamplerRECTImpl value) {
        return new JAXBElement<CgSamplerRECTImpl>(_GlslSetarrayTypeSamplerRECT_QNAME, CgSamplerRECTImpl.class, CgNewarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgNewarrayTypeImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "array", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<CgNewarrayTypeImpl> createCgNewarrayTypeArray(CgNewarrayTypeImpl value) {
        return new JAXBElement<CgNewarrayTypeImpl>(_GlslSetarrayTypeArray_QNAME, CgNewarrayTypeImpl.class, CgNewarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSurfaceTypeImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "surface", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<CgSurfaceTypeImpl> createCgNewarrayTypeSurface(CgSurfaceTypeImpl value) {
        return new JAXBElement<CgSurfaceTypeImpl>(_GlslSetarrayTypeSurface_QNAME, CgSurfaceTypeImpl.class, CgNewarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSampler3DImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler3D", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<CgSampler3DImpl> createCgNewarrayTypeSampler3D(CgSampler3DImpl value) {
        return new JAXBElement<CgSampler3DImpl>(_GlslSetarrayTypeSampler3D_QNAME, CgSampler3DImpl.class, CgNewarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSamplerCUBEImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerCUBE", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<CgSamplerCUBEImpl> createCgNewarrayTypeSamplerCUBE(CgSamplerCUBEImpl value) {
        return new JAXBElement<CgSamplerCUBEImpl>(_GlslSetarrayTypeSamplerCUBE_QNAME, CgSamplerCUBEImpl.class, CgNewarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSampler2DImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler2D", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<CgSampler2DImpl> createCgNewarrayTypeSampler2D(CgSampler2DImpl value) {
        return new JAXBElement<CgSampler2DImpl>(_GlslSetarrayTypeSampler2D_QNAME, CgSampler2DImpl.class, CgNewarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSampler1DImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "sampler1D", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<CgSampler1DImpl> createCgNewarrayTypeSampler1D(CgSampler1DImpl value) {
        return new JAXBElement<CgSampler1DImpl>(_GlslSetarrayTypeSampler1D_QNAME, CgSampler1DImpl.class, CgNewarrayTypeImpl.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CgSamplerDEPTHImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.collada.org/2005/11/COLLADASchema", name = "samplerDEPTH", scope = CgNewarrayTypeImpl.class)
    public JAXBElement<CgSamplerDEPTHImpl> createCgNewarrayTypeSamplerDEPTH(CgSamplerDEPTHImpl value) {
        return new JAXBElement<CgSamplerDEPTHImpl>(_GlslSetarrayTypeSamplerDEPTH_QNAME, CgSamplerDEPTHImpl.class, CgNewarrayTypeImpl.class, value);
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
