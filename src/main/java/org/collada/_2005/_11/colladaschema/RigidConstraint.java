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
     * refAttachmentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link RigidConstraint.RefAttachment }
     *     
     */
    RigidConstraint.RefAttachment getRefAttachment();

    /**
     * refAttachmentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link RigidConstraint.RefAttachment }
     *     
     */
    void setRefAttachment(RigidConstraint.RefAttachment value);

    /**
     * attachmentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link RigidConstraint.Attachment }
     *     
     */
    RigidConstraint.Attachment getAttachment();

    /**
     * attachmentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link RigidConstraint.Attachment }
     *     
     */
    void setAttachment(RigidConstraint.Attachment value);

    /**
     * techniqueCommonプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link RigidConstraint.TechniqueCommon }
     *     
     */
    RigidConstraint.TechniqueCommon getTechniqueCommon();

    /**
     * techniqueCommonプロパティの値を設定します。
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
         * rigidBodyプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getRigidBody();

        /**
         * rigidBodyプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setRigidBody(String value);

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
         * rigidBodyプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getRigidBody();

        /**
         * rigidBodyプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setRigidBody(String value);

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
         * enabledプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link RigidConstraint.TechniqueCommon.Enabled }
         *     
         */
        RigidConstraint.TechniqueCommon.Enabled getEnabled();

        /**
         * enabledプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link RigidConstraint.TechniqueCommon.Enabled }
         *     
         */
        void setEnabled(RigidConstraint.TechniqueCommon.Enabled value);

        /**
         * interpenetrateプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link RigidConstraint.TechniqueCommon.Interpenetrate }
         *     
         */
        RigidConstraint.TechniqueCommon.Interpenetrate getInterpenetrate();

        /**
         * interpenetrateプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link RigidConstraint.TechniqueCommon.Interpenetrate }
         *     
         */
        void setInterpenetrate(RigidConstraint.TechniqueCommon.Interpenetrate value);

        /**
         * limitsプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link RigidConstraint.TechniqueCommon.Limits }
         *     
         */
        RigidConstraint.TechniqueCommon.Limits getLimits();

        /**
         * limitsプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link RigidConstraint.TechniqueCommon.Limits }
         *     
         */
        void setLimits(RigidConstraint.TechniqueCommon.Limits value);

        /**
         * springプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link RigidConstraint.TechniqueCommon.Spring }
         *     
         */
        RigidConstraint.TechniqueCommon.Spring getSpring();

        /**
         * springプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link RigidConstraint.TechniqueCommon.Spring }
         *     
         */
        void setSpring(RigidConstraint.TechniqueCommon.Spring value);


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
        public interface Enabled {


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
             * swingConeAndTwistプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link RigidConstraint.TechniqueCommon.Limits.SwingConeAndTwist }
             *     
             */
            RigidConstraint.TechniqueCommon.Limits.SwingConeAndTwist getSwingConeAndTwist();

            /**
             * swingConeAndTwistプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link RigidConstraint.TechniqueCommon.Limits.SwingConeAndTwist }
             *     
             */
            void setSwingConeAndTwist(RigidConstraint.TechniqueCommon.Limits.SwingConeAndTwist value);

            /**
             * linearプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link RigidConstraint.TechniqueCommon.Limits.Linear }
             *     
             */
            RigidConstraint.TechniqueCommon.Limits.Linear getLinear();

            /**
             * linearプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link RigidConstraint.TechniqueCommon.Limits.Linear }
             *     
             */
            void setLinear(RigidConstraint.TechniqueCommon.Limits.Linear value);


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
                 * minプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat3 }
                 *     
                 */
                TargetableFloat3 getMin();

                /**
                 * minプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat3 }
                 *     
                 */
                void setMin(TargetableFloat3 value);

                /**
                 * maxプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat3 }
                 *     
                 */
                TargetableFloat3 getMax();

                /**
                 * maxプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat3 }
                 *     
                 */
                void setMax(TargetableFloat3 value);

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
                 * minプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat3 }
                 *     
                 */
                TargetableFloat3 getMin();

                /**
                 * minプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat3 }
                 *     
                 */
                void setMin(TargetableFloat3 value);

                /**
                 * maxプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat3 }
                 *     
                 */
                TargetableFloat3 getMax();

                /**
                 * maxプロパティの値を設定します。
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
         * <p>anonymous complex typeのJavaクラス。
         * 
         * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
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
             * angularプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link RigidConstraint.TechniqueCommon.Spring.Angular }
             *     
             */
            RigidConstraint.TechniqueCommon.Spring.Angular getAngular();

            /**
             * angularプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link RigidConstraint.TechniqueCommon.Spring.Angular }
             *     
             */
            void setAngular(RigidConstraint.TechniqueCommon.Spring.Angular value);

            /**
             * linearプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link RigidConstraint.TechniqueCommon.Spring.Linear }
             *     
             */
            RigidConstraint.TechniqueCommon.Spring.Linear getLinear();

            /**
             * linearプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link RigidConstraint.TechniqueCommon.Spring.Linear }
             *     
             */
            void setLinear(RigidConstraint.TechniqueCommon.Spring.Linear value);


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
                 * stiffnessプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getStiffness();

                /**
                 * stiffnessプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setStiffness(TargetableFloat value);

                /**
                 * dampingプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getDamping();

                /**
                 * dampingプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setDamping(TargetableFloat value);

                /**
                 * targetValueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getTargetValue();

                /**
                 * targetValueプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setTargetValue(TargetableFloat value);

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
                 * stiffnessプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getStiffness();

                /**
                 * stiffnessプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setStiffness(TargetableFloat value);

                /**
                 * dampingプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getDamping();

                /**
                 * dampingプロパティの値を設定します。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TargetableFloat }
                 *     
                 */
                void setDamping(TargetableFloat value);

                /**
                 * targetValueプロパティの値を取得します。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TargetableFloat }
                 *     
                 */
                TargetableFloat getTargetValue();

                /**
                 * targetValueプロパティの値を設定します。
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
