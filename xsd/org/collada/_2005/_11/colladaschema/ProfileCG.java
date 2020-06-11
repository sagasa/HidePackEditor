//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;

import java.math.BigInteger;
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
 *           &lt;element name="newparam" type="{http://www.collada.org/2005/11/COLLADASchema}cg_newparam"/>
 *         &lt;/choice>
 *         &lt;element name="technique" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}asset" minOccurs="0"/>
 *                   &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="code" type="{http://www.collada.org/2005/11/COLLADASchema}fx_code_profile"/>
 *                     &lt;element name="include" type="{http://www.collada.org/2005/11/COLLADASchema}fx_include_common"/>
 *                   &lt;/choice>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}image"/>
 *                     &lt;element name="newparam" type="{http://www.collada.org/2005/11/COLLADASchema}cg_newparam"/>
 *                     &lt;element name="setparam" type="{http://www.collada.org/2005/11/COLLADASchema}cg_setparam"/>
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
 *                                                   &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}cg_param_type"/>
 *                                                   &lt;element name="param">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
 *                                       &lt;attribute name="stage" type="{http://www.collada.org/2005/11/COLLADASchema}cg_pipeline_stage" />
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
 *       &lt;attribute name="platform" type="{http://www.w3.org/2001/XMLSchema}NCName" default="PC" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ProfileCG {


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
     * {@link CgNewparam }
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
     * {@link ProfileCG.Technique }
     * 
     * 
     */
    List<ProfileCG.Technique> getTechniques();

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
     *           &lt;element name="code" type="{http://www.collada.org/2005/11/COLLADASchema}fx_code_profile"/>
     *           &lt;element name="include" type="{http://www.collada.org/2005/11/COLLADASchema}fx_include_common"/>
     *         &lt;/choice>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}image"/>
     *           &lt;element name="newparam" type="{http://www.collada.org/2005/11/COLLADASchema}cg_newparam"/>
     *           &lt;element name="setparam" type="{http://www.collada.org/2005/11/COLLADASchema}cg_setparam"/>
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
     *                                         &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}cg_param_type"/>
     *                                         &lt;element name="param">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
     *                             &lt;attribute name="stage" type="{http://www.collada.org/2005/11/COLLADASchema}cg_pipeline_stage" />
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
         * 
         * 									The technique element may contain an asset element.
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
         * {@link CgNewparam }
         * {@link CgSetparam }
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
         * {@link ProfileCG.Technique.Pass }
         * 
         * 
         */
        List<ProfileCG.Technique.Pass> getPasses();

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
         *                               &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}cg_param_type"/>
         *                               &lt;element name="param">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
         *                   &lt;attribute name="stage" type="{http://www.collada.org/2005/11/COLLADASchema}cg_pipeline_stage" />
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
             * {@link ProfileCG.Technique.Pass.AlphaFunc }
             * {@link ProfileCG.Technique.Pass.BlendFunc }
             * {@link ProfileCG.Technique.Pass.BlendFuncSeparate }
             * {@link ProfileCG.Technique.Pass.BlendEquation }
             * {@link ProfileCG.Technique.Pass.BlendEquationSeparate }
             * {@link ProfileCG.Technique.Pass.ColorMaterial }
             * {@link ProfileCG.Technique.Pass.CullFace }
             * {@link ProfileCG.Technique.Pass.DepthFunc }
             * {@link ProfileCG.Technique.Pass.FogMode }
             * {@link ProfileCG.Technique.Pass.FogCoordSrc }
             * {@link ProfileCG.Technique.Pass.FrontFace }
             * {@link ProfileCG.Technique.Pass.LightModelColorControl }
             * {@link ProfileCG.Technique.Pass.LogicOp }
             * {@link ProfileCG.Technique.Pass.PolygonMode }
             * {@link ProfileCG.Technique.Pass.ShadeModel }
             * {@link ProfileCG.Technique.Pass.StencilFunc }
             * {@link ProfileCG.Technique.Pass.StencilOp }
             * {@link ProfileCG.Technique.Pass.StencilFuncSeparate }
             * {@link ProfileCG.Technique.Pass.StencilOpSeparate }
             * {@link ProfileCG.Technique.Pass.StencilMaskSeparate }
             * {@link ProfileCG.Technique.Pass.LightEnable }
             * {@link ProfileCG.Technique.Pass.LightAmbient }
             * {@link ProfileCG.Technique.Pass.LightDiffuse }
             * {@link ProfileCG.Technique.Pass.LightSpecular }
             * {@link ProfileCG.Technique.Pass.LightPosition }
             * {@link ProfileCG.Technique.Pass.LightConstantAttenuation }
             * {@link ProfileCG.Technique.Pass.LightLinearAttenuation }
             * {@link ProfileCG.Technique.Pass.LightQuadraticAttenuation }
             * {@link ProfileCG.Technique.Pass.LightSpotCutoff }
             * {@link ProfileCG.Technique.Pass.LightSpotDirection }
             * {@link ProfileCG.Technique.Pass.LightSpotExponent }
             * {@link ProfileCG.Technique.Pass.Texture1D }
             * {@link ProfileCG.Technique.Pass.Texture2D }
             * {@link ProfileCG.Technique.Pass.Texture3D }
             * {@link ProfileCG.Technique.Pass.TextureCUBE }
             * {@link ProfileCG.Technique.Pass.TextureRECT }
             * {@link ProfileCG.Technique.Pass.TextureDEPTH }
             * {@link ProfileCG.Technique.Pass.Texture1DEnable }
             * {@link ProfileCG.Technique.Pass.Texture2DEnable }
             * {@link ProfileCG.Technique.Pass.Texture3DEnable }
             * {@link ProfileCG.Technique.Pass.TextureCUBEEnable }
             * {@link ProfileCG.Technique.Pass.TextureRECTEnable }
             * {@link ProfileCG.Technique.Pass.TextureDEPTHEnable }
             * {@link ProfileCG.Technique.Pass.TextureEnvColor }
             * {@link ProfileCG.Technique.Pass.TextureEnvMode }
             * {@link ProfileCG.Technique.Pass.ClipPlane }
             * {@link ProfileCG.Technique.Pass.ClipPlaneEnable }
             * {@link ProfileCG.Technique.Pass.BlendColor }
             * {@link ProfileCG.Technique.Pass.ClearColor }
             * {@link ProfileCG.Technique.Pass.ClearStencil }
             * {@link ProfileCG.Technique.Pass.ClearDepth }
             * {@link ProfileCG.Technique.Pass.ColorMask }
             * {@link ProfileCG.Technique.Pass.DepthBounds }
             * {@link ProfileCG.Technique.Pass.DepthMask }
             * {@link ProfileCG.Technique.Pass.DepthRange }
             * {@link ProfileCG.Technique.Pass.FogDensity }
             * {@link ProfileCG.Technique.Pass.FogStart }
             * {@link ProfileCG.Technique.Pass.FogEnd }
             * {@link ProfileCG.Technique.Pass.FogColor }
             * {@link ProfileCG.Technique.Pass.LightModelAmbient }
             * {@link ProfileCG.Technique.Pass.LightingEnable }
             * {@link ProfileCG.Technique.Pass.LineStipple }
             * {@link ProfileCG.Technique.Pass.LineWidth }
             * {@link ProfileCG.Technique.Pass.MaterialAmbient }
             * {@link ProfileCG.Technique.Pass.MaterialDiffuse }
             * {@link ProfileCG.Technique.Pass.MaterialEmission }
             * {@link ProfileCG.Technique.Pass.MaterialShininess }
             * {@link ProfileCG.Technique.Pass.MaterialSpecular }
             * {@link ProfileCG.Technique.Pass.ModelViewMatrix }
             * {@link ProfileCG.Technique.Pass.PointDistanceAttenuation }
             * {@link ProfileCG.Technique.Pass.PointFadeThresholdSize }
             * {@link ProfileCG.Technique.Pass.PointSize }
             * {@link ProfileCG.Technique.Pass.PointSizeMin }
             * {@link ProfileCG.Technique.Pass.PointSizeMax }
             * {@link ProfileCG.Technique.Pass.PolygonOffset }
             * {@link ProfileCG.Technique.Pass.ProjectionMatrix }
             * {@link ProfileCG.Technique.Pass.Scissor }
             * {@link ProfileCG.Technique.Pass.StencilMask }
             * {@link ProfileCG.Technique.Pass.AlphaTestEnable }
             * {@link ProfileCG.Technique.Pass.AutoNormalEnable }
             * {@link ProfileCG.Technique.Pass.BlendEnable }
             * {@link ProfileCG.Technique.Pass.ColorLogicOpEnable }
             * {@link ProfileCG.Technique.Pass.ColorMaterialEnable }
             * {@link ProfileCG.Technique.Pass.CullFaceEnable }
             * {@link ProfileCG.Technique.Pass.DepthBoundsEnable }
             * {@link ProfileCG.Technique.Pass.DepthClampEnable }
             * {@link ProfileCG.Technique.Pass.DepthTestEnable }
             * {@link ProfileCG.Technique.Pass.DitherEnable }
             * {@link ProfileCG.Technique.Pass.FogEnable }
             * {@link ProfileCG.Technique.Pass.LightModelLocalViewerEnable }
             * {@link ProfileCG.Technique.Pass.LightModelTwoSideEnable }
             * {@link ProfileCG.Technique.Pass.LineSmoothEnable }
             * {@link ProfileCG.Technique.Pass.LineStippleEnable }
             * {@link ProfileCG.Technique.Pass.LogicOpEnable }
             * {@link ProfileCG.Technique.Pass.MultisampleEnable }
             * {@link ProfileCG.Technique.Pass.NormalizeEnable }
             * {@link ProfileCG.Technique.Pass.PointSmoothEnable }
             * {@link ProfileCG.Technique.Pass.PolygonOffsetFillEnable }
             * {@link ProfileCG.Technique.Pass.PolygonOffsetLineEnable }
             * {@link ProfileCG.Technique.Pass.PolygonOffsetPointEnable }
             * {@link ProfileCG.Technique.Pass.PolygonSmoothEnable }
             * {@link ProfileCG.Technique.Pass.PolygonStippleEnable }
             * {@link ProfileCG.Technique.Pass.RescaleNormalEnable }
             * {@link ProfileCG.Technique.Pass.SampleAlphaToCoverageEnable }
             * {@link ProfileCG.Technique.Pass.SampleAlphaToOneEnable }
             * {@link ProfileCG.Technique.Pass.SampleCoverageEnable }
             * {@link ProfileCG.Technique.Pass.ScissorTestEnable }
             * {@link ProfileCG.Technique.Pass.StencilTestEnable }
             * {@link Object }
             * {@link ProfileCG.Technique.Pass.Shader }
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
                 *     {@link ProfileCG.Technique.Pass.AlphaFunc.Func }
                 *     
                 */
                ProfileCG.Technique.Pass.AlphaFunc.Func getFunc();

                /**
                 * funcプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.AlphaFunc.Func }
                 *     
                 */
                void setFunc(ProfileCG.Technique.Pass.AlphaFunc.Func value);

                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.AlphaFunc.Value }
                 *     
                 */
                ProfileCG.Technique.Pass.AlphaFunc.Value getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.AlphaFunc.Value }
                 *     
                 */
                void setValue(ProfileCG.Technique.Pass.AlphaFunc.Value value);


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
            public interface AutoNormalEnable {


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
            public interface BlendColor {


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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_blend_equation_type" default="FUNC_ADD" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface BlendEquation {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlBlendEquationType }
                 *     
                 */
                GlBlendEquationType getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlBlendEquationType }
                 *     
                 */
                void setValue(GlBlendEquationType value);

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
             *         &lt;element name="rgb">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_blend_equation_type" default="FUNC_ADD" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="alpha">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_blend_equation_type" default="FUNC_ADD" />
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
            public interface BlendEquationSeparate {


                /**
                 * rgbプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.BlendEquationSeparate.Rgb }
                 *     
                 */
                ProfileCG.Technique.Pass.BlendEquationSeparate.Rgb getRgb();

                /**
                 * rgbプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.BlendEquationSeparate.Rgb }
                 *     
                 */
                void setRgb(ProfileCG.Technique.Pass.BlendEquationSeparate.Rgb value);

                /**
                 * alphaプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.BlendEquationSeparate.Alpha }
                 *     
                 */
                ProfileCG.Technique.Pass.BlendEquationSeparate.Alpha getAlpha();

                /**
                 * alphaプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.BlendEquationSeparate.Alpha }
                 *     
                 */
                void setAlpha(ProfileCG.Technique.Pass.BlendEquationSeparate.Alpha value);


                /**
                 * <p>anonymous complex typeのJavaクラス。
                 * 
                 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_blend_equation_type" default="FUNC_ADD" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Alpha {


                    /**
                     * valueプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlBlendEquationType }
                     *     
                     */
                    GlBlendEquationType getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlBlendEquationType }
                     *     
                     */
                    void setValue(GlBlendEquationType value);

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
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_blend_equation_type" default="FUNC_ADD" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Rgb {


                    /**
                     * valueプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlBlendEquationType }
                     *     
                     */
                    GlBlendEquationType getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlBlendEquationType }
                     *     
                     */
                    void setValue(GlBlendEquationType value);

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
                 *     {@link ProfileCG.Technique.Pass.BlendFunc.Src }
                 *     
                 */
                ProfileCG.Technique.Pass.BlendFunc.Src getSrc();

                /**
                 * srcプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.BlendFunc.Src }
                 *     
                 */
                void setSrc(ProfileCG.Technique.Pass.BlendFunc.Src value);

                /**
                 * destプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.BlendFunc.Dest }
                 *     
                 */
                ProfileCG.Technique.Pass.BlendFunc.Dest getDest();

                /**
                 * destプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.BlendFunc.Dest }
                 *     
                 */
                void setDest(ProfileCG.Technique.Pass.BlendFunc.Dest value);


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
             *       &lt;sequence>
             *         &lt;element name="src_rgb">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_blend_type" default="ONE" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="dest_rgb">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_blend_type" default="ZERO" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="src_alpha">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_blend_type" default="ONE" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="dest_alpha">
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
            public interface BlendFuncSeparate {


                /**
                 * srcRgbプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.BlendFuncSeparate.SrcRgb }
                 *     
                 */
                ProfileCG.Technique.Pass.BlendFuncSeparate.SrcRgb getSrcRgb();

                /**
                 * srcRgbプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.BlendFuncSeparate.SrcRgb }
                 *     
                 */
                void setSrcRgb(ProfileCG.Technique.Pass.BlendFuncSeparate.SrcRgb value);

                /**
                 * destRgbプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.BlendFuncSeparate.DestRgb }
                 *     
                 */
                ProfileCG.Technique.Pass.BlendFuncSeparate.DestRgb getDestRgb();

                /**
                 * destRgbプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.BlendFuncSeparate.DestRgb }
                 *     
                 */
                void setDestRgb(ProfileCG.Technique.Pass.BlendFuncSeparate.DestRgb value);

                /**
                 * srcAlphaプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.BlendFuncSeparate.SrcAlpha }
                 *     
                 */
                ProfileCG.Technique.Pass.BlendFuncSeparate.SrcAlpha getSrcAlpha();

                /**
                 * srcAlphaプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.BlendFuncSeparate.SrcAlpha }
                 *     
                 */
                void setSrcAlpha(ProfileCG.Technique.Pass.BlendFuncSeparate.SrcAlpha value);

                /**
                 * destAlphaプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.BlendFuncSeparate.DestAlpha }
                 *     
                 */
                ProfileCG.Technique.Pass.BlendFuncSeparate.DestAlpha getDestAlpha();

                /**
                 * destAlphaプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.BlendFuncSeparate.DestAlpha }
                 *     
                 */
                void setDestAlpha(ProfileCG.Technique.Pass.BlendFuncSeparate.DestAlpha value);


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
                public interface DestAlpha {


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
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_blend_type" default="ZERO" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface DestRgb {


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
                public interface SrcAlpha {


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
                public interface SrcRgb {


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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0 0 0 0" />
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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="1" />
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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}int" default="0" />
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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0 0 0 0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_CLIP_PLANES_index" />
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
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="index" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_CLIP_PLANES_index" />
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
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool4" default="true true true true" />
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
             *       &lt;sequence>
             *         &lt;element name="face">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_face_type" default="FRONT_AND_BACK" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="mode">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_material_type" default="AMBIENT_AND_DIFFUSE" />
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
            public interface ColorMaterial {


                /**
                 * faceプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.ColorMaterial.Face }
                 *     
                 */
                ProfileCG.Technique.Pass.ColorMaterial.Face getFace();

                /**
                 * faceプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.ColorMaterial.Face }
                 *     
                 */
                void setFace(ProfileCG.Technique.Pass.ColorMaterial.Face value);

                /**
                 * modeプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.ColorMaterial.Mode }
                 *     
                 */
                ProfileCG.Technique.Pass.ColorMaterial.Mode getMode();

                /**
                 * modeプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.ColorMaterial.Mode }
                 *     
                 */
                void setMode(ProfileCG.Technique.Pass.ColorMaterial.Mode value);


                /**
                 * <p>anonymous complex typeのJavaクラス。
                 * 
                 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_face_type" default="FRONT_AND_BACK" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Face {


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
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_material_type" default="AMBIENT_AND_DIFFUSE" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Mode {


                    /**
                     * valueプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlMaterialType }
                     *     
                     */
                    GlMaterialType getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlMaterialType }
                     *     
                     */
                    void setValue(GlMaterialType value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float2" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface DepthBounds {


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
            public interface DepthBoundsEnable {


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
            public interface DepthClampEnable {


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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="true" />
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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="true" />
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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_fog_coord_src_type" default="FOG_COORDINATE" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface FogCoordSrc {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlFogCoordSrcType }
                 *     
                 */
                GlFogCoordSrcType getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlFogCoordSrcType }
                 *     
                 */
                void setValue(GlFogCoordSrcType value);

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
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_LIGHTS_index" />
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
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_LIGHTS_index" />
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
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_LIGHTS_index" />
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
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_LIGHTS_index" />
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
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightLinearAttenuation {


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
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_light_model_color_control_type" default="SINGLE_COLOR" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightModelColorControl {


                /**
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlLightModelColorControlType }
                 *     
                 */
                GlLightModelColorControlType getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlLightModelColorControlType }
                 *     
                 */
                void setValue(GlLightModelColorControlType value);

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
            public interface LightModelLocalViewerEnable {


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
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_LIGHTS_index" />
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
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_LIGHTS_index" />
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
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_LIGHTS_index" />
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
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_LIGHTS_index" />
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
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_LIGHTS_index" />
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
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_LIGHTS_index" />
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
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}int2" default="1 65536" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LineStipple {


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
            public interface LineStippleEnable {


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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LogicOpEnable {


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
             *       &lt;sequence>
             *         &lt;element name="face">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_face_type" default="FRONT_AND_BACK" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="mode">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_polygon_mode_type" default="FILL" />
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
            public interface PolygonMode {


                /**
                 * faceプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.PolygonMode.Face }
                 *     
                 */
                ProfileCG.Technique.Pass.PolygonMode.Face getFace();

                /**
                 * faceプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.PolygonMode.Face }
                 *     
                 */
                void setFace(ProfileCG.Technique.Pass.PolygonMode.Face value);

                /**
                 * modeプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.PolygonMode.Mode }
                 *     
                 */
                ProfileCG.Technique.Pass.PolygonMode.Mode getMode();

                /**
                 * modeプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.PolygonMode.Mode }
                 *     
                 */
                void setMode(ProfileCG.Technique.Pass.PolygonMode.Mode value);


                /**
                 * <p>anonymous complex typeのJavaクラス。
                 * 
                 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_face_type" default="FRONT_AND_BACK" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Face {


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
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_polygon_mode_type" default="FILL" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Mode {


                    /**
                     * valueプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlPolygonModeType }
                     *     
                     */
                    GlPolygonModeType getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlPolygonModeType }
                     *     
                     */
                    void setValue(GlPolygonModeType value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface PolygonOffsetLineEnable {


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
            public interface PolygonOffsetPointEnable {


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
            public interface PolygonSmoothEnable {


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
            public interface PolygonStippleEnable {


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
             *                   &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}cg_param_type"/>
             *                   &lt;element name="param">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
             *       &lt;attribute name="stage" type="{http://www.collada.org/2005/11/COLLADASchema}cg_pipeline_stage" />
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
                 *     {@link ProfileCG.Technique.Pass.Shader.CompilerTarget }
                 *     
                 */
                ProfileCG.Technique.Pass.Shader.CompilerTarget getCompilerTarget();

                /**
                 * compilerTargetプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.Shader.CompilerTarget }
                 *     
                 */
                void setCompilerTarget(ProfileCG.Technique.Pass.Shader.CompilerTarget value);

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
                 *     {@link ProfileCG.Technique.Pass.Shader.Name }
                 *     
                 */
                ProfileCG.Technique.Pass.Shader.Name getName();

                /**
                 * nameプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.Shader.Name }
                 *     
                 */
                void setName(ProfileCG.Technique.Pass.Shader.Name value);

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
                 * {@link ProfileCG.Technique.Pass.Shader.Bind }
                 * 
                 * 
                 */
                List<ProfileCG.Technique.Pass.Shader.Bind> getBinds();

                /**
                 * stageプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link CgPipelineStage }
                 *     
                 */
                CgPipelineStage getStage();

                /**
                 * stageプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CgPipelineStage }
                 *     
                 */
                void setStage(CgPipelineStage value);


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
                 *         &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}cg_param_type"/>
                 *         &lt;element name="param">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
                     *     {@link ProfileCG.Technique.Pass.Shader.Bind.Param }
                     *     
                     */
                    ProfileCG.Technique.Pass.Shader.Bind.Param getParam();

                    /**
                     * paramプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ProfileCG.Technique.Pass.Shader.Bind.Param }
                     *     
                     */
                    void setParam(ProfileCG.Technique.Pass.Shader.Bind.Param value);

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
                     * stringプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getString();

                    /**
                     * stringプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setString(String value);

                    /**
                     * samplerDEPTHプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link CgSamplerDEPTH }
                     *     
                     */
                    CgSamplerDEPTH getSamplerDEPTH();

                    /**
                     * samplerDEPTHプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CgSamplerDEPTH }
                     *     
                     */
                    void setSamplerDEPTH(CgSamplerDEPTH value);

                    /**
                     * samplerCUBEプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link CgSamplerCUBE }
                     *     
                     */
                    CgSamplerCUBE getSamplerCUBE();

                    /**
                     * samplerCUBEプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CgSamplerCUBE }
                     *     
                     */
                    void setSamplerCUBE(CgSamplerCUBE value);

                    /**
                     * samplerRECTプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link CgSamplerRECT }
                     *     
                     */
                    CgSamplerRECT getSamplerRECT();

                    /**
                     * samplerRECTプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CgSamplerRECT }
                     *     
                     */
                    void setSamplerRECT(CgSamplerRECT value);

                    /**
                     * sampler3Dプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link CgSampler3D }
                     *     
                     */
                    CgSampler3D getSampler3D();

                    /**
                     * sampler3Dプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CgSampler3D }
                     *     
                     */
                    void setSampler3D(CgSampler3D value);

                    /**
                     * sampler2Dプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link CgSampler2D }
                     *     
                     */
                    CgSampler2D getSampler2D();

                    /**
                     * sampler2Dプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CgSampler2D }
                     *     
                     */
                    void setSampler2D(CgSampler2D value);

                    /**
                     * sampler1Dプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link CgSampler1D }
                     *     
                     */
                    CgSampler1D getSampler1D();

                    /**
                     * sampler1Dプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CgSampler1D }
                     *     
                     */
                    void setSampler1D(CgSampler1D value);

                    /**
                     * surfaceプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link CgSurfaceType }
                     *     
                     */
                    CgSurfaceType getSurface();

                    /**
                     * surfaceプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CgSurfaceType }
                     *     
                     */
                    void setSurface(CgSurfaceType value);

                    /**
                     * Gets the value of the fixed4X4 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fixed4X4 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFixed4X4().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFixed4X4();

                    /**
                     * Gets the value of the fixed4X3 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fixed4X3 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFixed4X3().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFixed4X3();

                    /**
                     * Gets the value of the fixed4X2 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fixed4X2 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFixed4X2().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFixed4X2();

                    /**
                     * Gets the value of the fixed4X1 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fixed4X1 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFixed4X1().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFixed4X1();

                    /**
                     * Gets the value of the fixed3X4 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fixed3X4 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFixed3X4().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFixed3X4();

                    /**
                     * Gets the value of the fixed3X3 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fixed3X3 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFixed3X3().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFixed3X3();

                    /**
                     * Gets the value of the fixed3X2 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fixed3X2 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFixed3X2().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFixed3X2();

                    /**
                     * Gets the value of the fixed3X1 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fixed3X1 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFixed3X1().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFixed3X1();

                    /**
                     * Gets the value of the fixed2X4 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fixed2X4 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFixed2X4().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFixed2X4();

                    /**
                     * Gets the value of the fixed2X3 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fixed2X3 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFixed2X3().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFixed2X3();

                    /**
                     * Gets the value of the fixed2X2 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fixed2X2 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFixed2X2().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFixed2X2();

                    /**
                     * Gets the value of the fixed2X1 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fixed2X1 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFixed2X1().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFixed2X1();

                    /**
                     * Gets the value of the fixed1X4 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fixed1X4 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFixed1X4().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFixed1X4();

                    /**
                     * Gets the value of the fixed1X3 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fixed1X3 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFixed1X3().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFixed1X3();

                    /**
                     * Gets the value of the fixed1X2 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fixed1X2 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFixed1X2().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFixed1X2();

                    /**
                     * Gets the value of the fixed1X1 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fixed1X1 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFixed1X1().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFixed1X1();

                    /**
                     * Gets the value of the fixed4 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fixed4 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFixed4().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFixed4();

                    /**
                     * Gets the value of the fixed3 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fixed3 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFixed3().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFixed3();

                    /**
                     * Gets the value of the fixed2 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fixed2 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFixed2().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFixed2();

                    /**
                     * fixed1プロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Float }
                     *     
                     */
                    Float getFixed1();

                    /**
                     * fixed1プロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Float }
                     *     
                     */
                    void setFixed1(Float value);

                    /**
                     * fixedプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Float }
                     *     
                     */
                    Float getFixed();

                    /**
                     * fixedプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Float }
                     *     
                     */
                    void setFixed(Float value);

                    /**
                     * Gets the value of the half4X4 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the half4X4 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHalf4X4().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getHalf4X4();

                    /**
                     * Gets the value of the half4X3 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the half4X3 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHalf4X3().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getHalf4X3();

                    /**
                     * Gets the value of the half4X2 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the half4X2 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHalf4X2().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getHalf4X2();

                    /**
                     * Gets the value of the half4X1 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the half4X1 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHalf4X1().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getHalf4X1();

                    /**
                     * Gets the value of the half3X4 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the half3X4 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHalf3X4().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getHalf3X4();

                    /**
                     * Gets the value of the half3X3 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the half3X3 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHalf3X3().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getHalf3X3();

                    /**
                     * Gets the value of the half3X2 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the half3X2 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHalf3X2().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getHalf3X2();

                    /**
                     * Gets the value of the half3X1 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the half3X1 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHalf3X1().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getHalf3X1();

                    /**
                     * Gets the value of the half2X4 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the half2X4 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHalf2X4().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getHalf2X4();

                    /**
                     * Gets the value of the half2X3 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the half2X3 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHalf2X3().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getHalf2X3();

                    /**
                     * Gets the value of the half2X2 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the half2X2 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHalf2X2().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getHalf2X2();

                    /**
                     * Gets the value of the half2X1 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the half2X1 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHalf2X1().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getHalf2X1();

                    /**
                     * Gets the value of the half1X4 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the half1X4 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHalf1X4().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getHalf1X4();

                    /**
                     * Gets the value of the half1X3 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the half1X3 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHalf1X3().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getHalf1X3();

                    /**
                     * Gets the value of the half1X2 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the half1X2 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHalf1X2().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getHalf1X2();

                    /**
                     * Gets the value of the half1X1 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the half1X1 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHalf1X1().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getHalf1X1();

                    /**
                     * Gets the value of the half4 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the half4 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHalf4().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getHalf4();

                    /**
                     * Gets the value of the half3 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the half3 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHalf3().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getHalf3();

                    /**
                     * Gets the value of the half2 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the half2 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHalf2().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getHalf2();

                    /**
                     * half1プロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Float }
                     *     
                     */
                    Float getHalf1();

                    /**
                     * half1プロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Float }
                     *     
                     */
                    void setHalf1(Float value);

                    /**
                     * halfプロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Float }
                     *     
                     */
                    Float getHalf();

                    /**
                     * halfプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Float }
                     *     
                     */
                    void setHalf(Float value);

                    /**
                     * Gets the value of the int4X4 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the int4X4 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInt4X4().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Integer }
                     * 
                     * 
                     */
                    List<Integer> getInt4X4();

                    /**
                     * Gets the value of the int4X3 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the int4X3 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInt4X3().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Integer }
                     * 
                     * 
                     */
                    List<Integer> getInt4X3();

                    /**
                     * Gets the value of the int4X2 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the int4X2 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInt4X2().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Integer }
                     * 
                     * 
                     */
                    List<Integer> getInt4X2();

                    /**
                     * Gets the value of the int4X1 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the int4X1 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInt4X1().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Integer }
                     * 
                     * 
                     */
                    List<Integer> getInt4X1();

                    /**
                     * Gets the value of the int3X4 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the int3X4 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInt3X4().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Integer }
                     * 
                     * 
                     */
                    List<Integer> getInt3X4();

                    /**
                     * Gets the value of the int3X3 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the int3X3 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInt3X3().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Integer }
                     * 
                     * 
                     */
                    List<Integer> getInt3X3();

                    /**
                     * Gets the value of the int3X2 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the int3X2 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInt3X2().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Integer }
                     * 
                     * 
                     */
                    List<Integer> getInt3X2();

                    /**
                     * Gets the value of the int3X1 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the int3X1 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInt3X1().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Integer }
                     * 
                     * 
                     */
                    List<Integer> getInt3X1();

                    /**
                     * Gets the value of the int2X4 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the int2X4 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInt2X4().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Integer }
                     * 
                     * 
                     */
                    List<Integer> getInt2X4();

                    /**
                     * Gets the value of the int2X3 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the int2X3 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInt2X3().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Integer }
                     * 
                     * 
                     */
                    List<Integer> getInt2X3();

                    /**
                     * Gets the value of the int2X2 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the int2X2 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInt2X2().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Integer }
                     * 
                     * 
                     */
                    List<Integer> getInt2X2();

                    /**
                     * Gets the value of the int2X1 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the int2X1 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInt2X1().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Integer }
                     * 
                     * 
                     */
                    List<Integer> getInt2X1();

                    /**
                     * Gets the value of the int1X4 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the int1X4 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInt1X4().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Integer }
                     * 
                     * 
                     */
                    List<Integer> getInt1X4();

                    /**
                     * Gets the value of the int1X3 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the int1X3 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInt1X3().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Integer }
                     * 
                     * 
                     */
                    List<Integer> getInt1X3();

                    /**
                     * Gets the value of the int1X2 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the int1X2 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInt1X2().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Integer }
                     * 
                     * 
                     */
                    List<Integer> getInt1X2();

                    /**
                     * Gets the value of the int1X1 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the int1X1 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInt1X1().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Integer }
                     * 
                     * 
                     */
                    List<Integer> getInt1X1();

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
                     * int1プロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    Integer getInt1();

                    /**
                     * int1プロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    void setInt1(Integer value);

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
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFloat4X3();

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
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFloat4X2();

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
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFloat4X1();

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
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFloat3X4();

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
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFloat3X2();

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
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFloat3X1();

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
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFloat2X4();

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
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFloat2X3();

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
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFloat2X1();

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
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFloat1X4();

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
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFloat1X3();

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
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFloat1X2();

                    /**
                     * Gets the value of the float1X1 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the float1X1 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFloat1X1().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Float }
                     * 
                     * 
                     */
                    List<Float> getFloat1X1();

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
                     * float1プロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Float }
                     *     
                     */
                    Float getFloat1();

                    /**
                     * float1プロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Float }
                     *     
                     */
                    void setFloat1(Float value);

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
                     * Gets the value of the bool4X4 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the bool4X4 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBool4X4().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Boolean }
                     * 
                     * 
                     */
                    List<Boolean> getBool4X4();

                    /**
                     * Gets the value of the bool4X3 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the bool4X3 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBool4X3().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Boolean }
                     * 
                     * 
                     */
                    List<Boolean> getBool4X3();

                    /**
                     * Gets the value of the bool4X2 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the bool4X2 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBool4X2().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Boolean }
                     * 
                     * 
                     */
                    List<Boolean> getBool4X2();

                    /**
                     * Gets the value of the bool4X1 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the bool4X1 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBool4X1().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Boolean }
                     * 
                     * 
                     */
                    List<Boolean> getBool4X1();

                    /**
                     * Gets the value of the bool3X4 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the bool3X4 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBool3X4().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Boolean }
                     * 
                     * 
                     */
                    List<Boolean> getBool3X4();

                    /**
                     * Gets the value of the bool3X3 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the bool3X3 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBool3X3().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Boolean }
                     * 
                     * 
                     */
                    List<Boolean> getBool3X3();

                    /**
                     * Gets the value of the bool3X2 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the bool3X2 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBool3X2().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Boolean }
                     * 
                     * 
                     */
                    List<Boolean> getBool3X2();

                    /**
                     * Gets the value of the bool3X1 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the bool3X1 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBool3X1().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Boolean }
                     * 
                     * 
                     */
                    List<Boolean> getBool3X1();

                    /**
                     * Gets the value of the bool2X4 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the bool2X4 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBool2X4().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Boolean }
                     * 
                     * 
                     */
                    List<Boolean> getBool2X4();

                    /**
                     * Gets the value of the bool2X3 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the bool2X3 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBool2X3().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Boolean }
                     * 
                     * 
                     */
                    List<Boolean> getBool2X3();

                    /**
                     * Gets the value of the bool2X2 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the bool2X2 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBool2X2().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Boolean }
                     * 
                     * 
                     */
                    List<Boolean> getBool2X2();

                    /**
                     * Gets the value of the bool2X1 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the bool2X1 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBool2X1().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Boolean }
                     * 
                     * 
                     */
                    List<Boolean> getBool2X1();

                    /**
                     * Gets the value of the bool1X4 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the bool1X4 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBool1X4().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Boolean }
                     * 
                     * 
                     */
                    List<Boolean> getBool1X4();

                    /**
                     * Gets the value of the bool1X3 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the bool1X3 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBool1X3().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Boolean }
                     * 
                     * 
                     */
                    List<Boolean> getBool1X3();

                    /**
                     * Gets the value of the bool1X2 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the bool1X2 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBool1X2().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Boolean }
                     * 
                     * 
                     */
                    List<Boolean> getBool1X2();

                    /**
                     * Gets the value of the bool1X1 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the bool1X1 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBool1X1().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Boolean }
                     * 
                     * 
                     */
                    List<Boolean> getBool1X1();

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
                     * bool1プロパティの値を取得します。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    Boolean isBool1();

                    /**
                     * bool1プロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    void setBool1(Boolean value);

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
                     *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
                 *     {@link ProfileCG.Technique.Pass.StencilFunc.Func }
                 *     
                 */
                ProfileCG.Technique.Pass.StencilFunc.Func getFunc();

                /**
                 * funcプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.StencilFunc.Func }
                 *     
                 */
                void setFunc(ProfileCG.Technique.Pass.StencilFunc.Func value);

                /**
                 * refプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.StencilFunc.Ref }
                 *     
                 */
                ProfileCG.Technique.Pass.StencilFunc.Ref getRef();

                /**
                 * refプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.StencilFunc.Ref }
                 *     
                 */
                void setRef(ProfileCG.Technique.Pass.StencilFunc.Ref value);

                /**
                 * maskプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.StencilFunc.Mask }
                 *     
                 */
                ProfileCG.Technique.Pass.StencilFunc.Mask getMask();

                /**
                 * maskプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.StencilFunc.Mask }
                 *     
                 */
                void setMask(ProfileCG.Technique.Pass.StencilFunc.Mask value);


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
             *       &lt;sequence>
             *         &lt;element name="front">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_func_type" default="ALWAYS" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="back">
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
            public interface StencilFuncSeparate {


                /**
                 * frontプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.StencilFuncSeparate.Front }
                 *     
                 */
                ProfileCG.Technique.Pass.StencilFuncSeparate.Front getFront();

                /**
                 * frontプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.StencilFuncSeparate.Front }
                 *     
                 */
                void setFront(ProfileCG.Technique.Pass.StencilFuncSeparate.Front value);

                /**
                 * backプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.StencilFuncSeparate.Back }
                 *     
                 */
                ProfileCG.Technique.Pass.StencilFuncSeparate.Back getBack();

                /**
                 * backプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.StencilFuncSeparate.Back }
                 *     
                 */
                void setBack(ProfileCG.Technique.Pass.StencilFuncSeparate.Back value);

                /**
                 * refプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.StencilFuncSeparate.Ref }
                 *     
                 */
                ProfileCG.Technique.Pass.StencilFuncSeparate.Ref getRef();

                /**
                 * refプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.StencilFuncSeparate.Ref }
                 *     
                 */
                void setRef(ProfileCG.Technique.Pass.StencilFuncSeparate.Ref value);

                /**
                 * maskプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.StencilFuncSeparate.Mask }
                 *     
                 */
                ProfileCG.Technique.Pass.StencilFuncSeparate.Mask getMask();

                /**
                 * maskプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.StencilFuncSeparate.Mask }
                 *     
                 */
                void setMask(ProfileCG.Technique.Pass.StencilFuncSeparate.Mask value);


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
                public interface Back {


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
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_func_type" default="ALWAYS" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Front {


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
             *         &lt;element name="face">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_face_type" default="FRONT_AND_BACK" />
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
            public interface StencilMaskSeparate {


                /**
                 * faceプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.StencilMaskSeparate.Face }
                 *     
                 */
                ProfileCG.Technique.Pass.StencilMaskSeparate.Face getFace();

                /**
                 * faceプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.StencilMaskSeparate.Face }
                 *     
                 */
                void setFace(ProfileCG.Technique.Pass.StencilMaskSeparate.Face value);

                /**
                 * maskプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.StencilMaskSeparate.Mask }
                 *     
                 */
                ProfileCG.Technique.Pass.StencilMaskSeparate.Mask getMask();

                /**
                 * maskプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.StencilMaskSeparate.Mask }
                 *     
                 */
                void setMask(ProfileCG.Technique.Pass.StencilMaskSeparate.Mask value);


                /**
                 * <p>anonymous complex typeのJavaクラス。
                 * 
                 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_face_type" default="FRONT_AND_BACK" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Face {


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
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_stencil_op_type" default="KEEP" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="zfail">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_stencil_op_type" default="KEEP" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="zpass">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_stencil_op_type" default="KEEP" />
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
                 *     {@link ProfileCG.Technique.Pass.StencilOp.Fail }
                 *     
                 */
                ProfileCG.Technique.Pass.StencilOp.Fail getFail();

                /**
                 * failプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.StencilOp.Fail }
                 *     
                 */
                void setFail(ProfileCG.Technique.Pass.StencilOp.Fail value);

                /**
                 * zfailプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.StencilOp.Zfail }
                 *     
                 */
                ProfileCG.Technique.Pass.StencilOp.Zfail getZfail();

                /**
                 * zfailプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.StencilOp.Zfail }
                 *     
                 */
                void setZfail(ProfileCG.Technique.Pass.StencilOp.Zfail value);

                /**
                 * zpassプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.StencilOp.Zpass }
                 *     
                 */
                ProfileCG.Technique.Pass.StencilOp.Zpass getZpass();

                /**
                 * zpassプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.StencilOp.Zpass }
                 *     
                 */
                void setZpass(ProfileCG.Technique.Pass.StencilOp.Zpass value);


                /**
                 * <p>anonymous complex typeのJavaクラス。
                 * 
                 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_stencil_op_type" default="KEEP" />
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
                     *     {@link GlStencilOpType }
                     *     
                     */
                    GlStencilOpType getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlStencilOpType }
                     *     
                     */
                    void setValue(GlStencilOpType value);

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
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_stencil_op_type" default="KEEP" />
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
                     *     {@link GlStencilOpType }
                     *     
                     */
                    GlStencilOpType getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlStencilOpType }
                     *     
                     */
                    void setValue(GlStencilOpType value);

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
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_stencil_op_type" default="KEEP" />
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
                     *     {@link GlStencilOpType }
                     *     
                     */
                    GlStencilOpType getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlStencilOpType }
                     *     
                     */
                    void setValue(GlStencilOpType value);

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
             *         &lt;element name="face">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_face_type" default="FRONT_AND_BACK" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="fail">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_stencil_op_type" default="KEEP" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="zfail">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_stencil_op_type" default="KEEP" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="zpass">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_stencil_op_type" default="KEEP" />
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
            public interface StencilOpSeparate {


                /**
                 * faceプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.StencilOpSeparate.Face }
                 *     
                 */
                ProfileCG.Technique.Pass.StencilOpSeparate.Face getFace();

                /**
                 * faceプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.StencilOpSeparate.Face }
                 *     
                 */
                void setFace(ProfileCG.Technique.Pass.StencilOpSeparate.Face value);

                /**
                 * failプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.StencilOpSeparate.Fail }
                 *     
                 */
                ProfileCG.Technique.Pass.StencilOpSeparate.Fail getFail();

                /**
                 * failプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.StencilOpSeparate.Fail }
                 *     
                 */
                void setFail(ProfileCG.Technique.Pass.StencilOpSeparate.Fail value);

                /**
                 * zfailプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.StencilOpSeparate.Zfail }
                 *     
                 */
                ProfileCG.Technique.Pass.StencilOpSeparate.Zfail getZfail();

                /**
                 * zfailプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.StencilOpSeparate.Zfail }
                 *     
                 */
                void setZfail(ProfileCG.Technique.Pass.StencilOpSeparate.Zfail value);

                /**
                 * zpassプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileCG.Technique.Pass.StencilOpSeparate.Zpass }
                 *     
                 */
                ProfileCG.Technique.Pass.StencilOpSeparate.Zpass getZpass();

                /**
                 * zpassプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileCG.Technique.Pass.StencilOpSeparate.Zpass }
                 *     
                 */
                void setZpass(ProfileCG.Technique.Pass.StencilOpSeparate.Zpass value);


                /**
                 * <p>anonymous complex typeのJavaクラス。
                 * 
                 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_face_type" default="FRONT_AND_BACK" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Face {


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
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_stencil_op_type" default="KEEP" />
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
                     *     {@link GlStencilOpType }
                     *     
                     */
                    GlStencilOpType getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlStencilOpType }
                     *     
                     */
                    void setValue(GlStencilOpType value);

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
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_stencil_op_type" default="KEEP" />
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
                     *     {@link GlStencilOpType }
                     *     
                     */
                    GlStencilOpType getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlStencilOpType }
                     *     
                     */
                    void setValue(GlStencilOpType value);

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
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_stencil_op_type" default="KEEP" />
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
                     *     {@link GlStencilOpType }
                     *     
                     */
                    GlStencilOpType getValue();

                    /**
                     * valueプロパティの値を設定します。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlStencilOpType }
                     *     
                     */
                    void setValue(GlStencilOpType value);

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
             *       &lt;choice>
             *         &lt;element name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_sampler1D"/>
             *         &lt;element name="param" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
             *       &lt;/choice>
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_TEXTURE_IMAGE_UNITS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface Texture1D {


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
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlSampler1D }
                 *     
                 */
                GlSampler1D getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlSampler1D }
                 *     
                 */
                void setValue(GlSampler1D value);

                /**
                 * indexプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="index" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_TEXTURE_IMAGE_UNITS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface Texture1DEnable {


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
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;choice>
             *         &lt;element name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_sampler2D"/>
             *         &lt;element name="param" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
             *       &lt;/choice>
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_TEXTURE_IMAGE_UNITS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface Texture2D {


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
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlSampler2D }
                 *     
                 */
                GlSampler2D getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlSampler2D }
                 *     
                 */
                void setValue(GlSampler2D value);

                /**
                 * indexプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="index" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_TEXTURE_IMAGE_UNITS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface Texture2DEnable {


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
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;choice>
             *         &lt;element name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_sampler3D"/>
             *         &lt;element name="param" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
             *       &lt;/choice>
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_TEXTURE_IMAGE_UNITS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface Texture3D {


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
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlSampler3D }
                 *     
                 */
                GlSampler3D getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlSampler3D }
                 *     
                 */
                void setValue(GlSampler3D value);

                /**
                 * indexプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="index" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_TEXTURE_IMAGE_UNITS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface Texture3DEnable {


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
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;choice>
             *         &lt;element name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_samplerCUBE"/>
             *         &lt;element name="param" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
             *       &lt;/choice>
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_TEXTURE_IMAGE_UNITS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface TextureCUBE {


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
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlSamplerCUBE }
                 *     
                 */
                GlSamplerCUBE getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlSamplerCUBE }
                 *     
                 */
                void setValue(GlSamplerCUBE value);

                /**
                 * indexプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="index" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_TEXTURE_IMAGE_UNITS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface TextureCUBEEnable {


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
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;choice>
             *         &lt;element name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_samplerDEPTH"/>
             *         &lt;element name="param" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
             *       &lt;/choice>
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_TEXTURE_IMAGE_UNITS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface TextureDEPTH {


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
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlSamplerDEPTH }
                 *     
                 */
                GlSamplerDEPTH getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlSamplerDEPTH }
                 *     
                 */
                void setValue(GlSamplerDEPTH value);

                /**
                 * indexプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="index" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_TEXTURE_IMAGE_UNITS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface TextureDEPTHEnable {


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
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="index" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_TEXTURE_IMAGE_UNITS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface TextureEnvColor {


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
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}string" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_TEXTURE_IMAGE_UNITS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface TextureEnvMode {


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
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;choice>
             *         &lt;element name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_samplerRECT"/>
             *         &lt;element name="param" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
             *       &lt;/choice>
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_TEXTURE_IMAGE_UNITS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface TextureRECT {


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
                 * valueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlSamplerRECT }
                 *     
                 */
                GlSamplerRECT getValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlSamplerRECT }
                 *     
                 */
                void setValue(GlSamplerRECT value);

                /**
                 * indexプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

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
             *       &lt;attribute name="index" type="{http://www.collada.org/2005/11/COLLADASchema}GL_MAX_TEXTURE_IMAGE_UNITS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface TextureRECTEnable {


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
                 *     {@link BigInteger }
                 *     
                 */
                BigInteger getIndex();

                /**
                 * indexプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                void setIndex(BigInteger value);

            }

        }

    }

}
