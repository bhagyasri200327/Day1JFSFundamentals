/*Java Programming Question: Airline Ticket Pricing System
◆ Problem Statement: Write a Java program to calculate the final price of an airline ticket based on the following conditions:
The base price of the ticket is ₹5000.
The final price is affected by:
Passenger Type:
"child": 50% discount
"senior": 20% discount
"adult". No discount
Any other input: show error and terminate.
Booking Time:
"early": 10% discount
"normal": No change
"last-minute": 20% extra charge
Membership Status:
If the passenger is a member, they get an additional 5% discount on the final price. Display the final ticket price after all applicable discounts/surcharges*/
package com.codegnan.controlstatements;
import java.util.Scanner;
public class AirlineTicket {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int basePrice=5000;
		System.out.println("Enter the Passenger Type : ");
		String passenger=sc.next();
		double discount = 0;
		if(passenger.equalsIgnoreCase("child")) {
			discount+=0.5;
		}else {
			if(passenger.equalsIgnoreCase("senior")) {
				discount+=0.2;
			}else {	
				if(passenger.equalsIgnoreCase("adult")) {
					discount+=0;
				}else {
					System.out.println("Error ! Unmatched passenger type !");
				}
			}
		}	
		double finalPrice=basePrice-discount*basePrice;
		System.out.println("You have to pay:"+finalPrice);
		System.out.println("Enter your Booking time (early/normal/lastminute) : ");
		String bookingTime= sc.next
				();
		if(bookingTime.equalsIgnoreCase("early")) {
			discount+=0.1;
		}else {
			if(bookingTime.equalsIgnoreCase("normal")) {
				discount+=0;
			}else {
			if(bookingTime.equalsIgnoreCase("lastminute")) {
				discount-=0.2;
			}
			}	
		}
		finalPrice=basePrice-discount*basePrice;
		System.out.println("You have to pay:"+finalPrice);
		System.out.println("Enter if you have a membership with us (true /false) :");
		boolean isMember=sc.nextBoolean();
		if(isMember == true) {
			finalPrice-=0.05*finalPrice;
		}
		System.out.println("The final ticket price after all applicable discounts is : " + finalPrice);
		sc.close();
	}

}
