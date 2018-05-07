
package com.oracle.xmlns.primavera.p6.ws.udfvalue.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteUDFValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteUDFValues"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectId" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UDFTypeObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="ForeignObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "DeleteUDFValues", propOrder = {
    "objectId"
})
public class DeleteUDFValues {

    @XmlElement(name = "ObjectId", required = true)
    protected List<DeleteUDFValues.ObjectId> objectId;

    /**
     * Gets the value of the objectId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeleteUDFValues.ObjectId }
     * 
     * 
     */
    public List<DeleteUDFValues.ObjectId> getObjectId() {
        if (objectId == null) {
            objectId = new ArrayList<DeleteUDFValues.ObjectId>();
        }
        return this.objectId;
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
     *         &lt;element name="UDFTypeObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="ForeignObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
        "udfTypeObjectId",
        "foreignObjectId"
    })
    public static class ObjectId {

        @XmlElement(name = "UDFTypeObjectId")
        protected int udfTypeObjectId;
        @XmlElement(name = "ForeignObjectId")
        protected int foreignObjectId;

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

        /**
         * Gets the value of the foreignObjectId property.
         * 
         */
        public int getForeignObjectId() {
            return foreignObjectId;
        }

        /**
         * Sets the value of the foreignObjectId property.
         * 
         */
        public void setForeignObjectId(int value) {
            this.foreignObjectId = value;
        }

    }

}
