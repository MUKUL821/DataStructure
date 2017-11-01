package conceptTest;

import java.util.Arrays;
import java.util.Collections;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("reverse string: "+ reverseWords("I am Mukul Bajpai"));
	}
	  public static String reverseWords(String s) {
		  String[] words = s.trim().split(" ");
		    Collections.reverse(Arrays.asList(words));
		    System.out.println("words"+words);
		    return String.join(" ", words);
	        
	    }
}
