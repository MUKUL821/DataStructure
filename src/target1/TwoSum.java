package target1;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {0,4,3,0};
		int []res = twoSum(nums, 0);
		System.out.println("res "+res[0]+ " "+res[1]);
	}
	
    public static int[] twoSum(int[] nums, int target) {
        int []res = new int[2];
        //3,2,4 = 6 
       
        if(target < nums[0] || nums.length < 2)
            return res;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i =0; i< nums.length; i++){
            
            if(map.containsKey(target-nums[i]))
            {
            	System.out.println(target-nums[i]+ " "+ map.get(2)+ " "+ map.get(3));
                res[0] = map.get(target-nums[i]); res[1] = i ;
                  return res;
            }
              
            else
                map.put(nums[i], i);
            
            System.out.println(map);
                    
        }
        
        return res;
        
    }

}
