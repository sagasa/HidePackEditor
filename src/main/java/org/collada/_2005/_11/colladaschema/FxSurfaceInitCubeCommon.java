//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;

import java.util.List;


/**
 * <p>fx_surface_init_cube_common complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="fx_surface_init_cube_common">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="all">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="primary">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="order" type="{http://www.collada.org/2005/11/COLLADASchema}fx_surface_face_enum" maxOccurs="6" minOccurs="6"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="face" maxOccurs="6" minOccurs="6">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface FxSurfaceInitCubeCommon {


    /**
     * Gets the value of the faces property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faces property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxSurfaceInitCubeCommon.Face }
     * 
     * 
     */
    List<FxSurfaceInitCubeCommon.Face> getFaces();

    /**
     * primaryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link FxSurfaceInitCubeCommon.Primary }
     *     
     */
    FxSurfaceInitCubeCommon.Primary getPrimary();

    /**
     * primaryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link FxSurfaceInitCubeCommon.Primary }
     *     
     */
    void setPrimary(FxSurfaceInitCubeCommon.Primary value);

    /**
     * allプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link FxSurfaceInitCubeCommon.All }
     *     
     */
    FxSurfaceInitCubeCommon.All getAll();

    /**
     * allプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link FxSurfaceInitCubeCommon.All }
     *     
     */
    void setAll(FxSurfaceInitCubeCommon.All value);


    /**
     * <p>anonymous complex typeのJavaクラス。
     * 
     * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface All {


        /**
         * refプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        Object getRef();

        /**
         * refプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        void setRef(Object value);

    }


    /**
     * <p>anonymous complex typeのJavaクラス。
     * 
     * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface Face {


        /**
         * refプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        Object getRef();

        /**
         * refプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        void setRef(Object value);

    }


    /**
     * <p>anonymous complex typeのJavaクラス。
     * 
     * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="order" type="{http://www.collada.org/2005/11/COLLADASchema}fx_surface_face_enum" maxOccurs="6" minOccurs="6"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface Primary {


        /**
         * Gets the value of the orders property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orders property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrders().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FxSurfaceFaceEnum }
         * 
         * 
         */
        List<FxSurfaceFaceEnum> getOrders();

        /**
         * refプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        Object getRef();

        /**
         * refプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        void setRef(Object value);

    }

}
