
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orbitGraphOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orbitGraphOptions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ssc.spdf.gsfc.nasa.gov/}graphOptions">
 *       &lt;sequence>
 *         &lt;element name="combined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="coordinateSystem" type="{http://ssc.spdf.gsfc.nasa.gov/}coordinateSystem" minOccurs="0"/>
 *         &lt;element name="evenAxesScales" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="formatOptions" type="{http://ssc.spdf.gsfc.nasa.gov/}graphFormatOptions" minOccurs="0"/>
 *         &lt;element name="imfBz" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="manualScale" type="{http://ssc.spdf.gsfc.nasa.gov/}graphScale" minOccurs="0"/>
 *         &lt;element name="showBowShockMagnetopause" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="solarWindPressure" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="sunToRight" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="xrView" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="xyView" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="xzView" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="yzView" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orbitGraphOptions", propOrder = {
    "combined",
    "coordinateSystem",
    "evenAxesScales",
    "formatOptions",
    "imfBz",
    "manualScale",
    "showBowShockMagnetopause",
    "solarWindPressure",
    "sunToRight",
    "xrView",
    "xyView",
    "xzView",
    "yzView"
})
public class OrbitGraphOptions
    extends GraphOptions
{

    protected boolean combined;
    protected CoordinateSystem coordinateSystem;
    protected boolean evenAxesScales;
    protected GraphFormatOptions formatOptions;
    protected float imfBz;
    protected GraphScale manualScale;
    protected boolean showBowShockMagnetopause;
    protected float solarWindPressure;
    protected boolean sunToRight;
    protected boolean xrView;
    protected boolean xyView;
    protected boolean xzView;
    protected boolean yzView;

    /**
     * Gets the value of the combined property.
     * 
     */
    public boolean isCombined() {
        return combined;
    }

    /**
     * Sets the value of the combined property.
     * 
     */
    public void setCombined(boolean value) {
        this.combined = value;
    }

    /**
     * Gets the value of the coordinateSystem property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateSystem }
     *     
     */
    public CoordinateSystem getCoordinateSystem() {
        return coordinateSystem;
    }

    /**
     * Sets the value of the coordinateSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateSystem }
     *     
     */
    public void setCoordinateSystem(CoordinateSystem value) {
        this.coordinateSystem = value;
    }

    /**
     * Gets the value of the evenAxesScales property.
     * 
     */
    public boolean isEvenAxesScales() {
        return evenAxesScales;
    }

    /**
     * Sets the value of the evenAxesScales property.
     * 
     */
    public void setEvenAxesScales(boolean value) {
        this.evenAxesScales = value;
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
     * Gets the value of the imfBz property.
     * 
     */
    public float getImfBz() {
        return imfBz;
    }

    /**
     * Sets the value of the imfBz property.
     * 
     */
    public void setImfBz(float value) {
        this.imfBz = value;
    }

    /**
     * Gets the value of the manualScale property.
     * 
     * @return
     *     possible object is
     *     {@link GraphScale }
     *     
     */
    public GraphScale getManualScale() {
        return manualScale;
    }

    /**
     * Sets the value of the manualScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphScale }
     *     
     */
    public void setManualScale(GraphScale value) {
        this.manualScale = value;
    }

    /**
     * Gets the value of the showBowShockMagnetopause property.
     * 
     */
    public boolean isShowBowShockMagnetopause() {
        return showBowShockMagnetopause;
    }

    /**
     * Sets the value of the showBowShockMagnetopause property.
     * 
     */
    public void setShowBowShockMagnetopause(boolean value) {
        this.showBowShockMagnetopause = value;
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
     * Gets the value of the sunToRight property.
     * 
     */
    public boolean isSunToRight() {
        return sunToRight;
    }

    /**
     * Sets the value of the sunToRight property.
     * 
     */
    public void setSunToRight(boolean value) {
        this.sunToRight = value;
    }

    /**
     * Gets the value of the xrView property.
     * 
     */
    public boolean isXrView() {
        return xrView;
    }

    /**
     * Sets the value of the xrView property.
     * 
     */
    public void setXrView(boolean value) {
        this.xrView = value;
    }

    /**
     * Gets the value of the xyView property.
     * 
     */
    public boolean isXyView() {
        return xyView;
    }

    /**
     * Sets the value of the xyView property.
     * 
     */
    public void setXyView(boolean value) {
        this.xyView = value;
    }

    /**
     * Gets the value of the xzView property.
     * 
     */
    public boolean isXzView() {
        return xzView;
    }

    /**
     * Sets the value of the xzView property.
     * 
     */
    public void setXzView(boolean value) {
        this.xzView = value;
    }

    /**
     * Gets the value of the yzView property.
     * 
     */
    public boolean isYzView() {
        return yzView;
    }

    /**
     * Sets the value of the yzView property.
     * 
     */
    public void setYzView(boolean value) {
        this.yzView = value;
    }

}
