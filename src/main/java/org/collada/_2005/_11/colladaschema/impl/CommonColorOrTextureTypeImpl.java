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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.CommonColorOrTextureType;
import org.collada._2005._11.colladaschema.Extra;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "common_color_or_texture_type", propOrder = {
    "texture",
    "param",
    "color"
})
@XmlSeeAlso({
    CommonTransparentTypeImpl.class
})
public class CommonColorOrTextureTypeImpl
    implements CommonColorOrTextureType
{

    @XmlElement(type = CommonColorOrTextureTypeImpl.TextureImpl.class)
    protected CommonColorOrTextureTypeImpl.TextureImpl texture;
    @XmlElement(type = CommonColorOrTextureTypeImpl.ParamImpl.class)
    protected CommonColorOrTextureTypeImpl.ParamImpl param;
    @XmlElement(type = CommonColorOrTextureTypeImpl.ColorImpl.class)
    protected CommonColorOrTextureTypeImpl.ColorImpl color;

    public CommonColorOrTextureType.Texture getTexture() {
        return texture;
    }

    public void setTexture(CommonColorOrTextureType.Texture value) {
        this.texture = ((CommonColorOrTextureTypeImpl.TextureImpl) value);
    }

    public CommonColorOrTextureType.Param getParam() {
        return param;
    }

    public void setParam(CommonColorOrTextureType.Param value) {
        this.param = ((CommonColorOrTextureTypeImpl.ParamImpl) value);
    }

    public CommonColorOrTextureType.Color getColor() {
        return color;
    }

    public void setColor(CommonColorOrTextureType.Color value) {
        this.color = ((CommonColorOrTextureTypeImpl.ColorImpl) value);
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "values"
    })
    public static class ColorImpl
        implements CommonColorOrTextureType.Color
    {

        @XmlValue
        protected List<Double> values;
        @XmlAttribute(name = "sid")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String sid;

        public List<Double> getValues() {
            if (values == null) {
                values = new ArrayList<Double>();
            }
            return this.values;
        }

        public String getSid() {
            return sid;
        }

        public void setSid(String value) {
            this.sid = value;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ParamImpl
        implements CommonColorOrTextureType.Param
    {

        @XmlAttribute(name = "ref", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String ref;

        public String getRef() {
            return ref;
        }

        public void setRef(String value) {
            this.ref = value;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "extra"
    })
    public static class TextureImpl
        implements CommonColorOrTextureType.Texture
    {

        @XmlElement(type = ExtraImpl.class)
        protected ExtraImpl extra;
        @XmlAttribute(name = "texture", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String texture;
        @XmlAttribute(name = "texcoord", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String texcoord;

        public Extra getExtra() {
            return extra;
        }

        public void setExtra(Extra value) {
            this.extra = ((ExtraImpl) value);
        }

        public String getTexture() {
            return texture;
        }

        public void setTexture(String value) {
            this.texture = value;
        }

        public String getTexcoord() {
            return texcoord;
        }

        public void setTexcoord(String value) {
            this.texcoord = value;
        }

    }

}
