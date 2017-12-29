package PracticeChallenge;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

static int maxGlobal = 1;
public static int lengthofPalindrome(String input1)
{
    char[] arr = input1.toCharArray();
    for(int i= 0; i < arr.length-1; i++){
        extend(arr,i, i);
        extend(arr,i, i+1);
    }
    
    return maxGlobal;
}

public static void extend(char[] arr, int start, int end){
	
    List<Character> left = new ArrayList<Character>();
    List<Character> right = new ArrayList<Character>();
    while(start>=0 && end<arr.length){
    	
    	if(start!=end){
    		 if(left.contains(arr[end]))
    	            left.remove(left.indexOf(arr[end]));
    	        else
    	            right.add(arr[end]);

    	        if(right.contains(arr[start]))
    	            right.remove(right.indexOf(arr[start]));
    	        else
    	            left.add(arr[start]);
    	            
    	            if(left.size()==0 && right.size()==0)
    	                maxGlobal = Math.max(maxGlobal, end-start+1);
    	           
    	}
    	
        start--;end++;
      
    }
    if(left.size()==0 && right.size()==0)
        maxGlobal = Math.max(maxGlobal, end-start+1-2);
    

 }

public static void main(String[] args) {
	String ip1 = "01232";
    int output = lengthofPalindrome(ip1);
    System.out.println(String.valueOf(output));
}

}


