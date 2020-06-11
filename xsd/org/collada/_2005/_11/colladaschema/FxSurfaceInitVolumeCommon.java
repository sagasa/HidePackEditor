//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;



/**
 * <p>fx_surface_init_volume_common complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="fx_surface_init_volume_common">
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
public interface FxSurfaceInitVolumeCommon {


    /**
     * primaryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link FxSurfaceInitVolumeCommon.Primary }
     *     
     */
    FxSurfaceInitVolumeCommon.Primary getPrimary();

    /**
     * primaryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link FxSurfaceInitVolumeCommon.Primary }
     *     
     */
    void setPrimary(FxSurfaceInitVolumeCommon.Primary value);

    /**
     * allプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link FxSurfaceInitVolumeCommon.All }
     *     
     */
    FxSurfaceInitVolumeCommon.All getAll();

    /**
     * allプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link FxSurfaceInitVolumeCommon.All }
     *     
     */
    void setAll(FxSurfaceInitVolumeCommon.All value);


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
    public interface Primary {


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
