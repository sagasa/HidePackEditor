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
 *         &lt;element name="optics">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="technique_common">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="orthographic">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;sequence>
 *                                           &lt;element name="xmag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                           &lt;choice minOccurs="0">
 *                                             &lt;element name="ymag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                             &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                           &lt;/choice>
 *                                         &lt;/sequence>
 *                                         &lt;sequence>
 *                                           &lt;element name="ymag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                           &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                                         &lt;/sequence>
 *                                       &lt;/choice>
 *                                       &lt;element name="znear" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                       &lt;element name="zfar" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="perspective">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;sequence>
 *                                           &lt;element name="xfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                           &lt;choice minOccurs="0">
 *                                             &lt;element name="yfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                             &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                           &lt;/choice>
 *                                         &lt;/sequence>
 *                                         &lt;sequence>
 *                                           &lt;element name="yfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                           &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                                         &lt;/sequence>
 *                                       &lt;/choice>
 *                                       &lt;element name="znear" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                       &lt;element name="zfar" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}technique" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="imager" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}technique" maxOccurs="unbounded"/>
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
public interface Camera {


    /**
     * 
     * 						The camera element may contain an asset element.
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
     * optics�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link Camera.Optics }
     *     
     */
    Camera.Optics getOptics();

    /**
     * optics�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link Camera.Optics }
     *     
     */
    void setOptics(Camera.Optics value);

    /**
     * imager�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link Camera.Imager }
     *     
     */
    Camera.Imager getImager();

    /**
     * imager�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link Camera.Imager }
     *     
     */
    void setImager(Camera.Imager value);

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
     *       &lt;sequence>
     *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}technique" maxOccurs="unbounded"/>
     *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface Imager {


        /**
         * 
         * 									This element may contain any number of non-common profile techniques.
         * 									There is no common technique for imager.
         * 									Gets the value of the techniques property.
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
     *         &lt;element name="technique_common">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="orthographic">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;sequence>
     *                                 &lt;element name="xmag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                                 &lt;choice minOccurs="0">
     *                                   &lt;element name="ymag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                                   &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                                 &lt;/choice>
     *                               &lt;/sequence>
     *                               &lt;sequence>
     *                                 &lt;element name="ymag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                                 &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *                               &lt;/sequence>
     *                             &lt;/choice>
     *                             &lt;element name="znear" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                             &lt;element name="zfar" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="perspective">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;sequence>
     *                                 &lt;element name="xfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                                 &lt;choice minOccurs="0">
     *                                   &lt;element name="yfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                                   &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                                 &lt;/choice>
     *                               &lt;/sequence>
     *                               &lt;sequence>
     *                                 &lt;element name="yfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                                 &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *                               &lt;/sequence>
     *                             &lt;/choice>
     *                             &lt;element name="znear" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
     *                             &lt;element name="zfar" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface Optics {


        /**
         * techniqueCommon�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link Camera.Optics.TechniqueCommon }
         *     
         */
        Camera.Optics.TechniqueCommon getTechniqueCommon();

        /**
         * techniqueCommon�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link Camera.Optics.TechniqueCommon }
         *     
         */
        void setTechniqueCommon(Camera.Optics.TechniqueCommon value);

        /**
         * 
         * 									This element may contain any number of non-common profile techniques.
         * 									Gets the value of the techniques property.
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
         * <p>anonymous complex type��Java�N���X�B
         * 
         * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;choice>
         *         &lt;element name="orthographic">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;sequence>
         *                       &lt;element name="xmag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                       &lt;choice minOccurs="0">
         *                         &lt;element name="ymag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                         &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                       &lt;/choice>
         *                     &lt;/sequence>
         *                     &lt;sequence>
         *                       &lt;element name="ymag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                       &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
         *                     &lt;/sequence>
         *                   &lt;/choice>
         *                   &lt;element name="znear" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                   &lt;element name="zfar" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="perspective">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;sequence>
         *                       &lt;element name="xfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                       &lt;choice minOccurs="0">
         *                         &lt;element name="yfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                         &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                       &lt;/choice>
         *                     &lt;/sequence>
         *                     &lt;sequence>
         *                       &lt;element name="yfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                       &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
         *                     &lt;/sequence>
         *                   &lt;/choice>
         *                   &lt;element name="znear" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
         *                   &lt;element name="zfar" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
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
             * perspective�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link Camera.Optics.TechniqueCommon.Perspective }
             *     
             */
            Camera.Optics.TechniqueCommon.Perspective getPerspective();

            /**
             * perspective�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link Camera.Optics.TechniqueCommon.Perspective }
             *     
             */
            void setPerspective(Camera.Optics.TechniqueCommon.Perspective value);

            /**
             * orthographic�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link Camera.Optics.TechniqueCommon.Orthographic }
             *     
             */
            Camera.Optics.TechniqueCommon.Orthographic getOrthographic();

            /**
             * orthographic�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link Camera.Optics.TechniqueCommon.Orthographic }
             *     
             */
            void setOrthographic(Camera.Optics.TechniqueCommon.Orthographic value);


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
             *         &lt;choice>
             *           &lt;sequence>
             *             &lt;element name="xmag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *             &lt;choice minOccurs="0">
             *               &lt;element name="ymag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *               &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *             &lt;/choice>
             *           &lt;/sequence>
             *           &lt;sequence>
             *             &lt;element name="ymag" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *             &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
             *           &lt;/sequence>
             *         &lt;/choice>
             *         &lt;element name="znear" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *         &lt;element name="zfar" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface Orthographic {


                /**
                 * xmag�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getXmag();

                /**
                 * xmag�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setXmag(TargetableFloat value);

                /**
                 * ymag�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getYmag();

                /**
                 * ymag�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setYmag(TargetableFloat value);

                /**
                 * aspectRatio�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getAspectRatio();

                /**
                 * aspectRatio�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setAspectRatio(TargetableFloat value);

                /**
                 * znear�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getZnear();

                /**
                 * znear�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setZnear(TargetableFloat value);

                /**
                 * zfar�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getZfar();

                /**
                 * zfar�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setZfar(TargetableFloat value);

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
             *         &lt;choice>
             *           &lt;sequence>
             *             &lt;element name="xfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *             &lt;choice minOccurs="0">
             *               &lt;element name="yfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *               &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *             &lt;/choice>
             *           &lt;/sequence>
             *           &lt;sequence>
             *             &lt;element name="yfov" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *             &lt;element name="aspect_ratio" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
             *           &lt;/sequence>
             *         &lt;/choice>
             *         &lt;element name="znear" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *         &lt;element name="zfar" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface Perspective {


                /**
                 * xfov�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getXfov();

                /**
                 * xfov�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setXfov(TargetableFloat value);

                /**
                 * yfov�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getYfov();

                /**
                 * yfov�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setYfov(TargetableFloat value);

                /**
                 * aspectRatio�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getAspectRatio();

                /**
                 * aspectRatio�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setAspectRatio(TargetableFloat value);

                /**
                 * znear�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getZnear();

                /**
                 * znear�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setZnear(TargetableFloat value);

                /**
                 * zfar�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getZfar();

                /**
                 * zfar�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setZfar(TargetableFloat value);

            }

        }

    }

}
