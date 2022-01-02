package com.dsa.hw20211229;

public class RecursvieAvg {
	public static void recur(int arr[],int index,int sum) {
		sum+=arr[index];
		if(index==arr.length-1) {
			System.out.println((sum/arr.length));
			return;
		}
		recur(arr,index+1,sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		recur(arr,0,0);

	}

}
