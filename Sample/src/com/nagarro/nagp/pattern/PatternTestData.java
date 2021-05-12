package com.nagarro.nagp.pattern;

import com.nagarro.nagp.common.CommonMethod;

public class PatternTestData {
	
	//this method will take the user input and draw pyramid 
	public void drawPyramid()
	{
		System.out.println("Enter number of rows");
		int rows = CommonMethod.getIntegerInput();
		PatternMainLogics.printPramid(rows);		
	}
	//this method will take the user input and draw cross pattern
	public void drawCrossPattern()
	{
		System.out.println("Enter number of rows");
		int rows = CommonMethod.getIntegerInput();
		PatternMainLogics.crossPattern(rows);		
	}
	//this method will take the user input and draw reverse triangle pattern
	public void drawReverseTrianglePattern()
	{
		System.out.println("Enter number of rows");
		int rows = CommonMethod.getIntegerInput();
		PatternMainLogics.reverseTrianglePattern(rows);		
	}
	//this method will take the user input and draw triangle pattern
	public void drawTrianglePattern()
	{
		System.out.println("Enter number of rows");
		int rows = CommonMethod.getIntegerInput();
		PatternMainLogics.trianglePattern(rows);		
	}

}
