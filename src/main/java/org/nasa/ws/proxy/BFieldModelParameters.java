
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bFieldModelParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bFieldModelParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="byImf" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="bzImf" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="dst" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="model" type="{http://ssc.spdf.gsfc.nasa.gov/}externalBFieldModel" minOccurs="0"/>
 *         &lt;element name="parameterValues" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="solarWindPressure" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="useFixedValues" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bFieldModelParameters", propOrder = {
    "byImf",
    "bzImf",
    "dst",
    "model",
    "parameterValues",
    "solarWindPressure",
    "useFixedValues"
})
public class BFieldModelParameters {

    protected float byImf;
    protected float bzImf;
    protected int dst;
    protected ExternalBFieldModel model;
    protected short parameterValues;
    protected float solarWindPressure;
    protected boolean useFixedValues;

    /**
     * Gets the value of the byImf property.
     * 
     */
    public float getByImf() {
        return byImf;
    }

    /**
     * Sets the value of the byImf property.
     * 
     */
    public void setByImf(float value) {
        this.byImf = value;
    }

    /**
     * Gets the value of the bzImf property.
     * 
     */
    public float getBzImf() {
        return bzImf;
    }

    /**
     * Sets the value of the bzImf property.
     * 
     */
    public void setBzImf(float value) {
        this.bzImf = value;
    }

    /**
     * Gets the value of the dst property.
     * 
     */
    public int getDst() {
        return dst;
    }

    /**
     * Sets the value of the dst property.
     * 
     */
    public void setDst(int value) {
        this.dst = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalBFieldModel }
     *     
     */
    public ExternalBFieldModel getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalBFieldModel }
     *     
     */
    public void setModel(ExternalBFieldModel value) {
        this.model = value;
    }

    /**
     * Gets the value of the parameterValues property.
     * 
     */
    public short getParameterValues() {
        return parameterValues;
    }

    /**
     * Sets the value of the parameterValues property.
     * 
     */
    public void setParameterValues(short value) {
        this.parameterValues = value;
    }

    /**
     * Gets the value of the solarWindPressure property.
     * 
     */
    public float getSolarWindPressure() {
        return solarWindPressure;
    }

    /**
     * Sets the value of the solarWindPressure property.
     * 
     */
    public void setSolarWindPressure(float value) {
        this.solarWindPressure = value;
    }

    /**
     * Gets the value of the useFixedValues property.
     * 
     */
    public boolean isUseFixedValues() {
        return useFixedValues;
    }

    /**
     * Sets the value of the useFixedValues property.
     * 
     */
    public void setUseFixedValues(boolean value) {
        this.useFixedValues = value;
    }

}
