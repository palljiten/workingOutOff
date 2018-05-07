
package com.oracle.xmlns.primavera.p6.ws.udfvalue.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculatedUDFValueFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalculatedUDFValueFieldType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ConditionalIndicator"/&gt;
 *     &lt;enumeration value="Cost"/&gt;
 *     &lt;enumeration value="Double"/&gt;
 *     &lt;enumeration value="FinishDate"/&gt;
 *     &lt;enumeration value="Integer"/&gt;
 *     &lt;enumeration value="ProjectObjectId"/&gt;
 *     &lt;enumeration value="StartDate"/&gt;
 *     &lt;enumeration value="UDFTypeDataType"/&gt;
 *     &lt;enumeration value="UDFTypeObjectId"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalculatedUDFValueFieldType")
@XmlEnum
public enum CalculatedUDFValueFieldType {

    @XmlEnumValue("ConditionalIndicator")
    CONDITIONAL_INDICATOR("ConditionalIndicator"),
    @XmlEnumValue("Cost")
    COST("Cost"),
    @XmlEnumValue("Double")
    DOUBLE("Double"),
    @XmlEnumValue("FinishDate")
    FINISH_DATE("FinishDate"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("ProjectObjectId")
    PROJECT_OBJECT_ID("ProjectObjectId"),
    @XmlEnumValue("StartDate")
    START_DATE("StartDate"),
    @XmlEnumValue("UDFTypeDataType")
    UDF_TYPE_DATA_TYPE("UDFTypeDataType"),
    @XmlEnumValue("UDFTypeObjectId")
    UDF_TYPE_OBJECT_ID("UDFTypeObjectId");
    private final String value;

    CalculatedUDFValueFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalculatedUDFValueFieldType fromValue(String v) {
        for (CalculatedUDFValueFieldType c: CalculatedUDFValueFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
