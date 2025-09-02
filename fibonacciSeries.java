package com.codegnan.controlstatements;
import java.util.Scanner;
public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n1=0, n2=1;
		
		System.out.println("Enter the range :");
		int range=sc.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=2;i<=range;i++) {
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
		sc.close();
	}

}
