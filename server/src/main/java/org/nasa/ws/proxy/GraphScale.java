
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for graphScale complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="graphScale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxZ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minZ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "graphScale", propOrder = {
    "maxR",
    "maxX",
    "maxY",
    "maxZ",
    "minR",
    "minX",
    "minY",
    "minZ"
})
public class GraphScale {

    protected int maxR;
    protected int maxX;
    protected int maxY;
    protected int maxZ;
    protected int minR;
    protected int minX;
    protected int minY;
    protected int minZ;

    /**
     * Gets the value of the maxR property.
     * 
     */
    public int getMaxR() {
        return maxR;
    }

    /**
     * Sets the value of the maxR property.
     * 
     */
    public void setMaxR(int value) {
        this.maxR = value;
    }

    /**
     * Gets the value of the maxX property.
     * 
     */
    public int getMaxX() {
        return maxX;
    }

    /**
     * Sets the value of the maxX property.
     * 
     */
    public void setMaxX(int value) {
        this.maxX = value;
    }

    /**
     * Gets the value of the maxY property.
     * 
     */
    public int getMaxY() {
        return maxY;
    }

    /**
     * Sets the value of the maxY property.
     * 
     */
    public void setMaxY(int value) {
        this.maxY = value;
    }

    /**
     * Gets the value of the maxZ property.
     * 
     */
    public int getMaxZ() {
        return maxZ;
    }

    /**
     * Sets the value of the maxZ property.
     * 
     */
    public void setMaxZ(int value) {
        this.maxZ = value;
    }

    /**
     * Gets the value of the minR property.
     * 
     */
    public int getMinR() {
        return minR;
    }

    /**
     * Sets the value of the minR property.
     * 
     */
    public void setMinR(int value) {
        this.minR = value;
    }

    /**
     * Gets the value of the minX property.
     * 
     */
    public int getMinX() {
        return minX;
    }

    /**
     * Sets the value of the minX property.
     * 
     */
    public void setMinX(int value) {
        this.minX = value;
    }

    /**
     * Gets the value of the minY property.
     * 
     */
    public int getMinY() {
        return minY;
    }

    /**
     * Sets the value of the minY property.
     * 
     */
    public void setMinY(int value) {
        this.minY = value;
    }

    /**
     * Gets the value of the minZ property.
     * 
     */
    public int getMinZ() {
        return minZ;
    }

    /**
     * Sets the value of the minZ property.
     * 
     */
    public void setMinZ(int value) {
        this.minZ = value;
    }

}
