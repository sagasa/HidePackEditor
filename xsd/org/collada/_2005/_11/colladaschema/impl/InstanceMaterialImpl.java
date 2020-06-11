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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.InstanceMaterial;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "binds",
    "bindVertexInputs",
    "extras"
})
@XmlRootElement(name = "instance_material")
public class InstanceMaterialImpl
    implements InstanceMaterial
{

    @XmlElement(name = "bind", type = InstanceMaterialImpl.BindImpl.class)
    protected List<InstanceMaterial.Bind> binds;
    @XmlElement(name = "bind_vertex_input", type = InstanceMaterialImpl.BindVertexInputImpl.class)
    protected List<InstanceMaterial.BindVertexInput> bindVertexInputs;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;
    @XmlAttribute(name = "symbol", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String symbol;
    @XmlAttribute(name = "target", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String target;
    @XmlAttribute(name = "sid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sid;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;

    public List<InstanceMaterial.Bind> getBinds() {
        if (binds == null) {
            binds = new ArrayList<InstanceMaterial.Bind>();
        }
        return this.binds;
    }

    public List<InstanceMaterial.BindVertexInput> getBindVertexInputs() {
        if (bindVertexInputs == null) {
            bindVertexInputs = new ArrayList<InstanceMaterial.BindVertexInput>();
        }
        return this.bindVertexInputs;
    }

    public List<Extra> getExtras() {
        if (extras == null) {
            extras = new ArrayList<Extra>();
        }
        return this.extras;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String value) {
        this.symbol = value;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String value) {
        this.target = value;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String value) {
        this.sid = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BindImpl
        implements InstanceMaterial.Bind
    {

        @XmlAttribute(name = "semantic", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String semantic;
        @XmlAttribute(name = "target", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String target;

        public String getSemantic() {
            return semantic;
        }

        public void setSemantic(String value) {
            this.semantic = value;
        }

        public String getTarget() {
            return target;
        }

        public void setTarget(String value) {
            this.target = value;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BindVertexInputImpl
        implements InstanceMaterial.BindVertexInput
    {

        @XmlAttribute(name = "semantic", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String semantic;
        @XmlAttribute(name = "input_semantic", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String inputSemantic;
        @XmlAttribute(name = "input_set")
        protected BigInteger inputSet;

        public String getSemantic() {
            return semantic;
        }

        public void setSemantic(String value) {
            this.semantic = value;
        }

        public String getInputSemantic() {
            return inputSemantic;
        }

        public void setInputSemantic(String value) {
            this.inputSemantic = value;
        }

        public BigInteger getInputSet() {
            return inputSet;
        }

        public void setInputSet(BigInteger value) {
            this.inputSet = value;
        }

    }

}
