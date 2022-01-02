package com.dsa.hw202211227;

public class WaveMatrix {
	

public static void main(String[] args) {
		
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}} ;
		int rows = arr.length;
		int cols = arr[0].length;
		int top= 0, bottom=rows-1,left=0,right=cols-1;
		int dir=0;
		while(top<=bottom) {
			if(dir==0) {
				for(int i=left;i<=right;i++) {
					System.out.print(arr[top][i]+" ");
				}
				++top;
				dir=1;
			}
			else {
				for(int i=right;i>=left;i--) {
					System.out.print(arr[top][i]+" ");
				}
				++top;
				dir=0;
				
			}
		}
		
}

}
