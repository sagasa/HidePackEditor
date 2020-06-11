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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.collada._2005._11.colladaschema.FxSurfaceInitPlanarCommon;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fx_surface_init_planar_common", propOrder = {
    "all"
})
public class FxSurfaceInitPlanarCommonImpl
    implements FxSurfaceInitPlanarCommon
{

    @XmlElement(type = FxSurfaceInitPlanarCommonImpl.AllImpl.class)
    protected FxSurfaceInitPlanarCommonImpl.AllImpl all;

    public FxSurfaceInitPlanarCommon.All getAll() {
        return all;
    }

    public void setAll(FxSurfaceInitPlanarCommon.All value) {
        this.all = ((FxSurfaceInitPlanarCommonImpl.AllImpl) value);
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AllImpl
        implements FxSurfaceInitPlanarCommon.All
    {

        @XmlAttribute(name = "ref", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object ref;

        public Object getRef() {
            return ref;
        }

        public void setRef(Object value) {
            this.ref = value;
        }

    }

}
