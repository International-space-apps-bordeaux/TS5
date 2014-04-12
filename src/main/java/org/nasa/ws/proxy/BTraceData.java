
package org.nasa.ws.proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bTraceData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bTraceData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arcLength" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coordinateSystem" type="{http://ssc.spdf.gsfc.nasa.gov/}coordinateSystem" minOccurs="0"/>
 *         &lt;element name="hemisphere" type="{http://ssc.spdf.gsfc.nasa.gov/}hemisphere" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bTraceData", propOrder = {
    "arcLength",
    "coordinateSystem",
    "hemisphere",
    "latitude",
    "longitude"
})
public class BTraceData {

    @XmlElement(nillable = true)
    protected List<Double> arcLength;
    protected CoordinateSystem coordinateSystem;
    protected Hemisphere hemisphere;
    @XmlElement(nillable = true)
    protected List<Float> latitude;
    @XmlElement(nillable = true)
    protected List<Float> longitude;

    /**
     * Gets the value of the arcLength property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arcLength property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArcLength().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getArcLength() {
        if (arcLength == null) {
            arcLength = new ArrayList<Double>();
        }
        return this.arcLength;
    }

    /**
     * Gets the value of the coordinateSystem property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateSystem }
     *     
     */
    public CoordinateSystem getCoordinateSystem() {
        return coordinateSystem;
    }

    /**
     * Sets the value of the coordinateSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateSystem }
     *     
     */
    public void setCoordinateSystem(CoordinateSystem value) {
        this.coordinateSystem = value;
    }

    /**
     * Gets the value of the hemisphere property.
     * 
     * @return
     *     possible object is
     *     {@link Hemisphere }
     *     
     */
    public Hemisphere getHemisphere() {
        return hemisphere;
    }

    /**
     * Sets the value of the hemisphere property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hemisphere }
     *     
     */
    public void setHemisphere(Hemisphere value) {
        this.hemisphere = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the latitude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLatitude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getLatitude() {
        if (latitude == null) {
            latitude = new ArrayList<Float>();
        }
        return this.latitude;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the longitude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLongitude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getLongitude() {
        if (longitude == null) {
            longitude = new ArrayList<Float>();
        }
        return this.longitude;
    }

}
