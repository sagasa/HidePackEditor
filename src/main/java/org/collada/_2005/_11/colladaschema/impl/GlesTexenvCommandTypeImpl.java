//
// ���̃t�@�C���́AJavaTM Architecture for XML Binding(JAXB) Reference Implementation�Av2.2.8-b130911.1802�ɂ���Đ�������܂��� 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>���Q�Ƃ��Ă������� 
// �\�[�X�E�X�L�[�}�̍ăR���p�C�����ɂ��̃t�@�C���̕ύX�͎����܂��B 
// ������: 2020.05.28 ���� 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.GlesTexenvCommandType;
import org.collada._2005._11.colladaschema.GlesTexenvModeEnums;
import org.collada._2005._11.colladaschema.GlesTextureConstantType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gles_texenv_command_type", propOrder = {
    "constant"
})
public class GlesTexenvCommandTypeImpl implements GlesTexenvCommandType
{

    @XmlElement(type = GlesTextureConstantTypeImpl.class)
    protected GlesTextureConstantTypeImpl constant;
    @XmlAttribute(name = "operator")
    protected GlesTexenvModeEnums operator;
    @XmlAttribute(name = "unit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String unit;

    public GlesTextureConstantType getConstant() {
        return constant;
    }

    public void setConstant(GlesTextureConstantType value) {
        this.constant = ((GlesTextureConstantTypeImpl) value);
    }

    public GlesTexenvModeEnums getOperator() {
        return operator;
    }

    public void setOperator(GlesTexenvModeEnums value) {
        this.operator = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String value) {
        this.unit = value;
    }

}
