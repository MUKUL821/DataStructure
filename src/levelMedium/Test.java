import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import tree.NodeTree;

public class Test {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int[] nums = {0,0};
			System.out.println("Ans:  "+ longestConsecutive(nums));
			
			
		}

		 public static int longestConsecutive(int[] nums) {
		        
		        Arrays.sort(nums);
		        if(nums == null || nums.length < 1)
		            return 0;
		        
		        int count = 1; int max = 1;
		        
		        // 0,1,2,3,4 ;    0,1,2,3,4,7,8
		        for(int i=0; i < nums.length-1; i++){
		        	System.out.println("  yes "+nums[i]);
		        	 if((nums[i+1] - nums[i] != 1) && (nums[i+1] - nums[i] != 0)) {
		                max = Math.max(max, count);
		                count = 1;
		            }
		            else{
		            	if(!((nums[i]==nums[i+1]) && nums[i]==0))
		            		count++;
		            		
		            		
		            }
		         
		             
		        }
		      return Math.max(max, count); 
		    }
		
		
	    Stack<NodeTree> stack = new Stack<NodeTree>();
	    public Test(NodeTree root) {
	        while(root!=null){
	        	System.out.println(stack.size()+" stackk "+root.data);
	            stack.push(root);
	            root = root.left;
	        }
	    }


	    /** @return whether we have a next smallest number */
	    public boolean hasNext() {
	        return ((!stack.isEmpty()) || stack.size()>0);
	    }

	    /** @return the next smallest number */
	    public int next() {
	        
	        NodeTree node = stack.pop();
	        if(node.right!=null){
	            NodeTree newnode = node.right;
	            while(newnode!=null){
	                stack.push(newnode);
	                newnode = newnode.left;
	            }                
	            
	        }
	        
	        return node.data;
	    }
}
