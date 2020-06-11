//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>fx_surface_format_hint_channels_enumのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
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
