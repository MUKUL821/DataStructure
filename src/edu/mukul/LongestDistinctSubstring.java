package edu.mukul;

import java.util.HashMap;
import java.util.Map;
/*mukul*/
public class LongestDistinctSubstring {

	public static void main(String[] args) {

		
		String str = "abdabc";
		int i=0, start=0, ans=0;
		int len = str.length();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		while (i<len){
			if(map.containsKey(str.charAt(i))){
				 start = Math.max(map.get(str.charAt(i)), start);
				
			}
			else
				ans = Math.max(ans, i-start+1);
				map.put(str.charAt(i), i+1);
				
				i++;

			
		}
		
		System.out.println("ans "+ans);
			
		

	}

}
