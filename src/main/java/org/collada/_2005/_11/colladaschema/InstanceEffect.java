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
 *         &lt;element name="technique_hint" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="platform" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                 &lt;attribute name="profile" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                 &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="setparam" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}fx_basic_type_common"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="url" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface InstanceEffect {


    /**
     * Gets the value of the techniqueHints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the techniqueHints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechniqueHints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstanceEffect.TechniqueHint }
     * 
     * 
     */
    List<InstanceEffect.TechniqueHint> getTechniqueHints();

    /**
     * Gets the value of the setparams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setparams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetparams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstanceEffect.Setparam }
     * 
     * 
     */
    List<InstanceEffect.Setparam> getSetparams();

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
     * urlプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getUrl();

    /**
     * urlプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setUrl(String value);

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
     *         &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}fx_basic_type_common"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface Setparam {


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
         *     {@link FxSamplerDEPTHCommon }
         *     
         */
        FxSamplerDEPTHCommon getSamplerDEPTH();

        /**
         * samplerDEPTHプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link FxSamplerDEPTHCommon }
         *     
         */
        void setSamplerDEPTH(FxSamplerDEPTHCommon value);

        /**
         * samplerRECTプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link FxSamplerRECTCommon }
         *     
         */
        FxSamplerRECTCommon getSamplerRECT();

        /**
         * samplerRECTプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link FxSamplerRECTCommon }
         *     
         */
        void setSamplerRECT(FxSamplerRECTCommon value);

        /**
         * samplerCUBEプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link FxSamplerCUBECommon }
         *     
         */
        FxSamplerCUBECommon getSamplerCUBE();

        /**
         * samplerCUBEプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link FxSamplerCUBECommon }
         *     
         */
        void setSamplerCUBE(FxSamplerCUBECommon value);

        /**
         * sampler3Dプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link FxSampler3DCommon }
         *     
         */
        FxSampler3DCommon getSampler3D();

        /**
         * sampler3Dプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link FxSampler3DCommon }
         *     
         */
        void setSampler3D(FxSampler3DCommon value);

        /**
         * sampler2Dプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link FxSampler2DCommon }
         *     
         */
        FxSampler2DCommon getSampler2D();

        /**
         * sampler2Dプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link FxSampler2DCommon }
         *     
         */
        void setSampler2D(FxSampler2DCommon value);

        /**
         * sampler1Dプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link FxSampler1DCommon }
         *     
         */
        FxSampler1DCommon getSampler1D();

        /**
         * sampler1Dプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link FxSampler1DCommon }
         *     
         */
        void setSampler1D(FxSampler1DCommon value);

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


    /**
     * <p>anonymous complex typeのJavaクラス。
     * 
     * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="platform" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *       &lt;attribute name="profile" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface TechniqueHint {


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
         * profileプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getProfile();

        /**
         * profileプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setProfile(String value);

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
