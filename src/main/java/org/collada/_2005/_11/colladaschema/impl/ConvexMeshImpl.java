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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.collada._2005._11.colladaschema.ConvexMesh;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.Source;
import org.collada._2005._11.colladaschema.Vertices;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sources",
    "vertices",
    "linesAndLinestripsAndPolygons",
    "extras"
})
@XmlRootElement(name = "convex_mesh")
public class ConvexMeshImpl
    implements ConvexMesh
{

    @XmlElement(name = "source", type = SourceImpl.class)
    protected List<Source> sources;
    @XmlElement(type = VerticesImpl.class)
    protected VerticesImpl vertices;
    @XmlElements({
        @XmlElement(name = "lines", type = LinesImpl.class),
        @XmlElement(name = "linestrips", type = LinestripsImpl.class),
        @XmlElement(name = "polygons", type = PolygonsImpl.class),
        @XmlElement(name = "polylist", type = PolylistImpl.class),
        @XmlElement(name = "triangles", type = TrianglesImpl.class),
        @XmlElement(name = "trifans", type = TrifansImpl.class),
        @XmlElement(name = "tristrips", type = TristripsImpl.class)
    })
    protected List<Object> linesAndLinestripsAndPolygons;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;
    @XmlAttribute(name = "convex_hull_of")
    @XmlSchemaType(name = "anyURI")
    protected String convexHullOf;

    public List<Source> getSources() {
        if (sources == null) {
            sources = new ArrayList<Source>();
        }
        return this.sources;
    }

    public Vertices getVertices() {
        return vertices;
    }

    public void setVertices(Vertices value) {
        this.vertices = ((VerticesImpl) value);
    }

    public List<Object> getLinesAndLinestripsAndPolygons() {
        if (linesAndLinestripsAndPolygons == null) {
            linesAndLinestripsAndPolygons = new ArrayList<Object>();
        }
        return this.linesAndLinestripsAndPolygons;
    }

    public List<Extra> getExtras() {
        if (extras == null) {
            extras = new ArrayList<Extra>();
        }
        return this.extras;
    }

    public String getConvexHullOf() {
        return convexHullOf;
    }

    public void setConvexHullOf(String value) {
        this.convexHullOf = value;
    }

}
