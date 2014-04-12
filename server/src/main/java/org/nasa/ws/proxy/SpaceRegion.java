
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spaceRegion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="spaceRegion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INTERPLANETARY_MEDIUM"/>
 *     &lt;enumeration value="DAYSIDE_MAGNETOSHEATH"/>
 *     &lt;enumeration value="NIGHTSIDE_MAGNETOSHEATH"/>
 *     &lt;enumeration value="DAYSIDE_MAGNETOSPHERE"/>
 *     &lt;enumeration value="NIGHTSIDE_MAGNETOSPHERE"/>
 *     &lt;enumeration value="PLASMA_SHEET"/>
 *     &lt;enumeration value="TAIL_LOBE"/>
 *     &lt;enumeration value="LOW_LATITUDE_BOUNDARY_LAYER"/>
 *     &lt;enumeration value="HIGH_LATITUDE_BOUNDARY_LAYER"/>
 *     &lt;enumeration value="DAYSIDE_PLASMASPHERE"/>
 *     &lt;enumeration value="NIGHTSIDE_PLASMASPHERE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "spaceRegion")
@XmlEnum
public enum SpaceRegion {

    INTERPLANETARY_MEDIUM,
    DAYSIDE_MAGNETOSHEATH,
    NIGHTSIDE_MAGNETOSHEATH,
    DAYSIDE_MAGNETOSPHERE,
    NIGHTSIDE_MAGNETOSPHERE,
    PLASMA_SHEET,
    TAIL_LOBE,
    LOW_LATITUDE_BOUNDARY_LAYER,
    HIGH_LATITUDE_BOUNDARY_LAYER,
    DAYSIDE_PLASMASPHERE,
    NIGHTSIDE_PLASMASPHERE;

    public String value() {
        return name();
    }

    public static SpaceRegion fromValue(String v) {
        return valueOf(v);
    }

}
