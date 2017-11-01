package edu.mukul;

import java.util.HashMap;
import java.util.Map;
/*mukul*/
public class MatrixNumberFind {

	
	 public static boolean searchMatrix(int[][] matrix, int target) {
	     
	     int rows = matrix.length;
	     int column = matrix[0].length;
	    
	     int x= 0;
	    
	     Map<Integer,Integer> map = new HashMap<>();
	     for(int i=0; i<rows;i++)
	     {
	    	 if(matrix[i][x]<target){
	    		 
	    		if(i>0 && map.containsKey(i-1))
	    			column = Math.min(column, map.get(i-1));
	    		for(int j= 1; j< column; j++){
	    			if (matrix[i][j]==target)
		    			 return true;
	    			else 
	    				if (matrix[i][j]>target)
			    		map.put(i, j);
	    			
	    		} 
	    		 
	    	 }
	    	 else
	    	 if (matrix[i][x]>target)
	    		 return false;
	    	 else
	    		 if (matrix[i][x]==target)
	    			 return true;
	    	 
	     }
	     
	
     return false;
	     }
	        
	 public static void main(String [] args){
		 int[][] arr = {
		                {1,   3,  5, 7, 9},
		                {2,   4,  6,  8, 10},
		                {11, 13,  15, 17,  19},
		                {12, 14, 16,   18, 24},
		                {18, 21, 23, 26, 30}
		 };
		 int search =8;
		 System.out.println(searchMatrix(arr, search));
	 }
}
