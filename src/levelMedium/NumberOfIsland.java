package levelMedium;

public class NumberOfIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//['1','1','0','0','0'],['1','1','0','0','0'],['1','1','0','0','0'],['0','0','0','0','0'
		//char[][] grid = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
		char[][] grid = {{'1','1','0','0','0'}};

		System.out.println("output "+numIslands(grid));
		
	}
public static int numIslands(char[][] grid) {
        
        int rl = grid.length;
        int cl = grid[0].length;
        int count = 0;
        int[] visited = new int[rl];
        
        for(int i = 0; i < rl; i++){
            System.out.println("i is"+i+ " count"+count);
            for(int j=0; j < cl; j++){
                visited[i] = 1;
                if(grid[i][j]=='0')
                    continue;
               else{
            	   System.out.println("yes"+j);
            	   if(i>0 && grid[i-1][j]=='1')
                       continue;
                   int k = i+1;
                   while(k < rl && grid[k][j]=='1'){
                       visited[k++] = 1;
                   }
                   count++;
                  System.out.println("k is"+ k);
                   if(i < k)
                     i = k-1;
                   
                   
               }
         
            }
        }
    
       return count; 
    }
}
