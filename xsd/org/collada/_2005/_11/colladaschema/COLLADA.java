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
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}asset"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}library_animations"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}library_animation_clips"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}library_cameras"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}library_controllers"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}library_geometries"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}library_effects"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}library_force_fields"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}library_images"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}library_lights"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}library_materials"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}library_nodes"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}library_physics_materials"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}library_physics_models"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}library_physics_scenes"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}library_visual_scenes"/>
 *         &lt;/choice>
 *         &lt;element name="scene" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="instance_physics_scene" type="{http://www.collada.org/2005/11/COLLADASchema}InstanceWithExtra" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="instance_visual_scene" type="{http://www.collada.org/2005/11/COLLADASchema}InstanceWithExtra" minOccurs="0"/>
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}VersionType" />
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}base"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface COLLADA {


    /**
     * 
     * 						The COLLADA element must contain an asset element.
     * 						
     * 
     * @return
     *     possible object is
     *     {@link Asset }
     *     
     */
    Asset getAsset();

    /**
     * assetプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Asset }
     *     
     */
    void setAsset(Asset value);

    /**
     * 
     * 							The COLLADA element may contain any number of library_animations elements.
     * 							Gets the value of the libraryAnimationsAndLibraryAnimationClipsAndLibraryCameras property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libraryAnimationsAndLibraryAnimationClipsAndLibraryCameras property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibraryAnimationsAndLibraryAnimationClipsAndLibraryCameras().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibraryAnimations }
     * {@link LibraryAnimationClips }
     * {@link LibraryCameras }
     * {@link LibraryControllers }
     * {@link LibraryGeometries }
     * {@link LibraryEffects }
     * {@link LibraryForceFields }
     * {@link LibraryImages }
     * {@link LibraryLights }
     * {@link LibraryMaterials }
     * {@link LibraryNodes }
     * {@link LibraryPhysicsMaterials }
     * {@link LibraryPhysicsModels }
     * {@link LibraryPhysicsScenes }
     * {@link LibraryVisualScenes }
     * 
     * 
     */
    List<Object> getLibraryAnimationsAndLibraryAnimationClipsAndLibraryCameras();

    /**
     * sceneプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link COLLADA.Scene }
     *     
     */
    COLLADA.Scene getScene();

    /**
     * sceneプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link COLLADA.Scene }
     *     
     */
    void setScene(COLLADA.Scene value);

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
     * versionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getVersion();

    /**
     * versionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setVersion(String value);

    /**
     * 
     * 					The xml:base attribute allows you to define the base URI for this COLLADA document. See
     * 					http://www.w3.org/TR/xmlbase/ for more information.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getBase();

    /**
     * baseプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBase(String value);


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
     *         &lt;element name="instance_physics_scene" type="{http://www.collada.org/2005/11/COLLADASchema}InstanceWithExtra" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="instance_visual_scene" type="{http://www.collada.org/2005/11/COLLADASchema}InstanceWithExtra" minOccurs="0"/>
     *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface Scene {


        /**
         * Gets the value of the instancePhysicsScenes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the instancePhysicsScenes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInstancePhysicsScenes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InstanceWithExtra }
         * 
         * 
         */
        List<InstanceWithExtra> getInstancePhysicsScenes();

        /**
         * instanceVisualSceneプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link InstanceWithExtra }
         *     
         */
        InstanceWithExtra getInstanceVisualScene();

        /**
         * instanceVisualSceneプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link InstanceWithExtra }
         *     
         */
        void setInstanceVisualScene(InstanceWithExtra value);

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

}
