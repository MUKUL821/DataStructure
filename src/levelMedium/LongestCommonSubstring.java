import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubstring {
	public static void main(String[] args){
		String[] strs = {"c", "c"};
		//System.out.println(("ab").substring(0,1));;
		System.out.println("res "+  longestCommonPrefix(strs));
		int [] arr = {1,2,1,3,2,5};
		System.out.println("res "+  singleNumber(arr));
		
	}
	 public static int[] singleNumber(int[] nums) {
         int [] arr = new int[2];
        if(nums.length<2)
            return arr;
         List<Integer> ls = new ArrayList<Integer>();
        for(int i =0; i < nums.length; i++){
        	System.out.println(" "+nums[i] + " " + ls.indexOf(nums[i]));
            if(ls.indexOf(nums[i]) == 0)
                ls.remove(new Integer(nums[i]));
            else
                ls.add(nums[i]);
        }
        System.out.println(" ls is "+ls);
        int t = 0;
        for(int i: ls)
        arr[t++] = i;
            
    
        return arr;
         
        
        
        
        
    }
    public static String longestCommonPrefix(String[] strs) {
   
    	int min=0;
      for(int i =0; i < strs.length; i++){
    	  System.out.println("entering");
    	  if(strs[i].length() < strs[min].length())
    		  min = i;  
      }
      System.out.println("min us"+min);
      String res = strs[min];
      int j = 0;
      while(res.length() > 0 && j < strs.length){
    	 System.out.println(" "+strs[j].substring(0, res.length())+ " "+res);
    	  if(strs[j].substring(0, res.length()).equals(res))
    		  j++;
    	  else
    	  {
    		  //System.out.println("res: "+res);
    		  if(res.length() >1)
    			  res = res.substring(0,res.length()-1);
    		  else
    			  return null;
    			  
    	  }
    		 
      }
       return res;
    }

}

