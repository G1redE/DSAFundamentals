package com.dsa.hw20211220;

import java.util.Scanner;

public class BinarySearch {
	
	public static int BS(int arr[],int target) {
		int low =0, high=arr.length-1,mid=0;
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

	public static void main(String[] args) {
		int arr[] = {-1,0,0,3,5,9,12};
		Scanner scan = new Scanner(System.in);
		System.out.println("The Array is ");
		for(int i : arr) {
			System.out.print(i +" ");
		}
		System.out.println();
		System.out.println("Enter the number to search");
		
		
		int target = scan.nextInt();
		
		int index =  BS(arr,target);
		
		if(index == -1) {
			System.out.println(target+" does not exist in nums so return -1");
		}
		else System.out.println(target+" exists in nums and its index is " + index);
		scan.close();
	}
}
