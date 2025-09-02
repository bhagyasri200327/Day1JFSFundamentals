package com.codegnan.controlstatements;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int temp=n, sum=0, rem=0, digitCount=0;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			digitCount++;
			n/=10;
		}
		System.out.println("The Sum of Digits of "+ temp + " is : "+sum);
		System.out.println("The Number of digits in "+temp+" is :"+digitCount);
		sc.close();
	}

}
