package conceptTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class BitwiseManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2; //000 001 010 011
		System.out.println(" and"+ (n&0));
		System.out.println(" or"+ (n|1));
		System.out.println(" not"+ (~n));
		System.out.println(" xor"+ (n^1));
		String s = "mukulopopo";
		String [] ch = s.split("");
		Set<String> set = new HashSet<String>(Arrays.asList(ch));
		System.out.println("------"+set.size());
	}

}
