
package com.oracle.xmlns.primavera.p6.ws.udftype.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateUDFTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateUDFTypes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UDFType" type="{http://xmlns.oracle.com/Primavera/P6/WS/UDFType/V1}UDFType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateUDFTypes", propOrder = {
    "udfType"
})
public class CreateUDFTypes {

    @XmlElement(name = "UDFType", required = true)
    protected List<UDFType> udfType;

    /**
     * Gets the value of the udfType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udfType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDFType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDFType }
     * 
     * 
     */
    public List<UDFType> getUDFType() {
        if (udfType == null) {
            udfType = new ArrayList<UDFType>();
        }
        return this.udfType;
    }

}
