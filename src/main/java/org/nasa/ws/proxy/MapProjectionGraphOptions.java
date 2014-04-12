
package org.nasa.ws.proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mapProjectionGraphOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mapProjectionGraphOptions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ssc.spdf.gsfc.nasa.gov/}graphOptions">
 *       &lt;sequence>
 *         &lt;element name="coordinateSystem" type="{http://ssc.spdf.gsfc.nasa.gov/}projectionCoordinateSystem" minOccurs="0"/>
 *         &lt;element name="formatOptions" type="{http://ssc.spdf.gsfc.nasa.gov/}graphFormatOptions" minOccurs="0"/>
 *         &lt;element name="groundStations" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="longitudeVerticalDown" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="mapLimits" type="{http://ssc.spdf.gsfc.nasa.gov/}mapLimits" minOccurs="0"/>
 *         &lt;element name="polarMapOrientation" type="{http://ssc.spdf.gsfc.nasa.gov/}polarMapOrientation" minOccurs="0"/>
 *         &lt;element name="projection" type="{http://ssc.spdf.gsfc.nasa.gov/}mapProjection" minOccurs="0"/>
 *         &lt;element name="showContinents" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trace" type="{http://ssc.spdf.gsfc.nasa.gov/}trace" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mapProjectionGraphOptions", propOrder = {
    "coordinateSystem",
    "formatOptions",
    "groundStations",
    "longitudeVerticalDown",
    "mapLimits",
    "polarMapOrientation",
    "projection",
    "showContinents",
    "title",
    "trace"
})
public class MapProjectionGraphOptions
    extends GraphOptions
{

    protected ProjectionCoordinateSystem coordinateSystem;
    protected GraphFormatOptions formatOptions;
    @XmlElement(nillable = true)
    protected List<String> groundStations;
    protected float longitudeVerticalDown;
    protected MapLimits mapLimits;
    protected PolarMapOrientation polarMapOrientation;
    protected MapProjection projection;
    protected boolean showContinents;
    protected String title;
    protected Trace trace;

    /**
     * Gets the value of the coordinateSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectionCoordinateSystem }
     *     
     */
    public ProjectionCoordinateSystem getCoordinateSystem() {
        return coordinateSystem;
    }

    /**
     * Sets the value of the coordinateSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectionCoordinateSystem }
     *     
     */
    public void setCoordinateSystem(ProjectionCoordinateSystem value) {
        this.coordinateSystem = value;
    }

    /**
     * Gets the value of the formatOptions property.
     * 
     * @return
     *     possible object is
     *     {@link GraphFormatOptions }
     *     
     */
    public GraphFormatOptions getFormatOptions() {
        return formatOptions;
    }

    /**
     * Sets the value of the formatOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphFormatOptions }
     *     
     */
    public void setFormatOptions(GraphFormatOptions value) {
        this.formatOptions = value;
    }

    /**
     * Gets the value of the groundStations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groundStations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroundStations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGroundStations() {
        if (groundStations == null) {
            groundStations = new ArrayList<String>();
        }
        return this.groundStations;
    }

    /**
     * Gets the value of the longitudeVerticalDown property.
     * 
     */
    public float getLongitudeVerticalDown() {
        return longitudeVerticalDown;
    }

    /**
     * Sets the value of the longitudeVerticalDown property.
     * 
     */
    public void setLongitudeVerticalDown(float value) {
        this.longitudeVerticalDown = value;
    }

    /**
     * Gets the value of the mapLimits property.
     * 
     * @return
     *     possible object is
     *     {@link MapLimits }
     *     
     */
    public MapLimits getMapLimits() {
        return mapLimits;
    }

    /**
     * Sets the value of the mapLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapLimits }
     *     
     */
    public void setMapLimits(MapLimits value) {
        this.mapLimits = value;
    }

    /**
     * Gets the value of the polarMapOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link PolarMapOrientation }
     *     
     */
    public PolarMapOrientation getPolarMapOrientation() {
        return polarMapOrientation;
    }

    /**
     * Sets the value of the polarMapOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolarMapOrientation }
     *     
     */
    public void setPolarMapOrientation(PolarMapOrientation value) {
        this.polarMapOrientation = value;
    }

    /**
     * Gets the value of the projection property.
     * 
     * @return
     *     possible object is
     *     {@link MapProjection }
     *     
     */
    public MapProjection getProjection() {
        return projection;
    }

    /**
     * Sets the value of the projection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapProjection }
     *     
     */
    public void setProjection(MapProjection value) {
        this.projection = value;
    }

    /**
     * Gets the value of the showContinents property.
     * 
     */
    public boolean isShowContinents() {
        return showContinents;
    }

    /**
     * Sets the value of the showContinents property.
     * 
     */
    public void setShowContinents(boolean value) {
        this.showContinents = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the trace property.
     * 
     * @return
     *     possible object is
     *     {@link Trace }
     *     
     */
    public Trace getTrace() {
        return trace;
    }

    /**
     * Sets the value of the trace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trace }
     *     
     */
    public void setTrace(Trace value) {
        this.trace = value;
    }

}
