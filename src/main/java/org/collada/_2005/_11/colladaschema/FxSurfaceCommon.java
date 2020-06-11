//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;

import java.util.List;


/**
 * 
 * 			The fx_surface_common type is used to declare a resource that can be used both as the source for texture samples and as the target of a rendering pass.
 * 			
 * 
 * <p>fx_surface_common complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="fx_surface_common">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}fx_surface_init_common" minOccurs="0"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="format_hint" type="{http://www.collada.org/2005/11/COLLADASchema}fx_surface_format_hint_common" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="size" type="{http://www.collada.org/2005/11/COLLADASchema}int3"/>
 *           &lt;element name="viewport_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}float2"/>
 *         &lt;/choice>
 *         &lt;element name="mip_levels" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="mipmap_generate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}fx_surface_type_enum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface FxSurfaceCommon {


    /**
     * Gets the value of the initFroms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initFroms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitFroms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxSurfaceInitFromCommon }
     * 
     * 
     */
    List<FxSurfaceInitFromCommon> getInitFroms();

    /**
     * initPlanarプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link FxSurfaceInitPlanarCommon }
     *     
     */
    FxSurfaceInitPlanarCommon getInitPlanar();

    /**
     * initPlanarプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link FxSurfaceInitPlanarCommon }
     *     
     */
    void setInitPlanar(FxSurfaceInitPlanarCommon value);

    /**
     * initVolumeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link FxSurfaceInitVolumeCommon }
     *     
     */
    FxSurfaceInitVolumeCommon getInitVolume();

    /**
     * initVolumeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link FxSurfaceInitVolumeCommon }
     *     
     */
    void setInitVolume(FxSurfaceInitVolumeCommon value);

    /**
     * initCubeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link FxSurfaceInitCubeCommon }
     *     
     */
    FxSurfaceInitCubeCommon getInitCube();

    /**
     * initCubeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link FxSurfaceInitCubeCommon }
     *     
     */
    void setInitCube(FxSurfaceInitCubeCommon value);

    /**
     * initAsTargetプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    Object getInitAsTarget();

    /**
     * initAsTargetプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    void setInitAsTarget(Object value);

    /**
     * initAsNullプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    Object getInitAsNull();

    /**
     * initAsNullプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    void setInitAsNull(Object value);

    /**
     * formatプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getFormat();

    /**
     * formatプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setFormat(String value);

    /**
     * formatHintプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link FxSurfaceFormatHintCommon }
     *     
     */
    FxSurfaceFormatHintCommon getFormatHint();

    /**
     * formatHintプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link FxSurfaceFormatHintCommon }
     *     
     */
    void setFormatHint(FxSurfaceFormatHintCommon value);

    /**
     * Gets the value of the viewportRatio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewportRatio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewportRatio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    List<Double> getViewportRatio();

    /**
     * Gets the value of the size property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the size property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    List<Long> getSize();

    /**
     * mipLevelsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    Long getMipLevels();

    /**
     * mipLevelsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    void setMipLevels(Long value);

    /**
     * mipmapGenerateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    Boolean isMipmapGenerate();

    /**
     * mipmapGenerateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setMipmapGenerate(Boolean value);

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
     * typeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getType();

    /**
     * typeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setType(String value);

}
