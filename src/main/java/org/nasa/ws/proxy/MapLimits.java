
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mapLimits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mapLimits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxLatitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="maxLongitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="minLatitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="minLongitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mapLimits", propOrder = {
    "maxLatitude",
    "maxLongitude",
    "minLatitude",
    "minLongitude"
})
public class MapLimits {

    protected float maxLatitude;
    protected float maxLongitude;
    protected float minLatitude;
    protected float minLongitude;

    /**
     * Gets the value of the maxLatitude property.
     * 
     */
    public float getMaxLatitude() {
        return maxLatitude;
    }

    /**
     * Sets the value of the maxLatitude property.
     * 
     */
    public void setMaxLatitude(float value) {
        this.maxLatitude = value;
    }

    /**
     * Gets the value of the maxLongitude property.
     * 
     */
    public float getMaxLongitude() {
        return maxLongitude;
    }

    /**
     * Sets the value of the maxLongitude property.
     * 
     */
    public void setMaxLongitude(float value) {
        this.maxLongitude = value;
    }

    /**
     * Gets the value of the minLatitude property.
     * 
     */
    public float getMinLatitude() {
        return minLatitude;
    }

    /**
     * Sets the value of the minLatitude property.
     * 
     */
    public void setMinLatitude(float value) {
        this.minLatitude = value;
    }

    /**
     * Gets the value of the minLongitude property.
     * 
     */
    public float getMinLongitude() {
        return minLongitude;
    }

    /**
     * Sets the value of the minLongitude property.
     * 
     */
    public void setMinLongitude(float value) {
        this.minLongitude = value;
    }

}
