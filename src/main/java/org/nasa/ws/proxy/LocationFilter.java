
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for locationFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lowerDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lowerLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="upperDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="upperLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationFilter", propOrder = {
    "lowerDate",
    "lowerLimit",
    "maximum",
    "minimum",
    "upperDate",
    "upperLimit"
})
public class LocationFilter {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lowerDate;
    protected Double lowerLimit;
    protected boolean maximum;
    protected boolean minimum;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar upperDate;
    protected Double upperLimit;

    /**
     * Gets the value of the lowerDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLowerDate() {
        return lowerDate;
    }

    /**
     * Sets the value of the lowerDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLowerDate(XMLGregorianCalendar value) {
        this.lowerDate = value;
    }

    /**
     * Gets the value of the lowerLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLowerLimit() {
        return lowerLimit;
    }

    /**
     * Sets the value of the lowerLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLowerLimit(Double value) {
        this.lowerLimit = value;
    }

    /**
     * Gets the value of the maximum property.
     * 
     */
    public boolean isMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     */
    public void setMaximum(boolean value) {
        this.maximum = value;
    }

    /**
     * Gets the value of the minimum property.
     * 
     */
    public boolean isMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     * 
     */
    public void setMinimum(boolean value) {
        this.minimum = value;
    }

    /**
     * Gets the value of the upperDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpperDate() {
        return upperDate;
    }

    /**
     * Sets the value of the upperDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpperDate(XMLGregorianCalendar value) {
        this.upperDate = value;
    }

    /**
     * Gets the value of the upperLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUpperLimit() {
        return upperLimit;
    }

    /**
     * Sets the value of the upperLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUpperLimit(Double value) {
        this.upperLimit = value;
    }

}
