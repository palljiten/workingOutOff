package model;

import java.util.ArrayList;
import java.util.List;

public class ProjectNode {

	String rootEPSId;
	String rootEPSName;
	String rootEPSOBSName;
	
	int rootEPSOBSObjectId;
	int rootEPSObjectId;
	
	String parentEPSId;
	String parentEPSName;
	String parentEPSOBSName;
	int parentEPSObjectId;
	int parentEPSOBSObjectId;
	
	String projectTemplateId;
	int projectTemplateObjectId; 
	
	String projectId;
	String projectName;
	String projectPlannedStartDate;
	
	//dataDate
	String dataDate;
	
	String unifierRecordNumber;
	String unifierProjectNumber;
	int projectObjectId;
	
	
	String projectOBSName;
	int projectOBSObjectId;;
	
	
	//Total Cost
	String approveBudgetTotal;
	String pendingCommitmentsTotal;
	String AFCTotal;
	String totalInvoiceTotal; 
	
	String approveBudgetTotalVar;
	String pendingCommitmentsTotalVar;
	String AFCTotalVar;
	String totalInvoiceTotalVar;
	
	
	List<UnifierCostCodeFactor> unifierCostCodeFactors = new ArrayList<UnifierCostCodeFactor>();
	
	
	
	/************UDF**************/
	String unifierProjectShellNumber;
	String unifierBusinessProcessName;
	
	String unifierRecordLink;
	String grossSQFTUDF;
	String rentableSQFTUDF;
	String netSQFTUDF;
	String usableSQFTUDF;
	
	String itStatusUDF;
	String descriptionUDF;
	String scopeOfWorkUDF;
	String dependenciesUDF;
	String internalConstructionCommentsUDF;
	String commentsUDF;
	String eclipseProjectUDF;
	String departmentUDF;
	
	String buildingUDF;
	String buildingRecordNumberUDF;
	
	String floorUDF;
	String floorCodeUDF;
	String buildingCodeUDF;
	String buildingAddressUDF;
	String buildingCityUDF;
	String buildingStateUDF;
	String buildingZipUDF;
	String buildingCampus;
    
	String estimatedCost;
   	
	
	
	/************Project code************/
	
	String businessUnitProjectCode;
	//new field added
	String aTRUProjectProjectCode;
	String commisioningProjectProjectCode;
	String CONStatusProjectCode;
	String CONTypeProjectCode;
	String constructionPMProjectCode;
	String designPMProjectCode;
	String EHSPMProjectCode;
	String EHSPM2ProjectCode;
	String EPICContactProjectCode;
	String FAContactProjectCode;
	String ITPMProjectCode;
	String keyContactProjectCode;
	String majorMinorProjectCode;
	String procurementStrategyProjectCode;
	String programDirectorProjectCode;
	String projectCategoryProjectCode;
	String projectPhaseProjectCode;
	String projectTypeProjectCode;
	String projectType2ProjectCode;
	
	String typeOfProject;
	
	
	public String getApproveBudgetTotalVar() {
		return approveBudgetTotalVar;
	}
	public void setApproveBudgetTotalVar(String approveBudgetTotalVar) {
		this.approveBudgetTotalVar = approveBudgetTotalVar;
	}
	public String getPendingCommitmentsTotalVar() {
		return pendingCommitmentsTotalVar;
	}
	public void setPendingCommitmentsTotalVar(String pendingCommitmentsTotalVar) {
		this.pendingCommitmentsTotalVar = pendingCommitmentsTotalVar;
	}
	public String getAFCTotalVar() {
		return AFCTotalVar;
	}
	public void setAFCTotalVar(String aFCTotalVar) {
		AFCTotalVar = aFCTotalVar;
	}
	public String getTotalInvoiceTotalVar() {
		return totalInvoiceTotalVar;
	}
	public void setTotalInvoiceTotalVar(String totalInvoiceTotalVar) {
		this.totalInvoiceTotalVar = totalInvoiceTotalVar;
	}
	
	public String getApproveBudgetTotal() {
		return approveBudgetTotal;
	}
	public void setApproveBudgetTotal(String approveBudgetTotal) {
		this.approveBudgetTotal = approveBudgetTotal;
	}
	public String getPendingCommitmentsTotal() {
		return pendingCommitmentsTotal;
	}
	public void setPendingCommitmentsTotal(String pendingCommitmentsTotal) {
		this.pendingCommitmentsTotal = pendingCommitmentsTotal;
	}
	public String getAFCTotal() {
		return AFCTotal;
	}
	public void setAFCTotal(String aFCTotal) {
		AFCTotal = aFCTotal;
	}
	public String getTotalInvoiceTotal() {
		return totalInvoiceTotal;
	}
	public void setTotalInvoiceTotal(String totalInvoiceTotal) {
		this.totalInvoiceTotal = totalInvoiceTotal;
	}

	public String getTypeOfProject() {
		return typeOfProject;
	}
	public void setTypeOfProject(String typeOfProject) {
		this.typeOfProject = typeOfProject;
	}
	public String getUnifierRecordLink() {
		return unifierRecordLink;
	}
	public void setUnifierRecordLink(String unifierRecordLink) {
		this.unifierRecordLink = unifierRecordLink;
	}
	public String getBuildingCampus() {
		return buildingCampus;
	}
	public void setBuildingCampus(String buildingCampus) {
		this.buildingCampus = buildingCampus;
	}
	public String getBusinessUnitProjectCode() {
		return businessUnitProjectCode;
	}
	public void setBusinessUnitProjectCode(String businessUnitProjectCode) {
		this.businessUnitProjectCode = businessUnitProjectCode;
	}
	
	public String getaTRUProjectProjectCode() {
		return aTRUProjectProjectCode;
	}
	public void setaTRUProjectProjectCode(String aTRUProjectProjectCode) {
		this.aTRUProjectProjectCode = aTRUProjectProjectCode;
	}
	public String getCommisioningProjectProjectCode() {
		return commisioningProjectProjectCode;
	}
	public void setCommisioningProjectProjectCode(String commisioningProjectProjectCode) {
		this.commisioningProjectProjectCode = commisioningProjectProjectCode;
	}
	public String getCONStatusProjectCode() {
		return CONStatusProjectCode;
	}
	public void setCONStatusProjectCode(String cONStatusProjectCode) {
		CONStatusProjectCode = cONStatusProjectCode;
	}
	public String getCONTypeProjectCode() {
		return CONTypeProjectCode;
	}
	public void setCONTypeProjectCode(String cONTypeProjectCode) {
		CONTypeProjectCode = cONTypeProjectCode;
	}
	public String getConstructionPMProjectCode() {
		return constructionPMProjectCode;
	}
	public void setConstructionPMProjectCode(String constructionPMProjectCode) {
		this.constructionPMProjectCode = constructionPMProjectCode;
	}
	public String getDesignPMProjectCode() {
		return designPMProjectCode;
	}
	public void setDesignPMProjectCode(String designPMProjectCode) {
		this.designPMProjectCode = designPMProjectCode;
	}
	public String getEHSPMProjectCode() {
		return EHSPMProjectCode;
	}
	public void setEHSPMProjectCode(String eHSPMProjectCode) {
		EHSPMProjectCode = eHSPMProjectCode;
	}
	public String getEHSPM2ProjectCode() {
		return EHSPM2ProjectCode;
	}
	public void setEHSPM2ProjectCode(String eHSPM2ProjectCode) {
		EHSPM2ProjectCode = eHSPM2ProjectCode;
	}
	public String getUnifierProjectNumber() {
		return unifierProjectNumber;
	}
	public void setUnifierProjectNumber(String unifierProjectNumber) {
		this.unifierProjectNumber = unifierProjectNumber;
	}
	
	public String getEPICContactProjectCode() {
		return EPICContactProjectCode;
	}
	public void setEPICContactProjectCode(String ePICContactProjectCode) {
		EPICContactProjectCode = ePICContactProjectCode;
	}
	public String getFAContactProjectCode() {
		return FAContactProjectCode;
	}
	public void setFAContactProjectCode(String fAContactProjectCode) {
		FAContactProjectCode = fAContactProjectCode;
	}
	public String getITPMProjectCode() {
		return ITPMProjectCode;
	}
	public void setITPMProjectCode(String iTPMProjectCode) {
		ITPMProjectCode = iTPMProjectCode;
	}
	public String getKeyContactProjectCode() {
		return keyContactProjectCode;
	}
	public void setKeyContactProjectCode(String keyContactProjectCode) {
		this.keyContactProjectCode = keyContactProjectCode;
	}
	public String getMajorMinorProjectCode() {
		return majorMinorProjectCode;
	}
	public void setMajorMinorProjectCode(String majorMinorProjectCode) {
		this.majorMinorProjectCode = majorMinorProjectCode;
	}
	public String getProcurementStrategyProjectCode() {
		return procurementStrategyProjectCode;
	}
	public void setProcurementStrategyProjectCode(String procurementStrategyProjectCode) {
		this.procurementStrategyProjectCode = procurementStrategyProjectCode;
	}
	public String getProgramDirectorProjectCode() {
		return programDirectorProjectCode;
	}
	public void setProgramDirectorProjectCode(String programDirectorProjectCode) {
		this.programDirectorProjectCode = programDirectorProjectCode;
	}
	public String getProjectCategoryProjectCode() {
		return projectCategoryProjectCode;
	}
	public void setProjectCategoryProjectCode(String projectCategoryProjectCode) {
		this.projectCategoryProjectCode = projectCategoryProjectCode;
	}
	public String getProjectPhaseProjectCode() {
		return projectPhaseProjectCode;
	}
	public void setProjectPhaseProjectCode(String projectPhaseProjectCode) {
		this.projectPhaseProjectCode = projectPhaseProjectCode;
	}
	public String getProjectTypeProjectCode() {
		return projectTypeProjectCode;
	}
	public void setProjectTypeProjectCode(String projectTypeProjectCode) {
		this.projectTypeProjectCode = projectTypeProjectCode;
	}
	public String getProjectType2ProjectCode() {
		return projectType2ProjectCode;
	}
	public void setProjectType2ProjectCode(String projectType2ProjectCode) {
		this.projectType2ProjectCode = projectType2ProjectCode;
	}
	public String getEstimatedCost() {
		return estimatedCost;
	}
	public void setEstimatedCost(String estimatedCost) {
		this.estimatedCost = estimatedCost;
	}
	
	
	public String getGrossSQFTUDF() {
		return grossSQFTUDF;
	}
	public void setGrossSQFTUDF(String grossSQFTUDF) {
		this.grossSQFTUDF = grossSQFTUDF;
	}
	public String getRentableSQFTUDF() {
		return rentableSQFTUDF;
	}
	public void setRentableSQFTUDF(String rentableSQFTUDF) {
		this.rentableSQFTUDF = rentableSQFTUDF;
	}
	public String getNetSQFTUDF() {
		return netSQFTUDF;
	}
	public void setNetSQFTUDF(String netSQFTUDF) {
		this.netSQFTUDF = netSQFTUDF;
	}
	public String getUsableSQFTUDF() {
		return usableSQFTUDF;
	}
	public void setUsableSQFTUDF(String usableSQFTUDF) {
		this.usableSQFTUDF = usableSQFTUDF;
	}
	public String getItStatusUDF() {
		return itStatusUDF;
	}
	public void setItStatusUDF(String itStatusUDF) {
		this.itStatusUDF = itStatusUDF;
	}
	public String getDescriptionUDF() {
		return descriptionUDF;
	}
	public void setDescriptionUDF(String descriptionUDF) {
		this.descriptionUDF = descriptionUDF;
	}
	public String getScopeOfWorkUDF() {
		return scopeOfWorkUDF;
	}
	public void setScopeOfWorkUDF(String scopeOfWorkUDF) {
		this.scopeOfWorkUDF = scopeOfWorkUDF;
	}
	public String getDependenciesUDF() {
		return dependenciesUDF;
	}
	public void setDependenciesUDF(String dependenciesUDF) {
		this.dependenciesUDF = dependenciesUDF;
	}
	public String getInternalConstructionCommentsUDF() {
		return internalConstructionCommentsUDF;
	}
	public void setInternalConstructionCommentsUDF(String internalConstructionCommentsUDF) {
		this.internalConstructionCommentsUDF = internalConstructionCommentsUDF;
	}
	public String getCommentsUDF() {
		return commentsUDF;
	}
	public void setCommentsUDF(String commentsUDF) {
		this.commentsUDF = commentsUDF;
	}
	public String getEclipseProjectUDF() {
		return eclipseProjectUDF;
	}
	public void setEclipseProjectUDF(String eclipseProjectUDF) {
		this.eclipseProjectUDF = eclipseProjectUDF;
	}
	public String getDepartmentUDF() {
		return departmentUDF;
	}
	public void setDepartmentUDF(String departmentUDF) {
		this.departmentUDF = departmentUDF;
	}
	public String getBuildingUDF() {
		return buildingUDF;
	}
	
	public String getBuildingRecordNumberUDF() {
		return buildingRecordNumberUDF;
	}
	public void setBuildingRecordNumberUDF(String buildingRecordNumberUDF) {
		this.buildingRecordNumberUDF = buildingRecordNumberUDF;
	}
	public void setBuildingUDF(String buildingUDF) {
		this.buildingUDF = buildingUDF;
	}
	public String getFloorUDF() {
		return floorUDF;
	}
	public void setFloorUDF(String floorUDF) {
		this.floorUDF = floorUDF;
	}
	public String getFloorCodeUDF() {
		return floorCodeUDF;
	}
	public void setFloorCodeUDF(String floorCodeUDF) {
		this.floorCodeUDF = floorCodeUDF;
	}
	public String getBuildingCodeUDF() {
		return buildingCodeUDF;
	}
	public void setBuildingCodeUDF(String buildingCodeUDF) {
		this.buildingCodeUDF = buildingCodeUDF;
	}
	public String getBuildingAddressUDF() {
		return buildingAddressUDF;
	}
	public void setBuildingAddressUDF(String buildingAddressUDF) {
		this.buildingAddressUDF = buildingAddressUDF;
	}
	public String getBuildingCityUDF() {
		return buildingCityUDF;
	}
	public void setBuildingCityUDF(String buildingCityUDF) {
		this.buildingCityUDF = buildingCityUDF;
	}
	public String getBuildingStateUDF() {
		return buildingStateUDF;
	}
	public void setBuildingStateUDF(String buildingStateUDF) {
		this.buildingStateUDF = buildingStateUDF;
	}
	public String getBuildingZipUDF() {
		return buildingZipUDF;
	}
	public void setBuildingZipUDF(String buildingZipUDF) {
		this.buildingZipUDF = buildingZipUDF;
	}
	public String getProjectPlannedStartDate() {
		return projectPlannedStartDate;
	}
	public void setProjectPlannedStartDate(String projectPlannedStartDate) {
		this.projectPlannedStartDate = projectPlannedStartDate;
	}
	public int getProjectObjectId() {
		return projectObjectId;
	}
	public void setProjectObjectId(int projectObjectId) {
		this.projectObjectId = projectObjectId;
	}
	public int getRootEPSOBSObjectId() {
		return rootEPSOBSObjectId;
	}
	public void setRootEPSOBSObjectId(int rootEPSOBSObjectId) {
		this.rootEPSOBSObjectId = rootEPSOBSObjectId;
	}
	public int getParentEPSOBSObjectId() {
		return parentEPSOBSObjectId;
	}
	public void setParentEPSOBSObjectId(int parentEPSOBSObjectId) {
		this.parentEPSOBSObjectId = parentEPSOBSObjectId;
	}
	public int getProjectOBSObjectId() {
		return projectOBSObjectId;
	}
	public void setProjectOBSObjectId(int projectOBSObjectId) {
		this.projectOBSObjectId = projectOBSObjectId;
	}
	public String getProjectOBSName() {
		return projectOBSName;
	}
	public void setProjectOBSName(String projectOBSName) {
		this.projectOBSName = projectOBSName;
	}
	public int getRootEPSObjectId() {
		return rootEPSObjectId;
	}
	public void setRootEPSObjectId(int rootEPSObjectId) {
		this.rootEPSObjectId = rootEPSObjectId;
	}
	public int getProjectTemplateObjectId() {
		return projectTemplateObjectId;
	}
	public void setProjectTemplateObjectId(int projectTemplateObjectId) {
		this.projectTemplateObjectId = projectTemplateObjectId;
	}
	public int getParentEPSObjectId() {
		return parentEPSObjectId;
	}
	public void setParentEPSObjectId(int parentEPSObjectId) {
		this.parentEPSObjectId = parentEPSObjectId;
	}
	public String getRootEPSId() {
		return rootEPSId;
	}
	public void setRootEPSId(String rootEPSId) {
		this.rootEPSId = rootEPSId;
	}
	public String getRootEPSName() {
		return rootEPSName;
	}
	public void setRootEPSName(String rootEPSName) {
		this.rootEPSName = rootEPSName;
	}
	public String getRootEPSOBSName() {
		return rootEPSOBSName;
	}
	public void setRootEPSOBSName(String rootEPSOBSName) {
		this.rootEPSOBSName = rootEPSOBSName;
	}
	public String getParentEPSId() {
		return parentEPSId;
	}
	public void setParentEPSId(String parentEPSId) {
		this.parentEPSId = parentEPSId;
	}
	public String getParentEPSName() {
		return parentEPSName;
	}
	public void setParentEPSName(String parentEPSName) {
		this.parentEPSName = parentEPSName;
	}
	public String getParentEPSOBSName() {
		return parentEPSOBSName;
	}
	public void setParentEPSOBSName(String parentEPSOBSName) {
		this.parentEPSOBSName = parentEPSOBSName;
	}
	public String getProjectTemplateId() {
		return projectTemplateId;
	}
	public void setProjectTemplateId(String projectTemplateId) {
		this.projectTemplateId = projectTemplateId;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
	public List<UnifierCostCodeFactor> getUnifierCostCodeFactors() {
		return unifierCostCodeFactors;
	}
	public void setUnifierCostCodeFactors(List<UnifierCostCodeFactor> unifierCostCodeFactors) {
		this.unifierCostCodeFactors = unifierCostCodeFactors;
	}
	public String getUnifierRecordNumber() {
		return unifierRecordNumber;
	}
	public void setUnifierRecordNumber(String unifierRecordNumber) {
		this.unifierRecordNumber = unifierRecordNumber;
	}
	
	public String getDataDate() {
		return dataDate;
	}
	public void setDataDate(String dataDate) {
		this.dataDate = dataDate;
	}
	
	
	

	public String getUnifierProjectShellNumber() {
		return unifierProjectShellNumber;
	}
	public void setUnifierProjectShellNumber(String unifierProjectShellNumber) {
		this.unifierProjectShellNumber = unifierProjectShellNumber;
	}
	
	public String getUnifierBusinessProcessName() {
		return unifierBusinessProcessName;
	}
	public void setUnifierBusinessProcessName(String unifierBusinessProcessName) {
		this.unifierBusinessProcessName = unifierBusinessProcessName;
	}
	@Override
	public String toString() {
		return "ProjectNode [rootEPSId=" + rootEPSId + ", rootEPSName=" + rootEPSName + ", rootEPSOBSName="
				+ rootEPSOBSName + ", rootEPSOBSObjectId=" + rootEPSOBSObjectId + ", rootEPSObjectId=" + rootEPSObjectId
				+ ", parentEPSId=" + parentEPSId + ", parentEPSName=" + parentEPSName + ", parentEPSOBSName="
				+ parentEPSOBSName + ", parentEPSObjectId=" + parentEPSObjectId + ", parentEPSOBSObjectId="
				+ parentEPSOBSObjectId + ", projectTemplateId=" + projectTemplateId + ", projectTemplateObjectId="
				+ projectTemplateObjectId + ", projectId=" + projectId + ", projectName=" + projectName
				+ ", projectPlannedStartDate=" + projectPlannedStartDate + ", unifierRecordNumber="
				+ unifierRecordNumber + ", projectObjectId=" + projectObjectId + ", projectOBSName=" + projectOBSName
				+ ", projectOBSObjectId=" + projectOBSObjectId + ", unifierCostCodeFactors=" + unifierCostCodeFactors
				+ ", unifierProjectShellNumber=" + unifierProjectShellNumber + ", unifierBusinessProcessName="
				+ unifierBusinessProcessName + ", unifierRecordLink=" + unifierRecordLink + ", grossSQFTUDF="
				+ grossSQFTUDF + ", rentableSQFTUDF=" + rentableSQFTUDF + ", netSQFTUDF=" + netSQFTUDF
				+ ", usableSQFTUDF=" + usableSQFTUDF + ", itStatusUDF=" + itStatusUDF + ", descriptionUDF="
				+ descriptionUDF + ", scopeOfWorkUDF=" + scopeOfWorkUDF + ", dependenciesUDF=" + dependenciesUDF
				+ ", internalConstructionCommentsUDF=" + internalConstructionCommentsUDF + ", commentsUDF="
				+ commentsUDF + ", eclipseProjectUDF=" + eclipseProjectUDF + ", departmentUDF=" + departmentUDF
				+ ", buildingUDF=" + buildingUDF + ", floorUDF=" + floorUDF + ", floorCodeUDF=" + floorCodeUDF
				+ ", buildingCodeUDF=" + buildingCodeUDF + ", buildingAddressUDF=" + buildingAddressUDF
				+ ", buildingCityUDF=" + buildingCityUDF + ", buildingStateUDF=" + buildingStateUDF
				+ ", buildingZipUDF=" + buildingZipUDF + ", buildingCampus=" + buildingCampus + ", estimatedCost="
				+ estimatedCost + ", businessUnitProjectCode=" + businessUnitProjectCode
				+ ", commisioningProjectProjectCode=" + commisioningProjectProjectCode + ", CONStatusProjectCode="
				+ CONStatusProjectCode + ", CONTypeProjectCode=" + CONTypeProjectCode + ", constructionPMProjectCode="
				+ constructionPMProjectCode + ", designPMProjectCode=" + designPMProjectCode + ", EHSPMProjectCode="
				+ EHSPMProjectCode + ", EHSPM2ProjectCode=" + EHSPM2ProjectCode + ", EPICContactProjectCode="
				+ EPICContactProjectCode + ", FAContactProjectCode=" + FAContactProjectCode + ", ITPMProjectCode="
				+ ITPMProjectCode + ", keyContactProjectCode=" + keyContactProjectCode + ", majorMinorProjectCode="
				+ majorMinorProjectCode + ", procurementStrategyProjectCode=" + procurementStrategyProjectCode
				+ ", programDirectorProjectCode=" + programDirectorProjectCode + ", projectCategoryProjectCode="
				+ projectCategoryProjectCode + ", projectPhaseProjectCode=" + projectPhaseProjectCode
				+ ", projectTypeProjectCode=" + projectTypeProjectCode + ", projectType2ProjectCode="
				+ projectType2ProjectCode + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((projectId == null) ? 0 : projectId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjectNode other = (ProjectNode) obj;
		if (projectId == null) {
			if (other.projectId != null)
				return false;
		} else if (!projectId.equals(other.projectId))
			return false;
		return true;
	}
	
	
	
}
