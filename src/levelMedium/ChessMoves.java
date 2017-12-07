package levelMedium;

public class ChessMoves {

	public static void main(String[] args) {
		uniquePaths(1,2);
	//System.out.println("Ans "+ uniquePaths(2,1));

	}
    static int count = 0;
    public static void uniquePaths(int m, int n) {

       System.out.println("ans: "+uniquePaths(m, n, 0, 0));
       
        
    }
	 public static int uniquePaths(int m, int n, int x, int y) {
         if(x==m-1 || y==n-1){
             return 1;
         }
        	 System.out.println(" x, y"+x+","+y);
             return uniquePaths(m,n, x+1, y) + uniquePaths(m,n, x, y+1);

        
     }

}
