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
 *         &lt;element name="optics">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="technique_common">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="orthographic">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;sequence>
 *                                           &lt;element name="xmag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                           &lt;choice minOccurs="0">
 *                                             &lt;element name="ymag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                             &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                           &lt;/choice>
 *                                         &lt;/sequence>
 *                                         &lt;sequence>
 *                                           &lt;element name="ymag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                           &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                                         &lt;/sequence>
 *                                       &lt;/choice>
 *                                       &lt;element name="znear" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                       &lt;element name="zfar" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="perspective">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;sequence>
 *                                           &lt;element name="xfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                           &lt;choice minOccurs="0">
 *                                             &lt;element name="yfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                             &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                           &lt;/choice>
 *                                         &lt;/sequence>
 *                                         &lt;sequence>
 *                                           &lt;element name="yfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                           &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                                         &lt;/sequence>
 *                                       &lt;/choice>
 *                                       &lt;element name="znear" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                       &lt;element name="zfar" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}technique" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="imager" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}technique" maxOccurs="unbounded"/>
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Camera {


    /**
     * 
     * 						The camera element may contain an asset element.
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
     * opticsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Camera.Optics }
     *     
     */
    Camera.Optics getOptics();

    /**
     * opticsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Camera.Optics }
     *     
     */
    void setOptics(Camera.Optics value);

    /**
     * imagerプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Camera.Imager }
     *     
     */
    Camera.Imager getImager();

    /**
     * imagerプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Camera.Imager }
     *     
     */
    void setImager(Camera.Imager value);

    /**
     * 
     * 						The extra element may appear any number of times.
     * 						Gets the value of the extras property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extras property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtras().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extra }
     * 
     * 
     */
    List<Extra> getExtras();

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
     *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}technique" maxOccurs="unbounded"/>
     *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface Imager {


        /**
         * 
         * 									This element may contain any number of non-common profile techniques.
         * 									There is no common technique for imager.
         * 									Gets the value of the techniques property.
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
         * 
         * 									The extra element may appear any number of times.
         * 									Gets the value of the extras property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the extras property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExtras().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Extra }
         * 
         * 
         */
        List<Extra> getExtras();

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
     *       &lt;sequence>
     *         &lt;element name="technique_common">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="orthographic">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;sequence>
     *                                 &lt;element name="xmag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                                 &lt;choice minOccurs="0">
     *                                   &lt;element name="ymag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                                   &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                                 &lt;/choice>
     *                               &lt;/sequence>
     *                               &lt;sequence>
     *                                 &lt;element name="ymag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                                 &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *                               &lt;/sequence>
     *                             &lt;/choice>
     *                             &lt;element name="znear" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                             &lt;element name="zfar" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="perspective">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;sequence>
     *                                 &lt;element name="xfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                                 &lt;choice minOccurs="0">
     *                                   &lt;element name="yfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                                   &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                                 &lt;/choice>
     *                               &lt;/sequence>
     *                               &lt;sequence>
     *                                 &lt;element name="yfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                                 &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *                               &lt;/sequence>
     *                             &lt;/choice>
     *                             &lt;element name="znear" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                             &lt;element name="zfar" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}technique" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface Optics {


        /**
         * techniqueCommonプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link Camera.Optics.TechniqueCommon }
         *     
         */
        Camera.Optics.TechniqueCommon getTechniqueCommon();

        /**
         * techniqueCommonプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link Camera.Optics.TechniqueCommon }
         *     
         */
        void setTechniqueCommon(Camera.Optics.TechniqueCommon value);

        /**
         * 
         * 									This element may contain any number of non-common profile techniques.
         * 									Gets the value of the techniques property.
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
         * 
         * 									The extra element may appear any number of times.
         * 									Gets the value of the extras property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the extras property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExtras().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Extra }
         * 
         * 
         */
        List<Extra> getExtras();


        /**
         * <p>anonymous complex typeのJavaクラス。
         * 
         * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;choice>
         *         &lt;element name="orthographic">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;sequence>
         *                       &lt;element name="xmag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                       &lt;choice minOccurs="0">
         *                         &lt;element name="ymag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                         &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                       &lt;/choice>
         *                     &lt;/sequence>
         *                     &lt;sequence>
         *                       &lt;element name="ymag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                       &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
         *                     &lt;/sequence>
         *                   &lt;/choice>
         *                   &lt;element name="znear" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                   &lt;element name="zfar" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="perspective">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;sequence>
         *                       &lt;element name="xfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                       &lt;choice minOccurs="0">
         *                         &lt;element name="yfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                         &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                       &lt;/choice>
         *                     &lt;/sequence>
         *                     &lt;sequence>
         *                       &lt;element name="yfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                       &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
         *                     &lt;/sequence>
         *                   &lt;/choice>
         *                   &lt;element name="znear" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                   &lt;element name="zfar" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                 &lt;/sequence>
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
        public interface TechniqueCommon {


            /**
             * perspectiveプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link Camera.Optics.TechniqueCommon.Perspective }
             *     
             */
            Camera.Optics.TechniqueCommon.Perspective getPerspective();

            /**
             * perspectiveプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link Camera.Optics.TechniqueCommon.Perspective }
             *     
             */
            void setPerspective(Camera.Optics.TechniqueCommon.Perspective value);

            /**
             * orthographicプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link Camera.Optics.TechniqueCommon.Orthographic }
             *     
             */
            Camera.Optics.TechniqueCommon.Orthographic getOrthographic();

            /**
             * orthographicプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link Camera.Optics.TechniqueCommon.Orthographic }
             *     
             */
            void setOrthographic(Camera.Optics.TechniqueCommon.Orthographic value);


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
             *         &lt;choice>
             *           &lt;sequence>
             *             &lt;element name="xmag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *             &lt;choice minOccurs="0">
             *               &lt;element name="ymag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *               &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *             &lt;/choice>
             *           &lt;/sequence>
             *           &lt;sequence>
             *             &lt;element name="ymag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *             &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
             *           &lt;/sequence>
             *         &lt;/choice>
             *         &lt;element name="znear" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *         &lt;element name="zfar" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface Orthographic {


                /**
                 * xmagプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getXmag();

                /**
                 * xmagプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setXmag(TargetableFloat value);

                /**
                 * ymagプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getYmag();

                /**
                 * ymagプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setYmag(TargetableFloat value);

                /**
                 * aspectRatioプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getAspectRatio();

                /**
                 * aspectRatioプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setAspectRatio(TargetableFloat value);

                /**
                 * znearプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getZnear();

                /**
                 * znearプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setZnear(TargetableFloat value);

                /**
                 * zfarプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getZfar();

                /**
                 * zfarプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setZfar(TargetableFloat value);

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
             *       &lt;sequence>
             *         &lt;choice>
             *           &lt;sequence>
             *             &lt;element name="xfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *             &lt;choice minOccurs="0">
             *               &lt;element name="yfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *               &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *             &lt;/choice>
             *           &lt;/sequence>
             *           &lt;sequence>
             *             &lt;element name="yfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *             &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
             *           &lt;/sequence>
             *         &lt;/choice>
             *         &lt;element name="znear" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *         &lt;element name="zfar" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface Perspective {


                /**
                 * xfovプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getXfov();

                /**
                 * xfovプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setXfov(TargetableFloat value);

                /**
                 * yfovプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getYfov();

                /**
                 * yfovプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setYfov(TargetableFloat value);

                /**
                 * aspectRatioプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getAspectRatio();

                /**
                 * aspectRatioプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setAspectRatio(TargetableFloat value);

                /**
                 * znearプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getZnear();

                /**
                 * znearプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setZnear(TargetableFloat value);

                /**
                 * zfarプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getZfar();

                /**
                 * zfarプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setZfar(TargetableFloat value);

            }

        }

    }

}
