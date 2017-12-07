package tree;

import java.util.ArrayList;
import java.util.List;

public class UniqueBST {

	public static void main(String[] args) {
		List<NodeTree> ls = genTrees(1, 3);
		System.out.println(" ls: "+ls.size());

	}
	
	 public static List<NodeTree> genTrees (int start, int end){
		 List<NodeTree> list = new ArrayList<NodeTree>();

	        if(start>end)
	        {
	            list.add(null);
	            return list;
	        }
	        
	        if(start == end){
	            list.add(new NodeTree(start));
	            return list;
	        }
	        List<NodeTree> left,right;
	        
	        for(int i= start; i <= end; i++){
	        	
	        	left = genTrees(start, i-1); 
	        	right= genTrees(i+1, end);
	        	
	        	for(NodeTree l: left){
	        		
	        		for(NodeTree r: right){
	        			NodeTree root = new NodeTree(i);
	        			root.left = l;
	        			root.right = r;
	        			list.add(root);
	        			
	        			
	        		}
	        	}
	        	
	        }
	        return list;
	        
	        
	        
		 
		 
		 
	 }
	 

}
