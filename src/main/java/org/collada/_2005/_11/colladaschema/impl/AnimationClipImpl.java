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
import org.collada._2005._11.colladaschema.AnimationClip;
import org.collada._2005._11.colladaschema.Asset;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.InstanceWithExtra;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asset",
    "instanceAnimations",
    "extras"
})
@XmlRootElement(name = "animation_clip")
public class AnimationClipImpl
    implements AnimationClip
{

    @XmlElement(type = AssetImpl.class)
    protected AssetImpl asset;
    @XmlElement(name = "instance_animation", required = true, type = InstanceWithExtraImpl.class)
    protected List<InstanceWithExtra> instanceAnimations;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "start")
    protected Double start;
    @XmlAttribute(name = "end")
    protected Double end;

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset value) {
        this.asset = ((AssetImpl) value);
    }

    public List<InstanceWithExtra> getInstanceAnimations() {
        if (instanceAnimations == null) {
            instanceAnimations = new ArrayList<InstanceWithExtra>();
        }
        return this.instanceAnimations;
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

    public double getStart() {
        if (start == null) {
            return  0.0D;
        } else {
            return start;
        }
    }

    public void setStart(Double value) {
        this.start = value;
    }

    public Double getEnd() {
        return end;
    }

    public void setEnd(Double value) {
        this.end = value;
    }

}
