
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regionOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regionOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="northBTracedFootpoint" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="radialTracedFootpoint" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="southBTracedFootpoint" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="spacecraft" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regionOptions", propOrder = {
    "northBTracedFootpoint",
    "radialTracedFootpoint",
    "southBTracedFootpoint",
    "spacecraft"
})
public class RegionOptions {

    protected boolean northBTracedFootpoint;
    protected boolean radialTracedFootpoint;
    protected boolean southBTracedFootpoint;
    protected boolean spacecraft;

    /**
     * Gets the value of the northBTracedFootpoint property.
     * 
     */
    public boolean isNorthBTracedFootpoint() {
        return northBTracedFootpoint;
    }

    /**
     * Sets the value of the northBTracedFootpoint property.
     * 
     */
    public void setNorthBTracedFootpoint(boolean value) {
        this.northBTracedFootpoint = value;
    }

    /**
     * Gets the value of the radialTracedFootpoint property.
     * 
     */
    public boolean isRadialTracedFootpoint() {
        return radialTracedFootpoint;
    }

    /**
     * Sets the value of the radialTracedFootpoint property.
     * 
     */
    public void setRadialTracedFootpoint(boolean value) {
        this.radialTracedFootpoint = value;
    }

    /**
     * Gets the value of the southBTracedFootpoint property.
     * 
     */
    public boolean isSouthBTracedFootpoint() {
        return southBTracedFootpoint;
    }

    /**
     * Sets the value of the southBTracedFootpoint property.
     * 
     */
    public void setSouthBTracedFootpoint(boolean value) {
        this.southBTracedFootpoint = value;
    }

    /**
     * Gets the value of the spacecraft property.
     * 
     */
    public boolean isSpacecraft() {
        return spacecraft;
    }

    /**
     * Sets the value of the spacecraft property.
     * 
     */
    public void setSpacecraft(boolean value) {
        this.spacecraft = value;
    }

}
