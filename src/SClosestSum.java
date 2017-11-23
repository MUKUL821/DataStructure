import java.util.Arrays;

public class SClosestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-3,-2,-5,3,-4};
		System.out.println("aans: "+threeSumClosest(nums, -1));
	}

	  public static int threeSumClosest(int[] nums, int target) {
	        if(nums.length < 3)
	            return 0;
	        Arrays.sort(nums);
	        int n = nums.length;
	         int ans = nums[0] + nums[1] + nums[2];
	        //{-3,-2,-5,3,-4}; => -5,-4,-3,-2,3
	    for (int i = 0; i < n-2; i++) {
	        int j = i + 1;
	        int k = n - 1;
	        while (j < k) {
	        	System.out.println(j+"j/k"+k);
	            int sum =nums[i] + nums[j] + nums[k];
	            if (Math.abs(target - ans) > Math.abs(target - sum)) {
	                ans = sum;
	                if (ans == target) return ans;
	            }
	            System.out.println("sum and target"+sum+" , "+target);
	            if(sum > target) 
	                k-- ;
	            else
	                j++;
	        }
	    }
	    return ans;
	        
	    }
}
