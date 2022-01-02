package com.dsa.hw20211221;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IntersectionArray {
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int arr1[] =new int[n1];
		int arr2[] =new int[n2];
		for(int i=0;i<n1;i++) {
		 arr1[i]=scan.nextInt(); 
		}
		for(int i=0;i<n2;i++) {
		 arr2[i]=scan.nextInt(); 
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i=0,j=0,k=0;
		ArrayList<Integer> res = new ArrayList<Integer>();
		 while (i < arr1.length && j < arr2.length) {
			 
	            if (arr1[i] > arr2[j]) {
	                j++;
	            }
	 
	            else if (arr2[j] > arr1[i]) {
	                i++;
	            }
	            else {
	                // when both are equal
	                res.add(arr1[i]);
	                i++;
	                j++;
	                
	            }
	        }
		
			
		
		System.out.println(res);

	}

}
