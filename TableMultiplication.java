package com.codegnan.controlstatements;
import java.util.Scanner;
public class TableMultiplication {

	public static void main(String[] args) {
		//MULTIPLICATION TABLE PRINTING
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		
				for(int i=1;i<=20;i++) {
					System.out.println(n + " * "+ i+" = "+n*i);
				}
				sc.close();
	}

}
