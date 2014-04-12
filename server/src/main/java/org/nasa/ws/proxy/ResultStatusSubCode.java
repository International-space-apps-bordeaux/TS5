
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultStatusSubCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="resultStatusSubCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="MISSING_REQUEST"/>
 *     &lt;enumeration value="MISSING_SATELLITES"/>
 *     &lt;enumeration value="INVALID_BEGIN_TIME"/>
 *     &lt;enumeration value="INVALID_END_TIME"/>
 *     &lt;enumeration value="INVALID_SATELLITE"/>
 *     &lt;enumeration value="INVALID_TIME_RANGE"/>
 *     &lt;enumeration value="INVALID_RESOLUTION_FACTOR"/>
 *     &lt;enumeration value="MISSING_OUTPUT_OPTIONS"/>
 *     &lt;enumeration value="MISSING_COORD_OPTIONS"/>
 *     &lt;enumeration value="MISSING_COORD_SYSTEM"/>
 *     &lt;enumeration value="INVALID_COORD_SYSTEM"/>
 *     &lt;enumeration value="MISSING_COORD_COMPONENT"/>
 *     &lt;enumeration value="MISSING_GRAPH_OPTIONS"/>
 *     &lt;enumeration value="MISSING_COORDINATE_SYSTEM"/>
 *     &lt;enumeration value="MISSING_COORDINATE_COMPONENT"/>
 *     &lt;enumeration value="SERVER_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "resultStatusSubCode")
@XmlEnum
public enum ResultStatusSubCode {

    SUCCESS,
    MISSING_REQUEST,
    MISSING_SATELLITES,
    INVALID_BEGIN_TIME,
    INVALID_END_TIME,
    INVALID_SATELLITE,
    INVALID_TIME_RANGE,
    INVALID_RESOLUTION_FACTOR,
    MISSING_OUTPUT_OPTIONS,
    MISSING_COORD_OPTIONS,
    MISSING_COORD_SYSTEM,
    INVALID_COORD_SYSTEM,
    MISSING_COORD_COMPONENT,
    MISSING_GRAPH_OPTIONS,
    MISSING_COORDINATE_SYSTEM,
    MISSING_COORDINATE_COMPONENT,
    SERVER_ERROR;

    public String value() {
        return name();
    }

    public static ResultStatusSubCode fromValue(String v) {
        return valueOf(v);
    }

}
