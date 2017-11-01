package conceptTest;

public class Recursion {
	
	//1, 2, 3, 4, 5, 6, 7...1,2,3,7,6,5,4
	//7 1 6 2 5 3 4
	
	//
	/***
	 * 1..1+2
	 * max_ind = 6;min-ind= 0; temp = arr[1]; 
	 * temp1 = arr[1]
	 * arr[1] = arr[0]
	 * arr[0] = arr[max_ind]...max_ind--
	 * 
	 *  temp = arr[1]; 
	 * temp1 = arr[1]
	 * arr[1] = arr[0]
	 * arr[0] = arr[max_ind]
	 * 
	 * 
	 * 
	 * ; 
****/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {5,7,8,9,10,11};
		int mid=2;
		//recur(arr, 0, -1, 2);
		Pair pair = new Pair(0,1);
		recur_opp(arr, arr.length, 2, pair);
		
		for(int i=0;i< arr.length-1;i++)
			System.out.print( " "+arr[i]);
	}

	static void recur(int[] arr, int high, int i, int mid){
		Pair pair = new Pair(0,1);
		if(high<arr.length-1){
			
			i=i+1; ; high = mid+1+i;
			System.out.println("high"+high+"i:"+(i));
		recur(arr, high, i, mid);
		//merge(arr,high, i, mid);
		}
	}
	
	static void recur_opp(int[] arr, int i, int mid, Pair pair){
		
		
		if(i>(2+1)){
		//5 2...4 1...3
			i = i-1; mid =  2 -(arr.length-i-1);
			System.out.println("i:"+(i)+ " "+mid);
		recur_opp(arr,  i, mid, pair);
		merge(arr,mid, i, mid, pair);
		}
		
	}
	static void merge(int[] arr, int low, int i, int mid, Pair pair){
		System.out.println("Merge is: "+i+" "+ (arr[mid])+" "+pair.start+ " "+pair.end);
		
		arr[pair.start] = arr[i];
		arr[pair.end] = arr[mid];
		pair.start = pair.start+2;
		pair.end = pair.end+2;
		
	}
}
class Pair{
	int start ;int end;
	Pair(int start, int end){
		this.start = start;this.end = end;
	}
}