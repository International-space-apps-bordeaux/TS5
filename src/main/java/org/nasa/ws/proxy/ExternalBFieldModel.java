
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for externalBFieldModel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="externalBFieldModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="T87"/>
 *     &lt;enumeration value="T89c"/>
 *     &lt;enumeration value="T96"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "externalBFieldModel")
@XmlEnum
public enum ExternalBFieldModel {

    @XmlEnumValue("T87")
    T_87("T87"),
    @XmlEnumValue("T89c")
    T_89_C("T89c"),
    @XmlEnumValue("T96")
    T_96("T96");
    private final String value;

    ExternalBFieldModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalBFieldModel fromValue(String v) {
        for (ExternalBFieldModel c: ExternalBFieldModel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
