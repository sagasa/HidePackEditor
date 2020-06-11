//
// ���̃t�@�C���́AJavaTM Architecture for XML Binding(JAXB) Reference Implementation�Av2.2.8-b130911.1802�ɂ���Đ�������܂��� 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>���Q�Ƃ��Ă������� 
// �\�[�X�E�X�L�[�}�̍ăR���p�C�����ɂ��̃t�@�C���̕ύX�͎����܂��B 
// ������: 2020.05.28 ���� 12:29:30 PM JST 
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
import org.collada._2005._11.colladaschema.BindMaterial;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.InstanceController;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "skeletons",
    "bindMaterial",
    "extras"
})
@XmlRootElement(name = "instance_controller")
public class InstanceControllerImpl
    implements InstanceController
{

    @XmlElement(name = "skeleton")
    @XmlSchemaType(name = "anyURI")
    protected List<String> skeletons;
    @XmlElement(name = "bind_material", type = BindMaterialImpl.class)
    protected BindMaterialImpl bindMaterial;
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

    public List<String> getSkeletons() {
        if (skeletons == null) {
            skeletons = new ArrayList<String>();
        }
        return this.skeletons;
    }

    public BindMaterial getBindMaterial() {
        return bindMaterial;
    }

    public void setBindMaterial(BindMaterial value) {
        this.bindMaterial = ((BindMaterialImpl) value);
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

}
