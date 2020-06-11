//
// ���̃t�@�C���́AJavaTM Architecture for XML Binding(JAXB) Reference Implementation�Av2.2.8-b130911.1802�ɂ���Đ�������܂��� 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>���Q�Ƃ��Ă������� 
// �\�[�X�E�X�L�[�}�̍ăR���p�C�����ɂ��̃t�@�C���̕ύX�͎����܂��B 
// ������: 2020.05.28 ���� 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema.impl;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.InputLocalOffset;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputLocalOffset")
public class InputLocalOffsetImpl
    implements InputLocalOffset
{

    @XmlAttribute(name = "offset", required = true)
    protected BigInteger offset;
    @XmlAttribute(name = "semantic", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String semantic;
    @XmlAttribute(name = "source", required = true)
    protected String source;
    @XmlAttribute(name = "set")
    protected BigInteger set;

    public BigInteger getOffset() {
        return offset;
    }

    public void setOffset(BigInteger value) {
        this.offset = value;
    }

    public String getSemantic() {
        return semantic;
    }

    public void setSemantic(String value) {
        this.semantic = value;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String value) {
        this.source = value;
    }

    public BigInteger getSet() {
        return set;
    }

    public void setSet(BigInteger value) {
        this.set = value;
    }

}
