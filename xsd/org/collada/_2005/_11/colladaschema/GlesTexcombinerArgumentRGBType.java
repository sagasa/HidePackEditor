//
// ���̃t�@�C���́AJavaTM Architecture for XML Binding(JAXB) Reference Implementation�Av2.2.8-b130911.1802�ɂ���Đ�������܂��� 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>���Q�Ƃ��Ă������� 
// �\�[�X�E�X�L�[�}�̍ăR���p�C�����ɂ��̃t�@�C���̕ύX�͎����܂��B 
// ������: 2020.05.28 ���� 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;



/**
 * <p>gles_texcombiner_argumentRGB_type complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * 
 * <pre>
 * &lt;complexType name="gles_texcombiner_argumentRGB_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="source" type="{http://www.collada.org/2005/11/COLLADASchema}gles_texcombiner_source_enums" />
 *       &lt;attribute name="operand" type="{http://www.collada.org/2005/11/COLLADASchema}gles_texcombiner_operandRGB_enums" default="SRC_COLOR" />
 *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface GlesTexcombinerArgumentRGBType {


    /**
     * source�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link GlesTexcombinerSourceEnums }
     *     
     */
    GlesTexcombinerSourceEnums getSource();

    /**
     * source�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link GlesTexcombinerSourceEnums }
     *     
     */
    void setSource(GlesTexcombinerSourceEnums value);

    /**
     * operand�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link GlesTexcombinerOperandRGBEnums }
     *     
     */
    GlesTexcombinerOperandRGBEnums getOperand();

    /**
     * operand�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link GlesTexcombinerOperandRGBEnums }
     *     
     */
    void setOperand(GlesTexcombinerOperandRGBEnums value);

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
