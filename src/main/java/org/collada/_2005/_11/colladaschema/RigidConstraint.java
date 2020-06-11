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
 *         &lt;element name="ref_attachment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}translate"/>
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}rotate"/>
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/choice>
 *                 &lt;attribute name="rigid_body" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attachment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}translate"/>
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}rotate"/>
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/choice>
 *                 &lt;attribute name="rigid_body" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="technique_common">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="enabled" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.collada.org/2005/11/COLLADASchema>bool">
 *                           &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="interpenetrate" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.collada.org/2005/11/COLLADASchema>bool">
 *                           &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="limits" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="swing_cone_and_twist" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="min" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3" minOccurs="0"/>
 *                                       &lt;element name="max" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="linear" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="min" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3" minOccurs="0"/>
 *                                       &lt;element name="max" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="spring" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="angular" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="stiffness" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                                       &lt;element name="damping" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                                       &lt;element name="target_value" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="linear" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="stiffness" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                                       &lt;element name="damping" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                                       &lt;element name="target_value" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}technique" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sid" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface RigidConstraint {


    /**
     * refAttachment�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link RigidConstraint.RefAttachment }
     *     
     */
    RigidConstraint.RefAttachment getRefAttachment();

    /**
     * refAttachment�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link RigidConstraint.RefAttachment }
     *     
     */
    void setRefAttachment(RigidConstraint.RefAttachment value);

    /**
     * attachment�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link RigidConstraint.Attachment }
     *     
     */
    RigidConstraint.Attachment getAttachment();

    /**
     * attachment�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link RigidConstraint.Attachment }
     *     
     */
    void setAttachment(RigidConstraint.Attachment value);

    /**
     * techniqueCommon�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link RigidConstraint.TechniqueCommon }
     *     
     */
    RigidConstraint.TechniqueCommon getTechniqueCommon();

    /**
     * techniqueCommon�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link RigidConstraint.TechniqueCommon }
     *     
     */
    void setTechniqueCommon(RigidConstraint.TechniqueCommon value);

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
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}translate"/>
     *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}rotate"/>
     *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/choice>
     *       &lt;attribute name="rigid_body" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface Attachment {


        /**
         * 
         * 									Allows you to "position" the attachment point.
         * 									Gets the value of the translatesAndRotatesAndExtras property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the translatesAndRotatesAndExtras property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTranslatesAndRotatesAndExtras().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TargetableFloat3 }
         * {@link Rotate }
         * {@link Extra }
         * 
         * 
         */
        List<Object> getTranslatesAndRotatesAndExtras();

        /**
         * rigidBody�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getRigidBody();

        /**
         * rigidBody�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setRigidBody(String value);

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
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}translate"/>
     *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}rotate"/>
     *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/choice>
     *       &lt;attribute name="rigid_body" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface RefAttachment {


        /**
         * 
         * 									Allows you to "position" the attachment point.
         * 									Gets the value of the translatesAndRotatesAndExtras property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the translatesAndRotatesAndExtras property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTranslatesAndRotatesAndExtras().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TargetableFloat3 }
         * {@link Rotate }
         * {@link Extra }
         * 
         * 
         */
        List<Object> getTranslatesAndRotatesAndExtras();

        /**
         * rigidBody�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getRigidBody();

        /**
         * rigidBody�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setRigidBody(String value);

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
     *         &lt;element name="enabled" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.collada.org/2005/11/COLLADASchema>bool">
     *                 &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="interpenetrate" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.collada.org/2005/11/COLLADASchema>bool">
     *                 &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="limits" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="swing_cone_and_twist" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="min" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3" minOccurs="0"/>
     *                             &lt;element name="max" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="linear" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="min" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3" minOccurs="0"/>
     *                             &lt;element name="max" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="spring" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="angular" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="stiffness" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *                             &lt;element name="damping" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *                             &lt;element name="target_value" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="linear" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="stiffness" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *                             &lt;element name="damping" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *                             &lt;element name="target_value" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface TechniqueCommon {


        /**
         * enabled�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link RigidConstraint.TechniqueCommon.Enabled }
         *     
         */
        RigidConstraint.TechniqueCommon.Enabled getEnabled();

        /**
         * enabled�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link RigidConstraint.TechniqueCommon.Enabled }
         *     
         */
        void setEnabled(RigidConstraint.TechniqueCommon.Enabled value);

        /**
         * interpenetrate�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link RigidConstraint.TechniqueCommon.Interpenetrate }
         *     
         */
        RigidConstraint.TechniqueCommon.Interpenetrate getInterpenetrate();

        /**
         * interpenetrate�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link RigidConstraint.TechniqueCommon.Interpenetrate }
         *     
         */
        void setInterpenetrate(RigidConstraint.TechniqueCommon.Interpenetrate value);

        /**
         * limits�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link RigidConstraint.TechniqueCommon.Limits }
         *     
         */
        RigidConstraint.TechniqueCommon.Limits getLimits();

        /**
         * limits�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link RigidConstraint.TechniqueCommon.Limits }
         *     
         */
        void setLimits(RigidConstraint.TechniqueCommon.Limits value);

        /**
         * spring�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link RigidConstraint.TechniqueCommon.Spring }
         *     
         */
        RigidConstraint.TechniqueCommon.Spring getSpring();

        /**
         * spring�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link RigidConstraint.TechniqueCommon.Spring }
         *     
         */
        void setSpring(RigidConstraint.TechniqueCommon.Spring value);


        /**
         * <p>anonymous complex type��Java�N���X�B
         * 
         * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.collada.org/2005/11/COLLADASchema>bool">
         *       &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface Enabled {


            /**
             * value�v���p�e�B�̒l���擾���܂��B
             * 
             */
            boolean isValue();

            /**
             * value�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             */
            void setValue(boolean value);

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
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.collada.org/2005/11/COLLADASchema>bool">
         *       &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface Interpenetrate {


            /**
             * value�v���p�e�B�̒l���擾���܂��B
             * 
             */
            boolean isValue();

            /**
             * value�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             */
            void setValue(boolean value);

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
         *       &lt;sequence>
         *         &lt;element name="swing_cone_and_twist" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="min" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3" minOccurs="0"/>
         *                   &lt;element name="max" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="linear" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="min" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3" minOccurs="0"/>
         *                   &lt;element name="max" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface Limits {


            /**
             * swingConeAndTwist�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link RigidConstraint.TechniqueCommon.Limits.SwingConeAndTwist }
             *     
             */
            RigidConstraint.TechniqueCommon.Limits.SwingConeAndTwist getSwingConeAndTwist();

            /**
             * swingConeAndTwist�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link RigidConstraint.TechniqueCommon.Limits.SwingConeAndTwist }
             *     
             */
            void setSwingConeAndTwist(RigidConstraint.TechniqueCommon.Limits.SwingConeAndTwist value);

            /**
             * linear�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link RigidConstraint.TechniqueCommon.Limits.Linear }
             *     
             */
            RigidConstraint.TechniqueCommon.Limits.Linear getLinear();

            /**
             * linear�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link RigidConstraint.TechniqueCommon.Limits.Linear }
             *     
             */
            void setLinear(RigidConstraint.TechniqueCommon.Limits.Linear value);


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
             *         &lt;element name="min" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3" minOccurs="0"/>
             *         &lt;element name="max" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface Linear {


                /**
                 * min�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat3 }
                 *     
                 */
                TargetableFloat3 getMin();

                /**
                 * min�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat3 }
                 *     
                 */
                void setMin(TargetableFloat3 value);

                /**
                 * max�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat3 }
                 *     
                 */
                TargetableFloat3 getMax();

                /**
                 * max�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat3 }
                 *     
                 */
                void setMax(TargetableFloat3 value);

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
             *         &lt;element name="min" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3" minOccurs="0"/>
             *         &lt;element name="max" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface SwingConeAndTwist {


                /**
                 * min�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat3 }
                 *     
                 */
                TargetableFloat3 getMin();

                /**
                 * min�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat3 }
                 *     
                 */
                void setMin(TargetableFloat3 value);

                /**
                 * max�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat3 }
                 *     
                 */
                TargetableFloat3 getMax();

                /**
                 * max�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat3 }
                 *     
                 */
                void setMax(TargetableFloat3 value);

            }

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
         *         &lt;element name="angular" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="stiffness" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
         *                   &lt;element name="damping" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
         *                   &lt;element name="target_value" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="linear" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="stiffness" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
         *                   &lt;element name="damping" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
         *                   &lt;element name="target_value" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface Spring {


            /**
             * angular�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link RigidConstraint.TechniqueCommon.Spring.Angular }
             *     
             */
            RigidConstraint.TechniqueCommon.Spring.Angular getAngular();

            /**
             * angular�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link RigidConstraint.TechniqueCommon.Spring.Angular }
             *     
             */
            void setAngular(RigidConstraint.TechniqueCommon.Spring.Angular value);

            /**
             * linear�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link RigidConstraint.TechniqueCommon.Spring.Linear }
             *     
             */
            RigidConstraint.TechniqueCommon.Spring.Linear getLinear();

            /**
             * linear�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link RigidConstraint.TechniqueCommon.Spring.Linear }
             *     
             */
            void setLinear(RigidConstraint.TechniqueCommon.Spring.Linear value);


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
             *         &lt;element name="stiffness" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
             *         &lt;element name="damping" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
             *         &lt;element name="target_value" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface Angular {


                /**
                 * stiffness�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getStiffness();

                /**
                 * stiffness�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setStiffness(TargetableFloat value);

                /**
                 * damping�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getDamping();

                /**
                 * damping�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setDamping(TargetableFloat value);

                /**
                 * targetValue�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getTargetValue();

                /**
                 * targetValue�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setTargetValue(TargetableFloat value);

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
             *         &lt;element name="stiffness" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
             *         &lt;element name="damping" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
             *         &lt;element name="target_value" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface Linear {


                /**
                 * stiffness�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getStiffness();

                /**
                 * stiffness�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setStiffness(TargetableFloat value);

                /**
                 * damping�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getDamping();

                /**
                 * damping�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setDamping(TargetableFloat value);

                /**
                 * targetValue�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getTargetValue();

                /**
                 * targetValue�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setTargetValue(TargetableFloat value);

            }

        }

    }

}
