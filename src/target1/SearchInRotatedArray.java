package target1;

public class SearchInRotatedArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,6,7,1,1,1,1,1,1}; //  1 2 3 4 5 6 7 
		// 4 5 6 7 0 1 2 2
		System.out.println("res "+search(nums,3));
	
	}
	
	   public static boolean search(int[] nums, int target) {
	       if(nums.length<1)
	           return false;
	        int partition = partition(nums);
	        System.out.println("partition "+partition);
	        return search (nums, partition, target, 0, nums.length-1);
	      
	    }
	    
	    public static int partition(int[] nums){
	        int len = nums.length;
	        int high = len-1;
	        int start =0;
	        int mid;
	        
	        while(start < high){
	            mid = start + (high-start)/2;
	            System.out.println("mis"+mid);
	            if(nums[mid] <= nums[high])
	                high = mid;
	            else 
	                start = mid+1;
	            
	        }
	        
	        return start;
	        
	    }
	    
	    public static boolean search(int[]nums, int partition, int target, int start, int end){
	        int len = nums.length;
	        System.out.println("came"+start+" "+end);
	       while(start<=end)
	       {
	    	   
	        int mid =  start + (end-start)/2;
	        int rotatedmid = (mid+partition+1)%len;
	        System.out.println("roatedmid "+rotatedmid+ "mid "+mid);
	        if(nums[rotatedmid]==target)
	            return true;
	        if(nums[rotatedmid] >= target)
	            end = mid-1;
	        else 
	            start = mid+1;
	        System.out.println(start+" "+end);
	       }        
	       return false; 
	    }
	}
/****
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,3,1,1}; //3-------4---7 0 1 2 3 
		int low = 0; int high = nums.length-1;
		while(low<high){
			System.out.println(low +" l ow "+high);
			int mid = (low + (high-low)/2);
			if((nums[mid] < nums[high]) || ((nums[mid] == nums[high])))
				high = mid;
			else
				low = mid + 1;
			
			
			
		}
		int rotation = low;
		System.out.println("rotation"+rotation);
		int n = nums.length; 
		low = 0; high =  n; 
		int target = 3;
		while(low<=high){
			int mid = (low + (high-low)/2);
			int rotmid = (mid+rotation) % n;
			System.out.println("  "+rotmid);
			if(nums[rotmid]==target)
			{
				System.out.println("ans"+ rotmid);
				break;
			}
			if(nums[rotmid]<target)
				low = mid+1;
			else
				high = mid-1;
		}
		
	}
	
	public int search(int[] nums, int target){
		// 4 5 6 7 0 1 2	
		//1   // 4 5 6 7 8 9 1 // 4 6  7 8 9 1
		/****
		 * 7  choice :  arr[mid] < target {		
		if(arr[i+1]>arr[i] )//start = mid;
			else{return;}
		arr[mid]>target
		}
		
		
		int low = 0; int high = nums.length-1;
		while(low<high){
			int mid = (low + (high-low)/2);
			if(nums[mid] > nums[high])
				low = mid+1;
			else
				high = mid;
		}
		
		System.out.println("looo"+low);
		return 0;
	}

}

***/
