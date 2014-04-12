
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for footpointRegion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="footpointRegion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="NORTH_CUSP"/>
 *     &lt;enumeration value="SOUTH_CUSP"/>
 *     &lt;enumeration value="NORTH_CLEFT"/>
 *     &lt;enumeration value="SOUTH_CLEFT"/>
 *     &lt;enumeration value="NORTH_AURORAL_OVAL"/>
 *     &lt;enumeration value="SOUTH_AURORAL_OVAL"/>
 *     &lt;enumeration value="NORTH_POLAR_CAP"/>
 *     &lt;enumeration value="SOUTH_POLAR_CAP"/>
 *     &lt;enumeration value="NORTH_MID_LATITUDE"/>
 *     &lt;enumeration value="SOUTH_MID_LATITUDE"/>
 *     &lt;enumeration value="LOW_LATITUDE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "footpointRegion")
@XmlEnum
public enum FootpointRegion {

    NOT_APPLICABLE,
    NORTH_CUSP,
    SOUTH_CUSP,
    NORTH_CLEFT,
    SOUTH_CLEFT,
    NORTH_AURORAL_OVAL,
    SOUTH_AURORAL_OVAL,
    NORTH_POLAR_CAP,
    SOUTH_POLAR_CAP,
    NORTH_MID_LATITUDE,
    SOUTH_MID_LATITUDE,
    LOW_LATITUDE;

    public String value() {
        return name();
    }

    public static FootpointRegion fromValue(String v) {
        return valueOf(v);
    }

}
