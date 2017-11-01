package conceptTest;

import java.util.Arrays;
import java.util.HashMap;

public class IsIsomorphic {

	public static void main(String[] args) {
		String p = "pinki";
		char [] ch = p.toCharArray();
		Arrays.sort(ch);

		String pt = String.valueOf(ch);
		System.out.println(" "+pt);
		System.out.println("result "+ isIsomorphic("egg####tntn''';", "add0000m m pppo"));
	}
	
	 public static boolean isIsomorphic(String s, String t) {
	        //apple , maahl
	
	        HashMap<Character, Integer> hashmapT = new HashMap<Character,Integer>();
	        HashMap<Character, Integer> hashmapS = new HashMap<Character,Integer>();
	        
	        if(s.trim().length() != t.trim().length())
	            return false;
	        for(int i=0; i < s.length(); i++){
	            if(hashmapS.containsKey(s) ||  hashmapT.containsKey(t.charAt(i))){
	                if(!( hashmapT.containsKey(t.charAt(i)) && hashmapS.containsKey(s.charAt(i)) && hashmapS.get(s.charAt(i)) ==hashmapT.get(t.charAt(i))))
	                    return false;
	                }
	            hashmapT.put(t.charAt(i), i); hashmapS.put(s.charAt(i), i); 
	        
	    }
	        return true;
	}

}
