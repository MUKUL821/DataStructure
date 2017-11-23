package levelMedium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PhoneCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" result : "+ letterCombinations("20") );
	}
	  public static List<String> letterCombinations(String digits) {
	        LinkedList<String> res = new LinkedList<String>();
	        if(digits.length()<1)
	            return res;
	        String arr[] = {"0", "1", "abc", "def", "ghi", "jkl","mno", "pqrs", "tuv", "wxyz"};
	        res.add(new String(""));
	        for(int i =0; i < digits.length(); i++){
	        	
	          String target = arr[Character.getNumericValue(digits.charAt(i))];
	         //System.out.println("target"+target);
	             int size = res.size(); int start =0;
	               while(start < size){
	                   String t = res.peek();
	                   System.out.println("t is "+t);
	                   res.pop();
	                   for(int j=0; j < target.length(); j++)
	                       res.add(new String(t + (target.charAt(j))));
	                   
	                  
	                  start++;
	                  // System.out.println(res);
	               }
	               
	           
	            
	        }
	        return res;
	    }
	
}
