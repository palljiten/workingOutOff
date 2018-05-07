package service;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Logger;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;


import com.oracle.xmlns.primavera.p6.ws.udftype.v1.UDFType;
import com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.CreateUDFValuesResponse.ObjectId;
import com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.ObjectFactory;
import com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValue;
import com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValueFieldType;
import com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValuePortType;
import com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValueService;

import configuration.P6WSConfiguration;
import model.ProjectNode;
import model.UnifierCostCodeFactor;


public class UDFValueServices extends  P6WSConfiguration{
	static Logger logger = Logger.getLogger("GLOBAL");
	AuthenService authService;
	
	
	 
	public AuthenService getAuthService() {
		return authService;
	}

	public void setAuthService(AuthenService authService) {
		this.authService = authService;
	}

	
	
	public UDFValuePortType createUDFValueServicePort() throws Exception 
	{
		
		String url = authService.makeHttpURLString(UDFValueService);
		
		URL wsdlURL = new URL(url);
		UDFValueService service = new UDFValueService(wsdlURL);
		UDFValuePortType servicePort;

		servicePort = service.getUDFValuePort();

		authService.setCookieOrUserTokenData((BindingProvider) servicePort);

		return servicePort;
	}

}
