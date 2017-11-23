package target1;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(" res:"+addBinary("1", "1"));
	}
	public static String addBinary(String a, String b) {
		  StringBuilder result = new StringBuilder("");
	       
	        int len1 = a.length()-1; int len2 = b.length()-1;
	        int carry = 0;
	        while(len1 >=0 || len2 >=0 || carry==1){
	        	char ch = a.charAt(0);
	     
	            int a1 = (len1 >= 0)? a.charAt(len1) - '0' : 0;
	             int b1 = (len2 >= 0)? b.charAt(len2) - '0' : 0;
	            int res = a1 ^ b1 ^ carry;
	            carry = (a1+b1+carry >1) ? 1: 0;
	            result.append(res);
	            
	            len1--; len2--;
	        }
	        return result.reverse().toString();

    }
}
