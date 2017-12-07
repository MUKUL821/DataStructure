package levelMedium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	 public static void main(String [] args){
		 int[][] matrix = {
		                {1,   3,  5, 7, 9},
		                {2,   4,  6,  8, 10},
		                {11, 13,  15, 17,  19},
		                {12, 14, 16,   18, 24},
		                {18, 21, 23, 26, 30}
		 };
		 int[] nums = {0};
		 System.out.println("can jump.."+canJump(nums));
		 //System.out.println(spiralOrder(matrix));

	 }
	
	 public static boolean canJump(int[] nums) {
	        //{2,3,1,1,4};
	        if(nums.length ==0)
	            return true;
	        
	        int max_step = nums[0];
	        int len = nums.length;
	        int i=0;
	        while( i<= max_step && i< len-1){
	            if(i+nums[i] == len-1)
	                return true;
	            i++;
	            max_step = Math.max(max_step, i+nums[i]);
	            System.out.println(i+" max step "+max_step);
	        }
	        System.out.println("len "+i);
	        return i==len-1;
	    }
	 public static List<Integer> spiralOrder(int[][] matrix) {
	        List<Integer> ans = new ArrayList<Integer>();

			 int R = matrix.length, C = matrix[0].length;
		        boolean[][] seen = new boolean[R][C];
		        int[] dr = {0, 1, 0, -1};
		        int[] dc = {1, 0, -1, 0};
		        int r = 0, c = 0, di = 0;
		        for (int i = 0; i < R * C; i++) {
		            ans.add(matrix[r][c]);
		            seen[r][c] = true;
		            int cr = r + dr[di];
		            int cc = c + dc[di];
		            if (cr>=0 && cr < R && cc>=0 && cc < C && !seen[cr][cc]){
		                r = cr;
		                c = cc;
		            } else {
		                di = (di + 1) % 4;
		                r += dr[di];
		                c += dc[di];
		            }
		        }
		    return ans;  
		 }
		
}
