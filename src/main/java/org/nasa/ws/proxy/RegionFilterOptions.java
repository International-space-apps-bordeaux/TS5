
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regionFilterOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regionFilterOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="magneticTraceRegions" type="{http://ssc.spdf.gsfc.nasa.gov/}mappedRegionFilterOptions" minOccurs="0"/>
 *         &lt;element name="radialTraceRegions" type="{http://ssc.spdf.gsfc.nasa.gov/}mappedRegionFilterOptions" minOccurs="0"/>
 *         &lt;element name="spaceRegions" type="{http://ssc.spdf.gsfc.nasa.gov/}spaceRegionsFilterOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regionFilterOptions", propOrder = {
    "magneticTraceRegions",
    "radialTraceRegions",
    "spaceRegions"
})
public class RegionFilterOptions {

    protected MappedRegionFilterOptions magneticTraceRegions;
    protected MappedRegionFilterOptions radialTraceRegions;
    protected SpaceRegionsFilterOptions spaceRegions;

    /**
     * Gets the value of the magneticTraceRegions property.
     * 
     * @return
     *     possible object is
     *     {@link MappedRegionFilterOptions }
     *     
     */
    public MappedRegionFilterOptions getMagneticTraceRegions() {
        return magneticTraceRegions;
    }

    /**
     * Sets the value of the magneticTraceRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link MappedRegionFilterOptions }
     *     
     */
    public void setMagneticTraceRegions(MappedRegionFilterOptions value) {
        this.magneticTraceRegions = value;
    }

    /**
     * Gets the value of the radialTraceRegions property.
     * 
     * @return
     *     possible object is
     *     {@link MappedRegionFilterOptions }
     *     
     */
    public MappedRegionFilterOptions getRadialTraceRegions() {
        return radialTraceRegions;
    }

    /**
     * Sets the value of the radialTraceRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link MappedRegionFilterOptions }
     *     
     */
    public void setRadialTraceRegions(MappedRegionFilterOptions value) {
        this.radialTraceRegions = value;
    }

    /**
     * Gets the value of the spaceRegions property.
     * 
     * @return
     *     possible object is
     *     {@link SpaceRegionsFilterOptions }
     *     
     */
    public SpaceRegionsFilterOptions getSpaceRegions() {
        return spaceRegions;
    }

    /**
     * Sets the value of the spaceRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpaceRegionsFilterOptions }
     *     
     */
    public void setSpaceRegions(SpaceRegionsFilterOptions value) {
        this.spaceRegions = value;
    }

}
