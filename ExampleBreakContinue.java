package com.codegnan.controlstatements;
import java.util.Scanner;
public class ExampleBreakContinue {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for (int i=0;i<=n;i++) {
			if(i%2==0) {
				continue; //skip current iteration(skips even nums and prints only odd nums)
			}
			System.out.println(i);
		}
	}

}
