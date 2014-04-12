
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for projectionCoordinateSystem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="projectionCoordinateSystem">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GEO"/>
 *     &lt;enumeration value="GM"/>
 *     &lt;enumeration value="SM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "projectionCoordinateSystem")
@XmlEnum
public enum ProjectionCoordinateSystem {

    GEO,
    GM,
    SM;

    public String value() {
        return name();
    }

    public static ProjectionCoordinateSystem fromValue(String v) {
        return valueOf(v);
    }

}
