package com.dsa.hw20211220;

public class FrequencyusingBS {
	public static int lowestBinarySearch(int arr[],int target) {
		int low =0, high=arr.length-1,mid=0;
		
		while(low<high) {
			mid=low+(high-low)/2;
			if(target<=arr[mid]) 
				{
				high = mid;
				}
	
			else { 
				low = mid+1;
			
			}
		}
		if(arr[low]==target) {

			return low;	
		}
		return -1;
	}
	public static int highestBinarySearch(int arr[],int target) {
		int low =0, high=arr.length-1,mid=0;
		while(low<high) {
			mid=low+(high-low)/2;
			if(target>=arr[mid]) 
				{
				low = mid+1;
				
				}
	
			else { 
				high = mid;
			
			}
		}
		
			return low;
		
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
		int target = 5;
		
		int highindex =  highestBinarySearch(arr,target);
		int lowindex = lowestBinarySearch(arr,target);
		if(lowindex== -1 || highindex == -1) {
			System.out.println("Element not found in array");
		}
		else if(lowindex==highindex && lowindex !=-1 && highindex !=-1) {
			System.out.println(1);
		}
		else System.out.println(highindex - lowindex);
		
	}


}
