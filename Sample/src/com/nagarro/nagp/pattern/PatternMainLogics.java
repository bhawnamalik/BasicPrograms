package com.nagarro.nagp.pattern;

public class PatternMainLogics {
	//this method will print the pyramid
	public static void printPramid(int rows)
	{
		for(int i = 1; i <= rows; i++)
		{
			for(int j = 1; j <= rows-i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*i-1; k++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//this method will draw the cross pattern
	public static void crossPattern(int num)
	{
		for (int i = 1; i <= num; i++)
		{
			for (int j = 1; j <= num; j++) 
			{
				if (i == j)
				{
					System.out.print(i);
				}
				else if (i + j == num + 1)
				{
					System.out.print(j);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	//this method will draw the reverse triangle pattern
	public static void reverseTrianglePattern(int rows)
		{
			for (int i = 1; i <= rows; i++)
			{
				for (int j = 1; j <= (rows-i)+1 ; j++) 
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	//this method will draw the triangle pattern
	public static void trianglePattern(int rows)
	{
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j <= i ; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
