package com.dsa.hw20220106;

import java.util.Scanner;
import java.util.Stack;

public class AdjacentChars {
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	String str= scan.next();
	scan.close();
	Stack<Character> s =  new Stack<Character>();
    int n=0;
    String res="";
    while(n<str.length()) {
    	if(s.size()>0) {
    	if(s.peek()==str.charAt(n))
    		s.pop();
    	else
    		s.push(str.charAt(n));
    	    
    	    
    	}
    	else
    		s.push(str.charAt(n));
     n=n+1;
    }
    
    for(int i=0;i<s.size();i++) {
    	res+=s.get(i);
    }
    System.out.println(res);
   
}
}
