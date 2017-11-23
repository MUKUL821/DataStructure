package conceptTest;

public class DecodeString {

	public static void main(String[] args) {
		System.out.println(numDecodings("026"));;
		// TODO Auto-generated method stub
// "12" - 2 :    "121" - 1 2 1, 12 1 1 21; "12345" 1 2 3 4 5; 12 3 4 5; 12 34 5; 12 3 45; 
	}
	 public static int numDecodings(String s) {
	        
	        if(s==null || s.length() < 1){
	            return 0;
	        }
	        if(s.length()==1)
	        	return 1;
	        
	        int count=1;
	       
	       int res = backtrack(s.toCharArray(),count, 0);
	        
	       
	      //all the possible combinations
	            
            return count;
	        }
	 
	 private static int backtrack(char[] ch, int count, int start){
		 char elem = ch[start];
		 if (start > ch.length-1)
			 return count;
		 for(int i = start+1;i < ch.length-1; i++){
			 System.out.println("nn"+ch[i]+" "+ch[i+1]+ " "+ (ch[i]+ch[i+1]-'0')) ;
			 System.out.println("yy");
			 if(ch[i]+ch[i+1]-'0' < 26){
				
				 count++;
			 }

		 }
		 //backtrack(ch, count, start++);
		 
		return count;
		   }
	        
	    }


