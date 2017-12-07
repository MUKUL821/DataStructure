package levelMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {2,3,6,7};
		combinationSum(candidates, 7);
	}
	
	 public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		 List<List<Integer>> ls = new ArrayList<List<Integer>>();
		 List<Integer> sublist = new ArrayList<Integer>();
	 	Arrays.sort(candidates);
        backtracking(ls, sublist, candidates, 0, target);
        System.out.println("ls is "+ls.size());
        for(List<Integer> l: ls)
        	System.out.println("list "+l);
		return ls;
	    }
	 public static void backtracking(List<List<Integer>> ls, List<Integer> sublist, int[] nums, int start, int remain){
		 if(remain < 0) return;
		 System.out.println("main-----------");
		 if(remain == 0){
			 ls.add(new ArrayList<>(sublist));
			 //System.out.println("ADEDEDED: "+sublist);
		 }
		    else{ 
		        for(int i = start; i < nums.length; i++){
		        	
		            sublist.add(nums[i]);
		            //System.out.println(i+" yes before"+ remain);
		            backtracking(ls, sublist, nums, i ,remain - nums[i]);
		            //System.out.println(i+" yes after"+ remain);
		            // not i + 1 because we can reuse same elements
		            sublist.remove(sublist.size() - 1);
		        }
		    }
		 
	 }

}
