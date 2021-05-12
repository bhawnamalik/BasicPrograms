package com.nagarro.nagp.array;

import com.nagarro.nagp.common.CommonMethod;

public class ArrayTestData {
	//this method will search the element and return its index
	public static void binarySearch() {
		int arr[] = CommonMethod.getIntegerArrayInput();
		if (arr.length == 0)
		{
			System.out.println("Array is empty, you can not perform search operation");
			System.exit(0);
		}
		System.out.println("Enter the number which you want to search");
		int num = CommonMethod.getIntegerInput();
		int index = ArrayMainLogics.binarysearch(arr, num);
		if (index == -1)
		{
			System.out.println(num +" is not present in array");
		}
		else
		{
			System.out.println(num + " is at index " + index);
		}
	}
	//this method will perform sorting based on user choice, by default ascending order
	public static void sorting() {
		int arr[] = CommonMethod.getIntegerArrayInput();
		if (arr.length == 0)
		{
			System.out.println("Array is empty, you can not perform sort operation");
			System.exit(0);
		}
		System.out.println("press 1 for ascending order");
		System.out.println("press 2 for descending order");
		int choice = CommonMethod.getIntegerInput();
		if (choice == 2)
		{
			ArrayMainLogics.arraySort(arr, "descending");
		}
		else
		{
			ArrayMainLogics.arraySort(arr, "ascending");
		}
	}
	//this method will reverse the array order and sum up the elements
	public static void reverseArrayAndSum() {
		int [] arr = CommonMethod.getIntegerArrayInput();
		if (arr.length == 0)
		{
			System.out.println("Array is empty, you can not perform reverse and sum operation");
			System.exit(0);
		}
		ArrayMainLogics.reverseArrayAndSum(arr);
	}
	//this method will merge two arrays and sort
	public static void mergeTwoArraysAndSort() {
		int arr1[] = CommonMethod.getIntegerArrayInput();
		int arr2[] = CommonMethod.getIntegerArrayInput();
		int []resultArr = ArrayMainLogics.mergeTwoArray(arr1, arr2);
		System.out.println("press 1 for ascending order");
		System.out.println("press 2 for descending order");
		int choice = CommonMethod.getIntegerInput();
		if (choice == 2)
		{
			ArrayMainLogics.arraySort(resultArr, "descending");
		}
		else
		{
			ArrayMainLogics.arraySort(resultArr, "ascending");
		}
		
	}
	//this method will find the maximum and minimum value from an array
	public static void findMaximumAndMinimum() {
		int arr[] = CommonMethod.getIntegerArrayInput();
		if (arr.length == 0)
		{
			System.out.println("Array is empty, you can not find minimum and maximum");
			System.exit(0);
		}
		int []arrResult = ArrayMainLogics.findMinMax(arr);
		System.out.println("Minimum value : " + arrResult[0]);
		System.out.print("Maximum value : " + arrResult[1]);
	}
	//this method will separate odd and even value from an array
	public static void separateOddEven() {
		int arr[] = CommonMethod.getIntegerArrayInput();
		if (arr.length == 0)
		{
			System.out.println("Array is empty, you can not separate even, odd numbers operation");
			System.exit(0);
		}
		//int[][] jagged_arr  ---> learn jagged array
		ArrayMainLogics.separateOddEven(arr);
				
		
	}
	//this method will add an element at particular position in an array
	public static void addElementAtParticularPosition() {
		int arr[] = CommonMethod.getIntegerArrayInput();
		int resultArr[] = new int[arr.length + 1];
		System.out.println("Enter the position at which you want to add new element : ");
		int index = CommonMethod.getIntegerInput();
		System.out.println("Enter the value of new element : ");
		int newElement = CommonMethod.getIntegerInput();
		resultArr = ArrayMainLogics.addElementAtParticularPosition(arr, index, newElement);
		CommonMethod.printIntegerArray(resultArr);
		
	}
	//this method will delete an element at particular position in an array
	public static void deleteElementAtParticularPosition() {
		int arr[] = CommonMethod.getIntegerArrayInput();
		if (arr.length == 0)
		{
			System.out.println("Array is empty, you can not perform delete operation");
			System.exit(0);
		}
		int resultArr[] = new int[arr.length - 1];
		System.out.println("Enter the position at which you want to delete ");
		int position = CommonMethod.getIntegerInput();
		resultArr = ArrayMainLogics.deleteElementAtParticularPosition(arr, position);
		CommonMethod.printIntegerArray(resultArr);
		
	}
	// this method will find pairs on integer array whose sum is equal to k
	public static void findAllPairsForGivenSum() {
		int arr[] = CommonMethod.getIntegerArrayInput();
		System.out.println("Enter the sum against which you want to check the pairs");
		int sum = CommonMethod.getIntegerInput();
		ArrayMainLogics.printAllPairs(arr, sum);
	}
	// this method will remove duplicate values from array
	public static void removeDuplicatesFromArray() {
		int arr[] = CommonMethod.getIntegerArrayInput();
		int resultarr[] = ArrayMainLogics.removeDuplicate(arr);
		CommonMethod.printIntegerArray(resultarr);
	}

}
