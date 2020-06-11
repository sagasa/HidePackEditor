//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;



/**
 * <p>gles_texenv_command_type complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="gles_texenv_command_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constant" type="{http://www.collada.org/2005/11/COLLADASchema}gles_texture_constant_type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operator" type="{http://www.collada.org/2005/11/COLLADASchema}gles_texenv_mode_enums" />
 *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface GlesTexenvCommandType {


    /**
     * constantプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link GlesTextureConstantType }
     *     
     */
    GlesTextureConstantType getConstant();

    /**
     * constantプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link GlesTextureConstantType }
     *     
     */
    void setConstant(GlesTextureConstantType value);

    /**
     * operatorプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link GlesTexenvModeEnums }
     *     
     */
    GlesTexenvModeEnums getOperator();

    /**
     * operatorプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link GlesTexenvModeEnums }
     *     
     */
    void setOperator(GlesTexenvModeEnums value);

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
