
package org.nasa.ws.proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusCode" type="{http://ssc.spdf.gsfc.nasa.gov/}resultStatusCode" minOccurs="0"/>
 *         &lt;element name="statusSubCode" type="{http://ssc.spdf.gsfc.nasa.gov/}resultStatusSubCode" minOccurs="0"/>
 *         &lt;element name="statusText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "result", propOrder = {
    "statusCode",
    "statusSubCode",
    "statusText"
})
public class Result {

    protected ResultStatusCode statusCode;
    protected ResultStatusSubCode statusSubCode;
    @XmlElement(nillable = true)
    protected List<String> statusText;

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResultStatusCode }
     *     
     */
    public ResultStatusCode getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultStatusCode }
     *     
     */
    public void setStatusCode(ResultStatusCode value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusSubCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResultStatusSubCode }
     *     
     */
    public ResultStatusSubCode getStatusSubCode() {
        return statusSubCode;
    }

    /**
     * Sets the value of the statusSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultStatusSubCode }
     *     
     */
    public void setStatusSubCode(ResultStatusSubCode value) {
        this.statusSubCode = value;
    }

    /**
     * Gets the value of the statusText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatusText() {
        if (statusText == null) {
            statusText = new ArrayList<String>();
        }
        return this.statusText;
    }

}
