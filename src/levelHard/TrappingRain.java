package levelHard;

public class TrappingRain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println("Rain water is: "+trap(height));
	}
	public static int trap(int[] height) {
		if(height.length < 1)
			return 0;
		
		int left_max = 0;
		int right_max = 0;
		int right = height.length-1;
		int left = 0;
		// [0,1,0,12,1,0,1,13,2,1,2,1]
		int water=0;
		while(left < right){
            left_max = Math.max(height[left], left_max);
            right_max = Math.max(height[right], right_max);
			if( left_max <  right_max){
				 water += left_max - height[left];
				left++;
			}
			else{
				water += right_max - height[right];
				right--;
			}
	
		}
	
		
		return water;

	}
	
}
