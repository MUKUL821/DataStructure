package conceptTest;

import java.util.Arrays;

public class MaximumSubsequenceSum {

	public static void main(String[] args) {
		  //int array[] = {10, -9, 4, 5, 90, -19, 19}; // Max sum is 100
	        int array[] = {9, -9 , 4, -3, 6, 10,-1, -19,-19, -20}; // Max Sum is 7
	        //int array[] = {-1, -2, -3}; // Max Sum is -1
	        //int array[] = {1, -2, -3}; // Max Sum is 1
	        //int array[] = {-4, -3, -6}; // Max Sum is -3
	        //int array[] = {-6, 0, 5}; // Max Sum is 5
	        //int array[] = {0, 0, 0}; // Max Sum is 0
	        int[] maxSubArray = getMaxSubArray(array);
	      //  System.out.println("ans: "+maxSubArray);
	        System.out.println(Arrays.toString(maxSubArray));

	}

	private static int[] getMaxSubArray(int[] arr) {
		int max_global = arr[0];
		int sum_so_far = arr[0];
		int start = 0; int s=0; int end =0;
		// int array[] = {4, -3, 6, -1, 10, 9,-19, -20};
		for(int i = 1; i < arr.length; i++){
			sum_so_far +=arr[i];
			if(sum_so_far > max_global){
				max_global = sum_so_far;
				System.out.println("ms: "+max_global);
				start = s;
				end = i;
				
			}
			
			if(sum_so_far <= 0){
				sum_so_far = 0;
				s = i+1;
				System.out.println("yes "+ s);
			}
			
			

		}
		return new int[]{start, end};
	}

}
