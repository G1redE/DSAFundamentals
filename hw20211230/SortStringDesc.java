package com.dsa.hw20211230;

public class SortStringDesc {
	public static String sort(String str) {
		int count[] = new int[26];
		for(int i=0;i<count.length;i++)
		{
			count[i]=0;
		}
		for(int i=0;i<str.length();i++)
		{
			int temp = (int)str.charAt(i) - 97;
			count[temp]++;
		}
		
		String res="";
		for(int i=25;i>=0;i--) {
			for(int j=0;j<count[i];j++)
				res += (char)(i+'a');
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(sort(str));
        
	}

}
