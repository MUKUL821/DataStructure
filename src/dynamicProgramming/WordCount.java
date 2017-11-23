package dynamicProgramming;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "carcoal";
		 List<String> wordDict = new ArrayList<String>();
		 wordDict.add("car");wordDict.add("co");wordDict.add("coa");wordDict.add("coal");
		System.out.println("Res: " + wordBreak(s, wordDict));
	}
	 public static boolean wordBreak(String s, List<String> dict) {
	        
		 boolean[] f = new boolean[s.length() + 1];  
	        f[0] = true;
	       
	        for(int i=1; i <= s.length(); i++){
	        	System.out.println("i is" + i);
	            for(int j=0; j < i; j++){
	            	System.out.println("f[j] :"+f[j]);
	                if(f[j] && dict.contains(s.substring(j, i))){
	                	System.out.println(s.substring(j, i)+ " j is"+j);
	                    f[i] = true;
	                    break;
	                }
	            }
	        }
	       
	        for(boolean ss: f)
	        	 System.out.print(" "+ ss);
	        return f[s.length()];
	        
	    }
}
