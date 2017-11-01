package generalHacker;
/*mukul*/
public class FloorMethod {

	public int floorNumber(int arr[], int s, int e,int n){
		
		int mid = (s+e)/2;
		
		System.out.println("yes"+s+" "+e+"mid"+mid);
	     if(arr[mid]< n && mid<arr.length-1)
	    	return floorNumber(arr, mid+1, e,n);
	     else
		     if(arr[mid]> n && mid>0 )
		    	 return floorNumber(arr, s, mid-1,n);	 
	    if(arr[mid]==n ||mid==arr.length-1)
	    	 return arr[mid];
	   if(mid-1>0)
	    return arr[mid-1];
	   else return -1;
	
	}
	public static void main(String []args){
		 int arr[]= {2,4,6,8,9,10,11};
		int result= new FloorMethod().floorNumber(arr, 0, arr.length-1, 2);
		System.out.println("result is"+result);
	}
}
