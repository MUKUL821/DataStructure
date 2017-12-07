package levelHard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SkylineProblem {

	public static void main(String[] args) {
		int[][] buildings = { 	{2, 9, 10},
								{3, 7, 15}, 
								{5, 12, 12}, 
								{15, 20, 10}, 
								{19, 24, 8} } ;
		
		List<int[]> ls = getSkyline(buildings);
		System.out.println("ANSWER: ");
		for(int[] curr: ls)
			System.out.println(" "+curr[0]+" "+curr[1]);
			
		
	}
 	public static List<int[]> getSkyline(int[][] buildings) {
 	     if (buildings.length == 0) return new ArrayList<int[]>();
 	        Map<Integer, ArrayList<int[]>> points = new TreeMap<>(); // Sorted by of current position. Value: building involved in current position
 	        for (int i = 0; i < buildings.length; i++) {
 	            int[] curr = buildings[i];
 	            points.putIfAbsent(curr[0], new ArrayList<int[]>());
 	            points.putIfAbsent(curr[1], new ArrayList<int[]>());
 	            points.get(curr[0]).add(curr);
 	            points.get(curr[1]).add(curr);
 	        }
 	        Comparator<Integer> comp = new Comparator<Integer> () {
 	            @Override
 	            public int compare(Integer i1, Integer i2) {
 	                return i2 - i1;
 	            }
 	        };
 	        

 	   	// [ [2 9 10], [3 7 15], [5 12 12], [15 20 10], [19 24 8] ] .
 	        TreeMap<Integer,Integer> height = new TreeMap<>(comp); //Descending sorted height and the count of current height in each boundary position.
 	        List<int[]> result = new ArrayList<>();
 	        for(Map.Entry<Integer, ArrayList<int[]>> entry : points.entrySet()) {
 	           
 	            for (int[] curr : entry.getValue()) {
 	            	//if it is start of building then add the height to map. If height already exists then increment the value
 	                if (curr[0] == entry.getKey()) {
 	                    height.put(curr[2], height.getOrDefault(curr[2], 0) + 1);	
 	                  
 	                }
 	             //if it is end of building then decrement or remove the height from map.
 	                if (curr[1] == entry.getKey()) {
 	                    if (height.get(curr[2]) == 1) height.remove(curr[2]);
 	                    else height.put(curr[2], height.get(curr[2]) - 1);
 	                
 	                }
 	            }
 	            //For each boundary position, we need add the pair of position and height to the result.
 	            //If height == empty, there is no buiding in current position.
 	            //If result is empty or the height of previous position unequal to current largest height, add pair to result.
 	            int y = 0; 

 	            if (!height.isEmpty()) y = height.firstKey();
  	           //if height changes from previous height then this building x becomes critcal x.
 	            // So add it to the result 	         
 	            if (result.size() == 0 || result.get(result.size() - 1)[1] != y) 
 	                    result.add(new int[] {entry.getKey(), y});
 	           //System.out.println(" result**** "+result.get(result.size() - 1)[0]+ " "+result.get(result.size() - 1)[1]);
 	        }
 	        return result;
 	    }
}
