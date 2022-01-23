package com.dsa.hw20220118;

import java.util.Arrays;

public class KthLargestElemArray {
	
	static void kthLargest(int[] arr ,int k) {
		Arrays.sort(arr);
		System.out.println(arr[arr.length-k]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,1,5,6,4};
		int k = 2;
		kthLargest(arr,k);

	}

}
