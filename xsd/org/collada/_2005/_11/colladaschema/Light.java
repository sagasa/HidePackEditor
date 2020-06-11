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
 *         &lt;element name="technique_common">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="ambient">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="color" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="directional">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="color" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="point">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="color" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3"/>
 *                             &lt;element name="constant_attenuation" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                             &lt;element name="linear_attenuation" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                             &lt;element name="quadratic_attenuation" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="spot">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="color" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3"/>
 *                             &lt;element name="constant_attenuation" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                             &lt;element name="linear_attenuation" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                             &lt;element name="quadratic_attenuation" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                             &lt;element name="falloff_angle" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                             &lt;element name="falloff_exponent" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}technique" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Light {


    /**
     * 
     * 						The light element may contain an asset element.
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
     * techniqueCommon�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link Light.TechniqueCommon }
     *     
     */
    Light.TechniqueCommon getTechniqueCommon();

    /**
     * techniqueCommon�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link Light.TechniqueCommon }
     *     
     */
    void setTechniqueCommon(Light.TechniqueCommon value);

    /**
     * 
     * 						This element may contain any number of non-common profile techniques.
     * 						Gets the value of the techniques property.
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
     * {@link Technique }
     * 
     * 
     */
    List<Technique> getTechniques();

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
     * name�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getName();

    /**
     * name�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setName(String value);


    /**
     * <p>anonymous complex type��Java�N���X�B
     * 
     * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="ambient">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="color" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="directional">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="color" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="point">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="color" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3"/>
     *                   &lt;element name="constant_attenuation" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *                   &lt;element name="linear_attenuation" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *                   &lt;element name="quadratic_attenuation" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="spot">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="color" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3"/>
     *                   &lt;element name="constant_attenuation" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *                   &lt;element name="linear_attenuation" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *                   &lt;element name="quadratic_attenuation" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *                   &lt;element name="falloff_angle" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *                   &lt;element name="falloff_exponent" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *                 &lt;/sequence>
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
    public interface TechniqueCommon {


        /**
         * spot�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link Light.TechniqueCommon.Spot }
         *     
         */
        Light.TechniqueCommon.Spot getSpot();

        /**
         * spot�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link Light.TechniqueCommon.Spot }
         *     
         */
        void setSpot(Light.TechniqueCommon.Spot value);

        /**
         * point�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link Light.TechniqueCommon.Point }
         *     
         */
        Light.TechniqueCommon.Point getPoint();

        /**
         * point�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link Light.TechniqueCommon.Point }
         *     
         */
        void setPoint(Light.TechniqueCommon.Point value);

        /**
         * directional�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link Light.TechniqueCommon.Directional }
         *     
         */
        Light.TechniqueCommon.Directional getDirectional();

        /**
         * directional�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link Light.TechniqueCommon.Directional }
         *     
         */
        void setDirectional(Light.TechniqueCommon.Directional value);

        /**
         * ambient�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link Light.TechniqueCommon.Ambient }
         *     
         */
        Light.TechniqueCommon.Ambient getAmbient();

        /**
         * ambient�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link Light.TechniqueCommon.Ambient }
         *     
         */
        void setAmbient(Light.TechniqueCommon.Ambient value);


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
         *         &lt;element name="color" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface Ambient {


            /**
             * color�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloat3 }
             *     
             */
            TargetableFloat3 getColor();

            /**
             * color�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloat3 }
             *     
             */
            void setColor(TargetableFloat3 value);

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
         *         &lt;element name="color" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface Directional {


            /**
             * color�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloat3 }
             *     
             */
            TargetableFloat3 getColor();

            /**
             * color�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloat3 }
             *     
             */
            void setColor(TargetableFloat3 value);

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
         *         &lt;element name="color" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3"/>
         *         &lt;element name="constant_attenuation" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
         *         &lt;element name="linear_attenuation" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
         *         &lt;element name="quadratic_attenuation" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface Point {


            /**
             * color�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloat3 }
             *     
             */
            TargetableFloat3 getColor();

            /**
             * color�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloat3 }
             *     
             */
            void setColor(TargetableFloat3 value);

            /**
             * constantAttenuation�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloat }
             *     
             */
            TargetableFloat getConstantAttenuation();

            /**
             * constantAttenuation�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloat }
             *     
             */
            void setConstantAttenuation(TargetableFloat value);

            /**
             * linearAttenuation�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloat }
             *     
             */
            TargetableFloat getLinearAttenuation();

            /**
             * linearAttenuation�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloat }
             *     
             */
            void setLinearAttenuation(TargetableFloat value);

            /**
             * quadraticAttenuation�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloat }
             *     
             */
            TargetableFloat getQuadraticAttenuation();

            /**
             * quadraticAttenuation�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloat }
             *     
             */
            void setQuadraticAttenuation(TargetableFloat value);

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
         *         &lt;element name="color" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3"/>
         *         &lt;element name="constant_attenuation" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
         *         &lt;element name="linear_attenuation" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
         *         &lt;element name="quadratic_attenuation" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
         *         &lt;element name="falloff_angle" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
         *         &lt;element name="falloff_exponent" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface Spot {


            /**
             * color�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloat3 }
             *     
             */
            TargetableFloat3 getColor();

            /**
             * color�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloat3 }
             *     
             */
            void setColor(TargetableFloat3 value);

            /**
             * constantAttenuation�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloat }
             *     
             */
            TargetableFloat getConstantAttenuation();

            /**
             * constantAttenuation�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloat }
             *     
             */
            void setConstantAttenuation(TargetableFloat value);

            /**
             * linearAttenuation�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloat }
             *     
             */
            TargetableFloat getLinearAttenuation();

            /**
             * linearAttenuation�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloat }
             *     
             */
            void setLinearAttenuation(TargetableFloat value);

            /**
             * quadraticAttenuation�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloat }
             *     
             */
            TargetableFloat getQuadraticAttenuation();

            /**
             * quadraticAttenuation�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloat }
             *     
             */
            void setQuadraticAttenuation(TargetableFloat value);

            /**
             * falloffAngle�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloat }
             *     
             */
            TargetableFloat getFalloffAngle();

            /**
             * falloffAngle�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloat }
             *     
             */
            void setFalloffAngle(TargetableFloat value);

            /**
             * falloffExponent�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloat }
             *     
             */
            TargetableFloat getFalloffExponent();

            /**
             * falloffExponent�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloat }
             *     
             */
            void setFalloffExponent(TargetableFloat value);

        }

    }

}
