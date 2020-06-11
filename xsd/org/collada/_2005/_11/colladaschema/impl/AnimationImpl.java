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
import org.collada._2005._11.colladaschema.Animation;
import org.collada._2005._11.colladaschema.Asset;
import org.collada._2005._11.colladaschema.Channel;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.Sampler;
import org.collada._2005._11.colladaschema.Source;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asset",
    "sources",
    "samplers",
    "channels",
    "animations",
    "extras"
})
@XmlRootElement(name = "animation")
public class AnimationImpl
    implements Animation
{

    @XmlElement(type = AssetImpl.class)
    protected AssetImpl asset;
    @XmlElement(name = "source", type = SourceImpl.class)
    protected List<Source> sources;
    @XmlElement(name = "sampler", type = SamplerImpl.class)
    protected List<Sampler> samplers;
    @XmlElement(name = "channel", type = ChannelImpl.class)
    protected List<Channel> channels;
    @XmlElement(name = "animation", type = AnimationImpl.class)
    protected List<Animation> animations;
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

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset value) {
        this.asset = ((AssetImpl) value);
    }

    public List<Source> getSources() {
        if (sources == null) {
            sources = new ArrayList<Source>();
        }
        return this.sources;
    }

    public List<Sampler> getSamplers() {
        if (samplers == null) {
            samplers = new ArrayList<Sampler>();
        }
        return this.samplers;
    }

    public List<Channel> getChannels() {
        if (channels == null) {
            channels = new ArrayList<Channel>();
        }
        return this.channels;
    }

    public List<Animation> getAnimations() {
        if (animations == null) {
            animations = new ArrayList<Animation>();
        }
        return this.animations;
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
