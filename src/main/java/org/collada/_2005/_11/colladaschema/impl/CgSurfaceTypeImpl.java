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
import org.collada._2005._11.colladaschema.CgSetparamSimple;
import org.collada._2005._11.colladaschema.CgSurfaceType;
import org.collada._2005._11.colladaschema.FxAnnotateCommon;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cg_surface_type", propOrder = {
    "generator"
})
public class CgSurfaceTypeImpl
    extends FxSurfaceCommonImpl
    implements CgSurfaceType
{

    @XmlElement(type = CgSurfaceTypeImpl.GeneratorImpl.class)
    protected CgSurfaceTypeImpl.GeneratorImpl generator;

    public CgSurfaceType.Generator getGenerator() {
        return generator;
    }

    public void setGenerator(CgSurfaceType.Generator value) {
        this.generator = ((CgSurfaceTypeImpl.GeneratorImpl) value);
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "annotates",
        "codesAndIncludes",
        "name",
        "setparams"
    })
    public static class GeneratorImpl
        implements CgSurfaceType.Generator
    {

        @XmlElement(name = "annotate", type = FxAnnotateCommonImpl.class)
        protected List<FxAnnotateCommon> annotates;
        @XmlElements({
            @XmlElement(name = "code", type = FxCodeProfileImpl.class),
            @XmlElement(name = "include", type = FxIncludeCommonImpl.class)
        })
        protected List<Object> codesAndIncludes;
        @XmlElement(required = true, type = CgSurfaceTypeImpl.GeneratorImpl.NameImpl.class)
        protected CgSurfaceTypeImpl.GeneratorImpl.NameImpl name;
        @XmlElement(name = "setparam", type = CgSetparamSimpleImpl.class)
        protected List<CgSetparamSimple> setparams;

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

        public CgSurfaceType.Generator.Name getName() {
            return name;
        }

        public void setName(CgSurfaceType.Generator.Name value) {
            this.name = ((CgSurfaceTypeImpl.GeneratorImpl.NameImpl) value);
        }

        public List<CgSetparamSimple> getSetparams() {
            if (setparams == null) {
                setparams = new ArrayList<CgSetparamSimple>();
            }
            return this.setparams;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class NameImpl
            implements CgSurfaceType.Generator.Name
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
