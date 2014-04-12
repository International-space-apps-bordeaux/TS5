
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for polarMapOrientation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="polarMapOrientation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQUATORIAL"/>
 *     &lt;enumeration value="NORTH_POLE"/>
 *     &lt;enumeration value="SOUTH_POLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "polarMapOrientation")
@XmlEnum
public enum PolarMapOrientation {

    EQUATORIAL,
    NORTH_POLE,
    SOUTH_POLE;

    public String value() {
        return name();
    }

    public static PolarMapOrientation fromValue(String v) {
        return valueOf(v);
    }

}
