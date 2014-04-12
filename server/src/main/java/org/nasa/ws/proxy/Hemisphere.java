
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hemisphere.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="hemisphere">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SOUTH"/>
 *     &lt;enumeration value="NORTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "hemisphere")
@XmlEnum
public enum Hemisphere {

    SOUTH,
    NORTH;

    public String value() {
        return name();
    }

    public static Hemisphere fromValue(String v) {
        return valueOf(v);
    }

}
