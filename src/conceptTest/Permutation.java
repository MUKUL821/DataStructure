package conceptTest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Permutation {

	public static void main(String[] args) {
		
		Permutation per = new Permutation();
		String input = "NA";
		List<String> res = per.findPermutation(input);
		for(String str: res) {
			System.out.println(str);
		}
		System.out.println("Total number of permutations are:\t\t"+res.size());

	}
	
	public List<String> findPermutation(String input) {
		//System.out.println("Start FindCombination");
		List<String> res = new ArrayList<>();
		if(input == null || input.length() == 0) {
			return res;
		}
		Map<Character, Integer> tempMap = new TreeMap<>();
		int len = input.length();
		
		for(int i = 0; i < len; i++) {
			char temp = input.charAt(i);
			if(tempMap.containsKey(temp)) {
				tempMap.put(temp, tempMap.get(temp) + 1);
			} else {
				tempMap.put(temp,  1);
			}
		}
		int mapSize = tempMap.size();
		char [] inChar = new char[mapSize];
		int [] countChar = new int[mapSize];
		int i = 0;
		Iterator<Entry<Character, Integer>> itr = tempMap.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Character, Integer> map = itr.next();
			inChar[i] = map.getKey();
			countChar[i] = map.getValue();
			i++;
		}
		char [] output = new char[input.length()];
		getPermutations(inChar, countChar, 0, output, res);
		
		return res;
	}
	
	
	public void getPermutations(char [] input, int [] count, int level, char[] output, List<String> resList) {
		System.out.println("-----------------");
		if(level == output.length) {
			resList.add(new String(output));
			return;
		}
		
		for(int i = 0; i < input.length; i++) {
			if(count[i] == 0) {
				continue;
			}
			output[level] = input[i];
			System.out.println("i:"+i+ " level"+level + "output"+ output[level]);
			count[i]--;
			getPermutations(input, count, level + 1, output, resList);
			count[i]++;
		}
		
	}

}