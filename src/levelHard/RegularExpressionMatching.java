package levelHard;

public class RegularExpressionMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ans: "+ isMatch("aaa", "a.a"));
	}

	 public static boolean isMatch(String s, String exp) {
	        if(s.length()<1)
	            return false;
	        
	            StringBuffer sb = new StringBuffer(s);
	            int len = sb.length()-1;
	        
	            StringBuffer expb = new StringBuffer(exp);
	            if(expb.indexOf("*") < 0 && (expb.indexOf(".") < 0 )){
	                return (s.equals(exp))? true: false;
	            }
	                 int i = expb.length()-1;
	                while(i >=0){
	                	   System.out.println("...........");
	                        System.out.println("i is Main "+i);
	                       System.out.println("len is main"+len);
	                  
	                    char ch = ' ';
	                    if(expb.charAt(i) == '*'){
	                    	if (i-1 >=0)
	                         ch = expb.charAt(i-1);
	                    	if(ch == '.' || ch == '*'){
	                    		i--;
	                    		
	                    		break;
	                    	}
	                        
	               
	                        while(ch!=' ' && len >=0 && sb.charAt(len)==ch){
	                            len--;
	                           
	                          
	                        }
	                        i--;
	                        System.out.println("i: "+i+ " "+expb.charAt(i));
	                        while(i >=0 && expb.charAt(i) == ch && ch !=' '){
	                        	i--;
	                        	System.out.println("entering"+ch);
	                        }
	                           
	                        System.out.println("*********");
	                        System.out.println("i is"+i);
	                        System.out.println("len is"+len);
	                        continue;
	                    }
	                    if(expb.charAt(i) == '.'){
	                        len--;i--;
	                        System.out.println("...........");
	                        System.out.println("i is"+i);
	                        System.out.println("len is"+len);
	                        continue;
	                    }
	                    
	                    if(len>=0 && expb.charAt(i) == sb.charAt(len)){
	                        len--; i--;
	                        System.out.println("-------");
	                        System.out.println("i is"+i);
	                        System.out.println("len is"+len);
	                    }
	                    else if(len>=0 && expb.charAt(i) != sb.charAt(len))
	                        return false;
	                    i--;
	                    
	                }
	                
	        if(i+1 >=0 && exp.charAt(i+1)== '*' || len<0 )   
	        	return true;
	        
	        //System.out.println("len"+len);
	        return false;
	            
	        
	    }
}
