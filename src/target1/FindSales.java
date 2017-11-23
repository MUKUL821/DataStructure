package target1;

public class FindSales {

	public static void main(String[] args) {
		int []arr = {5,3,1};
		System.out.println(" res : "+ maxProfit(arr));
	}

	public static int maxProfit(int[] arr) {
		if(arr.length<2)
        	return 0;
         int max = arr[0]; int min = arr[0];
        int  i=1;
        int ans = 0;
        
        while(i < arr.length){
           if(arr[i] < min){
        	   max = -1;
               min = arr[i];
           }
            else
           max = Math.max(max, arr[i]);
        ans = Math.max(ans, max-min);
           i++;
         }
       // ans = Math.max(ans, max-min);
        return ans;
        }
}
