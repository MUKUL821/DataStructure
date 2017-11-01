package edu.mukul;

public class AddTwoString {
/*mukul*/
	public AddTwoString add=null;
	public static void main(String[] args) {
	System.out.println("ans"+ addStrings("7777","28") );

	}
	
	 public static String addStrings(String num1, String num2) {
	        // 48-57
         int length1=num1.length();
         int length2 =num2.length();
	 if(num1.length() < num2.length())
     {
         for(int k= 0; k < length2-length1; k++)
         { num1 = ("0") + (num1);
         System.out.println("in 1"+length2);
     }
     }
       if(num2.length() < length1 )
     {
         for(int k= 0; k <length1-length2; k++)
         { num2 = ("0")+(num2);
         System.out.println("in 2" + num2.length()+ "  "+ num1.length());
         }
     }
       System.out.println("numbers"+ num1 +" "+ num2);
char[] ch1 = num1.toCharArray();
    String res = "";
     char[] ch2 = num2.toCharArray();

     int length = Math.max(ch1.length, 
     ch2.length);

     int remainder = 0;
     for(int i=length-1; i >= 0; i--){
         
         int n1;
		if (ch1.length>i)
			n1 = (int)ch1[i]-48;
		else
			n1 = 0;
          int n2;
		if (ch2.length>i)
			n2 = (int)ch2[i]-48;
		else
			n2 = 0;
          
          int sum = n1+n2;
        
        int  result = (sum+remainder) % 10;
    
          res = result + res;
          remainder = (sum+remainder)/10;
          
         
     }
     if(remainder!= 0)
     res = remainder + (res);
     return res;
	        
	    }

}
