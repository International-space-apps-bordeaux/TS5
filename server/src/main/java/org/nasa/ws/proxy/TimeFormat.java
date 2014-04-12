
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timeFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="timeFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HH_MM"/>
 *     &lt;enumeration value="HH_MM_SS"/>
 *     &lt;enumeration value="HH_HHHH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "timeFormat")
@XmlEnum
public enum TimeFormat {

    HH_MM,
    HH_MM_SS,
    HH_HHHH;

    public String value() {
        return name();
    }

    public static TimeFormat fromValue(String v) {
        return valueOf(v);
    }

}
