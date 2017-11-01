package conceptTest;

public class ReshapeMatrix {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length; int m = nums[0].length;
        if(r*c!=n*m)
            return nums;
        int [][]arr = new int[r][c];
        for(int i = 0; i <n*m; i++)
            arr[i/c][i%c] = nums[i/m][i%m];
        return arr;
        
    }
	   public static void main(String []args){
		   
	   }
}
