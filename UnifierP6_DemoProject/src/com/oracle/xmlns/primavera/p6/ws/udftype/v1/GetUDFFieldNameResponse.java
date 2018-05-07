
package com.oracle.xmlns.primavera.p6.ws.udftype.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUDFFieldNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUDFFieldNameResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UDFFieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUDFFieldNameResponse", propOrder = {
    "udfFieldName"
})
public class GetUDFFieldNameResponse {

    @XmlElement(name = "UDFFieldName", required = true)
    protected String udfFieldName;

    /**
     * Gets the value of the udfFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDFFieldName() {
        return udfFieldName;
    }

    /**
     * Sets the value of the udfFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDFFieldName(String value) {
        this.udfFieldName = value;
    }

}
