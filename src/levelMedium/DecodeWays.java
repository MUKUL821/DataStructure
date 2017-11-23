package levelMedium;

public class DecodeWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "12";
		char a = 'A'; int i = 65;
		System.out.println("sol:  "+ numDecodings("10011"));
	 
	}

	

    public static int numDecodings(String s) {
   int n = s.length();
   if (n == 0) return 0;
   
   int[] memo = new int[n+1];
   memo[n]  = 1;
   memo[n-1] = s.charAt(n-1) != '0' ? 1 : 0;
   
   for (int i = n - 2; i >= 0; i--){
       if (s.charAt(i) == '0') continue;
       else memo[i] = (Integer.parseInt(s.substring(i,i+2))<=26) ? memo[i+1]+memo[i+2] : memo[i+1];
       System.out.println("meme is------- ");
       printArr(memo);
   }
   
   return memo[0];
}

	private static String printArr(int[] memo) {
		// TODO Auto-generated method stub
		for(int m: memo)
			System.out.println(" "+m);
		return null;
	}
}
