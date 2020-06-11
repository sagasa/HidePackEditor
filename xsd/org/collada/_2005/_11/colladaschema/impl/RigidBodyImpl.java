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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.Box;
import org.collada._2005._11.colladaschema.Capsule;
import org.collada._2005._11.colladaschema.Cylinder;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.InstanceGeometry;
import org.collada._2005._11.colladaschema.InstanceWithExtra;
import org.collada._2005._11.colladaschema.PhysicsMaterial;
import org.collada._2005._11.colladaschema.Plane;
import org.collada._2005._11.colladaschema.RigidBody;
import org.collada._2005._11.colladaschema.Sphere;
import org.collada._2005._11.colladaschema.TaperedCapsule;
import org.collada._2005._11.colladaschema.TaperedCylinder;
import org.collada._2005._11.colladaschema.TargetableFloat;
import org.collada._2005._11.colladaschema.TargetableFloat3;
import org.collada._2005._11.colladaschema.Technique;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "techniqueCommon",
    "techniques",
    "extras"
})
@XmlRootElement(name = "rigid_body")
public class RigidBodyImpl
    implements RigidBody
{

    @XmlElement(name = "technique_common", required = true, type = RigidBodyImpl.TechniqueCommonImpl.class)
    protected RigidBodyImpl.TechniqueCommonImpl techniqueCommon;
    @XmlElement(name = "technique", type = TechniqueImpl.class)
    protected List<Technique> techniques;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;
    @XmlAttribute(name = "sid", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sid;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;

    public RigidBody.TechniqueCommon getTechniqueCommon() {
        return techniqueCommon;
    }

    public void setTechniqueCommon(RigidBody.TechniqueCommon value) {
        this.techniqueCommon = ((RigidBodyImpl.TechniqueCommonImpl) value);
    }

    public List<Technique> getTechniques() {
        if (techniques == null) {
            techniques = new ArrayList<Technique>();
        }
        return this.techniques;
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

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dynamic",
        "mass",
        "massFrame",
        "inertia",
        "physicsMaterial",
        "instancePhysicsMaterial",
        "shapes"
    })
    public static class TechniqueCommonImpl
        implements RigidBody.TechniqueCommon
    {

        @XmlElement(type = RigidBodyImpl.TechniqueCommonImpl.DynamicImpl.class)
        protected RigidBodyImpl.TechniqueCommonImpl.DynamicImpl dynamic;
        @XmlElement(type = TargetableFloatImpl.class)
        protected TargetableFloatImpl mass;
        @XmlElement(name = "mass_frame", type = RigidBodyImpl.TechniqueCommonImpl.MassFrameImpl.class)
        protected RigidBodyImpl.TechniqueCommonImpl.MassFrameImpl massFrame;
        @XmlElement(type = TargetableFloat3Impl.class)
        protected TargetableFloat3Impl inertia;
        @XmlElement(name = "physics_material", type = PhysicsMaterialImpl.class)
        protected PhysicsMaterialImpl physicsMaterial;
        @XmlElement(name = "instance_physics_material", type = InstanceWithExtraImpl.class)
        protected InstanceWithExtraImpl instancePhysicsMaterial;
        @XmlElement(name = "shape", required = true, type = RigidBodyImpl.TechniqueCommonImpl.ShapeImpl.class)
        protected List<RigidBody.TechniqueCommon.Shape> shapes;

        public RigidBody.TechniqueCommon.Dynamic getDynamic() {
            return dynamic;
        }

        public void setDynamic(RigidBody.TechniqueCommon.Dynamic value) {
            this.dynamic = ((RigidBodyImpl.TechniqueCommonImpl.DynamicImpl) value);
        }

        public TargetableFloat getMass() {
            return mass;
        }

        public void setMass(TargetableFloat value) {
            this.mass = ((TargetableFloatImpl) value);
        }

        public RigidBody.TechniqueCommon.MassFrame getMassFrame() {
            return massFrame;
        }

        public void setMassFrame(RigidBody.TechniqueCommon.MassFrame value) {
            this.massFrame = ((RigidBodyImpl.TechniqueCommonImpl.MassFrameImpl) value);
        }

        public TargetableFloat3 getInertia() {
            return inertia;
        }

        public void setInertia(TargetableFloat3 value) {
            this.inertia = ((TargetableFloat3Impl) value);
        }

        public PhysicsMaterial getPhysicsMaterial() {
            return physicsMaterial;
        }

        public void setPhysicsMaterial(PhysicsMaterial value) {
            this.physicsMaterial = ((PhysicsMaterialImpl) value);
        }

        public InstanceWithExtra getInstancePhysicsMaterial() {
            return instancePhysicsMaterial;
        }

        public void setInstancePhysicsMaterial(InstanceWithExtra value) {
            this.instancePhysicsMaterial = ((InstanceWithExtraImpl) value);
        }

        public List<RigidBody.TechniqueCommon.Shape> getShapes() {
            if (shapes == null) {
                shapes = new ArrayList<RigidBody.TechniqueCommon.Shape>();
            }
            return this.shapes;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class DynamicImpl
            implements RigidBody.TechniqueCommon.Dynamic
        {

            @XmlValue
            protected boolean value;
            @XmlAttribute(name = "sid")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String sid;

            public boolean isValue() {
                return value;
            }

            public void setValue(boolean value) {
                this.value = value;
            }

            public String getSid() {
                return sid;
            }

            public void setSid(String value) {
                this.sid = value;
            }

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "translatesAndRotates"
        })
        public static class MassFrameImpl
            implements RigidBody.TechniqueCommon.MassFrame
        {

            @XmlElements({
                @XmlElement(name = "translate", type = TargetableFloat3Impl.class),
                @XmlElement(name = "rotate", type = RotateImpl.class)
            })
            protected List<Object> translatesAndRotates;

            public List<Object> getTranslatesAndRotates() {
                if (translatesAndRotates == null) {
                    translatesAndRotates = new ArrayList<Object>();
                }
                return this.translatesAndRotates;
            }

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "hollow",
            "mass",
            "density",
            "physicsMaterial",
            "instancePhysicsMaterial",
            "taperedCapsule",
            "capsule",
            "taperedCylinder",
            "cylinder",
            "sphere",
            "box",
            "plane",
            "instanceGeometry",
            "translatesAndRotates",
            "extras"
        })
        public static class ShapeImpl
            implements RigidBody.TechniqueCommon.Shape
        {

            @XmlElement(type = RigidBodyImpl.TechniqueCommonImpl.ShapeImpl.HollowImpl.class)
            protected RigidBodyImpl.TechniqueCommonImpl.ShapeImpl.HollowImpl hollow;
            @XmlElement(type = TargetableFloatImpl.class)
            protected TargetableFloatImpl mass;
            @XmlElement(type = TargetableFloatImpl.class)
            protected TargetableFloatImpl density;
            @XmlElement(name = "physics_material", type = PhysicsMaterialImpl.class)
            protected PhysicsMaterialImpl physicsMaterial;
            @XmlElement(name = "instance_physics_material", type = InstanceWithExtraImpl.class)
            protected InstanceWithExtraImpl instancePhysicsMaterial;
            @XmlElement(name = "tapered_capsule", type = TaperedCapsuleImpl.class)
            protected TaperedCapsuleImpl taperedCapsule;
            @XmlElement(type = CapsuleImpl.class)
            protected CapsuleImpl capsule;
            @XmlElement(name = "tapered_cylinder", type = TaperedCylinderImpl.class)
            protected TaperedCylinderImpl taperedCylinder;
            @XmlElement(type = CylinderImpl.class)
            protected CylinderImpl cylinder;
            @XmlElement(type = SphereImpl.class)
            protected SphereImpl sphere;
            @XmlElement(type = BoxImpl.class)
            protected BoxImpl box;
            @XmlElement(type = PlaneImpl.class)
            protected PlaneImpl plane;
            @XmlElement(name = "instance_geometry", type = InstanceGeometryImpl.class)
            protected InstanceGeometryImpl instanceGeometry;
            @XmlElements({
                @XmlElement(name = "translate", type = TargetableFloat3Impl.class),
                @XmlElement(name = "rotate", type = RotateImpl.class)
            })
            protected List<Object> translatesAndRotates;
            @XmlElement(name = "extra", type = ExtraImpl.class)
            protected List<Extra> extras;

            public RigidBody.TechniqueCommon.Shape.Hollow getHollow() {
                return hollow;
            }

            public void setHollow(RigidBody.TechniqueCommon.Shape.Hollow value) {
                this.hollow = ((RigidBodyImpl.TechniqueCommonImpl.ShapeImpl.HollowImpl) value);
            }

            public TargetableFloat getMass() {
                return mass;
            }

            public void setMass(TargetableFloat value) {
                this.mass = ((TargetableFloatImpl) value);
            }

            public TargetableFloat getDensity() {
                return density;
            }

            public void setDensity(TargetableFloat value) {
                this.density = ((TargetableFloatImpl) value);
            }

            public PhysicsMaterial getPhysicsMaterial() {
                return physicsMaterial;
            }

            public void setPhysicsMaterial(PhysicsMaterial value) {
                this.physicsMaterial = ((PhysicsMaterialImpl) value);
            }

            public InstanceWithExtra getInstancePhysicsMaterial() {
                return instancePhysicsMaterial;
            }

            public void setInstancePhysicsMaterial(InstanceWithExtra value) {
                this.instancePhysicsMaterial = ((InstanceWithExtraImpl) value);
            }

            public TaperedCapsule getTaperedCapsule() {
                return taperedCapsule;
            }

            public void setTaperedCapsule(TaperedCapsule value) {
                this.taperedCapsule = ((TaperedCapsuleImpl) value);
            }

            public Capsule getCapsule() {
                return capsule;
            }

            public void setCapsule(Capsule value) {
                this.capsule = ((CapsuleImpl) value);
            }

            public TaperedCylinder getTaperedCylinder() {
                return taperedCylinder;
            }

            public void setTaperedCylinder(TaperedCylinder value) {
                this.taperedCylinder = ((TaperedCylinderImpl) value);
            }

            public Cylinder getCylinder() {
                return cylinder;
            }

            public void setCylinder(Cylinder value) {
                this.cylinder = ((CylinderImpl) value);
            }

            public Sphere getSphere() {
                return sphere;
            }

            public void setSphere(Sphere value) {
                this.sphere = ((SphereImpl) value);
            }

            public Box getBox() {
                return box;
            }

            public void setBox(Box value) {
                this.box = ((BoxImpl) value);
            }

            public Plane getPlane() {
                return plane;
            }

            public void setPlane(Plane value) {
                this.plane = ((PlaneImpl) value);
            }

            public InstanceGeometry getInstanceGeometry() {
                return instanceGeometry;
            }

            public void setInstanceGeometry(InstanceGeometry value) {
                this.instanceGeometry = ((InstanceGeometryImpl) value);
            }

            public List<Object> getTranslatesAndRotates() {
                if (translatesAndRotates == null) {
                    translatesAndRotates = new ArrayList<Object>();
                }
                return this.translatesAndRotates;
            }

            public List<Extra> getExtras() {
                if (extras == null) {
                    extras = new ArrayList<Extra>();
                }
                return this.extras;
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class HollowImpl
                implements RigidBody.TechniqueCommon.Shape.Hollow
            {

                @XmlValue
                protected boolean value;
                @XmlAttribute(name = "sid")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String sid;

                public boolean isValue() {
                    return value;
                }

                public void setValue(boolean value) {
                    this.value = value;
                }

                public String getSid() {
                    return sid;
                }

                public void setSid(String value) {
                    this.sid = value;
                }

            }

        }

    }

}
