package Base_Utility_FacebookTest;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_class {
public static String getTD(int Rowindex,int Colindex)throws Throwable {
	FileInputStream fs=new FileInputStream("");
	Sheet sh = WorkbookFactory.create(fs).getSheet("Sheeet1");
	String data = sh.getRow(Rowindex).getCell(Colindex).getStringCellValue();
	return data;
}
}
