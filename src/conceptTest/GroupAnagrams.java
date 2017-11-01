package conceptTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"anb", "bna", "nba", "mnc"};
		 List<List<String>> ls = groupAnagram(arr);
		 for(List<String> s: ls)
			 System.out.println("--"+s);
	}

	 public static List<List<String>> groupAnagram(String[] strs) {
	        if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
	        Map<String, List<String>> map = new HashMap<String, List<String>>();
	        for (String s : strs) {
	            char[] ca = s.toCharArray();
	            Arrays.sort(ca);
	            String keyStr = String.valueOf(ca);
	            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<String>());
	            map.get(keyStr).add(s);
	        }
	        return new ArrayList<List<String>>(map.values());
	    }

}
