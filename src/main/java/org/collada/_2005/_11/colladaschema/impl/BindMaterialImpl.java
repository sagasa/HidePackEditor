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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.collada._2005._11.colladaschema.BindMaterial;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.InstanceMaterial;
import org.collada._2005._11.colladaschema.Param;
import org.collada._2005._11.colladaschema.Technique;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "params",
    "techniqueCommon",
    "techniques",
    "extras"
})
@XmlRootElement(name = "bind_material")
public class BindMaterialImpl
    implements BindMaterial
{

    @XmlElement(name = "param", type = ParamImpl.class)
    protected List<Param> params;
    @XmlElement(name = "technique_common", required = true, type = BindMaterialImpl.TechniqueCommonImpl.class)
    protected BindMaterialImpl.TechniqueCommonImpl techniqueCommon;
    @XmlElement(name = "technique", type = TechniqueImpl.class)
    protected List<Technique> techniques;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;

    public List<Param> getParams() {
        if (params == null) {
            params = new ArrayList<Param>();
        }
        return this.params;
    }

    public BindMaterial.TechniqueCommon getTechniqueCommon() {
        return techniqueCommon;
    }

    public void setTechniqueCommon(BindMaterial.TechniqueCommon value) {
        this.techniqueCommon = ((BindMaterialImpl.TechniqueCommonImpl) value);
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

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "instanceMaterials"
    })
    public static class TechniqueCommonImpl
        implements BindMaterial.TechniqueCommon
    {

        @XmlElement(name = "instance_material", required = true, type = InstanceMaterialImpl.class)
        protected List<InstanceMaterial> instanceMaterials;

        public List<InstanceMaterial> getInstanceMaterials() {
            if (instanceMaterials == null) {
                instanceMaterials = new ArrayList<InstanceMaterial>();
            }
            return this.instanceMaterials;
        }

    }

}
