/* Problem Statement:

You are tasked with developing an Canteen System for a small canteen that handles ordering and billing.
The system should present a menu with options for ordering tea, coffee, and samosas.
The user can place orders, view their bill, and check out. The program should:
Display the canteen menu showing the price of each item (tea, coffee, samosas).
Allow the user to order items by selecting the item number (1 for Tea, 2 for Coffee, 3 for Samosa) and entering the quantity.
The total cost of each item ordered.

The subtotal (sum of the cost of all ordered items).

A 5% tax on the subtotal.

The grand total, which includes the subtotal and tax.

Allow the user to checkout and exit the system.

The program should continuously display the menu of options until the user chooses to exit. The swite
View the bill that shows:
statement should be usea to implement the logic for nanosing amerent user ryoices

Requirements:

Use the switch-case statement for handling different options such as:

Viewing the menu.

Ordering items.

Viewing the bill. */
package com.codegnan.controlstatements;
import java.util.Scanner;
public class CanteenSystem {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice;
		int teaPrice=10, coffeePrice=15, samosaPrice=20;
		int teaQty=0, coffeeQty=0, samosaQty=0;
		double taxRate=0.05;
		do {
			System.out.println("||=========Canteen Menu==========||");
			System.out.println("1.View Menu");
			System.out.println("2.Order items");
			System.out.println("3.View Bill");
			System.out.println("4.Check out and Exit");
			System.out.println("Enter your choice (1/2/3/4) : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("||========Menu=======||");
				System.out.println("1. Tea      -$"+teaPrice);
				System.out.println("2. Coffee   -$"+coffeePrice);
				System.out.println("3. Samosa   -$"+samosaPrice);
				break;
			case 2:
				System.out.println("Enter item number to order(1/2/3)");
				int item=sc.nextInt();
				System.out.println("Enter Quantity :");
				int qty=sc.nextInt();
				if(qty<=0) {
					System.out.println("Quantity must be greater than 0");
				break;
			    }
				switch(item) {
				case 1:
					teaQty+=qty;
					System.out.println(qty+"Tea(s) Added");
					break;
				case 2:
					coffeeQty+=qty;
					System.out.println(qty+" Coffee(s) Added");
					break;
				case 3:
					samosaQty+=qty;
				    System.out.println(qty+" Samosa(s) Added");
				    break;
				default :
					System.out.println("Invalid item number.Please choose between 1and 3");
					break;
				}break;
		
			case 3:
				int teaTotal=teaQty*teaPrice;
				int coffeeTotal=coffeeQty*coffeePrice;
				int samosaTotal=samosaQty*samosaPrice;
				int subTotal=teaTotal+coffeeTotal+samosaTotal;
				double tax= subtotal*taxRate;
				double grandTotal=subtotal+tax);
				System.out.println("=============Bill==============");
				if(teaQty>0)
					System.out.println("Tea x"+teaQty+ "="+teaQty*teaPrice);
				if(coffeeQty>0)
					System.out.println("Coffee x"+coffeeQty+ "="+coffeeQty*coffeePrice);
				if(samosaQty>0)
					System.out.println("Samosa x"+samosaQty+ "="+samosaQty*samosaPrice);
				if(subTotal == 0)
					System.out.println("No Items added ");
				
			}while();
		
	}

}
