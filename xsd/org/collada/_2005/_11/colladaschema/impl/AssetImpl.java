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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import org.collada._2005._11.colladaschema.Asset;
import org.collada._2005._11.colladaschema.UpAxisType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contributors",
    "created",
    "keywords",
    "modified",
    "revision",
    "subject",
    "title",
    "unit",
    "upAxis"
})
@XmlRootElement(name = "asset")
public class AssetImpl
    implements Asset
{

    @XmlElement(name = "contributor", type = AssetImpl.ContributorImpl.class)
    protected List<Asset.Contributor> contributors;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    protected String keywords;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modified;
    protected String revision;
    protected String subject;
    protected String title;
    @XmlElement(type = AssetImpl.UnitImpl.class)
    protected AssetImpl.UnitImpl unit;
    @XmlElement(name = "up_axis", defaultValue = "Y_UP")
    @XmlSchemaType(name = "string")
    protected UpAxisType upAxis;

    public List<Asset.Contributor> getContributors() {
        if (contributors == null) {
            contributors = new ArrayList<Asset.Contributor>();
        }
        return this.contributors;
    }

    public XMLGregorianCalendar getCreated() {
        return created;
    }

    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String value) {
        this.keywords = value;
    }

    public XMLGregorianCalendar getModified() {
        return modified;
    }

    public void setModified(XMLGregorianCalendar value) {
        this.modified = value;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String value) {
        this.revision = value;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String value) {
        this.subject = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public Asset.Unit getUnit() {
        return unit;
    }

    public void setUnit(Asset.Unit value) {
        this.unit = ((AssetImpl.UnitImpl) value);
    }

    public UpAxisType getUpAxis() {
        return upAxis;
    }

    public void setUpAxis(UpAxisType value) {
        this.upAxis = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "author",
        "authoringTool",
        "comments",
        "copyright",
        "sourceData"
    })
    public static class ContributorImpl
        implements Asset.Contributor
    {

        protected String author;
        @XmlElement(name = "authoring_tool")
        protected String authoringTool;
        protected String comments;
        protected String copyright;
        @XmlElement(name = "source_data")
        @XmlSchemaType(name = "anyURI")
        protected String sourceData;

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String value) {
            this.author = value;
        }

        public String getAuthoringTool() {
            return authoringTool;
        }

        public void setAuthoringTool(String value) {
            this.authoringTool = value;
        }

        public String getComments() {
            return comments;
        }

        public void setComments(String value) {
            this.comments = value;
        }

        public String getCopyright() {
            return copyright;
        }

        public void setCopyright(String value) {
            this.copyright = value;
        }

        public String getSourceData() {
            return sourceData;
        }

        public void setSourceData(String value) {
            this.sourceData = value;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UnitImpl
        implements Asset.Unit
    {

        @XmlAttribute(name = "meter")
        protected Double meter;
        @XmlAttribute(name = "name")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NMTOKEN")
        protected String name;

        public double getMeter() {
            if (meter == null) {
                return  1.0D;
            } else {
                return meter;
            }
        }

        public void setMeter(Double value) {
            this.meter = value;
        }

        public String getName() {
            if (name == null) {
                return "meter";
            } else {
                return name;
            }
        }

        public void setName(String value) {
            this.name = value;
        }

    }

}
