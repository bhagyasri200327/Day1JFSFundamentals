package com.codegnan.fundamentals;
import java.util.Scanner;
public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//1.MAJOR OR MINOR
		/*System.out.println("Enter your age : ");
		int age=sc.nextInt();
		String result= age>=18 ? "Eligible to Vote" : "Not eligible to Vote";
		System.out.println(result);*/
		//2.LEAP YEAR OR NOT
		/*System.out.println("Enter the Year : ");
		int year=sc.nextInt();
		boolean isLeapYear= (year%4==0)&& (year%100!=0)||(year%400==0);
		String result=isLeapYear ? "is Leap year" : "Not a leap year";
		//String result= (year%4==0 && year%100!=0) || (year%400==0)? "Leap Year" : "Not a Leap Year";
		System.out.println(result);*/
		//3.EVEN OR ODD
		/*System.out.println("Enter the number : ");
		int num=sc.nextInt();
		String result= num%2==0? "Even Number" : "Odd Number";
		System.out.println(result);*/
		//4.POSITITVE OR NEGATIVE
		/*System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		String result= num>0 ? "POSITIVE NUMBER" : "NEGATIVE NUMBER";
		System.out.println(result);*/
		//5.GREATER OF TWO NUMBERS
		System.out.println("ENTER TWO NUMBERS: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int result= num1>num2 ? num1 : num2;
		System.out.println("Greatest of 2 numbers "+ num1 + " and " + num2 + " is : "+result);
		//6.PASS OR FAIL
		//7.NUMBER DIVISIBLE BY BOTH 5 AND 3
		//8.IF BILL AMOUNT IS MORE THAN 1000 APPLY 10% DISCOUNT
	}

}
