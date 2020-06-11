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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.InputLocal;
import org.collada._2005._11.colladaschema.Morph;
import org.collada._2005._11.colladaschema.MorphMethodType;
import org.collada._2005._11.colladaschema.Source;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sources",
    "targets",
    "extras"
})
@XmlRootElement(name = "morph")
public class MorphImpl
    implements Morph
{

    @XmlElement(name = "source", required = true, type = SourceImpl.class)
    protected List<Source> sources;
    @XmlElement(required = true, type = MorphImpl.TargetsImpl.class)
    protected MorphImpl.TargetsImpl targets;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;
    @XmlAttribute(name = "method")
    protected MorphMethodType method;
    @XmlAttribute(name = "source", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String source;

    public List<Source> getSources() {
        if (sources == null) {
            sources = new ArrayList<Source>();
        }
        return this.sources;
    }

    public Morph.Targets getTargets() {
        return targets;
    }

    public void setTargets(Morph.Targets value) {
        this.targets = ((MorphImpl.TargetsImpl) value);
    }

    public List<Extra> getExtras() {
        if (extras == null) {
            extras = new ArrayList<Extra>();
        }
        return this.extras;
    }

    public MorphMethodType getMethod() {
        if (method == null) {
            return MorphMethodType.NORMALIZED;
        } else {
            return method;
        }
    }

    public void setMethod(MorphMethodType value) {
        this.method = value;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String value) {
        this.source = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inputs",
        "extras"
    })
    public static class TargetsImpl
        implements Morph.Targets
    {

        @XmlElement(name = "input", required = true, type = InputLocalImpl.class)
        protected List<InputLocal> inputs;
        @XmlElement(name = "extra", type = ExtraImpl.class)
        protected List<Extra> extras;

        public List<InputLocal> getInputs() {
            if (inputs == null) {
                inputs = new ArrayList<InputLocal>();
            }
            return this.inputs;
        }

        public List<Extra> getExtras() {
            if (extras == null) {
                extras = new ArrayList<Extra>();
            }
            return this.extras;
        }

    }

}
