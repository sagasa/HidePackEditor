//
// ���̃t�@�C���́AJavaTM Architecture for XML Binding(JAXB) Reference Implementation�Av2.2.8-b130911.1802�ɂ���Đ�������܂��� 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>���Q�Ƃ��Ă������� 
// �\�[�X�E�X�L�[�}�̍ăR���p�C�����ɂ��̃t�@�C���̕ύX�͎����܂��B 
// ������: 2020.05.28 ���� 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;

import java.util.List;


/**
 * <p>anonymous complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}asset" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}image"/>
 *           &lt;element name="newparam" type="{http://www.collada.org/2005/11/COLLADASchema}common_newparam_type"/>
 *         &lt;/choice>
 *         &lt;element name="technique">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}asset" minOccurs="0"/>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}image"/>
 *                     &lt;element name="newparam" type="{http://www.collada.org/2005/11/COLLADASchema}common_newparam_type"/>
 *                   &lt;/choice>
 *                   &lt;choice>
 *                     &lt;element name="constant">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="emission" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
 *                               &lt;element name="reflective" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
 *                               &lt;element name="reflectivity" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
 *                               &lt;element name="transparent" type="{http://www.collada.org/2005/11/COLLADASchema}common_transparent_type" minOccurs="0"/>
 *                               &lt;element name="transparency" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
 *                               &lt;element name="index_of_refraction" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="lambert">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="emission" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
 *                               &lt;element name="ambient" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
 *                               &lt;element name="diffuse" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
 *                               &lt;element name="reflective" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
 *                               &lt;element name="reflectivity" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
 *                               &lt;element name="transparent" type="{http://www.collada.org/2005/11/COLLADASchema}common_transparent_type" minOccurs="0"/>
 *                               &lt;element name="transparency" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
 *                               &lt;element name="index_of_refraction" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="phong">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="emission" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
 *                               &lt;element name="ambient" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
 *                               &lt;element name="diffuse" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
 *                               &lt;element name="specular" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
 *                               &lt;element name="shininess" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
 *                               &lt;element name="reflective" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
 *                               &lt;element name="reflectivity" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
 *                               &lt;element name="transparent" type="{http://www.collada.org/2005/11/COLLADASchema}common_transparent_type" minOccurs="0"/>
 *                               &lt;element name="transparency" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
 *                               &lt;element name="index_of_refraction" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="blinn">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="emission" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
 *                               &lt;element name="ambient" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
 *                               &lt;element name="diffuse" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
 *                               &lt;element name="specular" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
 *                               &lt;element name="shininess" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
 *                               &lt;element name="reflective" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
 *                               &lt;element name="reflectivity" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
 *                               &lt;element name="transparent" type="{http://www.collada.org/2005/11/COLLADASchema}common_transparent_type" minOccurs="0"/>
 *                               &lt;element name="transparency" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
 *                               &lt;element name="index_of_refraction" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
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
public interface ProfileCOMMON {


    /**
     * asset�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link Asset }
     *     
     */
    Asset getAsset();

    /**
     * asset�v���p�e�B�̒l��ݒ肵�܂��B
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
     * {@link CommonNewparamType }
     * 
     * 
     */
    List<Object> getImagesAndNewparams();

    /**
     * technique�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link ProfileCOMMON.Technique }
     *     
     */
    ProfileCOMMON.Technique getTechnique();

    /**
     * technique�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileCOMMON.Technique }
     *     
     */
    void setTechnique(ProfileCOMMON.Technique value);

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
     * id�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getId();

    /**
     * id�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setId(String value);


    /**
     * <p>anonymous complex type��Java�N���X�B
     * 
     * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}asset" minOccurs="0"/>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}image"/>
     *           &lt;element name="newparam" type="{http://www.collada.org/2005/11/COLLADASchema}common_newparam_type"/>
     *         &lt;/choice>
     *         &lt;choice>
     *           &lt;element name="constant">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="emission" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
     *                     &lt;element name="reflective" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
     *                     &lt;element name="reflectivity" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
     *                     &lt;element name="transparent" type="{http://www.collada.org/2005/11/COLLADASchema}common_transparent_type" minOccurs="0"/>
     *                     &lt;element name="transparency" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
     *                     &lt;element name="index_of_refraction" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="lambert">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="emission" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
     *                     &lt;element name="ambient" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
     *                     &lt;element name="diffuse" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
     *                     &lt;element name="reflective" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
     *                     &lt;element name="reflectivity" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
     *                     &lt;element name="transparent" type="{http://www.collada.org/2005/11/COLLADASchema}common_transparent_type" minOccurs="0"/>
     *                     &lt;element name="transparency" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
     *                     &lt;element name="index_of_refraction" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="phong">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="emission" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
     *                     &lt;element name="ambient" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
     *                     &lt;element name="diffuse" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
     *                     &lt;element name="specular" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
     *                     &lt;element name="shininess" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
     *                     &lt;element name="reflective" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
     *                     &lt;element name="reflectivity" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
     *                     &lt;element name="transparent" type="{http://www.collada.org/2005/11/COLLADASchema}common_transparent_type" minOccurs="0"/>
     *                     &lt;element name="transparency" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
     *                     &lt;element name="index_of_refraction" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="blinn">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="emission" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
     *                     &lt;element name="ambient" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
     *                     &lt;element name="diffuse" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
     *                     &lt;element name="specular" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
     *                     &lt;element name="shininess" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
     *                     &lt;element name="reflective" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
     *                     &lt;element name="reflectivity" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
     *                     &lt;element name="transparent" type="{http://www.collada.org/2005/11/COLLADASchema}common_transparent_type" minOccurs="0"/>
     *                     &lt;element name="transparency" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
     *                     &lt;element name="index_of_refraction" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
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
         * asset�v���p�e�B�̒l��ݒ肵�܂��B
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
         * {@link CommonNewparamType }
         * 
         * 
         */
        List<Object> getImagesAndNewparams();

        /**
         * blinn�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link ProfileCOMMON.Technique.Blinn }
         *     
         */
        ProfileCOMMON.Technique.Blinn getBlinn();

        /**
         * blinn�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link ProfileCOMMON.Technique.Blinn }
         *     
         */
        void setBlinn(ProfileCOMMON.Technique.Blinn value);

        /**
         * phong�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link ProfileCOMMON.Technique.Phong }
         *     
         */
        ProfileCOMMON.Technique.Phong getPhong();

        /**
         * phong�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link ProfileCOMMON.Technique.Phong }
         *     
         */
        void setPhong(ProfileCOMMON.Technique.Phong value);

        /**
         * lambert�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link ProfileCOMMON.Technique.Lambert }
         *     
         */
        ProfileCOMMON.Technique.Lambert getLambert();

        /**
         * lambert�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link ProfileCOMMON.Technique.Lambert }
         *     
         */
        void setLambert(ProfileCOMMON.Technique.Lambert value);

        /**
         * constant�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link ProfileCOMMON.Technique.Constant }
         *     
         */
        ProfileCOMMON.Technique.Constant getConstant();

        /**
         * constant�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link ProfileCOMMON.Technique.Constant }
         *     
         */
        void setConstant(ProfileCOMMON.Technique.Constant value);

        /**
         * 
         * 									The extra element may appear any number of times.
         * 									Gets the value of the extras property.
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
         * id�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getId();

        /**
         * id�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setId(String value);

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


        /**
         * <p>anonymous complex type��Java�N���X�B
         * 
         * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="emission" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
         *         &lt;element name="ambient" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
         *         &lt;element name="diffuse" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
         *         &lt;element name="specular" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
         *         &lt;element name="shininess" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
         *         &lt;element name="reflective" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
         *         &lt;element name="reflectivity" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
         *         &lt;element name="transparent" type="{http://www.collada.org/2005/11/COLLADASchema}common_transparent_type" minOccurs="0"/>
         *         &lt;element name="transparency" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
         *         &lt;element name="index_of_refraction" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface Blinn {


            /**
             * emission�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getEmission();

            /**
             * emission�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setEmission(CommonColorOrTextureType value);

            /**
             * ambient�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getAmbient();

            /**
             * ambient�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setAmbient(CommonColorOrTextureType value);

            /**
             * diffuse�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getDiffuse();

            /**
             * diffuse�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setDiffuse(CommonColorOrTextureType value);

            /**
             * specular�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getSpecular();

            /**
             * specular�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setSpecular(CommonColorOrTextureType value);

            /**
             * shininess�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getShininess();

            /**
             * shininess�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setShininess(CommonFloatOrParamType value);

            /**
             * reflective�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getReflective();

            /**
             * reflective�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setReflective(CommonColorOrTextureType value);

            /**
             * reflectivity�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getReflectivity();

            /**
             * reflectivity�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setReflectivity(CommonFloatOrParamType value);

            /**
             * transparent�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonTransparentType }
             *     
             */
            CommonTransparentType getTransparent();

            /**
             * transparent�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonTransparentType }
             *     
             */
            void setTransparent(CommonTransparentType value);

            /**
             * transparency�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getTransparency();

            /**
             * transparency�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setTransparency(CommonFloatOrParamType value);

            /**
             * indexOfRefraction�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getIndexOfRefraction();

            /**
             * indexOfRefraction�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setIndexOfRefraction(CommonFloatOrParamType value);

        }


        /**
         * <p>anonymous complex type��Java�N���X�B
         * 
         * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="emission" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
         *         &lt;element name="reflective" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
         *         &lt;element name="reflectivity" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
         *         &lt;element name="transparent" type="{http://www.collada.org/2005/11/COLLADASchema}common_transparent_type" minOccurs="0"/>
         *         &lt;element name="transparency" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
         *         &lt;element name="index_of_refraction" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface Constant {


            /**
             * emission�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getEmission();

            /**
             * emission�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setEmission(CommonColorOrTextureType value);

            /**
             * reflective�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getReflective();

            /**
             * reflective�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setReflective(CommonColorOrTextureType value);

            /**
             * reflectivity�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getReflectivity();

            /**
             * reflectivity�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setReflectivity(CommonFloatOrParamType value);

            /**
             * transparent�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonTransparentType }
             *     
             */
            CommonTransparentType getTransparent();

            /**
             * transparent�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonTransparentType }
             *     
             */
            void setTransparent(CommonTransparentType value);

            /**
             * transparency�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getTransparency();

            /**
             * transparency�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setTransparency(CommonFloatOrParamType value);

            /**
             * indexOfRefraction�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getIndexOfRefraction();

            /**
             * indexOfRefraction�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setIndexOfRefraction(CommonFloatOrParamType value);

        }


        /**
         * <p>anonymous complex type��Java�N���X�B
         * 
         * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="emission" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
         *         &lt;element name="ambient" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
         *         &lt;element name="diffuse" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
         *         &lt;element name="reflective" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
         *         &lt;element name="reflectivity" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
         *         &lt;element name="transparent" type="{http://www.collada.org/2005/11/COLLADASchema}common_transparent_type" minOccurs="0"/>
         *         &lt;element name="transparency" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
         *         &lt;element name="index_of_refraction" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface Lambert {


            /**
             * emission�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getEmission();

            /**
             * emission�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setEmission(CommonColorOrTextureType value);

            /**
             * ambient�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getAmbient();

            /**
             * ambient�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setAmbient(CommonColorOrTextureType value);

            /**
             * diffuse�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getDiffuse();

            /**
             * diffuse�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setDiffuse(CommonColorOrTextureType value);

            /**
             * reflective�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getReflective();

            /**
             * reflective�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setReflective(CommonColorOrTextureType value);

            /**
             * reflectivity�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getReflectivity();

            /**
             * reflectivity�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setReflectivity(CommonFloatOrParamType value);

            /**
             * transparent�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonTransparentType }
             *     
             */
            CommonTransparentType getTransparent();

            /**
             * transparent�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonTransparentType }
             *     
             */
            void setTransparent(CommonTransparentType value);

            /**
             * transparency�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getTransparency();

            /**
             * transparency�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setTransparency(CommonFloatOrParamType value);

            /**
             * indexOfRefraction�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getIndexOfRefraction();

            /**
             * indexOfRefraction�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setIndexOfRefraction(CommonFloatOrParamType value);

        }


        /**
         * <p>anonymous complex type��Java�N���X�B
         * 
         * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="emission" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
         *         &lt;element name="ambient" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
         *         &lt;element name="diffuse" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
         *         &lt;element name="specular" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
         *         &lt;element name="shininess" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
         *         &lt;element name="reflective" type="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type" minOccurs="0"/>
         *         &lt;element name="reflectivity" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
         *         &lt;element name="transparent" type="{http://www.collada.org/2005/11/COLLADASchema}common_transparent_type" minOccurs="0"/>
         *         &lt;element name="transparency" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
         *         &lt;element name="index_of_refraction" type="{http://www.collada.org/2005/11/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface Phong {


            /**
             * emission�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getEmission();

            /**
             * emission�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setEmission(CommonColorOrTextureType value);

            /**
             * ambient�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getAmbient();

            /**
             * ambient�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setAmbient(CommonColorOrTextureType value);

            /**
             * diffuse�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getDiffuse();

            /**
             * diffuse�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setDiffuse(CommonColorOrTextureType value);

            /**
             * specular�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getSpecular();

            /**
             * specular�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setSpecular(CommonColorOrTextureType value);

            /**
             * shininess�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getShininess();

            /**
             * shininess�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setShininess(CommonFloatOrParamType value);

            /**
             * reflective�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getReflective();

            /**
             * reflective�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setReflective(CommonColorOrTextureType value);

            /**
             * reflectivity�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getReflectivity();

            /**
             * reflectivity�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setReflectivity(CommonFloatOrParamType value);

            /**
             * transparent�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonTransparentType }
             *     
             */
            CommonTransparentType getTransparent();

            /**
             * transparent�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonTransparentType }
             *     
             */
            void setTransparent(CommonTransparentType value);

            /**
             * transparency�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getTransparency();

            /**
             * transparency�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setTransparency(CommonFloatOrParamType value);

            /**
             * indexOfRefraction�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getIndexOfRefraction();

            /**
             * indexOfRefraction�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setIndexOfRefraction(CommonFloatOrParamType value);

        }

    }

}
