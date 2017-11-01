package edu.mukul;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BitConverter {

	//Question
	//https://www.hackerrank.com/challenges/flipping-bits?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=82-day-campaign
	
    public static void main(String[] args) {
    	  /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	   Scanner sc= new Scanner(System.in);
    	   int n = sc.nextInt();
    	        
    	        while(n>0){
    	            long num = sc.nextLong();
    	         //      String input2 = Integer.toBinaryString((int) ~num);
    	         //  long res = Long.parseLong(input2.trim(), 2);
    	             System.out.println("result " +((long)~num) );
    	             System.out.println("result " +Long.toUnsignedString(~num, 10) );
    	            
    	             
    	             n--;
    	        }
    	    
    	    }
    
    	}