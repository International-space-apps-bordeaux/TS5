
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for formatOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="formatOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdf" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dateFormat" type="{http://ssc.spdf.gsfc.nasa.gov/}dateFormat" minOccurs="0"/>
 *         &lt;element name="degreeFormat" type="{http://ssc.spdf.gsfc.nasa.gov/}degreeFormat" minOccurs="0"/>
 *         &lt;element name="degreePrecision" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="distancePrecision" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="distanceUnits" type="{http://ssc.spdf.gsfc.nasa.gov/}distanceUnits" minOccurs="0"/>
 *         &lt;element name="latLonFormat" type="{http://ssc.spdf.gsfc.nasa.gov/}latLonFormat" minOccurs="0"/>
 *         &lt;element name="linesPerPage" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="timeFormat" type="{http://ssc.spdf.gsfc.nasa.gov/}timeFormat" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formatOptions", propOrder = {
    "cdf",
    "dateFormat",
    "degreeFormat",
    "degreePrecision",
    "distancePrecision",
    "distanceUnits",
    "latLonFormat",
    "linesPerPage",
    "timeFormat"
})
public class FormatOptions {

    protected boolean cdf;
    protected DateFormat dateFormat;
    protected DegreeFormat degreeFormat;
    protected short degreePrecision;
    protected short distancePrecision;
    protected DistanceUnits distanceUnits;
    protected LatLonFormat latLonFormat;
    protected short linesPerPage;
    protected TimeFormat timeFormat;

    /**
     * Gets the value of the cdf property.
     * 
     */
    public boolean isCdf() {
        return cdf;
    }

    /**
     * Sets the value of the cdf property.
     * 
     */
    public void setCdf(boolean value) {
        this.cdf = value;
    }

    /**
     * Gets the value of the dateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat }
     *     
     */
    public DateFormat getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat }
     *     
     */
    public void setDateFormat(DateFormat value) {
        this.dateFormat = value;
    }

    /**
     * Gets the value of the degreeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link DegreeFormat }
     *     
     */
    public DegreeFormat getDegreeFormat() {
        return degreeFormat;
    }

    /**
     * Sets the value of the degreeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link DegreeFormat }
     *     
     */
    public void setDegreeFormat(DegreeFormat value) {
        this.degreeFormat = value;
    }

    /**
     * Gets the value of the degreePrecision property.
     * 
     */
    public short getDegreePrecision() {
        return degreePrecision;
    }

    /**
     * Sets the value of the degreePrecision property.
     * 
     */
    public void setDegreePrecision(short value) {
        this.degreePrecision = value;
    }

    /**
     * Gets the value of the distancePrecision property.
     * 
     */
    public short getDistancePrecision() {
        return distancePrecision;
    }

    /**
     * Sets the value of the distancePrecision property.
     * 
     */
    public void setDistancePrecision(short value) {
        this.distancePrecision = value;
    }

    /**
     * Gets the value of the distanceUnits property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceUnits }
     *     
     */
    public DistanceUnits getDistanceUnits() {
        return distanceUnits;
    }

    /**
     * Sets the value of the distanceUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceUnits }
     *     
     */
    public void setDistanceUnits(DistanceUnits value) {
        this.distanceUnits = value;
    }

    /**
     * Gets the value of the latLonFormat property.
     * 
     * @return
     *     possible object is
     *     {@link LatLonFormat }
     *     
     */
    public LatLonFormat getLatLonFormat() {
        return latLonFormat;
    }

    /**
     * Sets the value of the latLonFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatLonFormat }
     *     
     */
    public void setLatLonFormat(LatLonFormat value) {
        this.latLonFormat = value;
    }

    /**
     * Gets the value of the linesPerPage property.
     * 
     */
    public short getLinesPerPage() {
        return linesPerPage;
    }

    /**
     * Sets the value of the linesPerPage property.
     * 
     */
    public void setLinesPerPage(short value) {
        this.linesPerPage = value;
    }

    /**
     * Gets the value of the timeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFormat }
     *     
     */
    public TimeFormat getTimeFormat() {
        return timeFormat;
    }

    /**
     * Sets the value of the timeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFormat }
     *     
     */
    public void setTimeFormat(TimeFormat value) {
        this.timeFormat = value;
    }

}
