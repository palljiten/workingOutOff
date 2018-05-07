package service;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import javax.xml.ws.BindingProvider;

import com.oracle.xmlns.primavera.p6.ws.udftype.v1.UDFType;
import com.oracle.xmlns.primavera.p6.ws.udftype.v1.UDFTypeFieldType;
import com.oracle.xmlns.primavera.p6.ws.udftype.v1.UDFTypePortType;

import configuration.P6WSConfiguration;





public class UDFTypeServices extends  P6WSConfiguration{

	static Logger logger = Logger.getLogger("GLOBAL");
	AuthenService authService;
	
	public AuthenService getAuthService() {
		return authService;
	}

	public void setAuthService(AuthenService authService) {
		this.authService = authService;
	}
	
	private UDFTypePortType createUDFVTypeServicePort() throws Exception 
	{
		String url = authService.makeHttpURLString(UDFTypeService);
		URL wsdlURL = new URL(url);
		com.oracle.xmlns.primavera.p6.ws.udftype.v1.UDFTypeService service= new com.oracle.xmlns.primavera.p6.ws.udftype.v1.UDFTypeService(wsdlURL);
		UDFTypePortType servicePort;

		servicePort = service.getUDFTypePort();

		authService.setCookieOrUserTokenData((BindingProvider) servicePort);

		return servicePort;
	}
	
	 public List<UDFType> readUDFType(String subjectArea ) throws Exception 
	 {
		UDFTypePortType servicePort = createUDFVTypeServicePort();
		//System.out.println("-------------------------------------- 16 ----------------------------------------------------------- READ UDFs");
		
		List<UDFTypeFieldType> fields = new ArrayList<UDFTypeFieldType>();
		fields.add(UDFTypeFieldType.DATA_TYPE);
		fields.add(UDFTypeFieldType.OBJECT_ID);
		fields.add(UDFTypeFieldType.TITLE);
		fields.add(UDFTypeFieldType.SUBJECT_AREA);
		
		
		
		String UDFValues= UDFTypeName.getUDFValueList();
		
		//System.out.println("==============" + UDFValues);
		List<UDFType> UDFTypeList = servicePort.readUDFTypes(fields, "Title in ( "+UDFValues+" ) and SubjectArea='"+subjectArea+"'", "Title");

		if ((UDFTypeList == null) || (UDFTypeList.size() == 0)) 
		{
			logger.info("--------Project node is not available--------------------");
			//System.out.println("Project node is not available");

			return null;
		} 
		else 
		{
			//System.out.println("==============" + UDFTypeList.size());
		
	/*	for (UDFType udfType : UDFTypeList) {
			//	if (udfValue.getUDFTypeTitle().equals("Floor"))
				System.out.println("Project UDF Type -------------" +udfType.getDataType() + "=" 
							+udfType.getObjectId() + "=" + udfType.getTitle() + "="
							+ udfType.getSubjectArea() + " exists.");
					
				
					//existUDFTypes.put( udfType.getTitle(), udfType.getObjectId() );
			}*/

			return UDFTypeList;
		}
	}
	 
	 
	List<UDFType> readUDFTYpes_T(String subjectArea , String udfType) throws Exception
	{
		udfType="'"+udfType+"'";
		UDFTypePortType servicePort = createUDFVTypeServicePort();
		
		List<UDFTypeFieldType> fields = new ArrayList<UDFTypeFieldType>();
		fields.add(UDFTypeFieldType.DATA_TYPE);
		fields.add(UDFTypeFieldType.OBJECT_ID);
		fields.add(UDFTypeFieldType.TITLE);
		fields.add(UDFTypeFieldType.SUBJECT_AREA);
		
		List<UDFType> UDftype=servicePort.readUDFTypes(fields, "Title in ( "+udfType+" ) and SubjectArea='"+subjectArea+"'", "Title") ;
		return UDftype;
	}

	List<UDFType> readUDFTYpes_T(String subjectArea , Set<String> udfType) throws Exception
	{
		//String udfTypeList="'"+udfType+"'";
		String udfTypeList="";
		
		int i=0;
		for (String projectId : udfType)
		{
			udfTypeList += "'" + projectId + "'";
			if (i < udfType.size() - 1) 
			{
				udfTypeList += ",";
			}
			i++;
		}
		
		UDFTypePortType servicePort = createUDFVTypeServicePort();
		
		List<UDFTypeFieldType> fields = new ArrayList<UDFTypeFieldType>();
		fields.add(UDFTypeFieldType.DATA_TYPE);
		fields.add(UDFTypeFieldType.OBJECT_ID);
		fields.add(UDFTypeFieldType.TITLE);
		fields.add(UDFTypeFieldType.SUBJECT_AREA);
		
		List<UDFType> UDftype=servicePort.readUDFTypes(fields, "Title in ( "+udfTypeList+" ) and SubjectArea='"+subjectArea+"'", "Title") ;
		return UDftype;
	}
	
	
}
