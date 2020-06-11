//
// ���̃t�@�C���́AJavaTM Architecture for XML Binding(JAXB) Reference Implementation�Av2.2.8-b130911.1802�ɂ���Đ�������܂��� 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>���Q�Ƃ��Ă������� 
// �\�[�X�E�X�L�[�}�̍ăR���p�C�����ɂ��̃t�@�C���̕ύX�͎����܂��B 
// ������: 2020.05.28 ���� 12:29:30 PM JST 
//


package org.collada._2005._11.colladaschema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>fx_pipeline_stage_common��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 * <p>
 * <pre>
 * &lt;simpleType name="fx_pipeline_stage_common">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VERTEXPROGRAM"/>
 *     &lt;enumeration value="FRAGMENTPROGRAM"/>
 *     &lt;enumeration value="VERTEXSHADER"/>
 *     &lt;enumeration value="PIXELSHADER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fx_pipeline_stage_common")
@XmlEnum
public enum FxPipelineStageCommon {

    VERTEXPROGRAM,
    FRAGMENTPROGRAM,
    VERTEXSHADER,
    PIXELSHADER;

    public String value() {
        return name();
    }

    public static FxPipelineStageCommon fromValue(String v) {
        return valueOf(v);
    }

}
