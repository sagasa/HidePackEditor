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
import org.collada._2005._11.colladaschema.PhysicsMaterial;
import org.collada._2005._11.colladaschema.TargetableFloat;
import org.collada._2005._11.colladaschema.Technique;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asset",
    "techniqueCommon",
    "techniques",
    "extras"
})
@XmlRootElement(name = "physics_material")
public class PhysicsMaterialImpl
    implements PhysicsMaterial
{

    @XmlElement(type = AssetImpl.class)
    protected AssetImpl asset;
    @XmlElement(name = "technique_common", required = true, type = PhysicsMaterialImpl.TechniqueCommonImpl.class)
    protected PhysicsMaterialImpl.TechniqueCommonImpl techniqueCommon;
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

    public PhysicsMaterial.TechniqueCommon getTechniqueCommon() {
        return techniqueCommon;
    }

    public void setTechniqueCommon(PhysicsMaterial.TechniqueCommon value) {
        this.techniqueCommon = ((PhysicsMaterialImpl.TechniqueCommonImpl) value);
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
        "dynamicFriction",
        "restitution",
        "staticFriction"
    })
    public static class TechniqueCommonImpl
        implements PhysicsMaterial.TechniqueCommon
    {

        @XmlElement(name = "dynamic_friction", type = TargetableFloatImpl.class)
        protected TargetableFloatImpl dynamicFriction;
        @XmlElement(type = TargetableFloatImpl.class)
        protected TargetableFloatImpl restitution;
        @XmlElement(name = "static_friction", type = TargetableFloatImpl.class)
        protected TargetableFloatImpl staticFriction;

        public TargetableFloat getDynamicFriction() {
            return dynamicFriction;
        }

        public void setDynamicFriction(TargetableFloat value) {
            this.dynamicFriction = ((TargetableFloatImpl) value);
        }

        public TargetableFloat getRestitution() {
            return restitution;
        }

        public void setRestitution(TargetableFloat value) {
            this.restitution = ((TargetableFloatImpl) value);
        }

        public TargetableFloat getStaticFriction() {
            return staticFriction;
        }

        public void setStaticFriction(TargetableFloat value) {
            this.staticFriction = ((TargetableFloatImpl) value);
        }

    }

}
