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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.InstancePhysicsModel;
import org.collada._2005._11.colladaschema.InstanceRigidBody;
import org.collada._2005._11.colladaschema.InstanceRigidConstraint;
import org.collada._2005._11.colladaschema.InstanceWithExtra;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "instanceForceFields",
    "instanceRigidBodies",
    "instanceRigidConstraints",
    "extras"
})
@XmlRootElement(name = "instance_physics_model")
public class InstancePhysicsModelImpl
    implements InstancePhysicsModel
{

    @XmlElement(name = "instance_force_field", type = InstanceWithExtraImpl.class)
    protected List<InstanceWithExtra> instanceForceFields;
    @XmlElement(name = "instance_rigid_body", type = InstanceRigidBodyImpl.class)
    protected List<InstanceRigidBody> instanceRigidBodies;
    @XmlElement(name = "instance_rigid_constraint", type = InstanceRigidConstraintImpl.class)
    protected List<InstanceRigidConstraint> instanceRigidConstraints;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;
    @XmlAttribute(name = "url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlAttribute(name = "sid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sid;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "parent")
    @XmlSchemaType(name = "anyURI")
    protected String parent;

    public List<InstanceWithExtra> getInstanceForceFields() {
        if (instanceForceFields == null) {
            instanceForceFields = new ArrayList<InstanceWithExtra>();
        }
        return this.instanceForceFields;
    }

    public List<InstanceRigidBody> getInstanceRigidBodies() {
        if (instanceRigidBodies == null) {
            instanceRigidBodies = new ArrayList<InstanceRigidBody>();
        }
        return this.instanceRigidBodies;
    }

    public List<InstanceRigidConstraint> getInstanceRigidConstraints() {
        if (instanceRigidConstraints == null) {
            instanceRigidConstraints = new ArrayList<InstanceRigidConstraint>();
        }
        return this.instanceRigidConstraints;
    }

    public List<Extra> getExtras() {
        if (extras == null) {
            extras = new ArrayList<Extra>();
        }
        return this.extras;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
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

    public String getParent() {
        return parent;
    }

    public void setParent(String value) {
        this.parent = value;
    }

}
