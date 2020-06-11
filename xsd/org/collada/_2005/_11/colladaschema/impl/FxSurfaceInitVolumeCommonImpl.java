//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.collada._2005._11.colladaschema.FxSurfaceInitVolumeCommon;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fx_surface_init_volume_common", propOrder = {
    "primary",
    "all"
})
public class FxSurfaceInitVolumeCommonImpl
    implements FxSurfaceInitVolumeCommon
{

    @XmlElement(type = FxSurfaceInitVolumeCommonImpl.PrimaryImpl.class)
    protected FxSurfaceInitVolumeCommonImpl.PrimaryImpl primary;
    @XmlElement(type = FxSurfaceInitVolumeCommonImpl.AllImpl.class)
    protected FxSurfaceInitVolumeCommonImpl.AllImpl all;

    public FxSurfaceInitVolumeCommon.Primary getPrimary() {
        return primary;
    }

    public void setPrimary(FxSurfaceInitVolumeCommon.Primary value) {
        this.primary = ((FxSurfaceInitVolumeCommonImpl.PrimaryImpl) value);
    }

    public FxSurfaceInitVolumeCommon.All getAll() {
        return all;
    }

    public void setAll(FxSurfaceInitVolumeCommon.All value) {
        this.all = ((FxSurfaceInitVolumeCommonImpl.AllImpl) value);
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AllImpl
        implements FxSurfaceInitVolumeCommon.All
    {

        @XmlAttribute(name = "ref", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object ref;

        public Object getRef() {
            return ref;
        }

        public void setRef(Object value) {
            this.ref = value;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PrimaryImpl
        implements FxSurfaceInitVolumeCommon.Primary
    {

        @XmlAttribute(name = "ref", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object ref;

        public Object getRef() {
            return ref;
        }

        public void setRef(Object value) {
            this.ref = value;
        }

    }

}
