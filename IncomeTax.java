package com.codegnan.fundamentals;
import java.util.Scanner;
public class IncomeTax {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double income= sc.nextInt();
		double taxrate = income<30000 ? 0.05*income : (income>30000 && income <100000)?income*0.1: (income<200000)? income*0.15: income*0.14;
		System.out.println(taxrate);
		}
	

}
