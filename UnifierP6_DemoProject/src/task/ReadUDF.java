package task;

import com.oracle.xmlns.primavera.p6.ws.udftype.v1.IntegrationFault;

/*import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;

import com.oracle.xmlns.primavera.p6.ws.udftype.v1.UDFType;
import com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValue;
import com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValueFieldType;
import com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValuePortType;
import com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValueService;

import model.ProjectNode;
import service.AuthenService;
import service.UDFTypeName;
import service.UDFTypeServices;
import service.UDFValueServices;*/

import service.AuthenService;
import service.UDFTypeServices;
import service.UDFValueServices;

import com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValue;
import com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValueFieldType;
import com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValuePortType;
import com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.UDFValueService;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;



public class ReadUDF 
{

	UDFTypeServices udfTypeService = new UDFTypeServices();

	static UDFValueServices udfValueService = new UDFValueServices();
	
	static AuthenService authService = new AuthenService();
    
	public static void main(String[] s)
	{

		/*udfValueService.setAuthService(authService);
		readUDF();*/
		
		try 
		{
			ReadUDF();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*public static void readUDF()
	{
		
			try
			{
				if (authService.authenticationP6()) 
				{
					System.out.println("Logged in successfully.");
				} 
				else 
				{
					
					return;
				}
			}
			catch(Exception e)
			{
				System.out.println("Authentication Failed");
				return ;
			}
			 
			
		
		
		Map<Integer,List<UDFValue>> existUDFTypeList=null;
		
		String projectObjectId="'44984','35415','53564','57204','57203','57202','57201','57200','57198','57199','57017','57016','57015','56994','57689','53614','57335','57679','57399','54117','57682','35315','35265','35215','35165','57695','57853','54221','6712','35065','9212','43475','56974','56973','56972','43425','56971','52875','56476','9714','34965','52825','52775','56934','34914','54118','53915','57077','56579','54169','54170','55235','53714','53306','53256','57499','52372','57575','29921','57744','29971','57920','30121','30122','30172','30222','30372','30572','30622','29821','30672','30722','57276','52725','52675','52625','8162','812','30772','29871','57551','3662','30872','7612','7812','5462','5412','5362','5312','5262','7662','30922','30972','31022','31072','44132','8062','4862','4962','5862','5912','5812','53965','3812','54015','57969','31122','56275','56526','56425','31222','56933','54627','1162','31272','52422','53357','56952','31422','3862','53155','3762','7912','7512','53864','7862','7462','34814','52525','54171','54119','57970','5012','34764','34714','34614','34564','53814','57274','57553','34514','9162','1012','34464','5112','34414','34364','34263','34213','3712','4162','8862','3612','6312','4412','57971','33863','8762','33613','6112','3912','5612','6662','54322','53205','33362','9614','33311','22071','22121','33205','4062','7162','912','5212','52121','52221','52321','52171','52071','52271','5162','57931','22221','7712','4112','22271','22321','57550','1062','4012','6362','48896','6562','6912','45238','6162','52472','57678','762','45036','22421','22471','45086','45939','22821','23021','8612','23121','23221','23321','23571','23771','57394','23871','57395','56582','57396','24171','44031','24821','24871','33155','3462','3512','53103','6612','56689','35465','33105','6512','6462','9112','8712','36215','6262','5562','7312','4212','9062','6412','57449','36315','5662','57035','36715','56951','6212','3562','6062','7562','55757','36815','36865','4912','53411','5062','53764','57211','7762','57576','54067','36915','7412','6762','862','962','37015','6812','37115','37265','37315','37365','37415','22021','52016','38215','7012','54727','32905','21170','20970','57628','8962','18970','56932','1112','6862','10567','10467','56909','56847','12167','5962','7362','8662','6012','8212','8112','52932','52983','4362','14567','7212','16119','16269','16469','57743','7962','16719','53408','5712','4312','54577','17019','17369','55507','52067','17569','7262','17819','8812','3962','5762','4462'";
		String projectObjectId1="'712','4262','17869','8912','56007','9262','17969','9312','55557','55407','18119','55607','18169','55957','53033','18419','18469','7112','56584','18569','18869','18919','49701','49702','53409','53410','56576','56587','56588','56908','57390','57391','57854','57855','57856','57857','57915','57916','57917','57918','57954','57955','57956','57957','57958','57959'";
		
		
		//String projectObjectId="'57920','30121','30122','30172','30222','30372','30572','30622','29821','30672','30722','57276','52725','52675','52625','8162','812','30772','29871','57551','3662','30872','7612','7812','5462','5412','5362','5312','5262','7662','30922','30972','31022','31072','44132','8062','4862','4962','5862','5912','5812','53965','3812','54015','57969','31122','56275','56526','56425','31222','56933','54627','1162','31272','52422','53357','56952','31422','3862','53155','3762','7912','7512','53864','7862','7462','34814','52525','54171','54119','57970','5012','34764','34714','34614','34564','53814','57274','57553','34514','9162','1012','34464','5112','34414','34364','34263','34213','3712','4162','8862','3612','6312','4412','57971','33863','8762','33613','6112','3912','5612','6662','54322','53205','33362','9614','33311','22071','22121','33205','4062','7162','912','5212','52121','52221','52321','52171','52071','52271','5162','57931','22221','7712','4112','22271','22321','57550','1062','4012','6362','48896','6562','6912','45238','6162','52472','57678','762','45036','22421','22471','45086','45939','22821','23021','8612','23121','23221','23321','23571','23771','57394','23871','57395','56582','57396','24171','44031','24821','24871','33155','3462','3512','53103','6612','56689','35465','33105','6512','6462','9112','8712','36215','6262','5562','7312','4212','9062','6412','57449','36315','5662','57035','36715','56951','6212','3562','6062','7562','55757','36815','36865','4912','53411','5062','53764','57211','7762','57576','54067','36915','7412','6762','862','962','37015','6812','37115','37265','37315','37365','37415','22021','52016','38215','7012','54727','32905','21170','20970','57628','8962','18970','56932','1112','6862','10567','10467','56909','56847','12167','5962','7362','8662','6012','8212','8112','52932','52983','4362','14567','7212','16119','16269','16469','57743','7962','16719','53408','5712','4312','54577','17019','17369','55507','52067','17569','7262','17819','8812','3962','5762','4462','712','4262','17869','8912','56007','9262','17969','9312','55557','55407','18119','55607','18169','55957','53033','18419','18469','7112','56584','18569','18869','18919','49701','49702','53409','53410','56576','56587','56588','56908','57390','57391','57854','57855','57856','57857','57915','57916','57917','57918','57954','57955','57956','57957','57958','57959','57960','57961'";
		
		
		try
		{
			existUDFTypeList=readUDFValues(projectObjectId,projectObjectId1, "Project");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static Map<Integer,List<UDFValue>> readUDFValues(String projectObjIds,String projectObjIds1, String subjectArea) throws Exception 
	{
		
		Map<Integer,List<UDFValue>> existUDFValues = new TreeMap<Integer,List<UDFValue>>();
		
		UDFValuePortType servicePort = udfValueService.createUDFValueServicePort();
		//System.out.println("-------------------------------------- 17 ----------------------------------------------------------- Update  UDF VALUES ");
		List<UDFValueFieldType> fields = new ArrayList<UDFValueFieldType>();
		fields.add(UDFValueFieldType.CODE_VALUE);
		fields.add(UDFValueFieldType.PROJECT_OBJECT_ID);
		fields.add(UDFValueFieldType.TEXT);
		fields.add(UDFValueFieldType.FOREIGN_OBJECT_ID);
		fields.add(UDFValueFieldType.UDF_TYPE_SUBJECT_AREA);
		fields.add(UDFValueFieldType.UDF_TYPE_DATA_TYPE);
		fields.add(UDFValueFieldType.UDF_TYPE_OBJECT_ID);
		fields.add(UDFValueFieldType.UDF_TYPE_TITLE);
		fields.add(UDFValueFieldType.COST);
		fields.add(UDFValueFieldType.DOUBLE);
		
		String UDFValues= "";
		
		UDFValues+="'"+UnifierApprovedBudget+"',";
		UDFValues+="'"+UnifierCommitments+"',";
		UDFValues+="'"+UnifierSpends+"',";
		UDFValues+="'"+AnticipatedFinalCost+"'";
		
		String UDFValues= UDFTypeName.getUDFValueList();
		
		String UDFValues="";
		
		UDFValues+="'"+PMEstimatedCostUDFName+"',";
		UDFValues+="'"+PlaceHolderEstimatedCost+"'";
		
		//System.out.println("==============" + UDFValues);
		//String projectObjIds = "";

		int i = 0;
		// add sql "in" clause
		for (ProjectNode projectNode : projectNodes) 
		{
			projectObjIds += "'" + projectNode.getProjectObjectId() + "'";
			if (i < projectNodes.size() - 1) 
			{
				projectObjIds += ",";
			}
			i++;
		}

		System.out.println("projectObjIds ------------------------  " + projectObjIds);
		for (String str : projectObjIds.split(" ")){
			List<UDFValue> UDFValueList = servicePort.readUDFValues(fields, "UDFTypeTitle in ( "+UDFValues+" ) "
				+ " and ProjectObjectId in ( "+str +" ) and UDFTypeSubjectArea='"+subjectArea+"'",
				"UDFTypeTitle");
		}
		
		List<UDFValue> UDFValueList = servicePort.readUDFValues(fields, "UDFTypeTitle in ( "+UDFValues+" ) "
				+ " and ProjectObjectId in " + "('44984','35415','53564','57204','57203','57202','57201','57200','57198','57199','57017','57016','57015','56994','57689','53614','57335','57679','57399','54117','57682','35315','35265','35215','35165','57695','57853','54221','6712','35065','9212','43475','56974','56973','56972','43425','56971','52875','56476','9714','34965','52825','52775','56934','34914','54118','53915','57077','56579','54169','54170','55235','53714','53306','53256','57499','52372','57575','29921','57744','29971','57920','30121','30122','30172','30222','30372','30572','30622','29821','30672','30722','57276','52725','52675','52625','8162','812','30772','29871','57551','3662','30872','7612','7812','5462','5412','5362','5312','5262','7662','30922','30972','31022','31072','44132','8062','4862','4962','5862','5912','5812','53965','3812','54015','57969','31122','56275','56526','56425','31222','56933','54627','1162','31272','52422','53357','56952','31422','3862','53155','3762','7912','7512','53864','7862','7462','34814','52525','54171','54119','57970','5012','34764','34714','34614','34564','53814','57274','57553','34514','9162','1012','34464','5112','34414','34364','34263','34213','3712','4162','8862','3612','6312','4412','57971','33863','8762','33613','6112','3912','5612','6662','54322','53205','33362','9614','33311','22071','22121','33205','4062','7162','912','5212','52121','52221','52321','52171','52071','52271','5162','57931','22221','7712','4112','22271','22321','57550','1062','4012','6362','48896','6562','6912','45238','6162','52472','57678','762','45036','22421','22471','45086','45939','22821','23021','8612','23121','23221','23321','23571','23771','57394','23871','57395','56582','57396','24171','44031','24821','24871','33155','3462','3512','53103','6612','56689','35465','33105','6512','6462','9112','8712','36215','6262','5562','7312','4212','9062','6412','57449','36315','5662','57035','36715','56951','6212','3562','6062','7562','55757','36815','36865','4912','53411','5062','53764','57211','7762','57576','54067','36915','7412','6762','862','962','37015','6812','37115','37265','37315','37365','37415','22021','52016','38215','7012','54727','32905','21170','20970','57628','8962','18970','56932','1112','6862','10567','10467','56909','56847','12167','5962','7362','8662','6012','8212','8112','52932','52983','4362','14567','7212','16119','16269','16469','57743','7962','16719','53408','5712','4312','54577','17019','17369','55507','52067','17569','7262','17819','8812','3962','5762','4462','712','4262','17869','8912','56007','9262','17969','9312','55557','55407','18119','55607','18169','55957','53033','18419','18469','7112','56584','18569','18869','18919','49701','49702','53409','53410','56576','56587','56588','56908','57390','57391','57854','57855','57856','57857','57915','57916','57917','57918','57954','57955','57956','57957','57958','57959','57960','57961')"+" and UDFTypeSubjectArea='"+subjectArea+"'",
				"UDFTypeTitle");
		
		String filterContidion="fields,"+"UDFTypeTitle in"+ "( "+UDFValues+" ) "+" and ProjectObjectId in ( "+projectObjIds +" ) and UDFTypeSubjectArea='"+subjectArea+"',"+
				"UDFTypeTitle";
		
		
		System.out.println("filterCondition----------------------"+filterContidion);
		
		List<UDFValue> UDFValueList = servicePort.readUDFValues(fields, "UDFTypeTitle in ( "+UDFValues+")"
				+ " and ProjectObjectId in ( "+projectObjIds +" ) and UDFTypeSubjectArea='"+subjectArea+"'",
				"UDFTypeTitle");

		List<UDFValue> UDFValueList = servicePort.readUDFValues(fields, "UDFTypeTitle in ( "+UDFValues+")"
				+ " and (ProjectObjectId in ( "+ projectObjIds +") or ProjectObjectId in ( "+projectObjIds1 +" ))and UDFTypeSubjectArea='"+subjectArea+"'",
				"UDFTypeTitle");
		
		
		
		for(UDFValue udf : UDFValueList)
		{
			System.out.println("udf.getProjectObjectId()  --------  " + udf.getProjectObjectId());
		}
		if ((UDFValueList == null) || (UDFValueList.size() == 0)) 
		{
			
			System.out.println("UDFValueList is not available");
			return null;

		} else 
		{
			
			System.out.println("==============" + UDFValueList.size());
			
			List<UDFValue> udfList;
			for (UDFValue udfValue : UDFValueList) 
			{
			
				//if (udfValue.getUDFTypeTitle().equals("Building Campus"))
							System.out.println(subjectArea+" UDF Value-------------" +udfValue.getProjectObjectId().getValue() + "=" 
							+udfValue.getCodeValue() + "=" + udfValue.getText() + "="
							+ udfValue.getForeignObjectId() + "=" + udfValue.getUDFTypeSubjectArea() + "="
							+ udfValue.getUDFTypeDataType() + "="+ udfValue.getUDFTypeObjectId()  + "="+udfValue.getUDFCodeObjectId()+"="
							+ (udfValue.getDouble()==null ? "":udfValue.getDouble().getValue()) + "="
							+  (udfValue.getCost()==null ? "":udfValue.getCost().getValue()) + "="
							+ udfValue.getUDFTypeTitle() + " exists.");
					
				
					int projObjectId=udfValue.getProjectObjectId().getValue().intValue();
					System.out.println("projObjectId " + projObjectId);
					//System.out.println("Project Object ID :::: " + udfValue.getProjectObjectId().getValue());
			        udfList=existUDFValues.get(projObjectId);
							 
					if (udfList!=null)
					{
						udfList.add(udfValue);
					} 
					else 
					{
						udfList = new ArrayList<UDFValue>();
						udfList.add(udfValue);
						existUDFValues.put(projObjectId, udfList);
					}
					
			}
			
			for (Integer objid: existUDFValues.keySet()){
				List<UDFValue> udf = existUDFValues.get(objid);
				for (UDFValue udfv : UDFValueList){
					System.out.println("=======================================----"+udfv.getProjectObjectId().getValue()+"="+udfv.getText()+"="+udfv.getUDFTypeTitle() );
				}
				
			}

			return existUDFValues;
			//return UDFValueList;
		}
	}*/
	
	public static void ReadUDF() throws Exception
	{
		
		String projectID="'44984','35415','53564','57204','57203','57202','57201','57200','57198','57199','57017','57016','57015','56994','57689','53614','57335','57679','57399','54117','57682','35315','35265','35215','35165','57695','57853','54221','6712','35065','9212','43475','56974','56973','56972','43425','56971','52875','56476','9714','34965','52825','52775','56934','34914','54118','53915','57077','56579','54169','54170','55235','53714','53306','53256','57499','52372','57575','29921','57744','29971','57920','30121','30122','30172','30222','30372','30572','30622','29821','30672','30722','57276','52725','52675','52625','8162','812','30772','29871','57551','3662','30872','7612','7812','5462','5412','5362','5312','5262','7662','30922','30972','31022','31072','44132','8062','4862','4962','5862','5912','5812','53965','3812','54015','57969','31122','56275','56526','56425','31222','56933','54627','1162','31272','52422','53357','56952','31422','3862','53155','3762','7912','7512','53864','7862','7462','34814','52525','54171','54119','57970','5012','34764','34714','34614','34564','53814','57274','57553','34514','9162','1012','34464','5112','34414','34364','34263','34213','3712','4162','8862','3612','6312','4412','57971','33863','8762','33613','6112','3912','5612','6662','54322','53205','33362','9614','33311','22071','22121','33205','4062','7162','912','5212','52121','52221','52321','52171','52071','52271','5162','57931','22221','7712','4112','22271','22321','57550','1062','4012','6362','48896','6562','6912','45238','6162','52472','57678','762','45036','22421','22471','45086','45939','22821','23021','8612','23121','23221','23321','23571','23771','57394','23871','57395','56582','57396','24171','44031','24821','24871','33155','3462','3512','53103','6612','56689','35465','33105','6512','6462','9112','8712','36215','6262','5562','7312','4212','9062','6412','57449','36315','5662','57035','36715','56951','6212','3562','6062','7562','55757','36815','36865','4912','53411','5062','53764','57211','7762','57576','54067','36915','7412','6762','862','962','37015','6812','37115','37265','37315','37365','37415','22021','52016','38215','7012','54727','32905','21170','20970','57628','8962','18970','56932','1112','6862','10567','10467','56909','56847','12167','5962','7362','8662','6012','8212','8112','52932','52983','4362','14567','7212','16119','16269','16469','57743','7962','16719','53408','5712','4312','54577','17019','17369','55507','52067','17569','7262','17819','8812','3962','5762','4462','712','4262','17869','8912','56007','9262','17969','9312','55557','55407','18119','55607','18169','55957','53033','18419','18469','7112','56584','18569','18869','18919','49701','49702','53409','53410','56576','56587','56588','56908','57390','57391','57854','57855','57856','57857','57915','57916','57917','57918','57954','57955','57956','57957','57958','57959','57960','57961'";
       String wsdlURL="http://nyuhospitals-p6.oracleindustry.com/p6ws/services/UDFValueService?wsdl";
		
       
       try
		{
			if (authService.authenticationP6()) 
			{
				System.out.println("Logged in successfully.");
			} 
			else 
			{
				
				return;
			}
		}
		catch(Exception e)
		{
			System.out.println("Authentication Failed");
			return ;
		}
       
       
       
       try 
        {
    	   
    	   	udfValueService.setAuthService(authService);
    	   
            URL url = new URL(wsdlURL/*+ "UDFValueService?wsdl"*/);
            
           // UDFValueService service = new UDFValueService(url);
            
            //UDFValuePortType servicePort = service.getUDFValuePort();
            
            UDFValuePortType servicePort = udfValueService.createUDFValueServicePort();
            
            
            Client client = ClientProxy.getClient(servicePort);
            
            //Login.LoginWithUsernameTokenProfile(client);
            
            List<UDFValueFieldType> udfListFieldType = new ArrayList<UDFValueFieldType>();
            //udfListFieldType.add(UDFValueFieldType.TEXT);
            udfListFieldType.add(UDFValueFieldType.PROJECT_OBJECT_ID);
            
            
            
            List<UDFValue> udfValue = servicePort.readUDFValues(udfListFieldType, "ProjectObjectId in (" + projectID + ")", null);
            for (UDFValue udfv : udfValue)
            {
                System.out.println(udfv.getText() + " -> " + udfv.getProjectObjectId().toString());
            }
        } 
        catch (MalformedURLException ex) 
        {
            Logger.getLogger(ReadUDF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (com.oracle.xmlns.primavera.p6.ws.udfvalue.v1.IntegrationFault ex) 
        {
            Logger.getLogger(ReadUDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
	
	
	

