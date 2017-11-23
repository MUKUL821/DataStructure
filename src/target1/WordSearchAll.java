package target1;

public class WordSearchAll {

	static int[] xM =  { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] yM = { -1, 0, 1, -1, 1, -1, 0, 1 };
	
	public static void main(String[] args) {
		
		 char[][] board = {
                 { 'G','E','E','K','S','F','O','R','G','E','E','K','S'},
                 {'G','E','E','K','S','Q','U','I','Z','G','E','E','K'},
                 {'I','D','E','Q','A','P','R','A','C','T','I','C','E'}
                 };
        String word = "GEEKS";
       search(board,word);

	}

	public static void search(char[][] board, String word){

		for(int y = 0; y < board.length; y++){
			
			for(int x=0; x< board[0].length;x++){
				if(search(board, y,x,word))
					System.out.println(" "+y+" "+x);
					
			}
			}
		
	}

	public static boolean search(char[][] board, int row, int col, String word) {
		
		if(board[row][col] != word.charAt(0))
			return false;
		
		for(int k = 0; k < 8; k++){
			int rd = row + xM[k];
			int cd = col + yM[k];
			
			int t;
			for(t =1; t < word.length(); t++){
				
				if(rd < 0 || cd <0 || rd >= board.length || cd >= board[0].length)
					break;
				if(board[row][cd]!=word.charAt(t))
					break;
				
				rd += xM[k];
				cd += yM[k];
				
			}
		
			if(t == word.length())
				return true;
		}
		
		
		return false;
			
	}
}
