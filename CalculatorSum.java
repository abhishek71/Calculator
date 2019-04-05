package com.calculator;

import java.util.Scanner;

public class CalculatorSum {

	static int value1;
	static int value2;
	static int sum;
	static Scanner obj=new Scanner(System.in); 
	public static void add(){
		
		
		System.out.println("Enter First value");
		value1=obj.nextInt();
		System.out.println("Enter Second value");
		value2=obj.nextInt();
		sum=value1+value2;
		System.out.println("total sum is :"+ sum);
	}
	
	
}
