
package com.oracle.xmlns.primavera.p6.ws.authentication.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatabaseTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DatabaseTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Oracle"/&gt;
 *     &lt;enumeration value="SQL Server"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DatabaseTypeType")
@XmlEnum
public enum DatabaseTypeType {

    @XmlEnumValue("Oracle")
    ORACLE("Oracle"),
    @XmlEnumValue("SQL Server")
    SQL_SERVER("SQL Server");
    private final String value;

    DatabaseTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DatabaseTypeType fromValue(String v) {
        for (DatabaseTypeType c: DatabaseTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
