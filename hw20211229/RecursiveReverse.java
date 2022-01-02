package com.dsa.hw20211229;

import java.util.Scanner;

public class RecursiveReverse {
	public static void recur(int n) {
		if(n<=0)
			return;
		System.out.print(n%10);
		recur(n/10);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		recur(n);

	}

}
