
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for degreeFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="degreeFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DECIMAL"/>
 *     &lt;enumeration value="MINUTES"/>
 *     &lt;enumeration value="MINUTES_SECONDS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "degreeFormat")
@XmlEnum
public enum DegreeFormat {

    DECIMAL,
    MINUTES,
    MINUTES_SECONDS;

    public String value() {
        return name();
    }

    public static DegreeFormat fromValue(String v) {
        return valueOf(v);
    }

}
