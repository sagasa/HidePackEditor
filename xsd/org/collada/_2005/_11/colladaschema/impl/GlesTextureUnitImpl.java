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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.GlesTextureUnit;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gles_texture_unit", propOrder = {
    "surface",
    "samplerState",
    "texcoord",
    "extras"
})
public class GlesTextureUnitImpl
    implements GlesTextureUnit
{

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String surface;
    @XmlElement(name = "sampler_state")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String samplerState;
    @XmlElement(type = GlesTextureUnitImpl.TexcoordImpl.class)
    protected GlesTextureUnitImpl.TexcoordImpl texcoord;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;
    @XmlAttribute(name = "sid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sid;

    public String getSurface() {
        return surface;
    }

    public void setSurface(String value) {
        this.surface = value;
    }

    public String getSamplerState() {
        return samplerState;
    }

    public void setSamplerState(String value) {
        this.samplerState = value;
    }

    public GlesTextureUnit.Texcoord getTexcoord() {
        return texcoord;
    }

    public void setTexcoord(GlesTextureUnit.Texcoord value) {
        this.texcoord = ((GlesTextureUnitImpl.TexcoordImpl) value);
    }

    public List<Extra> getExtras() {
        if (extras == null) {
            extras = new ArrayList<Extra>();
        }
        return this.extras;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String value) {
        this.sid = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TexcoordImpl
        implements GlesTextureUnit.Texcoord
    {

        @XmlAttribute(name = "semantic")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String semantic;

        public String getSemantic() {
            return semantic;
        }

        public void setSemantic(String value) {
            this.semantic = value;
        }

    }

}
