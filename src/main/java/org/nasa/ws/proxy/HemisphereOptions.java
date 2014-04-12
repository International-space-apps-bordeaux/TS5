
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hemisphereOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hemisphereOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="north" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="south" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hemisphereOptions", propOrder = {
    "north",
    "south"
})
public class HemisphereOptions {

    protected boolean north;
    protected boolean south;

    /**
     * Gets the value of the north property.
     * 
     */
    public boolean isNorth() {
        return north;
    }

    /**
     * Sets the value of the north property.
     * 
     */
    public void setNorth(boolean value) {
        this.north = value;
    }

    /**
     * Gets the value of the south property.
     * 
     */
    public boolean isSouth() {
        return south;
    }

    /**
     * Sets the value of the south property.
     * 
     */
    public void setSouth(boolean value) {
        this.south = value;
    }

}
