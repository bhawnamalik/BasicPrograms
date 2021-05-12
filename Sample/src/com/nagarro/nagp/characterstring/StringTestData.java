package com.nagarro.nagp.characterstring;

import com.nagarro.nagp.common.CommonMethod;
import com.nagarro.nagp.main.Main;

public class StringTestData extends Main {
	//this method find the reverse of the string
	public void stringReverse()
	{
		System.out.println("Enter the string which you want to reverse: ");
		String str = CommonMethod.getStringInput();
		String reverse = StringMainLogics.reverse(str);
		System.out.println("Reverse of the string is  : " + reverse);
	}
	//this method validates whether the string is palindrome or not
	public void checkPalindrome()
	{
		System.out.println("Enter the string which you want to check: ");
		String str = CommonMethod.getStringInput();
		String reverse = StringMainLogics.reverse(str);
		if (reverse.equals(str))
		{
			System.out.println("String is palindrome  : " + str);
		}
		else
		{
			System.out.println("Given string is not palindrome  : " + str);
		}
		
	}
	//this method reverse the each string of the line
	public void reverseEachStringInLine()
	{
		//System.out.println("Enter line");
		//String line = sc.nextLine();
		String line = "This is to check the logic as scanner nextLine is not working";
		String lineReverse = "";
		String [] arr = line.split(" ");
		for (String str : arr)
		{
			lineReverse = lineReverse + " " + StringMainLogics.reverse(str);
		}
		System.out.println("The predefined line : " + line);
		System.out.println("The reverse of each string in line is : " + lineReverse);
	}
	//this method will count the occurrence of each character in string
	public void characterOccurrenceCountInString()
	{
		//System.out.println("Enter line");
		//String line = sc.nextLine();
		String line = "Author: Bhawna Malik";
		String linetest = line.toLowerCase();
		StringMainLogics.characterOccurrence(linetest);
	}
}
