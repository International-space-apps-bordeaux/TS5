
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataFileRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataFileRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ssc.spdf.gsfc.nasa.gov/}dataRequest">
 *       &lt;sequence>
 *         &lt;element name="formatOptions" type="{http://ssc.spdf.gsfc.nasa.gov/}formatOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataFileRequest", propOrder = {
    "formatOptions"
})
public class DataFileRequest
    extends DataRequest
{

    protected FormatOptions formatOptions;

    /**
     * Gets the value of the formatOptions property.
     * 
     * @return
     *     possible object is
     *     {@link FormatOptions }
     *     
     */
    public FormatOptions getFormatOptions() {
        return formatOptions;
    }

    /**
     * Sets the value of the formatOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatOptions }
     *     
     */
    public void setFormatOptions(FormatOptions value) {
        this.formatOptions = value;
    }

}
