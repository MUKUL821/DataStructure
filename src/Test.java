import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []ip = {1,2,1,2,2,3,1,0,0,0,0,2,2};
	    System.out.println("ans:  "+giveDegree(ip));
	}
	public static int giveDegree(int[] inp) {
	    int minSubArrayLength = inp.length;                          
	    // initialize with the array length (worst case)
	    // array degree
	    int arrayDegree = 0;
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    // to store the start index of the element which is responsible for the highest degree of Array
	    Map<Integer, Integer> startIndex = new HashMap<>();
	    // to store the end index of the element which is responsible for the highest degree of Array
	    Map<Integer, Integer> endIndex = new HashMap<>();
	    
	    for(int i=0;i< inp.length;i++) {                             
	    	// build the map to find the degree O(n)
	        int key = inp[i];
	        if (map.containsKey(key)){
	            int val = map.get(key);
	            map.put(key, val=val+1);
	        } else {
	            // store the start index of the element
	            startIndex.put(key, i);
	            map.put(key, 1);
	        }
	        // store the end index of the element
	        endIndex.put(key, i);
	        arrayDegree = Integer.max(arrayDegree, map.get(key));    
	        // Calculate the degree of the array - O(n)
	    }

	    for(int key : map.keySet()){                                 
	    	// find the subarray with min length - O(n)
	        if(map.get(key) == arrayDegree){
	            int len = endIndex.get(key) - startIndex.get(key) + 1;
	            minSubArrayLength = Integer.min(minSubArrayLength, len);
	        }
	    }
	    return minSubArrayLength;     // Total Time complexity: O(n)
	}

}
