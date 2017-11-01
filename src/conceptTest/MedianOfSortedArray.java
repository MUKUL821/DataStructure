package conceptTest;

public class MedianOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 6, 7};
		int arr2[] = {2,4,5};
System.out.println("result+ "+findMedianSortedArrays(arr,arr2));
	}

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        boolean even = false;
        if((length1+length2)%2 ==0)
        	even = true;
        int mid = (length1 + length2)/2;
        int start = -1; int index_1=0; int index_2 = 0;
        double last_elem = 0;double last_elem1 = 0;
        while(start<mid && index_1 < length1 && index_2 < length2 ){
            if(nums1[index_1] < nums2[index_2]){
            	
            	last_elem = nums1[index_1];
            	System.out.println("yes1 " + last_elem);
            	index_1++;
            }
            
            else{
            	
            	last_elem = nums2[index_2];
            	System.out.println("yes2 "+last_elem);
                 index_2++;
                
            }
               
            start++;
        
        }
        System.out.println("last-indes"+last_elem);
        System.out.println(" "+start + " " + mid + " "+length1+ " "+ length2);
        System.out.println(index_1+" "+ index_2);
        if(start!= mid)
            last_elem1 = (index_2 == length2)? nums1[index_1+mid -start-length2]: nums2[index_2+mid -start-length1];
            else 
            	last_elem1 = last_elem;
            System.out.println("last-indes1 "+last_elem1);
        if(even && mid-start-1<2)
        	last_elem = (index_2 == length2) ? nums1[index_1+mid-1 -start-length2]: nums2[index_2+mid-1-start-length1];
        	
        	 System.out.println("last-indes2 "+last_elem);
        if (even) return (last_elem+last_elem1)/2; else return last_elem1;
   

               
        
        
    }
}
