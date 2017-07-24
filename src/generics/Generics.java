package generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generics {
public static int getRowCount(String path,String sheet)
{
	int rc=0;
	try
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		rc=wb.getSheet(sheet).getLastRowNum();
	}
	catch(Exception e)
	{
		
	}
return rc;
}
public static int getColCount(String path,String sheet)
{
	int cc=0;
	try
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		cc=wb.getSheet(sheet).getRow(0).getLastCellNum();
	}
	catch(Exception e)
	{
		
	}
return cc;
}
public static String getCellValue(String path,String sheet,int r,int c)
{
	String V="";
	try
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		V=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		
	}
	catch(Exception e)
	{
		
	}
return V;
}

}