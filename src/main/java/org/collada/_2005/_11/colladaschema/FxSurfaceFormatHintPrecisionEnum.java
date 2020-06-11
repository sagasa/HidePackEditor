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
 * <p>fx_surface_format_hint_precision_enumのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="fx_surface_format_hint_precision_enum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOW"/>
 *     &lt;enumeration value="MID"/>
 *     &lt;enumeration value="HIGH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fx_surface_format_hint_precision_enum")
@XmlEnum
public enum FxSurfaceFormatHintPrecisionEnum {


    /**
     * For integers this typically represents 8 bits.  For floats typically 16 bits.
     * 
     */
    LOW,

    /**
     * For integers this typically represents 8 to 24 bits.  For floats typically 16 to 32 bits.
     * 
     */
    MID,

    /**
     * For integers this typically represents 16 to 32 bits.  For floats typically 24 to 32 bits.
     * 
     */
    HIGH;

    public String value() {
        return name();
    }

    public static FxSurfaceFormatHintPrecisionEnum fromValue(String v) {
        return valueOf(v);
    }

}
