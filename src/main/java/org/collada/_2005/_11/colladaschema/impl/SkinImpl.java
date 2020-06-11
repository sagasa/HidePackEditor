//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.InputLocal;
import org.collada._2005._11.colladaschema.InputLocalOffset;
import org.collada._2005._11.colladaschema.Skin;
import org.collada._2005._11.colladaschema.Source;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bindShapeMatrix",
    "sources",
    "joints",
    "vertexWeights",
    "extras"
})
@XmlRootElement(name = "skin")
public class SkinImpl
    implements Skin
{

    @XmlList
    @XmlElement(name = "bind_shape_matrix", type = Double.class)
    protected List<Double> bindShapeMatrix;
    @XmlElement(name = "source", required = true, type = SourceImpl.class)
    protected List<Source> sources;
    @XmlElement(required = true, type = SkinImpl.JointsImpl.class)
    protected SkinImpl.JointsImpl joints;
    @XmlElement(name = "vertex_weights", required = true, type = SkinImpl.VertexWeightsImpl.class)
    protected SkinImpl.VertexWeightsImpl vertexWeights;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;
    @XmlAttribute(name = "source", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String source;

    public List<Double> getBindShapeMatrix() {
        if (bindShapeMatrix == null) {
            bindShapeMatrix = new ArrayList<Double>();
        }
        return this.bindShapeMatrix;
    }

    public List<Source> getSources() {
        if (sources == null) {
            sources = new ArrayList<Source>();
        }
        return this.sources;
    }

    public Skin.Joints getJoints() {
        return joints;
    }

    public void setJoints(Skin.Joints value) {
        this.joints = ((SkinImpl.JointsImpl) value);
    }

    public Skin.VertexWeights getVertexWeights() {
        return vertexWeights;
    }

    public void setVertexWeights(Skin.VertexWeights value) {
        this.vertexWeights = ((SkinImpl.VertexWeightsImpl) value);
    }

    public List<Extra> getExtras() {
        if (extras == null) {
            extras = new ArrayList<Extra>();
        }
        return this.extras;
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
    public static class JointsImpl
        implements Skin.Joints
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

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inputs",
        "vcount",
        "v",
        "extras"
    })
    public static class VertexWeightsImpl
        implements Skin.VertexWeights
    {

        @XmlElement(name = "input", required = true, type = InputLocalOffsetImpl.class)
        protected List<InputLocalOffset> inputs;
        @XmlList
        protected List<BigInteger> vcount;
        @XmlList
        @XmlElement(type = Long.class)
        protected List<Long> v;
        @XmlElement(name = "extra", type = ExtraImpl.class)
        protected List<Extra> extras;
        @XmlAttribute(name = "count", required = true)
        protected BigInteger count;

        public List<InputLocalOffset> getInputs() {
            if (inputs == null) {
                inputs = new ArrayList<InputLocalOffset>();
            }
            return this.inputs;
        }

        public List<BigInteger> getVcount() {
            if (vcount == null) {
                vcount = new ArrayList<BigInteger>();
            }
            return this.vcount;
        }

        public List<Long> getV() {
            if (v == null) {
                v = new ArrayList<Long>();
            }
            return this.v;
        }

        public List<Extra> getExtras() {
            if (extras == null) {
                extras = new ArrayList<Extra>();
            }
            return this.extras;
        }

        public BigInteger getCount() {
            return count;
        }

        public void setCount(BigInteger value) {
            this.count = value;
        }

    }

}
