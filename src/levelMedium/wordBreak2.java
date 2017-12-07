import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class wordBreak2 {

	public static void main(String[] args) {
		 List<String> ls = new  ArrayList<String>(Arrays.asList("cat", "cats", "and", "sand", "dog"));
		 List<String> res = new  ArrayList<String>();
		 formWord("catsand", "", "",ls, res, 0);
		 System.out.println(" res is "+res.toString());
	}

	public static void formWord(String s, String line, String str, List<String> ls,   List<String> res, int start){
		 int len = s.length(); 
		 Set<String> set;
		 Map<Character, Set<String>> map = new HashMap<Character, Set<String>>();
	        for(String word: ls){
	            char ch = word.charAt(0);
	            if(map.containsKey(ch)){
	               set = map.get(ch);
	            }
	            else{
	                set = new HashSet<String>();
	            }
	             set.add(word);
	            map.put(ch, set);
	        }
	        
	        
	        for(int)
		
		
	} 
}
