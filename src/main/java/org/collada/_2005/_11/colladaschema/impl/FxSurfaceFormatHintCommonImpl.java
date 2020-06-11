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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.FxSurfaceFormatHintChannelsEnum;
import org.collada._2005._11.colladaschema.FxSurfaceFormatHintCommon;
import org.collada._2005._11.colladaschema.FxSurfaceFormatHintOptionEnum;
import org.collada._2005._11.colladaschema.FxSurfaceFormatHintPrecisionEnum;
import org.collada._2005._11.colladaschema.FxSurfaceFormatHintRangeEnum;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fx_surface_format_hint_common", propOrder = {
    "channels",
    "range",
    "precision",
    "options",
    "extras"
})
public class FxSurfaceFormatHintCommonImpl
    implements FxSurfaceFormatHintCommon
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FxSurfaceFormatHintChannelsEnum channels;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FxSurfaceFormatHintRangeEnum range;
    @XmlSchemaType(name = "string")
    protected FxSurfaceFormatHintPrecisionEnum precision;
    @XmlElement(name = "option")
    @XmlSchemaType(name = "string")
    protected List<FxSurfaceFormatHintOptionEnum> options;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;

    public FxSurfaceFormatHintChannelsEnum getChannels() {
        return channels;
    }

    public void setChannels(FxSurfaceFormatHintChannelsEnum value) {
        this.channels = value;
    }

    public FxSurfaceFormatHintRangeEnum getRange() {
        return range;
    }

    public void setRange(FxSurfaceFormatHintRangeEnum value) {
        this.range = value;
    }

    public FxSurfaceFormatHintPrecisionEnum getPrecision() {
        return precision;
    }

    public void setPrecision(FxSurfaceFormatHintPrecisionEnum value) {
        this.precision = value;
    }

    public List<FxSurfaceFormatHintOptionEnum> getOptions() {
        if (options == null) {
            options = new ArrayList<FxSurfaceFormatHintOptionEnum>();
        }
        return this.options;
    }

    public List<Extra> getExtras() {
        if (extras == null) {
            extras = new ArrayList<Extra>();
        }
        return this.extras;
    }

}
