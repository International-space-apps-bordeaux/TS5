
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mappedRegionFilterOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mappedRegionFilterOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auroralOval" type="{http://ssc.spdf.gsfc.nasa.gov/}hemisphereOptions" minOccurs="0"/>
 *         &lt;element name="cleft" type="{http://ssc.spdf.gsfc.nasa.gov/}hemisphereOptions" minOccurs="0"/>
 *         &lt;element name="cusp" type="{http://ssc.spdf.gsfc.nasa.gov/}hemisphereOptions" minOccurs="0"/>
 *         &lt;element name="lowLatitude" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="midLatitude" type="{http://ssc.spdf.gsfc.nasa.gov/}hemisphereOptions" minOccurs="0"/>
 *         &lt;element name="polarCap" type="{http://ssc.spdf.gsfc.nasa.gov/}hemisphereOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mappedRegionFilterOptions", propOrder = {
    "auroralOval",
    "cleft",
    "cusp",
    "lowLatitude",
    "midLatitude",
    "polarCap"
})
public class MappedRegionFilterOptions {

    protected HemisphereOptions auroralOval;
    protected HemisphereOptions cleft;
    protected HemisphereOptions cusp;
    protected boolean lowLatitude;
    protected HemisphereOptions midLatitude;
    protected HemisphereOptions polarCap;

    /**
     * Gets the value of the auroralOval property.
     * 
     * @return
     *     possible object is
     *     {@link HemisphereOptions }
     *     
     */
    public HemisphereOptions getAuroralOval() {
        return auroralOval;
    }

    /**
     * Sets the value of the auroralOval property.
     * 
     * @param value
     *     allowed object is
     *     {@link HemisphereOptions }
     *     
     */
    public void setAuroralOval(HemisphereOptions value) {
        this.auroralOval = value;
    }

    /**
     * Gets the value of the cleft property.
     * 
     * @return
     *     possible object is
     *     {@link HemisphereOptions }
     *     
     */
    public HemisphereOptions getCleft() {
        return cleft;
    }

    /**
     * Sets the value of the cleft property.
     * 
     * @param value
     *     allowed object is
     *     {@link HemisphereOptions }
     *     
     */
    public void setCleft(HemisphereOptions value) {
        this.cleft = value;
    }

    /**
     * Gets the value of the cusp property.
     * 
     * @return
     *     possible object is
     *     {@link HemisphereOptions }
     *     
     */
    public HemisphereOptions getCusp() {
        return cusp;
    }

    /**
     * Sets the value of the cusp property.
     * 
     * @param value
     *     allowed object is
     *     {@link HemisphereOptions }
     *     
     */
    public void setCusp(HemisphereOptions value) {
        this.cusp = value;
    }

    /**
     * Gets the value of the lowLatitude property.
     * 
     */
    public boolean isLowLatitude() {
        return lowLatitude;
    }

    /**
     * Sets the value of the lowLatitude property.
     * 
     */
    public void setLowLatitude(boolean value) {
        this.lowLatitude = value;
    }

    /**
     * Gets the value of the midLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link HemisphereOptions }
     *     
     */
    public HemisphereOptions getMidLatitude() {
        return midLatitude;
    }

    /**
     * Sets the value of the midLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link HemisphereOptions }
     *     
     */
    public void setMidLatitude(HemisphereOptions value) {
        this.midLatitude = value;
    }

    /**
     * Gets the value of the polarCap property.
     * 
     * @return
     *     possible object is
     *     {@link HemisphereOptions }
     *     
     */
    public HemisphereOptions getPolarCap() {
        return polarCap;
    }

    /**
     * Sets the value of the polarCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link HemisphereOptions }
     *     
     */
    public void setPolarCap(HemisphereOptions value) {
        this.polarCap = value;
    }

}
