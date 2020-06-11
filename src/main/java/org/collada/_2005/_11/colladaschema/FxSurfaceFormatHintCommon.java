//
// ���̃t�@�C���́AJavaTM Architecture for XML Binding(JAXB) Reference Implementation�Av2.2.8-b130911.1802�ɂ���Đ�������܂��� 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>���Q�Ƃ��Ă������� 
// �\�[�X�E�X�L�[�}�̍ăR���p�C�����ɂ��̃t�@�C���̕ύX�͎����܂��B 
// ������: 2020.05.28 ���� 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;

import java.util.List;


/**
 * If the exact format cannot be resolve via other methods then the format_hint will describe the important features of the format so that the application may select a compatable or close format
 * 
 * <p>fx_surface_format_hint_common complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * 
 * <pre>
 * &lt;complexType name="fx_surface_format_hint_common">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="channels" type="{http://www.collada.org/2005/11/COLLADASchema}fx_surface_format_hint_channels_enum"/>
 *         &lt;element name="range" type="{http://www.collada.org/2005/11/COLLADASchema}fx_surface_format_hint_range_enum"/>
 *         &lt;element name="precision" type="{http://www.collada.org/2005/11/COLLADASchema}fx_surface_format_hint_precision_enum" minOccurs="0"/>
 *         &lt;element name="option" type="{http://www.collada.org/2005/11/COLLADASchema}fx_surface_format_hint_option_enum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface FxSurfaceFormatHintCommon {


    /**
     * channels�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link FxSurfaceFormatHintChannelsEnum }
     *     
     */
    FxSurfaceFormatHintChannelsEnum getChannels();

    /**
     * channels�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link FxSurfaceFormatHintChannelsEnum }
     *     
     */
    void setChannels(FxSurfaceFormatHintChannelsEnum value);

    /**
     * range�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link FxSurfaceFormatHintRangeEnum }
     *     
     */
    FxSurfaceFormatHintRangeEnum getRange();

    /**
     * range�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link FxSurfaceFormatHintRangeEnum }
     *     
     */
    void setRange(FxSurfaceFormatHintRangeEnum value);

    /**
     * precision�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link FxSurfaceFormatHintPrecisionEnum }
     *     
     */
    FxSurfaceFormatHintPrecisionEnum getPrecision();

    /**
     * precision�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link FxSurfaceFormatHintPrecisionEnum }
     *     
     */
    void setPrecision(FxSurfaceFormatHintPrecisionEnum value);

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxSurfaceFormatHintOptionEnum }
     * 
     * 
     */
    List<FxSurfaceFormatHintOptionEnum> getOptions();

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

}
