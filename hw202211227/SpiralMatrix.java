package com.dsa.hw202211227;

public class SpiralMatrix {


public static void main(String[] args) {
		
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}} ;
		int rows = arr.length;
		int cols = arr[0].length;
		int top= 0, bottom=rows-1,left=0,right=cols-1;
		int dir=0;
		while(top<=bottom && right>=left) {
			if(dir==0) {
				for(int i=left;i<=right;i++) {
					System.out.print(arr[top][i]+" ");
				}
				++top;
				dir=1;
			}
			else if(dir==1) {
				for(int i=top;i<=bottom;i++) {
					System.out.print(arr[i][right]+" ");
				}
				--right;
				dir=2;
			}
			else if(dir==2) {
				for(int i=right;i>=left;i--) {
					System.out.print(arr[bottom][i]+" ");
				}
				--bottom;
				dir=3;
				
			}
			else {
				for(int i=bottom;i>=top;i--) {
					System.out.print(arr[i][left]+" ");
				}
				++left;
				
				dir=0;
			}
			
		}
} 

}
