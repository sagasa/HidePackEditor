//
// ���̃t�@�C���́AJavaTM Architecture for XML Binding(JAXB) Reference Implementation�Av2.2.8-b130911.1802�ɂ���Đ�������܂��� 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>���Q�Ƃ��Ă������� 
// �\�[�X�E�X�L�[�}�̍ăR���p�C�����ɂ��̃t�@�C���̕ύX�͎����܂��B 
// ������: 2020.05.28 ���� 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>fx_sampler_wrap_common��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * <p>
 * <pre>
 * &lt;simpleType name="fx_sampler_wrap_common">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="WRAP"/>
 *     &lt;enumeration value="MIRROR"/>
 *     &lt;enumeration value="CLAMP"/>
 *     &lt;enumeration value="BORDER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fx_sampler_wrap_common")
@XmlEnum
public enum FxSamplerWrapCommon {

    NONE,
    WRAP,
    MIRROR,
    CLAMP,
    BORDER;

    public String value() {
        return name();
    }

    public static FxSamplerWrapCommon fromValue(String v) {
        return valueOf(v);
    }

}
