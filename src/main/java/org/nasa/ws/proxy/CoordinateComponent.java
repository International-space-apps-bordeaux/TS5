
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coordinateComponent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="coordinateComponent">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="X"/>
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="Z"/>
 *     &lt;enumeration value="LAT"/>
 *     &lt;enumeration value="LON"/>
 *     &lt;enumeration value="LOCAL_TIME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "coordinateComponent")
@XmlEnum
public enum CoordinateComponent {

    X,
    Y,
    Z,
    LAT,
    LON,
    LOCAL_TIME;

    public String value() {
        return name();
    }

    public static CoordinateComponent fromValue(String v) {
        return valueOf(v);
    }

}
