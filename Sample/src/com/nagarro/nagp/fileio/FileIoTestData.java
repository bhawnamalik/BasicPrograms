package com.nagarro.nagp.fileio;

import java.io.File;
import java.io.IOException;

import com.nagarro.nagp.common.CommonMethod;

public class FileIoTestData {
	//this method will create a file
	public static void createFile() {
		System.out.println("press 1 for excel file creation");
		System.out.println("press 2 for creating notepad file");
		int choice = CommonMethod.getIntegerInput();
		switch (choice) 
		{
			case 1:
			try {
				FileIoMainLogics.createExcelFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
				break;
			case 2:
				FileIoMainLogics.createNotepadFile();
				break;
			default:
				System.out.println("You have entered incorrect value");
		}
		
	}

	public static void deleteFile() {
		// TODO Auto-generated method stub
		
	}

	public static void readFile() {
		System.out.println("press 1 for reading excel file");
		System.out.println("press 2 for reading notepad file");
		int choice = CommonMethod.getIntegerInput();
		switch (choice) 
		{
			case 1:
			try {
				FileIoMainLogics.readExcelFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
				break;
			case 2:
				File file = new File("./resources/Demo.txt");
			try {
				FileIoMainLogics.readNotepadFile(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				break;
			default:
				System.out.println("You have entered incorrect value");
		}
		
		
	}

}
