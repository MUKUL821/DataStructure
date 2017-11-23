package conceptTest;

import java.util.Stack;

public class Decoder {

		public static void main (String[] args) {
			//code
		     System.out.println("aans: "+decode("1[b]"));;
		}
		
	    public static String decode(String str){
	        Stack<Character> ch = new Stack<Character>();
	        Stack<Integer> rec = new Stack<Integer>();

	        StringBuilder result = new StringBuilder();
	        for(int index=0; index < str.length(); index++){
	            if(str.charAt(index)=='[' || Character.isLetter(str.charAt(index))){
	                ch.push(str.charAt(index));
	             }
	            else{
	            if(Character.isDigit(str.charAt(index))){
	            	System.out.println("yes"+index);
	                rec.push(str.charAt(index)-'0');
	            }
	            else
	            {
	            	System.out.println("ENTEREDDDDDDD"+index);
	             // if ch == ']'
	             StringBuilder sb = new StringBuilder("");
	             boolean found = false;
	             while(!ch.isEmpty() && !found){
	                 char pp = ch.pop();
	                 if(pp == '[')
	                 found = true;
	                 else{
	                     sb.append(pp);
	                 }
	             }
	             if(sb.length()>0){
	            	 
	                 int num = rec.pop();
	               
	                 for(int k=0; k < num; k++)
	                   {
	                       for(int j = sb.length()-1; j >= 0; j--)
	                                ch.push(sb.charAt(j));
	                   }
	             }
	            
	            }
	            }    
	            
	        }
	        
	        while(!ch.isEmpty()){
	            result.append((char)ch.peek());
	            ch.pop();
	        }
	      return result.reverse().toString();  
	        
	    }
	}