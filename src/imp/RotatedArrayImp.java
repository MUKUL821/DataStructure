package imp;

public class RotatedArrayImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public boolean search(int[] arr, int target) {
	        int len = arr.length;
	        int start = 0; int end = len-1;
	        if(len==0)
	            return false;
	 
	        while(start <= end){
	            int mid = start+ (end-start)/2;
	            if(arr[mid]==target)
	                return true;
	            if(arr[mid] < arr[end]){
	                 if(arr[mid]<target && arr[end] >= target)
	                    start = mid + 1;
	                     else
	                    end = mid;        
	            }
	            else if (arr[mid] > arr[end]){
	                if( arr[mid]> target && arr[start] <=target)
	                     end = mid;
	                else
	                    start = mid+1;
	                    
	                
	            }
	            else{
	                end--;
	            }
	            
	            
	        }
	     return arr[start] == target ? true : false;
	    }
}
