
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coordinateSystem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="coordinateSystem">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GEI_TOD"/>
 *     &lt;enumeration value="GEI_J2000"/>
 *     &lt;enumeration value="GEO"/>
 *     &lt;enumeration value="GM"/>
 *     &lt;enumeration value="GSE"/>
 *     &lt;enumeration value="GSM"/>
 *     &lt;enumeration value="SM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "coordinateSystem")
@XmlEnum
public enum CoordinateSystem {

    GEI_TOD("GEI_TOD"),
    @XmlEnumValue("GEI_J2000")
    GEI_J_2000("GEI_J2000"),
    GEO("GEO"),
    GM("GM"),
    GSE("GSE"),
    GSM("GSM"),
    SM("SM");
    private final String value;

    CoordinateSystem(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CoordinateSystem fromValue(String v) {
        for (CoordinateSystem c: CoordinateSystem.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
