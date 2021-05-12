package com.nagarro.nagp.array;

import java.util.Arrays;

import com.nagarro.nagp.common.CommonMethod;

public class ArrayMainLogics 
{
	//this method will sort the array and perform binary search
	public static int binarysearch(int[] arr, int num) {
		int begin = 0, end = arr.length -1, mid = (begin + end)/2;
		Arrays.sort(arr);
		while (end >= begin)
		{
			mid = (begin + end)/2;
			if(arr[mid] > num)
			{
				end = mid - 1;
			}
			else if (arr[mid] < num)
			{
				begin = mid + 1;
			}
			else if (arr[mid] == num)
			{
				return mid;
			}
		}
		return -1;
	}

	//this method will sort the given array in user defined order
	public static void arraySort(int[] arr, String order) {
		for(int i = 0; i < arr.length; i++)
		{
			int temp  = arr[i];
			for(int j = i+1; j < arr.length; j++)
			{
				if (order.toLowerCase().equals("descending"))
				{
					if(arr[j] > arr[i])
					{
						  temp = arr[i];
						  arr[i] = arr[j];
						  arr[j] = temp;
					}
				}
				else
				{
					if(arr[i] > arr[j])
					{
						  temp = arr[i];
						  arr[i] = arr[j];
						  arr[j] = temp;
					}
				}
			}
		}
		CommonMethod.printIntegerArray(arr);
	}
	//this method will reverse the array order and sum up the elements
	public static void reverseArrayAndSum(int [] arr) {
		int rev[] = new int[arr.length]; int j = 0, sum = 0;
		for (int i = arr.length - 1; i >=0 ; i--)
		{
			rev[i] = arr[j];
			j++;
			sum = rev[i] + sum;
		}
		System.out.println("the sum is :"+ sum +" reverse array is :");
		CommonMethod.printIntegerArray(rev);
	}
	//this method will merge two arrays
	public static int[] mergeTwoArray(int[] arr1, int[] arr2) {
		int resultArr[] = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++)
		{
			resultArr[i] = arr1[i];
		}
		for (int j = 0; j < arr2.length; j++)
		{
			resultArr[j + arr1.length] = arr2[j];
		}
		return resultArr;
	}
	//this method will find the maximum and minimum value from an array
	public static int[] findMinMax(int[] arr) {
		int smallest = arr[0], largest = arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] > largest)
				largest = arr[i];
			else if (smallest > arr[i])
				smallest = arr[i];
		}
		int[] arrResult = { smallest, largest };
		return arrResult;
	}
	//this method will separate odd and even value from an array
	public static void separateOddEven(int[] arr) {
		int []odd = new int[arr.length]; int oddCount = 0;
		int []even = new int[arr.length]; int evenCount = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				even[evenCount] = arr[i];
				evenCount++;
			}
			else
			{
				odd[oddCount] = arr[i];
				oddCount++;
			}
		}
		System.out.println("Odd numbers: " );
		for (int i = 0 ; i < oddCount; i++)
		{
			System.out.println(odd[i]);
		}
		System.out.println("Even numbers: ");
		for (int j = 0 ; j < evenCount; j++)
		{
			System.out.println(even[j]);
		}
	}

	//this method will add an element at particular position in an array
	static int[] addElementAtParticularPosition(int []arr, int position, int newElement) {
		int resultArr[] = new int[arr.length + 1];
		for (int i = 0; i <= arr.length ; i++ )
		{
			 if (i < position - 1) 
	                resultArr[i] = arr[i]; 
	            else if (i == position - 1) 
	            	resultArr[i] = newElement; 
	            else
	            	resultArr[i] = arr[i - 1]; 
		}
		return resultArr;
	}

	public static int[] deleteElementAtParticularPosition(int[] arr, int position) {
		if (arr == null || position < 0 || position >= arr.length) 
		{ 
	        System.out.println("No removal operation can be performed!!");
		}
		int resultArr[] = new int[arr.length - 1];
		for (int i = 0, j = 0; i < arr.length ; i++ )
		{		 
		     if (i == position) 
		     { 
		         continue; 
		     } 
		     resultArr[j++] = arr[i]; 
		} 
		return resultArr;
	}
	// this method will find pairs on integer array whose sum is equal to k
	public static void printAllPairs(int[] array, int sum) 
	{ 
		for (int i = 0; i < array.length; i++) 
		{ 
			for (int j = i + 1; j < array.length; j++) 
			{ 
				if ((array[i] + array[j]) == sum) 
				{ 
					System.out.println("["+ i +"] = " + array[i] + "["+ j +"] = " + array[j]); 
				}
			} 
		} 
	}
	//this method will remove duplicate values from array
	public static int[] removeDuplicate(int[] arr) {
		 Arrays.sort(arr);
		  int j = 0;
		  for (int i = 0; i < arr.length; i++) {
		    if (i == 0 || arr[i] != arr[i - 1]) {
		    	arr[j++] = arr[i];
		    }
		  }
		  return Arrays.copyOf(arr, j);
	}
}


	