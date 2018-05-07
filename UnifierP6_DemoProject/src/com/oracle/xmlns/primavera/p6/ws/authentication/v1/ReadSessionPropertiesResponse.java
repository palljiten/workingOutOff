
package com.oracle.xmlns.primavera.p6.ws.authentication.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="IsValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UserObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DatabaseInstanceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DatabaseEncoding" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DatabaseName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DatabaseType" type="{http://xmlns.oracle.com/Primavera/P6/WS/Authentication/V1}DatabaseTypeType"/&gt;
 *         &lt;element name="DatabaseUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IgnoreNullComplexFields" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "isValid",
    "userObjectId",
    "userName",
    "databaseInstanceId",
    "databaseEncoding",
    "databaseName",
    "databaseType",
    "databaseUrl",
    "ignoreNullComplexFields"
})
@XmlRootElement(name = "ReadSessionPropertiesResponse")
public class ReadSessionPropertiesResponse {

    @XmlElement(name = "IsValid")
    protected boolean isValid;
    @XmlElement(name = "UserObjectId")
    protected int userObjectId;
    @XmlElement(name = "UserName", required = true)
    protected String userName;
    @XmlElement(name = "DatabaseInstanceId")
    protected int databaseInstanceId;
    @XmlElement(name = "DatabaseEncoding", required = true)
    protected String databaseEncoding;
    @XmlElement(name = "DatabaseName", required = true)
    protected String databaseName;
    @XmlElement(name = "DatabaseType", required = true)
    @XmlSchemaType(name = "string")
    protected DatabaseTypeType databaseType;
    @XmlElement(name = "DatabaseUrl", required = true)
    protected String databaseUrl;
    @XmlElement(name = "IgnoreNullComplexFields")
    protected boolean ignoreNullComplexFields;

    /**
     * Gets the value of the isValid property.
     * 
     */
    public boolean isIsValid() {
        return isValid;
    }

    /**
     * Sets the value of the isValid property.
     * 
     */
    public void setIsValid(boolean value) {
        this.isValid = value;
    }

    /**
     * Gets the value of the userObjectId property.
     * 
     */
    public int getUserObjectId() {
        return userObjectId;
    }

    /**
     * Sets the value of the userObjectId property.
     * 
     */
    public void setUserObjectId(int value) {
        this.userObjectId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the databaseInstanceId property.
     * 
     */
    public int getDatabaseInstanceId() {
        return databaseInstanceId;
    }

    /**
     * Sets the value of the databaseInstanceId property.
     * 
     */
    public void setDatabaseInstanceId(int value) {
        this.databaseInstanceId = value;
    }

    /**
     * Gets the value of the databaseEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseEncoding() {
        return databaseEncoding;
    }

    /**
     * Sets the value of the databaseEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseEncoding(String value) {
        this.databaseEncoding = value;
    }

    /**
     * Gets the value of the databaseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Sets the value of the databaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseName(String value) {
        this.databaseName = value;
    }

    /**
     * Gets the value of the databaseType property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseTypeType }
     *     
     */
    public DatabaseTypeType getDatabaseType() {
        return databaseType;
    }

    /**
     * Sets the value of the databaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseTypeType }
     *     
     */
    public void setDatabaseType(DatabaseTypeType value) {
        this.databaseType = value;
    }

    /**
     * Gets the value of the databaseUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    /**
     * Sets the value of the databaseUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseUrl(String value) {
        this.databaseUrl = value;
    }

    /**
     * Gets the value of the ignoreNullComplexFields property.
     * 
     */
    public boolean isIgnoreNullComplexFields() {
        return ignoreNullComplexFields;
    }

    /**
     * Sets the value of the ignoreNullComplexFields property.
     * 
     */
    public void setIgnoreNullComplexFields(boolean value) {
        this.ignoreNullComplexFields = value;
    }

}
