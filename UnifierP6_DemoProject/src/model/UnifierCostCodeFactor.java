package model;

public class UnifierCostCodeFactor 
{
	
	String projectId;
	
	String unifierCostCode;
	
	String unifierCostCodeDescription;
	
	String factor;
	
	String accountGroup;
	String accountGroupDescription;
	
	String activityID;
	
	String approveBudget;
	String pendingCommitments;
	String AFC;
	String totalInvoice;
	
	public String getApproveBudget() {
		return approveBudget;
	}
	public void setApproveBudget(String approveBudget) {
		this.approveBudget = approveBudget;
	}
	public String getPendingCommitments() {
		return pendingCommitments;
	}
	public void setPendingCommitments(String pendingCommitments) {
		this.pendingCommitments = pendingCommitments;
	}
	public String getAFC() {
		return AFC;
	}
	public void setAFC(String aFC) {
		AFC = aFC;
	}
	public String getTotalInvoice() {
		return totalInvoice;
	}
	public void setTotalInvoice(String totalInvoice) {
		this.totalInvoice = totalInvoice;
	}
	
	
	public String getAccountGroupDescription() {
		return accountGroupDescription;
	}
	public void setAccountGroupDescription(String accountGroupDescription) {
		this.accountGroupDescription = accountGroupDescription;
	}
	public String getUnifierCostCodeDescription() {
		return unifierCostCodeDescription;
	}
	public void setUnifierCostCodeDescription(String unifierCostCodeDescription) {
		this.unifierCostCodeDescription = unifierCostCodeDescription;
	}
	public String getActivityID() {
		return activityID;
	}
	public void setActivityID(String activityID) {
		this.activityID = activityID;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getUnifierCostCode() {
		return unifierCostCode;
	}
	public void setUnifierCostCode(String unifierCostCode) {
		this.unifierCostCode = unifierCostCode;
	}
	public String getFactor() {
		return factor;
	}
	public void setFactor(String factor) {
		this.factor = factor;
	}
	public String getAccountGroup() {
		return accountGroup;
	}
	public void setAccountGroup(String accountGroup) {
		this.accountGroup = accountGroup;
	}
	@Override
	public String toString() {
		return "UnifierCostCodeFactor [projectId=" + projectId + ", unifierCostCode=" + unifierCostCode + ", factor="
				+ factor + ", accountGroup=" + accountGroup + ", activityID=" + activityID + "]";
	}
	
	
}
