package conceptTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class BitwiseManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m = "101110"; //000 001 010 011
		int n = Integer.valueOf(m);
	
		System.out.println(" or "+ (n|1));
		System.out.println(" not "+ (~n));
		System.out.println(" xor "+ (1^1));
		String s = "mukulopopo";
		String [] ch = s.split("");
		Set<String> set = new HashSet<String>(Arrays.asList(ch));
		System.out.println("------"+set.size());
		
		
	}

}
