package levelMedium;


public class Heapify {
	// 16 14 10 8 7 9 3 2 4 1 // 2,4,5,6,8,10,12,16,23
// 1 2 3 4 5 6
	    public static int[] nums = {1,5,6,10,2,3,1};
	    
	    static int heap;
	    public static void main(String[] args) {
	    	
	  System.out.println(" ans: "+findKthLargest(nums, 3));	
	    	
	    	////System.out.println("  "+extract(nums.length));
	    }
		public static void printArray(int[] nums){
			for(int num: nums)
				System.out.println(" "+num);
		}
	    public static int findKthLargest(int[] arr, int k) {
	        nums = arr;
	        heap = nums.length -1;
	    	minHeap(nums);
	    	//printArray(nums);
	    System.out.println("heap size starting "+heap);
	    		if(k==1)
	    			return nums[0];
		    	for(int i=0; i < k-1;i++){
		    		extract();
		    	System.out.println("EXTRACT "+nums[0]);
		    		}
		    	
		    return nums[0];
		    	
		}

		public static void minHeap(int[] nums){
		    int mid = (heap-1)/2;
		    for(int i=mid; i >=0; i--){
		    	System.out.println("   i is------"+ nums[i]);
		    	heapify(i);
		    		
		    }

		}
		 
	    public static void heapify(int i){
		  int k = i;
		  int size = heap;
		  int largest = -1 ;
		   if(k >=0 && k <= heap){
			   //System.out.println("heap size"+heap+ "k is"+nums[k]);
	            int left = 2*k+1;
	            int right = 2*k+2;
	         System.out.println("left: "+left+ "right "+right+ " i: "+i);
	            if(left <= size && nums[k]<nums[left]){
	            	 largest = left;
	            	System.out.println("entered left");
	            }
	               
	            if(right <= size && nums[k]<nums[right]){
	                if(nums[right]>nums[left])
	                    largest = right;
	            System.out.println("entered right");
	            }
	          System.out.println("largerst: "+largest);
	   
	            if(largest>0)
	                exch( k, largest);

	            heapify(largest);
		    }    	
		    	
		}
		    
	    private static void exch(int k, int left) {

	        int tem = nums[k];
	        nums[k] = nums[left];
	        nums[left] = tem;


	    }

	    public static void extract(){

	        if(heap == -1)
	            return;
 
	   System.out.println("heap: "+heap);
            nums[0] = nums[heap];
           System.out.println("num is"+nums[0]);
            heap--;
            heapify(0);
	        

	    }
		    
	    
	    
	    
	    
}

	  