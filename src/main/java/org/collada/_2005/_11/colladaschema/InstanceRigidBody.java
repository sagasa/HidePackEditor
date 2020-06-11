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
 *         &lt;element name="technique_common">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="angular_velocity" type="{http://www.collada.org/2005/11/COLLADASchema}float3" minOccurs="0"/>
 *                   &lt;element name="velocity" type="{http://www.collada.org/2005/11/COLLADASchema}float3" minOccurs="0"/>
 *                   &lt;element name="dynamic" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.collada.org/2005/11/COLLADASchema>bool">
 *                           &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="mass" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                   &lt;element name="mass_frame" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice maxOccurs="unbounded">
 *                             &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}translate"/>
 *                             &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}rotate"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="inertia" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3" minOccurs="0"/>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}instance_physics_material"/>
 *                     &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}physics_material"/>
 *                   &lt;/choice>
 *                   &lt;element name="shape" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="hollow" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.collada.org/2005/11/COLLADASchema>bool">
 *                                     &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="mass" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                             &lt;element name="density" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
 *                             &lt;choice minOccurs="0">
 *                               &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}instance_physics_material"/>
 *                               &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}physics_material"/>
 *                             &lt;/choice>
 *                             &lt;choice>
 *                               &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}instance_geometry"/>
 *                               &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}plane"/>
 *                               &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}box"/>
 *                               &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}sphere"/>
 *                               &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}cylinder"/>
 *                               &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}tapered_cylinder"/>
 *                               &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}capsule"/>
 *                               &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}tapered_capsule"/>
 *                             &lt;/choice>
 *                             &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                               &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}translate"/>
 *                               &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}rotate"/>
 *                             &lt;/choice>
 *                             &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
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
 *       &lt;attribute name="body" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface InstanceRigidBody {


    /**
     * techniqueCommon�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link InstanceRigidBody.TechniqueCommon }
     *     
     */
    InstanceRigidBody.TechniqueCommon getTechniqueCommon();

    /**
     * techniqueCommon�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceRigidBody.TechniqueCommon }
     *     
     */
    void setTechniqueCommon(InstanceRigidBody.TechniqueCommon value);

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
     * body�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getBody();

    /**
     * body�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBody(String value);

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
     * target�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTarget();

    /**
     * target�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTarget(String value);


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
     *         &lt;element name="angular_velocity" type="{http://www.collada.org/2005/11/COLLADASchema}float3" minOccurs="0"/>
     *         &lt;element name="velocity" type="{http://www.collada.org/2005/11/COLLADASchema}float3" minOccurs="0"/>
     *         &lt;element name="dynamic" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.collada.org/2005/11/COLLADASchema>bool">
     *                 &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="mass" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *         &lt;element name="mass_frame" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice maxOccurs="unbounded">
     *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}translate"/>
     *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}rotate"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="inertia" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat3" minOccurs="0"/>
     *         &lt;choice minOccurs="0">
     *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}instance_physics_material"/>
     *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}physics_material"/>
     *         &lt;/choice>
     *         &lt;element name="shape" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="hollow" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.collada.org/2005/11/COLLADASchema>bool">
     *                           &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="mass" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *                   &lt;element name="density" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
     *                   &lt;choice minOccurs="0">
     *                     &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}instance_physics_material"/>
     *                     &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}physics_material"/>
     *                   &lt;/choice>
     *                   &lt;choice>
     *                     &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}instance_geometry"/>
     *                     &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}plane"/>
     *                     &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}box"/>
     *                     &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}sphere"/>
     *                     &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}cylinder"/>
     *                     &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}tapered_cylinder"/>
     *                     &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}capsule"/>
     *                     &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}tapered_capsule"/>
     *                   &lt;/choice>
     *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
     *                     &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}translate"/>
     *                     &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}rotate"/>
     *                   &lt;/choice>
     *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
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
         * Gets the value of the angularVelocity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the angularVelocity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAngularVelocity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Double }
         * 
         * 
         */
        List<Double> getAngularVelocity();

        /**
         * Gets the value of the velocity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the velocity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVelocity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Double }
         * 
         * 
         */
        List<Double> getVelocity();

        /**
         * dynamic�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link InstanceRigidBody.TechniqueCommon.Dynamic }
         *     
         */
        InstanceRigidBody.TechniqueCommon.Dynamic getDynamic();

        /**
         * dynamic�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link InstanceRigidBody.TechniqueCommon.Dynamic }
         *     
         */
        void setDynamic(InstanceRigidBody.TechniqueCommon.Dynamic value);

        /**
         * mass�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link TargetableFloat }
         *     
         */
        TargetableFloat getMass();

        /**
         * mass�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link TargetableFloat }
         *     
         */
        void setMass(TargetableFloat value);

        /**
         * massFrame�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link InstanceRigidBody.TechniqueCommon.MassFrame }
         *     
         */
        InstanceRigidBody.TechniqueCommon.MassFrame getMassFrame();

        /**
         * massFrame�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link InstanceRigidBody.TechniqueCommon.MassFrame }
         *     
         */
        void setMassFrame(InstanceRigidBody.TechniqueCommon.MassFrame value);

        /**
         * inertia�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link TargetableFloat3 }
         *     
         */
        TargetableFloat3 getInertia();

        /**
         * inertia�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link TargetableFloat3 }
         *     
         */
        void setInertia(TargetableFloat3 value);

        /**
         * physicsMaterial�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link PhysicsMaterial }
         *     
         */
        PhysicsMaterial getPhysicsMaterial();

        /**
         * physicsMaterial�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link PhysicsMaterial }
         *     
         */
        void setPhysicsMaterial(PhysicsMaterial value);

        /**
         * instancePhysicsMaterial�v���p�e�B�̒l���擾���܂��B
         * 
         * @return
         *     possible object is
         *     {@link InstanceWithExtra }
         *     
         */
        InstanceWithExtra getInstancePhysicsMaterial();

        /**
         * instancePhysicsMaterial�v���p�e�B�̒l��ݒ肵�܂��B
         * 
         * @param value
         *     allowed object is
         *     {@link InstanceWithExtra }
         *     
         */
        void setInstancePhysicsMaterial(InstanceWithExtra value);

        /**
         * Gets the value of the shapes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the shapes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getShapes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InstanceRigidBody.TechniqueCommon.Shape }
         * 
         * 
         */
        List<InstanceRigidBody.TechniqueCommon.Shape> getShapes();


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
        public interface Dynamic {


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
         *       &lt;choice maxOccurs="unbounded">
         *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}translate"/>
         *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}rotate"/>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface MassFrame {


            /**
             * Gets the value of the translatesAndRotates property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the translatesAndRotates property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTranslatesAndRotates().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TargetableFloat3 }
             * {@link Rotate }
             * 
             * 
             */
            List<Object> getTranslatesAndRotates();

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
         *         &lt;element name="hollow" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.collada.org/2005/11/COLLADASchema>bool">
         *                 &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="mass" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
         *         &lt;element name="density" type="{http://www.collada.org/2005/11/COLLADASchema}TargetableFloat" minOccurs="0"/>
         *         &lt;choice minOccurs="0">
         *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}instance_physics_material"/>
         *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}physics_material"/>
         *         &lt;/choice>
         *         &lt;choice>
         *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}instance_geometry"/>
         *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}plane"/>
         *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}box"/>
         *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}sphere"/>
         *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}cylinder"/>
         *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}tapered_cylinder"/>
         *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}capsule"/>
         *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}tapered_capsule"/>
         *         &lt;/choice>
         *         &lt;choice maxOccurs="unbounded" minOccurs="0">
         *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}translate"/>
         *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}rotate"/>
         *         &lt;/choice>
         *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface Shape {


            /**
             * hollow�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link InstanceRigidBody.TechniqueCommon.Shape.Hollow }
             *     
             */
            InstanceRigidBody.TechniqueCommon.Shape.Hollow getHollow();

            /**
             * hollow�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link InstanceRigidBody.TechniqueCommon.Shape.Hollow }
             *     
             */
            void setHollow(InstanceRigidBody.TechniqueCommon.Shape.Hollow value);

            /**
             * mass�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloat }
             *     
             */
            TargetableFloat getMass();

            /**
             * mass�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloat }
             *     
             */
            void setMass(TargetableFloat value);

            /**
             * density�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloat }
             *     
             */
            TargetableFloat getDensity();

            /**
             * density�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloat }
             *     
             */
            void setDensity(TargetableFloat value);

            /**
             * physicsMaterial�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link PhysicsMaterial }
             *     
             */
            PhysicsMaterial getPhysicsMaterial();

            /**
             * physicsMaterial�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link PhysicsMaterial }
             *     
             */
            void setPhysicsMaterial(PhysicsMaterial value);

            /**
             * instancePhysicsMaterial�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link InstanceWithExtra }
             *     
             */
            InstanceWithExtra getInstancePhysicsMaterial();

            /**
             * instancePhysicsMaterial�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link InstanceWithExtra }
             *     
             */
            void setInstancePhysicsMaterial(InstanceWithExtra value);

            /**
             * taperedCapsule�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link TaperedCapsule }
             *     
             */
            TaperedCapsule getTaperedCapsule();

            /**
             * taperedCapsule�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link TaperedCapsule }
             *     
             */
            void setTaperedCapsule(TaperedCapsule value);

            /**
             * capsule�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link Capsule }
             *     
             */
            Capsule getCapsule();

            /**
             * capsule�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link Capsule }
             *     
             */
            void setCapsule(Capsule value);

            /**
             * taperedCylinder�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link TaperedCylinder }
             *     
             */
            TaperedCylinder getTaperedCylinder();

            /**
             * taperedCylinder�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link TaperedCylinder }
             *     
             */
            void setTaperedCylinder(TaperedCylinder value);

            /**
             * cylinder�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link Cylinder }
             *     
             */
            Cylinder getCylinder();

            /**
             * cylinder�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link Cylinder }
             *     
             */
            void setCylinder(Cylinder value);

            /**
             * sphere�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link Sphere }
             *     
             */
            Sphere getSphere();

            /**
             * sphere�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link Sphere }
             *     
             */
            void setSphere(Sphere value);

            /**
             * box�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link Box }
             *     
             */
            Box getBox();

            /**
             * box�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link Box }
             *     
             */
            void setBox(Box value);

            /**
             * plane�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link Plane }
             *     
             */
            Plane getPlane();

            /**
             * plane�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link Plane }
             *     
             */
            void setPlane(Plane value);

            /**
             * instanceGeometry�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link InstanceGeometry }
             *     
             */
            InstanceGeometry getInstanceGeometry();

            /**
             * instanceGeometry�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link InstanceGeometry }
             *     
             */
            void setInstanceGeometry(InstanceGeometry value);

            /**
             * Gets the value of the translatesAndRotates property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the translatesAndRotates property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTranslatesAndRotates().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TargetableFloat3 }
             * {@link Rotate }
             * 
             * 
             */
            List<Object> getTranslatesAndRotates();

            /**
             * 
             * 												The extra element may appear any number of times.
             * 												Gets the value of the extras property.
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
            public interface Hollow {


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

        }

    }

}
