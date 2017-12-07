package levelMedium;

public class MaximumSumNonOverloop {

	public static void main(String[] args) {
		int[] nums = {2, 0, 1, 3, 4, 5,  6, 4, 4};
		maxSumOfThreeSubarrays(nums,2,0);

	}
	
	 public static int[] maxSumOfThreeSubarrays(int[] nums, int k, int s) {
		int sum = 0;
		int[] sum_array = new int[nums.length];
		int limit = k-1;
		// 2 0 1 3 4 5  6 4 4 //  1 2 3         4-limit
		 for(int i = 0; i < nums.length;i++){
			 if(i <= limit){
				 sum += nums[i];
				 sum_array[i] = 0;
				 System.out.println("sum "+sum);
			 }	 
			 else{
				 System.out.println(" ---- "+(i- k));
				 sum += nums[i];
				 sum_array[i] = sum;
				 sum = sum - nums[i- k];
			 }
		 }
		
		 for(int num : sum_array)
			 System.out.println(" "+num);
		 
		 
		 return nums;
	      
	    }

}
