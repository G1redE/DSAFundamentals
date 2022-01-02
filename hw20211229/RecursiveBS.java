package com.dsa.hw20211229;

public class RecursiveBS {
	static int bs(int[] arr,int left,int right,int target) {
	while (left<=right) {
		int mid = (left + (right-left))/2;
		System.out.println(mid);
		 if(arr[mid]==target)
			 return mid;
		 if(arr[mid]<target) {
			return bs(arr,mid+1,right,target);
		 }
		
			return bs(arr,left,mid-1,target);		
	}
	return -1;
}
	
	public static void main(String[] args) {
		int arr[] ={12,3,4,5,2};
		System.out.println(bs(arr,0,arr.length-1,5));
	}

}
