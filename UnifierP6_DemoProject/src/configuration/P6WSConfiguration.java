package configuration;

import java.text.SimpleDateFormat;
import java.util.Set;

public class P6WSConfiguration 
{
	public static SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
	
	
	protected static String authenticationService="/p6ws/services/AuthenticationService?wsdl";
	//Earlier
	//protected static String projectService="/p6ws/services/ProjectService?wsdl";
	//new One
	protected static String projectService="/p6ws/services/V1/ProjectService?wsdl";
	
	protected static String EPSService="/p6ws/services/EPSService?wsdl";
	protected static String WBSService="/p6ws/services/V1/WBSService?wsdl";
	protected static String activityService="/p6ws/services/ActivityService?wsdl";
	protected static String OBSService="/p6ws/services/OBSService?wsdl";

	protected static String exportService="/p6ws/services/ExportService?wsdl";
	protected static String http="HTTP://";
	protected static String https="HTTPS://";

	protected static String username="palj02";
	protected static String password="seputij@2017";
	
	
	//protected static String username="singhv07";
	//protected static String password="Different@82";
	
	
	//protected static String hostname="nyuhospitals-dev-p6.oracleindustry.com";
	protected static String hostname="nyuhospitals-p6.oracleindustry.com";
	
	//protected static String hostname="nyuhospitals-stage-p6.oracleindustry.com";
	
	//Unifier Services
	//protected static String unifierServiceDev="https://nyuhospitals-dev-unifier-ws.oracleindustry.com/ws/un/services/UnifierWebServices";
	//protected static String unifierServiceDev="https://nyuhospitals-stage-unifier-ws.oracleindustry.com/ws/un/services/UnifierWebServices";
	protected static String unifierServiceDev="https://nyuhospitals-unifier-ws.oracleindustry.com/ws/un/services/UnifierWebServices";
		
	
	
	
	protected static int httpsPort=443;
	protected static int httpPort=80;
	
	protected static String useSSL="true";
	
	protected static String UDFValueService="/p6ws/services/UDFValueService?wsdl";
	protected static String UDFTypeService="/p6ws/services/UDFTypeService?wsdl";

	protected static String projectBudgetChangeLogService="/p6ws/services/ProjectBudgetChangeLogService?wsdl";
	protected static String projectCodeTypeService="/p6ws/services/ProjectCodeTypeService?wsdl";
	
	protected static String projectCodeService="/p6ws/services/ProjectCodeService?wsdl";
	protected static String projectCodeAssignmentService="/p6ws/services/ProjectCodeAssignmentService?wsdl";
	
	protected static String activityCodeService="/p6ws/services/ActivityCodeService?wsdl";
	protected static String activityCodeAssignmentService="/p6ws/services/ActivityCodeAssignmentService?wsdl";
	
	public static String resourceServices="/p6ws/services/ResourceService?wsdl";
	public static String resourceAssignmentSer="/p6ws/services/ResourceAssignmentService?wsdl";
	
	/************Project UDF************/
	protected static String unifierRecordNumberUDFName="UnifierRecordNumber";
	protected static String unifierRecordLinkUDFName="Unifier Record Link";
	protected static String unifierProjectShellNumberUDFName="Project Shell Number";
	protected static String unifierBusinessProcessNameUDFName="Unifier Business Process Name";
	
	
	protected static String grossSQFTUDFName="Gross SQFT";
	protected static String rentableSQFTUDFName="Rentable SQFT";
	protected static String netSQFTUDFName="Net SQFT";
	protected static String usableSQFTUDFName="Usable SQFT";
	
	protected static String itStatusUDFName="IT Status";
	protected static String descriptionUDFName="Description";
	protected static String scopeOfWorkUDFName="Scope of work";
	protected static String dependenciesUDFName="Dependencies";
	protected static String internalConstructionCommentsUDFName="Internal Construction Comments";
	protected static String commentsUDFName="Comments/Issues/Risks";
	protected static String eclipseProjectUDFName="Eclipse Project #";
	protected static String departmentUDFName="Department";
	
	//new Field added
	protected static String buildingRecordNumberUDFName="Building Record Number";
	
	protected static String buildingUDFName="Building";
	protected static String floorUDFName="Floor";
	protected static String floorCodeUDFName="Floor Code";
	protected static String buildingCodeUDFName="Building Code";
	protected static String buildingAddressUDFName="Building Address";
	protected static String buildingCityUDFName="Building City";
	protected static String buildingStateUDFName="Building State";
	protected static String buildingZipUDFName="Building Zip";
	protected static String buildingCampus="Building Campus";
	
	
	/*************Activity UDF**************/
	protected static String factorForEstimationUDFName="Factor for estimation";
	protected static String originalEstimatedCostUDFName="Original Estimated Cost";
	protected static String PMEstimatedCostUDFName="PM Estimated Cost";
	protected static String PlaceHolderEstimatedCost="Placeholder Estimated Cost";
	
	protected static String UnifierApprovedBudget="Unifier Approved Budget";
	protected static String UnifierCommitments="Unifier Commitments";
	protected static String UnifierSpends="Unifier Spends";
	protected static String AnticipatedFinalCost="Anticipated Final Cost";
	
	
	/**************Project code***************/
	
	protected static String businessUnitProjectCodeTypeName="Business Unit";
	protected static String commisioningProjectProjectCodeTypeName="Commisioning Project";
	//new field added
	protected static String ATRU_ProjectProjectCodeTypeName="ATRU Project";
	protected static String TypeOFProject="Type Of Project";
	
	protected static String CONStatusProjectCodeTypeName="CON Status";
	protected static String CONTypeProjectCodeTypeName="CON Type";
	protected static String constructionPMProjectCodeTypeName="Construction PM";
	protected static String designPMProjectCodeTypeName="Design PM";
	protected static String EHSPMProjectCodeTypeName="EH&S PM";
	protected static String EHSPM2ProjectCodeTypeName="EH&S PM2";
	protected static String EPICContactProjectCodeTypeName="EPIC Contact";
	protected static String FAContactProjectCodeTypeName="FA Contact";
	protected static String ITPMProjectCodeTypeName="IT PM";
	protected static String keyContactProjectCodeTypeName="Key Contact";
	protected static String majorMinorProjectCodeTypeName="Major Minor";
	protected static String procurementStrategyProjectCodeTypeName="Procurement Strategy";
	protected static String programDirectorProjectCodeTypeName="Program Director";
	protected static String projectCategoryProjectCodeTypeName="Project Category";
	protected static String projectPhaseProjectCodeTypeName="Project Phase";
	protected static String projectTypeProjectCodeTypeName="Project Type";
	protected static String projectType2ProjectCodeTypeName="Project Type 2";
	protected static String JOBService="/p6ws/services/V1/JobService?wsdl";
	
	
	
	
	
	protected static String shortname = "NYUMC";
	protected static String authcode = "PGBUnumc";
	
	protected static String shellNumber = "PIMS0000";
	
	protected static String projectRequestBP_Name = "Project Request";
	protected static String budgetTemplateBP_Name = "Budget Template";
	protected static String cashFlowTemplateBP_Name = "Cash Flow Template";
	
	
	protected static String UnifierWBSCode="Unifier WBS Code";
	protected static String accountGroup="Account Group";
	
	//file used for XML
	//protected static String projectRequest_BP_Xml_FilePath="src/file/ProjectRequestBPList.xml";
	//protected static String budgetTemplate_BP_FilePath="src/file/budgetTemplatefile.xml";
	//protected static String costSheetFile="src/file/CostSheetDataFile.xml";

	/*protected static String projectRequest_BP_Xml_FilePath="C:/Users/jitender.pal/Documents/InterfaceFile/ProjectCreation/ProjectRequestBPList.xml";
	protected static String budgetTemplate_BP_FilePath="C:/Users/jitender.pal/Documents/InterfaceFile/ProjectCreation/budgetTemplatefile.xml";
	protected static String costSheetFile="C:/Users/jitender.pal/Documents/InterfaceFile/ProjectCreation/CostSheetDataFile.xml";
	protected static String projectRequestBPXMl="C:/Users/jitender.pal/Documents/InterfaceFile/ProjectCreation/RecordXml.xml";
	*/
	protected static String projectRequest_BP_Xml_FilePath="C:/Integration/Utility/ProjectRequestBPList.xml";
	protected static String budgetTemplate_BP_FilePath="C:/Integration/Utility/budgetTemplatefile.xml";
	protected static String costSheetFile="C:/Integration/Utility/CostSheetDataFile.xml";
	protected static String projectRequestBPXMl="C:/Integration/Utility/RecordXml.xml";
	protected static String timeSheetSubmissionfile="C:/Integration/Utility/timeSheetSub.xml";
	
	
	//UDR Name
	public static String timeSheetSubmission_UDR="timeSheetSubmission";
	
	protected static String combineProjectIds(Set<String> projectIds)
	{
		String projectIdList = "";

		int i = 0;
		// add sql "in" clause
		for (String projectId : projectIds) 
		{
			projectIdList += "'" + projectId + "'";
			if (i < projectIds.size() - 1) 
			{
				projectIdList += ",";
			}
			i++;
		}
		return projectIdList;
	}
	
}
