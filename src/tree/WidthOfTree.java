package tree;


import java.util.ArrayList;
import java.util.List;

public class WidthOfTree {

	public static void main(String[] args) {
		NodeTree root = new NodeTree(2);
		root.left = new NodeTree(3);
		
		root.right = new NodeTree(1);
		root.right.left = new NodeTree(9);
		root.right.right = new NodeTree(10);
		
		root.left.right = new NodeTree(30);
		int res = widthOfBinaryTree(root);
		System.out.println(" "+res);

	}
	  public static int widthOfBinaryTree(NodeTree root) {
	        List<Integer> lefts = new ArrayList<Integer>();                                     
	       // left most nodes at each level;
	        int[] res = new int[1]; // max width
	        widthSearch(root, 1, 0, lefts, res);
	        return res[0];
	    }
	  
	  public static void widthSearch(NodeTree node,int id,int depth, List<Integer>lst, int [] res ){
		  if(node == null)
			  return;
		  if(lst.size()<= depth)
			lst.add(id);  
		  res[0] = Math.max(res[0], 1+id - lst.get(depth));
		  
		  widthSearch(node.left, id*2, depth+1, lst, res);
		  widthSearch(node.right, id*2 + 1, depth+1, lst, res);
		  
		  
	  }
	  
	    private static void dfs(NodeTree node, int id, int depth, List<Integer> lefts, int[] res) {
	        if (node == null) return;
	        System.out.println("node is"+ node.data);
	        if (depth >= lefts.size()) 
	        	{
	        	lefts.add(id);   // add left most node
	        	System.out.println("lefts is"+ lefts+ " node is"+ node.data);
	        	}
	        System.out.println("res[0] "+ res[0] + " depth "+depth+"lefts.get(depth) "+ lefts.get(depth)+ "id is"+id);
	        res[0] = Integer.max(res[0], id + 1 - lefts.get(depth));
	        
	       System.out.println("res[]: "+res[0]);
	        dfs(node.left,  id * 2,     depth + 1, lefts, res);
	        System.out.println("----------");
	        dfs(node.right, id * 2 + 1, depth + 1, lefts, res);
	        System.out.println("--                                  --");
	    }
}
