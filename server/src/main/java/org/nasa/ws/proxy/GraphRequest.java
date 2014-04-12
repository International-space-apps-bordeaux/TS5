
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for graphRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="graphRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ssc.spdf.gsfc.nasa.gov/}request">
 *       &lt;sequence>
 *         &lt;element name="mapProjectionOptions" type="{http://ssc.spdf.gsfc.nasa.gov/}mapProjectionGraphOptions" minOccurs="0"/>
 *         &lt;element name="orbitOptions" type="{http://ssc.spdf.gsfc.nasa.gov/}orbitGraphOptions" minOccurs="0"/>
 *         &lt;element name="timeSeriesOptions" type="{http://ssc.spdf.gsfc.nasa.gov/}timeSeriesGraphOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "graphRequest", propOrder = {
    "mapProjectionOptions",
    "orbitOptions",
    "timeSeriesOptions"
})
public class GraphRequest
    extends Request
{

    protected MapProjectionGraphOptions mapProjectionOptions;
    protected OrbitGraphOptions orbitOptions;
    protected TimeSeriesGraphOptions timeSeriesOptions;

    /**
     * Gets the value of the mapProjectionOptions property.
     * 
     * @return
     *     possible object is
     *     {@link MapProjectionGraphOptions }
     *     
     */
    public MapProjectionGraphOptions getMapProjectionOptions() {
        return mapProjectionOptions;
    }

    /**
     * Sets the value of the mapProjectionOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapProjectionGraphOptions }
     *     
     */
    public void setMapProjectionOptions(MapProjectionGraphOptions value) {
        this.mapProjectionOptions = value;
    }

    /**
     * Gets the value of the orbitOptions property.
     * 
     * @return
     *     possible object is
     *     {@link OrbitGraphOptions }
     *     
     */
    public OrbitGraphOptions getOrbitOptions() {
        return orbitOptions;
    }

    /**
     * Sets the value of the orbitOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrbitGraphOptions }
     *     
     */
    public void setOrbitOptions(OrbitGraphOptions value) {
        this.orbitOptions = value;
    }

    /**
     * Gets the value of the timeSeriesOptions property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSeriesGraphOptions }
     *     
     */
    public TimeSeriesGraphOptions getTimeSeriesOptions() {
        return timeSeriesOptions;
    }

    /**
     * Sets the value of the timeSeriesOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSeriesGraphOptions }
     *     
     */
    public void setTimeSeriesOptions(TimeSeriesGraphOptions value) {
        this.timeSeriesOptions = value;
    }

}
