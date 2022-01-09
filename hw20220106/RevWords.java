package com.dsa.hw20220106;

import java.util.Scanner;
import java.util.Stack;

public class RevWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		Stack<String> stack = new Stack<String>();
		String strarr[] = str.split(" ");
		for (String s: strarr) {
			stack.push(s);
		}
		while(stack.size()>0) {
			System.out.print(stack.pop() +" ");
		}
	}
	

}
