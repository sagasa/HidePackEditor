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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.collada._2005._11.colladaschema.FxSurfaceFaceEnum;
import org.collada._2005._11.colladaschema.FxSurfaceInitFromCommon;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fx_surface_init_from_common", propOrder = {
    "value"
})
public class FxSurfaceInitFromCommonImpl
    implements FxSurfaceInitFromCommon
{

    @XmlValue
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object value;
    @XmlAttribute(name = "mip")
    @XmlSchemaType(name = "unsignedInt")
    protected Long mip;
    @XmlAttribute(name = "slice")
    @XmlSchemaType(name = "unsignedInt")
    protected Long slice;
    @XmlAttribute(name = "face")
    protected FxSurfaceFaceEnum face;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public long getMip() {
        if (mip == null) {
            return  0L;
        } else {
            return mip;
        }
    }

    public void setMip(Long value) {
        this.mip = value;
    }

    public long getSlice() {
        if (slice == null) {
            return  0L;
        } else {
            return slice;
        }
    }

    public void setSlice(Long value) {
        this.slice = value;
    }

    public FxSurfaceFaceEnum getFace() {
        if (face == null) {
            return FxSurfaceFaceEnum.POSITIVE_X;
        } else {
            return face;
        }
    }

    public void setFace(FxSurfaceFaceEnum value) {
        this.face = value;
    }

}
