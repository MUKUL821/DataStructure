
import java.io.*;
import java.util.*;
public class DecryptEncrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	  static String decrypt(String word) {
	    // your code goes here
	    // base condition
	    if(word.length() ==0)
	      return word;
	    
	    char[] arr = word.toCharArray();
	    
	    int prev = 0 ;
	    
	    for(int i=0; i< arr.length; i++){
	      
	      int ch = arr[i];
	      // System.out.print("ch "+ch);
	      int val = ch - prev - 1;
	      while(val < 97){
	        val +=26;
	      }
	      //System.out.println(val);
	      arr[i] = (char) (val);
	      prev += val;
	    }
	    
	    return String.valueOf(arr);
	  }


}
