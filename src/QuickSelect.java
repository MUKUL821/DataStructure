
public class QuickSelect {

	public static void main(String[] args) {
		int[] arr = {1, 14, 5, 20, 4, 2, 54, 20, 87};
		//{1,2,4,5,14,20,20,87}
		System.out.println(" ans "+quicksearch(arr, 0, arr.length-1, (arr.length)/2+1));
	}
	public static int partition(int[] arr, int l, int r){
		 int x = arr[r], i = l;
		    for (int j = l; j <= r - 1; j++) {
		        if (arr[j] <= x) {
		            swap(arr, i, j);
		            i++;
		        }
		    }
		    swap(arr, i, r);
		    return i;
	}
	private static void swap(int[] arr,int start, int i) {
		int temp = arr[start];
		arr[start] = arr[i];
		arr[i] = temp;
		
	}
	public static int quicksearch(int[] arr, int start, int end, int k){
		
		if(k>0 && k <= (end-start+1)){
			
			int index = partition(arr, start, end);
			if(index-start == k-1)
				return arr[index];
			
			if(index-start > k-1){
				return quicksearch(arr, start, index-1, k);
			}
			return quicksearch(arr, index+1, end, k-index+start-1);
			
		}
		 return Integer.MAX_VALUE;
	}
}
