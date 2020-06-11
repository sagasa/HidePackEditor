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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.FxAnnotateCommon;
import org.collada._2005._11.colladaschema.GlslSetparamSimple;
import org.collada._2005._11.colladaschema.GlslSurfaceType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "glsl_surface_type", propOrder = {
    "generator"
})
public class GlslSurfaceTypeImpl
    extends FxSurfaceCommonImpl
    implements GlslSurfaceType
{

    @XmlElement(type = GlslSurfaceTypeImpl.GeneratorImpl.class)
    protected GlslSurfaceTypeImpl.GeneratorImpl generator;

    public GlslSurfaceType.Generator getGenerator() {
        return generator;
    }

    public void setGenerator(GlslSurfaceType.Generator value) {
        this.generator = ((GlslSurfaceTypeImpl.GeneratorImpl) value);
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "annotates",
        "codesAndIncludes",
        "name",
        "setparams"
    })
    public static class GeneratorImpl
        implements GlslSurfaceType.Generator
    {

        @XmlElement(name = "annotate", type = FxAnnotateCommonImpl.class)
        protected List<FxAnnotateCommon> annotates;
        @XmlElements({
            @XmlElement(name = "code", type = FxCodeProfileImpl.class),
            @XmlElement(name = "include", type = FxIncludeCommonImpl.class)
        })
        protected List<Object> codesAndIncludes;
        @XmlElement(required = true, type = GlslSurfaceTypeImpl.GeneratorImpl.NameImpl.class)
        protected GlslSurfaceTypeImpl.GeneratorImpl.NameImpl name;
        @XmlElement(name = "setparam", type = GlslSetparamSimpleImpl.class)
        protected List<GlslSetparamSimple> setparams;

        public List<FxAnnotateCommon> getAnnotates() {
            if (annotates == null) {
                annotates = new ArrayList<FxAnnotateCommon>();
            }
            return this.annotates;
        }

        public List<Object> getCodesAndIncludes() {
            if (codesAndIncludes == null) {
                codesAndIncludes = new ArrayList<Object>();
            }
            return this.codesAndIncludes;
        }

        public GlslSurfaceType.Generator.Name getName() {
            return name;
        }

        public void setName(GlslSurfaceType.Generator.Name value) {
            this.name = ((GlslSurfaceTypeImpl.GeneratorImpl.NameImpl) value);
        }

        public List<GlslSetparamSimple> getSetparams() {
            if (setparams == null) {
                setparams = new ArrayList<GlslSetparamSimple>();
            }
            return this.setparams;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class NameImpl
            implements GlslSurfaceType.Generator.Name
        {

            @XmlValue
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String value;
            @XmlAttribute(name = "source")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String source;

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String value) {
                this.source = value;
            }

        }

    }

}
