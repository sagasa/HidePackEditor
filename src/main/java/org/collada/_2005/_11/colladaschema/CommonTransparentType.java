//
// ���̃t�@�C���́AJavaTM Architecture for XML Binding(JAXB) Reference Implementation�Av2.2.8-b130911.1802�ɂ���Đ�������܂��� 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>���Q�Ƃ��Ă������� 
// �\�[�X�E�X�L�[�}�̍ăR���p�C�����ɂ��̃t�@�C���̕ύX�͎����܂��B 
// ������: 2020.05.28 ���� 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;



/**
 * <p>common_transparent_type complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * 
 * <pre>
 * &lt;complexType name="common_transparent_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.collada.org/2005/11/COLLADASchema}common_color_or_texture_type">
 *       &lt;attribute name="opaque" type="{http://www.collada.org/2005/11/COLLADASchema}fx_opaque_enum" default="A_ONE" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface CommonTransparentType
    extends CommonColorOrTextureType
{


    /**
     * opaque�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link FxOpaqueEnum }
     *     
     */
    FxOpaqueEnum getOpaque();

    /**
     * opaque�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link FxOpaqueEnum }
     *     
     */
    void setOpaque(FxOpaqueEnum value);

}
