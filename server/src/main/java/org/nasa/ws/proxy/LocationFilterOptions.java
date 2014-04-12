
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for locationFilterOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationFilterOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allFilters" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dipoleInvariantLatitude" type="{http://ssc.spdf.gsfc.nasa.gov/}locationFilter" minOccurs="0"/>
 *         &lt;element name="dipoleLValue" type="{http://ssc.spdf.gsfc.nasa.gov/}locationFilter" minOccurs="0"/>
 *         &lt;element name="distanceFromBowShock" type="{http://ssc.spdf.gsfc.nasa.gov/}locationFilter" minOccurs="0"/>
 *         &lt;element name="distanceFromCenterOfEarth" type="{http://ssc.spdf.gsfc.nasa.gov/}locationFilter" minOccurs="0"/>
 *         &lt;element name="distanceFromMagnetopause" type="{http://ssc.spdf.gsfc.nasa.gov/}locationFilter" minOccurs="0"/>
 *         &lt;element name="distanceFromNeutralSheet" type="{http://ssc.spdf.gsfc.nasa.gov/}locationFilter" minOccurs="0"/>
 *         &lt;element name="magneticFieldStrength" type="{http://ssc.spdf.gsfc.nasa.gov/}locationFilter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationFilterOptions", propOrder = {
    "allFilters",
    "dipoleInvariantLatitude",
    "dipoleLValue",
    "distanceFromBowShock",
    "distanceFromCenterOfEarth",
    "distanceFromMagnetopause",
    "distanceFromNeutralSheet",
    "magneticFieldStrength"
})
public class LocationFilterOptions {

    protected boolean allFilters;
    protected LocationFilter dipoleInvariantLatitude;
    protected LocationFilter dipoleLValue;
    protected LocationFilter distanceFromBowShock;
    protected LocationFilter distanceFromCenterOfEarth;
    protected LocationFilter distanceFromMagnetopause;
    protected LocationFilter distanceFromNeutralSheet;
    protected LocationFilter magneticFieldStrength;

    /**
     * Gets the value of the allFilters property.
     * 
     */
    public boolean isAllFilters() {
        return allFilters;
    }

    /**
     * Sets the value of the allFilters property.
     * 
     */
    public void setAllFilters(boolean value) {
        this.allFilters = value;
    }

    /**
     * Gets the value of the dipoleInvariantLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link LocationFilter }
     *     
     */
    public LocationFilter getDipoleInvariantLatitude() {
        return dipoleInvariantLatitude;
    }

    /**
     * Sets the value of the dipoleInvariantLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationFilter }
     *     
     */
    public void setDipoleInvariantLatitude(LocationFilter value) {
        this.dipoleInvariantLatitude = value;
    }

    /**
     * Gets the value of the dipoleLValue property.
     * 
     * @return
     *     possible object is
     *     {@link LocationFilter }
     *     
     */
    public LocationFilter getDipoleLValue() {
        return dipoleLValue;
    }

    /**
     * Sets the value of the dipoleLValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationFilter }
     *     
     */
    public void setDipoleLValue(LocationFilter value) {
        this.dipoleLValue = value;
    }

    /**
     * Gets the value of the distanceFromBowShock property.
     * 
     * @return
     *     possible object is
     *     {@link LocationFilter }
     *     
     */
    public LocationFilter getDistanceFromBowShock() {
        return distanceFromBowShock;
    }

    /**
     * Sets the value of the distanceFromBowShock property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationFilter }
     *     
     */
    public void setDistanceFromBowShock(LocationFilter value) {
        this.distanceFromBowShock = value;
    }

    /**
     * Gets the value of the distanceFromCenterOfEarth property.
     * 
     * @return
     *     possible object is
     *     {@link LocationFilter }
     *     
     */
    public LocationFilter getDistanceFromCenterOfEarth() {
        return distanceFromCenterOfEarth;
    }

    /**
     * Sets the value of the distanceFromCenterOfEarth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationFilter }
     *     
     */
    public void setDistanceFromCenterOfEarth(LocationFilter value) {
        this.distanceFromCenterOfEarth = value;
    }

    /**
     * Gets the value of the distanceFromMagnetopause property.
     * 
     * @return
     *     possible object is
     *     {@link LocationFilter }
     *     
     */
    public LocationFilter getDistanceFromMagnetopause() {
        return distanceFromMagnetopause;
    }

    /**
     * Sets the value of the distanceFromMagnetopause property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationFilter }
     *     
     */
    public void setDistanceFromMagnetopause(LocationFilter value) {
        this.distanceFromMagnetopause = value;
    }

    /**
     * Gets the value of the distanceFromNeutralSheet property.
     * 
     * @return
     *     possible object is
     *     {@link LocationFilter }
     *     
     */
    public LocationFilter getDistanceFromNeutralSheet() {
        return distanceFromNeutralSheet;
    }

    /**
     * Sets the value of the distanceFromNeutralSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationFilter }
     *     
     */
    public void setDistanceFromNeutralSheet(LocationFilter value) {
        this.distanceFromNeutralSheet = value;
    }

    /**
     * Gets the value of the magneticFieldStrength property.
     * 
     * @return
     *     possible object is
     *     {@link LocationFilter }
     *     
     */
    public LocationFilter getMagneticFieldStrength() {
        return magneticFieldStrength;
    }

    /**
     * Sets the value of the magneticFieldStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationFilter }
     *     
     */
    public void setMagneticFieldStrength(LocationFilter value) {
        this.magneticFieldStrength = value;
    }

}
