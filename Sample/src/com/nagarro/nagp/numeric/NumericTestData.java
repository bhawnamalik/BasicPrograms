package com.nagarro.nagp.numeric;

import com.nagarro.nagp.common.CommonMethod;

public class NumericTestData 
{
	//largest of 3 numbers
	public static void findLargest()
	{
		int [] num = new int[3];
			for (int i = 0; i < num.length; i++ )
			{
				num[i] = CommonMethod.getIntegerInput();
			}
			NumericMainLogics obj = new NumericMainLogics();
			int largest = obj.largestOfThreeNumbers(num);
			System.out.println("largest number is : " + largest);
	}
	
	//Smallest in array
	public void smallestInArray()
	{
		int arr [] = CommonMethod.getIntegerArrayInput();
		int smallest = NumericMainLogics.smallestInArray(arr);
		System.out.println("The smallest number in array is : " + smallest);
	}
	//prime number within range + count of prime numbers
	public void primeNumberInRangeWithCount()
	{
		System.out.println("Enter the range");
		int low = CommonMethod.getIntegerInput();
		int high = CommonMethod.getIntegerInput();
		int count = 0;
		System.out.print("Prime numbers within range :");
		for (int num = low ; num < high; num++)
		{
		if(NumericMainLogics.isPrime(num))
			{
			System.out.print(" " + num + "  ");
			count ++;
			}
		}
		System.out.println();
		System.out.println("Total prime numbers from "+ low +" to " + high + " : " + count);
	}
	//this function will check the leap year
	public void checkLeapYear() {
		int year = CommonMethod.getIntegerInput();
		boolean isLeapYear = NumericMainLogics.isLeapYear(year);
		if (isLeapYear)
			System.out.println(year + " is leap year");
		else
			System.out.println(year + " is not leap year");	
	}

	public void divisibleBy5And11() {
		int num = CommonMethod.getIntegerInput();
		int flag = NumericMainLogics.checkNumberdivisibleBy5And11(num);
		if (flag == 1)
			System.out.println(num + " is divisible by 5 and 11");
		else if (flag == 2)
			System.out.println(num + " is divisible by 11");
		else if (flag == 3)
			System.out.println(num + " is divisible by 5");
		else 
			System.out.println(num + " is not divisible by 5 or 11");
	}
	//this method will print the fibonacci series
	public void printFibonacciSeries() {
		int num = CommonMethod.getIntegerInput();
		NumericMainLogics.printFibonacciSeries(num);
	}
	//this method will print the factorial of given number
	public void findFactorial() {
		int num = CommonMethod.getIntegerInput();
		int fact = NumericMainLogics.getFactorial(num);
		System.out.println("the factorial of " + num + " is "+ fact);	
	}
	//this method will print the reverse of a number and sum of all digits
	public void reverseNumberAndSumOfDigits() {
		int num = CommonMethod.getIntegerInput();
		int arr[] = NumericMainLogics.getReverseNumberAndSumOfDigits(num);
		System.out.println("Reverse of number is : " + arr[0]);
		System.out.println("Sum of digits is : " + arr[1]);
	}
}