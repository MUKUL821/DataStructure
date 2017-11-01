package edu.mukul;

public class FrequencySort {
	/*mukul*/
	public static void main(String[] args) {
		
		
		System.out.println("ans"+ function());
			}

	private static boolean function() {
		String s="aaaaabb";
		String t="aaaaabc";
	    char[] ch = s.toCharArray();
        
        if(s.length()!= t.length())
        return false;
        int i=0;
        boolean result=true;
        for(i=0;i<ch.length;i++)
        {
        	System.out.println("inside 1"+t.indexOf(ch[i]));
            if(t.indexOf(ch[i])< 0)
           { 
            	System.out.println("inside 2");
               result=false;
               break;
               
           }
            StringBuilder sb = new StringBuilder(t);
            sb.deleteCharAt(t.indexOf(ch[i]));
            t= sb.toString();
        }
		return result;

	}

}
