/*Write a Java program to calculate the monthly electricity bill based on the number of units consumed, applying the following slab rates:
Units Consumed      Rate per Unit
0-100                 1.50
101-200               ₹2.00
201-300               ₹3.00
Above 300             ₹5.00
If the total bill exceeds ₹1000, apply a 10% surcharge.
If the user is a senior citizen, apply an additional 5% discount on the total.
*/
package com.codegnan.controlstatements;
import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the units : ");
	    int units=sc.nextInt();
	    double total=0;
	    if(units>=0 && units<=100) {
	    	total+=1.50*units;
	    }else {
	    	if(units>=101 && units<=200) {
	    		total+=units*2;
	    	}else {
	    		if(units>=201 && units<=300) {
	    			total+=units*3;
	    		}else {
	    			total+=units*5;
	    		}
	    	}
	    }
	    if(total>1000) {
	    	total+=0.1*total;
	    }
	    System.out.println("Your Electricity Bill is :"+total);
	    System.out.println("Are you a Senior Citizen (yes/no): ");
	    String isSeniorCitizen=sc.next();
	    if(isSeniorCitizen.equalsIgnoreCase("yes")) {
	    	total-=0.05*total;
	    }
	    System.out.println("The Electricity Bill obtained after discount is : "+total);
	    sc.close();
	}
}
