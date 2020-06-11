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
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.RigidConstraint;
import org.collada._2005._11.colladaschema.TargetableFloat;
import org.collada._2005._11.colladaschema.TargetableFloat3;
import org.collada._2005._11.colladaschema.Technique;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refAttachment",
    "attachment",
    "techniqueCommon",
    "techniques",
    "extras"
})
@XmlRootElement(name = "rigid_constraint")
public class RigidConstraintImpl
    implements RigidConstraint
{

    @XmlElement(name = "ref_attachment", required = true, type = RigidConstraintImpl.RefAttachmentImpl.class)
    protected RigidConstraintImpl.RefAttachmentImpl refAttachment;
    @XmlElement(required = true, type = RigidConstraintImpl.AttachmentImpl.class)
    protected RigidConstraintImpl.AttachmentImpl attachment;
    @XmlElement(name = "technique_common", required = true, type = RigidConstraintImpl.TechniqueCommonImpl.class)
    protected RigidConstraintImpl.TechniqueCommonImpl techniqueCommon;
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

    public RigidConstraint.RefAttachment getRefAttachment() {
        return refAttachment;
    }

    public void setRefAttachment(RigidConstraint.RefAttachment value) {
        this.refAttachment = ((RigidConstraintImpl.RefAttachmentImpl) value);
    }

    public RigidConstraint.Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(RigidConstraint.Attachment value) {
        this.attachment = ((RigidConstraintImpl.AttachmentImpl) value);
    }

    public RigidConstraint.TechniqueCommon getTechniqueCommon() {
        return techniqueCommon;
    }

    public void setTechniqueCommon(RigidConstraint.TechniqueCommon value) {
        this.techniqueCommon = ((RigidConstraintImpl.TechniqueCommonImpl) value);
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
        "translatesAndRotatesAndExtras"
    })
    public static class AttachmentImpl
        implements RigidConstraint.Attachment
    {

        @XmlElements({
            @XmlElement(name = "translate", type = TargetableFloat3Impl.class),
            @XmlElement(name = "rotate", type = RotateImpl.class),
            @XmlElement(name = "extra", type = ExtraImpl.class)
        })
        protected List<Object> translatesAndRotatesAndExtras;
        @XmlAttribute(name = "rigid_body")
        @XmlSchemaType(name = "anyURI")
        protected String rigidBody;

        public List<Object> getTranslatesAndRotatesAndExtras() {
            if (translatesAndRotatesAndExtras == null) {
                translatesAndRotatesAndExtras = new ArrayList<Object>();
            }
            return this.translatesAndRotatesAndExtras;
        }

        public String getRigidBody() {
            return rigidBody;
        }

        public void setRigidBody(String value) {
            this.rigidBody = value;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "translatesAndRotatesAndExtras"
    })
    public static class RefAttachmentImpl
        implements RigidConstraint.RefAttachment
    {

        @XmlElements({
            @XmlElement(name = "translate", type = TargetableFloat3Impl.class),
            @XmlElement(name = "rotate", type = RotateImpl.class),
            @XmlElement(name = "extra", type = ExtraImpl.class)
        })
        protected List<Object> translatesAndRotatesAndExtras;
        @XmlAttribute(name = "rigid_body")
        @XmlSchemaType(name = "anyURI")
        protected String rigidBody;

        public List<Object> getTranslatesAndRotatesAndExtras() {
            if (translatesAndRotatesAndExtras == null) {
                translatesAndRotatesAndExtras = new ArrayList<Object>();
            }
            return this.translatesAndRotatesAndExtras;
        }

        public String getRigidBody() {
            return rigidBody;
        }

        public void setRigidBody(String value) {
            this.rigidBody = value;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "enabled",
        "interpenetrate",
        "limits",
        "spring"
    })
    public static class TechniqueCommonImpl
        implements RigidConstraint.TechniqueCommon
    {

        @XmlElement(type = RigidConstraintImpl.TechniqueCommonImpl.EnabledImpl.class, defaultValue = "true")
        protected RigidConstraintImpl.TechniqueCommonImpl.EnabledImpl enabled;
        @XmlElement(type = RigidConstraintImpl.TechniqueCommonImpl.InterpenetrateImpl.class, defaultValue = "false")
        protected RigidConstraintImpl.TechniqueCommonImpl.InterpenetrateImpl interpenetrate;
        @XmlElement(type = RigidConstraintImpl.TechniqueCommonImpl.LimitsImpl.class)
        protected RigidConstraintImpl.TechniqueCommonImpl.LimitsImpl limits;
        @XmlElement(type = RigidConstraintImpl.TechniqueCommonImpl.SpringImpl.class)
        protected RigidConstraintImpl.TechniqueCommonImpl.SpringImpl spring;

        public RigidConstraint.TechniqueCommon.Enabled getEnabled() {
            return enabled;
        }

        public void setEnabled(RigidConstraint.TechniqueCommon.Enabled value) {
            this.enabled = ((RigidConstraintImpl.TechniqueCommonImpl.EnabledImpl) value);
        }

        public RigidConstraint.TechniqueCommon.Interpenetrate getInterpenetrate() {
            return interpenetrate;
        }

        public void setInterpenetrate(RigidConstraint.TechniqueCommon.Interpenetrate value) {
            this.interpenetrate = ((RigidConstraintImpl.TechniqueCommonImpl.InterpenetrateImpl) value);
        }

        public RigidConstraint.TechniqueCommon.Limits getLimits() {
            return limits;
        }

        public void setLimits(RigidConstraint.TechniqueCommon.Limits value) {
            this.limits = ((RigidConstraintImpl.TechniqueCommonImpl.LimitsImpl) value);
        }

        public RigidConstraint.TechniqueCommon.Spring getSpring() {
            return spring;
        }

        public void setSpring(RigidConstraint.TechniqueCommon.Spring value) {
            this.spring = ((RigidConstraintImpl.TechniqueCommonImpl.SpringImpl) value);
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class EnabledImpl
            implements RigidConstraint.TechniqueCommon.Enabled
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
            "value"
        })
        public static class InterpenetrateImpl
            implements RigidConstraint.TechniqueCommon.Interpenetrate
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
            "swingConeAndTwist",
            "linear"
        })
        public static class LimitsImpl
            implements RigidConstraint.TechniqueCommon.Limits
        {

            @XmlElement(name = "swing_cone_and_twist", type = RigidConstraintImpl.TechniqueCommonImpl.LimitsImpl.SwingConeAndTwistImpl.class)
            protected RigidConstraintImpl.TechniqueCommonImpl.LimitsImpl.SwingConeAndTwistImpl swingConeAndTwist;
            @XmlElement(type = RigidConstraintImpl.TechniqueCommonImpl.LimitsImpl.LinearImpl.class)
            protected RigidConstraintImpl.TechniqueCommonImpl.LimitsImpl.LinearImpl linear;

            public RigidConstraint.TechniqueCommon.Limits.SwingConeAndTwist getSwingConeAndTwist() {
                return swingConeAndTwist;
            }

            public void setSwingConeAndTwist(RigidConstraint.TechniqueCommon.Limits.SwingConeAndTwist value) {
                this.swingConeAndTwist = ((RigidConstraintImpl.TechniqueCommonImpl.LimitsImpl.SwingConeAndTwistImpl) value);
            }

            public RigidConstraint.TechniqueCommon.Limits.Linear getLinear() {
                return linear;
            }

            public void setLinear(RigidConstraint.TechniqueCommon.Limits.Linear value) {
                this.linear = ((RigidConstraintImpl.TechniqueCommonImpl.LimitsImpl.LinearImpl) value);
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "min",
                "max"
            })
            public static class LinearImpl
                implements RigidConstraint.TechniqueCommon.Limits.Linear
            {

                @XmlElement(type = TargetableFloat3Impl.class, defaultValue = "0.0 0.0 0.0")
                protected TargetableFloat3Impl min;
                @XmlElement(type = TargetableFloat3Impl.class, defaultValue = "0.0 0.0 0.0")
                protected TargetableFloat3Impl max;

                public TargetableFloat3 getMin() {
                    return min;
                }

                public void setMin(TargetableFloat3 value) {
                    this.min = ((TargetableFloat3Impl) value);
                }

                public TargetableFloat3 getMax() {
                    return max;
                }

                public void setMax(TargetableFloat3 value) {
                    this.max = ((TargetableFloat3Impl) value);
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "min",
                "max"
            })
            public static class SwingConeAndTwistImpl
                implements RigidConstraint.TechniqueCommon.Limits.SwingConeAndTwist
            {

                @XmlElement(type = TargetableFloat3Impl.class, defaultValue = "0.0 0.0 0.0")
                protected TargetableFloat3Impl min;
                @XmlElement(type = TargetableFloat3Impl.class, defaultValue = "0.0 0.0 0.0")
                protected TargetableFloat3Impl max;

                public TargetableFloat3 getMin() {
                    return min;
                }

                public void setMin(TargetableFloat3 value) {
                    this.min = ((TargetableFloat3Impl) value);
                }

                public TargetableFloat3 getMax() {
                    return max;
                }

                public void setMax(TargetableFloat3 value) {
                    this.max = ((TargetableFloat3Impl) value);
                }

            }

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "angular",
            "linear"
        })
        public static class SpringImpl
            implements RigidConstraint.TechniqueCommon.Spring
        {

            @XmlElement(type = RigidConstraintImpl.TechniqueCommonImpl.SpringImpl.AngularImpl.class)
            protected RigidConstraintImpl.TechniqueCommonImpl.SpringImpl.AngularImpl angular;
            @XmlElement(type = RigidConstraintImpl.TechniqueCommonImpl.SpringImpl.LinearImpl.class)
            protected RigidConstraintImpl.TechniqueCommonImpl.SpringImpl.LinearImpl linear;

            public RigidConstraint.TechniqueCommon.Spring.Angular getAngular() {
                return angular;
            }

            public void setAngular(RigidConstraint.TechniqueCommon.Spring.Angular value) {
                this.angular = ((RigidConstraintImpl.TechniqueCommonImpl.SpringImpl.AngularImpl) value);
            }

            public RigidConstraint.TechniqueCommon.Spring.Linear getLinear() {
                return linear;
            }

            public void setLinear(RigidConstraint.TechniqueCommon.Spring.Linear value) {
                this.linear = ((RigidConstraintImpl.TechniqueCommonImpl.SpringImpl.LinearImpl) value);
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "stiffness",
                "damping",
                "targetValue"
            })
            public static class AngularImpl
                implements RigidConstraint.TechniqueCommon.Spring.Angular
            {

                @XmlElement(type = TargetableFloatImpl.class, defaultValue = "1.0")
                protected TargetableFloatImpl stiffness;
                @XmlElement(type = TargetableFloatImpl.class, defaultValue = "0.0")
                protected TargetableFloatImpl damping;
                @XmlElement(name = "target_value", type = TargetableFloatImpl.class, defaultValue = "0.0")
                protected TargetableFloatImpl targetValue;

                public TargetableFloat getStiffness() {
                    return stiffness;
                }

                public void setStiffness(TargetableFloat value) {
                    this.stiffness = ((TargetableFloatImpl) value);
                }

                public TargetableFloat getDamping() {
                    return damping;
                }

                public void setDamping(TargetableFloat value) {
                    this.damping = ((TargetableFloatImpl) value);
                }

                public TargetableFloat getTargetValue() {
                    return targetValue;
                }

                public void setTargetValue(TargetableFloat value) {
                    this.targetValue = ((TargetableFloatImpl) value);
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "stiffness",
                "damping",
                "targetValue"
            })
            public static class LinearImpl
                implements RigidConstraint.TechniqueCommon.Spring.Linear
            {

                @XmlElement(type = TargetableFloatImpl.class, defaultValue = "1.0")
                protected TargetableFloatImpl stiffness;
                @XmlElement(type = TargetableFloatImpl.class, defaultValue = "0.0")
                protected TargetableFloatImpl damping;
                @XmlElement(name = "target_value", type = TargetableFloatImpl.class, defaultValue = "0.0")
                protected TargetableFloatImpl targetValue;

                public TargetableFloat getStiffness() {
                    return stiffness;
                }

                public void setStiffness(TargetableFloat value) {
                    this.stiffness = ((TargetableFloatImpl) value);
                }

                public TargetableFloat getDamping() {
                    return damping;
                }

                public void setDamping(TargetableFloat value) {
                    this.damping = ((TargetableFloatImpl) value);
                }

                public TargetableFloat getTargetValue() {
                    return targetValue;
                }

                public void setTargetValue(TargetableFloat value) {
                    this.targetValue = ((TargetableFloatImpl) value);
                }

            }

        }

    }

}
