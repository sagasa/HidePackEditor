//
// ���̃t�@�C���́AJavaTM Architecture for XML Binding(JAXB) Reference Implementation�Av2.2.8-b130911.1802�ɂ���Đ�������܂��� 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>���Q�Ƃ��Ă������� 
// �\�[�X�E�X�L�[�}�̍ăR���p�C�����ɂ��̃t�@�C���̕ύX�͎����܂��B 
// ������: 2020.05.28 ���� 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.collada._2005._11.colladaschema.GlesTexcombinerCommandAlphaType;
import org.collada._2005._11.colladaschema.GlesTexcombinerCommandRGBType;
import org.collada._2005._11.colladaschema.GlesTexcombinerCommandType;
import org.collada._2005._11.colladaschema.GlesTextureConstantType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gles_texcombiner_command_type", propOrder = {
    "constant",
    "rgb",
    "alpha"
})
public class GlesTexcombinerCommandTypeImpl implements GlesTexcombinerCommandType
{

    @XmlElement(type = GlesTextureConstantTypeImpl.class)
    protected GlesTextureConstantTypeImpl constant;
    @XmlElement(name = "RGB", type = GlesTexcombinerCommandRGBTypeImpl.class)
    protected GlesTexcombinerCommandRGBTypeImpl rgb;
    @XmlElement(type = GlesTexcombinerCommandAlphaTypeImpl.class)
    protected GlesTexcombinerCommandAlphaTypeImpl alpha;

    public GlesTextureConstantType getConstant() {
        return constant;
    }

    public void setConstant(GlesTextureConstantType value) {
        this.constant = ((GlesTextureConstantTypeImpl) value);
    }

    public GlesTexcombinerCommandRGBType getRGB() {
        return rgb;
    }

    public void setRGB(GlesTexcombinerCommandRGBType value) {
        this.rgb = ((GlesTexcombinerCommandRGBTypeImpl) value);
    }

    public GlesTexcombinerCommandAlphaType getAlpha() {
        return alpha;
    }

    public void setAlpha(GlesTexcombinerCommandAlphaType value) {
        this.alpha = ((GlesTexcombinerCommandAlphaTypeImpl) value);
    }

}
