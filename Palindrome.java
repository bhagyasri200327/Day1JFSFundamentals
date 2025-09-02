package com.codegnan.controlstatements;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int temp=num;
		int reverseNum=0;
		while(num>0) {
		  int reminder= num%10;
		  reverseNum=reverseNum*10 +reminder;
		  num/=10;
		}
		if(temp==reverseNum)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");
		sc.close();
	}

}
