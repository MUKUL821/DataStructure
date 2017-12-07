
public class shortestPalindrome {

	public static void main(String[] args) {
		
		System.out.println(" ans "+shortestPalindrome("adcba"));
	}

 public static String shortestPalindrome(String s) {
	 String str="";String rev="";
        for(int i = s.length()-1; i >=0; i--){
        	StringBuffer sb = new StringBuffer("");
            str = s.substring(0, i+1);
            rev = sb.append(str).reverse().toString();
            System.out.println("str "+ str+ " rev "+rev);
            if(rev.equals(str))
            	break;       
        }
        System.out.println("str "+ str+ " rev "+rev);
        if(str.length()==1)
        	str = "";
        
         String remain = s.replace(str, "");
         StringBuilder remainrev = new StringBuilder(remain);
         remainrev.reverse();
         System.out.println("remainrev "+ remainrev+ " remain "+remain);
           
        return  remainrev.toString()+s;
        
    }

}
