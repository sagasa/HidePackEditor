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
 * <p>gles_stencil_op_type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * <p>
 * <pre>
 * &lt;simpleType name="gles_stencil_op_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KEEP"/>
 *     &lt;enumeration value="ZERO"/>
 *     &lt;enumeration value="REPLACE"/>
 *     &lt;enumeration value="INCR"/>
 *     &lt;enumeration value="DECR"/>
 *     &lt;enumeration value="INVERT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gles_stencil_op_type")
@XmlEnum
public enum GlesStencilOpType {

    KEEP,
    ZERO,
    REPLACE,
    INCR,
    DECR,
    INVERT;

    public String value() {
        return name();
    }

    public static GlesStencilOpType fromValue(String v) {
        return valueOf(v);
    }

}
