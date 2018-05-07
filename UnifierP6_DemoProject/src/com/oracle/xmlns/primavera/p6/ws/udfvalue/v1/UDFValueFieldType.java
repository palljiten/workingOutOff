
package com.oracle.xmlns.primavera.p6.ws.udfvalue.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UDFValueFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UDFValueFieldType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CodeValue"/&gt;
 *     &lt;enumeration value="ConditionalIndicator"/&gt;
 *     &lt;enumeration value="Cost"/&gt;
 *     &lt;enumeration value="CreateDate"/&gt;
 *     &lt;enumeration value="CreateUser"/&gt;
 *     &lt;enumeration value="Description"/&gt;
 *     &lt;enumeration value="Double"/&gt;
 *     &lt;enumeration value="FinishDate"/&gt;
 *     &lt;enumeration value="ForeignObjectId"/&gt;
 *     &lt;enumeration value="Indicator"/&gt;
 *     &lt;enumeration value="Integer"/&gt;
 *     &lt;enumeration value="IsBaseline"/&gt;
 *     &lt;enumeration value="IsTemplate"/&gt;
 *     &lt;enumeration value="IsUDFTypeCalculated"/&gt;
 *     &lt;enumeration value="IsUDFTypeConditional"/&gt;
 *     &lt;enumeration value="LastUpdateDate"/&gt;
 *     &lt;enumeration value="LastUpdateUser"/&gt;
 *     &lt;enumeration value="ProjectObjectId"/&gt;
 *     &lt;enumeration value="StartDate"/&gt;
 *     &lt;enumeration value="Text"/&gt;
 *     &lt;enumeration value="UDFCodeObjectId"/&gt;
 *     &lt;enumeration value="UDFTypeDataType"/&gt;
 *     &lt;enumeration value="UDFTypeObjectId"/&gt;
 *     &lt;enumeration value="UDFTypeSubjectArea"/&gt;
 *     &lt;enumeration value="UDFTypeTitle"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UDFValueFieldType")
@XmlEnum
public enum UDFValueFieldType {

    @XmlEnumValue("CodeValue")
    CODE_VALUE("CodeValue"),
    @XmlEnumValue("ConditionalIndicator")
    CONDITIONAL_INDICATOR("ConditionalIndicator"),
    @XmlEnumValue("Cost")
    COST("Cost"),
    @XmlEnumValue("CreateDate")
    CREATE_DATE("CreateDate"),
    @XmlEnumValue("CreateUser")
    CREATE_USER("CreateUser"),
    @XmlEnumValue("Description")
    DESCRIPTION("Description"),
    @XmlEnumValue("Double")
    DOUBLE("Double"),
    @XmlEnumValue("FinishDate")
    FINISH_DATE("FinishDate"),
    @XmlEnumValue("ForeignObjectId")
    FOREIGN_OBJECT_ID("ForeignObjectId"),
    @XmlEnumValue("Indicator")
    INDICATOR("Indicator"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("IsBaseline")
    IS_BASELINE("IsBaseline"),
    @XmlEnumValue("IsTemplate")
    IS_TEMPLATE("IsTemplate"),
    @XmlEnumValue("IsUDFTypeCalculated")
    IS_UDF_TYPE_CALCULATED("IsUDFTypeCalculated"),
    @XmlEnumValue("IsUDFTypeConditional")
    IS_UDF_TYPE_CONDITIONAL("IsUDFTypeConditional"),
    @XmlEnumValue("LastUpdateDate")
    LAST_UPDATE_DATE("LastUpdateDate"),
    @XmlEnumValue("LastUpdateUser")
    LAST_UPDATE_USER("LastUpdateUser"),
    @XmlEnumValue("ProjectObjectId")
    PROJECT_OBJECT_ID("ProjectObjectId"),
    @XmlEnumValue("StartDate")
    START_DATE("StartDate"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("UDFCodeObjectId")
    UDF_CODE_OBJECT_ID("UDFCodeObjectId"),
    @XmlEnumValue("UDFTypeDataType")
    UDF_TYPE_DATA_TYPE("UDFTypeDataType"),
    @XmlEnumValue("UDFTypeObjectId")
    UDF_TYPE_OBJECT_ID("UDFTypeObjectId"),
    @XmlEnumValue("UDFTypeSubjectArea")
    UDF_TYPE_SUBJECT_AREA("UDFTypeSubjectArea"),
    @XmlEnumValue("UDFTypeTitle")
    UDF_TYPE_TITLE("UDFTypeTitle");
    private final String value;

    UDFValueFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UDFValueFieldType fromValue(String v) {
        for (UDFValueFieldType c: UDFValueFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
