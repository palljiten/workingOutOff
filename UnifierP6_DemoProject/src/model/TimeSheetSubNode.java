package model;

import java.util.ArrayList;
import java.util.List;

public class TimeSheetSubNode 
{
    String P6User;  
    String P6UserName;// why we need this
    String firstName;
    String lastName;
    String recordTitle;
    String weekStartDate;
    String weekEndDate;
	
	List<TimeSheetLineItemInfo> listTLSI= new ArrayList<TimeSheetLineItemInfo>();
    
    public String getP6User() {
		return P6User;
	}

	public void setP6User(String p6User) {
		P6User = p6User;
	}

	public String getP6UserName() {
		return P6UserName;
	}

	public void setP6UserName(String p6UserName) {
		P6UserName = p6UserName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRecordTitle() {
		return recordTitle;
	}

	public void setRecordTitle(String recordTitle) {
		this.recordTitle = recordTitle;
	}

	public String getWeekStartDate() {
		return weekStartDate;
	}

	public void setWeekStartDate(String weekStartDate) {
		this.weekStartDate = weekStartDate;
	}

	public String getWeekEndDate() {
		return weekEndDate;
	}

	public void setWeekEndDate(String weekEndDate) {
		this.weekEndDate = weekEndDate;
	}

	public List<TimeSheetLineItemInfo> getListTLSI() {
		return listTLSI;
	}

	public void setListTLSI(List<TimeSheetLineItemInfo> listTLSI) {
		this.listTLSI = listTLSI;
	}

	
    
    
}
