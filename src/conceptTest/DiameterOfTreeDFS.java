package conceptTest;

import tree.NodeTree;

//Java program to find diameter of a 
//binary tree using DFS.

public class DiameterOfTreeDFS{
static int global_max = 0;
public static void diameter_check(int max){
	global_max = (global_max<max)? max : global_max;
}
public static void find_diameter_of_tree(NodeTree root){
	if(root==null){
		System.out.println("empty tree");
		return;
	}
	find_diameter(root);
}
public static int find_diameter(NodeTree root){

	if(root==null)
		return 0;
	
	int left = find_diameter(root.left);
	int right = find_diameter(root.right);
	
	int max = Math.max(left, right)+1;
	diameter_check(left+ right+1);
	return max;
	
}
 public static void main(String args[]){
	 NodeTree root= new NodeTree(1);
	 root.left= new NodeTree(2);
	 root.left.right= new NodeTree(5);
	 root.left.right.right= new NodeTree(7);
	root.right= new NodeTree(3);
	root.left.left= new NodeTree(4);
	root.left.left.left= new NodeTree(4);
	root.left.left.left.left= new NodeTree(224);

		find_diameter_of_tree(root);
		System.out.println("diameter is: "+global_max);
 }
}

