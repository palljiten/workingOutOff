
package com.oracle.xmlns.primavera.p6.ws.udfvalue.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReadCalculatedUDFValuesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadCalculatedUDFValuesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CalculatedUDFValue" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ConditionalIndicator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                   &lt;element name="Double" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                   &lt;element name="FinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                   &lt;element name="Integer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                   &lt;element name="CalculatedUDFTypeDataType"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Start Date"/&gt;
 *                         &lt;enumeration value="Finish Date"/&gt;
 *                         &lt;enumeration value="Cost"/&gt;
 *                         &lt;enumeration value="Double"/&gt;
 *                         &lt;enumeration value="Integer"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="UDFTypeObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadCalculatedUDFValuesResponse", propOrder = {
    "calculatedUDFValue"
})
public class ReadCalculatedUDFValuesResponse {

    @XmlElement(name = "CalculatedUDFValue")
    protected List<ReadCalculatedUDFValuesResponse.CalculatedUDFValue> calculatedUDFValue;

    /**
     * Gets the value of the calculatedUDFValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calculatedUDFValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalculatedUDFValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReadCalculatedUDFValuesResponse.CalculatedUDFValue }
     * 
     * 
     */
    public List<ReadCalculatedUDFValuesResponse.CalculatedUDFValue> getCalculatedUDFValue() {
        if (calculatedUDFValue == null) {
            calculatedUDFValue = new ArrayList<ReadCalculatedUDFValuesResponse.CalculatedUDFValue>();
        }
        return this.calculatedUDFValue;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ConditionalIndicator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *         &lt;element name="Double" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *         &lt;element name="FinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *         &lt;element name="Integer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *         &lt;element name="CalculatedUDFTypeDataType"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Start Date"/&gt;
     *               &lt;enumeration value="Finish Date"/&gt;
     *               &lt;enumeration value="Cost"/&gt;
     *               &lt;enumeration value="Double"/&gt;
     *               &lt;enumeration value="Integer"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="UDFTypeObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "conditionalIndicator",
        "cost",
        "_double",
        "finishDate",
        "integer",
        "projectObjectId",
        "startDate",
        "calculatedUDFTypeDataType",
        "udfTypeObjectId"
    })
    public static class CalculatedUDFValue {

        @XmlElementRef(name = "ConditionalIndicator", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> conditionalIndicator;
        @XmlElementRef(name = "Cost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1", type = JAXBElement.class, required = false)
        protected JAXBElement<Double> cost;
        @XmlElementRef(name = "Double", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1", type = JAXBElement.class, required = false)
        protected JAXBElement<Double> _double;
        @XmlElementRef(name = "FinishDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> finishDate;
        @XmlElementRef(name = "Integer", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> integer;
        @XmlElement(name = "ProjectObjectId")
        protected int projectObjectId;
        @XmlElementRef(name = "StartDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> startDate;
        @XmlElement(name = "CalculatedUDFTypeDataType", required = true)
        protected String calculatedUDFTypeDataType;
        @XmlElement(name = "UDFTypeObjectId")
        protected int udfTypeObjectId;

        /**
         * Gets the value of the conditionalIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getConditionalIndicator() {
            return conditionalIndicator;
        }

        /**
         * Sets the value of the conditionalIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setConditionalIndicator(JAXBElement<Integer> value) {
            this.conditionalIndicator = value;
        }

        /**
         * Gets the value of the cost property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Double }{@code >}
         *     
         */
        public JAXBElement<Double> getCost() {
            return cost;
        }

        /**
         * Sets the value of the cost property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Double }{@code >}
         *     
         */
        public void setCost(JAXBElement<Double> value) {
            this.cost = value;
        }

        /**
         * Gets the value of the double property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Double }{@code >}
         *     
         */
        public JAXBElement<Double> getDouble() {
            return _double;
        }

        /**
         * Sets the value of the double property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Double }{@code >}
         *     
         */
        public void setDouble(JAXBElement<Double> value) {
            this._double = value;
        }

        /**
         * Gets the value of the finishDate property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getFinishDate() {
            return finishDate;
        }

        /**
         * Sets the value of the finishDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setFinishDate(JAXBElement<XMLGregorianCalendar> value) {
            this.finishDate = value;
        }

        /**
         * Gets the value of the integer property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getInteger() {
            return integer;
        }

        /**
         * Sets the value of the integer property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setInteger(JAXBElement<Integer> value) {
            this.integer = value;
        }

        /**
         * Gets the value of the projectObjectId property.
         * 
         */
        public int getProjectObjectId() {
            return projectObjectId;
        }

        /**
         * Sets the value of the projectObjectId property.
         * 
         */
        public void setProjectObjectId(int value) {
            this.projectObjectId = value;
        }

        /**
         * Gets the value of the startDate property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getStartDate() {
            return startDate;
        }

        /**
         * Sets the value of the startDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setStartDate(JAXBElement<XMLGregorianCalendar> value) {
            this.startDate = value;
        }

        /**
         * Gets the value of the calculatedUDFTypeDataType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCalculatedUDFTypeDataType() {
            return calculatedUDFTypeDataType;
        }

        /**
         * Sets the value of the calculatedUDFTypeDataType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCalculatedUDFTypeDataType(String value) {
            this.calculatedUDFTypeDataType = value;
        }

        /**
         * Gets the value of the udfTypeObjectId property.
         * 
         */
        public int getUDFTypeObjectId() {
            return udfTypeObjectId;
        }

        /**
         * Sets the value of the udfTypeObjectId property.
         * 
         */
        public void setUDFTypeObjectId(int value) {
            this.udfTypeObjectId = value;
        }

    }

}
