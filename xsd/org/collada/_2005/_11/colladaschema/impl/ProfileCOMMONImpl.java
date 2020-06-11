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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.collada._2005._11.colladaschema.Asset;
import org.collada._2005._11.colladaschema.CommonColorOrTextureType;
import org.collada._2005._11.colladaschema.CommonFloatOrParamType;
import org.collada._2005._11.colladaschema.CommonTransparentType;
import org.collada._2005._11.colladaschema.Extra;
import org.collada._2005._11.colladaschema.ProfileCOMMON;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asset",
    "imagesAndNewparams",
    "technique",
    "extras"
})
public class ProfileCOMMONImpl implements ProfileCOMMON
{

    @XmlElement(type = AssetImpl.class)
    protected AssetImpl asset;
    @XmlElements({
        @XmlElement(name = "image", type = ImageImpl.class),
        @XmlElement(name = "newparam", type = CommonNewparamTypeImpl.class)
    })
    protected List<Object> imagesAndNewparams;
    @XmlElement(required = true, type = ProfileCOMMONImpl.TechniqueImpl.class)
    protected ProfileCOMMONImpl.TechniqueImpl technique;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset value) {
        this.asset = ((AssetImpl) value);
    }

    public List<Object> getImagesAndNewparams() {
        if (imagesAndNewparams == null) {
            imagesAndNewparams = new ArrayList<Object>();
        }
        return this.imagesAndNewparams;
    }

    public ProfileCOMMON.Technique getTechnique() {
        return technique;
    }

    public void setTechnique(ProfileCOMMON.Technique value) {
        this.technique = ((ProfileCOMMONImpl.TechniqueImpl) value);
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

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "asset",
        "imagesAndNewparams",
        "blinn",
        "phong",
        "lambert",
        "constant",
        "extras"
    })
    public static class TechniqueImpl
        implements ProfileCOMMON.Technique
    {

        @XmlElement(type = AssetImpl.class)
        protected AssetImpl asset;
        @XmlElements({
            @XmlElement(name = "image", type = ImageImpl.class),
            @XmlElement(name = "newparam", type = CommonNewparamTypeImpl.class)
        })
        protected List<Object> imagesAndNewparams;
        @XmlElement(type = ProfileCOMMONImpl.TechniqueImpl.BlinnImpl.class)
        protected ProfileCOMMONImpl.TechniqueImpl.BlinnImpl blinn;
        @XmlElement(type = ProfileCOMMONImpl.TechniqueImpl.PhongImpl.class)
        protected ProfileCOMMONImpl.TechniqueImpl.PhongImpl phong;
        @XmlElement(type = ProfileCOMMONImpl.TechniqueImpl.LambertImpl.class)
        protected ProfileCOMMONImpl.TechniqueImpl.LambertImpl lambert;
        @XmlElement(type = ProfileCOMMONImpl.TechniqueImpl.ConstantImpl.class)
        protected ProfileCOMMONImpl.TechniqueImpl.ConstantImpl constant;
        @XmlElement(name = "extra", type = ExtraImpl.class)
        protected List<Extra> extras;
        @XmlAttribute(name = "id")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "sid", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String sid;

        public Asset getAsset() {
            return asset;
        }

        public void setAsset(Asset value) {
            this.asset = ((AssetImpl) value);
        }

        public List<Object> getImagesAndNewparams() {
            if (imagesAndNewparams == null) {
                imagesAndNewparams = new ArrayList<Object>();
            }
            return this.imagesAndNewparams;
        }

        public ProfileCOMMON.Technique.Blinn getBlinn() {
            return blinn;
        }

        public void setBlinn(ProfileCOMMON.Technique.Blinn value) {
            this.blinn = ((ProfileCOMMONImpl.TechniqueImpl.BlinnImpl) value);
        }

        public ProfileCOMMON.Technique.Phong getPhong() {
            return phong;
        }

        public void setPhong(ProfileCOMMON.Technique.Phong value) {
            this.phong = ((ProfileCOMMONImpl.TechniqueImpl.PhongImpl) value);
        }

        public ProfileCOMMON.Technique.Lambert getLambert() {
            return lambert;
        }

        public void setLambert(ProfileCOMMON.Technique.Lambert value) {
            this.lambert = ((ProfileCOMMONImpl.TechniqueImpl.LambertImpl) value);
        }

        public ProfileCOMMON.Technique.Constant getConstant() {
            return constant;
        }

        public void setConstant(ProfileCOMMON.Technique.Constant value) {
            this.constant = ((ProfileCOMMONImpl.TechniqueImpl.ConstantImpl) value);
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

        public String getSid() {
            return sid;
        }

        public void setSid(String value) {
            this.sid = value;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "emission",
            "ambient",
            "diffuse",
            "specular",
            "shininess",
            "reflective",
            "reflectivity",
            "transparent",
            "transparency",
            "indexOfRefraction"
        })
        public static class BlinnImpl
            implements ProfileCOMMON.Technique.Blinn
        {

            @XmlElement(type = CommonColorOrTextureTypeImpl.class)
            protected CommonColorOrTextureTypeImpl emission;
            @XmlElement(type = CommonColorOrTextureTypeImpl.class)
            protected CommonColorOrTextureTypeImpl ambient;
            @XmlElement(type = CommonColorOrTextureTypeImpl.class)
            protected CommonColorOrTextureTypeImpl diffuse;
            @XmlElement(type = CommonColorOrTextureTypeImpl.class)
            protected CommonColorOrTextureTypeImpl specular;
            @XmlElement(type = CommonFloatOrParamTypeImpl.class)
            protected CommonFloatOrParamTypeImpl shininess;
            @XmlElement(type = CommonColorOrTextureTypeImpl.class)
            protected CommonColorOrTextureTypeImpl reflective;
            @XmlElement(type = CommonFloatOrParamTypeImpl.class)
            protected CommonFloatOrParamTypeImpl reflectivity;
            @XmlElement(type = CommonTransparentTypeImpl.class)
            protected CommonTransparentTypeImpl transparent;
            @XmlElement(type = CommonFloatOrParamTypeImpl.class)
            protected CommonFloatOrParamTypeImpl transparency;
            @XmlElement(name = "index_of_refraction", type = CommonFloatOrParamTypeImpl.class)
            protected CommonFloatOrParamTypeImpl indexOfRefraction;

            public CommonColorOrTextureType getEmission() {
                return emission;
            }

            public void setEmission(CommonColorOrTextureType value) {
                this.emission = ((CommonColorOrTextureTypeImpl) value);
            }

            public CommonColorOrTextureType getAmbient() {
                return ambient;
            }

            public void setAmbient(CommonColorOrTextureType value) {
                this.ambient = ((CommonColorOrTextureTypeImpl) value);
            }

            public CommonColorOrTextureType getDiffuse() {
                return diffuse;
            }

            public void setDiffuse(CommonColorOrTextureType value) {
                this.diffuse = ((CommonColorOrTextureTypeImpl) value);
            }

            public CommonColorOrTextureType getSpecular() {
                return specular;
            }

            public void setSpecular(CommonColorOrTextureType value) {
                this.specular = ((CommonColorOrTextureTypeImpl) value);
            }

            public CommonFloatOrParamType getShininess() {
                return shininess;
            }

            public void setShininess(CommonFloatOrParamType value) {
                this.shininess = ((CommonFloatOrParamTypeImpl) value);
            }

            public CommonColorOrTextureType getReflective() {
                return reflective;
            }

            public void setReflective(CommonColorOrTextureType value) {
                this.reflective = ((CommonColorOrTextureTypeImpl) value);
            }

            public CommonFloatOrParamType getReflectivity() {
                return reflectivity;
            }

            public void setReflectivity(CommonFloatOrParamType value) {
                this.reflectivity = ((CommonFloatOrParamTypeImpl) value);
            }

            public CommonTransparentType getTransparent() {
                return transparent;
            }

            public void setTransparent(CommonTransparentType value) {
                this.transparent = ((CommonTransparentTypeImpl) value);
            }

            public CommonFloatOrParamType getTransparency() {
                return transparency;
            }

            public void setTransparency(CommonFloatOrParamType value) {
                this.transparency = ((CommonFloatOrParamTypeImpl) value);
            }

            public CommonFloatOrParamType getIndexOfRefraction() {
                return indexOfRefraction;
            }

            public void setIndexOfRefraction(CommonFloatOrParamType value) {
                this.indexOfRefraction = ((CommonFloatOrParamTypeImpl) value);
            }

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "emission",
            "reflective",
            "reflectivity",
            "transparent",
            "transparency",
            "indexOfRefraction"
        })
        public static class ConstantImpl
            implements ProfileCOMMON.Technique.Constant
        {

            @XmlElement(type = CommonColorOrTextureTypeImpl.class)
            protected CommonColorOrTextureTypeImpl emission;
            @XmlElement(type = CommonColorOrTextureTypeImpl.class)
            protected CommonColorOrTextureTypeImpl reflective;
            @XmlElement(type = CommonFloatOrParamTypeImpl.class)
            protected CommonFloatOrParamTypeImpl reflectivity;
            @XmlElement(type = CommonTransparentTypeImpl.class)
            protected CommonTransparentTypeImpl transparent;
            @XmlElement(type = CommonFloatOrParamTypeImpl.class)
            protected CommonFloatOrParamTypeImpl transparency;
            @XmlElement(name = "index_of_refraction", type = CommonFloatOrParamTypeImpl.class)
            protected CommonFloatOrParamTypeImpl indexOfRefraction;

            public CommonColorOrTextureType getEmission() {
                return emission;
            }

            public void setEmission(CommonColorOrTextureType value) {
                this.emission = ((CommonColorOrTextureTypeImpl) value);
            }

            public CommonColorOrTextureType getReflective() {
                return reflective;
            }

            public void setReflective(CommonColorOrTextureType value) {
                this.reflective = ((CommonColorOrTextureTypeImpl) value);
            }

            public CommonFloatOrParamType getReflectivity() {
                return reflectivity;
            }

            public void setReflectivity(CommonFloatOrParamType value) {
                this.reflectivity = ((CommonFloatOrParamTypeImpl) value);
            }

            public CommonTransparentType getTransparent() {
                return transparent;
            }

            public void setTransparent(CommonTransparentType value) {
                this.transparent = ((CommonTransparentTypeImpl) value);
            }

            public CommonFloatOrParamType getTransparency() {
                return transparency;
            }

            public void setTransparency(CommonFloatOrParamType value) {
                this.transparency = ((CommonFloatOrParamTypeImpl) value);
            }

            public CommonFloatOrParamType getIndexOfRefraction() {
                return indexOfRefraction;
            }

            public void setIndexOfRefraction(CommonFloatOrParamType value) {
                this.indexOfRefraction = ((CommonFloatOrParamTypeImpl) value);
            }

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "emission",
            "ambient",
            "diffuse",
            "reflective",
            "reflectivity",
            "transparent",
            "transparency",
            "indexOfRefraction"
        })
        public static class LambertImpl
            implements ProfileCOMMON.Technique.Lambert
        {

            @XmlElement(type = CommonColorOrTextureTypeImpl.class)
            protected CommonColorOrTextureTypeImpl emission;
            @XmlElement(type = CommonColorOrTextureTypeImpl.class)
            protected CommonColorOrTextureTypeImpl ambient;
            @XmlElement(type = CommonColorOrTextureTypeImpl.class)
            protected CommonColorOrTextureTypeImpl diffuse;
            @XmlElement(type = CommonColorOrTextureTypeImpl.class)
            protected CommonColorOrTextureTypeImpl reflective;
            @XmlElement(type = CommonFloatOrParamTypeImpl.class)
            protected CommonFloatOrParamTypeImpl reflectivity;
            @XmlElement(type = CommonTransparentTypeImpl.class)
            protected CommonTransparentTypeImpl transparent;
            @XmlElement(type = CommonFloatOrParamTypeImpl.class)
            protected CommonFloatOrParamTypeImpl transparency;
            @XmlElement(name = "index_of_refraction", type = CommonFloatOrParamTypeImpl.class)
            protected CommonFloatOrParamTypeImpl indexOfRefraction;

            public CommonColorOrTextureType getEmission() {
                return emission;
            }

            public void setEmission(CommonColorOrTextureType value) {
                this.emission = ((CommonColorOrTextureTypeImpl) value);
            }

            public CommonColorOrTextureType getAmbient() {
                return ambient;
            }

            public void setAmbient(CommonColorOrTextureType value) {
                this.ambient = ((CommonColorOrTextureTypeImpl) value);
            }

            public CommonColorOrTextureType getDiffuse() {
                return diffuse;
            }

            public void setDiffuse(CommonColorOrTextureType value) {
                this.diffuse = ((CommonColorOrTextureTypeImpl) value);
            }

            public CommonColorOrTextureType getReflective() {
                return reflective;
            }

            public void setReflective(CommonColorOrTextureType value) {
                this.reflective = ((CommonColorOrTextureTypeImpl) value);
            }

            public CommonFloatOrParamType getReflectivity() {
                return reflectivity;
            }

            public void setReflectivity(CommonFloatOrParamType value) {
                this.reflectivity = ((CommonFloatOrParamTypeImpl) value);
            }

            public CommonTransparentType getTransparent() {
                return transparent;
            }

            public void setTransparent(CommonTransparentType value) {
                this.transparent = ((CommonTransparentTypeImpl) value);
            }

            public CommonFloatOrParamType getTransparency() {
                return transparency;
            }

            public void setTransparency(CommonFloatOrParamType value) {
                this.transparency = ((CommonFloatOrParamTypeImpl) value);
            }

            public CommonFloatOrParamType getIndexOfRefraction() {
                return indexOfRefraction;
            }

            public void setIndexOfRefraction(CommonFloatOrParamType value) {
                this.indexOfRefraction = ((CommonFloatOrParamTypeImpl) value);
            }

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "emission",
            "ambient",
            "diffuse",
            "specular",
            "shininess",
            "reflective",
            "reflectivity",
            "transparent",
            "transparency",
            "indexOfRefraction"
        })
        public static class PhongImpl
            implements ProfileCOMMON.Technique.Phong
        {

            @XmlElement(type = CommonColorOrTextureTypeImpl.class)
            protected CommonColorOrTextureTypeImpl emission;
            @XmlElement(type = CommonColorOrTextureTypeImpl.class)
            protected CommonColorOrTextureTypeImpl ambient;
            @XmlElement(type = CommonColorOrTextureTypeImpl.class)
            protected CommonColorOrTextureTypeImpl diffuse;
            @XmlElement(type = CommonColorOrTextureTypeImpl.class)
            protected CommonColorOrTextureTypeImpl specular;
            @XmlElement(type = CommonFloatOrParamTypeImpl.class)
            protected CommonFloatOrParamTypeImpl shininess;
            @XmlElement(type = CommonColorOrTextureTypeImpl.class)
            protected CommonColorOrTextureTypeImpl reflective;
            @XmlElement(type = CommonFloatOrParamTypeImpl.class)
            protected CommonFloatOrParamTypeImpl reflectivity;
            @XmlElement(type = CommonTransparentTypeImpl.class)
            protected CommonTransparentTypeImpl transparent;
            @XmlElement(type = CommonFloatOrParamTypeImpl.class)
            protected CommonFloatOrParamTypeImpl transparency;
            @XmlElement(name = "index_of_refraction", type = CommonFloatOrParamTypeImpl.class)
            protected CommonFloatOrParamTypeImpl indexOfRefraction;

            public CommonColorOrTextureType getEmission() {
                return emission;
            }

            public void setEmission(CommonColorOrTextureType value) {
                this.emission = ((CommonColorOrTextureTypeImpl) value);
            }

            public CommonColorOrTextureType getAmbient() {
                return ambient;
            }

            public void setAmbient(CommonColorOrTextureType value) {
                this.ambient = ((CommonColorOrTextureTypeImpl) value);
            }

            public CommonColorOrTextureType getDiffuse() {
                return diffuse;
            }

            public void setDiffuse(CommonColorOrTextureType value) {
                this.diffuse = ((CommonColorOrTextureTypeImpl) value);
            }

            public CommonColorOrTextureType getSpecular() {
                return specular;
            }

            public void setSpecular(CommonColorOrTextureType value) {
                this.specular = ((CommonColorOrTextureTypeImpl) value);
            }

            public CommonFloatOrParamType getShininess() {
                return shininess;
            }

            public void setShininess(CommonFloatOrParamType value) {
                this.shininess = ((CommonFloatOrParamTypeImpl) value);
            }

            public CommonColorOrTextureType getReflective() {
                return reflective;
            }

            public void setReflective(CommonColorOrTextureType value) {
                this.reflective = ((CommonColorOrTextureTypeImpl) value);
            }

            public CommonFloatOrParamType getReflectivity() {
                return reflectivity;
            }

            public void setReflectivity(CommonFloatOrParamType value) {
                this.reflectivity = ((CommonFloatOrParamTypeImpl) value);
            }

            public CommonTransparentType getTransparent() {
                return transparent;
            }

            public void setTransparent(CommonTransparentType value) {
                this.transparent = ((CommonTransparentTypeImpl) value);
            }

            public CommonFloatOrParamType getTransparency() {
                return transparency;
            }

            public void setTransparency(CommonFloatOrParamType value) {
                this.transparency = ((CommonFloatOrParamTypeImpl) value);
            }

            public CommonFloatOrParamType getIndexOfRefraction() {
                return indexOfRefraction;
            }

            public void setIndexOfRefraction(CommonFloatOrParamType value) {
                this.indexOfRefraction = ((CommonFloatOrParamTypeImpl) value);
            }

        }

    }

}
