package levelHard;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Interval {
	     int start;
	     int end;
	 	 Interval() { start = 0; end = 0; }
	     Interval(int s, int e) { start = s; end = e; }
	 }
public class InsertIntervals {
	   public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
	        List<Interval> ls = new ArrayList<Interval>();
	        if(intervals.size()==0)
	            return ls;
	        
	       Stack<Interval> stack = new Stack<Interval>();
	       for(int i = 0; i < intervals.size(); i++){
		    	  if(intervals.get(i).start > newInterval.start){
		    		  intervals.add(i, newInterval);
		    		  break;
		    	  }
		    		  
	       }

	        for(Interval interval: intervals){

	            if(stack.isEmpty()){
	            	 stack.push(interval); 
	            	 continue;
	            }
	               
	            Interval top = stack.peek();
	            if(top.start==interval.start){
	            	stack.pop();
	            	top.end = Math.max(top.end, interval.end);
	            	stack.push(top);
	            	
	            }
	            else if(top!=null && top.end >= interval.start){
	            	Interval in = interval;
	                while(!stack.isEmpty() && top.end > in.start){
	                	stack.pop();
	                    Interval obj = new Interval();
	                    obj.start = top.start;
	                    obj.end = interval.end;
	                    in = obj;
	                    if(!stack.isEmpty())
	                       top = stack.peek();
	       
	                }
	                stack.push(in);
	            }
	            else{
	                stack.push(interval);
	            }  
     
	            
	        }
	        while(!stack.isEmpty()){
	            Interval i = stack.pop();
	            ls.add(0,i);
	        }
	        return ls;
	    }
	   
	   public static void main(String[] args) {
		   List<Interval> intervals = new ArrayList<Interval>();
		   intervals.add(new Interval(1,3));
		   intervals.add(new Interval(4,9));
		   intervals.add(new Interval(5,8));
		   intervals.add(new Interval(6,19));
		   intervals.add(new Interval(14,29));
		   intervals.add(new Interval(29,30));
		   Interval obj = new Interval(4,5);
		   
		   List<Interval> ans =  insert(intervals, obj);
		   System.out.println(" ans --------");
		   for(Interval in: ans)
			   System.out.println(in.start+ "  "+in.end);

	}
}
