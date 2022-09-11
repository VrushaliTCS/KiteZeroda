package Base_Utility_ActiTest;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityActi {
	public static String getTD(int rowindex,int colindex) throws Throwable{
FileInputStream fs=new FileInputStream("C:\\Users\\yogesh\\OneDrive\\Documents\\actTime.xlsx");
Sheet sh = WorkbookFactory.create(fs).getSheet("Sheet1");

String data = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
 return data;
}
}