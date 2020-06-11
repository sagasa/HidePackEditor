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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.collada._2005._11.colladaschema.Box;
import org.collada._2005._11.colladaschema.Extra;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "halfExtents",
    "extras"
})
@XmlRootElement(name = "box")
public class BoxImpl
    implements Box
{

    @XmlList
    @XmlElement(name = "half_extents", type = Double.class)
    protected List<Double> halfExtents;
    @XmlElement(name = "extra", type = ExtraImpl.class)
    protected List<Extra> extras;

    public List<Double> getHalfExtents() {
        if (halfExtents == null) {
            halfExtents = new ArrayList<Double>();
        }
        return this.halfExtents;
    }

    public List<Extra> getExtras() {
        if (extras == null) {
            extras = new ArrayList<Extra>();
        }
        return this.extras;
    }

}
