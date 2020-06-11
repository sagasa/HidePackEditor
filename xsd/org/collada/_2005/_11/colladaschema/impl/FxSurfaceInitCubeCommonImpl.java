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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.collada._2005._11.colladaschema.FxSurfaceFaceEnum;
import org.collada._2005._11.colladaschema.FxSurfaceInitCubeCommon;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fx_surface_init_cube_common", propOrder = {
    "faces",
    "primary",
    "all"
})
public class FxSurfaceInitCubeCommonImpl
    implements FxSurfaceInitCubeCommon
{

    @XmlElement(name = "face", type = FxSurfaceInitCubeCommonImpl.FaceImpl.class)
    protected List<FxSurfaceInitCubeCommon.Face> faces;
    @XmlElement(type = FxSurfaceInitCubeCommonImpl.PrimaryImpl.class)
    protected FxSurfaceInitCubeCommonImpl.PrimaryImpl primary;
    @XmlElement(type = FxSurfaceInitCubeCommonImpl.AllImpl.class)
    protected FxSurfaceInitCubeCommonImpl.AllImpl all;

    public List<FxSurfaceInitCubeCommon.Face> getFaces() {
        if (faces == null) {
            faces = new ArrayList<FxSurfaceInitCubeCommon.Face>();
        }
        return this.faces;
    }

    public FxSurfaceInitCubeCommon.Primary getPrimary() {
        return primary;
    }

    public void setPrimary(FxSurfaceInitCubeCommon.Primary value) {
        this.primary = ((FxSurfaceInitCubeCommonImpl.PrimaryImpl) value);
    }

    public FxSurfaceInitCubeCommon.All getAll() {
        return all;
    }

    public void setAll(FxSurfaceInitCubeCommon.All value) {
        this.all = ((FxSurfaceInitCubeCommonImpl.AllImpl) value);
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AllImpl
        implements FxSurfaceInitCubeCommon.All
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
    public static class FaceImpl
        implements FxSurfaceInitCubeCommon.Face
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
    @XmlType(name = "", propOrder = {
        "orders"
    })
    public static class PrimaryImpl
        implements FxSurfaceInitCubeCommon.Primary
    {

        @XmlElement(name = "order")
        @XmlSchemaType(name = "string")
        protected List<FxSurfaceFaceEnum> orders;
        @XmlAttribute(name = "ref", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object ref;

        public List<FxSurfaceFaceEnum> getOrders() {
            if (orders == null) {
                orders = new ArrayList<FxSurfaceFaceEnum>();
            }
            return this.orders;
        }

        public Object getRef() {
            return ref;
        }

        public void setRef(Object value) {
            this.ref = value;
        }

    }

}
