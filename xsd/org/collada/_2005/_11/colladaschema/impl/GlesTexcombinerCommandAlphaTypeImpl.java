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
import org.collada._2005._11.colladaschema.GlesTexcombinerArgumentAlphaType;
import org.collada._2005._11.colladaschema.GlesTexcombinerCommandAlphaType;
import org.collada._2005._11.colladaschema.GlesTexcombinerOperatorAlphaEnums;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gles_texcombiner_commandAlpha_type", propOrder = {
    "arguments"
})
public class GlesTexcombinerCommandAlphaTypeImpl
    implements GlesTexcombinerCommandAlphaType
{

    @XmlElement(name = "argument", required = true, type = GlesTexcombinerArgumentAlphaTypeImpl.class)
    protected List<GlesTexcombinerArgumentAlphaType> arguments;
    @XmlAttribute(name = "operator")
    protected GlesTexcombinerOperatorAlphaEnums operator;
    @XmlAttribute(name = "scale")
    protected Float scale;

    public List<GlesTexcombinerArgumentAlphaType> getArguments() {
        if (arguments == null) {
            arguments = new ArrayList<GlesTexcombinerArgumentAlphaType>();
        }
        return this.arguments;
    }

    public GlesTexcombinerOperatorAlphaEnums getOperator() {
        return operator;
    }

    public void setOperator(GlesTexcombinerOperatorAlphaEnums value) {
        this.operator = value;
    }

    public Float getScale() {
        return scale;
    }

    public void setScale(Float value) {
        this.scale = value;
    }

}
