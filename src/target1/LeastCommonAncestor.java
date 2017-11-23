package target1;

import tree.NodeTree;

public class LeastCommonAncestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeTree root=new NodeTree(13);
		root.left=new NodeTree(7);
		root.right=new NodeTree(83);
		root.left.right=new NodeTree(10);
		root.left.left=new NodeTree(6);
		root.right.left=new NodeTree(19);
		root.right.right=new NodeTree(16);
		
		NodeTree res = lowestCommonAncestor(root, new NodeTree(16), new NodeTree(6));
		System.out.println(res.data);
		
	}

	 public static NodeTree lowestCommonAncestor(NodeTree root, NodeTree p, NodeTree q) {
		 if (root == null || root.data == p.data || root.data == q.data) {
			 int val1 = root== null? -1 : root.data;
			 System.out.println("TRUE " +val1);
			 return root;
			 }
		 
		 System.out.println("startp  are"+ root.data);  
		 NodeTree left = lowestCommonAncestor(root.left, p, q);
		 int val = left== null? -1 : left.data;
		    System.out.println("L: left and right are"+ val+ " "+root.data);
		    NodeTree right = lowestCommonAncestor(root.right, p, q);
		    int val3 = right== null? -1 : right.data;
		    System.out.println("R: left and right are"+ val3+ " "+root.data);
		    
		    return left == null ? right : right == null ? left : root;

	    
	    }
}
