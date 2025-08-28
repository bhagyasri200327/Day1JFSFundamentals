/A PROGRAM TO CALCULATE THE FARE FOR A TAXI RIDE BASED ON:
	
package com.codegnan.fundamentals;

import java.util.Scanner;

public class FareCalculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Distance Travelled");
		double distance=sc.nextDouble();
		double fare=(distance<=2)?50 
				: (distance<=10)? (50 +(distance-2)*15)
						:(50+ (8*15)+ (distance -10)*10);
		fare = distance >20?fare*0.95 :fare;
		System.out.println("total fee :",fare);
	}

}
