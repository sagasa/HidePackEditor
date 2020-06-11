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
 * 			Two-dimensional texture sampler state for profile_GLES. This is a bundle of sampler-specific states that will be referenced by one or more texture_units.
 * 			
 * 
 * <p>gles_sampler_state complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="gles_sampler_state">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wrap_s" type="{http://www.collada.org/2005/11/COLLADASchema}gles_sampler_wrap" minOccurs="0"/>
 *         &lt;element name="wrap_t" type="{http://www.collada.org/2005/11/COLLADASchema}gles_sampler_wrap" minOccurs="0"/>
 *         &lt;element name="minfilter" type="{http://www.collada.org/2005/11/COLLADASchema}fx_sampler_filter_common" minOccurs="0"/>
 *         &lt;element name="magfilter" type="{http://www.collada.org/2005/11/COLLADASchema}fx_sampler_filter_common" minOccurs="0"/>
 *         &lt;element name="mipfilter" type="{http://www.collada.org/2005/11/COLLADASchema}fx_sampler_filter_common" minOccurs="0"/>
 *         &lt;element name="mipmap_maxlevel" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="mipmap_bias" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
public interface GlesSamplerState {


    /**
     * wrapSプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link GlesSamplerWrap }
     *     
     */
    GlesSamplerWrap getWrapS();

    /**
     * wrapSプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link GlesSamplerWrap }
     *     
     */
    void setWrapS(GlesSamplerWrap value);

    /**
     * wrapTプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link GlesSamplerWrap }
     *     
     */
    GlesSamplerWrap getWrapT();

    /**
     * wrapTプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link GlesSamplerWrap }
     *     
     */
    void setWrapT(GlesSamplerWrap value);

    /**
     * minfilterプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link FxSamplerFilterCommon }
     *     
     */
    FxSamplerFilterCommon getMinfilter();

    /**
     * minfilterプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link FxSamplerFilterCommon }
     *     
     */
    void setMinfilter(FxSamplerFilterCommon value);

    /**
     * magfilterプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link FxSamplerFilterCommon }
     *     
     */
    FxSamplerFilterCommon getMagfilter();

    /**
     * magfilterプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link FxSamplerFilterCommon }
     *     
     */
    void setMagfilter(FxSamplerFilterCommon value);

    /**
     * mipfilterプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link FxSamplerFilterCommon }
     *     
     */
    FxSamplerFilterCommon getMipfilter();

    /**
     * mipfilterプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link FxSamplerFilterCommon }
     *     
     */
    void setMipfilter(FxSamplerFilterCommon value);

    /**
     * mipmapMaxlevelプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    Short getMipmapMaxlevel();

    /**
     * mipmapMaxlevelプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    void setMipmapMaxlevel(Short value);

    /**
     * mipmapBiasプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    Float getMipmapBias();

    /**
     * mipmapBiasプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    void setMipmapBias(Float value);

    /**
     * 
     * 					The extra element may appear any number of times.
     * 					OpenGL ES extensions may be used here.
     * 					Gets the value of the extras property.
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

}
