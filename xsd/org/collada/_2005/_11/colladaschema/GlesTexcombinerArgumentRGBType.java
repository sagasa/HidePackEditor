//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;



/**
 * <p>gles_texcombiner_argumentRGB_type complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="gles_texcombiner_argumentRGB_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="source" type="{http://www.collada.org/2005/11/COLLADASchema}gles_texcombiner_source_enums" />
 *       &lt;attribute name="operand" type="{http://www.collada.org/2005/11/COLLADASchema}gles_texcombiner_operandRGB_enums" default="SRC_COLOR" />
 *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface GlesTexcombinerArgumentRGBType {


    /**
     * sourceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link GlesTexcombinerSourceEnums }
     *     
     */
    GlesTexcombinerSourceEnums getSource();

    /**
     * sourceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link GlesTexcombinerSourceEnums }
     *     
     */
    void setSource(GlesTexcombinerSourceEnums value);

    /**
     * operandプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link GlesTexcombinerOperandRGBEnums }
     *     
     */
    GlesTexcombinerOperandRGBEnums getOperand();

    /**
     * operandプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link GlesTexcombinerOperandRGBEnums }
     *     
     */
    void setOperand(GlesTexcombinerOperandRGBEnums value);

    /**
     * unitプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getUnit();

    /**
     * unitプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setUnit(String value);

}
