package com.nagarro.nagp.numeric;

public class NumericMainLogics {
	//this method find the largest of 3 numbers
	public int largestOfThreeNumbers(int num[])
	{
		int largest; int a = num[0]; int b = num[1]; int c = num[2];
		if(a > b && b > c)
			largest = a;
		else if (b > a && a > c)
			largest = b;
		else 
			largest = c;
		return largest;
	}
	//this method finds the smallest number in an array
	public static int smallestInArray(int arr[])
	{
		int smallest = arr[0];
		for (int i = 0; i < arr.length ; i ++)
		{
			if (arr[i] < smallest)
				smallest = arr[i];
		}
		return smallest;
	}
	//this method this method validates whether the given number is prime or not
	public static boolean isPrime(int num)
	{
		int flag = 0;
		if (num == 0 || num == 1)
			flag ++;
		for (int i = 2; i <= num/2; i++)
		{
			if (num % i == 0)
			{
				flag ++; break;
			}	
		}
		boolean result = flag > 0 ? false : true;
		return result;
	}
	//this method will return true in case of leap year
	public static boolean isLeapYear(int year) {
		boolean isLeapYear = false;
		if (year % 4 == 0)
			isLeapYear = true;
		return isLeapYear;
	}
	//this method will return flag value according to number divisible by 5,11
	public static int checkNumberdivisibleBy5And11(int num) {
		int flag;
		if ((num % 5 == 0) && (num % 11 == 0))
			flag = 1;
		else if (num % 11 == 0)
			flag = 2;
		else if ((num % 5 == 0))
			flag = 3;
		else 
			flag = 4;
		return flag;
	}
	//this method will print fibonacci series
	public static void printFibonacciSeries(int num) {
		int a = 0, b = 1, count = 2;
		int c = a + b;
		System.out.println("Fibonacci series");
		System.out.println(a);
		System.out.println(b);
		while (c < num)
		{
			System.out.println(c);
			a = b;
			b = c;
			c = a + b;
			count ++;
		}
		System.out.println("the count is : " +count);
	}
	//this method will return the factorial of the given number
	public static int getFactorial(int num) {
		int fact = 1;
		while (num > 1)
		{
			fact = fact * num ;
			num--;
		}
		return fact;
	}
	public static int [] getReverseNumberAndSumOfDigits(int num) {
		int sum = 0, rev = 0;
		while (num > 0)
		{
			sum = num % 10 + sum;
			rev = (num % 10) + rev * 10;
			num = num / 10;
		}
		int arr[] = new int[] {rev , sum};
		return arr;
	}
	
}
