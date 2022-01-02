package com.dsa.hw20211228;

import java.util.Scanner;

public class RecursiveFactorial {
	
	static public int recur(int a) {
		
		if(a==1 || a==0) {
			return 1;
		}
		
		return a * recur(a-1);
		
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		System.out.print(" The factorial of "+ n +" is " + recur(n));
	}
}
