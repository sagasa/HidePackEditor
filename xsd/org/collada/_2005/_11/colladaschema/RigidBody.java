//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;

import java.util.List;


/**
 * <p>anonymous complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
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
 *                   &lt;element name="shape" maxOccurs="unbounded">
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
 *       &lt;attribute name="sid" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface RigidBody {


    /**
     * techniqueCommonプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link RigidBody.TechniqueCommon }
     *     
     */
    RigidBody.TechniqueCommon getTechniqueCommon();

    /**
     * techniqueCommonプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link RigidBody.TechniqueCommon }
     *     
     */
    void setTechniqueCommon(RigidBody.TechniqueCommon value);

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

    /**
     * nameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getName();

    /**
     * nameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setName(String value);


    /**
     * <p>anonymous complex typeのJavaクラス。
     * 
     * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
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
     *         &lt;element name="shape" maxOccurs="unbounded">
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
         * dynamicプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link RigidBody.TechniqueCommon.Dynamic }
         *     
         */
        RigidBody.TechniqueCommon.Dynamic getDynamic();

        /**
         * dynamicプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link RigidBody.TechniqueCommon.Dynamic }
         *     
         */
        void setDynamic(RigidBody.TechniqueCommon.Dynamic value);

        /**
         * massプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link TargetableFloat }
         *     
         */
        TargetableFloat getMass();

        /**
         * massプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link TargetableFloat }
         *     
         */
        void setMass(TargetableFloat value);

        /**
         * massFrameプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link RigidBody.TechniqueCommon.MassFrame }
         *     
         */
        RigidBody.TechniqueCommon.MassFrame getMassFrame();

        /**
         * massFrameプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link RigidBody.TechniqueCommon.MassFrame }
         *     
         */
        void setMassFrame(RigidBody.TechniqueCommon.MassFrame value);

        /**
         * inertiaプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link TargetableFloat3 }
         *     
         */
        TargetableFloat3 getInertia();

        /**
         * inertiaプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link TargetableFloat3 }
         *     
         */
        void setInertia(TargetableFloat3 value);

        /**
         * 
         * 										Defines a physics_material for the rigid_body.
         * 										
         * 
         * @return
         *     possible object is
         *     {@link PhysicsMaterial }
         *     
         */
        PhysicsMaterial getPhysicsMaterial();

        /**
         * physicsMaterialプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link PhysicsMaterial }
         *     
         */
        void setPhysicsMaterial(PhysicsMaterial value);

        /**
         * 
         * 										References a physics_material for the rigid_body.
         * 										
         * 
         * @return
         *     possible object is
         *     {@link InstanceWithExtra }
         *     
         */
        InstanceWithExtra getInstancePhysicsMaterial();

        /**
         * instancePhysicsMaterialプロパティの値を設定します。
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
         * {@link RigidBody.TechniqueCommon.Shape }
         * 
         * 
         */
        List<RigidBody.TechniqueCommon.Shape> getShapes();


        /**
         * <p>anonymous complex typeのJavaクラス。
         * 
         * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
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
             * valueプロパティの値を取得します。
             * 
             */
            boolean isValue();

            /**
             * valueプロパティの値を設定します。
             * 
             */
            void setValue(boolean value);

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


        /**
         * <p>anonymous complex typeのJavaクラス。
         * 
         * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
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
         * <p>anonymous complex typeのJavaクラス。
         * 
         * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
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
             * hollowプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link RigidBody.TechniqueCommon.Shape.Hollow }
             *     
             */
            RigidBody.TechniqueCommon.Shape.Hollow getHollow();

            /**
             * hollowプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link RigidBody.TechniqueCommon.Shape.Hollow }
             *     
             */
            void setHollow(RigidBody.TechniqueCommon.Shape.Hollow value);

            /**
             * massプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloat }
             *     
             */
            TargetableFloat getMass();

            /**
             * massプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloat }
             *     
             */
            void setMass(TargetableFloat value);

            /**
             * densityプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link TargetableFloat }
             *     
             */
            TargetableFloat getDensity();

            /**
             * densityプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link TargetableFloat }
             *     
             */
            void setDensity(TargetableFloat value);

            /**
             * 
             * 													Defines a physics_material for the shape.
             * 													
             * 
             * @return
             *     possible object is
             *     {@link PhysicsMaterial }
             *     
             */
            PhysicsMaterial getPhysicsMaterial();

            /**
             * physicsMaterialプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link PhysicsMaterial }
             *     
             */
            void setPhysicsMaterial(PhysicsMaterial value);

            /**
             * 
             * 													References a physics_material for the shape.
             * 													
             * 
             * @return
             *     possible object is
             *     {@link InstanceWithExtra }
             *     
             */
            InstanceWithExtra getInstancePhysicsMaterial();

            /**
             * instancePhysicsMaterialプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link InstanceWithExtra }
             *     
             */
            void setInstancePhysicsMaterial(InstanceWithExtra value);

            /**
             * 
             * 													Defines a tapered_capsule to use for this shape.
             * 													
             * 
             * @return
             *     possible object is
             *     {@link TaperedCapsule }
             *     
             */
            TaperedCapsule getTaperedCapsule();

            /**
             * taperedCapsuleプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link TaperedCapsule }
             *     
             */
            void setTaperedCapsule(TaperedCapsule value);

            /**
             * 
             * 													Defines a capsule to use for this shape.
             * 													
             * 
             * @return
             *     possible object is
             *     {@link Capsule }
             *     
             */
            Capsule getCapsule();

            /**
             * capsuleプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link Capsule }
             *     
             */
            void setCapsule(Capsule value);

            /**
             * 
             * 													Defines a tapered_cylinder to use for this shape.
             * 													
             * 
             * @return
             *     possible object is
             *     {@link TaperedCylinder }
             *     
             */
            TaperedCylinder getTaperedCylinder();

            /**
             * taperedCylinderプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link TaperedCylinder }
             *     
             */
            void setTaperedCylinder(TaperedCylinder value);

            /**
             * 
             * 													Defines a cyliner to use for this shape.
             * 													
             * 
             * @return
             *     possible object is
             *     {@link Cylinder }
             *     
             */
            Cylinder getCylinder();

            /**
             * cylinderプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link Cylinder }
             *     
             */
            void setCylinder(Cylinder value);

            /**
             * 
             * 													Defines a sphere to use for this shape.
             * 													
             * 
             * @return
             *     possible object is
             *     {@link Sphere }
             *     
             */
            Sphere getSphere();

            /**
             * sphereプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link Sphere }
             *     
             */
            void setSphere(Sphere value);

            /**
             * 
             * 													Defines a box to use for this shape.
             * 													
             * 
             * @return
             *     possible object is
             *     {@link Box }
             *     
             */
            Box getBox();

            /**
             * boxプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link Box }
             *     
             */
            void setBox(Box value);

            /**
             * 
             * 													Defines a plane to use for this shape.
             * 													
             * 
             * @return
             *     possible object is
             *     {@link Plane }
             *     
             */
            Plane getPlane();

            /**
             * planeプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link Plane }
             *     
             */
            void setPlane(Plane value);

            /**
             * 
             * 													Instances a geometry to use to define this shape.
             * 													
             * 
             * @return
             *     possible object is
             *     {@link InstanceGeometry }
             *     
             */
            InstanceGeometry getInstanceGeometry();

            /**
             * instanceGeometryプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link InstanceGeometry }
             *     
             */
            void setInstanceGeometry(InstanceGeometry value);

            /**
             * 
             * 													Allows a tranformation for the shape.
             * 													Gets the value of the translatesAndRotates property.
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
             * <p>anonymous complex typeのJavaクラス。
             * 
             * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
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
                 * valueプロパティの値を取得します。
                 * 
                 */
                boolean isValue();

                /**
                 * valueプロパティの値を設定します。
                 * 
                 */
                void setValue(boolean value);

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

        }

    }

}
