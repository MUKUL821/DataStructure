package conceptTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAnagramBactracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = groupAnagram("muk");
		for(String st : ls)
			System.out.println("-"+st);
	}

	
	 public static List<String> groupAnagram(String strs) {
		 List<String> list = new ArrayList<>();
		 String temp = ""; 
		 groupAnagram(strs, list, temp, 0);
	        return list;
	    }
	 public static void groupAnagram(String strs,List<String> list, String temp, int start ) {
		System.out.println("temp"+temp+ " "+strs);
		 if(temp.length() == strs.length()){
			 list.add((String.valueOf(temp)));
			 return;
		 }
		 for(int i = start; i < strs.length(); i++)
		 {
			 char []ch = strs.toCharArray();
			 temp.concat(String.valueOf(ch[i]));
			 System.out.println("temp"+temp+ " "+String.valueOf(ch[i]));
			 groupAnagram(strs, list, temp, i+1);
			 temp.substring(0,  temp.length()-2);
		 }
	        
	    }
}
