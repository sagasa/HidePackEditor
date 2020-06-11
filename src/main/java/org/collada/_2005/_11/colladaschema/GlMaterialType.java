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
 * <p>gl_material_type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * <p>
 * <pre>
 * &lt;simpleType name="gl_material_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMISSION"/>
 *     &lt;enumeration value="AMBIENT"/>
 *     &lt;enumeration value="DIFFUSE"/>
 *     &lt;enumeration value="SPECULAR"/>
 *     &lt;enumeration value="AMBIENT_AND_DIFFUSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gl_material_type")
@XmlEnum
public enum GlMaterialType {

    EMISSION,
    AMBIENT,
    DIFFUSE,
    SPECULAR,
    AMBIENT_AND_DIFFUSE;

    public String value() {
        return name();
    }

    public static GlMaterialType fromValue(String v) {
        return valueOf(v);
    }

}
