package conceptTest;

public class SearchRotatedElement {

	public static void main(String[] args) {
		int []elem = {4,5,6,7,0,1}; 
		int res = search(elem, 0);
		System.out.println("result is : "+res);
		
	}
	
	public static int search(int[] nums, int target){
		 int lo = 0, hi = nums.length; 
		    while (lo < hi) {
		        int mid = (lo + hi) / 2;
		        System.out.println(" befor "+ (nums[mid] < nums[0]));
		        double num = (nums[mid] < nums[0]) == (target < nums[0])
		                   ? nums[mid]
		                   : target < nums[0] ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
		        System.out.println("num is: "+num);  
		        if (num < target)
		            lo = mid + 1;
		        else if (num > target)
		            hi = mid;
		        else
		            return mid;
		    }
		    return -1;
		
		//return searchIter(nums, 0, nums.length-1, target);
		
	}

	public static int searchIter(int []nums, int start, int end, int target){
		int mid = (end-start)/2+start;
		System.out.println("mid "+start+" "+ end+ " "+mid);
		if(nums[mid] ==target)
			return mid;
		
		if(mid > end)
			return -1;
		
		if(nums[mid]>target && nums[mid]>nums[mid-1]){
			if(target >= nums[start])
					return searchIter(nums, start, mid-1, target);
			}
			return searchIter(nums, mid+1, end, target);
			
	
	
	}}
