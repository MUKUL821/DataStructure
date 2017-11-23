package conceptTest;

public class ZigZagPattern {

	public static void main(String[] args) {
		System.out.println("zigzag"+convert("PAYPALISHIRING", 2));
		//System.out.println("reverse "+ reverse(3212));
		
	}
	
	 public static String convert(String st, int numRows) {
		 char[] s = st.toCharArray();
	        StringBuffer result = new StringBuffer("");
	        if(s==null || s.length < 1 || numRows==0)
	            return result.toString();
	        if(numRows==1)
	        	return st;
	        StringBuffer[] sb = new StringBuffer[numRows];
	        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();
	         sb[0] =   sb[0].append(s[0]);
	        int start = 1;
	        
	        while(start < s.length){
	        	//System.err.println("yes m"+start);
	            for(int i = 1; i < numRows && start < s.length; i++){
	            	//System.err.println("yes 1");
	                sb[i] = sb[i].append(s[start++]);
	            }
	             for(int i = numRows-2; i >=0 && start < s.length; i--){
	            	// System.err.println("yes 3"+i+"start"+start);
	                sb[i] = sb[i].append(s[start++]);
	            }
	            
	            
	        }
	        for(StringBuffer res: sb)
	            result.append(res);
	        
	        return result.toString();
	    }
}
