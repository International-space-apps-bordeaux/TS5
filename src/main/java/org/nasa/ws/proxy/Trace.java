
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trace.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="trace">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RADIAL"/>
 *     &lt;enumeration value="B_FIELD_NORTH"/>
 *     &lt;enumeration value="B_FIELD_SOUTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "trace")
@XmlEnum
public enum Trace {

    RADIAL,
    B_FIELD_NORTH,
    B_FIELD_SOUTH;

    public String value() {
        return name();
    }

    public static Trace fromValue(String v) {
        return valueOf(v);
    }

}
