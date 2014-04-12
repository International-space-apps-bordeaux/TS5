
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spaceRegionsFilterOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spaceRegionsFilterOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="daysideMagnetosheath" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="daysideMagnetosphere" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="daysidePlasmasphere" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="highLatitudeBoundaryLayer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="interplanetaryMedium" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lowLatitudeBoundaryLayer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nightsideMagnetosheath" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nightsideMagnetosphere" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nightsidePlasmasphere" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="plasmaSheet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tailLobe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spaceRegionsFilterOptions", propOrder = {
    "daysideMagnetosheath",
    "daysideMagnetosphere",
    "daysidePlasmasphere",
    "highLatitudeBoundaryLayer",
    "interplanetaryMedium",
    "lowLatitudeBoundaryLayer",
    "nightsideMagnetosheath",
    "nightsideMagnetosphere",
    "nightsidePlasmasphere",
    "plasmaSheet",
    "tailLobe"
})
public class SpaceRegionsFilterOptions {

    protected boolean daysideMagnetosheath;
    protected boolean daysideMagnetosphere;
    protected boolean daysidePlasmasphere;
    protected boolean highLatitudeBoundaryLayer;
    protected boolean interplanetaryMedium;
    protected boolean lowLatitudeBoundaryLayer;
    protected boolean nightsideMagnetosheath;
    protected boolean nightsideMagnetosphere;
    protected boolean nightsidePlasmasphere;
    protected boolean plasmaSheet;
    protected boolean tailLobe;

    /**
     * Gets the value of the daysideMagnetosheath property.
     * 
     */
    public boolean isDaysideMagnetosheath() {
        return daysideMagnetosheath;
    }

    /**
     * Sets the value of the daysideMagnetosheath property.
     * 
     */
    public void setDaysideMagnetosheath(boolean value) {
        this.daysideMagnetosheath = value;
    }

    /**
     * Gets the value of the daysideMagnetosphere property.
     * 
     */
    public boolean isDaysideMagnetosphere() {
        return daysideMagnetosphere;
    }

    /**
     * Sets the value of the daysideMagnetosphere property.
     * 
     */
    public void setDaysideMagnetosphere(boolean value) {
        this.daysideMagnetosphere = value;
    }

    /**
     * Gets the value of the daysidePlasmasphere property.
     * 
     */
    public boolean isDaysidePlasmasphere() {
        return daysidePlasmasphere;
    }

    /**
     * Sets the value of the daysidePlasmasphere property.
     * 
     */
    public void setDaysidePlasmasphere(boolean value) {
        this.daysidePlasmasphere = value;
    }

    /**
     * Gets the value of the highLatitudeBoundaryLayer property.
     * 
     */
    public boolean isHighLatitudeBoundaryLayer() {
        return highLatitudeBoundaryLayer;
    }

    /**
     * Sets the value of the highLatitudeBoundaryLayer property.
     * 
     */
    public void setHighLatitudeBoundaryLayer(boolean value) {
        this.highLatitudeBoundaryLayer = value;
    }

    /**
     * Gets the value of the interplanetaryMedium property.
     * 
     */
    public boolean isInterplanetaryMedium() {
        return interplanetaryMedium;
    }

    /**
     * Sets the value of the interplanetaryMedium property.
     * 
     */
    public void setInterplanetaryMedium(boolean value) {
        this.interplanetaryMedium = value;
    }

    /**
     * Gets the value of the lowLatitudeBoundaryLayer property.
     * 
     */
    public boolean isLowLatitudeBoundaryLayer() {
        return lowLatitudeBoundaryLayer;
    }

    /**
     * Sets the value of the lowLatitudeBoundaryLayer property.
     * 
     */
    public void setLowLatitudeBoundaryLayer(boolean value) {
        this.lowLatitudeBoundaryLayer = value;
    }

    /**
     * Gets the value of the nightsideMagnetosheath property.
     * 
     */
    public boolean isNightsideMagnetosheath() {
        return nightsideMagnetosheath;
    }

    /**
     * Sets the value of the nightsideMagnetosheath property.
     * 
     */
    public void setNightsideMagnetosheath(boolean value) {
        this.nightsideMagnetosheath = value;
    }

    /**
     * Gets the value of the nightsideMagnetosphere property.
     * 
     */
    public boolean isNightsideMagnetosphere() {
        return nightsideMagnetosphere;
    }

    /**
     * Sets the value of the nightsideMagnetosphere property.
     * 
     */
    public void setNightsideMagnetosphere(boolean value) {
        this.nightsideMagnetosphere = value;
    }

    /**
     * Gets the value of the nightsidePlasmasphere property.
     * 
     */
    public boolean isNightsidePlasmasphere() {
        return nightsidePlasmasphere;
    }

    /**
     * Sets the value of the nightsidePlasmasphere property.
     * 
     */
    public void setNightsidePlasmasphere(boolean value) {
        this.nightsidePlasmasphere = value;
    }

    /**
     * Gets the value of the plasmaSheet property.
     * 
     */
    public boolean isPlasmaSheet() {
        return plasmaSheet;
    }

    /**
     * Sets the value of the plasmaSheet property.
     * 
     */
    public void setPlasmaSheet(boolean value) {
        this.plasmaSheet = value;
    }

    /**
     * Gets the value of the tailLobe property.
     * 
     */
    public boolean isTailLobe() {
        return tailLobe;
    }

    /**
     * Sets the value of the tailLobe property.
     * 
     */
    public void setTailLobe(boolean value) {
        this.tailLobe = value;
    }

}
