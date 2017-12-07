import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class RemoveInvalidParanthesis {

	public static void main(String[] args){
		String s = "(()))()";
		String x = "0";
		String y = "1";
		//if(Intege5x> (int)y)
		if(Integer.valueOf(x) < Integer.valueOf(y))
		System.out.println("working...");
		//removeInvalidParentheses(s);
		Integer[] num = {3,4,1,4,1};
		List<Integer> a = Arrays.asList(num);
		
		System.out.println(" invalid..."+removeInvalidParentheses("()())()"));
		
	}

	private static  List<String> removeInvalidParentheses(String s) {
		// TODO Auto-generated method stub
		List<String> res = new ArrayList<>();
		if(s==null)
			return res;
	  Set<String> visited = new HashSet<>();
      Queue<String> queue = new LinkedList<>();
      
      queue.add(s);visited.add(s);
	 boolean found = false; 
      while(!queue.isEmpty()){
    	
    	  s = queue.poll();
    	  
    	 if(isValid(s)){
    		 res.add(s);
    		 found =true;
    	 }
    	 if (found) continue;
    	 for(int i=0; i < s.length(); i++){
    		 if (s.charAt(i) != '(' && s.charAt(i) != ')') continue;
    		 String t = s.substring(0, i) + s.substring(i + 1);
    		 if(!visited.contains(t)){
    			 queue.add(t);
    			 visited.add(t);
    		 }
    		 
    	 }
    		 
    	 }
      return res;
    	  
      }

	private static boolean isValid(String s) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i)=='(') count++;
			if(s.charAt(i)==')' && count-- == 0) 
				return false;
	
		}
		return (count ==0);
			
	}
			
}
	