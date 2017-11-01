package Fortinet;

import java.util.List;

class SameSum
{
//Recursive Utility method to check K equal sum
//subsetition of array
/**
	array		 - given input array
	subsetSum array - sum to store each subset of the array
	taken		 - boolean array to check whether element
					is taken into sum substitution or not
	K			 - number of substitution needed
	N			 - total number of element in array
	curIdx		 - current subsetSum index
	limitIdx	 - lastIdx from where array element should
					be taken */
static boolean isKPartitionPossibleRec(int arr[], int subsetSum[], boolean taken[],
				int subset, int K, int N, int curIdx, int limitIdx)
{
	
	if (subsetSum[curIdx] == subset)
	{
		System.out.println("in condition");
		/* current index (K - 2) represents (K - 1) subsets of equal
			sum last substitution will already remain with sum 'subset'*/
		if (curIdx == K - 2)
			return true;

		// recursive call for next substitution
		return isKPartitionPossibleRec(arr, subsetSum, taken, subset,
											K, N, curIdx + 1, N - 1);
	}

	// start from limitIdx and include elements into current substitution
	//{8,1,2,4,6,3,7,5};
	for (int i = limitIdx; i >= 0; i--)
	{
		// if already taken, continue
		if (taken[i])
			continue;
		int tmp = subsetSum[curIdx] + arr[i];

		// if temp is less than subset then only include the element
		// and call recursively
		if (tmp <= subset)
		{
			// mark the element and include into current substitution sum
			taken[i] = true;
			subsetSum[curIdx] += arr[i];
			System.out.println("before call: "+subsetSum[curIdx] );
			boolean nxt = isKPartitionPossibleRec(arr, subsetSum, taken,
											subset, K, N, curIdx, i - 1);

			if (nxt)
				return true;
			System.out.println("after call: "+subsetSum[curIdx] );
			taken[i] = false;
			subsetSum[curIdx] -= arr[i];
			System.out.println("after call- substracting: "+subsetSum[curIdx]+ "i is:"+i );
			
		}
	}
	return false;
}

//Method returns true if arr can be substituted into K subsets
//with equal sum
static boolean isKPartitionPossible(int arr[], int N, int K)
{
	// If K is 1, then complete array will be our answer
	if (K == 1)
		return true;

	// If total number of substitution are more than N, then
	// division is not possible
	if (N < K)
		return false;

	// if array sum is not divisible by K then we can't divide
	// array into K subsetitions
	int sum = 0;
	for (int i = 0; i < N; i++)
		sum += arr[i];
	if (sum % K != 0)
		return false;
	System.out.println("sum is :"+sum);
	// the sum of each subset should be subset (= sum / K)
	int subset = sum / K;
	int subsetSum[] = new int[K] ;
	boolean taken[] = new boolean[N];

	// Initialize sum of each subset from 0
	for (int i = 0; i < K; i++)
		subsetSum[i] = 0;

	// mark all elements as not taken
	for (int i = 0; i < N; i++)
		taken[i] = false;

	// initialize first subsubset sum as last element of
	// array and mark that as taken
	subsetSum[0] = arr[N - 1];
	taken[N - 1] = true;
	if (subset < subsetSum[0])
		return false;

	// call recursive method to check K-substitution condition
	return isKPartitionPossibleRec(arr, subsetSum, taken,
									subset, K, N, 0, N - 1);
}

//Driver code to test above methods

 public static boolean separate(List<Integer> list, int k){
	 
	return false;
	   // Your resolution 
	   // Time complexity:  
	   // Space complexity: 
	}
	  // JUnit test cases 
 /*Driver function to check for above function*/
 public static void main (String[] args)
 {
	 //{3,5,6,7,3,7,5};

	 int arr[] = {3,5,6,7,3,7,5};
	 //{8,1,2,4,6,3,7,5};
	 //5,3,4    7,
     int k = 3;
     int n = arr.length;
 	if (isKPartitionPossible(arr, n, k))                           
 		System.out.println("Partitions into equal sum is possible.\n");
	else
		System.out.println("Partitions into equal sum is not possible.\n");
 
 }
}

