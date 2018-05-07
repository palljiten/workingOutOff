
package com.oracle.xmlns.primavera.p6.ws.integrationfaulttype.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.primavera.p6.ws.integrationfaulttype.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IntegrationFault_QNAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/IntegrationFaultType/V1", "IntegrationFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.primavera.p6.ws.integrationfaulttype.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IntegrationFaultType }
     * 
     */
    public IntegrationFaultType createIntegrationFaultType() {
        return new IntegrationFaultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrationFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Primavera/P6/WS/IntegrationFaultType/V1", name = "IntegrationFault")
    public JAXBElement<IntegrationFaultType> createIntegrationFault(IntegrationFaultType value) {
        return new JAXBElement<IntegrationFaultType>(_IntegrationFault_QNAME, IntegrationFaultType.class, null, value);
    }

}
