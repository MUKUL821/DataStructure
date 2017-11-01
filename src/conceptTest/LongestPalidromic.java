package conceptTest;

import java.util.HashMap;
import java.util.Map;

public class LongestPalidromic {

	//s = aba
	public static void main(String[] args){
		
		String result = longestPalindrome("aaabaaaa");
		System.out.println("result is: "+result);
	}
	
	public static int checkforpalidrome(int [] arr, int start, int end){
		System.out.println("end and start "+ start+ " "+ end+ "arr[starr-1]"+arr[start-1]+" "+arr[start]);
		
		if(end-start>1){
					System.out.println("yes......");
					if(arr[end-1] == (end-start) && (arr[end-1]>1)){
						while(start>0 && arr[start]>0)
						return end+1 - start +1 ;
					}
					System.out.println("2.....");		
			}
			else
				if(arr[start-1]>0 && (arr[end-1]>1)){
					System.out.println("3....");		
				return end+1-start + arr[start-1];}
				else{
					System.out.println("4....");		
					return end+1-start + 1;}
			
			return 0;
	}
		
	
	 public static String longestPalindrome(String s) {
		 //String s = new StringBuffer(st).reverse().toString(); 
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int []arr = new int[s.length()];
		arr[0] = 0;
		
		int max =1;int max_index = 0;
		if(s.length() <2)
			return s;
		for(int i=0; i < s.length();i++){
			if(map.containsKey(s.charAt(i))){
				System.out.println("found at "+i);
			//find its palidrome or not
			int res = checkforpalidrome(arr, map.get(s.charAt(i)), i);
			max_index = (res>max) ? i : max_index;
			
			max = Math.max(res, max);
			System.out.println("max is "+max + "res"+ res+ " max_insed is "+max_index);
			//max_index = (max<=res)? i: max_index;
			arr[i] = res;
			}
			map.put(s.charAt(i), i+1);
	        
	    }
		//s.substring(max_index-max+1, max_index+1)
		System.out.println("longest length: "+max+ "  max_index"+max_index);
		System.out.println("longest length: "+s.substring(max_index-max+1, max_index+1));
		return (s.substring(max_index-max+1, max_index+1));
		
	 }
}

