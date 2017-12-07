
public class FirstMissingNumber {

	public static void main(String[] args) {
		int[] nums = {3,-2,4,1,2,-1,6};
		// 1 -2 3 4 -1 0
		System.out.println("ANS: "+firstMissingPositive(nums));
			
	}
	public static int firstMissingPositive(int[] nums) {
        
		//System.out.println(" length "+nums.length);
	        for(int i = 0; i < nums.length; i++){
	        	//System.out.println(" "+nums[i]+ " i "+i);
	        	while(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i]-1]){
	        		int temp = nums[i];
	            	int pos = nums[i]-1;
	                nums[i] = nums[nums[i]-1];
	                nums[pos] = temp;
	            }   
	        	
	        }
	        int i=0;
	        System.out.println(" length "+nums.length);
	        for(i=0; i < nums.length; i++){
	        	System.out.println(" "+nums[i]+ " i "+i);
	        	//if(nums[i] != (i+1))
	        		//break;
	        	
	        }
	        return i+1;
 }
}
