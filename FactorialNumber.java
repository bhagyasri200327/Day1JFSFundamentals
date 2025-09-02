// FACTORIAL OF A NUMBER USING CONDITIONAL STATEMENTS
package com.codegnan.controlstatements;
import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num= sc.nextInt();
		long result=1;
		for(int i=1;i<=num;i++) {
			result*=i;
		}
		System.out.println("Factorial of "+num+ " is :"+result);
		sc.close();
	}

}
