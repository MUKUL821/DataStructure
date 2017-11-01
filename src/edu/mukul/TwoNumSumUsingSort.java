package edu.mukul;
/*mukul*/
public class TwoNumSumUsingSort {
//using mergesort with complexity nlogn;
	public void operations(int[] arr){
	int length = arr.length;	
	mergesort(arr, 0, length);
		
	}
	
	 public static void main(String args[])
	    {
	        int arr[] = {12, 11, 13, 5, 6, 7};
	 
	        System.out.println("Given Array");
	        printArr(arr);
	 
	        TwoNumSumUsingSort ob = new TwoNumSumUsingSort();
	        ob.mergesort(arr, 0, arr.length-1);
	 
	        System.out.println("\nSorted array");
	        printArr(arr);
	    }

private static void printArr(int[] arr) {
	for(int i=0;i< arr.length;i++)
		System.out.println(" "+ arr[i]);
		
	}

private void mergesort(int arr[], int start, int end) {
	
	if(start<end)
	{
		int mid = (start+end)/2;
		System.out.println("mid 1---"+mid);
		mergesort(arr, start,mid);
		System.out.println("second line");
		System.out.println("mid 2--"+mid);
		mergesort(arr, mid+1,end);
		System.out.println("third line"+start+" "+mid+" "+ end);
		
		
		
		merge(arr, start,mid,end);
		System.out.println("forth line");
	}
	
}

private void merge(int[] arr, int start,int mid, int end) {
	
	int[] temp1 = new int[mid-start+1];
	int[] temp2 = new int[end-mid];
	//int[] finalarr = new int[end-start+1];
	for(int i=start;i<= mid;i++)
		temp1[i-start]= arr[i];
	
	for(int i=mid+1;i<=end;i++)
		temp2[i-mid-1]= arr[i];
	
    /*Copy data to temp arrays*/
    for (int i=0; i<(mid-start+1); ++i)
        temp1[i] = arr[start + i];
    for (int j=0; j<(end-mid); ++j)
        temp2[j] = arr[mid + 1+ j];

	
	//now sort while merging
	
	int index1=0, index2=0;int i=1;
	
	while(index1< temp1.length && index2< temp2.length){
		if(temp1[index1]<= temp2[index2])
		{	System.out.println("in 1.."+temp1[index1]+" "+temp2[index2]+ "i is"+ i); 
			arr[i]=temp1[index1];
		index1++;
		}
		else if(temp1[index1] >temp2[index2])
		{	System.out.println("in 2.."+temp1[index1]+" "+temp2[index2]+"i is"+ i); 
		arr[i]=temp2[index2];index2++;}
		
		i++;
		
		
	}
	// if elements still remain in any..
	
	while(index1< temp1.length)
	{
      arr[i]=temp1[index1]; index1++; i++;}
	while(index2< temp2.length)
	{  arr[i]=temp2[index2];index2++;i++;}
	
}
}
