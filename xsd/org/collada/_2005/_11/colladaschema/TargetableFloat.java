//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2020.05.28 時間 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;



/**
 * 
 * 			The TargetableFloat type is used to represent elements which contain a single float value which can 
 * 			be targeted for animation.
 * 			
 * 
 * <p>TargetableFloat complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="TargetableFloat">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.collada.org/2005/11/COLLADASchema>float">
 *       &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface TargetableFloat {


    /**
     * valueプロパティの値を取得します。
     * 
     */
    double getValue();

    /**
     * valueプロパティの値を設定します。
     * 
     */
    void setValue(double value);

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
