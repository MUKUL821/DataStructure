package PracticeChallenge;

import java.util.HashMap;

public class ValidWordAbbr {

	public static void main(String[] args) {
		String[] dictionary = {"doog", "doog", "dfgg"};
		ValidWordAbbr(dictionary);
		boolean res = isUnique("doog");
		System.out.println("....."+res);
	}

	static HashMap<String, String> map;
	    public static void ValidWordAbbr(String[] dictionary) {
	        map = new HashMap<String, String>();
	        for(String str:dictionary){
	            String key = getKey(str);
	            // If there is more than one string belong to the same key
	            // then the key will be invalid, we set the value to ""
	            if(map.containsKey(key)){
	                if(!map.get(key).equals(str)){
	                    map.put(key, "");
	                }
	            }
	            else{
	                map.put(key, str);
	            }
	        }
	        System.out.println("map"+map);
	    }

	    public static boolean isUnique(String word) {
	        return !map.containsKey(getKey(word))||map.get(getKey(word)).equals(word);
	    }
	    
	    public static String getKey(String str){
	        if(str.length()<=2) return str;
	        return str.charAt(0)+Integer.toString(str.length()-2)+str.charAt(str.length()-1);
	    }

}
