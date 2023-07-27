package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilKit {
	
	
	public static HashMap<String,String> getTestData(String testcase) throws IOException
	{
		
		
		FileInputStream fis=new FileInputStream("src\\test\\resources\\testdata\\excels\\Adactin Master Test Data.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("com.adactin");
		
		ArrayList<Row> testCaseRows=getTestCaseRows(ws,testcase);
		
		
		HashMap<String,String> hMap=new HashMap<String,String>();
		
		for(int i=0;i<testCaseRows.size();i++)
		{
			
			int noOfCells=testCaseRows.get(0).getPhysicalNumberOfCells()-1;
			
			for(int j=1;j<=noOfCells;j++)
			{
				hMap.put(testCaseRows.get(i).getCell(j).getStringCellValue(), testCaseRows.get(1).getCell(j).getStringCellValue());
			}
		}
		
		
		return hMap;
		
		
	}

	private static ArrayList<Row> getTestCaseRows(XSSFSheet ws, String testcase) {
		
		
		ArrayList<Row>  allRows=new ArrayList<Row>();
		
		for(int i=0;i<=ws.getLastRowNum();i++)
		{
			
			if(!(ws.getRow(i)==null))
			{
				allRows.add(ws.getRow(i));
			}
			
			
		}
		
		ArrayList<Row> testCaseRows=new ArrayList<Row>();
		
		for(int i=0;i<allRows.size();i++)
		{
			
			if(allRows.get(i).getCell(0).getStringCellValue().equalsIgnoreCase(testcase))
			{
				testCaseRows.add(allRows.get(i));
			}
			
		}
		
		
		return testCaseRows;
	}

}
