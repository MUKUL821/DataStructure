package target1;

public class WordSearch {

		static int[] xM =  {   0, 1,0,-1 };
		static int[] yM =   {  1, 0,-1,0};
		
		public static void main(String[] args) {
			
			 char[][] board = {
	                 { 'G','E','E','K','S','F','O','R','G','E','E','K','S'},
	                 {'G','E','E','K','S','Q','U','I','Z','G','E','E','K'},
	                 {'I','D','E','Q','A','P','R','A','C','T','I','C','E'}
	                 };
	        String word = "SKEC";
	        System.out.println("ans: "+exist(board,word));;

		}

    	public static boolean exist(char[][] board, String word) {
    	    char[] w = word.toCharArray();
    	    for (int y=0; y<board.length; y++) {
    	    	for (int x=0; x<board[y].length; x++) {
    	    		if (exist(board, y, x, w, 0)) return true;
    	    	}
    	    }
    	    return false;
    	}

    	private static boolean exist(char[][] board, int y, int x, char[] word, int i) {
    
    		if (i == word.length) return true;
    		if (y<0 || x<0 || y == board.length || x == board[y].length) return false;
    		if (board[y][x] != word[i]) return false;
    	
    		board[y][x] ^= 256;
    		boolean exist = exist(board, y, x+1, word, i+1)
    			|| exist(board, y, x-1, word, i+1)
    			|| exist(board, y+1, x, word, i+1)
    			|| exist(board, y-1, x, word, i+1);
    		
    		board[y][x] ^= 256;
    	
    		return exist;
    	}
    }