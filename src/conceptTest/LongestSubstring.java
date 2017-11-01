package conceptTest;

public class LongestSubstring {

	public static void main(String[] args) {
		int result = lengthOfLongestSubstring("abba");
		System.out.println("result: "+result);
	}
	 public static int lengthOfLongestSubstring(String s) {
		 int n = s.length(), max = 0;
		
	        int[] index = new int[128]; // current index of character
	        // try to extend the range [i, j]
	        for (int j = 0, i = 0; j < n; j++) {  
	        	
	        	  i = Math.max(index[s.charAt(j)], i);
	        	  System.out.println("i "+i);
	              max = Math.max(max, j - i + 1);
	              index[s.charAt(j)] = j + 1;
	        }
	       
	       return max; 
	    }
}
