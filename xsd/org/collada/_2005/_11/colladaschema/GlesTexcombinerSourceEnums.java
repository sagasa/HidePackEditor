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
 * <p>gles_texcombiner_source_enumsのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="gles_texcombiner_source_enums">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="TEXTURE"/>
 *     &lt;enumeration value="CONSTANT"/>
 *     &lt;enumeration value="PRIMARY"/>
 *     &lt;enumeration value="PREVIOUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gles_texcombiner_source_enums")
@XmlEnum
public enum GlesTexcombinerSourceEnums {

    TEXTURE,
    CONSTANT,
    PRIMARY,
    PREVIOUS;

    public String value() {
        return name();
    }

    public static GlesTexcombinerSourceEnums fromValue(String v) {
        return valueOf(v);
    }

}
