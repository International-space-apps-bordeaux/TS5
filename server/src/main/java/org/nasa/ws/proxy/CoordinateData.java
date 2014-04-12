
package org.nasa.ws.proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coordinateData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coordinateData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coordinateSystem" type="{http://ssc.spdf.gsfc.nasa.gov/}coordinateSystem" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="localTime" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="z" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coordinateData", propOrder = {
    "coordinateSystem",
    "latitude",
    "localTime",
    "longitude",
    "x",
    "y",
    "z"
})
public class CoordinateData {

    protected CoordinateSystem coordinateSystem;
    @XmlElement(nillable = true)
    protected List<Float> latitude;
    @XmlElement(nillable = true)
    protected List<Double> localTime;
    @XmlElement(nillable = true)
    protected List<Float> longitude;
    @XmlElement(nillable = true)
    protected List<Double> x;
    @XmlElement(nillable = true)
    protected List<Double> y;
    @XmlElement(nillable = true)
    protected List<Double> z;

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
     * Gets the value of the localTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getLocalTime() {
        if (localTime == null) {
            localTime = new ArrayList<Double>();
        }
        return this.localTime;
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

    /**
     * Gets the value of the x property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the x property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getX() {
        if (x == null) {
            x = new ArrayList<Double>();
        }
        return this.x;
    }

    /**
     * Gets the value of the y property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the y property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getY() {
        if (y == null) {
            y = new ArrayList<Double>();
        }
        return this.y;
    }

    /**
     * Gets the value of the z property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the z property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getZ() {
        if (z == null) {
            z = new ArrayList<Double>();
        }
        return this.z;
    }

}
