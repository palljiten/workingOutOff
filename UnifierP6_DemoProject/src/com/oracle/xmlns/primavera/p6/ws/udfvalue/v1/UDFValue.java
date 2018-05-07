
package com.oracle.xmlns.primavera.p6.ws.udfvalue.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UDFValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UDFValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodeValue" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ConditionalIndicator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreateUser" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Description" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Double" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="-1.0E12"/&gt;
 *               &lt;maxInclusive value="1.0E12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ForeignObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Indicator" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value=""/&gt;
 *               &lt;enumeration value="None"/&gt;
 *               &lt;enumeration value="Red"/&gt;
 *               &lt;enumeration value="Yellow"/&gt;
 *               &lt;enumeration value="Green"/&gt;
 *               &lt;enumeration value="Blue"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Integer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsUDFTypeCalculated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsUDFTypeConditional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdateUser" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Text" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UDFCodeObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UDFTypeDataType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Text"/&gt;
 *               &lt;enumeration value="Start Date"/&gt;
 *               &lt;enumeration value="Finish Date"/&gt;
 *               &lt;enumeration value="Cost"/&gt;
 *               &lt;enumeration value="Double"/&gt;
 *               &lt;enumeration value="Integer"/&gt;
 *               &lt;enumeration value="Indicator"/&gt;
 *               &lt;enumeration value="Code"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UDFTypeObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UDFTypeSubjectArea" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Activity"/&gt;
 *               &lt;enumeration value="Activity Expense"/&gt;
 *               &lt;enumeration value="Activity Step"/&gt;
 *               &lt;enumeration value="Project"/&gt;
 *               &lt;enumeration value="Project Issue"/&gt;
 *               &lt;enumeration value="Project Risk"/&gt;
 *               &lt;enumeration value="Resource"/&gt;
 *               &lt;enumeration value="Resource Assignment"/&gt;
 *               &lt;enumeration value="WBS"/&gt;
 *               &lt;enumeration value="Work Products and Documents"/&gt;
 *               &lt;enumeration value="Activity Step Template Item"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UDFTypeTitle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
@XmlType(name = "UDFValue", propOrder = {
    "codeValue",
    "conditionalIndicator",
    "cost",
    "createDate",
    "createUser",
    "description",
    "_double",
    "finishDate",
    "foreignObjectId",
    "indicator",
    "integer",
    "isBaseline",
    "isTemplate",
    "isUDFTypeCalculated",
    "isUDFTypeConditional",
    "lastUpdateDate",
    "lastUpdateUser",
    "projectObjectId",
    "startDate",
    "text",
    "udfCodeObjectId",
    "udfTypeDataType",
    "udfTypeObjectId",
    "udfTypeSubjectArea",
    "udfTypeTitle"
})
public class UDFValue {

    @XmlElement(name = "CodeValue")
    protected String codeValue;
    @XmlElementRef(name = "ConditionalIndicator", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> conditionalIndicator;
    @XmlElementRef(name = "Cost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cost;
    @XmlElementRef(name = "CreateDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createDate;
    @XmlElement(name = "CreateUser")
    protected String createUser;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElementRef(name = "Double", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> _double;
    @XmlElementRef(name = "FinishDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> finishDate;
    @XmlElement(name = "ForeignObjectId")
    protected Integer foreignObjectId;
    @XmlElement(name = "Indicator")
    protected String indicator;
    @XmlElementRef(name = "Integer", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> integer;
    @XmlElementRef(name = "IsBaseline", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isBaseline;
    @XmlElement(name = "IsTemplate")
    protected Boolean isTemplate;
    @XmlElementRef(name = "IsUDFTypeCalculated", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isUDFTypeCalculated;
    @XmlElementRef(name = "IsUDFTypeConditional", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isUDFTypeConditional;
    @XmlElementRef(name = "LastUpdateDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastUpdateDate;
    @XmlElement(name = "LastUpdateUser")
    protected String lastUpdateUser;
    @XmlElementRef(name = "ProjectObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> projectObjectId;
    @XmlElementRef(name = "StartDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startDate;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElementRef(name = "UDFCodeObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> udfCodeObjectId;
    @XmlElement(name = "UDFTypeDataType")
    protected String udfTypeDataType;
    @XmlElement(name = "UDFTypeObjectId")
    protected Integer udfTypeObjectId;
    @XmlElement(name = "UDFTypeSubjectArea")
    protected String udfTypeSubjectArea;
    @XmlElement(name = "UDFTypeTitle")
    protected String udfTypeTitle;

    /**
     * Gets the value of the codeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * Sets the value of the codeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeValue(String value) {
        this.codeValue = value;
    }

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
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the createUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * Sets the value of the createUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateUser(String value) {
        this.createUser = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the foreignObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getForeignObjectId() {
        return foreignObjectId;
    }

    /**
     * Sets the value of the foreignObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setForeignObjectId(Integer value) {
        this.foreignObjectId = value;
    }

    /**
     * Gets the value of the indicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator(String value) {
        this.indicator = value;
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
     * Gets the value of the isBaseline property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsBaseline() {
        return isBaseline;
    }

    /**
     * Sets the value of the isBaseline property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsBaseline(JAXBElement<Boolean> value) {
        this.isBaseline = value;
    }

    /**
     * Gets the value of the isTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTemplate() {
        return isTemplate;
    }

    /**
     * Sets the value of the isTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTemplate(Boolean value) {
        this.isTemplate = value;
    }

    /**
     * Gets the value of the isUDFTypeCalculated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsUDFTypeCalculated() {
        return isUDFTypeCalculated;
    }

    /**
     * Sets the value of the isUDFTypeCalculated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsUDFTypeCalculated(JAXBElement<Boolean> value) {
        this.isUDFTypeCalculated = value;
    }

    /**
     * Gets the value of the isUDFTypeConditional property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsUDFTypeConditional() {
        return isUDFTypeConditional;
    }

    /**
     * Sets the value of the isUDFTypeConditional property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsUDFTypeConditional(JAXBElement<Boolean> value) {
        this.isUDFTypeConditional = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the lastUpdateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    /**
     * Sets the value of the lastUpdateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateUser(String value) {
        this.lastUpdateUser = value;
    }

    /**
     * Gets the value of the projectObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getProjectObjectId() {
        return projectObjectId;
    }

    /**
     * Sets the value of the projectObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setProjectObjectId(JAXBElement<Integer> value) {
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
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the udfCodeObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUDFCodeObjectId() {
        return udfCodeObjectId;
    }

    /**
     * Sets the value of the udfCodeObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUDFCodeObjectId(JAXBElement<Integer> value) {
        this.udfCodeObjectId = value;
    }

    /**
     * Gets the value of the udfTypeDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDFTypeDataType() {
        return udfTypeDataType;
    }

    /**
     * Sets the value of the udfTypeDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDFTypeDataType(String value) {
        this.udfTypeDataType = value;
    }

    /**
     * Gets the value of the udfTypeObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUDFTypeObjectId() {
        return udfTypeObjectId;
    }

    /**
     * Sets the value of the udfTypeObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUDFTypeObjectId(Integer value) {
        this.udfTypeObjectId = value;
    }

    /**
     * Gets the value of the udfTypeSubjectArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDFTypeSubjectArea() {
        return udfTypeSubjectArea;
    }

    /**
     * Sets the value of the udfTypeSubjectArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDFTypeSubjectArea(String value) {
        this.udfTypeSubjectArea = value;
    }

    /**
     * Gets the value of the udfTypeTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDFTypeTitle() {
        return udfTypeTitle;
    }

    /**
     * Sets the value of the udfTypeTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDFTypeTitle(String value) {
        this.udfTypeTitle = value;
    }

}
