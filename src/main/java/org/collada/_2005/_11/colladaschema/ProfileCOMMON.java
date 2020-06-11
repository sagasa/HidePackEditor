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
     * assetプロパティの値を取得します。
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
     * techniqueプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ProfileCOMMON.Technique }
     *     
     */
    ProfileCOMMON.Technique getTechnique();

    /**
     * techniqueプロパティの値を設定します。
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
     * idプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getId();

    /**
     * idプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setId(String value);


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
         * assetプロパティの値を設定します。
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
         * blinnプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link ProfileCOMMON.Technique.Blinn }
         *     
         */
        ProfileCOMMON.Technique.Blinn getBlinn();

        /**
         * blinnプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link ProfileCOMMON.Technique.Blinn }
         *     
         */
        void setBlinn(ProfileCOMMON.Technique.Blinn value);

        /**
         * phongプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link ProfileCOMMON.Technique.Phong }
         *     
         */
        ProfileCOMMON.Technique.Phong getPhong();

        /**
         * phongプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link ProfileCOMMON.Technique.Phong }
         *     
         */
        void setPhong(ProfileCOMMON.Technique.Phong value);

        /**
         * lambertプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link ProfileCOMMON.Technique.Lambert }
         *     
         */
        ProfileCOMMON.Technique.Lambert getLambert();

        /**
         * lambertプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link ProfileCOMMON.Technique.Lambert }
         *     
         */
        void setLambert(ProfileCOMMON.Technique.Lambert value);

        /**
         * constantプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link ProfileCOMMON.Technique.Constant }
         *     
         */
        ProfileCOMMON.Technique.Constant getConstant();

        /**
         * constantプロパティの値を設定します。
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
         * idプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getId();

        /**
         * idプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setId(String value);

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
         * <p>anonymous complex typeのJavaクラス。
         * 
         * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
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
             * emissionプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getEmission();

            /**
             * emissionプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setEmission(CommonColorOrTextureType value);

            /**
             * ambientプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getAmbient();

            /**
             * ambientプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setAmbient(CommonColorOrTextureType value);

            /**
             * diffuseプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getDiffuse();

            /**
             * diffuseプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setDiffuse(CommonColorOrTextureType value);

            /**
             * specularプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getSpecular();

            /**
             * specularプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setSpecular(CommonColorOrTextureType value);

            /**
             * shininessプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getShininess();

            /**
             * shininessプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setShininess(CommonFloatOrParamType value);

            /**
             * reflectiveプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getReflective();

            /**
             * reflectiveプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setReflective(CommonColorOrTextureType value);

            /**
             * reflectivityプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getReflectivity();

            /**
             * reflectivityプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setReflectivity(CommonFloatOrParamType value);

            /**
             * transparentプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonTransparentType }
             *     
             */
            CommonTransparentType getTransparent();

            /**
             * transparentプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonTransparentType }
             *     
             */
            void setTransparent(CommonTransparentType value);

            /**
             * transparencyプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getTransparency();

            /**
             * transparencyプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setTransparency(CommonFloatOrParamType value);

            /**
             * indexOfRefractionプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getIndexOfRefraction();

            /**
             * indexOfRefractionプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setIndexOfRefraction(CommonFloatOrParamType value);

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
             * emissionプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getEmission();

            /**
             * emissionプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setEmission(CommonColorOrTextureType value);

            /**
             * reflectiveプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getReflective();

            /**
             * reflectiveプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setReflective(CommonColorOrTextureType value);

            /**
             * reflectivityプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getReflectivity();

            /**
             * reflectivityプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setReflectivity(CommonFloatOrParamType value);

            /**
             * transparentプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonTransparentType }
             *     
             */
            CommonTransparentType getTransparent();

            /**
             * transparentプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonTransparentType }
             *     
             */
            void setTransparent(CommonTransparentType value);

            /**
             * transparencyプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getTransparency();

            /**
             * transparencyプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setTransparency(CommonFloatOrParamType value);

            /**
             * indexOfRefractionプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getIndexOfRefraction();

            /**
             * indexOfRefractionプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setIndexOfRefraction(CommonFloatOrParamType value);

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
             * emissionプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getEmission();

            /**
             * emissionプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setEmission(CommonColorOrTextureType value);

            /**
             * ambientプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getAmbient();

            /**
             * ambientプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setAmbient(CommonColorOrTextureType value);

            /**
             * diffuseプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getDiffuse();

            /**
             * diffuseプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setDiffuse(CommonColorOrTextureType value);

            /**
             * reflectiveプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getReflective();

            /**
             * reflectiveプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setReflective(CommonColorOrTextureType value);

            /**
             * reflectivityプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getReflectivity();

            /**
             * reflectivityプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setReflectivity(CommonFloatOrParamType value);

            /**
             * transparentプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonTransparentType }
             *     
             */
            CommonTransparentType getTransparent();

            /**
             * transparentプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonTransparentType }
             *     
             */
            void setTransparent(CommonTransparentType value);

            /**
             * transparencyプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getTransparency();

            /**
             * transparencyプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setTransparency(CommonFloatOrParamType value);

            /**
             * indexOfRefractionプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getIndexOfRefraction();

            /**
             * indexOfRefractionプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setIndexOfRefraction(CommonFloatOrParamType value);

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
             * emissionプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getEmission();

            /**
             * emissionプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setEmission(CommonColorOrTextureType value);

            /**
             * ambientプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getAmbient();

            /**
             * ambientプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setAmbient(CommonColorOrTextureType value);

            /**
             * diffuseプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getDiffuse();

            /**
             * diffuseプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setDiffuse(CommonColorOrTextureType value);

            /**
             * specularプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getSpecular();

            /**
             * specularプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setSpecular(CommonColorOrTextureType value);

            /**
             * shininessプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getShininess();

            /**
             * shininessプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setShininess(CommonFloatOrParamType value);

            /**
             * reflectiveプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            CommonColorOrTextureType getReflective();

            /**
             * reflectiveプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonColorOrTextureType }
             *     
             */
            void setReflective(CommonColorOrTextureType value);

            /**
             * reflectivityプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getReflectivity();

            /**
             * reflectivityプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setReflectivity(CommonFloatOrParamType value);

            /**
             * transparentプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonTransparentType }
             *     
             */
            CommonTransparentType getTransparent();

            /**
             * transparentプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonTransparentType }
             *     
             */
            void setTransparent(CommonTransparentType value);

            /**
             * transparencyプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getTransparency();

            /**
             * transparencyプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            void setTransparency(CommonFloatOrParamType value);

            /**
             * indexOfRefractionプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link CommonFloatOrParamType }
             *     
             */
            CommonFloatOrParamType getIndexOfRefraction();

            /**
             * indexOfRefractionプロパティの値を設定します。
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
