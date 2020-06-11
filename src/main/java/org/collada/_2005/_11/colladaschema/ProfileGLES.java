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
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}image"/>
 *           &lt;element name="newparam" type="{http://www.collada.org/2005/11/COLLADASchema}gles_newparam"/>
 *         &lt;/choice>
 *         &lt;element name="technique" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}asset" minOccurs="0"/>
 *                   &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}image"/>
 *                     &lt;element name="newparam" type="{http://www.collada.org/2005/11/COLLADASchema}gles_newparam"/>
 *                     &lt;element name="setparam">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}gles_basic_type_common"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;element name="pass" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="color_target" type="{http://www.collada.org/2005/11/COLLADASchema}gles_rendertarget_common" minOccurs="0"/>
 *                             &lt;element name="depth_target" type="{http://www.collada.org/2005/11/COLLADASchema}gles_rendertarget_common" minOccurs="0"/>
 *                             &lt;element name="stencil_target" type="{http://www.collada.org/2005/11/COLLADASchema}gles_rendertarget_common" minOccurs="0"/>
 *                             &lt;element name="color_clear" type="{http://www.collada.org/2005/11/COLLADASchema}fx_color_common" minOccurs="0"/>
 *                             &lt;element name="depth_clear" type="{http://www.collada.org/2005/11/COLLADASchema}float" minOccurs="0"/>
 *                             &lt;element name="stencil_clear" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *                             &lt;element name="draw" type="{http://www.collada.org/2005/11/COLLADASchema}fx_draw_common" minOccurs="0"/>
 *                             &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                               &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}gles_pipeline_settings"/>
 *                             &lt;/choice>
 *                             &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
 *       &lt;attribute name="platform" type="{http://www.w3.org/2001/XMLSchema}NCName" default="PC" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ProfileGLES {


    /**
     * asset�v���p�e�B�̒l���擾���܂��B
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
     * {@link GlesNewparam }
     * 
     * 
     */
    List<Object> getImagesAndNewparams();

    /**
     * Gets the value of the techniques property.
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
     * {@link ProfileGLES.Technique }
     * 
     * 
     */
    List<ProfileGLES.Technique> getTechniques();

    /**
     * Gets the value of the extras property.
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
     * platform�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPlatform();

    /**
     * platform�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPlatform(String value);


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
     *         &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}image"/>
     *           &lt;element name="newparam" type="{http://www.collada.org/2005/11/COLLADASchema}gles_newparam"/>
     *           &lt;element name="setparam">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
     *                     &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}gles_basic_type_common"/>
     *                   &lt;/sequence>
     *                   &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="pass" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="color_target" type="{http://www.collada.org/2005/11/COLLADASchema}gles_rendertarget_common" minOccurs="0"/>
     *                   &lt;element name="depth_target" type="{http://www.collada.org/2005/11/COLLADASchema}gles_rendertarget_common" minOccurs="0"/>
     *                   &lt;element name="stencil_target" type="{http://www.collada.org/2005/11/COLLADASchema}gles_rendertarget_common" minOccurs="0"/>
     *                   &lt;element name="color_clear" type="{http://www.collada.org/2005/11/COLLADASchema}fx_color_common" minOccurs="0"/>
     *                   &lt;element name="depth_clear" type="{http://www.collada.org/2005/11/COLLADASchema}float" minOccurs="0"/>
     *                   &lt;element name="stencil_clear" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
     *                   &lt;element name="draw" type="{http://www.collada.org/2005/11/COLLADASchema}fx_draw_common" minOccurs="0"/>
     *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
     *                     &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}gles_pipeline_settings"/>
     *                   &lt;/choice>
     *                   &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
         * asset�v���p�e�B�̒l���擾���܂��B
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
         * Gets the value of the imagesAndNewparamsAndSetparams property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the imagesAndNewparamsAndSetparams property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImagesAndNewparamsAndSetparams().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Image }
         * {@link GlesNewparam }
         * {@link ProfileGLES.Technique.Setparam }
         * 
         * 
         */
        List<Object> getImagesAndNewparamsAndSetparams();

        /**
         * Gets the value of the passes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPasses().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProfileGLES.Technique.Pass }
         * 
         * 
         */
        List<ProfileGLES.Technique.Pass> getPasses();

        /**
         * Gets the value of the extras property.
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
         * <p>anonymous complex type��Java�N���X�B
         * 
         * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="color_target" type="{http://www.collada.org/2005/11/COLLADASchema}gles_rendertarget_common" minOccurs="0"/>
         *         &lt;element name="depth_target" type="{http://www.collada.org/2005/11/COLLADASchema}gles_rendertarget_common" minOccurs="0"/>
         *         &lt;element name="stencil_target" type="{http://www.collada.org/2005/11/COLLADASchema}gles_rendertarget_common" minOccurs="0"/>
         *         &lt;element name="color_clear" type="{http://www.collada.org/2005/11/COLLADASchema}fx_color_common" minOccurs="0"/>
         *         &lt;element name="depth_clear" type="{http://www.collada.org/2005/11/COLLADASchema}float" minOccurs="0"/>
         *         &lt;element name="stencil_clear" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
         *         &lt;element name="draw" type="{http://www.collada.org/2005/11/COLLADASchema}fx_draw_common" minOccurs="0"/>
         *         &lt;choice maxOccurs="unbounded" minOccurs="0">
         *           &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}gles_pipeline_settings"/>
         *         &lt;/choice>
         *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface Pass {


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
             * colorTarget�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            String getColorTarget();

            /**
             * colorTarget�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            void setColorTarget(String value);

            /**
             * depthTarget�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            String getDepthTarget();

            /**
             * depthTarget�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            void setDepthTarget(String value);

            /**
             * stencilTarget�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            String getStencilTarget();

            /**
             * stencilTarget�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            void setStencilTarget(String value);

            /**
             * Gets the value of the colorClear property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the colorClear property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getColorClear().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getColorClear();

            /**
             * depthClear�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            Double getDepthClear();

            /**
             * depthClear�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            void setDepthClear(Double value);

            /**
             * stencilClear�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            Byte getStencilClear();

            /**
             * stencilClear�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            void setStencilClear(Byte value);

            /**
             * draw�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            String getDraw();

            /**
             * draw�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            void setDraw(String value);

            /**
             * Gets the value of the alphaFuncsAndBlendFuncsAndClearColors property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the alphaFuncsAndBlendFuncsAndClearColors property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAlphaFuncsAndBlendFuncsAndClearColors().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProfileGLES.Technique.Pass.AlphaFunc }
             * {@link ProfileGLES.Technique.Pass.BlendFunc }
             * {@link ProfileGLES.Technique.Pass.ClearColor }
             * {@link ProfileGLES.Technique.Pass.ClearStencil }
             * {@link ProfileGLES.Technique.Pass.ClearDepth }
             * {@link ProfileGLES.Technique.Pass.ClipPlane }
             * {@link ProfileGLES.Technique.Pass.ColorMask }
             * {@link ProfileGLES.Technique.Pass.CullFace }
             * {@link ProfileGLES.Technique.Pass.DepthFunc }
             * {@link ProfileGLES.Technique.Pass.DepthMask }
             * {@link ProfileGLES.Technique.Pass.DepthRange }
             * {@link ProfileGLES.Technique.Pass.FogColor }
             * {@link ProfileGLES.Technique.Pass.FogDensity }
             * {@link ProfileGLES.Technique.Pass.FogMode }
             * {@link ProfileGLES.Technique.Pass.FogStart }
             * {@link ProfileGLES.Technique.Pass.FogEnd }
             * {@link ProfileGLES.Technique.Pass.FrontFace }
             * {@link ProfileGLES.Technique.Pass.TexturePipeline }
             * {@link ProfileGLES.Technique.Pass.LogicOp }
             * {@link ProfileGLES.Technique.Pass.LightAmbient }
             * {@link ProfileGLES.Technique.Pass.LightDiffuse }
             * {@link ProfileGLES.Technique.Pass.LightSpecular }
             * {@link ProfileGLES.Technique.Pass.LightPosition }
             * {@link ProfileGLES.Technique.Pass.LightConstantAttenuation }
             * {@link ProfileGLES.Technique.Pass.LightLinearAttenutation }
             * {@link ProfileGLES.Technique.Pass.LightQuadraticAttenuation }
             * {@link ProfileGLES.Technique.Pass.LightSpotCutoff }
             * {@link ProfileGLES.Technique.Pass.LightSpotDirection }
             * {@link ProfileGLES.Technique.Pass.LightSpotExponent }
             * {@link ProfileGLES.Technique.Pass.LightModelAmbient }
             * {@link ProfileGLES.Technique.Pass.LineWidth }
             * {@link ProfileGLES.Technique.Pass.MaterialAmbient }
             * {@link ProfileGLES.Technique.Pass.MaterialDiffuse }
             * {@link ProfileGLES.Technique.Pass.MaterialEmission }
             * {@link ProfileGLES.Technique.Pass.MaterialShininess }
             * {@link ProfileGLES.Technique.Pass.MaterialSpecular }
             * {@link ProfileGLES.Technique.Pass.ModelViewMatrix }
             * {@link ProfileGLES.Technique.Pass.PointDistanceAttenuation }
             * {@link ProfileGLES.Technique.Pass.PointFadeThresholdSize }
             * {@link ProfileGLES.Technique.Pass.PointSize }
             * {@link ProfileGLES.Technique.Pass.PointSizeMin }
             * {@link ProfileGLES.Technique.Pass.PointSizeMax }
             * {@link ProfileGLES.Technique.Pass.PolygonOffset }
             * {@link ProfileGLES.Technique.Pass.ProjectionMatrix }
             * {@link ProfileGLES.Technique.Pass.Scissor }
             * {@link ProfileGLES.Technique.Pass.ShadeModel }
             * {@link ProfileGLES.Technique.Pass.StencilFunc }
             * {@link ProfileGLES.Technique.Pass.StencilMask }
             * {@link ProfileGLES.Technique.Pass.StencilOp }
             * {@link ProfileGLES.Technique.Pass.AlphaTestEnable }
             * {@link ProfileGLES.Technique.Pass.BlendEnable }
             * {@link ProfileGLES.Technique.Pass.ClipPlaneEnable }
             * {@link ProfileGLES.Technique.Pass.ColorLogicOpEnable }
             * {@link ProfileGLES.Technique.Pass.ColorMaterialEnable }
             * {@link ProfileGLES.Technique.Pass.CullFaceEnable }
             * {@link ProfileGLES.Technique.Pass.DepthTestEnable }
             * {@link ProfileGLES.Technique.Pass.DitherEnable }
             * {@link ProfileGLES.Technique.Pass.FogEnable }
             * {@link ProfileGLES.Technique.Pass.TexturePipelineEnable }
             * {@link ProfileGLES.Technique.Pass.LightEnable }
             * {@link ProfileGLES.Technique.Pass.LightingEnable }
             * {@link ProfileGLES.Technique.Pass.LightModelTwoSideEnable }
             * {@link ProfileGLES.Technique.Pass.LineSmoothEnable }
             * {@link ProfileGLES.Technique.Pass.MultisampleEnable }
             * {@link ProfileGLES.Technique.Pass.NormalizeEnable }
             * {@link ProfileGLES.Technique.Pass.PointSmoothEnable }
             * {@link ProfileGLES.Technique.Pass.PolygonOffsetFillEnable }
             * {@link ProfileGLES.Technique.Pass.RescaleNormalEnable }
             * {@link ProfileGLES.Technique.Pass.SampleAlphaToCoverageEnable }
             * {@link ProfileGLES.Technique.Pass.SampleAlphaToOneEnable }
             * {@link ProfileGLES.Technique.Pass.SampleCoverageEnable }
             * {@link ProfileGLES.Technique.Pass.ScissorTestEnable }
             * {@link ProfileGLES.Technique.Pass.StencilTestEnable }
             * 
             * 
             */
            List<Object> getAlphaFuncsAndBlendFuncsAndClearColors();

            /**
             * Gets the value of the extras property.
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
             * <p>anonymous complex type��Java�N���X�B
             * 
             * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="func">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_func_type" default="ALWAYS" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="value">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_alpha_value_type" default="0.0" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
            public interface AlphaFunc {


                /**
                 * func�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLES.Technique.Pass.AlphaFunc.Func }
                 *     
                 */
                ProfileGLES.Technique.Pass.AlphaFunc.Func getFunc();

                /**
                 * func�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLES.Technique.Pass.AlphaFunc.Func }
                 *     
                 */
                void setFunc(ProfileGLES.Technique.Pass.AlphaFunc.Func value);

                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLES.Technique.Pass.AlphaFunc.Value }
                 *     
                 */
                ProfileGLES.Technique.Pass.AlphaFunc.Value getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLES.Technique.Pass.AlphaFunc.Value }
                 *     
                 */
                void setValue(ProfileGLES.Technique.Pass.AlphaFunc.Value value);


                /**
                 * <p>anonymous complex type��Java�N���X�B
                 * 
                 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_func_type" default="ALWAYS" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Func {


                    /**
                     * value�v���p�e�B�̒l���擾���܂��B
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlFuncType }
                     *     
                     */
                    GlFuncType getValue();

                    /**
                     * value�v���p�e�B�̒l��ݒ肵�܂��B
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlFuncType }
                     *     
                     */
                    void setValue(GlFuncType value);

                    /**
                     * param�v���p�e�B�̒l���擾���܂��B
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getParam();

                    /**
                     * param�v���p�e�B�̒l��ݒ肵�܂��B
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setParam(String value);

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
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_alpha_value_type" default="0.0" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Value {


                    /**
                     * value�v���p�e�B�̒l���擾���܂��B
                     * 
                     * @return
                     *     possible object is
                     *     {@link Float }
                     *     
                     */
                    float getValue();

                    /**
                     * value�v���p�e�B�̒l��ݒ肵�܂��B
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Float }
                     *     
                     */
                    void setValue(Float value);

                    /**
                     * param�v���p�e�B�̒l���擾���܂��B
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getParam();

                    /**
                     * param�v���p�e�B�̒l��ݒ肵�܂��B
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface AlphaTestEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface BlendEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *         &lt;element name="src">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_blend_type" default="ONE" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="dest">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_blend_type" default="ZERO" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
            public interface BlendFunc {


                /**
                 * src�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLES.Technique.Pass.BlendFunc.Src }
                 *     
                 */
                ProfileGLES.Technique.Pass.BlendFunc.Src getSrc();

                /**
                 * src�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLES.Technique.Pass.BlendFunc.Src }
                 *     
                 */
                void setSrc(ProfileGLES.Technique.Pass.BlendFunc.Src value);

                /**
                 * dest�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLES.Technique.Pass.BlendFunc.Dest }
                 *     
                 */
                ProfileGLES.Technique.Pass.BlendFunc.Dest getDest();

                /**
                 * dest�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLES.Technique.Pass.BlendFunc.Dest }
                 *     
                 */
                void setDest(ProfileGLES.Technique.Pass.BlendFunc.Dest value);


                /**
                 * <p>anonymous complex type��Java�N���X�B
                 * 
                 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_blend_type" default="ZERO" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Dest {


                    /**
                     * value�v���p�e�B�̒l���擾���܂��B
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlBlendType }
                     *     
                     */
                    GlBlendType getValue();

                    /**
                     * value�v���p�e�B�̒l��ݒ肵�܂��B
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlBlendType }
                     *     
                     */
                    void setValue(GlBlendType value);

                    /**
                     * param�v���p�e�B�̒l���擾���܂��B
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getParam();

                    /**
                     * param�v���p�e�B�̒l��ݒ肵�܂��B
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setParam(String value);

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
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_blend_type" default="ONE" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Src {


                    /**
                     * value�v���p�e�B�̒l���擾���܂��B
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlBlendType }
                     *     
                     */
                    GlBlendType getValue();

                    /**
                     * value�v���p�e�B�̒l��ݒ肵�܂��B
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlBlendType }
                     *     
                     */
                    void setValue(GlBlendType value);

                    /**
                     * param�v���p�e�B�̒l���擾���܂��B
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getParam();

                    /**
                     * param�v���p�e�B�̒l��ݒ肵�܂��B
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ClearColor {


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
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ClearDepth {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                Double getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}int" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ClearStencil {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                Long getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                void setValue(Long value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool4" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_CLIP_PLANES_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ClipPlane {


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
                 * {@link Boolean }
                 * 
                 * 
                 */
                List<Boolean> getValues();

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * index�v���p�e�B�̒l���擾���܂��B
                 * 
                 */
                int getIndex();

                /**
                 * index�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_CLIP_PLANES_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ClipPlaneEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * index�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                Integer getIndex();

                /**
                 * index�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                void setIndex(Integer value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ColorLogicOpEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool4" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ColorMask {


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
                 * {@link Boolean }
                 * 
                 * 
                 */
                List<Boolean> getValues();

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="true" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ColorMaterialEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_face_type" default="BACK" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface CullFace {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlFaceType }
                 *     
                 */
                GlFaceType getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlFaceType }
                 *     
                 */
                void setValue(GlFaceType value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface CullFaceEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_func_type" default="ALWAYS" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface DepthFunc {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlFuncType }
                 *     
                 */
                GlFuncType getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlFuncType }
                 *     
                 */
                void setValue(GlFuncType value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface DepthMask {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float2" default="0 1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface DepthRange {


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
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface DepthTestEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface DitherEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0 0 0 0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface FogColor {


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
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface FogDensity {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface FogEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface FogEnd {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_fog_type" default="EXP" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface FogMode {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlFogType }
                 *     
                 */
                GlFogType getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlFogType }
                 *     
                 */
                void setValue(GlFogType value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface FogStart {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_front_face_type" default="CCW" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface FrontFace {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlFrontFaceType }
                 *     
                 */
                GlFrontFaceType getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlFrontFaceType }
                 *     
                 */
                void setValue(GlFrontFaceType value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0 0 0 1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightAmbient {


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
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * index�v���p�e�B�̒l���擾���܂��B
                 * 
                 */
                int getIndex();

                /**
                 * index�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightConstantAttenuation {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * index�v���p�e�B�̒l���擾���܂��B
                 * 
                 */
                int getIndex();

                /**
                 * index�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0 0 0 0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightDiffuse {


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
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * index�v���p�e�B�̒l���擾���܂��B
                 * 
                 */
                int getIndex();

                /**
                 * index�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * index�v���p�e�B�̒l���擾���܂��B
                 * 
                 */
                int getIndex();

                /**
                 * index�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightLinearAttenutation {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * index�v���p�e�B�̒l���擾���܂��B
                 * 
                 */
                int getIndex();

                /**
                 * index�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0.2 0.2 0.2 1.0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightModelAmbient {


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
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightModelTwoSideEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0 0 1 0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightPosition {


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
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * index�v���p�e�B�̒l���擾���܂��B
                 * 
                 */
                int getIndex();

                /**
                 * index�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightQuadraticAttenuation {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * index�v���p�e�B�̒l���擾���܂��B
                 * 
                 */
                int getIndex();

                /**
                 * index�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0 0 0 0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightSpecular {


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
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * index�v���p�e�B�̒l���擾���܂��B
                 * 
                 */
                int getIndex();

                /**
                 * index�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="180" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightSpotCutoff {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * index�v���p�e�B�̒l���擾���܂��B
                 * 
                 */
                int getIndex();

                /**
                 * index�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float3" default="0 0 -1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightSpotDirection {


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
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * index�v���p�e�B�̒l���擾���܂��B
                 * 
                 */
                int getIndex();

                /**
                 * index�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="index" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}GLES_MAX_LIGHTS_index" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightSpotExponent {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

                /**
                 * index�v���p�e�B�̒l���擾���܂��B
                 * 
                 */
                int getIndex();

                /**
                 * index�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 */
                void setIndex(int value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LightingEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LineSmoothEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LineWidth {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_logic_op_type" default="COPY" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface LogicOp {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlLogicOpType }
                 *     
                 */
                GlLogicOpType getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlLogicOpType }
                 *     
                 */
                void setValue(GlLogicOpType value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0.2 0.2 0.2 1.0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface MaterialAmbient {


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
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0.8 0.8 0.8 1.0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface MaterialDiffuse {


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
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0 0 0 1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface MaterialEmission {


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
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface MaterialShininess {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4" default="0 0 0 1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface MaterialSpecular {


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
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4x4" default="1 0 0 0 0 1 0 0 0 0 1 0 0 0 0 1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ModelViewMatrix {


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
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface MultisampleEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface NormalizeEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float3" default="1 0 0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface PointDistanceAttenuation {


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
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface PointFadeThresholdSize {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface PointSize {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface PointSizeMax {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float" default="0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface PointSizeMin {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *     
                 */
                double getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *     
                 */
                void setValue(Double value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface PointSmoothEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float2" default="0 0" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface PolygonOffset {


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
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface PolygonOffsetFillEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}float4x4" default="1 0 0 0 0 1 0 0 0 0 1 0 0 0 0 1" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ProjectionMatrix {


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
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface RescaleNormalEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface SampleAlphaToCoverageEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface SampleAlphaToOneEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface SampleCoverageEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}int4" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface Scissor {


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
                 * {@link Long }
                 * 
                 * 
                 */
                List<Long> getValues();

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ScissorTestEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_shade_model_type" default="SMOOTH" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface ShadeModel {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlShadeModelType }
                 *     
                 */
                GlShadeModelType getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlShadeModelType }
                 *     
                 */
                void setValue(GlShadeModelType value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *         &lt;element name="func">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_func_type" default="ALWAYS" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ref">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" default="0" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="mask">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" default="255" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
            public interface StencilFunc {


                /**
                 * func�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLES.Technique.Pass.StencilFunc.Func }
                 *     
                 */
                ProfileGLES.Technique.Pass.StencilFunc.Func getFunc();

                /**
                 * func�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLES.Technique.Pass.StencilFunc.Func }
                 *     
                 */
                void setFunc(ProfileGLES.Technique.Pass.StencilFunc.Func value);

                /**
                 * ref�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLES.Technique.Pass.StencilFunc.Ref }
                 *     
                 */
                ProfileGLES.Technique.Pass.StencilFunc.Ref getRef();

                /**
                 * ref�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLES.Technique.Pass.StencilFunc.Ref }
                 *     
                 */
                void setRef(ProfileGLES.Technique.Pass.StencilFunc.Ref value);

                /**
                 * mask�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLES.Technique.Pass.StencilFunc.Mask }
                 *     
                 */
                ProfileGLES.Technique.Pass.StencilFunc.Mask getMask();

                /**
                 * mask�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLES.Technique.Pass.StencilFunc.Mask }
                 *     
                 */
                void setMask(ProfileGLES.Technique.Pass.StencilFunc.Mask value);


                /**
                 * <p>anonymous complex type��Java�N���X�B
                 * 
                 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gl_func_type" default="ALWAYS" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Func {


                    /**
                     * value�v���p�e�B�̒l���擾���܂��B
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlFuncType }
                     *     
                     */
                    GlFuncType getValue();

                    /**
                     * value�v���p�e�B�̒l��ݒ肵�܂��B
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlFuncType }
                     *     
                     */
                    void setValue(GlFuncType value);

                    /**
                     * param�v���p�e�B�̒l���擾���܂��B
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getParam();

                    /**
                     * param�v���p�e�B�̒l��ݒ肵�܂��B
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setParam(String value);

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
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" default="255" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Mask {


                    /**
                     * value�v���p�e�B�̒l���擾���܂��B
                     * 
                     * @return
                     *     possible object is
                     *     {@link Short }
                     *     
                     */
                    short getValue();

                    /**
                     * value�v���p�e�B�̒l��ݒ肵�܂��B
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Short }
                     *     
                     */
                    void setValue(Short value);

                    /**
                     * param�v���p�e�B�̒l���擾���܂��B
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getParam();

                    /**
                     * param�v���p�e�B�̒l��ݒ肵�܂��B
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setParam(String value);

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
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" default="0" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Ref {


                    /**
                     * value�v���p�e�B�̒l���擾���܂��B
                     * 
                     * @return
                     *     possible object is
                     *     {@link Short }
                     *     
                     */
                    short getValue();

                    /**
                     * value�v���p�e�B�̒l��ݒ肵�܂��B
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Short }
                     *     
                     */
                    void setValue(Short value);

                    /**
                     * param�v���p�e�B�̒l���擾���܂��B
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getParam();

                    /**
                     * param�v���p�e�B�̒l��ݒ肵�܂��B
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}int" default="4294967295" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface StencilMask {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                long getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                void setValue(Long value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *         &lt;element name="fail">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gles_stencil_op_type" default="KEEP" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="zfail">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gles_stencil_op_type" default="KEEP" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="zpass">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gles_stencil_op_type" default="KEEP" />
             *                 &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
            public interface StencilOp {


                /**
                 * fail�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLES.Technique.Pass.StencilOp.Fail }
                 *     
                 */
                ProfileGLES.Technique.Pass.StencilOp.Fail getFail();

                /**
                 * fail�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLES.Technique.Pass.StencilOp.Fail }
                 *     
                 */
                void setFail(ProfileGLES.Technique.Pass.StencilOp.Fail value);

                /**
                 * zfail�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLES.Technique.Pass.StencilOp.Zfail }
                 *     
                 */
                ProfileGLES.Technique.Pass.StencilOp.Zfail getZfail();

                /**
                 * zfail�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLES.Technique.Pass.StencilOp.Zfail }
                 *     
                 */
                void setZfail(ProfileGLES.Technique.Pass.StencilOp.Zfail value);

                /**
                 * zpass�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProfileGLES.Technique.Pass.StencilOp.Zpass }
                 *     
                 */
                ProfileGLES.Technique.Pass.StencilOp.Zpass getZpass();

                /**
                 * zpass�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProfileGLES.Technique.Pass.StencilOp.Zpass }
                 *     
                 */
                void setZpass(ProfileGLES.Technique.Pass.StencilOp.Zpass value);


                /**
                 * <p>anonymous complex type��Java�N���X�B
                 * 
                 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gles_stencil_op_type" default="KEEP" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Fail {


                    /**
                     * value�v���p�e�B�̒l���擾���܂��B
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlesStencilOpType }
                     *     
                     */
                    GlesStencilOpType getValue();

                    /**
                     * value�v���p�e�B�̒l��ݒ肵�܂��B
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlesStencilOpType }
                     *     
                     */
                    void setValue(GlesStencilOpType value);

                    /**
                     * param�v���p�e�B�̒l���擾���܂��B
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getParam();

                    /**
                     * param�v���p�e�B�̒l��ݒ肵�܂��B
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setParam(String value);

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
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gles_stencil_op_type" default="KEEP" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Zfail {


                    /**
                     * value�v���p�e�B�̒l���擾���܂��B
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlesStencilOpType }
                     *     
                     */
                    GlesStencilOpType getValue();

                    /**
                     * value�v���p�e�B�̒l��ݒ肵�܂��B
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlesStencilOpType }
                     *     
                     */
                    void setValue(GlesStencilOpType value);

                    /**
                     * param�v���p�e�B�̒l���擾���܂��B
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getParam();

                    /**
                     * param�v���p�e�B�̒l��ݒ肵�܂��B
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setParam(String value);

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
                 *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gles_stencil_op_type" default="KEEP" />
                 *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                public interface Zpass {


                    /**
                     * value�v���p�e�B�̒l���擾���܂��B
                     * 
                     * @return
                     *     possible object is
                     *     {@link GlesStencilOpType }
                     *     
                     */
                    GlesStencilOpType getValue();

                    /**
                     * value�v���p�e�B�̒l��ݒ肵�܂��B
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GlesStencilOpType }
                     *     
                     */
                    void setValue(GlesStencilOpType value);

                    /**
                     * param�v���p�e�B�̒l���擾���܂��B
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    String getParam();

                    /**
                     * param�v���p�e�B�̒l��ݒ肵�܂��B
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface StencilTestEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *         &lt;element name="value" type="{http://www.collada.org/2005/11/COLLADASchema}gles_texture_pipeline" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface TexturePipeline {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link GlesTexturePipeline }
                 *     
                 */
                GlesTexturePipeline getValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GlesTexturePipeline }
                 *     
                 */
                void setValue(GlesTexturePipeline value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
             *       &lt;attribute name="value" type="{http://www.collada.org/2005/11/COLLADASchema}bool" default="false" />
             *       &lt;attribute name="param" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            public interface TexturePipelineEnable {


                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                boolean isValue();

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                void setValue(Boolean value);

                /**
                 * param�v���p�e�B�̒l���擾���܂��B
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                String getParam();

                /**
                 * param�v���p�e�B�̒l��ݒ肵�܂��B
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                void setParam(String value);

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
         *         &lt;element name="annotate" type="{http://www.collada.org/2005/11/COLLADASchema}fx_annotate_common" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;group ref="{http://www.collada.org/2005/11/COLLADASchema}gles_basic_type_common"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface Setparam {


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
             * enum�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            String getEnum();

            /**
             * enum�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            void setEnum(String value);

            /**
             * textureUnit�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link GlesTextureUnit }
             *     
             */
            GlesTextureUnit getTextureUnit();

            /**
             * textureUnit�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link GlesTextureUnit }
             *     
             */
            void setTextureUnit(GlesTextureUnit value);

            /**
             * samplerState�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link GlesSamplerState }
             *     
             */
            GlesSamplerState getSamplerState();

            /**
             * samplerState�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link GlesSamplerState }
             *     
             */
            void setSamplerState(GlesSamplerState value);

            /**
             * texturePipeline�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link GlesTexturePipeline }
             *     
             */
            GlesTexturePipeline getTexturePipeline();

            /**
             * texturePipeline�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link GlesTexturePipeline }
             *     
             */
            void setTexturePipeline(GlesTexturePipeline value);

            /**
             * surface�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link FxSurfaceCommon }
             *     
             */
            FxSurfaceCommon getSurface();

            /**
             * surface�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link FxSurfaceCommon }
             *     
             */
            void setSurface(FxSurfaceCommon value);

            /**
             * Gets the value of the float4X4 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float4X4 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat4X4().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat4X4();

            /**
             * Gets the value of the float4X3 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float4X3 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat4X3().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat4X3();

            /**
             * Gets the value of the float4X2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float4X2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat4X2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat4X2();

            /**
             * Gets the value of the float4X1 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float4X1 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat4X1().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat4X1();

            /**
             * Gets the value of the float3X4 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float3X4 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat3X4().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat3X4();

            /**
             * Gets the value of the float3X3 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float3X3 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat3X3().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat3X3();

            /**
             * Gets the value of the float3X2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float3X2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat3X2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat3X2();

            /**
             * Gets the value of the float3X1 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float3X1 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat3X1().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat3X1();

            /**
             * Gets the value of the float2X4 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float2X4 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat2X4().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat2X4();

            /**
             * Gets the value of the float2X3 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float2X3 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat2X3().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat2X3();

            /**
             * Gets the value of the float2X2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float2X2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat2X2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat2X2();

            /**
             * Gets the value of the float2X1 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float2X1 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat2X1().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat2X1();

            /**
             * Gets the value of the float1X4 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float1X4 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat1X4().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat1X4();

            /**
             * Gets the value of the float1X3 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float1X3 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat1X3().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat1X3();

            /**
             * Gets the value of the float1X2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float1X2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat1X2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat1X2();

            /**
             * float1X1�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            Double getFloat1X1();

            /**
             * float1X1�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            void setFloat1X1(Double value);

            /**
             * Gets the value of the float4 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float4 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat4().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat4();

            /**
             * Gets the value of the float3 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float3 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat3().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat3();

            /**
             * Gets the value of the float2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the float2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFloat2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Double }
             * 
             * 
             */
            List<Double> getFloat2();

            /**
             * float�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            Double getFloat();

            /**
             * float�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            void setFloat(Double value);

            /**
             * Gets the value of the int4 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the int4 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInt4().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Long }
             * 
             * 
             */
            List<Long> getInt4();

            /**
             * Gets the value of the int3 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the int3 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInt3().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Long }
             * 
             * 
             */
            List<Long> getInt3();

            /**
             * Gets the value of the int2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the int2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInt2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Long }
             * 
             * 
             */
            List<Long> getInt2();

            /**
             * int�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            Long getInt();

            /**
             * int�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            void setInt(Long value);

            /**
             * Gets the value of the bool4 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bool4 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBool4().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Boolean }
             * 
             * 
             */
            List<Boolean> getBool4();

            /**
             * Gets the value of the bool3 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bool3 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBool3().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Boolean }
             * 
             * 
             */
            List<Boolean> getBool3();

            /**
             * Gets the value of the bool2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bool2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBool2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Boolean }
             * 
             * 
             */
            List<Boolean> getBool2();

            /**
             * bool�v���p�e�B�̒l���擾���܂��B
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            Boolean isBool();

            /**
             * bool�v���p�e�B�̒l��ݒ肵�܂��B
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            void setBool(Boolean value);

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

    }

}
