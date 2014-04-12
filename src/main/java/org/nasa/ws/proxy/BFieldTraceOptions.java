
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bFieldTraceOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bFieldTraceOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coordinateSystem" type="{http://ssc.spdf.gsfc.nasa.gov/}coordinateSystem" minOccurs="0"/>
 *         &lt;element name="fieldLineLength" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="footpointLatitude" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="footpointLongitude" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hemisphere" type="{http://ssc.spdf.gsfc.nasa.gov/}hemisphere" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bFieldTraceOptions", propOrder = {
    "coordinateSystem",
    "fieldLineLength",
    "footpointLatitude",
    "footpointLongitude",
    "hemisphere"
})
public class BFieldTraceOptions {

    protected CoordinateSystem coordinateSystem;
    protected boolean fieldLineLength;
    protected boolean footpointLatitude;
    protected boolean footpointLongitude;
    protected Hemisphere hemisphere;

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

    /**
     * Gets the value of the fieldLineLength property.
     * 
     */
    public boolean isFieldLineLength() {
        return fieldLineLength;
    }

    /**
     * Sets the value of the fieldLineLength property.
     * 
     */
    public void setFieldLineLength(boolean value) {
        this.fieldLineLength = value;
    }

    /**
     * Gets the value of the footpointLatitude property.
     * 
     */
    public boolean isFootpointLatitude() {
        return footpointLatitude;
    }

    /**
     * Sets the value of the footpointLatitude property.
     * 
     */
    public void setFootpointLatitude(boolean value) {
        this.footpointLatitude = value;
    }

    /**
     * Gets the value of the footpointLongitude property.
     * 
     */
    public boolean isFootpointLongitude() {
        return footpointLongitude;
    }

    /**
     * Sets the value of the footpointLongitude property.
     * 
     */
    public void setFootpointLongitude(boolean value) {
        this.footpointLongitude = value;
    }

    /**
     * Gets the value of the hemisphere property.
     * 
     * @return
     *     possible object is
     *     {@link Hemisphere }
     *     
     */
    public Hemisphere getHemisphere() {
        return hemisphere;
    }

    /**
     * Sets the value of the hemisphere property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hemisphere }
     *     
     */
    public void setHemisphere(Hemisphere value) {
        this.hemisphere = value;
    }

}
