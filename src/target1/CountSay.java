package target1;

public class CountSay {

	public static void main(String[] args) {
		System.out.println("res "+countAndSay(5));
	}
	public static String countAndSay(int n) {
		if(n < 1)
			return "0";
	    if (n == 1)      return "1";
	    if (n == 2)      return "11";
		
		StringBuffer sb = new StringBuffer("1");

		for(int i = 2; i <= n; i++){
			StringBuffer res = new StringBuffer("");
			int start = sb.length()-1;
			int count = 0;
			char prev = sb.charAt(start);
			res.append(prev);
			
			while(start>=0){
				
				if(sb.charAt(start)==prev){
					count++;
				
				}
				else
				{
					res.append(count);
					count=1;
					prev = sb.charAt(start);
					res.append(prev);

				}
				start--;
				
			}
		
			if(count>0)
				res.append(count);	
			sb = res.reverse();
	
		}
		
       return sb.toString();
       
   }
}
