package imp;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	// Best way DP with Binary Search
	   public static int lengthOfLIS(int[] nums) {
	        int[] dp = new int[nums.length];
	        int len = 0;
	        for (int num : nums) {
	            int i = Arrays.binarySearch(dp, 0, len, num);
	            if (i < 0) {
	                i = -(i + 1);
	            }
	            dp[i] = num;
	            if (i == len) {
	                len++;
	            }
	        }
	        
	        return len;
	    }
    /**
     * DP way of solving LIS
     */
    public int longestSubsequenceWithActualSolution(int arr[]){
        int T[] = new int[arr.length];
        for(int i=0; i < arr.length; i++){
            T[i] = 1;  
        }
        int maxIndex = Integer.MIN_VALUE;
        int max_global= Integer.MIN_VALUE;
        for(int i=1; i < arr.length; i++){
        	 maxIndex = 0;
            for(int j=0; j < i; j++){
                if(arr[i] > arr[j]){
                    maxIndex = Math.max(T[j], maxIndex);
                }
            }
            T[i] = maxIndex +1;
            max_global = Math.max(max_global, T[i]);
        }

        return max_global;
    }
    
    /**
     * Recursive way of solving LIS
     */
    public int longestSubsequenceRecursive(int arr[]){
        int maxLen = 0;
        for(int i=0; i < arr.length-1; i++){
            int len = longestSubsequenceRecursive(arr,i+1,arr[i]);
            if(len > maxLen){
                maxLen = len;
            }
        }
        return maxLen + 1;
    }
    
    private int longestSubsequenceRecursive(int arr[], int pos, int lastNum){
        if(pos == arr.length){
            return 0;
        }
        int t1 = 0;
        if(arr[pos] > lastNum){
            t1 = 1 + longestSubsequenceRecursive(arr, pos+1, arr[pos]);
        }
        int t2 = longestSubsequenceRecursive(arr, pos+1, lastNum);
        return Math.max(t1, t2);
    }
    
    public static void main(String args[]){
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int arr[] = {23,10,22,5,33,8,9,21,50,41,60,80,99, 22,23,24,25,26,27};
        int result = lis.longestSubsequenceWithActualSolution(arr);
        int result1 = lis.longestSubsequenceRecursive(arr);
        System.out.println(result);
        System.out.println(result1);
        
        System.out.println(" d with binary"+ lengthOfLIS(arr));
    }
}