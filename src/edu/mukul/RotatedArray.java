package edu.mukul;

import java.util.*;

class RotatedArray {
  
	public static int findPivot(int[] arr, int left, int right ){
// int [] arr = {43 92 3 5 28 37 };
        if(left > right)
        return 0;
        
        System.out.println("--"+ left+" "+right);
        
        int mid = left + (right - left)/2;
        if(mid < 0 || mid == arr.length-1)
        	return 0;
        
        System.out.println("mid"+ mid);
        
        if (arr[mid] > arr[mid+1])
            return mid+1;
        else if (mid!=0 && arr[mid] < arr[mid-1])
            return mid;
        else if(arr[mid] > arr[0])
             return findPivot(arr,mid+1, right); 
        else
             return findPivot(arr, left, mid-1);
       
     
 
    }
    public static int findRotation(int[] arr){
    	
        int len = arr.length;
        return findPivot(arr, 0, len-1);
        
    }
	public static void main (String[] args) {
	    /***
		sc = new Scanner(System.in);
     //choice
    int test_num = sc.nextInt();
    for(int k =0; k< test_num; k++){
    int arr_length = sc.nextInt();

    int []arr = new int[arr_length];
    for(int i = 0; i < arr_length; i++)
		arr[i] = sc.nextInt();
    
    
}**/
    int [] arr = {5,1,2,3,4};
    

    int output = findRotation(arr);
    if(output ==0 && arr[0] == arr[arr.length-1])
    { int i=0;
        for(i=0; i<arr.length;i++){
            if(arr[i]>arr[i+1])
            break;
        }
        output = i+1;
    }
    System.out.println("output is"+output);
}
}