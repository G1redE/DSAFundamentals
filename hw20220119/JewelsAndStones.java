package com.dsa.hw20220119;

public class JewelsAndStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jewels ="aA";
		String stones = "aAAbbbb";
		int count =0;
		for(int i=0;i<stones.length();i++) {
			String c = ""+ stones.charAt(i);
			if(jewels.contains(c)) {
				count+=1;
			}
		}
		System.out.println(count);

	}

}
