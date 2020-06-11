//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;

import java.util.List;


/**
 * <p>glsl_setparam complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="glsl_setparam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}glsl_param_type"/>
 *           &lt;element name="array" type="{http://www.collada.org/2005/11/COLLADASchema}glsl_setarray_type"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ref" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}glsl_identifier" />
 *       &lt;attribute name="program" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface GlslSetparam {


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
     * arrayプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link GlslSetarrayType }
     *     
     */
    GlslSetarrayType getArray();

    /**
     * arrayプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link GlslSetarrayType }
     *     
     */
    void setArray(GlslSetarrayType value);

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

    /**
     * programプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getProgram();

    /**
     * programプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setProgram(String value);

}
