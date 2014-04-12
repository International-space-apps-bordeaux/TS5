
package org.nasa.ws.proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BFieldModelOptions" type="{http://ssc.spdf.gsfc.nasa.gov/}bFieldModelOptions" minOccurs="0"/>
 *         &lt;element name="beginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="satellites" type="{http://ssc.spdf.gsfc.nasa.gov/}satelliteSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "request", propOrder = {
    "bFieldModelOptions",
    "beginTime",
    "endTime",
    "satellites"
})
public class Request {

    @XmlElement(name = "BFieldModelOptions")
    protected BFieldModelOptions bFieldModelOptions;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(nillable = true)
    protected List<SatelliteSpecification> satellites;

    /**
     * Gets the value of the bFieldModelOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BFieldModelOptions }
     *     
     */
    public BFieldModelOptions getBFieldModelOptions() {
        return bFieldModelOptions;
    }

    /**
     * Sets the value of the bFieldModelOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BFieldModelOptions }
     *     
     */
    public void setBFieldModelOptions(BFieldModelOptions value) {
        this.bFieldModelOptions = value;
    }

    /**
     * Gets the value of the beginTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginTime() {
        return beginTime;
    }

    /**
     * Sets the value of the beginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginTime(XMLGregorianCalendar value) {
        this.beginTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the satellites property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the satellites property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSatellites().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SatelliteSpecification }
     * 
     * 
     */
    public List<SatelliteSpecification> getSatellites() {
        if (satellites == null) {
            satellites = new ArrayList<SatelliteSpecification>();
        }
        return this.satellites;
    }

}
