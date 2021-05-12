package com.nagarro.nagp.characterstring;

public class StringMainLogics 
{
	//this method will reverse the given string
	public static String reverse(String str)
	{
		String rev = "";
		for (int i = str.length() - 1 ; i >= 0 ; i--)
		{
			rev = rev + str.charAt(i);
		}
		return rev;
	}
	//this method will count the character occurrence
	public static void characterOccurrence(String str)
	{
		for (int i = 0 ; i < str.length() ; i++)
		{
			int count = 0; int k;
			for (int j = 0 ; j < str.length(); j++ )
			{
				if (str.charAt(i) == str.charAt(j))
				{
					count++;
				}
			}
			for (k = 0; k < i; k++) 
			{
	            if (str.charAt(i) == str.charAt(k)) 
	                break; 
			}
	        if (i == k) 
	        {
	           	System.out.println(str.charAt(i) + " = " + count);
	        }
			
		}
	}
}
