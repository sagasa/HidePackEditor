//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;

import java.util.List;


/**
 * <p>anonymous complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}asset" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}IDREF_array"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}Name_array"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}bool_array"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}float_array"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}int_array"/>
 *         &lt;/choice>
 *         &lt;element name="technique_common" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}accessor"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}technique" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Source {


    /**
     * 
     * 						The source element may contain an asset element.
     * 						
     * 
     * @return
     *     possible object is
     *     {@link Asset }
     *     
     */
    Asset getAsset();

    /**
     * assetプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Asset }
     *     
     */
    void setAsset(Asset value);

    /**
     * 
     * 							The source element may contain an int_array.
     * 							
     * 
     * @return
     *     possible object is
     *     {@link IntArray }
     *     
     */
    IntArray getIntArray();

    /**
     * intArrayプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link IntArray }
     *     
     */
    void setIntArray(IntArray value);

    /**
     * 
     * 							The source element may contain a float_array.
     * 							
     * 
     * @return
     *     possible object is
     *     {@link FloatArray }
     *     
     */
    FloatArray getFloatArray();

    /**
     * floatArrayプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link FloatArray }
     *     
     */
    void setFloatArray(FloatArray value);

    /**
     * 
     * 							The source element may contain a bool_array.
     * 							
     * 
     * @return
     *     possible object is
     *     {@link BoolArray }
     *     
     */
    BoolArray getBoolArray();

    /**
     * boolArrayプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BoolArray }
     *     
     */
    void setBoolArray(BoolArray value);

    /**
     * 
     * 							The source element may contain a Name_array.
     * 							
     * 
     * @return
     *     possible object is
     *     {@link NameArray }
     *     
     */
    NameArray getNameArray();

    /**
     * nameArrayプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link NameArray }
     *     
     */
    void setNameArray(NameArray value);

    /**
     * 
     * 							The source element may contain an IDREF_array.
     * 							
     * 
     * @return
     *     possible object is
     *     {@link IDREFArray }
     *     
     */
    IDREFArray getIDREFArray();

    /**
     * idrefArrayプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link IDREFArray }
     *     
     */
    void setIDREFArray(IDREFArray value);

    /**
     * techniqueCommonプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Source.TechniqueCommon }
     *     
     */
    Source.TechniqueCommon getTechniqueCommon();

    /**
     * techniqueCommonプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Source.TechniqueCommon }
     *     
     */
    void setTechniqueCommon(Source.TechniqueCommon value);

    /**
     * 
     * 						This element may contain any number of non-common profile techniques.
     * 						Gets the value of the techniques property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the techniques property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechniques().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Technique }
     * 
     * 
     */
    List<Technique> getTechniques();

    /**
     * idプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getId();

    /**
     * idプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setId(String value);

    /**
     * nameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getName();

    /**
     * nameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setName(String value);


    /**
     * <p>anonymous complex typeのJavaクラス。
     * 
     * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}accessor"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface TechniqueCommon {


        /**
         * 
         * 									The source's technique_common must have one and only one accessor.
         * 									
         * 
         * @return
         *     possible object is
         *     {@link Accessor }
         *     
         */
        Accessor getAccessor();

        /**
         * accessorプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link Accessor }
         *     
         */
        void setAccessor(Accessor value);

    }

}
