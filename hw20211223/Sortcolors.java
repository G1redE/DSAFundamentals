package com.dsa.hw20211223;

public class Sortcolors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {0,2,0,0,1,0,0,2,1};
		int start =0,mid =0,end =arr.length -1,pivotal=1;
		
		while(mid<=end) {
			if(arr[mid]<pivotal) {
				int temp = arr[start];
				arr[start] =arr[mid];
				arr[mid]=temp;
				start++;
				mid++;
				
			}
			else if(arr[mid]>pivotal) {
				int temp = arr[mid];
				arr[mid] =arr[end];
				arr[end]=temp;
				end--;
			}
			else {
				mid++;
			}
		}
		for(int i:arr) {
			System.out.print(i+ " ");
		}
		
		
	}

}
