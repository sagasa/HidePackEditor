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
 * <p>fx_surface_format_hint_channels_enum��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * <p>
 * <pre>
 * &lt;simpleType name="fx_surface_format_hint_channels_enum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RGB"/>
 *     &lt;enumeration value="RGBA"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="LA"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="XYZ"/>
 *     &lt;enumeration value="XYZW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fx_surface_format_hint_channels_enum")
@XmlEnum
public enum FxSurfaceFormatHintChannelsEnum {


    /**
     * RGB color  map
     * 
     */
    RGB,

    /**
     * RGB color + Alpha map often used for color + transparency or other things packed into channel A like specular power 
     * 
     */
    RGBA,

    /**
     * Luminance map often used for light mapping 
     * 
     */
    L,

    /**
     * Luminance+Alpha map often used for light mapping 
     * 
     */
    LA,

    /**
     * Depth map often used for displacement, parellax, relief, or shadow mapping 
     * 
     */
    D,

    /**
     * Typically used for normal maps or 3component displacement maps.
     * 
     */
    XYZ,

    /**
     * Typically used for normal maps where W is the depth for relief or parrallax mapping 
     * 
     */
    XYZW;

    public String value() {
        return name();
    }

    public static FxSurfaceFormatHintChannelsEnum fromValue(String v) {
        return valueOf(v);
    }

}
