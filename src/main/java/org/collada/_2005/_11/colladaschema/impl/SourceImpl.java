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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.Accessor;
import org.collada._2005._11.colladaschema.Asset;
import org.collada._2005._11.colladaschema.BoolArray;
import org.collada._2005._11.colladaschema.FloatArray;
import org.collada._2005._11.colladaschema.IDREFArray;
import org.collada._2005._11.colladaschema.IntArray;
import org.collada._2005._11.colladaschema.NameArray;
import org.collada._2005._11.colladaschema.Source;
import org.collada._2005._11.colladaschema.Technique;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asset",
    "intArray",
    "floatArray",
    "boolArray",
    "nameArray",
    "idrefArray",
    "techniqueCommon",
    "techniques"
})
@XmlRootElement(name = "source")
public class SourceImpl
    implements Source
{

    @XmlElement(type = AssetImpl.class)
    protected AssetImpl asset;
    @XmlElement(name = "int_array", type = IntArrayImpl.class)
    protected IntArrayImpl intArray;
    @XmlElement(name = "float_array", type = FloatArrayImpl.class)
    protected FloatArrayImpl floatArray;
    @XmlElement(name = "bool_array", type = BoolArrayImpl.class)
    protected BoolArrayImpl boolArray;
    @XmlElement(name = "Name_array", type = NameArrayImpl.class)
    protected NameArrayImpl nameArray;
    @XmlElement(name = "IDREF_array", type = IDREFArrayImpl.class)
    protected IDREFArrayImpl idrefArray;
    @XmlElement(name = "technique_common", type = SourceImpl.TechniqueCommonImpl.class)
    protected SourceImpl.TechniqueCommonImpl techniqueCommon;
    @XmlElement(name = "technique", type = TechniqueImpl.class)
    protected List<Technique> techniques;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset value) {
        this.asset = ((AssetImpl) value);
    }

    public IntArray getIntArray() {
        return intArray;
    }

    public void setIntArray(IntArray value) {
        this.intArray = ((IntArrayImpl) value);
    }

    public FloatArray getFloatArray() {
        return floatArray;
    }

    public void setFloatArray(FloatArray value) {
        this.floatArray = ((FloatArrayImpl) value);
    }

    public BoolArray getBoolArray() {
        return boolArray;
    }

    public void setBoolArray(BoolArray value) {
        this.boolArray = ((BoolArrayImpl) value);
    }

    public NameArray getNameArray() {
        return nameArray;
    }

    public void setNameArray(NameArray value) {
        this.nameArray = ((NameArrayImpl) value);
    }

    public IDREFArray getIDREFArray() {
        return idrefArray;
    }

    public void setIDREFArray(IDREFArray value) {
        this.idrefArray = ((IDREFArrayImpl) value);
    }

    public Source.TechniqueCommon getTechniqueCommon() {
        return techniqueCommon;
    }

    public void setTechniqueCommon(Source.TechniqueCommon value) {
        this.techniqueCommon = ((SourceImpl.TechniqueCommonImpl) value);
    }

    public List<Technique> getTechniques() {
        if (techniques == null) {
            techniques = new ArrayList<Technique>();
        }
        return this.techniques;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accessor"
    })
    public static class TechniqueCommonImpl
        implements Source.TechniqueCommon
    {

        @XmlElement(required = true, type = AccessorImpl.class)
        protected AccessorImpl accessor;

        public Accessor getAccessor() {
            return accessor;
        }

        public void setAccessor(Accessor value) {
            this.accessor = ((AccessorImpl) value);
        }

    }

}
