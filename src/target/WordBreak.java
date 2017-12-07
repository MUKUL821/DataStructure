package target;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
		List<String> dic = Arrays.asList(new String[]{"cat", "cats", "and", "sand", "dog"});
		wordBreak("catsanddog",dic);

	}
	static String s =null;
	static HashMap<Character, List<String>> map;
	    public static List<String> wordBreak(String str, List<String> wordDict) {
	        List<String> res = new  ArrayList<String>();
	        s = str;
	        map = new HashMap<Character, List<String>>();
	        for(String word: wordDict){
	            char ch = word.charAt(0);
	            if(!map.containsKey(ch))
	                map.put(ch, new ArrayList<String>());
	         
	            List<String> ls = map.get(ch);
	            ls.add(word);
	        }
	  
	        wordBreak("", map, str, res);
	     
	        return res;
	    }
	    //catsanddog
	    public  static void wordBreak(String temp, HashMap<Character, List<String>> map, String str, List<String> res) {
	    
	      
	            char ch = str.charAt(0);
	           
	            if(!map.containsKey(ch))
	                return;
	             List<String> bag = map.get(ch);
	            
	            for(String w: bag){
	            	
	              if(w.length()<= str.length() && str.indexOf(w) == 0){
	            	  if(str.length() == w.length()){
	            		  String mystr = new String(temp+" "+w);
	            		 res.add(mystr.substring(1)); 
	            	  }
	            	  else{
	            		
	            		  wordBreak(temp+" "+w, map, str.substring(w.length()), res);
	            	  }  
	            	 
	                  
	                  }
	            }
	            

	        
	    }
}
