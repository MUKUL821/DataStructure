package conceptTest;

import java.util.ArrayList;

import java.util.List;


public class CheckingAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mukul";
		System.out.println(" result "+ findAnagrams("mnwwfxopttrewwfxfcghfhfgv", "wwfx"));
		int lef = 0;
		int [] a = {1,2,3,2,1};
		int []b = {2,2,4,3};

		if(lef==1 && s.charAt(lef++)=='u')System.out.println("yes");
		System.out.println(s.charAt(lef));
		System.out.println(s.charAt(lef++));
		System.out.println(s.charAt(lef));

	}

	  public static List<Integer> findAnagrams(String s, String p) {
		    List<Integer> list = new ArrayList<>();
		    if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;
		    int[] hash = new int[256]; //character hash
		    //record each character in p to hash
		    for (char c : p.toCharArray()) {
		        hash[c]++;
		    }
		    //two points, initialize count to p's length
		    int left = 0, right = 0, count = p.length();
		    while (right < s.length()) {
		    	System.out.println(" right "+right + "left "+left);
		       //"mnwwfxopttrewwfxfcghfhfgv", "wwfx"
		    	  if (hash[s.charAt(right++)]-- >= 1) count--; 
		        if (count == 0) list.add(left);
		        //System.out.println(" right after"+right+ " left"+left);
		        //System.out.println(" count"+count);
		        //if we find the window's size equals to p, then we have to move left (narrow the window) to find the new match window
		        //++ to reset the hash because we kicked out the left
		        //only increase the count if the character is in p
		        //the count >= 0 indicate it was original in the hash, cuz it won't go below 0
		       // System.out.println(" condition: "+count+ " "+ hash[s.charAt(left)]+ " "+s.charAt(left));
				  
		        if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) {count++;}
		       // System.out.println(" count after"+count+ " "+ hash[s.charAt(left)]+ " "+s.charAt(left++));
		    }
		    return list;
	        }
}
