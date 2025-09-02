package com.codegnan.controlstatements;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int originalNum=num;
		int reversedNum=0;
		while(num!=0) {
			int reminder = num%10;
			reversedNum=reversedNum*10+reminder;
			num/=10;
		}
		if(reversedNum<0) {    //to convert the negative num to positive using multiplication. 
			reversedNum*=-1;  //or number=-number or number/=-1;
		}
		System.out.println("The reversed Number of "+originalNum+" is :"+reversedNum);
		sc.close();
	}

}
