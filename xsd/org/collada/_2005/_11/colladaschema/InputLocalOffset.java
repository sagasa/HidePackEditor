//
// ���̃t�@�C���́AJavaTM Architecture for XML Binding(JAXB) Reference Implementation�Av2.2.8-b130911.1802�ɂ���Đ�������܂��� 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>���Q�Ƃ��Ă������� 
// �\�[�X�E�X�L�[�}�̍ăR���p�C�����ɂ��̃t�@�C���̕ύX�͎����܂��B 
// ������: 2020.05.28 ���� 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;

import java.math.BigInteger;


/**
 * 
 * 			The InputLocalOffset type is used to represent indexed inputs that can only reference resources declared in the same document.
 * 			
 * 
 * <p>InputLocalOffset complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * 
 * <pre>
 * &lt;complexType name="InputLocalOffset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="offset" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}uint" />
 *       &lt;attribute name="semantic" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="source" use="required" type="{http://www.collada.org/2005/11/COLLADASchema}URIFragmentType" />
 *       &lt;attribute name="set" type="{http://www.collada.org/2005/11/COLLADASchema}uint" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface InputLocalOffset {


    /**
     * offset�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    BigInteger getOffset();

    /**
     * offset�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    void setOffset(BigInteger value);

    /**
     * semantic�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSemantic();

    /**
     * semantic�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSemantic(String value);

    /**
     * source�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSource();

    /**
     * source�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSource(String value);

    /**
     * set�v���p�e�B�̒l���擾���܂��B
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    BigInteger getSet();

    /**
     * set�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    void setSet(BigInteger value);

}
