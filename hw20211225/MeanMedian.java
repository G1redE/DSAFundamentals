package com.dsa.hw20211225;

import java.util.Arrays;

public class MeanMedian {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int [] arr = {-2,2,1,6,9};
			Arrays.sort(arr);
			int sum=0;
			for(int i: arr)
				sum+=i;
			double median;
			double mean = (double)sum/arr.length;
			System.out.println("mean :" +mean);
			if(arr.length%2!=0)
				 median=arr[arr.length/2];
			else
				median = (double)(arr[(arr.length-1)/2]+arr[arr.length/2])/2.0;
			System.out.println("median :"+median);

		}

}
