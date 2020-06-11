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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.GlesTexturePipeline;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gles_texture_pipeline", propOrder = {
    "texcombinersAndTexenvsAndExtras"
})
public class GlesTexturePipelineImpl
    implements GlesTexturePipeline
{

    @XmlElements({
        @XmlElement(name = "texcombiner", type = GlesTexcombinerCommandTypeImpl.class),
        @XmlElement(name = "texenv", type = GlesTexenvCommandTypeImpl.class),
        @XmlElement(name = "extra", type = ExtraImpl.class)
    })
    protected List<Object> texcombinersAndTexenvsAndExtras;
    @XmlAttribute(name = "sid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sid;

    public List<Object> getTexcombinersAndTexenvsAndExtras() {
        if (texcombinersAndTexenvsAndExtras == null) {
            texcombinersAndTexenvsAndExtras = new ArrayList<Object>();
        }
        return this.texcombinersAndTexenvsAndExtras;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String value) {
        this.sid = value;
    }

}
