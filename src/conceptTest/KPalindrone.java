package conceptTest;

public class KPalindrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		System.out.println("  "+s.substring(0,2));
		System.out.println("res : "+kpalindrome("abeymnweba", "abewnmyeba", 10,10));
		
	}

	
	public static int kpalindrome(String s1, String s2, int m, int n)
	{
		
			// reverse and check the number
		if(m==0)
			return n;
		if(n==0)
			return m;
		
		if(s1.charAt(m-1) == s2.charAt(n-1)){
			System.out.println(m+"------"+n);
			return kpalindrome(s1,s2,m-1,n-1);
		}
		else{
			System.out.println(m+"******"+n);
			return 1+Math.min(kpalindrome(s1,s2,m,n-1), kpalindrome(s1,s2,m-1,n));
		}
			
		

		
	}
}
