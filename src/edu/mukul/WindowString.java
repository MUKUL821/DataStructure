package edu.mukul;

public class WindowString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s = 'a';
		int[] arr =new int [256];
		arr[s]=1;
		System.out.println(s+"  "+arr[s]);
		System.out.println("res:   "+ minWindow("this is a tstring", "tist"));

	}

	public static void printArray(int[] nums){
		for(int num: nums)
			System.out.print(" "+num);
	}

	public static String minWindow(String s, String t) {
		
	          // edge case
	        if (s.length() < t.length()) {
	            return "";
	        }
	        
	        // main idea
	        int[] arr = new int[256];
	        for (char c : t.toCharArray()) {
	            arr[c]--;
	        }
	        
	        int count = t.length();
	        int dIndex = 0;
	        int minIndex = -1;
	        int minLen = Integer.MAX_VALUE;
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if (arr[c]++ < 0) {
	            	System.out.println("char at "+c+ "  val  "+arr[c]+ " ");
	                count--;
	            }
	            
	            while (count == 0) {
	            	
	            	//this is a test string
	            	System.out.println(dIndex+" i is"+i);
	                if (i - dIndex + 1 < minLen) {
	                    minLen = i - dIndex + 1;
	                    minIndex = dIndex;
	                }
	                
	                char prev = s.charAt(dIndex);
	                dIndex++;
	                System.out.println("above-------F: "+prev+ " "+arr[prev]);
	                if (arr[prev]-- <= 0) {
	                	System.out.println("pre: "+prev+ " "+arr[prev]);
	                    count++;
	                }
	            }
	            System.out.println("dindex: "+dIndex);
	            //printArray(arr);
	        }
	        
	        if (minIndex == -1) {
	            return "";
	        }
	        else {
	            return s.substring(minIndex, minIndex + minLen);
		
	}
}
}