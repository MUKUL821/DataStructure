import java.util.ArrayList;
import java.util.List;

public class Permutations {
// wrongggg
	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		permutation("1234", "", ls);
		String str = "1234";
		System.out.println("ls "+ls);
		int index = 0;
		int k = 16;
		int len = "1234".length();
		
		
		while(index < len-2 && k > 0){
			int count = 1;
			for(int i =1; i < len-index; i++)
				count *=i;
			System.out.println("count "+count);
			int div = (k-1)/count + 1;
			int newcount = (k-1)%count +1;
			System.out.println(" div "+div);
			System.out.println(" new count "+newcount);
			// swap eleme
			str = swap(str, index, div-1);
			index++;
			k = newcount;
			System.out.println(" new "+ String.valueOf(str));
		}
		System.out.println(" new "+ String.valueOf(str));
		
	
	
		
		

	}
	public static String swap(String str, int index, int div){
		System.out.println(" index "+ index);
		str = str.substring(0, index)+ str.charAt(div)+ str.substring(index, str.length()) ;
		System.out.println(" str--"+ str);
		str = str.substring(0, div+1)+  str.substring(div+2, str.length());
		return String.valueOf(str);
		
	}
	public static void permutation(String str, String newform, List<String> ls){
		
		
		if(newform.length()==str.length())
			ls.add(newform);
		else{
			for(int i = 0; i < str.length(); i++){
				if(newform.indexOf(str.charAt(i))> -1)
					continue;
				newform += str.charAt(i);
				permutation(str, newform, ls);
				newform = newform.substring(0,newform.length()-1);
			}
			
		}
	}

}
