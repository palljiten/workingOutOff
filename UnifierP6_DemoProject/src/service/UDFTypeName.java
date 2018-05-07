package service;

import configuration.P6WSConfiguration;

public class UDFTypeName extends P6WSConfiguration{

	public static String getUDFValueList()
	{
		String UDFValueList = "";
	
		UDFValueList+="'"+grossSQFTUDFName+"',";
		UDFValueList+="'"+rentableSQFTUDFName+"',";
		UDFValueList+="'"+netSQFTUDFName+"',";
		UDFValueList+="'"+usableSQFTUDFName+"',";

		
		UDFValueList+="'"+unifierRecordNumberUDFName+"',";
		UDFValueList+="'"+unifierRecordLinkUDFName+"',";
		UDFValueList+="'"+unifierProjectShellNumberUDFName+"',";
		UDFValueList+="'"+unifierBusinessProcessNameUDFName+"',";
		
		UDFValueList+="'"+itStatusUDFName+"',";
		UDFValueList+="'"+descriptionUDFName+"',";
		UDFValueList+="'"+scopeOfWorkUDFName+"',";
		UDFValueList+="'"+dependenciesUDFName+"',";
		UDFValueList+="'"+internalConstructionCommentsUDFName+"',";
		UDFValueList+="'"+commentsUDFName+"',";
		UDFValueList+="'"+eclipseProjectUDFName+"',";
		UDFValueList+="'"+departmentUDFName+"',";
		
		UDFValueList+="'"+buildingRecordNumberUDFName+"',";
		UDFValueList+="'"+PlaceHolderEstimatedCost+"',";
		UDFValueList+="'"+buildingUDFName+"',";
		UDFValueList+="'"+floorUDFName+"',";
		UDFValueList+="'"+floorCodeUDFName+"',";
		UDFValueList+="'"+buildingCodeUDFName+"',";
		UDFValueList+="'"+buildingAddressUDFName+"',";
		UDFValueList+="'"+buildingCityUDFName+"',";
		UDFValueList+="'"+buildingStateUDFName+"',";
		UDFValueList+="'"+buildingZipUDFName+"',";
		UDFValueList+="'"+buildingCampus+"',";
		
		
		UDFValueList+="'"+factorForEstimationUDFName+"',";
		UDFValueList+="'"+originalEstimatedCostUDFName+"',";
		UDFValueList+="'"+PMEstimatedCostUDFName+"',";
		UDFValueList+="'"+PlaceHolderEstimatedCost+"'";
		
		
		return UDFValueList;
	
	}
}
