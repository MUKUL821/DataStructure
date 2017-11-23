package levelMedium;

import java.util.LinkedList;
import java.util.List;

public class LongestPalindrome {

	public static void main(String[] args) {
		//System.out.println(""+ (Math.abs(-4) - 1));
		
	
	        
		System.out.println("Result : "+ longestPalindrome("rrsdsfdasdkkdkkab"));
	}
	public static String longestPalindrome(String s) {
		s = "aaa"; //aba : nnnmukul lukumnnn
		
		String rev = new StringBuffer(s).toString();
		String res = ""; int start_max =0;
		for(int i = 0; i <s.length(); i++){
			// cbaba : ababc
			System.out.println("  "+rev.split(String.valueOf(s.charAt(i))).length);
		if((rev.indexOf(s.charAt(i)) != (s.length()-1-i))){
		int max = checkPalindrom(s, rev, i);	
		System.out.println("max"+max + "i is"+i);
		}
		//String - aba, mjnsababamn; mnopdpon ; fghjkllkjhgmn ; mnabafgab : bagfabanm : i--6 ---9-1-i
		}
		
		
		
		
		return res;
    }
	
	public static int checkPalindrom(String s, String rev, int index){
	
		int len = s.length();
		int start = index;
		int rev_start = len-1-index;
		System.out.println("rev start"+rev_start);
		while(start < len && rev_start<len)
			if(s.charAt(start++)!=rev.charAt(rev_start--))
				break;
				
			
		
		return start-index-1;
	}
	/****        String rev = new StringBuffer(s).reverse().toString();
        int count =0;int start = 0; int start_index=0; int max_count =0;
        for(int i = 0; i < s.length(); i++){
        	// a b a m     : : m a b a
        	// b a b a b : : b a b a b : 0
        	System.out.println("rev.indexOf(s.charAt(i)"+rev.indexOf(s.charAt(i)));
            if(rev.indexOf(s.charAt(i)) != (s.length()-1-i)){
            	System.out.println("index: "+i+ ""+count);
                start = (count == 0)? i : start; count++;
                
            }   
            else{
            
            	if(count > max_count)
                  {
                      max_count = count;
                      start_index = start;
                  }
                
                count=0;
            } 
                
            
        }
      
        max_count = Math.max(max_count, count);
        System.out.println(max_count);
     return s.substring(start_index, start_index+max_count+1);   *****/
}
