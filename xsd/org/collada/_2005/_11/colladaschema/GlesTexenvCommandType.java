//
// ���̃t�@�C���́AJavaTM Architecture for XML Binding(JAXB) Reference Implementation�Av2.2.8-b130911.1802�ɂ���Đ�������܂��� 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>���Q�Ƃ��Ă������� 
// �\�[�X�E�X�L�[�}�̍ăR���p�C�����ɂ��̃t�@�C���̕ύX�͎����܂��B 
// ������: 2020.05.28 ���� 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;



/**
 * <p>gles_texenv_command_type complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * 
 * <pre>
 * &lt;complexType name="gles_texenv_command_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constant" type="{http://www.collada.org/2005/11/COLLADASchema}gles_texture_constant_type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operator" type="{http://www.collada.org/2005/11/COLLADASchema}gles_texenv_mode_enums" />
 *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface GlesTexenvCommandType {


    /**
     * constant�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link GlesTextureConstantType }
     *     
     */
    GlesTextureConstantType getConstant();

    /**
     * constant�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link GlesTextureConstantType }
     *     
     */
    void setConstant(GlesTextureConstantType value);

    /**
     * operator�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link GlesTexenvModeEnums }
     *     
     */
    GlesTexenvModeEnums getOperator();

    /**
     * operator�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link GlesTexenvModeEnums }
     *     
     */
    void setOperator(GlesTexenvModeEnums value);

    /**
     * unit�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getUnit();

    /**
     * unit�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setUnit(String value);

}
