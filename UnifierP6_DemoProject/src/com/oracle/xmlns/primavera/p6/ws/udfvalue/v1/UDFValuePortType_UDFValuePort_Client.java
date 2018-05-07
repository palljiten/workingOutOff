
package com.oracle.xmlns.primavera.p6.ws.udfvalue.v1;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2018-04-24T11:49:39.247+05:30
 * Generated source version: 3.1.11
 * 
 */
public final class UDFValuePortType_UDFValuePort_Client {

    private static final QName SERVICE_NAME = new QName("http://xmlns.oracle.com/Primavera/P6/WS/UDFValue/V1", "UDFValueService");

    private UDFValuePortType_UDFValuePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = UDFValueService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        UDFValueService ss = new UDFValueService(wsdlURL, SERVICE_NAME);
        UDFValuePortType port = ss.getUDFValuePort();  
        
        {
        System.out.println("Invoking getFieldLengthUDFValue...");
        java.lang.String _getFieldLengthUDFValue_field = "_getFieldLengthUDFValue_field1177181695";
        try {
            int _getFieldLengthUDFValue__return = port.getFieldLengthUDFValue(_getFieldLengthUDFValue_field);
            System.out.println("getFieldLengthUDFValue.result=" + _getFieldLengthUDFValue__return);

        } catch (IntegrationFault e) { 
            System.out.println("Expected exception: IntegrationFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking createUDFValues...");
        java.util.List<com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValue> _createUDFValues_udfValue = new java.util.ArrayList<com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValue>();
        com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValue _createUDFValues_udfValueVal1 = new com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValue();
        _createUDFValues_udfValueVal1.setCodeValue("CodeValue892079066");
        javax.xml.bind.JAXBElement<java.lang.Integer> _createUDFValues_udfValueVal1ConditionalIndicator = null;
        _createUDFValues_udfValueVal1.setConditionalIndicator(_createUDFValues_udfValueVal1ConditionalIndicator);
        javax.xml.bind.JAXBElement<java.lang.Double> _createUDFValues_udfValueVal1Cost = null;
        _createUDFValues_udfValueVal1.setCost(_createUDFValues_udfValueVal1Cost);
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _createUDFValues_udfValueVal1CreateDate = null;
        _createUDFValues_udfValueVal1.setCreateDate(_createUDFValues_udfValueVal1CreateDate);
        _createUDFValues_udfValueVal1.setCreateUser("CreateUser1187962257");
        _createUDFValues_udfValueVal1.setDescription("Description1310198785");
        javax.xml.bind.JAXBElement<java.lang.Double> _createUDFValues_udfValueVal1Double = null;
        _createUDFValues_udfValueVal1.setDouble(_createUDFValues_udfValueVal1Double);
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _createUDFValues_udfValueVal1FinishDate = null;
        _createUDFValues_udfValueVal1.setFinishDate(_createUDFValues_udfValueVal1FinishDate);
        _createUDFValues_udfValueVal1.setForeignObjectId(Integer.valueOf(2116439661));
        _createUDFValues_udfValueVal1.setIndicator("Indicator-1257707934");
        javax.xml.bind.JAXBElement<java.lang.Integer> _createUDFValues_udfValueVal1Integer = null;
        _createUDFValues_udfValueVal1.setInteger(_createUDFValues_udfValueVal1Integer);
        javax.xml.bind.JAXBElement<java.lang.Boolean> _createUDFValues_udfValueVal1IsBaseline = null;
        _createUDFValues_udfValueVal1.setIsBaseline(_createUDFValues_udfValueVal1IsBaseline);
        _createUDFValues_udfValueVal1.setIsTemplate(Boolean.valueOf(false));
        javax.xml.bind.JAXBElement<java.lang.Boolean> _createUDFValues_udfValueVal1IsUDFTypeCalculated = null;
        _createUDFValues_udfValueVal1.setIsUDFTypeCalculated(_createUDFValues_udfValueVal1IsUDFTypeCalculated);
        javax.xml.bind.JAXBElement<java.lang.Boolean> _createUDFValues_udfValueVal1IsUDFTypeConditional = null;
        _createUDFValues_udfValueVal1.setIsUDFTypeConditional(_createUDFValues_udfValueVal1IsUDFTypeConditional);
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _createUDFValues_udfValueVal1LastUpdateDate = null;
        _createUDFValues_udfValueVal1.setLastUpdateDate(_createUDFValues_udfValueVal1LastUpdateDate);
        _createUDFValues_udfValueVal1.setLastUpdateUser("LastUpdateUser-1823676802");
        javax.xml.bind.JAXBElement<java.lang.Integer> _createUDFValues_udfValueVal1ProjectObjectId = null;
        _createUDFValues_udfValueVal1.setProjectObjectId(_createUDFValues_udfValueVal1ProjectObjectId);
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _createUDFValues_udfValueVal1StartDate = null;
        _createUDFValues_udfValueVal1.setStartDate(_createUDFValues_udfValueVal1StartDate);
        _createUDFValues_udfValueVal1.setText("Text-812739045");
        javax.xml.bind.JAXBElement<java.lang.Integer> _createUDFValues_udfValueVal1UDFCodeObjectId = null;
        _createUDFValues_udfValueVal1.setUDFCodeObjectId(_createUDFValues_udfValueVal1UDFCodeObjectId);
        _createUDFValues_udfValueVal1.setUDFTypeDataType("UDFTypeDataType120687078");
        _createUDFValues_udfValueVal1.setUDFTypeObjectId(Integer.valueOf(678972438));
        _createUDFValues_udfValueVal1.setUDFTypeSubjectArea("UDFTypeSubjectArea1392106382");
        _createUDFValues_udfValueVal1.setUDFTypeTitle("UDFTypeTitle2068919292");
        _createUDFValues_udfValue.add(_createUDFValues_udfValueVal1);
        try {
            java.util.List<com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.CreateUDFValuesResponse.ObjectId> _createUDFValues__return = port.createUDFValues(_createUDFValues_udfValue);
            System.out.println("createUDFValues.result=" + _createUDFValues__return);

        } catch (IntegrationFault e) { 
            System.out.println("Expected exception: IntegrationFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking readUDFValues...");
        java.util.List<com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValueFieldType> _readUDFValues_field = new java.util.ArrayList<com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValueFieldType>();
        com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValueFieldType _readUDFValues_fieldVal1 = com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValueFieldType.FINISH_DATE;
        _readUDFValues_field.add(_readUDFValues_fieldVal1);
        java.lang.String _readUDFValues_filter = "_readUDFValues_filter-2084058785";
        java.lang.String _readUDFValues_orderBy = "_readUDFValues_orderBy-995651402";
        try {
            java.util.List<com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValue> _readUDFValues__return = port.readUDFValues(_readUDFValues_field, _readUDFValues_filter, _readUDFValues_orderBy);
            System.out.println("readUDFValues.result=" + _readUDFValues__return);

        } catch (IntegrationFault e) { 
            System.out.println("Expected exception: IntegrationFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deleteUDFValues...");
        java.util.List<com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.DeleteUDFValues.ObjectId> _deleteUDFValues_objectId = new java.util.ArrayList<com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.DeleteUDFValues.ObjectId>();
        com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.DeleteUDFValues.ObjectId _deleteUDFValues_objectIdVal1 = new com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.DeleteUDFValues.ObjectId();
        _deleteUDFValues_objectIdVal1.setUDFTypeObjectId(-1388077022);
        _deleteUDFValues_objectIdVal1.setForeignObjectId(839849852);
        _deleteUDFValues_objectId.add(_deleteUDFValues_objectIdVal1);
        try {
            boolean _deleteUDFValues__return = port.deleteUDFValues(_deleteUDFValues_objectId);
            System.out.println("deleteUDFValues.result=" + _deleteUDFValues__return);

        } catch (IntegrationFault e) { 
            System.out.println("Expected exception: IntegrationFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking readCalculatedUDFValues...");
        java.util.List<com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.CalculatedUDFValueFieldType> _readCalculatedUDFValues_field = new java.util.ArrayList<com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.CalculatedUDFValueFieldType>();
        com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.CalculatedUDFValueFieldType _readCalculatedUDFValues_fieldVal1 = com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.CalculatedUDFValueFieldType.CONDITIONAL_INDICATOR;
        _readCalculatedUDFValues_field.add(_readCalculatedUDFValues_fieldVal1);
        java.util.List<java.lang.Integer> _readCalculatedUDFValues_udfTypeObjectId = new java.util.ArrayList<java.lang.Integer>();
        java.lang.Integer _readCalculatedUDFValues_udfTypeObjectIdVal1 = Integer.valueOf(803655276);
        _readCalculatedUDFValues_udfTypeObjectId.add(_readCalculatedUDFValues_udfTypeObjectIdVal1);
        java.util.List<java.lang.Integer> _readCalculatedUDFValues_projectObjectId = new java.util.ArrayList<java.lang.Integer>();
        java.lang.Integer _readCalculatedUDFValues_projectObjectIdVal1 = Integer.valueOf(90010299);
        _readCalculatedUDFValues_projectObjectId.add(_readCalculatedUDFValues_projectObjectIdVal1);
        try {
            java.util.List<com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.ReadCalculatedUDFValuesResponse.CalculatedUDFValue> _readCalculatedUDFValues__return = port.readCalculatedUDFValues(_readCalculatedUDFValues_field, _readCalculatedUDFValues_udfTypeObjectId, _readCalculatedUDFValues_projectObjectId);
            System.out.println("readCalculatedUDFValues.result=" + _readCalculatedUDFValues__return);

        } catch (IntegrationFault e) { 
            System.out.println("Expected exception: IntegrationFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking updateUDFValues...");
        java.util.List<com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValue> _updateUDFValues_udfValue = new java.util.ArrayList<com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValue>();
        com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValue _updateUDFValues_udfValueVal1 = new com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValue();
        _updateUDFValues_udfValueVal1.setCodeValue("CodeValue1660478470");
        javax.xml.bind.JAXBElement<java.lang.Integer> _updateUDFValues_udfValueVal1ConditionalIndicator = null;
        _updateUDFValues_udfValueVal1.setConditionalIndicator(_updateUDFValues_udfValueVal1ConditionalIndicator);
        javax.xml.bind.JAXBElement<java.lang.Double> _updateUDFValues_udfValueVal1Cost = null;
        _updateUDFValues_udfValueVal1.setCost(_updateUDFValues_udfValueVal1Cost);
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _updateUDFValues_udfValueVal1CreateDate = null;
        _updateUDFValues_udfValueVal1.setCreateDate(_updateUDFValues_udfValueVal1CreateDate);
        _updateUDFValues_udfValueVal1.setCreateUser("CreateUser-733143117");
        _updateUDFValues_udfValueVal1.setDescription("Description-2078057839");
        javax.xml.bind.JAXBElement<java.lang.Double> _updateUDFValues_udfValueVal1Double = null;
        _updateUDFValues_udfValueVal1.setDouble(_updateUDFValues_udfValueVal1Double);
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _updateUDFValues_udfValueVal1FinishDate = null;
        _updateUDFValues_udfValueVal1.setFinishDate(_updateUDFValues_udfValueVal1FinishDate);
        _updateUDFValues_udfValueVal1.setForeignObjectId(Integer.valueOf(-1769863618));
        _updateUDFValues_udfValueVal1.setIndicator("Indicator-83536766");
        javax.xml.bind.JAXBElement<java.lang.Integer> _updateUDFValues_udfValueVal1Integer = null;
        _updateUDFValues_udfValueVal1.setInteger(_updateUDFValues_udfValueVal1Integer);
        javax.xml.bind.JAXBElement<java.lang.Boolean> _updateUDFValues_udfValueVal1IsBaseline = null;
        _updateUDFValues_udfValueVal1.setIsBaseline(_updateUDFValues_udfValueVal1IsBaseline);
        _updateUDFValues_udfValueVal1.setIsTemplate(Boolean.valueOf(false));
        javax.xml.bind.JAXBElement<java.lang.Boolean> _updateUDFValues_udfValueVal1IsUDFTypeCalculated = null;
        _updateUDFValues_udfValueVal1.setIsUDFTypeCalculated(_updateUDFValues_udfValueVal1IsUDFTypeCalculated);
        javax.xml.bind.JAXBElement<java.lang.Boolean> _updateUDFValues_udfValueVal1IsUDFTypeConditional = null;
        _updateUDFValues_udfValueVal1.setIsUDFTypeConditional(_updateUDFValues_udfValueVal1IsUDFTypeConditional);
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _updateUDFValues_udfValueVal1LastUpdateDate = null;
        _updateUDFValues_udfValueVal1.setLastUpdateDate(_updateUDFValues_udfValueVal1LastUpdateDate);
        _updateUDFValues_udfValueVal1.setLastUpdateUser("LastUpdateUser-1754564802");
        javax.xml.bind.JAXBElement<java.lang.Integer> _updateUDFValues_udfValueVal1ProjectObjectId = null;
        _updateUDFValues_udfValueVal1.setProjectObjectId(_updateUDFValues_udfValueVal1ProjectObjectId);
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _updateUDFValues_udfValueVal1StartDate = null;
        _updateUDFValues_udfValueVal1.setStartDate(_updateUDFValues_udfValueVal1StartDate);
        _updateUDFValues_udfValueVal1.setText("Text-1308260128");
        javax.xml.bind.JAXBElement<java.lang.Integer> _updateUDFValues_udfValueVal1UDFCodeObjectId = null;
        _updateUDFValues_udfValueVal1.setUDFCodeObjectId(_updateUDFValues_udfValueVal1UDFCodeObjectId);
        _updateUDFValues_udfValueVal1.setUDFTypeDataType("UDFTypeDataType1398534744");
        _updateUDFValues_udfValueVal1.setUDFTypeObjectId(Integer.valueOf(1357686653));
        _updateUDFValues_udfValueVal1.setUDFTypeSubjectArea("UDFTypeSubjectArea1063913922");
        _updateUDFValues_udfValueVal1.setUDFTypeTitle("UDFTypeTitle-1192414899");
        _updateUDFValues_udfValue.add(_updateUDFValues_udfValueVal1);
        try {
            boolean _updateUDFValues__return = port.updateUDFValues(_updateUDFValues_udfValue);
            System.out.println("updateUDFValues.result=" + _updateUDFValues__return);

        } catch (IntegrationFault e) { 
            System.out.println("Expected exception: IntegrationFault has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
