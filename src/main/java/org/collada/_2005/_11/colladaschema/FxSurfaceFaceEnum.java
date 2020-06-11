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
 * <p>fx_surface_face_enumのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="fx_surface_face_enum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="POSITIVE_X"/>
 *     &lt;enumeration value="NEGATIVE_X"/>
 *     &lt;enumeration value="POSITIVE_Y"/>
 *     &lt;enumeration value="NEGATIVE_Y"/>
 *     &lt;enumeration value="POSITIVE_Z"/>
 *     &lt;enumeration value="NEGATIVE_Z"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fx_surface_face_enum")
@XmlEnum
public enum FxSurfaceFaceEnum {

    POSITIVE_X,
    NEGATIVE_X,
    POSITIVE_Y,
    NEGATIVE_Y,
    POSITIVE_Z,
    NEGATIVE_Z;

    public String value() {
        return name();
    }

    public static FxSurfaceFaceEnum fromValue(String v) {
        return valueOf(v);
    }

}
