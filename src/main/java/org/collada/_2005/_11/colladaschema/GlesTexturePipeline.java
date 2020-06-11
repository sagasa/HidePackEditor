//
// ���̃t�@�C���́AJavaTM Architecture for XML Binding(JAXB) Reference Implementation�Av2.2.8-b130911.1802�ɂ���Đ�������܂��� 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>���Q�Ƃ��Ă������� 
// �\�[�X�E�X�L�[�}�̍ăR���p�C�����ɂ��̃t�@�C���̕ύX�͎����܂��B 
// ������: 2020.05.28 ���� 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;

import java.util.List;


/**
 * 
 * 			Defines a set of texturing commands that will be converted into multitexturing operations using glTexEnv in regular and combiner mode.
 * 			
 * 
 * <p>gles_texture_pipeline complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * 
 * <pre>
 * &lt;complexType name="gles_texture_pipeline">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="texcombiner" type="{http://www.collada.org/2005/11/COLLADASchema}gles_texcombiner_command_type"/>
 *         &lt;element name="texenv" type="{http://www.collada.org/2005/11/COLLADASchema}gles_texenv_command_type"/>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra"/>
 *       &lt;/choice>
 *       &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface GlesTexturePipeline {


    /**
     * Gets the value of the texcombinersAndTexenvsAndExtras property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the texcombinersAndTexenvsAndExtras property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTexcombinersAndTexenvsAndExtras().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlesTexcombinerCommandType }
     * {@link GlesTexenvCommandType }
     * {@link Extra }
     * 
     * 
     */
    List<Object> getTexcombinersAndTexenvsAndExtras();

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
