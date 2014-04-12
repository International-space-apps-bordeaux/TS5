
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coordinateOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coordinateOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="component" type="{http://ssc.spdf.gsfc.nasa.gov/}coordinateComponent" minOccurs="0"/>
 *         &lt;element name="coordinateSystem" type="{http://ssc.spdf.gsfc.nasa.gov/}coordinateSystem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coordinateOptions", propOrder = {
    "component",
    "coordinateSystem"
})
public class CoordinateOptions {

    protected CoordinateComponent component;
    protected CoordinateSystem coordinateSystem;

    /**
     * Gets the value of the component property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateComponent }
     *     
     */
    public CoordinateComponent getComponent() {
        return component;
    }

    /**
     * Sets the value of the component property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateComponent }
     *     
     */
    public void setComponent(CoordinateComponent value) {
        this.component = value;
    }

    /**
     * Gets the value of the coordinateSystem property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateSystem }
     *     
     */
    public CoordinateSystem getCoordinateSystem() {
        return coordinateSystem;
    }

    /**
     * Sets the value of the coordinateSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateSystem }
     *     
     */
    public void setCoordinateSystem(CoordinateSystem value) {
        this.coordinateSystem = value;
    }

}
