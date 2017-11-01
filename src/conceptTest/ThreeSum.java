package conceptTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,-1, 0,1, 2};//-1, 0,0,1
		tupleSum(arr);

	}


    public static List<List<Integer>> tupleSum(int[] nums) {
    	 List<List<Integer>> result = new ArrayList<List<Integer>>();
         if(nums.length < 3)
             return result;
         Arrays.sort(nums);
         int start = 0;
         int len = nums.length;
         while(start <= len - 3){
              if(nums[start]==0 && nums[start+2]==0){
       
             	 result.add(Arrays.asList(nums[start], nums[start+1], nums[start+2]));
             	 start+=2;
             	 continue;
              }
             	
              
              for(int i = start+1; i <= len - 2;i++){
                
                  int mid = len - 1;
                  while(mid > i){
                      int sumadd = nums[i] +nums[start]+ nums[mid];
                      //System.out.println("sum"+ i);
                      if(sumadd == 0){ 
                    	  if(start ==0 || nums[start]!=nums[start-1]) {
                    	 System.out.println("yoo"+i+ " "+start);
                    	 System.out.println(nums[start]+" "+nums[i]+" "+nums[mid]);
                    	 result.add(Arrays.asList(nums[start], nums[i], nums[mid]));
                    	  }
                    	 // System.out.println(nums[start]+" "+nums[i]+" "+nums[mid]);
                         // result.add(Arrays.asList(nums[start], nums[i], nums[mid]));
                          mid --;
                    	  
                         }
                      else if(sumadd > 0)
                          mid--;
                      else 
                          break;
                      
                  }
                  
              }
            
             start++;
         }
         return result;
    }
}

