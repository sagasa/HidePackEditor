//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.Asset;
import org.collada._2005._11.colladaschema.Effect;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.FxAnnotateCommon;
import org.collada._2005._11.colladaschema.FxNewparamCommon;
import org.collada._2005._11.colladaschema.Image;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asset",
    "annotates",
    "images",
    "newparams",
    "fxProfileAbstracts",
    "extras"
})
@XmlRootElement(name = "effect")
public class EffectImpl
    implements Effect
{

    @XmlElement(type = AssetImpl.class)
    protected AssetImpl asset;
    @XmlElement(name = "annotate", type = FxAnnotateCommonImpl.class)
    protected List<FxAnnotateCommon> annotates;
    @XmlElement(name = "image", type = ImageImpl.class)
    protected List<Image> images;
    @XmlElement(name = "newparam", type = FxNewparamCommonImpl.class)
    protected List<FxNewparamCommon> newparams;
    @XmlElementRef(name = "fx_profile_abstract", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class)
    protected List<JAXBElement<?>> fxProfileAbstracts;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;
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

    public List<FxAnnotateCommon> getAnnotates() {
        if (annotates == null) {
            annotates = new ArrayList<FxAnnotateCommon>();
        }
        return this.annotates;
    }

    public List<Image> getImages() {
        if (images == null) {
            images = new ArrayList<Image>();
        }
        return this.images;
    }

    public List<FxNewparamCommon> getNewparams() {
        if (newparams == null) {
            newparams = new ArrayList<FxNewparamCommon>();
        }
        return this.newparams;
    }

    public List<JAXBElement<?>> getFxProfileAbstracts() {
        if (fxProfileAbstracts == null) {
            fxProfileAbstracts = new ArrayList<JAXBElement<?>>();
        }
        return this.fxProfileAbstracts;
    }

    public List<Extra> getExtras() {
        if (extras == null) {
            extras = new ArrayList<Extra>();
        }
        return this.extras;
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

}
