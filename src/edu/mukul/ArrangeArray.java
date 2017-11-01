package edu.mukul;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ArrangeArray {

	public static void main (String[] args) {
		//code
		ArrangeArray  obj = new ArrangeArray ();
		int arr[] = {9,4,-2,-1,5,0,-5,-3,2};
		//9 -2 4 -1 5 -5 0 -3 2 
		obj.arrangeArr(arr);
		printArr(arr);
	}
	
	private static void printArr(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	//9 -2 4 -1 5 0 -5 -3 2 
	public void arrangeArr(int[] arr){
	   int point = sortArray(arr);
	   
	   printArr(arr);
	   int start = 1; 
	   for(int i=point;i< arr.length; i++){
		   int temp = arr[start];
		   arr[start] = arr[i];
		   int j = start;
		   j++;
		   while(j<=i){
			   int temp2 = arr[j];
			   arr[j] = temp;
			   temp = temp2;
			   j++;
		   }
		   start= start+2;
		   if(i-point>=point || start>arr.length-1)
			   break;

	   }
	   

	}
	public static int sortArray(int [] arr){
	    int high = arr.length-1;

	    
	    int pivot = 0; 
        int i = -1; // index of smaller element
        for (int j=0; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] >= pivot)
            {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)

 //9 -2 4 -1 5 -5 0 -3 2
        return i+1;
	    
	}
}