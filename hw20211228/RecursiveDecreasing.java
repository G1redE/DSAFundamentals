package com.dsa.hw20211228;

import java.util.Scanner;

public class RecursiveDecreasing {
	static public void recur(int a) {
		
		if(a<=0) {
	 		return ;
		}
		if(a%2==0) {
			System.out.println(a);
		}
		recur(a-1);
		
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		System.out.println("The Even series is");
	
		recur(n);
		
	
}}
