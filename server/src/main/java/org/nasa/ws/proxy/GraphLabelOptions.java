
package org.nasa.ws.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for graphLabelOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="graphLabelOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dayOfYearLabelFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hourLabelFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hourTickMarkFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minuteLabelFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minuteTickMarkFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="monthDayOfMonthLabel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "graphLabelOptions", propOrder = {
    "dayOfYearLabelFrequency",
    "hourLabelFrequency",
    "hourTickMarkFrequency",
    "minuteLabelFrequency",
    "minuteTickMarkFrequency",
    "monthDayOfMonthLabel"
})
public class GraphLabelOptions {

    protected int dayOfYearLabelFrequency;
    protected int hourLabelFrequency;
    protected int hourTickMarkFrequency;
    protected int minuteLabelFrequency;
    protected int minuteTickMarkFrequency;
    protected boolean monthDayOfMonthLabel;

    /**
     * Gets the value of the dayOfYearLabelFrequency property.
     * 
     */
    public int getDayOfYearLabelFrequency() {
        return dayOfYearLabelFrequency;
    }

    /**
     * Sets the value of the dayOfYearLabelFrequency property.
     * 
     */
    public void setDayOfYearLabelFrequency(int value) {
        this.dayOfYearLabelFrequency = value;
    }

    /**
     * Gets the value of the hourLabelFrequency property.
     * 
     */
    public int getHourLabelFrequency() {
        return hourLabelFrequency;
    }

    /**
     * Sets the value of the hourLabelFrequency property.
     * 
     */
    public void setHourLabelFrequency(int value) {
        this.hourLabelFrequency = value;
    }

    /**
     * Gets the value of the hourTickMarkFrequency property.
     * 
     */
    public int getHourTickMarkFrequency() {
        return hourTickMarkFrequency;
    }

    /**
     * Sets the value of the hourTickMarkFrequency property.
     * 
     */
    public void setHourTickMarkFrequency(int value) {
        this.hourTickMarkFrequency = value;
    }

    /**
     * Gets the value of the minuteLabelFrequency property.
     * 
     */
    public int getMinuteLabelFrequency() {
        return minuteLabelFrequency;
    }

    /**
     * Sets the value of the minuteLabelFrequency property.
     * 
     */
    public void setMinuteLabelFrequency(int value) {
        this.minuteLabelFrequency = value;
    }

    /**
     * Gets the value of the minuteTickMarkFrequency property.
     * 
     */
    public int getMinuteTickMarkFrequency() {
        return minuteTickMarkFrequency;
    }

    /**
     * Sets the value of the minuteTickMarkFrequency property.
     * 
     */
    public void setMinuteTickMarkFrequency(int value) {
        this.minuteTickMarkFrequency = value;
    }

    /**
     * Gets the value of the monthDayOfMonthLabel property.
     * 
     */
    public boolean isMonthDayOfMonthLabel() {
        return monthDayOfMonthLabel;
    }

    /**
     * Sets the value of the monthDayOfMonthLabel property.
     * 
     */
    public void setMonthDayOfMonthLabel(boolean value) {
        this.monthDayOfMonthLabel = value;
    }

}
