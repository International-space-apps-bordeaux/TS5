
package org.nasa.ws.proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timeSeriesGraphOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="timeSeriesGraphOptions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ssc.spdf.gsfc.nasa.gov/}graphOptions">
 *       &lt;sequence>
 *         &lt;element name="BFieldTraceOptions" type="{http://ssc.spdf.gsfc.nasa.gov/}bFieldTraceOptions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coordinateOptions" type="{http://ssc.spdf.gsfc.nasa.gov/}coordinateOptions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distanceFromOptions" type="{http://ssc.spdf.gsfc.nasa.gov/}distanceFromOptions" minOccurs="0"/>
 *         &lt;element name="valueOptions" type="{http://ssc.spdf.gsfc.nasa.gov/}valueOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timeSeriesGraphOptions", propOrder = {
    "bFieldTraceOptions",
    "coordinateOptions",
    "distanceFromOptions",
    "valueOptions"
})
public class TimeSeriesGraphOptions
    extends GraphOptions
{

    @XmlElement(name = "BFieldTraceOptions", nillable = true)
    protected List<BFieldTraceOptions> bFieldTraceOptions;
    @XmlElement(nillable = true)
    protected List<CoordinateOptions> coordinateOptions;
    protected DistanceFromOptions distanceFromOptions;
    protected ValueOptions valueOptions;

    /**
     * Gets the value of the bFieldTraceOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bFieldTraceOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBFieldTraceOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BFieldTraceOptions }
     * 
     * 
     */
    public List<BFieldTraceOptions> getBFieldTraceOptions() {
        if (bFieldTraceOptions == null) {
            bFieldTraceOptions = new ArrayList<BFieldTraceOptions>();
        }
        return this.bFieldTraceOptions;
    }

    /**
     * Gets the value of the coordinateOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinateOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinateOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoordinateOptions }
     * 
     * 
     */
    public List<CoordinateOptions> getCoordinateOptions() {
        if (coordinateOptions == null) {
            coordinateOptions = new ArrayList<CoordinateOptions>();
        }
        return this.coordinateOptions;
    }

    /**
     * Gets the value of the distanceFromOptions property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceFromOptions }
     *     
     */
    public DistanceFromOptions getDistanceFromOptions() {
        return distanceFromOptions;
    }

    /**
     * Sets the value of the distanceFromOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceFromOptions }
     *     
     */
    public void setDistanceFromOptions(DistanceFromOptions value) {
        this.distanceFromOptions = value;
    }

    /**
     * Gets the value of the valueOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ValueOptions }
     *     
     */
    public ValueOptions getValueOptions() {
        return valueOptions;
    }

    /**
     * Sets the value of the valueOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueOptions }
     *     
     */
    public void setValueOptions(ValueOptions value) {
        this.valueOptions = value;
    }

}
