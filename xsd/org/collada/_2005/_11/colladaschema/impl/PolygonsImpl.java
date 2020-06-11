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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.InputLocalOffset;
import org.collada._2005._11.colladaschema.Polygons;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inputs",
    "psAndPhs",
    "extras"
})
@XmlRootElement(name = "polygons")
public class PolygonsImpl implements Polygons
{

    @XmlElement(name = "input", type = InputLocalOffsetImpl.class)
    protected List<InputLocalOffset> inputs;
    @XmlElementRefs({
        @XmlElementRef(name = "p", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ph", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> psAndPhs;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "count", required = true)
    protected BigInteger count;
    @XmlAttribute(name = "material")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String material;

    public List<InputLocalOffset> getInputs() {
        if (inputs == null) {
            inputs = new ArrayList<InputLocalOffset>();
        }
        return this.inputs;
    }

    public List<JAXBElement<?>> getPSAndPhs() {
        if (psAndPhs == null) {
            psAndPhs = new ArrayList<JAXBElement<?>>();
        }
        return this.psAndPhs;
    }

    public List<Extra> getExtras() {
        if (extras == null) {
            extras = new ArrayList<Extra>();
        }
        return this.extras;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public BigInteger getCount() {
        return count;
    }

    public void setCount(BigInteger value) {
        this.count = value;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String value) {
        this.material = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "p",
        "hs"
    })
    public static class PhImpl implements Polygons.Ph
    {

        @XmlList
        @XmlElement(required = true)
        protected List<BigInteger> p;
        @XmlElementRef(name = "h", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class)
        protected List<JAXBElement<List<BigInteger>>> hs;

        public List<BigInteger> getP() {
            if (p == null) {
                p = new ArrayList<BigInteger>();
            }
            return this.p;
        }

        public List<JAXBElement<List<BigInteger>>> getHS() {
            if (hs == null) {
                hs = new ArrayList<JAXBElement<List<BigInteger>>>();
            }
            return this.hs;
        }

    }

}
