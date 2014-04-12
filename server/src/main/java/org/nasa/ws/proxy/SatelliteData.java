
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
 * <p>Java class for satelliteData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="satelliteData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BGseX" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BGseY" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BGseZ" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BTraceData" type="{http://ssc.spdf.gsfc.nasa.gov/}bTraceData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bowShockDistance" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coordinates" type="{http://ssc.spdf.gsfc.nasa.gov/}coordinateData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dipoleInvariantLatitude" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dipoleLValue" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="magneticStrength" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="magnetoPauseDistance" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="neutralSheetDistance" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="northBTracedRegions" type="{http://ssc.spdf.gsfc.nasa.gov/}footpointRegion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="radialLength" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="radialTraceFootpointRegion" type="{http://ssc.spdf.gsfc.nasa.gov/}footpointRegion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="southBTracedRegions" type="{http://ssc.spdf.gsfc.nasa.gov/}footpointRegion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="spacecraftRegion" type="{http://ssc.spdf.gsfc.nasa.gov/}spaceRegion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "satelliteData", propOrder = {
    "bGseX",
    "bGseY",
    "bGseZ",
    "bTraceData",
    "bowShockDistance",
    "coordinates",
    "dipoleInvariantLatitude",
    "dipoleLValue",
    "id",
    "magneticStrength",
    "magnetoPauseDistance",
    "neutralSheetDistance",
    "northBTracedRegions",
    "radialLength",
    "radialTraceFootpointRegion",
    "southBTracedRegions",
    "spacecraftRegion",
    "time"
})
public class SatelliteData {

    @XmlElement(name = "BGseX", nillable = true)
    protected List<Double> bGseX;
    @XmlElement(name = "BGseY", nillable = true)
    protected List<Double> bGseY;
    @XmlElement(name = "BGseZ", nillable = true)
    protected List<Double> bGseZ;
    @XmlElement(name = "BTraceData", nillable = true)
    protected List<BTraceData> bTraceData;
    @XmlElement(nillable = true)
    protected List<Double> bowShockDistance;
    @XmlElement(nillable = true)
    protected List<CoordinateData> coordinates;
    @XmlElement(nillable = true)
    protected List<Float> dipoleInvariantLatitude;
    @XmlElement(nillable = true)
    protected List<Double> dipoleLValue;
    protected String id;
    @XmlElement(nillable = true)
    protected List<Double> magneticStrength;
    @XmlElement(nillable = true)
    protected List<Double> magnetoPauseDistance;
    @XmlElement(nillable = true)
    protected List<Double> neutralSheetDistance;
    @XmlElement(nillable = true)
    protected List<FootpointRegion> northBTracedRegions;
    @XmlElement(nillable = true)
    protected List<Double> radialLength;
    @XmlElement(nillable = true)
    protected List<FootpointRegion> radialTraceFootpointRegion;
    @XmlElement(nillable = true)
    protected List<FootpointRegion> southBTracedRegions;
    @XmlElement(nillable = true)
    protected List<SpaceRegion> spacecraftRegion;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> time;

    /**
     * Gets the value of the bGseX property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bGseX property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBGseX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getBGseX() {
        if (bGseX == null) {
            bGseX = new ArrayList<Double>();
        }
        return this.bGseX;
    }

    /**
     * Gets the value of the bGseY property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bGseY property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBGseY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getBGseY() {
        if (bGseY == null) {
            bGseY = new ArrayList<Double>();
        }
        return this.bGseY;
    }

    /**
     * Gets the value of the bGseZ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bGseZ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBGseZ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getBGseZ() {
        if (bGseZ == null) {
            bGseZ = new ArrayList<Double>();
        }
        return this.bGseZ;
    }

    /**
     * Gets the value of the bTraceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bTraceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBTraceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BTraceData }
     * 
     * 
     */
    public List<BTraceData> getBTraceData() {
        if (bTraceData == null) {
            bTraceData = new ArrayList<BTraceData>();
        }
        return this.bTraceData;
    }

    /**
     * Gets the value of the bowShockDistance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bowShockDistance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBowShockDistance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getBowShockDistance() {
        if (bowShockDistance == null) {
            bowShockDistance = new ArrayList<Double>();
        }
        return this.bowShockDistance;
    }

    /**
     * Gets the value of the coordinates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoordinateData }
     * 
     * 
     */
    public List<CoordinateData> getCoordinates() {
        if (coordinates == null) {
            coordinates = new ArrayList<CoordinateData>();
        }
        return this.coordinates;
    }

    /**
     * Gets the value of the dipoleInvariantLatitude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dipoleInvariantLatitude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDipoleInvariantLatitude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getDipoleInvariantLatitude() {
        if (dipoleInvariantLatitude == null) {
            dipoleInvariantLatitude = new ArrayList<Float>();
        }
        return this.dipoleInvariantLatitude;
    }

    /**
     * Gets the value of the dipoleLValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dipoleLValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDipoleLValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getDipoleLValue() {
        if (dipoleLValue == null) {
            dipoleLValue = new ArrayList<Double>();
        }
        return this.dipoleLValue;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the magneticStrength property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the magneticStrength property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMagneticStrength().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getMagneticStrength() {
        if (magneticStrength == null) {
            magneticStrength = new ArrayList<Double>();
        }
        return this.magneticStrength;
    }

    /**
     * Gets the value of the magnetoPauseDistance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the magnetoPauseDistance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMagnetoPauseDistance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getMagnetoPauseDistance() {
        if (magnetoPauseDistance == null) {
            magnetoPauseDistance = new ArrayList<Double>();
        }
        return this.magnetoPauseDistance;
    }

    /**
     * Gets the value of the neutralSheetDistance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the neutralSheetDistance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNeutralSheetDistance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getNeutralSheetDistance() {
        if (neutralSheetDistance == null) {
            neutralSheetDistance = new ArrayList<Double>();
        }
        return this.neutralSheetDistance;
    }

    /**
     * Gets the value of the northBTracedRegions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the northBTracedRegions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNorthBTracedRegions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FootpointRegion }
     * 
     * 
     */
    public List<FootpointRegion> getNorthBTracedRegions() {
        if (northBTracedRegions == null) {
            northBTracedRegions = new ArrayList<FootpointRegion>();
        }
        return this.northBTracedRegions;
    }

    /**
     * Gets the value of the radialLength property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radialLength property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadialLength().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getRadialLength() {
        if (radialLength == null) {
            radialLength = new ArrayList<Double>();
        }
        return this.radialLength;
    }

    /**
     * Gets the value of the radialTraceFootpointRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radialTraceFootpointRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadialTraceFootpointRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FootpointRegion }
     * 
     * 
     */
    public List<FootpointRegion> getRadialTraceFootpointRegion() {
        if (radialTraceFootpointRegion == null) {
            radialTraceFootpointRegion = new ArrayList<FootpointRegion>();
        }
        return this.radialTraceFootpointRegion;
    }

    /**
     * Gets the value of the southBTracedRegions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the southBTracedRegions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSouthBTracedRegions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FootpointRegion }
     * 
     * 
     */
    public List<FootpointRegion> getSouthBTracedRegions() {
        if (southBTracedRegions == null) {
            southBTracedRegions = new ArrayList<FootpointRegion>();
        }
        return this.southBTracedRegions;
    }

    /**
     * Gets the value of the spacecraftRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spacecraftRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpacecraftRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpaceRegion }
     * 
     * 
     */
    public List<SpaceRegion> getSpacecraftRegion() {
        if (spacecraftRegion == null) {
            spacecraftRegion = new ArrayList<SpaceRegion>();
        }
        return this.spacecraftRegion;
    }

    /**
     * Gets the value of the time property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the time property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getTime() {
        if (time == null) {
            time = new ArrayList<XMLGregorianCalendar>();
        }
        return this.time;
    }

}
