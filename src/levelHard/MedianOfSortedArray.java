package levelHard;

//incomplete
public class MedianOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2}; 
		int arr2[] = {3,4}; // 1 2 3 4
System.out.println("result "+findMedianSortedArrays(arr,arr2));
	}

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

    	        int len1 = nums1.length;
    	        int len2 = nums2.length;
    	        if(len1 < 1 && len2<1)
    	            return 0.0;
    	        if(len1 < 1) {
    	        if(len2 % 2==1)
    	            return (double)nums2[len2/2];
    	            else return (double)(nums2[(len2/2)] + nums2[(len2/2)-1])/2;
    	        }
    	         if(len2 < 1) {
    	        if(len1 % 2==1)
    	            return (double)nums1[len1/2];
    	            else return (double)(nums1[(len1/2)] + nums1[(len1/2)-1])/2;
    	        }

    	        int mid =0, mid2 = (len1+len2)/2+1; 
    	       System.out.println("mid2 "+mid2);
    	        int i1=0, i2=0, count=0, prev =0;
    	        while(count < mid2 && i1<len1 && i2<len2){
  
    	        	
    	            prev = mid;
    	            if(nums1[i1]<nums2[i2]){
    	                mid = nums1[i1++];
    	            }
    	            else{
    	                mid = nums2[i2++];
    	            }
    	            count++;
      	            System.out.println("prev"+prev);
        	        System.out.println("mid"+mid);
        	        System.out.println("count------------"+count);
    	        }
    	        if(count < mid2){
    	        	 int diff = mid2-count;
    	        	 
    	           System.out.println("diff"+diff+ " i1 "+i1+" i2 "+i2+ "prev"+prev);
    	            if(i1<len1){
    	            	if(diff==1)
     	                    prev = mid;
    	            	else
    	            		prev = nums1[i1+diff-2];
    	               mid = nums1[i1+diff-1];
    	            }
    	   
    	            if(i2<len2){
    	            	if(diff==1)
     	                    prev = mid;
    	            	else
    	            		prev = nums2[i2+diff-2];
    	                 mid = nums2[i2+diff-1];
    	        
    	            }
    	            
    	                
    	        }
    	   
    	         if((len1+len2) %2 ==0){
    	        	 System.out.println("yes");
    	        	 
    	            return (double)(prev+mid)/2;
    	        }
    	        else
    	            return mid;
    	        
    	    }
}
