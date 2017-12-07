package LinkedList;

public class UniquePath {

	public static void main(String[] args) {
		int[][] arr = {{0,0}};
		System.out.println(" "+uniquePathsWithObstacles(arr));
	}
	 public static int uniquePathsWithObstacles(int[][] obs) {
	        
	        int r = obs.length;
	        int c = obs[0].length;
	        if(r==0)
	            return 0;
	        if(r==1 && c==1)
	            return (obs[0][0]==1)?0:1;
	        if(obs[0][0]==1)
	            return 0;
	        
	        int[][] dp = new int[r][c];
	        dp[0][0] =1;
	        int i;
	        for(i =1; i < r; i++)
	            dp[i][0] = obs[i][0]==1 ? 0: dp[i-1][0];
	        System.out.println("dp[i-1][0] "+dp[i-1][0]);
	        for(i =1; i < c; i++)
	            dp[0][i] = obs[0][i]==1 ? 0: dp[0][i-1];
	        System.out.println("dp[0][i-1] "+ dp[0][i-1]);
	        for(i=1; i < r; i++){
	            
	            for(int j=1; j < c; j++){
	                
	                if(obs[i][j]==1){
	                	System.out.println(" 00 ----i "+i+"j "+j);
	                	dp[i][j] = 0;
	                }
	                    
	                else{
	                	System.out.println(" i "+i+"j "+j);
	                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
	                }
	                
	            }
	        }
	        
	        return dp[r-1][c-1];
	    }
}
