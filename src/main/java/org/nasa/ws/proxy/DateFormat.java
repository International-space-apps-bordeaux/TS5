
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dateFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dateFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="YYYY_DDD"/>
 *     &lt;enumeration value="YY_MM_DD"/>
 *     &lt;enumeration value="YY_MMM_DD"/>
 *     &lt;enumeration value="YY_MMM_DD_2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dateFormat")
@XmlEnum
public enum DateFormat {

    YYYY_DDD,
    YY_MM_DD,
    YY_MMM_DD,
    YY_MMM_DD_2;

    public String value() {
        return name();
    }

    public static DateFormat fromValue(String v) {
        return valueOf(v);
    }

}
