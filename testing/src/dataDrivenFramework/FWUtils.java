package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FWUtils implements IAutoConstant {
	public static String readExcelData(String path_workbook, String sheet, int row, int cell)
			throws EncryptedDocumentException, FileNotFoundException, IOException {
		String str=null;
		try {
		Workbook wb=WorkbookFactory.create(new FileInputStream(path_workbook));
		Cell c=wb.getSheet(sheet).getRow(row).getCell(cell);
		str=c.getStringCellValue();		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return str;
	}
	

}
