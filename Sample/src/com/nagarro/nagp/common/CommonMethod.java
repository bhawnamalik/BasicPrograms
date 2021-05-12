package com.nagarro.nagp.common;

import com.nagarro.nagp.main.Main;
import com.nagarro.nagp.main.SelectOperation;

public class CommonMethod extends Main{
	//this method get the integer input
	public static int getIntegerInput()
	{
		boolean flag = false; int result = 0;
		do {
		try
		{
			System.out.print("Enter number :");
			result = Integer.parseInt(sc.next());
			flag = false;
		}
		catch(NumberFormatException nfex)
		{
			System.out.println("Your input is invalid, please enter valid number");
			flag = true;
		}
		}
		while (flag);
		return result;
	}
	//this method get the string input using next
	public static String getStringInput()
	{
		return sc.next();
	}
	//this method will print the integer array
	public static void printIntegerArray(int []arr)
	{
		for (int a : arr)
		{
			System.out.println(a);
		}
	}
	//this method ask the user if  user wants to reset the selection and again start from the beginning 
	public static void reset() 
	{
		System.out.println("Do you want to try again, if yes then press 1 else press 2");
		int selection = getIntegerInput();
		if (selection == 1)
			SelectOperation.displayOptions();
	}
	//this method get the integer array input
	public static int[] getIntegerArrayInput()
	{
		System.out.println("Enter size of array");
		int size = getIntegerInput();
		int arr[] = new int[size];
		if (size == 0)
			return arr;
		System.out.println("Enter the element of array");
		for (int i = 0; i < size; i++)
		{
			arr[i] = getIntegerInput();
		}
		return arr;
	}
}
