package com.nagarro.nagp.main;

import java.util.Scanner;

import com.nagarro.nagp.common.CommonMethod;

public class Main {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String [] args) 
	{
		System.out.println("Enter your name : ");
		String name = CommonMethod.getStringInput();
		System.out.println("Welcome "+ name + "!!");   
		SelectOperation.displayOptions();
	}
}
