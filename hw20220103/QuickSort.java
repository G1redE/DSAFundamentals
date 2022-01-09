package com.dsa.hw20220103;

import java.util.Arrays;

public class QuickSort {
	public static int[] quickSort(int[] arr, int elements) {
	      if(elements < 2){   
	          return arr;
	      }

	      int current_position=0;
	      int temp; 

	      for(int i=1; i<elements; i++)
	      {
	          if(arr[i] <= arr[0])
	          {
	              current_position++;
	              temp = arr[i];
	              arr[i] = arr[current_position];
	              arr[current_position] = temp;

	          }
	      }

	      temp = arr[0]; 
	      arr[0] = arr[current_position]; 
	      arr[current_position] = temp; 
	      
	      int[] left = quickSort(arr,current_position); 
	      
	      int[] arr2 = Arrays.copyOfRange(arr, current_position+1, elements);
	      
	      int[] right = quickSort(arr2, elements-current_position-1); 
	      int[] final_array = new int[elements]; 
	      for(int i=0; i<current_position; i++)
	      {
	          final_array[i] = left[i]; 
	      }
	      final_array[current_position] = arr[current_position];
	      for(int i=current_position+1; i<elements; i++)
	      {
	          final_array[i] = right[i-current_position-1];
	      }

	    return final_array;

	  }

	    public static void main( String args[] ) {
	        int[] array = {5, 8, 9, 3, 5, 7, 1, 3, 4, 9, 3, 5, 1, 8, 4};


	        array = quickSort(array, array.length);
	    
	        for(int i=0; i<array.length;i++)
	        {   
	            System.out.print(array[i]);
	            System.out.print(" ");
	        }
	        
	    }

}
