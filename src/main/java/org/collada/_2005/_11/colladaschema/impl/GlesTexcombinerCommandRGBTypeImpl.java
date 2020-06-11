//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.collada._2005._11.colladaschema.GlesTexcombinerArgumentRGBType;
import org.collada._2005._11.colladaschema.GlesTexcombinerCommandRGBType;
import org.collada._2005._11.colladaschema.GlesTexcombinerOperatorRGBEnums;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gles_texcombiner_commandRGB_type", propOrder = {
    "arguments"
})
public class GlesTexcombinerCommandRGBTypeImpl
    implements GlesTexcombinerCommandRGBType
{

    @XmlElement(name = "argument", required = true, type = GlesTexcombinerArgumentRGBTypeImpl.class)
    protected List<GlesTexcombinerArgumentRGBType> arguments;
    @XmlAttribute(name = "operator")
    protected GlesTexcombinerOperatorRGBEnums operator;
    @XmlAttribute(name = "scale")
    protected Float scale;

    public List<GlesTexcombinerArgumentRGBType> getArguments() {
        if (arguments == null) {
            arguments = new ArrayList<GlesTexcombinerArgumentRGBType>();
        }
        return this.arguments;
    }

    public GlesTexcombinerOperatorRGBEnums getOperator() {
        return operator;
    }

    public void setOperator(GlesTexcombinerOperatorRGBEnums value) {
        this.operator = value;
    }

    public Float getScale() {
        return scale;
    }

    public void setScale(Float value) {
        this.scale = value;
    }

}
