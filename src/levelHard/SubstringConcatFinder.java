package levelHard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubstringConcatFinder {

	public static void main(String[] args) {

		String[] words= {"word","good","best","good"};
		findSubstring("wordgoodgoodgoodbestword", words);

	}
	
	 public static List<Integer> findSubstring(String s, String[] words) {
		 List<Integer> res = new ArrayList<Integer>();
	        if(words.length == 0) return res;
	        int count = words.length, wordLen = words[0].length();
	        HashMap<String, Integer> map = new HashMap<String, Integer>();
	        for(String word : words) {
	            map.put(word, map.getOrDefault(word, 0) + 1);
	        }
	        HashMap<String, Integer> found = new HashMap<String, Integer>();
	        for(int i = 0; i <= s.length() - count * wordLen; i++) {
	            found.clear();
	            for(int j = 0; j < count; j++) {
	                int k = i + j * wordLen;
	                String str = s.substring(k, k + wordLen);
	                if(!map.containsKey(str))  break;
	                found.put(str, found.getOrDefault(str, 0) + 1);
	                if(found.get(str) > map.get(str)) break;
	                if(j == count - 1) 
	                	res.add(i);
	            }
	        }
	       return res;

	}
}