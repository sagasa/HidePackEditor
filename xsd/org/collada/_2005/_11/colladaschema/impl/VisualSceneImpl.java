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
import org.collada._2005._11.colladaschema.Asset;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.InstanceEffect;
import org.collada._2005._11.colladaschema.Node;
import org.collada._2005._11.colladaschema.VisualScene;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asset",
    "nodes",
    "evaluateScenes",
    "extras"
})
@XmlRootElement(name = "visual_scene")
public class VisualSceneImpl
    implements VisualScene
{

    @XmlElement(type = AssetImpl.class)
    protected AssetImpl asset;
    @XmlElement(name = "node", required = true, type = NodeImpl.class)
    protected List<Node> nodes;
    @XmlElement(name = "evaluate_scene", type = VisualSceneImpl.EvaluateSceneImpl.class)
    protected List<VisualScene.EvaluateScene> evaluateScenes;
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

    public List<Node> getNodes() {
        if (nodes == null) {
            nodes = new ArrayList<Node>();
        }
        return this.nodes;
    }

    public List<VisualScene.EvaluateScene> getEvaluateScenes() {
        if (evaluateScenes == null) {
            evaluateScenes = new ArrayList<VisualScene.EvaluateScene>();
        }
        return this.evaluateScenes;
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

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "renders"
    })
    public static class EvaluateSceneImpl
        implements VisualScene.EvaluateScene
    {

        @XmlElement(name = "render", required = true, type = VisualSceneImpl.EvaluateSceneImpl.RenderImpl.class)
        protected List<VisualScene.EvaluateScene.Render> renders;
        @XmlAttribute(name = "name")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String name;

        public List<VisualScene.EvaluateScene.Render> getRenders() {
            if (renders == null) {
                renders = new ArrayList<VisualScene.EvaluateScene.Render>();
            }
            return this.renders;
        }

        public String getName() {
            return name;
        }

        public void setName(String value) {
            this.name = value;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "layers",
            "instanceEffect"
        })
        public static class RenderImpl
            implements VisualScene.EvaluateScene.Render
        {

            @XmlElement(name = "layer")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected List<String> layers;
            @XmlElement(name = "instance_effect", type = InstanceEffectImpl.class)
            protected InstanceEffectImpl instanceEffect;
            @XmlAttribute(name = "camera_node", required = true)
            @XmlSchemaType(name = "anyURI")
            protected String cameraNode;

            public List<String> getLayers() {
                if (layers == null) {
                    layers = new ArrayList<String>();
                }
                return this.layers;
            }

            public InstanceEffect getInstanceEffect() {
                return instanceEffect;
            }

            public void setInstanceEffect(InstanceEffect value) {
                this.instanceEffect = ((InstanceEffectImpl) value);
            }

            public String getCameraNode() {
                return cameraNode;
            }

            public void setCameraNode(String value) {
                this.cameraNode = value;
            }

        }

    }

}
