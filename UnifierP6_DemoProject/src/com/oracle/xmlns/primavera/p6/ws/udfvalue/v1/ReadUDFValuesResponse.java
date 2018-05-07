
package com.oracle.xmlns.primavera.p6.ws.udfvalue.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadUDFValuesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadUDFValuesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UDFValue" type="{http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1}UDFValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadUDFValuesResponse", propOrder = {
    "udfValue"
})
public class ReadUDFValuesResponse {

    @XmlElement(name = "UDFValue")
    protected List<UDFValue> udfValue;

    /**
     * Gets the value of the udfValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udfValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDFValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDFValue }
     * 
     * 
     */
    public List<UDFValue> getUDFValue() {
        if (udfValue == null) {
            udfValue = new ArrayList<UDFValue>();
        }
        return this.udfValue;
    }

}
