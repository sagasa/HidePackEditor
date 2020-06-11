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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.Asset;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.InstancePhysicsModel;
import org.collada._2005._11.colladaschema.InstanceWithExtra;
import org.collada._2005._11.colladaschema.PhysicsScene;
import org.collada._2005._11.colladaschema.TargetableFloat;
import org.collada._2005._11.colladaschema.TargetableFloat3;
import org.collada._2005._11.colladaschema.Technique;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asset",
    "instanceForceFields",
    "instancePhysicsModels",
    "techniqueCommon",
    "techniques",
    "extras"
})
@XmlRootElement(name = "physics_scene")
public class PhysicsSceneImpl
    implements PhysicsScene
{

    @XmlElement(type = AssetImpl.class)
    protected AssetImpl asset;
    @XmlElement(name = "instance_force_field", type = InstanceWithExtraImpl.class)
    protected List<InstanceWithExtra> instanceForceFields;
    @XmlElement(name = "instance_physics_model", type = InstancePhysicsModelImpl.class)
    protected List<InstancePhysicsModel> instancePhysicsModels;
    @XmlElement(name = "technique_common", required = true, type = PhysicsSceneImpl.TechniqueCommonImpl.class)
    protected PhysicsSceneImpl.TechniqueCommonImpl techniqueCommon;
    @XmlElement(name = "technique", type = TechniqueImpl.class)
    protected List<Technique> techniques;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset value) {
        this.asset = ((AssetImpl) value);
    }

    public List<InstanceWithExtra> getInstanceForceFields() {
        if (instanceForceFields == null) {
            instanceForceFields = new ArrayList<InstanceWithExtra>();
        }
        return this.instanceForceFields;
    }

    public List<InstancePhysicsModel> getInstancePhysicsModels() {
        if (instancePhysicsModels == null) {
            instancePhysicsModels = new ArrayList<InstancePhysicsModel>();
        }
        return this.instancePhysicsModels;
    }

    public PhysicsScene.TechniqueCommon getTechniqueCommon() {
        return techniqueCommon;
    }

    public void setTechniqueCommon(PhysicsScene.TechniqueCommon value) {
        this.techniqueCommon = ((PhysicsSceneImpl.TechniqueCommonImpl) value);
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

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gravity",
        "timeStep"
    })
    public static class TechniqueCommonImpl
        implements PhysicsScene.TechniqueCommon
    {

        @XmlElement(type = TargetableFloat3Impl.class)
        protected TargetableFloat3Impl gravity;
        @XmlElement(name = "time_step", type = TargetableFloatImpl.class)
        protected TargetableFloatImpl timeStep;

        public TargetableFloat3 getGravity() {
            return gravity;
        }

        public void setGravity(TargetableFloat3 value) {
            this.gravity = ((TargetableFloat3Impl) value);
        }

        public TargetableFloat getTimeStep() {
            return timeStep;
        }

        public void setTimeStep(TargetableFloat value) {
            this.timeStep = ((TargetableFloatImpl) value);
        }

    }

}
