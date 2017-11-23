package levelMedium;

public class MoveZeroes {

	public static void main(String[] args) {
		//nums = [0, 1, 0, 3, 12]   : Result : [1, 3, 12, 0, 0]
		int [] nums = {0,1,0,5,2,7,4,6,3,12, 0};
		moveZeroes(nums);
		//not in place sorting

	}
	
	 public static void moveZeroes(int[] nums) {
	     int lastNonZeroFoundAt = 0 ;
		 for (int cur = 0; cur < nums.length; cur++) {
      if (nums[cur] != 0)
            nums[lastNonZeroFoundAt++] =  nums[cur] ;
      
  }
       for( ; lastNonZeroFoundAt< nums.length; lastNonZeroFoundAt++)
           nums[lastNonZeroFoundAt] =0;
   }
}