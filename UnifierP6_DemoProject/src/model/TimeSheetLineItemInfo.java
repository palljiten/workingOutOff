package model;

public class TimeSheetLineItemInfo {

	String projectId;
	String projectName;
	String PRRecordNumber;
	String programDirector;
	
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
	public String getPRRecordNumber() {
		return PRRecordNumber;
	}
	public void setPRRecordNumber(String pRRecordNumber) {
		PRRecordNumber = pRRecordNumber;
	}
	public String getProgramDirector() {
		return programDirector;
	}
	public void setProgramDirector(String programDirector) {
		this.programDirector = programDirector;
	}
	
}
