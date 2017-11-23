package conceptTest;


import java.util.Stack;

import tree.NodeTree;

public class TernaryIntoTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String exp = "a?b?c?m:n:d:e";
		
		 NodeTree res = convertExpression(exp);
		 traverse_preorder(res);
	}
	private static void traverse_preorder(NodeTree node) {
		if (node== null)
	            return;
	    // now deal with the node
        System.out.print(node.data + " ");
	     // first recur on left subtree
		 traverse_preorder(node.left);
	      // then recur on right subtree
		 traverse_preorder(node.right);
	  	}
	 public static NodeTree convertExpression(String str){
		 NodeTree node = null ;
		 if(str.length()<5)
	            return node;
	      
		Stack<NodeTree> stac = new Stack<NodeTree>();
		node = new NodeTree(str.charAt(0));
		stac.push(node);
		int i =0;
		while(!stac.isEmpty() && (i < str.length()-2)){
			if(str.charAt(i+1)=='?'){
				NodeTree a =  new NodeTree(str.charAt(i+2));
				stac.peek().left = a;
				stac.push(a);
				i = i+2;
				continue;
			}
			if(str.charAt(i+1)==':'){
				NodeTree b = stac.peek();
				stac.pop();
				b.right = new NodeTree(str.charAt(i+2));
				i = i+2;
				continue;
			}
				
		}
		
		return node;
		
	 }
	

}
