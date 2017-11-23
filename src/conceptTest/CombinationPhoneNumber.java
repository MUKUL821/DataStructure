package conceptTest;

import java.util.LinkedList;
import java.util.List;

public class CombinationPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<String> ans = letterCombinations("456");
		for(String s: ans)
			System.out.println(" -- "+s);

	}
	public static List<String> letterCombinations(String digits) {
		LinkedList<String> ans = new LinkedList<String>();
	    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	    ans.add("");
	    for(int i =0; i < digits.length(); i++){
	    	 int x = Character.getNumericValue(digits.charAt(i));
	    	 while(ans.peek().length()==i){
	    		 String init =  ans.remove();
	    		 System.out.println(" init is :"+init);
		    	 for(char s : mapping[x].toCharArray())
		    		ans.add(s+init);
		    	
	    	 }
	    	 
	    	 System.out.println(" ans pppppppis :"+ans);
	    	 }
	    
	    
/***	    for(int i =0; i < digits.length();i++){
	        int x = Character.getNumericValue(digits.charAt(i));
	        System.out.println(" x is :"+x);
	        while(ans.peek().length()==i){
	            String t = ans.remove();
	            System.out.println(" t and  mapping[x] is :"+t+"  mapping[x]"+ mapping[x]);
	            for(char s : mapping[x].toCharArray())
	                ans.add(t+s);
	            System.out.println("ans is :"+ans);
	        }
	    }
	    **/
	    return ans;
	}

}
