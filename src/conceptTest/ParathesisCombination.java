package conceptTest;

import java.util.ArrayList;
import java.util.List;

public class ParathesisCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = generateParenthesisDFS(4);
		for(String s: ls)
			System.out.println("ans:  "+s);
	}
	public static List<String> generateParenthesisDFS(int n) {
	    List<String> list = new ArrayList<String>();
	    generateOneByOne("", list, n, n);
	    return list;
	}
	
	public static void generateOneByOne(String sublist, List<String> list, int left, int right){
	    if(left > right){
	        return;
	    }
	    if(left > 0){
	        generateOneByOne( sublist + "(" , list, left-1, right);
	    }
	    if(right > 0){
	        generateOneByOne( sublist + ")" , list, left, right-1);
	    }
	    if(left == 0 && right == 0){
	        list.add(sublist);
	        return;
	    }
	    
	}	 public static List<String> generateParenthesis(int n) {
	        List<String> list = new ArrayList<String>();
	        backtrack(list, "", 0, 0, n);
	        return list;
	    }
	    
	    public static void backtrack(List<String> list, String str, int open, int close, int max){
	        
	        if(str.length() == max*2){
	            list.add(str);
	            return;
	        }
	        
	        if(open < max)
	        	backtrack(list, str+"(", open+1, close, max);
	  
	        if(close < open)
	            backtrack(list, str+")", open, close+1, max);
	        
	        System.out.println("fullll................"+str);
	    }
}
