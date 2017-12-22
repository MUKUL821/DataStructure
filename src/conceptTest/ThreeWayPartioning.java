package conceptTest;

public class ThreeWayPartioning {
	// 5 	6 	4 	13 	2 	5
	// 13   6   5   5   4   2
	// 2 	4 	5	5	6	13
	// 3	5	5	6	4	13
	// 3	5	3	6	5	6	13
	public static void main(String[] args) {
		int[] arr = {1, 14, 5, 20, 4, 2, 54, 20, 87};
		int lowVal = 14;
		int highVal = 20;
		int start = 0; int end = arr.length-1;
		for(int i=0; i < end; ){
			if(arr[i] < lowVal){
				swap(arr, start, i);
				start++;i++;
				
			}
			else if(arr[i] > highVal){
				swap(arr, end, i);
				end--;
			}
			else
				i++;
		}
		
		for(int num: arr)
			System.out.print(" "+num);
	}

	private static void swap(int[] arr, int start, int i) {
		int temp = arr[start];
		arr[start] = arr[i];
		arr[i] = temp;
	}

}
