package target1;

public class RegularExpressionMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" "+"aab".matches(".*b"));
		System.out.println(" res:  "+ isMatch("aab",".*b"));
	}
	 public static boolean isMatch(String s, String exp) {
	        String p = exp;
	        if(s==null || p ==null || (p.indexOf('.')>=0 && p.split(".").length < s.length()))
	            return false;
	        System.out.println("crossed");
	        if(p.indexOf('*') < 0 && p.indexOf('.')< 0)
	            return s.equals(p);
	       
	        StringBuilder sb = new StringBuilder();
	          sb.append(s)  ;
	          int i =0;
	          System.out.println("crossed..");
	          
	        for(i =0 ; i < p.length(); i++){
	            char ch = p.charAt(i);
	            if(ch == '.'){
	            	sb = sb.delete(0,1);
	                continue;
	            }
	              if(ch == '*')
	                  continue;
	              
	           
	             if(Character.isLetter(ch)){
	            	 
	            		
	                 if(i < p.length()-1 && p.charAt(i+1) == '*'){
	                	 
	                     while(sb.length() >0 && sb.charAt(0)==ch)
	                        sb = sb.delete(0,1); 
	                     if(p.indexOf(i+2)==ch)
	                    	 i++;
	                     
		            	  i++;
		            		
		            	 } 
	                     
	                 }
	                 else {
	                	 System.out.println("yes");
	                     if(sb.length() >0 && sb.charAt(0) == ch)
	                    	 sb = sb.delete(0,1);
	                     else
	                         break;
	                 }
	                 
	                 
	             }
	        
	       System.out.println("reached "+sb+ "i"+i);
	        //include condition were only *** are remaining in p and sb.length ==0
	       int t = i-1;
	       while(i < p.length())
	       {
	         if(p.charAt(i) !='*')
	          return false;
	         i++;
	       }
	         
	        	 
	        return (sb==null || sb.length()==0);
	    }
}
