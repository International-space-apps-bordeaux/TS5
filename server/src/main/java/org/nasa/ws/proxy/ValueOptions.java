
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for valueOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="valueOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BFieldStrength" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dipoleInvLat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dipoleLValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="radialDistance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueOptions", propOrder = {
    "bFieldStrength",
    "dipoleInvLat",
    "dipoleLValue",
    "radialDistance"
})
public class ValueOptions {

    @XmlElement(name = "BFieldStrength")
    protected boolean bFieldStrength;
    protected boolean dipoleInvLat;
    protected boolean dipoleLValue;
    protected boolean radialDistance;

    /**
     * Gets the value of the bFieldStrength property.
     * 
     */
    public boolean isBFieldStrength() {
        return bFieldStrength;
    }

    /**
     * Sets the value of the bFieldStrength property.
     * 
     */
    public void setBFieldStrength(boolean value) {
        this.bFieldStrength = value;
    }

    /**
     * Gets the value of the dipoleInvLat property.
     * 
     */
    public boolean isDipoleInvLat() {
        return dipoleInvLat;
    }

    /**
     * Sets the value of the dipoleInvLat property.
     * 
     */
    public void setDipoleInvLat(boolean value) {
        this.dipoleInvLat = value;
    }

    /**
     * Gets the value of the dipoleLValue property.
     * 
     */
    public boolean isDipoleLValue() {
        return dipoleLValue;
    }

    /**
     * Sets the value of the dipoleLValue property.
     * 
     */
    public void setDipoleLValue(boolean value) {
        this.dipoleLValue = value;
    }

    /**
     * Gets the value of the radialDistance property.
     * 
     */
    public boolean isRadialDistance() {
        return radialDistance;
    }

    /**
     * Sets the value of the radialDistance property.
     * 
     */
    public void setRadialDistance(boolean value) {
        this.radialDistance = value;
    }

}
