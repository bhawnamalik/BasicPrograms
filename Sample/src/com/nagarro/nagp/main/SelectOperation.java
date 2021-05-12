package com.nagarro.nagp.main;


import java.io.IOException;

import com.nagarro.nagp.array.ArrayTestData;
import com.nagarro.nagp.characterstring.StringTestData;
import com.nagarro.nagp.common.CommonMethod;
import com.nagarro.nagp.fileio.FileIoTestData;
import com.nagarro.nagp.numeric.NumericTestData;
import com.nagarro.nagp.pattern.PatternTestData;

public class SelectOperation {
	//this method displays the options available for operation
	public static void displayOptions()
	{
		displayGeneralOptions();
		int operation = CommonMethod.getIntegerInput();
		switch(operation)
		{
		case 1:
			displayAndSelectNumericOperation();
			break;
		case 2:
			displayAndSelectPatternOptions();
			break;
		case 3: 
			displayAndSelectStringOptions();
			break;
		case 4: 
			displayAndSelectArrayOptions();
			break;
		case 5: 
			try {
				displayAndSelectFileOptions();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			System.out.println("You entered incorrect option");
			CommonMethod.reset();
			break;
		}	
	}
	//this method displays the file options
	  private static void displayAndSelectFileOptions() throws IOException {
		displayFileIoOptions();
		int operation = CommonMethod.getIntegerInput();
		switch(operation)
		{
			case 1:
				FileIoTestData.createFile();
				break;
			case 2:
				FileIoTestData.deleteFile();
				break;
			case 3:
				FileIoTestData.readFile();
				break;
			default:
				System.out.println("You entered incorrect value");
		}
	}

	//this method displays and select the numeric options available for operation
	private static void displayAndSelectNumericOperation()
	{
		displayNumericOptions();
		int operation = CommonMethod.getIntegerInput();
		NumericTestData ntd = new NumericTestData();
		switch (operation)
		{
			case 1: 
				NumericTestData.findLargest();
				break;
			case 2:
				ntd.smallestInArray();
				break;
			case 3:
				ntd.primeNumberInRangeWithCount();
				break;
			case 4:
				ntd.checkLeapYear();
				break;
			case 5:
				ntd.divisibleBy5And11();
				break;
			case 6:
				ntd.printFibonacciSeries();
				break;
			case 7:
				ntd.findFactorial();
				break;
			case 8:
				ntd.reverseNumberAndSumOfDigits();
				break;
			default:
				System.out.println("Entered value is incorrect");
				CommonMethod.reset();
				break;
		}
	}
	//this method displays the pattern options available for operation and select 1
	public static void displayAndSelectPatternOptions()
	{
		displayPatternOptions();
		int operation = CommonMethod.getIntegerInput();
		PatternTestData ptd = new PatternTestData();
		switch (operation)
		{
			case 1: 
				ptd.drawPyramid();
				break;
			case 2:
				ptd.drawCrossPattern();
				break;
			case 3:
				ptd.drawTrianglePattern();
				break;
			case 4:
				ptd.drawReverseTrianglePattern();
				break;
			default:
				System.out.println("Entered value is incorrect");
				CommonMethod.reset();
				break;
		}
	
	}
	//this method displays the string options available for operation
	public static void displayAndSelectStringOptions()
	{
		displayStringOptions();
		int operation = CommonMethod.getIntegerInput();
		StringTestData std = new StringTestData();
		switch (operation)
		{
			case 1: 
				std.stringReverse();
				break;
			case 2:
				std.checkPalindrome();
				break;
			case 3:
				std.reverseEachStringInLine();
				break;
			case 4:
				std.characterOccurrenceCountInString();
				break;
			default:
				System.out.println("Entered value is incorrect");
				CommonMethod.reset();
				break;
		}
	}
	//this method displays the array options available for operation
	private static void displayAndSelectArrayOptions()
		{
			displayArrayOptions();
			int operation = CommonMethod.getIntegerInput();
			switch(operation)
			{
				case 1:
					ArrayTestData.binarySearch();
					break;
				case 2:
					ArrayTestData.sorting();
					break;
				case 3:
					ArrayTestData.reverseArrayAndSum();
					break;
				case 4:
					ArrayTestData.mergeTwoArraysAndSort();
					break;
				case 5:
					ArrayTestData.findMaximumAndMinimum();
					break;
				case 6:
					ArrayTestData.separateOddEven();
					break;
				case 7:
					ArrayTestData.addElementAtParticularPosition();
					break;
				case 8:
					ArrayTestData.deleteElementAtParticularPosition();
					break;
				case 9:
					ArrayTestData.findAllPairsForGivenSum();
					break;
				case 10:
					ArrayTestData.removeDuplicatesFromArray();
					break;
				default:
					System.out.println("Entered value is incorrect");
					CommonMethod.reset();
					break;
			}		
		}
	//this method will display General Options
	private static void displayGeneralOptions() {
		System.out.println("press 1 for numeric operations");
		System.out.println("press 2 for pattern drawing");
		System.out.println("press 3 for character and string operations");
		System.out.println("press 4 for array operations");
		System.out.println("press 5 for file operations");
	}
	//this method will display Numeric Options
	private static void displayNumericOptions() {
		System.out.println("press 1 for largest out of 3 numbers");
		System.out.println("press 2 for smallest in array");
		System.out.println("press 3 for prime number within range along with count");
		System.out.println("press 4 for checking whether the entered year is leap year or not");
		System.out.println("press 5 for checking number is divisible by 5 or 11");
		System.out.println("press 6 for fibonacci series");
		System.out.println("press 7 for factorial");
		System.out.println("press 8 for reverse number and sum of all digits");
	}
	//this method will display pattern Options
	private static void displayPatternOptions() {
		System.out.println("press 1 for pyramid drawing");
		System.out.println("press 2 for cross drawing");
		System.out.println("press 3 for triangle drawing");
		System.out.println("press 4 for reverse triangle drawing");
	}
	//this method will display string Options
	private static void displayStringOptions()
	{
		System.out.println("press 1 for string reverse");
		System.out.println("press 2 for checking string palindrome");
		System.out.println("press 3 for reversing each string of a line");
		System.out.println("press 4 for character count in a string");
	}
	//this method will display Array Options
	private static void displayArrayOptions()
	{
		System.out.println("press 1 for finding the index of element (Binary search)");
		System.out.println("press 2 for sorting ");
		System.out.println("press 3 for reverse array and sum of each element ");
		System.out.println("press 4 for merge 2 arrays and sort");
		System.out.println("press 5 for finding maximum and minimum from an array");
		System.out.println("press 6 for separating odd and even number from an array");
		System.out.println("press 7 for adding an element at particular index in an array");
		System.out.println("press 8 for deleting an element at particular index in an array");
		System.out.println("press 9 for find pairs on integer array whose sum is equal to given number");
		System.out.println("press 10 for removing duplicate number from the array");
	}
	//this method will display fileIO Options
	private static void displayFileIoOptions() {
		System.out.println("press 1 for creating a file");
		System.out.println("press 2 for deleting the exisiting file");
		System.out.println("press 3 for reading the existing file");
		
	}		
}