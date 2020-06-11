//
// ���̃t�@�C���́AJavaTM Architecture for XML Binding(JAXB) Reference Implementation�Av2.2.8-b130911.1802�ɂ���Đ�������܂��� 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>���Q�Ƃ��Ă������� 
// �\�[�X�E�X�L�[�}�̍ăR���p�C�����ɂ��̃t�@�C���̕ύX�͎����܂��B 
// ������: 2020.05.28 ���� 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;

import java.util.List;


/**
 * <p>common_color_or_texture_type complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * 
 * <pre>
 * &lt;complexType name="common_color_or_texture_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="color">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.collada.org/2005/11/COLLADASchema>fx_color_common">
 *                 &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="param">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="texture">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="texture" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                 &lt;attribute name="texcoord" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface CommonColorOrTextureType {


    /**
     * texture�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link CommonColorOrTextureType.Texture }
     *     
     */
    CommonColorOrTextureType.Texture getTexture();

    /**
     * texture�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link CommonColorOrTextureType.Texture }
     *     
     */
    void setTexture(CommonColorOrTextureType.Texture value);

    /**
     * param�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link CommonColorOrTextureType.Param }
     *     
     */
    CommonColorOrTextureType.Param getParam();

    /**
     * param�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link CommonColorOrTextureType.Param }
     *     
     */
    void setParam(CommonColorOrTextureType.Param value);

    /**
     * color�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link CommonColorOrTextureType.Color }
     *     
     */
    CommonColorOrTextureType.Color getColor();

    /**
     * color�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link CommonColorOrTextureType.Color }
     *     
     */
    void setColor(CommonColorOrTextureType.Color value);


    /**
     * <p>anonymous complex type��Java�N���X�B
     * 
     * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.collada.org/2005/11/COLLADASchema>fx_color_common">
     *       &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface Color {


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


    /**
     * <p>anonymous complex type��Java�N���X�B
     * 
     * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
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
         * ref�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getRef();

        /**
         * ref�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setRef(String value);

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
     *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="texture" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *       &lt;attribute name="texcoord" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface Texture {


        /**
         * extra�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link Extra }
         *     
         */
        Extra getExtra();

        /**
         * extra�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link Extra }
         *     
         */
        void setExtra(Extra value);

        /**
         * texture�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getTexture();

        /**
         * texture�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setTexture(String value);

        /**
         * texcoord�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getTexcoord();

        /**
         * texcoord�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setTexcoord(String value);

    }

}
