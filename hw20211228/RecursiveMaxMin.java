package com.dsa.hw20211228;

public class RecursiveMaxMin {
	public static void MinMax(int arr[] ,int max,int min,int index) {
		
		if(arr[index]>max) {
			max = arr[index];
		
		}
		if(arr[index]<min) {
			min = arr[index];
			
		}
		if(index==arr.length-1) {
			System.out.println("max " + max);
			System.out.println("min " + min);
			return;
		}
		
		MinMax(arr,max,min,index+1);
		
		
	}
	public static void main(String[] args) {
		
		int Max = Integer.MIN_VALUE;
		int Min = Integer.MAX_VALUE;
		int arr[] = {-2,2,1,6,9,-1};
		int index=0;
		MinMax(arr,Max,Min, index); 
	
		

	}

}
