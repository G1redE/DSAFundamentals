package com.dsa.hw20220118;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Topkelements {
	static void kTopElem(int[] arr ,int k) {
		Arrays.sort(arr);
		HashMap<Integer,Integer> map = new HashMap<>(); 
		for(int i : arr) {
			if(map.containsKey(i)) {
				map.put(i,map.get(i)+1);
				}
			else {
				map.put(i,1);
			}
		}
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			if(entry.getValue()>=k) {
				System.out.println(entry.getKey());
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,1,2,2,3};
		int k =2;
		kTopElem(arr,k);
		
		

	}

}
