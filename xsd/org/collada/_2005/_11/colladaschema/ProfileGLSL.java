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
 *           &lt;element name="code" type="{http://www.collada.org/2005/11/COLLADASchema}fx_code_profile"/>
 *           &lt;element name="include" type="{http://www.collada.org/2005/11/COLLADASchema}fx_include_common"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}image"/>
 *           &lt;element name="newparam" type="{http://www.collada.org/2005/11/COLLADASchema}glsl_newparam"/>
 *         &lt;/choice>
 *         &lt;element name="technique" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="code" type="{http://www.collada.org/2005/11/COLLADASchema}fx_code_profile"/>
 *                     &lt;element name="include" type="{http://www.collada.org/2005/11/COLLADASchema}fx_include_common"/>
 *                   &lt;/choice>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}image"/>
 *                     &lt;element name="newparam" type="{http://www.collada.org/2005/11/COLLADASchema}glsl_newparam"/>
 *                     &lt;element name="setparam" type="{http://www.collada.org/2005/11/COLLADASchema}glsl_setparam"/>
 *                   &lt;/choice>
 *                   &lt;element name="pass" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="color_target" type="{http://www.collada.org/2005/11/COLLADASchema}fx_colortarget_common" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="depth_target" type="{http://www.collada.org/2005/11/COLLADASchema}fx_depthtarget_common" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="stencil_target" type="{http://www.collada.org/2005/11/COLLADASchema}fx_stenciltarget_common" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="color_clear" type="{http://www.collada.org/2005/11/COLLADASchema}fx_clearcolor_common" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="depth_clear" type="{http://www.collada.org/2005/11/COLLADASchema}fx_cleardepth_common" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="stencil_clear" type="{http://www.collada.org/2005/11/COLLADASchema}fx_clearstencil_common" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="draw" type="{http://www.collada.org/2005/11/COLLADASchema}fx_draw_common" minOccurs="0"/>
 *                             &lt;choice maxOccurs="unbounded">
 *                               &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}gl_pipeline_settings"/>
 *                               &lt;element name="shader">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
 *                                         &lt;sequence minOccurs="0">
 *                                           &lt;element name="compiler_target">
 *                                             &lt;complexType>
 *                                               &lt;simpleContent>
 *                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NMTOKEN">
 *                                                 &lt;/extension>
 *                                               &lt;/simpleContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                           &lt;element name="compiler_options" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                         &lt;/sequence>
 *                                         &lt;element name="name">
 *                                           &lt;complexType>
 *                                             &lt;simpleContent>
 *                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
 *                                                 &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                               &lt;/extension>
 *                                             &lt;/simpleContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="bind" maxOccurs="unbounded" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;choice>
 *                                                   &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}glsl_param_type"/>
 *                                                   &lt;element name="param">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                 &lt;/choice>
 *                                                 &lt;attribute name="symbol" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="stage" type="{http://www.collada.org/2005/11/COLLADASchema}glsl_pipeline_stage" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ProfileGLSL {


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
     * Gets the value of the codesAndIncludes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codesAndIncludes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodesAndIncludes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxCodeProfile }
     * {@link FxIncludeCommon }
     * 
     * 
     */
    List<Object> getCodesAndIncludes();

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
     * {@link GlslNewparam }
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
     * {@link ProfileGLSL.Technique }
     * 
     * 
     */
    List<ProfileGLSL.Technique> getTechniques();

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
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="code" type="{http://www.collada.org/2005/11/COLLADASchema}fx_code_profile"/>
     *           &lt;element name="include" type="{http://www.collada.org/2005/11/COLLADASchema}fx_include_common"/>
     *         &lt;/choice>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}image"/>
     *           &lt;element name="newparam" type="{http://www.collada.org/2005/11/COLLADASchema}glsl_newparam"/>
     *           &lt;element name="setparam" type="{http://www.collada.org/2005/11/COLLADASchema}glsl_setparam"/>
     *         &lt;/choice>
     *         &lt;element name="pass" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="color_target" type="{http://www.collada.org/2005/11/COLLADASchema}fx_colortarget_common" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="depth_target" type="{http://www.collada.org/2005/11/COLLADASchema}fx_depthtarget_common" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="stencil_target" type="{http://www.collada.org/2005/11/COLLADASchema}fx_stenciltarget_common" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="color_clear" type="{http://www.collada.org/2005/11/COLLADASchema}fx_clearcolor_common" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="depth_clear" type="{http://www.collada.org/2005/11/COLLADASchema}fx_cleardepth_common" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="stencil_clear" type="{http://www.collada.org/2005/11/COLLADASchema}fx_clearstencil_common" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="draw" type="{http://www.collada.org/2005/11/COLLADASchema}fx_draw_common" minOccurs="0"/>
     *                   &lt;choice maxOccurs="unbounded">
     *                     &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}gl_pipeline_settings"/>
     *                     &lt;element name="shader">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
     *                               &lt;sequence minOccurs="0">
     *                                 &lt;element name="compiler_target">
     *                                   &lt;complexType>
     *                                     &lt;simpleContent>
     *                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NMTOKEN">
     *                                       &lt;/extension>
     *                                     &lt;/simpleContent>
     *                                   &lt;/complexType>
     *                                 &lt;/element>
     *                                 &lt;element name="compiler_options" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                               &lt;/sequence>
     *                               &lt;element name="name">
     *                                 &lt;complexType>
     *                                   &lt;simpleContent>
     *                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
     *                                       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                     &lt;/extension>
     *                                   &lt;/simpleContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="bind" maxOccurs="unbounded" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;choice>
     *                                         &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}glsl_param_type"/>
     *                                         &lt;element name="param">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                       &lt;/choice>
     *                                       &lt;attribute name="symbol" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                             &lt;attribute name="stage" type="{http://www.collada.org/2005/11/COLLADASchema}glsl_pipeline_stage" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
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
         * Gets the value of the codesAndIncludes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the codesAndIncludes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCodesAndIncludes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FxCodeProfile }
         * {@link FxIncludeCommon }
         * 
         * 
         */
        List<Object> getCodesAndIncludes();

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
         * {@link GlslNewparam }
         * {@link GlslSetparam }
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
         * {@link ProfileGLSL.Technique.Pass }
         * 
         * 
         */
        List<ProfileGLSL.Technique.Pass> getPasses();

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
         *         &lt;element name="color_target" type="{http://www.collada.org/2005/11/COLLADASchema}fx_colortarget_common" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="depth_target" type="{http://www.collada.org/2005/11/COLLADASchema}fx_depthtarget_common" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="stencil_target" type="{http://www.collada.org/2005/11/COLLADASchema}fx_stenciltarget_common" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="color_clear" type="{http://www.collada.org/2005/11/COLLADASchema}fx_clearcolor_common" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="depth_clear" type="{http://www.collada.org/2005/11/COLLADASchema}fx_cleardepth_common" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="stencil_clear" type="{http://www.collada.org/2005/11/COLLADASchema}fx_clearstencil_common" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="draw" type="{http://www.collada.org/2005/11/COLLADASchema}fx_draw_common" minOccurs="0"/>
         *         &lt;choice maxOccurs="unbounded">
         *           &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}gl_pipeline_settings"/>
         *           &lt;element name="shader">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
         *                     &lt;sequence minOccurs="0">
         *                       &lt;element name="compiler_target">
         *                         &lt;complexType>
         *                           &lt;simpleContent>
         *                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NMTOKEN">
         *                             &lt;/extension>
         *                           &lt;/simpleContent>
         *                         &lt;/complexType>
         *                       &lt;/element>
         *                       &lt;element name="compiler_options" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                     &lt;/sequence>
         *                     &lt;element name="name">
         *                       &lt;complexType>
         *                         &lt;simpleContent>
         *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
         *                             &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                           &lt;/extension>
         *                         &lt;/simpleContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="bind" maxOccurs="unbounded" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;choice>
         *                               &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}glsl_param_type"/>
         *                               &lt;element name="param">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                             &lt;/choice>
         *                             &lt;attribute name="symbol" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/sequence>
         *                   &lt;attribute name="stage" type="{http://www.collada.org/2005/11/COLLADASchema}glsl_pipeline_stage" />
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
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
             * Gets the value of the colorTargets property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the colorTargets property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getColorTargets().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FxColortargetCommon }
             * 
             * 
             */
            List<FxColortargetCommon> getColorTargets();

            /**
             * Gets the value of the depthTargets property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the depthTargets property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDepthTargets().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FxDepthtargetCommon }
             * 
             * 
             */
            List<FxDepthtargetCommon> getDepthTargets();

            /**
             * Gets the value of the stencilTargets property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the stencilTargets property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStencilTargets().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FxStenciltargetCommon }
             * 
             * 
             */
            List<FxStenciltargetCommon> getStencilTargets();

            /**
             * Gets the value of the colorClears property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the colorClears property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getColorClears().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FxClearcolorCommon }
             * 
             * 
             */
            List<FxClearcolorCommon> getColorClears();

            /**
             * Gets the value of the depthClears property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the depthClears property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDepthClears().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FxCleardepthCommon }
             * 
             * 
             */
            List<FxCleardepthCommon> getDepthClears();

            /**
             * Gets the value of the stencilClears property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the stencilClears property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStencilClears().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FxClearstencilCommon }
             * 
             * 
             */
            List<FxClearstencilCommon> getStencilClears();

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
             * Gets the value of the alphaFuncsAndBlendFuncsAndBlendFuncSeparates property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the alphaFuncsAndBlendFuncsAndBlendFuncSeparates property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAlphaFuncsAndBlendFuncsAndBlendFuncSeparates().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.AlphaFunc }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.BlendFunc }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.BlendFuncSeparate }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.BlendEquation }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.BlendEquationSeparate }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.ColorMaterial }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.CullFace }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.DepthFunc }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.FogMode }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.FogCoordSrc }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.FrontFace }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LightModelColorControl }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LogicOp }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.PolygonMode }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.ShadeModel }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.StencilFunc }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.StencilOp }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.StencilFuncSeparate }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.StencilOpSeparate }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.StencilMaskSeparate }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LightEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LightAmbient }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LightDiffuse }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LightSpecular }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LightPosition }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LightConstantAttenuation }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LightLinearAttenuation }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LightQuadraticAttenuation }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LightSpotCutoff }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LightSpotDirection }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LightSpotExponent }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.Texture1D }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.Texture2D }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.Texture3D }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.TextureCUBE }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.TextureRECT }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.TextureDEPTH }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.Texture1DEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.Texture2DEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.Texture3DEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.TextureCUBEEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.TextureRECTEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.TextureDEPTHEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.TextureEnvColor }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.TextureEnvMode }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.ClipPlane }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.ClipPlaneEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.BlendColor }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.ClearColor }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.ClearStencil }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.ClearDepth }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.ColorMask }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.DepthBounds }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.DepthMask }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.DepthRange }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.FogDensity }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.FogStart }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.FogEnd }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.FogColor }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LightModelAmbient }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LightingEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LineStipple }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LineWidth }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.MaterialAmbient }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.MaterialDiffuse }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.MaterialEmission }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.MaterialShininess }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.MaterialSpecular }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.ModelViewMatrix }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.PointDistanceAttenuation }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.PointFadeThresholdSize }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.PointSize }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.PointSizeMin }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.PointSizeMax }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.PolygonOffset }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.ProjectionMatrix }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.Scissor }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.StencilMask }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.AlphaTestEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.AutoNormalEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.BlendEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.ColorLogicOpEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.ColorMaterialEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.CullFaceEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.DepthBoundsEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.DepthClampEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.DepthTestEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.DitherEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.FogEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LightModelLocalViewerEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LightModelTwoSideEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LineSmoothEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LineStippleEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.LogicOpEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.MultisampleEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.NormalizeEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.PointSmoothEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.PolygonOffsetFillEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.PolygonOffsetLineEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.PolygonOffsetPointEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.PolygonSmoothEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.PolygonStippleEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.RescaleNormalEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.SampleAlphaToCoverageEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.SampleAlphaToOneEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.SampleCoverageEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.ScissorTestEnable }
             * {@link org.collada._2005._11.colladaschema.ProfileCG.Technique.Pass.StencilTestEnable }
             * {@link Object }
             * {@link ProfileGLSL.Technique.Pass.Shader }
             * 
             * 
             */
            List<Object> getAlphaFuncsAndBlendFuncsAndBlendFuncSeparates();

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
             *         &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;sequence minOccurs="0">
             *           &lt;element name="compiler_target">
             *             &lt;complexType>
             *               &lt;simpleContent>
             *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NMTOKEN">
             *                 &lt;/extension>
             *               &lt;/simpleContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="compiler_options" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;/sequence>
             *         &lt;element name="name">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
             *                 &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="bind" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}glsl_param_type"/>
             *                   &lt;element name="param">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/choice>
             *                 &lt;attribute name="symbol" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="stage" type="{http://www.collada.org/2005/11/COLLADASchema}glsl_pipeline_stage" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface Shader {


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
                 * compilerTargetプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLSL.Technique.Pass.Shader.CompilerTarget }
                 *     
                 */
                ProfileGLSL.Technique.Pass.Shader.CompilerTarget getCompilerTarget();

                /**
                 * compilerTargetプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLSL.Technique.Pass.Shader.CompilerTarget }
                 *     
                 */
                void setCompilerTarget(ProfileGLSL.Technique.Pass.Shader.CompilerTarget value);

                /**
                 * compilerOptionsプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getCompilerOptions();

                /**
                 * compilerOptionsプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setCompilerOptions(String value);

                /**
                 * nameプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLSL.Technique.Pass.Shader.Name }
                 *     
                 */
                ProfileGLSL.Technique.Pass.Shader.Name getName();

                /**
                 * nameプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLSL.Technique.Pass.Shader.Name }
                 *     
                 */
                void setName(ProfileGLSL.Technique.Pass.Shader.Name value);

                /**
                 * Gets the value of the binds property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the binds property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBinds().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ProfileGLSL.Technique.Pass.Shader.Bind }
                 * 
                 * 
                 */
                List<ProfileGLSL.Technique.Pass.Shader.Bind> getBinds();

                /**
                 * stageプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlslPipelineStage }
                 *     
                 */
                GlslPipelineStage getStage();

                /**
                 * stageプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlslPipelineStage }
                 *     
                 */
                void setStage(GlslPipelineStage value);


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
                 *         &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}glsl_param_type"/>
                 *         &lt;element name="param">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/choice>
                 *       &lt;attribute name="symbol" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Bind {


                    /**
                     * paramプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link ProfileGLSL.Technique.Pass.Shader.Bind.Param }
                     *     
                     */
                    ProfileGLSL.Technique.Pass.Shader.Bind.Param getParam();

                    /**
                     * paramプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ProfileGLSL.Technique.Pass.Shader.Bind.Param }
                     *     
                     */
                    void setParam(ProfileGLSL.Technique.Pass.Shader.Bind.Param value);

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
                     * samplerDEPTHプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlSamplerDEPTH }
                     *     
                     */
                    GlSamplerDEPTH getSamplerDEPTH();

                    /**
                     * samplerDEPTHプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlSamplerDEPTH }
                     *     
                     */
                    void setSamplerDEPTH(GlSamplerDEPTH value);

                    /**
                     * samplerRECTプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlSamplerRECT }
                     *     
                     */
                    GlSamplerRECT getSamplerRECT();

                    /**
                     * samplerRECTプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlSamplerRECT }
                     *     
                     */
                    void setSamplerRECT(GlSamplerRECT value);

                    /**
                     * samplerCUBEプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlSamplerCUBE }
                     *     
                     */
                    GlSamplerCUBE getSamplerCUBE();

                    /**
                     * samplerCUBEプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlSamplerCUBE }
                     *     
                     */
                    void setSamplerCUBE(GlSamplerCUBE value);

                    /**
                     * sampler3Dプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlSampler3D }
                     *     
                     */
                    GlSampler3D getSampler3D();

                    /**
                     * sampler3Dプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlSampler3D }
                     *     
                     */
                    void setSampler3D(GlSampler3D value);

                    /**
                     * sampler2Dプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlSampler2D }
                     *     
                     */
                    GlSampler2D getSampler2D();

                    /**
                     * sampler2Dプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlSampler2D }
                     *     
                     */
                    void setSampler2D(GlSampler2D value);

                    /**
                     * sampler1Dプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlSampler1D }
                     *     
                     */
                    GlSampler1D getSampler1D();

                    /**
                     * sampler1Dプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlSampler1D }
                     *     
                     */
                    void setSampler1D(GlSampler1D value);

                    /**
                     * surfaceプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlslSurfaceType }
                     *     
                     */
                    GlslSurfaceType getSurface();

                    /**
                     * surfaceプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlslSurfaceType }
                     *     
                     */
                    void setSurface(GlslSurfaceType value);

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
                     * {@link Integer }
                     * 
                     * 
                     */
                    List<Integer> getInt4();

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
                     * {@link Integer }
                     * 
                     * 
                     */
                    List<Integer> getInt3();

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
                     * {@link Integer }
                     * 
                     * 
                     */
                    List<Integer> getInt2();

                    /**
                     * intプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    Integer getInt();

                    /**
                     * intプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    void setInt(Integer value);

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
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFloat4X4();

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
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFloat3X3();

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
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFloat2X2();

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
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFloat4();

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
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFloat3();

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
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFloat2();

                    /**
                     * floatプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Float }
                     *     
                     */
                    Float getFloat();

                    /**
                     * floatプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Float }
                     *     
                     */
                    void setFloat(Float value);

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
                     * symbolプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getSymbol();

                    /**
                     * symbolプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setSymbol(String value);


                    /**
                     * <p>anonymous complex typeのJavaクラス。
                     * 
                     * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    public interface Param {


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


                /**
                 * <p>anonymous complex typeのJavaクラス。
                 * 
                 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NMTOKEN">
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface CompilerTarget {


                    /**
                     * valueプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setValue(String value);

                }


                /**
                 * <p>anonymous complex typeのJavaクラス。
                 * 
                 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
                 *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Name {


                    /**
                     * valueプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setValue(String value);

                    /**
                     * sourceプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getSource();

                    /**
                     * sourceプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setSource(String value);

                }

            }

        }

    }

}
