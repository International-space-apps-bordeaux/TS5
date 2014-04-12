
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for graphFormatOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="graphFormatOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="charSize" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="customLabelOptions" type="{http://ssc.spdf.gsfc.nasa.gov/}graphLabelOptions" minOccurs="0"/>
 *         &lt;element name="symbolSize" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "graphFormatOptions", propOrder = {
    "charSize",
    "customLabelOptions",
    "symbolSize"
})
public class GraphFormatOptions {

    protected float charSize;
    protected GraphLabelOptions customLabelOptions;
    protected float symbolSize;

    /**
     * Gets the value of the charSize property.
     * 
     */
    public float getCharSize() {
        return charSize;
    }

    /**
     * Sets the value of the charSize property.
     * 
     */
    public void setCharSize(float value) {
        this.charSize = value;
    }

    /**
     * Gets the value of the customLabelOptions property.
     * 
     * @return
     *     possible object is
     *     {@link GraphLabelOptions }
     *     
     */
    public GraphLabelOptions getCustomLabelOptions() {
        return customLabelOptions;
    }

    /**
     * Sets the value of the customLabelOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphLabelOptions }
     *     
     */
    public void setCustomLabelOptions(GraphLabelOptions value) {
        this.customLabelOptions = value;
    }

    /**
     * Gets the value of the symbolSize property.
     * 
     */
    public float getSymbolSize() {
        return symbolSize;
    }

    /**
     * Sets the value of the symbolSize property.
     * 
     */
    public void setSymbolSize(float value) {
        this.symbolSize = value;
    }

}
