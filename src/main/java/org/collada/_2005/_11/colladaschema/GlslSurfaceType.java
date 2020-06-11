//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;

import java.util.List;


/**
 * 
 * 			A surface type for the GLSL profile. This surface inherits from the fx_surface_common type and adds the
 * 			ability to programmatically generate textures.
 * 			
 * 
 * <p>glsl_surface_type complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="glsl_surface_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.collada.org/2005/11/COLLADASchema}fx_surface_common">
 *       &lt;sequence>
 *         &lt;element name="generator" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;choice maxOccurs="unbounded">
 *                     &lt;element name="code" type="{http://www.collada.org/2005/11/COLLADASchema}fx_code_profile"/>
 *                     &lt;element name="include" type="{http://www.collada.org/2005/11/COLLADASchema}fx_include_common"/>
 *                   &lt;/choice>
 *                   &lt;element name="name">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
 *                           &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="setparam" type="{http://www.collada.org/2005/11/COLLADASchema}glsl_setparam_simple" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface GlslSurfaceType extends FxSurfaceCommon
{


    /**
     * generatorプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link GlslSurfaceType.Generator }
     *     
     */
    GlslSurfaceType.Generator getGenerator();

    /**
     * generatorプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link GlslSurfaceType.Generator }
     *     
     */
    void setGenerator(GlslSurfaceType.Generator value);


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
     *         &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;choice maxOccurs="unbounded">
     *           &lt;element name="code" type="{http://www.collada.org/2005/11/COLLADASchema}fx_code_profile"/>
     *           &lt;element name="include" type="{http://www.collada.org/2005/11/COLLADASchema}fx_include_common"/>
     *         &lt;/choice>
     *         &lt;element name="name">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
     *                 &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="setparam" type="{http://www.collada.org/2005/11/COLLADASchema}glsl_setparam_simple" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface Generator {


        /**
         * Gets the value of the annotates property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the annotates property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnnotates().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FxAnnotateCommon }
         * 
         * 
         */
        List<FxAnnotateCommon> getAnnotates();

        /**
         * Gets the value of the codesAndIncludes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the codesAndIncludes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCodesAndIncludes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FxCodeProfile }
         * {@link FxIncludeCommon }
         * 
         * 
         */
        List<Object> getCodesAndIncludes();

        /**
         * nameプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link GlslSurfaceType.Generator.Name }
         *     
         */
        GlslSurfaceType.Generator.Name getName();

        /**
         * nameプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link GlslSurfaceType.Generator.Name }
         *     
         */
        void setName(GlslSurfaceType.Generator.Name value);

        /**
         * Gets the value of the setparams property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the setparams property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSetparams().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GlslSetparamSimple }
         * 
         * 
         */
        List<GlslSetparamSimple> getSetparams();


        /**
         * <p>anonymous complex typeのJavaクラス。
         * 
         * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>NCName">
         *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface Name {


            /**
             * valueプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            String getValue();

            /**
             * valueプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            void setValue(String value);

            /**
             * sourceプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            String getSource();

            /**
             * sourceプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            void setSource(String value);

        }

    }

}
