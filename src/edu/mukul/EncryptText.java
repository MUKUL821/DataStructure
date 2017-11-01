package edu.mukul;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// Question : https://www.hackerrank.com/challenges/encryption
public class EncryptText {
	/*mukul*/
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        String s =in.next();
        
        char arr[] = s.toCharArray();
        Map<Integer,String> map= new HashMap();
        int sqrt = (int) Math.sqrt(arr.length);int row;int col;
        if((sqrt*sqrt)< s.length() )
        { row= sqrt;col=sqrt+1;}
        else
        {  row = sqrt;col=sqrt;}
        
        for(int i=0; i< arr.length;i++){
            int mod = i%col;
            String n;
			if(map.containsKey(mod))
			{ n = map.get(mod);
                n= n+(arr[i]);}
			else
				n= String.valueOf(arr[i]); // COVERT CHAR TO STRING..REMEMBER
         map.put(mod, n);      
        }
        // Remember the iteration process
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.print(pair.getValue()+" ");
            it.remove(); // avoids a ConcurrentModificationException
        }
    }
}
