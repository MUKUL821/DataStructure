package conceptTest;

public class SearchRange {
// https://leetcode.com/problems/combination-sum/discuss/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] nums = {1,2,3,4,5,5,5,5};
 int [] result = searchRange(nums, 5);
 
 for (int i: result)
	 System.out.println("i is:"+i);
	}
	 public static int[] searchRange(int[] A, int target) {
	        int[] range = {A.length, -1};
	        searchRange(A, target, 0, A.length - 1, range);
	        if (range[0] > range[1]) range[0] = -1; 
	        return range;
	    }
	    
	    public static void searchRange(int[] A, int target, int left, int right, int[] range) {
	        if (left > right) return;
	        int mid = left + (right - left) / 2;
	        if (A[mid] == target) {
	            if (mid < range[0]) {
	                range[0] = mid;
	                searchRange(A, target, left, mid - 1, range);
	            }
	            if (mid > range[1]) {
	                range[1] = mid;
	                searchRange(A, target, mid + 1, right, range);
	            }
	        } else if (A[mid] < target) {
	            searchRange(A, target, mid + 1, right, range);
	        } else {
	            searchRange(A, target, left, mid - 1, range);
	        }
	    }
}
