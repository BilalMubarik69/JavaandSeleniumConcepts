package com.test.utility;

import java.util.ArrayList;

public class TestUtil {
static Xls_Reader reader;
	
	
	public static ArrayList<Object[]> getDatafromExcel(){
		
		ArrayList<Object[]> mydata=new ArrayList<Object[]>();
		
		try{
			reader=new Xls_Reader("D://HalfEbayTestData.xlsx");
			
			
		}
		catch(Exception e){
			e.getStackTrace();
		}
		for(int rowNum=2;rowNum<=reader.getRowCount("Data");rowNum++){
		
			String firstName=reader.getCellData("Data", "firstname", rowNum);
			String lastName=reader.getCellData("Data", "lastname", rowNum);
			String Email=reader.getCellData("Data", "Email", rowNum);
			String Password=reader.getCellData("Data", "Password", rowNum);
			
			Object[]ob={firstName,lastName,Email,Password};
			
			mydata.add(ob);
			
			
		}
		
		return mydata;
		
	}
}
