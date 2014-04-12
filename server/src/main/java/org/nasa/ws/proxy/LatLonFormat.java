
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for latLonFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="latLonFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LAT_90_LON_360"/>
 *     &lt;enumeration value="LAT_90_LON_180"/>
 *     &lt;enumeration value="LAT_90_SN_LON_180_WE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "latLonFormat")
@XmlEnum
public enum LatLonFormat {

    LAT_90_LON_360,
    LAT_90_LON_180,
    LAT_90_SN_LON_180_WE;

    public String value() {
        return name();
    }

    public static LatLonFormat fromValue(String v) {
        return valueOf(v);
    }

}
