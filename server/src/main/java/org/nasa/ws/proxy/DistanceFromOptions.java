
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for distanceFromOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="distanceFromOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BGseXYZ" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bowShock" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MPause" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="neutralSheet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "distanceFromOptions", propOrder = {
    "bGseXYZ",
    "bowShock",
    "mPause",
    "neutralSheet"
})
public class DistanceFromOptions {

    @XmlElement(name = "BGseXYZ")
    protected boolean bGseXYZ;
    protected boolean bowShock;
    @XmlElement(name = "MPause")
    protected boolean mPause;
    protected boolean neutralSheet;

    /**
     * Gets the value of the bGseXYZ property.
     * 
     */
    public boolean isBGseXYZ() {
        return bGseXYZ;
    }

    /**
     * Sets the value of the bGseXYZ property.
     * 
     */
    public void setBGseXYZ(boolean value) {
        this.bGseXYZ = value;
    }

    /**
     * Gets the value of the bowShock property.
     * 
     */
    public boolean isBowShock() {
        return bowShock;
    }

    /**
     * Sets the value of the bowShock property.
     * 
     */
    public void setBowShock(boolean value) {
        this.bowShock = value;
    }

    /**
     * Gets the value of the mPause property.
     * 
     */
    public boolean isMPause() {
        return mPause;
    }

    /**
     * Sets the value of the mPause property.
     * 
     */
    public void setMPause(boolean value) {
        this.mPause = value;
    }

    /**
     * Gets the value of the neutralSheet property.
     * 
     */
    public boolean isNeutralSheet() {
        return neutralSheet;
    }

    /**
     * Sets the value of the neutralSheet property.
     * 
     */
    public void setNeutralSheet(boolean value) {
        this.neutralSheet = value;
    }

}
