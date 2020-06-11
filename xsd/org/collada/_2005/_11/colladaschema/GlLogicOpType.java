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
 * <p>gl_logic_op_type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * <p>
 * <pre>
 * &lt;simpleType name="gl_logic_op_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLEAR"/>
 *     &lt;enumeration value="AND"/>
 *     &lt;enumeration value="AND_REVERSE"/>
 *     &lt;enumeration value="COPY"/>
 *     &lt;enumeration value="AND_INVERTED"/>
 *     &lt;enumeration value="NOOP"/>
 *     &lt;enumeration value="XOR"/>
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="NOR"/>
 *     &lt;enumeration value="EQUIV"/>
 *     &lt;enumeration value="INVERT"/>
 *     &lt;enumeration value="OR_REVERSE"/>
 *     &lt;enumeration value="COPY_INVERTED"/>
 *     &lt;enumeration value="NAND"/>
 *     &lt;enumeration value="SET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gl_logic_op_type")
@XmlEnum
public enum GlLogicOpType {

    CLEAR,
    AND,
    AND_REVERSE,
    COPY,
    AND_INVERTED,
    NOOP,
    XOR,
    OR,
    NOR,
    EQUIV,
    INVERT,
    OR_REVERSE,
    COPY_INVERTED,
    NAND,
    SET;

    public String value() {
        return name();
    }

    public static GlLogicOpType fromValue(String v) {
        return valueOf(v);
    }

}
