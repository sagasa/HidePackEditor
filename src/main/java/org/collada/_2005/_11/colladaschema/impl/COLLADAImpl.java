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
import org.collada._2005._11.colladaschema.Asset;
import org.collada._2005._11.colladaschema.COLLADA;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.InstanceWithExtra;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asset",
    "libraryAnimationsAndLibraryAnimationClipsAndLibraryCameras",
    "scene",
    "extras"
})
@XmlRootElement(name = "COLLADA")
public class COLLADAImpl
    implements COLLADA
{

    @XmlElement(required = true, type = AssetImpl.class)
    protected AssetImpl asset;
    @XmlElements({
        @XmlElement(name = "library_animations", type = LibraryAnimationsImpl.class),
        @XmlElement(name = "library_animation_clips", type = LibraryAnimationClipsImpl.class),
        @XmlElement(name = "library_cameras", type = LibraryCamerasImpl.class),
        @XmlElement(name = "library_controllers", type = LibraryControllersImpl.class),
        @XmlElement(name = "library_geometries", type = LibraryGeometriesImpl.class),
        @XmlElement(name = "library_effects", type = LibraryEffectsImpl.class),
        @XmlElement(name = "library_force_fields", type = LibraryForceFieldsImpl.class),
        @XmlElement(name = "library_images", type = LibraryImagesImpl.class),
        @XmlElement(name = "library_lights", type = LibraryLightsImpl.class),
        @XmlElement(name = "library_materials", type = LibraryMaterialsImpl.class),
        @XmlElement(name = "library_nodes", type = LibraryNodesImpl.class),
        @XmlElement(name = "library_physics_materials", type = LibraryPhysicsMaterialsImpl.class),
        @XmlElement(name = "library_physics_models", type = LibraryPhysicsModelsImpl.class),
        @XmlElement(name = "library_physics_scenes", type = LibraryPhysicsScenesImpl.class),
        @XmlElement(name = "library_visual_scenes", type = LibraryVisualScenesImpl.class)
    })
    protected List<Object> libraryAnimationsAndLibraryAnimationClipsAndLibraryCameras;
    @XmlElement(type = COLLADAImpl.SceneImpl.class)
    protected COLLADAImpl.SceneImpl scene;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset value) {
        this.asset = ((AssetImpl) value);
    }

    public List<Object> getLibraryAnimationsAndLibraryAnimationClipsAndLibraryCameras() {
        if (libraryAnimationsAndLibraryAnimationClipsAndLibraryCameras == null) {
            libraryAnimationsAndLibraryAnimationClipsAndLibraryCameras = new ArrayList<Object>();
        }
        return this.libraryAnimationsAndLibraryAnimationClipsAndLibraryCameras;
    }

    public COLLADA.Scene getScene() {
        return scene;
    }

    public void setScene(COLLADA.Scene value) {
        this.scene = ((COLLADAImpl.SceneImpl) value);
    }

    public List<Extra> getExtras() {
        if (extras == null) {
            extras = new ArrayList<Extra>();
        }
        return this.extras;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String value) {
        this.version = value;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String value) {
        this.base = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "instancePhysicsScenes",
        "instanceVisualScene",
        "extras"
    })
    public static class SceneImpl
        implements COLLADA.Scene
    {

        @XmlElement(name = "instance_physics_scene", type = InstanceWithExtraImpl.class)
        protected List<InstanceWithExtra> instancePhysicsScenes;
        @XmlElement(name = "instance_visual_scene", type = InstanceWithExtraImpl.class)
        protected InstanceWithExtraImpl instanceVisualScene;
        @XmlElement(name = "extra", type = ExtraImpl.class)
        protected List<Extra> extras;

        public List<InstanceWithExtra> getInstancePhysicsScenes() {
            if (instancePhysicsScenes == null) {
                instancePhysicsScenes = new ArrayList<InstanceWithExtra>();
            }
            return this.instancePhysicsScenes;
        }

        public InstanceWithExtra getInstanceVisualScene() {
            return instanceVisualScene;
        }

        public void setInstanceVisualScene(InstanceWithExtra value) {
            this.instanceVisualScene = ((InstanceWithExtraImpl) value);
        }

        public List<Extra> getExtras() {
            if (extras == null) {
                extras = new ArrayList<Extra>();
            }
            return this.extras;
        }

    }

}
