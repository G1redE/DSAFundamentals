package com.dsa.hw20211230;

import java.util.Scanner;

public class RecursivePower {
	static int power(int n1,int n2) {
		if(n2==1){
			return n1;
		}
		return n1 * power(n1,n2-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        scan.close();
        int power = power(n1, n2);
        System.out.println(power);

	}

}
