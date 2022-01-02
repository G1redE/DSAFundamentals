package com.dsa.hw20211221;

import java.util.Scanner;

public class TwoSumSortedArray {
	
	public static int BS(int arr[],int left,int right,int target) {
		int mid=0,low=left,high=right;
		while(low<=high) {
		mid=low+(high-low)/2;
		if(target==arr[mid])
			{
			return mid;
			}
		else if(target>arr[mid]) 
			{
			low = mid+1;
			}
		else 
			{
			high = mid-1;
			}
		}
		if(low>high) {
			return -1;
		}
		return 0;
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int target = scan.nextInt();
		int arr[] =new int[n];
		int res[] =new int[2];
		for(int i=0;i<n;i++) {
		 arr[i]=scan.nextInt(); 
		
		}
		int j=0;
		int n1,n2;
		while(true) {
			n1 = arr[j];
			n2 = target - n1;
			if(BS(arr,j,arr.length-1,n2)>0) {
			  	res[1]=BS(arr,j,arr.length-1,n2);
				res[0]=j;
				break;
			}
			j++;
			
		}
		System.out.println("["+res[0]+","+res[1]+"]");
	}

}
