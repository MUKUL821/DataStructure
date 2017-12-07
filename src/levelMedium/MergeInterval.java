package levelMedium;

import java.util.ArrayList;
import java.util.List;
class Interval {
     int start;
    int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
 }
public class MergeInterval {

	public static void main(String[] args) {
		List<Interval> ls = new ArrayList<Interval>();
		Interval obj1 = new Interval(1,3);
		Interval obj2 = new Interval(2,6);
		Interval obj3 = new Interval(8,10);
		ls.add(obj1);ls.add(obj2);ls.add(obj3);
		merge(ls);

		
	}
	  public static List<Interval> merge(List<Interval> intervals) {
	        List<Interval> ans = new ArrayList<Interval>();
	        
	        if(intervals.size()==0)
	            return ans;
	        if(intervals.size() ==1){
	            ans.add((Interval)intervals.get(0));
	            return ans;
	        }
	        
	       
	        Interval prev = intervals.get(0) ;

	        for(int i = 1; i < intervals.size(); i++){
	            Interval curr = intervals.get(i);
	           if(curr.start > prev.end){
	                ans.add(new Interval(prev.start, prev.end));
	                prev.start = curr.start;
	                prev.end = curr.end;
	                System.out.println("addeddddddddddd");
	                }
	            else
	                prev.end = Math.max(prev.end, curr.end);
	           
	           System.out.println(prev.start+"  prev    "+prev.end);
	        }
	    
	     ans.add(new Interval(prev.start, prev.end));
	     System.out.println("size"+ans.size());
	         return ans;   
	    }

}
