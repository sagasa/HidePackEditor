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
 * <p>gl_func_typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="gl_func_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEVER"/>
 *     &lt;enumeration value="LESS"/>
 *     &lt;enumeration value="LEQUAL"/>
 *     &lt;enumeration value="EQUAL"/>
 *     &lt;enumeration value="GREATER"/>
 *     &lt;enumeration value="NOTEQUAL"/>
 *     &lt;enumeration value="GEQUAL"/>
 *     &lt;enumeration value="ALWAYS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gl_func_type")
@XmlEnum
public enum GlFuncType {

    NEVER,
    LESS,
    LEQUAL,
    EQUAL,
    GREATER,
    NOTEQUAL,
    GEQUAL,
    ALWAYS;

    public String value() {
        return name();
    }

    public static GlFuncType fromValue(String v) {
        return valueOf(v);
    }

}
