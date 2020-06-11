//
// ���̃t�@�C���́AJavaTM Architecture for XML Binding(JAXB) Reference Implementation�Av2.2.8-b130911.1802�ɂ���Đ�������܂��� 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>���Q�Ƃ��Ă������� 
// �\�[�X�E�X�L�[�}�̍ăR���p�C�����ɂ��̃t�@�C���̕ύX�͎����܂��B 
// ������: 2020.05.28 ���� 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;

import java.util.List;


/**
 * <p>glsl_newparam complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * 
 * <pre>
 * &lt;complexType name="glsl_newparam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="semantic" type="{http://www.w3.org/2001/XMLSchema}NCName" minOccurs="0"/>
 *         &lt;element name="modifier" type="{http://www.collada.org/2005/11/COLLADASchema}fx_modifier_enum_common" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}glsl_param_type"/>
 *           &lt;element name="array" type="{http://www.collada.org/2005/11/COLLADASchema}glsl_newarray_type"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="sid" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}glsl_identifier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface GlslNewparam {


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
     * semantic�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSemantic();

    /**
     * semantic�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSemantic(String value);

    /**
     * modifier�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link FxModifierEnumCommon }
     *     
     */
    FxModifierEnumCommon getModifier();

    /**
     * modifier�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link FxModifierEnumCommon }
     *     
     */
    void setModifier(FxModifierEnumCommon value);

    /**
     * array�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link GlslNewarrayType }
     *     
     */
    GlslNewarrayType getArray();

    /**
     * array�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link GlslNewarrayType }
     *     
     */
    void setArray(GlslNewarrayType value);

    /**
     * enum�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getEnum();

    /**
     * enum�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setEnum(String value);

    /**
     * samplerDEPTH�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link GlSamplerDEPTH }
     *     
     */
    GlSamplerDEPTH getSamplerDEPTH();

    /**
     * samplerDEPTH�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link GlSamplerDEPTH }
     *     
     */
    void setSamplerDEPTH(GlSamplerDEPTH value);

    /**
     * samplerRECT�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link GlSamplerRECT }
     *     
     */
    GlSamplerRECT getSamplerRECT();

    /**
     * samplerRECT�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link GlSamplerRECT }
     *     
     */
    void setSamplerRECT(GlSamplerRECT value);

    /**
     * samplerCUBE�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link GlSamplerCUBE }
     *     
     */
    GlSamplerCUBE getSamplerCUBE();

    /**
     * samplerCUBE�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link GlSamplerCUBE }
     *     
     */
    void setSamplerCUBE(GlSamplerCUBE value);

    /**
     * sampler3D�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link GlSampler3D }
     *     
     */
    GlSampler3D getSampler3D();

    /**
     * sampler3D�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link GlSampler3D }
     *     
     */
    void setSampler3D(GlSampler3D value);

    /**
     * sampler2D�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link GlSampler2D }
     *     
     */
    GlSampler2D getSampler2D();

    /**
     * sampler2D�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link GlSampler2D }
     *     
     */
    void setSampler2D(GlSampler2D value);

    /**
     * sampler1D�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link GlSampler1D }
     *     
     */
    GlSampler1D getSampler1D();

    /**
     * sampler1D�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link GlSampler1D }
     *     
     */
    void setSampler1D(GlSampler1D value);

    /**
     * surface�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link GlslSurfaceType }
     *     
     */
    GlslSurfaceType getSurface();

    /**
     * surface�v���p�e�B�̒l��ݒ肵�܂��B
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
     * int�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    Integer getInt();

    /**
     * int�v���p�e�B�̒l��ݒ肵�܂��B
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
     * float�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    Float getFloat();

    /**
     * float�v���p�e�B�̒l��ݒ肵�܂��B
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
     * bool�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    Boolean isBool();

    /**
     * bool�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setBool(Boolean value);

    /**
     * sid�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSid();

    /**
     * sid�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSid(String value);

}
