package conceptTest;

import java.util.ArrayList;
import java.util.List;

public class PermutationsBacktracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {1,3,2};
		List<List<Integer>> list = permute(nums);
		System.out.println("result"+list.size());
		for(List<Integer> s: list)
			System.out.println("ans:  "+s);
	}
	public static List<List<Integer>> permute(int[] nums) {
		   List<List<Integer>> list = new ArrayList<>();
		   // Arrays.sort(nums); // not necessary
		   backtrack(list, new ArrayList<>(), nums);
		   return list;
		}

		private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
		   if(tempList.size() == nums.length){
		      list.add(new ArrayList<>(tempList));
		   } else{
			   System.out.println("no");
		      for(int i = 0; i < nums.length; i++){
		    	
		    
		         if(tempList.contains(nums[i])) continue; // element already exists, skip
		         
		         tempList.add(nums[i]);
		         //System.out.println("added");
		         backtrack(list, tempList, nums);
		         tempList.remove(tempList.size() - 1);
		         
		      }
		   }
		} 

}
