//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;

import java.util.List;


/**
 * 
 * 			Defines a set of texturing commands that will be converted into multitexturing operations using glTexEnv in regular and combiner mode.
 * 			
 * 
 * <p>gles_texture_pipeline complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="gles_texture_pipeline">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="texcombiner" type="{http://www.collada.org/2005/11/COLLADASchema}gles_texcombiner_command_type"/>
 *         &lt;element name="texenv" type="{http://www.collada.org/2005/11/COLLADASchema}gles_texenv_command_type"/>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra"/>
 *       &lt;/choice>
 *       &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface GlesTexturePipeline {


    /**
     * Gets the value of the texcombinersAndTexenvsAndExtras property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the texcombinersAndTexenvsAndExtras property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTexcombinersAndTexenvsAndExtras().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlesTexcombinerCommandType }
     * {@link GlesTexenvCommandType }
     * {@link Extra }
     * 
     * 
     */
    List<Object> getTexcombinersAndTexenvsAndExtras();

    /**
     * sidプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSid();

    /**
     * sidプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSid(String value);

}
