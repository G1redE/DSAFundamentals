package com.dsa.hw20211230;

public class SortStringAsc {
	public static String sort(String str) {
		int count[] = new int[59];
		for(int i=0;i<count.length;i++)
		{
			count[i]=0;
		}
		for(int i=0;i<str.length();i++)
		{
			int temp = (int)str.charAt(i) - 65;
			count[temp]++;
		}
		
		String res="";
		for(int i=58;i>=0;i--) {
			for(int j=0;j<count[i];j++)
				res += (char)(i+'A');
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(sort(str));
        
	}

}
