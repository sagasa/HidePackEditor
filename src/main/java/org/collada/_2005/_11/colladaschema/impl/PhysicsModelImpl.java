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
import org.collada._2005._11.colladaschema.PhysicsModel;
import org.collada._2005._11.colladaschema.RigidBody;
import org.collada._2005._11.colladaschema.RigidConstraint;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asset",
    "rigidBodies",
    "rigidConstraints",
    "instancePhysicsModels",
    "extras"
})
@XmlRootElement(name = "physics_model")
public class PhysicsModelImpl
    implements PhysicsModel
{

    @XmlElement(type = AssetImpl.class)
    protected AssetImpl asset;
    @XmlElement(name = "rigid_body", type = RigidBodyImpl.class)
    protected List<RigidBody> rigidBodies;
    @XmlElement(name = "rigid_constraint", type = RigidConstraintImpl.class)
    protected List<RigidConstraint> rigidConstraints;
    @XmlElement(name = "instance_physics_model", type = InstancePhysicsModelImpl.class)
    protected List<InstancePhysicsModel> instancePhysicsModels;
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

    public List<RigidBody> getRigidBodies() {
        if (rigidBodies == null) {
            rigidBodies = new ArrayList<RigidBody>();
        }
        return this.rigidBodies;
    }

    public List<RigidConstraint> getRigidConstraints() {
        if (rigidConstraints == null) {
            rigidConstraints = new ArrayList<RigidConstraint>();
        }
        return this.rigidConstraints;
    }

    public List<InstancePhysicsModel> getInstancePhysicsModels() {
        if (instancePhysicsModels == null) {
            instancePhysicsModels = new ArrayList<InstancePhysicsModel>();
        }
        return this.instancePhysicsModels;
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

}
