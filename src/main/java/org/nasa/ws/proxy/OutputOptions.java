
package org.nasa.ws.proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outputOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outputOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allLocationFilters" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BFieldTraceOptions" type="{http://ssc.spdf.gsfc.nasa.gov/}bFieldTraceOptions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coordinateOptions" type="{http://ssc.spdf.gsfc.nasa.gov/}filteredCoordinateOptions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distanceFromOptions" type="{http://ssc.spdf.gsfc.nasa.gov/}distanceFromOptions" minOccurs="0"/>
 *         &lt;element name="minMaxPoints" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="regionOptions" type="{http://ssc.spdf.gsfc.nasa.gov/}regionOptions" minOccurs="0"/>
 *         &lt;element name="valueOptions" type="{http://ssc.spdf.gsfc.nasa.gov/}valueOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outputOptions", propOrder = {
    "allLocationFilters",
    "bFieldTraceOptions",
    "coordinateOptions",
    "distanceFromOptions",
    "minMaxPoints",
    "regionOptions",
    "valueOptions"
})
public class OutputOptions {

    protected boolean allLocationFilters;
    @XmlElement(name = "BFieldTraceOptions", nillable = true)
    protected List<BFieldTraceOptions> bFieldTraceOptions;
    @XmlElement(nillable = true)
    protected List<FilteredCoordinateOptions> coordinateOptions;
    protected DistanceFromOptions distanceFromOptions;
    protected int minMaxPoints;
    protected RegionOptions regionOptions;
    protected ValueOptions valueOptions;

    /**
     * Gets the value of the allLocationFilters property.
     * 
     */
    public boolean isAllLocationFilters() {
        return allLocationFilters;
    }

    /**
     * Sets the value of the allLocationFilters property.
     * 
     */
    public void setAllLocationFilters(boolean value) {
        this.allLocationFilters = value;
    }

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
     * {@link FilteredCoordinateOptions }
     * 
     * 
     */
    public List<FilteredCoordinateOptions> getCoordinateOptions() {
        if (coordinateOptions == null) {
            coordinateOptions = new ArrayList<FilteredCoordinateOptions>();
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
     * Gets the value of the minMaxPoints property.
     * 
     */
    public int getMinMaxPoints() {
        return minMaxPoints;
    }

    /**
     * Sets the value of the minMaxPoints property.
     * 
     */
    public void setMinMaxPoints(int value) {
        this.minMaxPoints = value;
    }

    /**
     * Gets the value of the regionOptions property.
     * 
     * @return
     *     possible object is
     *     {@link RegionOptions }
     *     
     */
    public RegionOptions getRegionOptions() {
        return regionOptions;
    }

    /**
     * Sets the value of the regionOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionOptions }
     *     
     */
    public void setRegionOptions(RegionOptions value) {
        this.regionOptions = value;
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
