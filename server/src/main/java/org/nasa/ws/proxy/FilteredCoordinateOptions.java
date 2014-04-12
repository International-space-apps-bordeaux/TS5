
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for filteredCoordinateOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="filteredCoordinateOptions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ssc.spdf.gsfc.nasa.gov/}coordinateOptions">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://ssc.spdf.gsfc.nasa.gov/}locationFilter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filteredCoordinateOptions", propOrder = {
    "filter"
})
public class FilteredCoordinateOptions
    extends CoordinateOptions
{

    protected LocationFilter filter;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link LocationFilter }
     *     
     */
    public LocationFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationFilter }
     *     
     */
    public void setFilter(LocationFilter value) {
        this.filter = value;
    }

}
