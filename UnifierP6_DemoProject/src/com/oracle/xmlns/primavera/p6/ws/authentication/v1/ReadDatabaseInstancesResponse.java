
package com.oracle.xmlns.primavera.p6.ws.authentication.v1;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="DatabaseInstance" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DatabaseInstanceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="DatabaseEncoding" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DatabaseName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DatabaseType" type="{http://xmlns.oracle.com/Primavera/P6/WS/Authentication/V1}DatabaseTypeType"/&gt;
 *                   &lt;element name="DatabaseUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "", propOrder = {
    "databaseInstance"
})
@XmlRootElement(name = "ReadDatabaseInstancesResponse")
public class ReadDatabaseInstancesResponse {

    @XmlElement(name = "DatabaseInstance", required = true)
    protected List<ReadDatabaseInstancesResponse.DatabaseInstance> databaseInstance;

    /**
     * Gets the value of the databaseInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the databaseInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatabaseInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReadDatabaseInstancesResponse.DatabaseInstance }
     * 
     * 
     */
    public List<ReadDatabaseInstancesResponse.DatabaseInstance> getDatabaseInstance() {
        if (databaseInstance == null) {
            databaseInstance = new ArrayList<ReadDatabaseInstancesResponse.DatabaseInstance>();
        }
        return this.databaseInstance;
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
     *         &lt;element name="DatabaseInstanceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="DatabaseEncoding" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DatabaseName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DatabaseType" type="{http://xmlns.oracle.com/Primavera/P6/WS/Authentication/V1}DatabaseTypeType"/&gt;
     *         &lt;element name="DatabaseUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "databaseInstanceId",
        "databaseEncoding",
        "databaseName",
        "databaseType",
        "databaseUrl"
    })
    public static class DatabaseInstance {

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

    }

}
