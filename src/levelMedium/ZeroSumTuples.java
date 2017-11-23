package levelMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ZeroSumTuples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {-1,0,1,2,-1,-4};
		 List<List<Integer>> ls = threeSum(nums);
		 

	}
	 public static List<List<Integer>> threeSum(int[] nums) {
		 List<List<Integer>> res = new  ArrayList<List<Integer>>();
	       Set<List<Integer>> sett = new HashSet<List<Integer>>();
		        
		        int len = nums.length;
		        if(len < 3){
		            return new ArrayList<List<Integer>>();
		        }
		       // -4 -1 -1 0 1 2
		        
		        Arrays.sort(nums);
		        for(int i = 0; i < len; i++){
		            int target = 0 - nums[i];
		            int start = i+1; int end = len-1;
		           
		             if(i > 0 && (nums[i-1]==nums[i]) || (target > nums[len-1]+nums[len-2]) ){
		               continue;  
		            }
		            while(start < end){
		               
		            	 int sum = nums[start]+nums[end];
		           
		                if(sum == target){
		                    List<Integer> tuples= new ArrayList<Integer>();
		                    tuples.add(nums[i]);
		                    tuples.add(nums[start]); 
		                    tuples.add(nums[end]);
		                   
		                    res.add(tuples);
	                        
	                    while(start < end && nums[start+ 1] == nums[start]) {
	                        start++;
	                    }
	                    while(start < end && nums[end - 1] == nums[end]) {
	                        end--;
	                    }
	                    
		                    start++; end--;
		                }
		                else
		                    if(sum < target)
		                        start++;
		                else
		                    end--;      
		                
		            }
		            
		    
		            
		        }
		        
		           
		           return res;     
	    }
}
