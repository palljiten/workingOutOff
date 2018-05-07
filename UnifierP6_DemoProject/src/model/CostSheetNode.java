package model;

import java.util.ArrayList;
import java.util.List;

public class CostSheetNode 
{
	String projectId;
	
	List<UnifierCostCodeFactor> unifierCostCodeFactors = new ArrayList<UnifierCostCodeFactor>();
	
	//Cost
	String approveBudget;
	String pendingCommitments;
	String AFC;
	String totalInvoice;
	
}
