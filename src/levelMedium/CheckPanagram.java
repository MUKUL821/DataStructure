
public class CheckPanagram {

	public static void main(String[] args) {
		System.out.println("res "+ checkPangram("mn aa"));
	}



	    public static final int n = 26; 

	    public static int checkPangram(String arr){
	        if(arr.length() < n){
	           return -1;
	        }
	        for(char c = 'A'; c <= 'Z' ; c++){
	            if((arr.indexOf(c) < 0) && (arr.indexOf((char)(c + 32)) < 0)){
	               return -1;
	            }
	        }
	        return 1;
	    }

}
