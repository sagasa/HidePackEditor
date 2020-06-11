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
import javax.xml.bind.annotation.XmlType;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.InputLocal;
import org.collada._2005._11.colladaschema.Source;
import org.collada._2005._11.colladaschema.Spline;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sources",
    "controlVertices",
    "extras"
})
@XmlRootElement(name = "spline")
public class SplineImpl
    implements Spline
{

    @XmlElement(name = "source", required = true, type = SourceImpl.class)
    protected List<Source> sources;
    @XmlElement(name = "control_vertices", required = true, type = SplineImpl.ControlVerticesImpl.class)
    protected SplineImpl.ControlVerticesImpl controlVertices;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;
    @XmlAttribute(name = "closed")
    protected Boolean closed;

    public List<Source> getSources() {
        if (sources == null) {
            sources = new ArrayList<Source>();
        }
        return this.sources;
    }

    public Spline.ControlVertices getControlVertices() {
        return controlVertices;
    }

    public void setControlVertices(Spline.ControlVertices value) {
        this.controlVertices = ((SplineImpl.ControlVerticesImpl) value);
    }

    public List<Extra> getExtras() {
        if (extras == null) {
            extras = new ArrayList<Extra>();
        }
        return this.extras;
    }

    public boolean isClosed() {
        if (closed == null) {
            return false;
        } else {
            return closed;
        }
    }

    public void setClosed(Boolean value) {
        this.closed = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inputs",
        "extras"
    })
    public static class ControlVerticesImpl
        implements Spline.ControlVertices
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
