package com.qa.YourLogo_Assessment;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC3_DataDrivenApproachUsingExcel extends TC1_SearchAndVerify{
	private String excel_file_path = null;

	
	public TC3_DataDrivenApproachUsingExcel()
	{
		this.excel_file_path = "./Test_Data/TestData.xlsx";
	}

	/**
	* This method read the search strings given in the Excel spreadsheet (should be in .xlsx format) 
	* Search Strings should be in first sheet of the Excel work book 
	* Search Strings should be given in first column of sheet
	* Search Strings should be started from 2nd row in the sheet
	*
	* @return      the String array of the Search Strings
	*/
	public String[] read_search_strings_from_excel_spread_sheet()
	{

		String[] search_strings = null;
		
		try
		{
			File exceFile = new File(excel_file_path);
            if (!exceFile.exists())
            {
                throw new RuntimeException("Unable to find the file : " + excel_file_path);
            }
			FileInputStream fis = new FileInputStream(exceFile);
			XSSFWorkbook excelWorkbook = new XSSFWorkbook(fis);
			XSSFSheet excelSheet = excelWorkbook.getSheetAt(0);
    		XSSFCell xcel_cell;
    		
            int rows = excelSheet.getPhysicalNumberOfRows();
            search_strings = new String[rows-1];

    		for(int row=1; row<rows; row++)
    		{
    			xcel_cell = excelSheet.getRow(row).getCell(0);
				String cellContents=xcel_cell.getStringCellValue();
				search_strings[row-1] = cellContents;
    		}

    		fis.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return search_strings;
	}
	
	
	/**
	* This Test method reuse the TestCase1 method
	* This method pass the Search strings in Xlsx Spraedsheet one by one to to TC1_SerachAndVerify API 
	* and Verify the First Result matches the search criteria. 
	*/
	@Test(priority=3)
	public void TeastCase3_DataDrivenApproachUsingExcel()
	{
		String[] search_strings = null;
		search_strings = read_search_strings_from_excel_spread_sheet();

	    for (String search_string : search_strings)
	    {
	    	Reporter.log(search_string);
	    	set_search_string(search_string);
	    	PerformSearchAndValidate();
	    }
	}
}
