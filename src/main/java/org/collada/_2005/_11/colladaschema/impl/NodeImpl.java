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
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.Asset;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.InstanceController;
import org.collada._2005._11.colladaschema.InstanceGeometry;
import org.collada._2005._11.colladaschema.InstanceWithExtra;
import org.collada._2005._11.colladaschema.Node;
import org.collada._2005._11.colladaschema.NodeType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asset",
    "lookatsAndMatrixesAndRotates",
    "instanceCameras",
    "instanceControllers",
    "instanceGeometries",
    "instanceLights",
    "instanceNodes",
    "nodes",
    "extras"
})
@XmlRootElement(name = "node")
public class NodeImpl
    implements Node
{

    @XmlElement(type = AssetImpl.class)
    protected AssetImpl asset;
    @XmlElementRefs({
        @XmlElementRef(name = "scale", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "translate", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lookat", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = LookatImpl.class, required = false),
        @XmlElementRef(name = "rotate", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = RotateImpl.class, required = false),
        @XmlElementRef(name = "matrix", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = MatrixImpl.class, required = false),
        @XmlElementRef(name = "skew", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = SkewImpl.class, required = false)
    })
    protected List<Object> lookatsAndMatrixesAndRotates;
    @XmlElement(name = "instance_camera", type = InstanceWithExtraImpl.class)
    protected List<InstanceWithExtra> instanceCameras;
    @XmlElement(name = "instance_controller", type = InstanceControllerImpl.class)
    protected List<InstanceController> instanceControllers;
    @XmlElement(name = "instance_geometry", type = InstanceGeometryImpl.class)
    protected List<InstanceGeometry> instanceGeometries;
    @XmlElement(name = "instance_light", type = InstanceWithExtraImpl.class)
    protected List<InstanceWithExtra> instanceLights;
    @XmlElement(name = "instance_node", type = InstanceWithExtraImpl.class)
    protected List<InstanceWithExtra> instanceNodes;
    @XmlElement(name = "node", type = NodeImpl.class)
    protected List<Node> nodes;
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
    @XmlAttribute(name = "sid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sid;
    @XmlAttribute(name = "type")
    protected NodeType type;
    @XmlAttribute(name = "layer")
    protected List<String> layers;

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset value) {
        this.asset = ((AssetImpl) value);
    }

    public List<Object> getLookatsAndMatrixesAndRotates() {
        if (lookatsAndMatrixesAndRotates == null) {
            lookatsAndMatrixesAndRotates = new ArrayList<Object>();
        }
        return this.lookatsAndMatrixesAndRotates;
    }

    public List<InstanceWithExtra> getInstanceCameras() {
        if (instanceCameras == null) {
            instanceCameras = new ArrayList<InstanceWithExtra>();
        }
        return this.instanceCameras;
    }

    public List<InstanceController> getInstanceControllers() {
        if (instanceControllers == null) {
            instanceControllers = new ArrayList<InstanceController>();
        }
        return this.instanceControllers;
    }

    public List<InstanceGeometry> getInstanceGeometries() {
        if (instanceGeometries == null) {
            instanceGeometries = new ArrayList<InstanceGeometry>();
        }
        return this.instanceGeometries;
    }

    public List<InstanceWithExtra> getInstanceLights() {
        if (instanceLights == null) {
            instanceLights = new ArrayList<InstanceWithExtra>();
        }
        return this.instanceLights;
    }

    public List<InstanceWithExtra> getInstanceNodes() {
        if (instanceNodes == null) {
            instanceNodes = new ArrayList<InstanceWithExtra>();
        }
        return this.instanceNodes;
    }

    public List<Node> getNodes() {
        if (nodes == null) {
            nodes = new ArrayList<Node>();
        }
        return this.nodes;
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

    public String getSid() {
        return sid;
    }

    public void setSid(String value) {
        this.sid = value;
    }

    public NodeType getType() {
        if (type == null) {
            return NodeType.NODE;
        } else {
            return type;
        }
    }

    public void setType(NodeType value) {
        this.type = value;
    }

    public List<String> getLayers() {
        if (layers == null) {
            layers = new ArrayList<String>();
        }
        return this.layers;
    }

}
