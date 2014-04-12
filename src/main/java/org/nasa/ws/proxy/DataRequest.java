
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ssc.spdf.gsfc.nasa.gov/}request">
 *       &lt;sequence>
 *         &lt;element name="locationFilterOptions" type="{http://ssc.spdf.gsfc.nasa.gov/}locationFilterOptions" minOccurs="0"/>
 *         &lt;element name="outputOptions" type="{http://ssc.spdf.gsfc.nasa.gov/}outputOptions" minOccurs="0"/>
 *         &lt;element name="regionFilterOptions" type="{http://ssc.spdf.gsfc.nasa.gov/}regionFilterOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataRequest", propOrder = {
    "locationFilterOptions",
    "outputOptions",
    "regionFilterOptions"
})
public class DataRequest
    extends Request
{

    protected LocationFilterOptions locationFilterOptions;
    protected OutputOptions outputOptions;
    protected RegionFilterOptions regionFilterOptions;

    /**
     * Gets the value of the locationFilterOptions property.
     * 
     * @return
     *     possible object is
     *     {@link LocationFilterOptions }
     *     
     */
    public LocationFilterOptions getLocationFilterOptions() {
        return locationFilterOptions;
    }

    /**
     * Sets the value of the locationFilterOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationFilterOptions }
     *     
     */
    public void setLocationFilterOptions(LocationFilterOptions value) {
        this.locationFilterOptions = value;
    }

    /**
     * Gets the value of the outputOptions property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptions }
     *     
     */
    public OutputOptions getOutputOptions() {
        return outputOptions;
    }

    /**
     * Sets the value of the outputOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptions }
     *     
     */
    public void setOutputOptions(OutputOptions value) {
        this.outputOptions = value;
    }

    /**
     * Gets the value of the regionFilterOptions property.
     * 
     * @return
     *     possible object is
     *     {@link RegionFilterOptions }
     *     
     */
    public RegionFilterOptions getRegionFilterOptions() {
        return regionFilterOptions;
    }

    /**
     * Sets the value of the regionFilterOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionFilterOptions }
     *     
     */
    public void setRegionFilterOptions(RegionFilterOptions value) {
        this.regionFilterOptions = value;
    }

}
