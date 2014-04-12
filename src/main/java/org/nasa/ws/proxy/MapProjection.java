
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mapProjection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mapProjection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CYLINDRICAL"/>
 *     &lt;enumeration value="MERCATOR"/>
 *     &lt;enumeration value="MOLLEWEIDE"/>
 *     &lt;enumeration value="STEREOGRAPHIC"/>
 *     &lt;enumeration value="ORTHOGRAPHIC"/>
 *     &lt;enumeration value="AZIMUTHAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mapProjection")
@XmlEnum
public enum MapProjection {

    CYLINDRICAL,
    MERCATOR,
    MOLLEWEIDE,
    STEREOGRAPHIC,
    ORTHOGRAPHIC,
    AZIMUTHAL;

    public String value() {
        return name();
    }

    public static MapProjection fromValue(String v) {
        return valueOf(v);
    }

}
