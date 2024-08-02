package Utilities;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	//	XLUtils xl=new XLUtils();
		System.out.println(XLUtils.getRowCount("C:\\TestData\\TestData.xlsx", "Sheet1"));
	//	System.out.println(XLUtils.getColumnCount("C:\\TestData\\TestData.xlsx", "Sheet1",1));
	//	System.out.println(XLUtils.getCellData("C:\\TestData\\TestData.xlsx", "Sheet1",1,1));

	}
	
	public static int getRowCount(String xlfile, String xsheet) throws IOException{
		fi=new FileInputStream(xlfile);   // loading the particular file 
		wb=new XSSFWorkbook(fi);       // worbook
		ws=wb.getSheet(xsheet);        // sheet
		int rowcount= ws.getLastRowNum();   //it will give the last used row numm
		return rowcount;
	}
	
	
	public static int getcolCount(String xlfile, String xsheet, int rownum) throws IOException{
		fi=new FileInputStream(xlfile);   // loading the particular file 
		wb=new XSSFWorkbook(fi);       // worbook
		ws=wb.getSheet(xsheet);        // sheet
		row=ws.getRow(rownum);
		int colcount= row.getLastCellNum()  ; //it will give the last used column numm
		return colcount;
	}
	
	public static String getcellvalue(String xlfile, String xsheet, int rownum, int colnum) throws IOException{
		fi=new FileInputStream(xlfile);   // loading the particular file 
		wb=new XSSFWorkbook(fi);       // worbook
		ws=wb.getSheet(xsheet);        // sheet
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		String data;
		//int colcount= row.getLastCellNum()  ; //it will give the last used column numm
		try {
		DataFormatter formatter=new DataFormatter();
		String cellData=formatter.formatCellValue(cell);
		return cellData;
		}catch(Exception e) {
			data="";
		}
		
		return data;
	}
	
	
	

}
