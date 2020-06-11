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
import javax.xml.bind.annotation.XmlType;
import org.collada._2005._11.colladaschema.CommonTransparentType;
import org.collada._2005._11.colladaschema.FxOpaqueEnum;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "common_transparent_type")
public class CommonTransparentTypeImpl
    extends CommonColorOrTextureTypeImpl
    implements CommonTransparentType
{

    @XmlAttribute(name = "opaque")
    protected FxOpaqueEnum opaque;

    public FxOpaqueEnum getOpaque() {
        if (opaque == null) {
            return FxOpaqueEnum.A_ONE;
        } else {
            return opaque;
        }
    }

    public void setOpaque(FxOpaqueEnum value) {
        this.opaque = value;
    }

}
