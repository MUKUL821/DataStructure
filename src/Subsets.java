import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		//generateAbbreviations("wor");
		//subsets(nums);
		System.out.println(0.5*0.5);
		System.out.println(" "+myPow(2, -2147483648));
		
		
	}
	  public static double myPow(double x, int n) {
		  System.out.println("x is "+x);
		  if(n == 0)
	            return 1;
	        if(n<0){
	        	System.out.println("n is "+n);
	            n =  - n;
	            System.out.println("n is "+n);
	            x = 1/x;
	        }
	        System.out.println("return "+x+" " +n);
	        return (n%2==0)? myPow(x*x, n/2): x*myPow(x*x, n/2);
	        
	    }
	
	 public static List<String> generateAbbreviations(String word) {
	        List<String> res = new ArrayList<>();
	        StringBuilder tmpRes = new StringBuilder();
	        char[] wordArray = word.toCharArray();
	        dfs(res, tmpRes, wordArray, 0, 0);
	        System.out.println(" "+res);
	        return res;
	    }
	    
	    private static void dfs(List<String> res, StringBuilder tmpRes, char[] wordArray, int pos, int numCount) {
	        if(pos == wordArray.length) {
	            if(numCount > 0) tmpRes.append(numCount);
	            res.add(tmpRes.toString());
	            return;
	        }
	        
	        // use number
	        int len = tmpRes.length();
	        dfs(res, tmpRes, wordArray, pos + 1, numCount + 1);
	        tmpRes.setLength(len);              // backtracking
	        
	      
	        if(numCount > 0) {
	            tmpRes.append(numCount).append(wordArray[pos]);
	            dfs(res, tmpRes, wordArray, pos + 1, 0);    
	        } else {
	            tmpRes.append(wordArray[pos]);
	            dfs(res, tmpRes, wordArray, pos + 1, 0);
	        }
	        tmpRes.setLength(len);              // backtracking
	    }


	    
 /********     *****************************************    *************       ****************/

	 public static List<List<Integer>> subsets(int[] nums) {
			List<List<Integer>> res = new ArrayList<List<Integer>>();
			if (nums == null || nums.length == 0) return res;
			res.add(new ArrayList());
			int len  =  nums.length;
			for (int i = 0; i < len; i++){
				int size  =  res.size();
				System.out.println("res"+res);
				System.out.println(" ------ res.size "+ res.size());
				for (int j = 0; j < size; j++){
					System.out.println("  res.get(j) "+ res.get(j));
					ArrayList<Integer>  temp  = new ArrayList<Integer>(res.get(j));
					temp.add(nums[i]);
					res.add(temp);
				}
			}
			System.out.println("res"+res);
			return res;
			
		}
}
