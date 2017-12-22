package imp;

public class MinimumWindowSubstring {
	 static final int no_of_chars = 256;
	    public String minWindow(String s, String t) {
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
	                count--;
	            }
	            
	            while (count == 0) {
	                if (i - dIndex + 1 < minLen) {
	                    minLen = i - dIndex + 1;
	                    minIndex = dIndex;
	                }
	                
	                char prev = s.charAt(dIndex);
	                dIndex++;
	                if (arr[prev]-- <= 0) {
	                    count++;
	                }
	            }
	        }
	        
	        return (minIndex == -1) ? "" : s.substring(minIndex, minIndex + minLen);

	    }
}
