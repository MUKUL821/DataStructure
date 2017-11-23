package edu.mukul;

import java.io.*;
import java.util.*;
import java.lang.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String [] temp = br.readLine().trim().split(" ");
         int K = Integer.parseInt(temp[0]);
         int N = Integer.parseInt(temp[1]);
         String[] arr_arr = br.readLine().split(" ");
         int[] arr = new int[N];
         for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
         {
         	arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
         }

         long out_ = Solve(K, arr);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static long Solve(int K, int[] arr){
    	if(arr == null || (arr.length < 1) || (arr.length < K))
            return 0;
            
            long max_skill = Long.MIN_VALUE;
            long suml = 0;
            for(int i = 0; i < K; i++){
               suml += arr[i]; 
            }
            
            int left = K; 
            int start = 0; 
            max_skill = Math.max(suml, max_skill);
            int end = arr.length;
            
            
            while(left < arr.length){
            	
            	 while((left)< arr.length+K-1){
                     suml = suml + arr[(left)%arr.length] - arr[start++];
               
                     max_skill = Math.max(max_skill, suml);
                     
                 }
                 
            }
            
            return max_skill;
    
    }
}