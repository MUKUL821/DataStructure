package edu.mukul;

public class PartioningArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,4,4,5,6,7,3,7,2,3,4};
		int k =3;
		sort(arr, 0, arr.length-1, k);
		
			
	}
	public static int partition(int [] arr, int low, int high, int num){
		
		int j= low-1;
		//{6, 7, 8 3 7}
		for(int i = low; i <= high; i++){
			if(arr[i] < num){
				System.out.println("les"+ i);
				int temp = arr[j+1];
				arr[j+1] = arr[i];
				arr[i] = temp;
				 j++;
			}

		}
		
		System.out.println("partition will be "+j);
return j;
	}
	
	public static void printArr(int [] arr){
		for(int a: arr)
			System.out.print(" "+a);
			
		
	}
	public static void sort(int [] arr, int low, int high, int num){
		
		
			
			int res =partition(arr, low, high, num);
			printArr(arr);
			partition(arr, res+1, high, num+1);
			printArr(arr);
			//sort(arr, low, partition -1);
			//sort(arr, partition+1, high);
		
	}
	

}
