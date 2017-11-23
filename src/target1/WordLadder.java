package target1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> wordList = new ArrayList<String>();
		wordList.addAll(Arrays.asList("hit","hot", "dog", "dot", "cog"));
		//wordList.addAll(Arrays.asList("a","b","c"));
		System.out.println("Result is"+ladderLength("hit","cog",wordList));
		
		

	}
	  public static int ladderLength(String beginWord, String endWord, List<String> dict) {
		  Set<String> wordList = new HashSet<String>(dict);
			Set<String> beginSet = new HashSet<String>(), endSet = new HashSet<String>();

			int len = 1;
			HashSet<String> visited = new HashSet<String>();
			
			beginSet.add(beginWord);
			endSet.add(endWord);
		    if(!wordList.contains(endWord))
			        	return 0; 
	
			while (!beginSet.isEmpty() && !endSet.isEmpty()) {
				
				System.out.println("endSet:  "+endSet);
				if (beginSet.size() > endSet.size()) {
					Set<String> set = beginSet;
					beginSet = endSet;
					endSet = set;
				}
				System.out.println("AFTER beginSet:  "+beginSet);
				System.out.println("AFTER endSet:  "+endSet);
				Set<String> temp = new HashSet<String>();
				
				for (String word : beginSet) {
					char[] chs = word.toCharArray();
					System.out.print("--------------- ");
					System.out.print("word is "+word);
					for (int i = 0; i < chs.length; i++) {
						for (char c = 'a'; c <= 'z'; c++) {
							char old = chs[i];
							chs[i] = c;
							String target = String.valueOf(chs);
							
							if (endSet.contains(target)) {
								System.out.println("target "+target);
								return len + 1;
							}

							if (!visited.contains(target) && wordList.contains(target)) {
								System.out.println("  ,  " +target);
								temp.add(target);
								visited.add(target);
							}
							chs[i] = old;
						}
					}
				}
				System.out.println("beginset BEFORE"+beginSet);
				beginSet = temp;
				System.out.println("beginset AFTER"+beginSet);
				len++;
			}
			
			return 0;
	    }
}
