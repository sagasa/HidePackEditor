//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.GlesTexcombinerArgumentAlphaType;
import org.collada._2005._11.colladaschema.GlesTexcombinerOperandAlphaEnums;
import org.collada._2005._11.colladaschema.GlesTexcombinerSourceEnums;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gles_texcombiner_argumentAlpha_type")
public class GlesTexcombinerArgumentAlphaTypeImpl
    implements GlesTexcombinerArgumentAlphaType
{

    @XmlAttribute(name = "source")
    protected GlesTexcombinerSourceEnums source;
    @XmlAttribute(name = "operand")
    protected GlesTexcombinerOperandAlphaEnums operand;
    @XmlAttribute(name = "unit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String unit;

    public GlesTexcombinerSourceEnums getSource() {
        return source;
    }

    public void setSource(GlesTexcombinerSourceEnums value) {
        this.source = value;
    }

    public GlesTexcombinerOperandAlphaEnums getOperand() {
        if (operand == null) {
            return GlesTexcombinerOperandAlphaEnums.SRC_ALPHA;
        } else {
            return operand;
        }
    }

    public void setOperand(GlesTexcombinerOperandAlphaEnums value) {
        this.operand = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String value) {
        this.unit = value;
    }

}
