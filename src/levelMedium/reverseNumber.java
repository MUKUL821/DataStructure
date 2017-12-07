
public class reverseNumber {
	public static void main(String [] args) {
		System.out.println(" and=ssss"+reverse(2147483647));
		
		// TODO Auto-generated method stub

	}
	 public static int reverse(int x) {
	     
		    long rev = 0;
		    System.out.println(" "+ Integer.MAX_VALUE);
		    System.out.println(" "+ Integer.MIN_VALUE);
		        while (x != 0){
		        	
		            rev = rev*10 + (x%10);
		            x = x/10;
		            System.out.println("rev "+rev);
		            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
		            	System.out.println("yes");
		            	 return 0;
		            }
		               
		            
		        }
		        return (int)rev;
		    }
}
