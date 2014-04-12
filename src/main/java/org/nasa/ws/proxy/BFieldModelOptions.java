
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bFieldModelOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bFieldModelOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="externalModel" type="{http://ssc.spdf.gsfc.nasa.gov/}bFieldModelParameters" minOccurs="0"/>
 *         &lt;element name="fieldLinesStopAltitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="internalModel" type="{http://ssc.spdf.gsfc.nasa.gov/}internalBFieldModel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bFieldModelOptions", propOrder = {
    "externalModel",
    "fieldLinesStopAltitude",
    "internalModel"
})
public class BFieldModelOptions {

    protected BFieldModelParameters externalModel;
    protected double fieldLinesStopAltitude;
    protected InternalBFieldModel internalModel;

    /**
     * Gets the value of the externalModel property.
     * 
     * @return
     *     possible object is
     *     {@link BFieldModelParameters }
     *     
     */
    public BFieldModelParameters getExternalModel() {
        return externalModel;
    }

    /**
     * Sets the value of the externalModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BFieldModelParameters }
     *     
     */
    public void setExternalModel(BFieldModelParameters value) {
        this.externalModel = value;
    }

    /**
     * Gets the value of the fieldLinesStopAltitude property.
     * 
     */
    public double getFieldLinesStopAltitude() {
        return fieldLinesStopAltitude;
    }

    /**
     * Sets the value of the fieldLinesStopAltitude property.
     * 
     */
    public void setFieldLinesStopAltitude(double value) {
        this.fieldLinesStopAltitude = value;
    }

    /**
     * Gets the value of the internalModel property.
     * 
     * @return
     *     possible object is
     *     {@link InternalBFieldModel }
     *     
     */
    public InternalBFieldModel getInternalModel() {
        return internalModel;
    }

    /**
     * Sets the value of the internalModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalBFieldModel }
     *     
     */
    public void setInternalModel(InternalBFieldModel value) {
        this.internalModel = value;
    }

}
