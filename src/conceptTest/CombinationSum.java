package conceptTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
//https://leetcode.com/problems/combination-sum/discuss/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {3,5,3,7,1,2};
		List<List<Integer>> ls = combinationSum(nums, 7);
		for(List<Integer> s: ls)
			System.out.println("ans:  "+s);
	}
	public static List<List<Integer>> combinationSum(int[] nums, int target) {
	    List<List<Integer>> list = new ArrayList<>();
	    Arrays.sort(nums);
	    backtrack(list, new ArrayList<>(), nums, target, 0);
	    return list;
	}

	private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
	    if(remain < 0) return;
	  
	    else if(remain == 0) list.add(new ArrayList<>(tempList));
	    else{ 
	        for(int i = start; i < nums.length; i++){
	        	 // if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
	            tempList.add(nums[i]);
	            backtrack(list, tempList, nums, remain - nums[i], i+1); // not i + 1 because we can reuse same elements
	            tempList.remove(tempList.size() - 1);
	        }
	    }
	}

}
