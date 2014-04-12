
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for internalBFieldModel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="internalBFieldModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IGRF"/>
 *     &lt;enumeration value="SIMPLE_DIPOLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "internalBFieldModel")
@XmlEnum
public enum InternalBFieldModel {

    IGRF,
    SIMPLE_DIPOLE;

    public String value() {
        return name();
    }

    public static InternalBFieldModel fromValue(String v) {
        return valueOf(v);
    }

}
