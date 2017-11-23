package target1;

public class CountSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("res "+countAndSay(4));
	}
	public static String countAndSay(int n) {
        String res = "1";
        String str_new = "";
       if(n < 0)
           return " ";

       for(int start = 1;start<n; start++){
    	   str_new = "";
    	   System.out.println(" start "+start+" res"+res);
           int j = res.length()-1;
          while(j >=0){
               int count = 1;
               char target = res.charAt(j);
               int t = j-1;
               System.out.println("t is"+t);
               while(t>=0 && res.charAt(t) == target){
                   count++;
                   t--;
               }
               str_new =  String.valueOf(count) + String.valueOf(res.charAt(j)) + str_new;
               j = t;
                   
               
           }
           res = str_new;
          
       }
       
       return res;
       
   }
}
