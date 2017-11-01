package edu.mukul;

import java.util.HashMap;
import java.util.Map;
/*mukul*/
public class TwoSumArray {
//using hashmap..timecomplexity is O(n); Another less efficient way is sorting..O(log n)
	public static void main(String[] args) {
		int[] arr = {-3,0,3,4};
		int sum =0;
		int[] result = twoSum(arr, sum);
	if (result!=null){
		
		 System.out.print("Result :"+result[0]+" ");
         System.out.println(result[1]); 
	}
	else
		 System.out.println("null");
    

	}
	 public static int[] twoSum(int[] numbers, int target) {
	
	        int[] result = new int[2];
	        Map<Integer, Integer> map = new HashMap();
	        for(int i=0; i< numbers.length; i++){
	            System.out.println("number"+numbers[i]);
	              
	               
	            int diff = target - numbers[i];
	            System.out.println("diff"+diff);
	         

	            if(map.containsKey(diff))
	            {
	                result[0] = diff;
	                result[1]= i+1;
	               
	                return result;
	                
	            }
	         
	          map.put(numbers[i], i+1);  
	            
	        }
	        return null;
	        
	    }
}
