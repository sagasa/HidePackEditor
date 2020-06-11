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
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}image"/>
 *           &lt;element name="newparam" type="{http://www.collada.org/2005/11/COLLADASchema}gles_newparam"/>
 *         &lt;/choice>
 *         &lt;element name="technique" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}asset" minOccurs="0"/>
 *                   &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}image"/>
 *                     &lt;element name="newparam" type="{http://www.collada.org/2005/11/COLLADASchema}gles_newparam"/>
 *                     &lt;element name="setparam">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}gles_basic_type_common"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;element name="pass" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="color_target" type="{http://www.collada.org/2005/11/COLLADASchema}gles_rendertarget_common" minOccurs="0"/>
 *                             &lt;element name="depth_target" type="{http://www.collada.org/2005/11/COLLADASchema}gles_rendertarget_common" minOccurs="0"/>
 *                             &lt;element name="stencil_target" type="{http://www.collada.org/2005/11/COLLADASchema}gles_rendertarget_common" minOccurs="0"/>
 *                             &lt;element name="color_clear" type="{http://www.collada.org/2005/11/COLLADASchema}fx_color_common" minOccurs="0"/>
 *                             &lt;element name="depth_clear" type="{http://www.collada.org/2005/11/COLLADASchema}float" minOccurs="0"/>
 *                             &lt;element name="stencil_clear" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *                             &lt;element name="draw" type="{http://www.collada.org/2005/11/COLLADASchema}fx_draw_common" minOccurs="0"/>
 *                             &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                               &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}gles_pipeline_settings"/>
 *                             &lt;/choice>
 *                             &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                 &lt;attribute name="sid" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="platform" type="{http://www.w3.org/2001/XMLSchema}NCName" default="PC" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ProfileGLES {


    /**
     * assetプロパティの値を取得します。
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
     * Gets the value of the imagesAndNewparams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imagesAndNewparams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImagesAndNewparams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Image }
     * {@link GlesNewparam }
     * 
     * 
     */
    List<Object> getImagesAndNewparams();

    /**
     * Gets the value of the techniques property.
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
     * {@link ProfileGLES.Technique }
     * 
     * 
     */
    List<ProfileGLES.Technique> getTechniques();

    /**
     * Gets the value of the extras property.
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
     * platformプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPlatform();

    /**
     * platformプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPlatform(String value);


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
     *         &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}image"/>
     *           &lt;element name="newparam" type="{http://www.collada.org/2005/11/COLLADASchema}gles_newparam"/>
     *           &lt;element name="setparam">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
     *                     &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}gles_basic_type_common"/>
     *                   &lt;/sequence>
     *                   &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="pass" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="color_target" type="{http://www.collada.org/2005/11/COLLADASchema}gles_rendertarget_common" minOccurs="0"/>
     *                   &lt;element name="depth_target" type="{http://www.collada.org/2005/11/COLLADASchema}gles_rendertarget_common" minOccurs="0"/>
     *                   &lt;element name="stencil_target" type="{http://www.collada.org/2005/11/COLLADASchema}gles_rendertarget_common" minOccurs="0"/>
     *                   &lt;element name="color_clear" type="{http://www.collada.org/2005/11/COLLADASchema}fx_color_common" minOccurs="0"/>
     *                   &lt;element name="depth_clear" type="{http://www.collada.org/2005/11/COLLADASchema}float" minOccurs="0"/>
     *                   &lt;element name="stencil_clear" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
     *                   &lt;element name="draw" type="{http://www.collada.org/2005/11/COLLADASchema}fx_draw_common" minOccurs="0"/>
     *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
     *                     &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}gles_pipeline_settings"/>
     *                   &lt;/choice>
     *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *       &lt;attribute name="sid" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface Technique {


        /**
         * assetプロパティの値を取得します。
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
         * Gets the value of the annotates property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the annotates property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnnotates().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FxAnnotateCommon }
         * 
         * 
         */
        List<FxAnnotateCommon> getAnnotates();

        /**
         * Gets the value of the imagesAndNewparamsAndSetparams property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the imagesAndNewparamsAndSetparams property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImagesAndNewparamsAndSetparams().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Image }
         * {@link GlesNewparam }
         * {@link ProfileGLES.Technique.Setparam }
         * 
         * 
         */
        List<Object> getImagesAndNewparamsAndSetparams();

        /**
         * Gets the value of the passes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPasses().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProfileGLES.Technique.Pass }
         * 
         * 
         */
        List<ProfileGLES.Technique.Pass> getPasses();

        /**
         * Gets the value of the extras property.
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
         * sidプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getSid();

        /**
         * sidプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setSid(String value);


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
         *         &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="color_target" type="{http://www.collada.org/2005/11/COLLADASchema}gles_rendertarget_common" minOccurs="0"/>
         *         &lt;element name="depth_target" type="{http://www.collada.org/2005/11/COLLADASchema}gles_rendertarget_common" minOccurs="0"/>
         *         &lt;element name="stencil_target" type="{http://www.collada.org/2005/11/COLLADASchema}gles_rendertarget_common" minOccurs="0"/>
         *         &lt;element name="color_clear" type="{http://www.collada.org/2005/11/COLLADASchema}fx_color_common" minOccurs="0"/>
         *         &lt;element name="depth_clear" type="{http://www.collada.org/2005/11/COLLADASchema}float" minOccurs="0"/>
         *         &lt;element name="stencil_clear" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
         *         &lt;element name="draw" type="{http://www.collada.org/2005/11/COLLADASchema}fx_draw_common" minOccurs="0"/>
         *         &lt;choice maxOccurs="unbounded" minOccurs="0">
         *           &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}gles_pipeline_settings"/>
         *         &lt;/choice>
         *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface Pass {


            /**
             * Gets the value of the annotates property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the annotates property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAnnotates().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FxAnnotateCommon }
             * 
             * 
             */
            List<FxAnnotateCommon> getAnnotates();

            /**
             * colorTargetプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            String getColorTarget();

            /**
             * colorTargetプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            void setColorTarget(String value);

            /**
             * depthTargetプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            String getDepthTarget();

            /**
             * depthTargetプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            void setDepthTarget(String value);

            /**
             * stencilTargetプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            String getStencilTarget();

            /**
             * stencilTargetプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            void setStencilTarget(String value);

            /**
             * Gets the value of the colorClear property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the colorClear property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getColorClear().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getColorClear();

            /**
             * depthClearプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            Double getDepthClear();

            /**
             * depthClearプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            void setDepthClear(Double value);

            /**
             * stencilClearプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            Byte getStencilClear();

            /**
             * stencilClearプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            void setStencilClear(Byte value);

            /**
             * drawプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            String getDraw();

            /**
             * drawプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            void setDraw(String value);

            /**
             * Gets the value of the alphaFuncsAndBlendFuncsAndClearColors property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the alphaFuncsAndBlendFuncsAndClearColors property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAlphaFuncsAndBlendFuncsAndClearColors().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProfileGLES.Technique.Pass.AlphaFunc }
             * {@link ProfileGLES.Technique.Pass.BlendFunc }
             * {@link ProfileGLES.Technique.Pass.ClearColor }
             * {@link ProfileGLES.Technique.Pass.ClearStencil }
             * {@link ProfileGLES.Technique.Pass.ClearDepth }
             * {@link ProfileGLES.Technique.Pass.ClipPlane }
             * {@link ProfileGLES.Technique.Pass.ColorMask }
             * {@link ProfileGLES.Technique.Pass.CullFace }
             * {@link ProfileGLES.Technique.Pass.DepthFunc }
             * {@link ProfileGLES.Technique.Pass.DepthMask }
             * {@link ProfileGLES.Technique.Pass.DepthRange }
             * {@link ProfileGLES.Technique.Pass.FogColor }
             * {@link ProfileGLES.Technique.Pass.FogDensity }
             * {@link ProfileGLES.Technique.Pass.FogMode }
             * {@link ProfileGLES.Technique.Pass.FogStart }
             * {@link ProfileGLES.Technique.Pass.FogEnd }
             * {@link ProfileGLES.Technique.Pass.FrontFace }
             * {@link ProfileGLES.Technique.Pass.TexturePipeline }
             * {@link ProfileGLES.Technique.Pass.LogicOp }
             * {@link ProfileGLES.Technique.Pass.LightAmbient }
             * {@link ProfileGLES.Technique.Pass.LightDiffuse }
             * {@link ProfileGLES.Technique.Pass.LightSpecular }
             * {@link ProfileGLES.Technique.Pass.LightPosition }
             * {@link ProfileGLES.Technique.Pass.LightConstantAttenuation }
             * {@link ProfileGLES.Technique.Pass.LightLinearAttenutation }
             * {@link ProfileGLES.Technique.Pass.LightQuadraticAttenuation }
             * {@link ProfileGLES.Technique.Pass.LightSpotCutoff }
             * {@link ProfileGLES.Technique.Pass.LightSpotDirection }
             * {@link ProfileGLES.Technique.Pass.LightSpotExponent }
             * {@link ProfileGLES.Technique.Pass.LightModelAmbient }
             * {@link ProfileGLES.Technique.Pass.LineWidth }
             * {@link ProfileGLES.Technique.Pass.MaterialAmbient }
             * {@link ProfileGLES.Technique.Pass.MaterialDiffuse }
             * {@link ProfileGLES.Technique.Pass.MaterialEmission }
             * {@link ProfileGLES.Technique.Pass.MaterialShininess }
             * {@link ProfileGLES.Technique.Pass.MaterialSpecular }
             * {@link ProfileGLES.Technique.Pass.ModelViewMatrix }
             * {@link ProfileGLES.Technique.Pass.PointDistanceAttenuation }
             * {@link ProfileGLES.Technique.Pass.PointFadeThresholdSize }
             * {@link ProfileGLES.Technique.Pass.PointSize }
             * {@link ProfileGLES.Technique.Pass.PointSizeMin }
             * {@link ProfileGLES.Technique.Pass.PointSizeMax }
             * {@link ProfileGLES.Technique.Pass.PolygonOffset }
             * {@link ProfileGLES.Technique.Pass.ProjectionMatrix }
             * {@link ProfileGLES.Technique.Pass.Scissor }
             * {@link ProfileGLES.Technique.Pass.ShadeModel }
             * {@link ProfileGLES.Technique.Pass.StencilFunc }
             * {@link ProfileGLES.Technique.Pass.StencilMask }
             * {@link ProfileGLES.Technique.Pass.StencilOp }
             * {@link ProfileGLES.Technique.Pass.AlphaTestEnable }
             * {@link ProfileGLES.Technique.Pass.BlendEnable }
             * {@link ProfileGLES.Technique.Pass.ClipPlaneEnable }
             * {@link ProfileGLES.Technique.Pass.ColorLogicOpEnable }
             * {@link ProfileGLES.Technique.Pass.ColorMaterialEnable }
             * {@link ProfileGLES.Technique.Pass.CullFaceEnable }
             * {@link ProfileGLES.Technique.Pass.DepthTestEnable }
             * {@link ProfileGLES.Technique.Pass.DitherEnable }
             * {@link ProfileGLES.Technique.Pass.FogEnable }
             * {@link ProfileGLES.Technique.Pass.TexturePipelineEnable }
             * {@link ProfileGLES.Technique.Pass.LightEnable }
             * {@link ProfileGLES.Technique.Pass.LightingEnable }
             * {@link ProfileGLES.Technique.Pass.LightModelTwoSideEnable }
             * {@link ProfileGLES.Technique.Pass.LineSmoothEnable }
             * {@link ProfileGLES.Technique.Pass.MultisampleEnable }
             * {@link ProfileGLES.Technique.Pass.NormalizeEnable }
             * {@link ProfileGLES.Technique.Pass.PointSmoothEnable }
             * {@link ProfileGLES.Technique.Pass.PolygonOffsetFillEnable }
             * {@link ProfileGLES.Technique.Pass.RescaleNormalEnable }
             * {@link ProfileGLES.Technique.Pass.SampleAlphaToCoverageEnable }
             * {@link ProfileGLES.Technique.Pass.SampleAlphaToOneEnable }
             * {@link ProfileGLES.Technique.Pass.SampleCoverageEnable }
             * {@link ProfileGLES.Technique.Pass.ScissorTestEnable }
             * {@link ProfileGLES.Technique.Pass.StencilTestEnable }
             * 
             * 
             */
            List<Object> getAlphaFuncsAndBlendFuncsAndClearColors();

            /**
             * Gets the value of the extras property.
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
             * sidプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            String getSid();

            /**
             * sidプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            void setSid(String value);


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
             *         &lt;element name="func">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_func_type" default="ALWAYS" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="value">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_alpha_value_type" default="0.0" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface AlphaFunc {


                /**
                 * funcプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLES.Technique.Pass.AlphaFunc.Func }
                 *     
                 */
                ProfileGLES.Technique.Pass.AlphaFunc.Func getFunc();

                /**
                 * funcプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLES.Technique.Pass.AlphaFunc.Func }
                 *     
                 */
                void setFunc(ProfileGLES.Technique.Pass.AlphaFunc.Func value);

                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLES.Technique.Pass.AlphaFunc.Value }
                 *     
                 */
                ProfileGLES.Technique.Pass.AlphaFunc.Value getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLES.Technique.Pass.AlphaFunc.Value }
                 *     
                 */
                void setValue(ProfileGLES.Technique.Pass.AlphaFunc.Value value);


                /**
                 * <p>anonymous complex typeのJavaクラス。
                 * 
                 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_func_type" default="ALWAYS" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Func {


                    /**
                     * valueプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlFuncType }
                     *     
                     */
                    GlFuncType getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlFuncType }
                     *     
                     */
                    void setValue(GlFuncType value);

                    /**
                     * paramプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getParam();

                    /**
                     * paramプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setParam(String value);

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
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_alpha_value_type" default="0.0" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Value {


                    /**
                     * valueプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Float }
                     *     
                     */
                    float getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Float }
                     *     
                     */
                    void setValue(Float value);

                    /**
                     * paramプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getParam();

                    /**
                     * paramプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setParam(String value);

                }

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface AlphaTestEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface BlendEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *         &lt;element name="src">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_blend_type" default="ONE" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="dest">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_blend_type" default="ZERO" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface BlendFunc {


                /**
                 * srcプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLES.Technique.Pass.BlendFunc.Src }
                 *     
                 */
                ProfileGLES.Technique.Pass.BlendFunc.Src getSrc();

                /**
                 * srcプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLES.Technique.Pass.BlendFunc.Src }
                 *     
                 */
                void setSrc(ProfileGLES.Technique.Pass.BlendFunc.Src value);

                /**
                 * destプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLES.Technique.Pass.BlendFunc.Dest }
                 *     
                 */
                ProfileGLES.Technique.Pass.BlendFunc.Dest getDest();

                /**
                 * destプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLES.Technique.Pass.BlendFunc.Dest }
                 *     
                 */
                void setDest(ProfileGLES.Technique.Pass.BlendFunc.Dest value);


                /**
                 * <p>anonymous complex typeのJavaクラス。
                 * 
                 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_blend_type" default="ZERO" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Dest {


                    /**
                     * valueプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlBlendType }
                     *     
                     */
                    GlBlendType getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlBlendType }
                     *     
                     */
                    void setValue(GlBlendType value);

                    /**
                     * paramプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getParam();

                    /**
                     * paramプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setParam(String value);

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
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_blend_type" default="ONE" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Src {


                    /**
                     * valueプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlBlendType }
                     *     
                     */
                    GlBlendType getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlBlendType }
                     *     
                     */
                    void setValue(GlBlendType value);

                    /**
                     * paramプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getParam();

                    /**
                     * paramプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setParam(String value);

                }

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ClearColor {


                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValues().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Double }
                 * 
                 * 
                 */
                List<Double> getValues();

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ClearDepth {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                Double getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}int" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ClearStencil {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                Long getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                void setValue(Long value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool4" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_CLIP_PLANES_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ClipPlane {


                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValues().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Boolean }
                 * 
                 * 
                 */
                List<Boolean> getValues();

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * indexプロパティの値を取得します。
                 * 
                 */
                int getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_CLIP_PLANES_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ClipPlaneEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * indexプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                Integer getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                void setIndex(Integer value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ColorLogicOpEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool4" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ColorMask {


                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValues().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Boolean }
                 * 
                 * 
                 */
                List<Boolean> getValues();

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="true" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ColorMaterialEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_face_type" default="BACK" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface CullFace {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlFaceType }
                 *     
                 */
                GlFaceType getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlFaceType }
                 *     
                 */
                void setValue(GlFaceType value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface CullFaceEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_func_type" default="ALWAYS" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface DepthFunc {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlFuncType }
                 *     
                 */
                GlFuncType getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlFuncType }
                 *     
                 */
                void setValue(GlFuncType value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface DepthMask {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float2" default="0 1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface DepthRange {


                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValues().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Double }
                 * 
                 * 
                 */
                List<Double> getValues();

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface DepthTestEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface DitherEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0 0 0 0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface FogColor {


                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValues().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Double }
                 * 
                 * 
                 */
                List<Double> getValues();

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface FogDensity {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface FogEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface FogEnd {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_fog_type" default="EXP" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface FogMode {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlFogType }
                 *     
                 */
                GlFogType getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlFogType }
                 *     
                 */
                void setValue(GlFogType value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface FogStart {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_front_face_type" default="CCW" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface FrontFace {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlFrontFaceType }
                 *     
                 */
                GlFrontFaceType getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlFrontFaceType }
                 *     
                 */
                void setValue(GlFrontFaceType value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0 0 0 1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightAmbient {


                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValues().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Double }
                 * 
                 * 
                 */
                List<Double> getValues();

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * indexプロパティの値を取得します。
                 * 
                 */
                int getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightConstantAttenuation {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * indexプロパティの値を取得します。
                 * 
                 */
                int getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0 0 0 0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightDiffuse {


                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValues().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Double }
                 * 
                 * 
                 */
                List<Double> getValues();

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * indexプロパティの値を取得します。
                 * 
                 */
                int getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * indexプロパティの値を取得します。
                 * 
                 */
                int getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightLinearAttenutation {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * indexプロパティの値を取得します。
                 * 
                 */
                int getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0.2 0.2 0.2 1.0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightModelAmbient {


                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValues().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Double }
                 * 
                 * 
                 */
                List<Double> getValues();

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightModelTwoSideEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0 0 1 0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightPosition {


                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValues().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Double }
                 * 
                 * 
                 */
                List<Double> getValues();

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * indexプロパティの値を取得します。
                 * 
                 */
                int getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightQuadraticAttenuation {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * indexプロパティの値を取得します。
                 * 
                 */
                int getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0 0 0 0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightSpecular {


                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValues().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Double }
                 * 
                 * 
                 */
                List<Double> getValues();

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * indexプロパティの値を取得します。
                 * 
                 */
                int getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="180" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightSpotCutoff {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * indexプロパティの値を取得します。
                 * 
                 */
                int getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float3" default="0 0 -1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightSpotDirection {


                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValues().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Double }
                 * 
                 * 
                 */
                List<Double> getValues();

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * indexプロパティの値を取得します。
                 * 
                 */
                int getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightSpotExponent {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * indexプロパティの値を取得します。
                 * 
                 */
                int getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightingEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LineSmoothEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LineWidth {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_logic_op_type" default="COPY" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LogicOp {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlLogicOpType }
                 *     
                 */
                GlLogicOpType getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlLogicOpType }
                 *     
                 */
                void setValue(GlLogicOpType value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0.2 0.2 0.2 1.0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface MaterialAmbient {


                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValues().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Double }
                 * 
                 * 
                 */
                List<Double> getValues();

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0.8 0.8 0.8 1.0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface MaterialDiffuse {


                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValues().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Double }
                 * 
                 * 
                 */
                List<Double> getValues();

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0 0 0 1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface MaterialEmission {


                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValues().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Double }
                 * 
                 * 
                 */
                List<Double> getValues();

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface MaterialShininess {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0 0 0 1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface MaterialSpecular {


                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValues().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Double }
                 * 
                 * 
                 */
                List<Double> getValues();

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4x4" default="1 0 0 0 0 1 0 0 0 0 1 0 0 0 0 1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ModelViewMatrix {


                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValues().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Double }
                 * 
                 * 
                 */
                List<Double> getValues();

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface MultisampleEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface NormalizeEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float3" default="1 0 0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface PointDistanceAttenuation {


                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValues().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Double }
                 * 
                 * 
                 */
                List<Double> getValues();

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface PointFadeThresholdSize {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface PointSize {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface PointSizeMax {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface PointSizeMin {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface PointSmoothEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float2" default="0 0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface PolygonOffset {


                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValues().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Double }
                 * 
                 * 
                 */
                List<Double> getValues();

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface PolygonOffsetFillEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4x4" default="1 0 0 0 0 1 0 0 0 0 1 0 0 0 0 1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ProjectionMatrix {


                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValues().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Double }
                 * 
                 * 
                 */
                List<Double> getValues();

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface RescaleNormalEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface SampleAlphaToCoverageEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface SampleAlphaToOneEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface SampleCoverageEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}int4" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface Scissor {


                /**
                 * Gets the value of the values property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the values property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValues().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Long }
                 * 
                 * 
                 */
                List<Long> getValues();

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ScissorTestEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_shade_model_type" default="SMOOTH" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ShadeModel {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlShadeModelType }
                 *     
                 */
                GlShadeModelType getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlShadeModelType }
                 *     
                 */
                void setValue(GlShadeModelType value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *         &lt;element name="func">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_func_type" default="ALWAYS" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ref">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" default="0" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="mask">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" default="255" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface StencilFunc {


                /**
                 * funcプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLES.Technique.Pass.StencilFunc.Func }
                 *     
                 */
                ProfileGLES.Technique.Pass.StencilFunc.Func getFunc();

                /**
                 * funcプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLES.Technique.Pass.StencilFunc.Func }
                 *     
                 */
                void setFunc(ProfileGLES.Technique.Pass.StencilFunc.Func value);

                /**
                 * refプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLES.Technique.Pass.StencilFunc.Ref }
                 *     
                 */
                ProfileGLES.Technique.Pass.StencilFunc.Ref getRef();

                /**
                 * refプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLES.Technique.Pass.StencilFunc.Ref }
                 *     
                 */
                void setRef(ProfileGLES.Technique.Pass.StencilFunc.Ref value);

                /**
                 * maskプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLES.Technique.Pass.StencilFunc.Mask }
                 *     
                 */
                ProfileGLES.Technique.Pass.StencilFunc.Mask getMask();

                /**
                 * maskプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLES.Technique.Pass.StencilFunc.Mask }
                 *     
                 */
                void setMask(ProfileGLES.Technique.Pass.StencilFunc.Mask value);


                /**
                 * <p>anonymous complex typeのJavaクラス。
                 * 
                 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_func_type" default="ALWAYS" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Func {


                    /**
                     * valueプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlFuncType }
                     *     
                     */
                    GlFuncType getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlFuncType }
                     *     
                     */
                    void setValue(GlFuncType value);

                    /**
                     * paramプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getParam();

                    /**
                     * paramプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setParam(String value);

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
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" default="255" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Mask {


                    /**
                     * valueプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Short }
                     *     
                     */
                    short getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Short }
                     *     
                     */
                    void setValue(Short value);

                    /**
                     * paramプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getParam();

                    /**
                     * paramプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setParam(String value);

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
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" default="0" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Ref {


                    /**
                     * valueプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Short }
                     *     
                     */
                    short getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Short }
                     *     
                     */
                    void setValue(Short value);

                    /**
                     * paramプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getParam();

                    /**
                     * paramプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setParam(String value);

                }

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}int" default="4294967295" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface StencilMask {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                long getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                void setValue(Long value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *         &lt;element name="fail">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gles_stencil_op_type" default="KEEP" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="zfail">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gles_stencil_op_type" default="KEEP" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="zpass">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gles_stencil_op_type" default="KEEP" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface StencilOp {


                /**
                 * failプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLES.Technique.Pass.StencilOp.Fail }
                 *     
                 */
                ProfileGLES.Technique.Pass.StencilOp.Fail getFail();

                /**
                 * failプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLES.Technique.Pass.StencilOp.Fail }
                 *     
                 */
                void setFail(ProfileGLES.Technique.Pass.StencilOp.Fail value);

                /**
                 * zfailプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLES.Technique.Pass.StencilOp.Zfail }
                 *     
                 */
                ProfileGLES.Technique.Pass.StencilOp.Zfail getZfail();

                /**
                 * zfailプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLES.Technique.Pass.StencilOp.Zfail }
                 *     
                 */
                void setZfail(ProfileGLES.Technique.Pass.StencilOp.Zfail value);

                /**
                 * zpassプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLES.Technique.Pass.StencilOp.Zpass }
                 *     
                 */
                ProfileGLES.Technique.Pass.StencilOp.Zpass getZpass();

                /**
                 * zpassプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLES.Technique.Pass.StencilOp.Zpass }
                 *     
                 */
                void setZpass(ProfileGLES.Technique.Pass.StencilOp.Zpass value);


                /**
                 * <p>anonymous complex typeのJavaクラス。
                 * 
                 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gles_stencil_op_type" default="KEEP" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Fail {


                    /**
                     * valueプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlesStencilOpType }
                     *     
                     */
                    GlesStencilOpType getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlesStencilOpType }
                     *     
                     */
                    void setValue(GlesStencilOpType value);

                    /**
                     * paramプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getParam();

                    /**
                     * paramプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setParam(String value);

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
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gles_stencil_op_type" default="KEEP" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Zfail {


                    /**
                     * valueプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlesStencilOpType }
                     *     
                     */
                    GlesStencilOpType getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlesStencilOpType }
                     *     
                     */
                    void setValue(GlesStencilOpType value);

                    /**
                     * paramプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getParam();

                    /**
                     * paramプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setParam(String value);

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
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gles_stencil_op_type" default="KEEP" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Zpass {


                    /**
                     * valueプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlesStencilOpType }
                     *     
                     */
                    GlesStencilOpType getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlesStencilOpType }
                     *     
                     */
                    void setValue(GlesStencilOpType value);

                    /**
                     * paramプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getParam();

                    /**
                     * paramプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setParam(String value);

                }

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface StencilTestEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *         &lt;element name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gles_texture_pipeline" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface TexturePipeline {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlesTexturePipeline }
                 *     
                 */
                GlesTexturePipeline getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlesTexturePipeline }
                 *     
                 */
                void setValue(GlesTexturePipeline value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface TexturePipelineEnable {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * paramプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * paramプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

            }

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
         *         &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}gles_basic_type_common"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface Setparam {


            /**
             * Gets the value of the annotates property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the annotates property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAnnotates().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FxAnnotateCommon }
             * 
             * 
             */
            List<FxAnnotateCommon> getAnnotates();

            /**
             * enumプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            String getEnum();

            /**
             * enumプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            void setEnum(String value);

            /**
             * textureUnitプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link GlesTextureUnit }
             *     
             */
            GlesTextureUnit getTextureUnit();

            /**
             * textureUnitプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link GlesTextureUnit }
             *     
             */
            void setTextureUnit(GlesTextureUnit value);

            /**
             * samplerStateプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link GlesSamplerState }
             *     
             */
            GlesSamplerState getSamplerState();

            /**
             * samplerStateプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link GlesSamplerState }
             *     
             */
            void setSamplerState(GlesSamplerState value);

            /**
             * texturePipelineプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link GlesTexturePipeline }
             *     
             */
            GlesTexturePipeline getTexturePipeline();

            /**
             * texturePipelineプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link GlesTexturePipeline }
             *     
             */
            void setTexturePipeline(GlesTexturePipeline value);

            /**
             * surfaceプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link FxSurfaceCommon }
             *     
             */
            FxSurfaceCommon getSurface();

            /**
             * surfaceプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link FxSurfaceCommon }
             *     
             */
            void setSurface(FxSurfaceCommon value);

            /**
             * Gets the value of the float4X4 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float4X4 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat4X4().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat4X4();

            /**
             * Gets the value of the float4X3 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float4X3 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat4X3().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat4X3();

            /**
             * Gets the value of the float4X2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float4X2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat4X2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat4X2();

            /**
             * Gets the value of the float4X1 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float4X1 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat4X1().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat4X1();

            /**
             * Gets the value of the float3X4 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float3X4 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat3X4().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat3X4();

            /**
             * Gets the value of the float3X3 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float3X3 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat3X3().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat3X3();

            /**
             * Gets the value of the float3X2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float3X2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat3X2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat3X2();

            /**
             * Gets the value of the float3X1 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float3X1 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat3X1().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat3X1();

            /**
             * Gets the value of the float2X4 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float2X4 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat2X4().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat2X4();

            /**
             * Gets the value of the float2X3 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float2X3 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat2X3().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat2X3();

            /**
             * Gets the value of the float2X2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float2X2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat2X2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat2X2();

            /**
             * Gets the value of the float2X1 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float2X1 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat2X1().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat2X1();

            /**
             * Gets the value of the float1X4 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float1X4 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat1X4().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat1X4();

            /**
             * Gets the value of the float1X3 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float1X3 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat1X3().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat1X3();

            /**
             * Gets the value of the float1X2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float1X2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat1X2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat1X2();

            /**
             * float1X1プロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            Double getFloat1X1();

            /**
             * float1X1プロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            void setFloat1X1(Double value);

            /**
             * Gets the value of the float4 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float4 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat4().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat4();

            /**
             * Gets the value of the float3 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float3 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat3().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat3();

            /**
             * Gets the value of the float2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat2();

            /**
             * floatプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            Double getFloat();

            /**
             * floatプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            void setFloat(Double value);

            /**
             * Gets the value of the int4 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the int4 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInt4().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Long }
             * 
             * 
             */
            List<Long> getInt4();

            /**
             * Gets the value of the int3 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the int3 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInt3().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Long }
             * 
             * 
             */
            List<Long> getInt3();

            /**
             * Gets the value of the int2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the int2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInt2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Long }
             * 
             * 
             */
            List<Long> getInt2();

            /**
             * intプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            Long getInt();

            /**
             * intプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            void setInt(Long value);

            /**
             * Gets the value of the bool4 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bool4 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBool4().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Boolean }
             * 
             * 
             */
            List<Boolean> getBool4();

            /**
             * Gets the value of the bool3 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bool3 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBool3().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Boolean }
             * 
             * 
             */
            List<Boolean> getBool3();

            /**
             * Gets the value of the bool2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bool2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBool2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Boolean }
             * 
             * 
             */
            List<Boolean> getBool2();

            /**
             * boolプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            Boolean isBool();

            /**
             * boolプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            void setBool(Boolean value);

            /**
             * refプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            String getRef();

            /**
             * refプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            void setRef(String value);

        }

    }

}
