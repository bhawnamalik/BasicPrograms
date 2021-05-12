package com.nagarro.nagp.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.nagarro.nagp.common.CommonMethod;

public class FileIoMainLogics {
	// this method will create an excel file
	public static void createExcelFile() throws Exception {
		System.out.println("Enter the file Name");
		String name = CommonMethod.getStringInput();
		File myFile = new File(".//Output//" + name + ".xls"); 
		try {
			boolean createNewFile = myFile.createNewFile();
			System.out.println("File Created = " + createNewFile);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		FileInputStream fis = new FileInputStream(".//Output//" + name + ".xls");
		//OutputStream fileOut = new FileOutputStream(".//Output//" + name + ".xlsx");   
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.createSheet("Sheet1");
		System.out.println("Enter number of headings : ");
		int headerCount = CommonMethod.getIntegerInput();
		System.out.println("Enter headings");
		String heading[] = new String[headerCount];
		Cell cell = null;
		for (int i = 0; i < headerCount; i++)
		{
			cell = sh.getRow(0).getCell(i);
			if (cell == null) 
			{
				cell = sh.getRow(0).createCell(i);
			}
			heading[i] = CommonMethod.getStringInput();
			cell.setCellValue(heading[i]);
		}
		fis.close();
		}

		
	public static void createNotepadFile() {

		System.out.println("Enter the file Name");
		String name = CommonMethod.getStringInput();
		File file = new File(".//Output//" + name + ".txt");
		try {
			boolean createNewFile = file.createNewFile();
			System.out.println("File Created = " + createNewFile);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}


	public static void readExcelFile() {
		// TODO Auto-generated method stub
		
	}


	public static void readNotepadFile(File file) throws IOException 
	{
		FileReader fileReader = new FileReader(file);
		int c;
		while ((c = fileReader.read()) != -1) {
			System.out.print((char) c);
		}
		fileReader.close();
	}
}
