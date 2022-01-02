package com.dsa.hw20211228;

import java.util.Scanner;

public class RecursiveFibbanoci {
	static public int recur(int a) {
		
		if(a==0) {
			return 0;
		}
		if(a==1||a==2) {
			return 1;
		}
		return recur(a-1) +  recur(a-2);
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		System.out.println("The Fibonacci series is");
		for(int i=0;i<n;i++) {
		System.out.print(recur(i)+" ");
		}
	}

}
