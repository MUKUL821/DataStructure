package levelHard;

import java.util.Arrays;
import java.util.Random;



public class LargestNumber {

	public static void main(String[] args) {
	// 1 2 3 4 5 6 
		
		int[] nums = {6,30,38,31,24,89,0,90}; //0,6,24,30,31,38,89,90
		String s = Arrays.toString(nums);
		System.out.println(" "+findKthLargest(nums, 4));
		
	

	}
	 private static int partition(int[] a, int lo, int hi) {

	        int i = lo;
	        int j = hi + 1;
	        while(true) {
	            while(i < hi && less(a[++i], a[lo]));
	            while(j > lo && less(a[lo], a[--j]));
	            if(i >= j) {
	                break;
	            }
	            exch(a, i, j);
	        }
	        exch(a, lo, j);
	        return j;
	    }

	    private static void exch(int[] a, int i, int j) {
	        final int tmp = a[i];
	        a[i] = a[j];
	        a[j] = tmp;
	    }

	    private static boolean less(int v, int w) {
	        return v < w;
	    }

	public static int findKthLargest(int[] nums, int k) {

        shuffle(nums);
        
        k = nums.length - k;
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            final int j = partition(nums, lo, hi);
            if(j < k) {
                lo = j + 1;
            } else if (j > k) {
                hi = j - 1;
            } else {
                break;
            }
        }
        return nums[k];
    }

private static void shuffle(int a[]) {

        final Random random = new Random();
        for(int ind = 1; ind < a.length; ind++) {
            final int r = random.nextInt(ind + 1);
            exch(a, ind, r);
        }
    }
}