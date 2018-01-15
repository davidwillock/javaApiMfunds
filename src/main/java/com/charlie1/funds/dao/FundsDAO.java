package com.charlie1.funds.dao;

import java.util.Iterator;
import java.util.List;
//import com.charlie1.funds.model;

//import com.charlie1.funds.dao.impl.jPerformDataEnum;

public interface FundsDAO 
{
	
	
	public String buildStrPeformanceData(String risk1, String risk2);
	public String buildStrHoldingsData(String risk1, String risk2);
	public String buildStrReturnsData(String risk1, String risk2);
    public String buildStrHistoricalData(String risk1, String risk2);
	public String buildStrChartSector(String fund);
	public String buildStrChartAsset(String fund);
	public String buildStrChartGeograph(String fund);
	public String buildStrPerformanceCalander(String risk1, String risk2);
	//public jPerformDataEnum getFundsbyRisk(String risk1, String risk2);
	public String buildStrIDX(); 
	public String buildStrIDXSpinner();
	public Iterator<String> getFundsbyRisk(String risk1, String risk2);
	public String buildStrPeformanceDataByFund(String fund);
	public String buildStrHoldingsDataByFund(String fund);
	public String buildStrReturnsDataByFund(String fund);
	public String buildStrHistoricalDataByFund(String fund);
	public  String buildStrPerformanceCalanderByFund(String fund);
	public Iterator getFundsbyFund(String fund);
	public String buildStrPeformanceDataAll();
		    
			
		
    
		
	
			
	
	
			
			
			
			
		
		
	
}
