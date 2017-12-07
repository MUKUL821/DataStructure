package target1;

public class SearcfForRange {

	public static void main(String[] args) {
		
		int[] arr = {5, 7, 7, 8, 8, 10};
		int[] res = searchRange(arr, 8);
		System.out.println(res[0]+" "+res[1]);
	}
    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        
        if(nums.length<1 || (nums[0]>target) || nums[nums.length-1] < target){
            return res;
        }
       
        return search(nums, res, 0, nums.length-1, target);
       
    }
    
    
    public static int[] search(int[] nums, int[] res,int start,int end, int target){
        if(start <= end)
        {
        int mid = start + (end-start)/2;
        if(nums[mid]==target){
            res[0]=mid; res[1]=mid;
            int i,j;
            i = j = mid;i--;j++;
            while((i>=0 && nums[i]==target) || (j < nums.length && nums[j]==target)){
                if(i>=0 && nums[i]==target)
                {
                    res[0]=i; i--;
                }
                if(j < nums.length && nums[j]==target){
                     res[1]=j;  j++;
                }
                   
            }
            
            return res;
        }
        if(nums[mid]>target)
            return search(nums, res, start, mid-1, target);
        else
            return search(nums, res, mid+1, end, target);   
        
      }
        return res;
    }

}
