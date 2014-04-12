
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for distanceUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="distanceUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RE"/>
 *     &lt;enumeration value="KM"/>
 *     &lt;enumeration value="INT_KM"/>
 *     &lt;enumeration value="E_KM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "distanceUnits")
@XmlEnum
public enum DistanceUnits {

    RE,
    KM,
    INT_KM,
    E_KM;

    public String value() {
        return name();
    }

    public static DistanceUnits fromValue(String v) {
        return valueOf(v);
    }

}
