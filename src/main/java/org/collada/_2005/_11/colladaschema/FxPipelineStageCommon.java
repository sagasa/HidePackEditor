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
 * <p>fx_pipeline_stage_commonのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="fx_pipeline_stage_common">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VERTEXPROGRAM"/>
 *     &lt;enumeration value="FRAGMENTPROGRAM"/>
 *     &lt;enumeration value="VERTEXSHADER"/>
 *     &lt;enumeration value="PIXELSHADER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fx_pipeline_stage_common")
@XmlEnum
public enum FxPipelineStageCommon {

    VERTEXPROGRAM,
    FRAGMENTPROGRAM,
    VERTEXSHADER,
    PIXELSHADER;

    public String value() {
        return name();
    }

    public static FxPipelineStageCommon fromValue(String v) {
        return valueOf(v);
    }

}
