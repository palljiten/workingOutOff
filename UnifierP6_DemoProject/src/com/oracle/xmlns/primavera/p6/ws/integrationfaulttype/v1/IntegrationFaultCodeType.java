
package com.oracle.xmlns.primavera.p6.ws.integrationfaulttype.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntegrationFaultCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntegrationFaultCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="General"/&gt;
 *     &lt;enumeration value="Presentation"/&gt;
 *     &lt;enumeration value="Network"/&gt;
 *     &lt;enumeration value="Server"/&gt;
 *     &lt;enumeration value="Business Rules"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntegrationFaultCodeType")
@XmlEnum
public enum IntegrationFaultCodeType {

    @XmlEnumValue("General")
    GENERAL("General"),
    @XmlEnumValue("Presentation")
    PRESENTATION("Presentation"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("Server")
    SERVER("Server"),
    @XmlEnumValue("Business Rules")
    BUSINESS_RULES("Business Rules");
    private final String value;

    IntegrationFaultCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntegrationFaultCodeType fromValue(String v) {
        for (IntegrationFaultCodeType c: IntegrationFaultCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
