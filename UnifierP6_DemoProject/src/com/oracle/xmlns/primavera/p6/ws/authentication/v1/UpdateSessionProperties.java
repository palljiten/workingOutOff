
package com.oracle.xmlns.primavera.p6.ws.authentication.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="IgnoreNullComplexFields" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "ignoreNullComplexFields"
})
@XmlRootElement(name = "UpdateSessionProperties")
public class UpdateSessionProperties {

    @XmlElement(name = "IgnoreNullComplexFields")
    protected Boolean ignoreNullComplexFields;

    /**
     * Gets the value of the ignoreNullComplexFields property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreNullComplexFields() {
        return ignoreNullComplexFields;
    }

    /**
     * Sets the value of the ignoreNullComplexFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreNullComplexFields(Boolean value) {
        this.ignoreNullComplexFields = value;
    }

}
