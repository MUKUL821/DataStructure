package conceptTest;
import tree.NodeTree;

//Java program to find diameter of a 
//binary tree using DFS.

public class EXPERIMENT {
static int global_max = 0;
public static void diameter_check(int max){
	global_max = (global_max<max)? max : global_max;
}
public static int find_diameter_of_tree(NodeTree root){
	if(root==null){
		System.out.println("empty tree");
		return 0;
	}
	return find_diameter(root);
	
}
public static int find_diameter(NodeTree root){

	if(root==null)
		return 0;
	
	int left = find_diameter(root.left);
	int right = find_diameter(root.right);
	
	int max = Math.max(left, right)+1;
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

		int level = find_diameter_of_tree(root);
		//PENDING.......
		traverse_to_level(root.left, level) ;
		traverse_to_level(root.right, level);
		
 }
private static void traverse_to_level(NodeTree left, int level) {
	// TODO Auto-generated method stub
	
}
}

