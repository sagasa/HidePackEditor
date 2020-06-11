//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;

import java.util.List;


/**
 * <p>common_newparam_type complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="common_newparam_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="semantic" type="{http://www.w3.org/2001/XMLSchema}NCName" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="float" type="{http://www.collada.org/2005/11/COLLADASchema}float"/>
 *           &lt;element name="float2" type="{http://www.collada.org/2005/11/COLLADASchema}float2"/>
 *           &lt;element name="float3" type="{http://www.collada.org/2005/11/COLLADASchema}float3"/>
 *           &lt;element name="float4" type="{http://www.collada.org/2005/11/COLLADASchema}float4"/>
 *           &lt;element name="surface" type="{http://www.collada.org/2005/11/COLLADASchema}fx_surface_common"/>
 *           &lt;element name="sampler2D" type="{http://www.collada.org/2005/11/COLLADASchema}fx_sampler2D_common"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="sid" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface CommonNewparamType {


    /**
     * semanticプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSemantic();

    /**
     * semanticプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSemantic(String value);

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

}
