package com.dsa.hw20211220;

public class SquarerootwithBS {
	
	static int sqrt(int n) {
		int start=1,end=n/2,sqrtnum=0,mid,sqr;
		if(n<2) {
			return n;
		}
		while(start<=end) {
			 mid = (start+ end)/2;
			 sqr=mid*mid;
			if(sqr==n) {
				return mid;
			}
			else if(sqr<n) {
				start=mid+1;
				sqrtnum=mid;
			}
			else {
				end=mid-1;
			}
		
		}
		return sqrtnum;
		
	}

	public static void main(String[] args) {
		 
		System.out.println(sqrt(2));
	}

}
