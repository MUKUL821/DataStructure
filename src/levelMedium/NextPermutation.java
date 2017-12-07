
public class NextPermutation {
	public static void main(String[] args) {
		int[]nums = {1,3,2};
		nextPermutation(nums);
		for(int num: nums)
			System.out.print(" "+num);           
	}
	
	
	 public static void nextPermutation(int[] nums) {

	        int i = nums.length-2;
	        while(i >= 0){
	            if(nums[i] < nums[i+1]){
	                break;
	            }       
	            i--;
	        }
	       // System.out.println("i is "+i);
	        if (i >= 0) {
	            int j = nums.length - 1;
	            while (j >= 0 && nums[j] <= nums[i]) {
	                j--;
	            }
	           // System.out.println("j is "+j);
	            int temp = nums[i];
		         nums[i]= nums[j];
		          nums[j] = temp;
	        }
	       
	        // reverse now
	        int s = i+1; int end = nums.length-1;
	  
	              while(s<end){
	                        int temp1 = nums[s];
	                        nums[s]= nums[end];
	                        nums[end] = temp1;
	                        s++; end--;
	                    }


	        
	    }
}
