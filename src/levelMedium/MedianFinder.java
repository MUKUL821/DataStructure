import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder {

	public static void main(String[] args) {
		addNum(3);addNum(-12);  
		addNum(32);addNum(53);addNum(12); addNum(3);addNum(3);addNum(3); 
		System.out.println(" findMedian "+findMedian());
	}
	


		   
	    private static Queue<Long> minHeap = new PriorityQueue();
		private static Queue<Long> maxHeap =  new PriorityQueue<>(Collections.reverseOrder());
		  static int totalNum = 0;
		// 2 3 12 4 1 9 99
	    public static void addNum(int num) {
			totalNum++;
	        if(maxHeap.size() == 0 || num <= maxHeap.peek()){
	            maxHeap.offer((long) num);
	        }else{
	            minHeap.offer((long) num);
	        }
	        
	        if(maxHeap.size() - minHeap.size() >= 2){
	            Long temp = maxHeap.poll();
	            minHeap.offer(temp);
	        }
	        
	        if(minHeap.size() - maxHeap.size() >= 2){
	            Long temp = minHeap.poll();
	            maxHeap.offer(temp);
	        }
	    }
	    
	    public static double findMedian() {
	    	System.out.println(" maxHeap "+maxHeap.toString());
	    	System.out.println(" minHeap "+minHeap.toString());
	        if(totalNum % 2 == 0){
	            return (maxHeap.peek() + minHeap.peek()) / 2.0;
	        }
	        else{
	            return maxHeap.size() > minHeap.size() ? maxHeap.peek() : minHeap.peek();
	        }
	    }
	}
