package conceptTest;

public class PalindromicSequence {

	public static void main(String[] args) {
		System.out.println(" Ans: "+ countSubstrings("abc"));
	}
	
	 private static int count = 0;
	    public static int countSubstrings(String s) {
	    	
	          if(s==null || s.length()<1)
	              return count;
	          
	          for(int i = 0; i < s.length(); i++){
	              checkPalindrome(s, i, i);
	              checkPalindrome(s, i, i+1);
	              
	              
	          }

	          return count;
	      }
	        public static void checkPalindrome(String s, int i, int j) {
	            while(i>=0 && j < s.length() && (s.charAt(i) == s.charAt(j))){
	                count++;
	                i--;
	                j++;
	                
	            }
	        }
}