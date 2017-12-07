package tree;

import java.util.LinkedList;
import java.util.List;

public class diffWaytoCompute {

	public static void main(String[] args) {
		List<Integer> res = diffWaysToCompute("2*3-5");
		System.out.println(" res "+res.toString());

	}
	
	 public static List<Integer> diffWaysToCompute(String input) {
	        List<Integer> ret = new LinkedList<Integer>();	        
	        for(int i = 0; i < input.length(); i++){
	        	char ch = input.charAt(i);
	        	if(ch == '*' || ch == '+' || ch == '-'){
	        		String part1 = input.substring(0, i);
	        		String part2 = input.substring(i+1);
	        		System.out.println("part1  "+part1+ " part2 "+part2);
	        		List<Integer> ls1 = diffWaysToCompute(part1);
	        		List<Integer> ls2 = diffWaysToCompute(part2);
	        		
	        		for(Integer p : ls1){
	        			for(Integer q: ls2){
	        				 int c = 0;
	        				 System.out.println(" input.charAt(i)"+ i+ "input "+input);
	        				switch(input.charAt(i)){
	        				case '+':
	        					c = (p+q);
	        					break;
	        				case '-':
	        					c = (p-q);
	        					break;
	        				case '*':
	        					c = (p*q);
	        					break;
	        				}
	        				ret.add(Integer.valueOf(c));
	        			}
	        		}
	        	}		
	        }
	        if(ret.size()==0){
	        	System.out.println( "input "+input);
	        	ret.add(Integer.valueOf(input));
	        }
        		
	        return ret;
	    }
}
