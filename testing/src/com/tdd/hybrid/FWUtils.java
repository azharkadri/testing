package com.tdd.hybrid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FWUtils implements IAutoConstant{
	
	public static ArrayList<Object[]> getData() throws EncryptedDocumentException, FileNotFoundException, IOException{
		ArrayList<Object[]> data=new ArrayList<Object[]>();
		
		
		try {
		Workbook wb=WorkbookFactory.create(new FileInputStream(XL_WORKBOOK_PATH));
		int lrn=wb.getSheet(SHEET).getLastRowNum();
		
		for(int i=1;i<=lrn;i++) {
		String	emailOrMobile=wb.getSheet(SHEET).getRow(i).getCell(0).toString();
		
		String password=wb.getSheet(SHEET).getRow(i).getCell(1).toString();
		
		Object obj[]= {emailOrMobile,password};
		data.add(obj);		
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return data;
	}

}
