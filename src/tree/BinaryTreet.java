package tree;
/*mukul.. copied*/
// Level wise traversing - recursive function
class BinaryTreet
{
	// Root of the Binary Tree
	NodeTree root;

	static int len = 0; // global variable
	public int longestUnivaluePath(NodeTree root) {
		System.out.println("-----------");
	    if (root == null) return 0;
	    len = 0;
	    getLen(root, root.data);
	    return len;
	}
	public int sumOfLeftLeaves(NodeTree root) {
	    if(root == null) return 0;
	    int ans = 0;
	    if(root.left != null) {
	        if(root.left.left == null && root.left.right == null) {ans += root.left.data;
		    System.out.println(" left"+root.data);}
	        else ans += sumOfLeftLeaves(root.left);
	    }
	    System.out.println(" yup"+root.data);
	    ans += sumOfLeftLeaves(root.right);
	    
	    return ans;
	}
	private static int getLen(NodeTree node, int val) {
		
	    if (node == null) return 0;
	    int left = getLen(node.left, node.data);
	    int right = getLen(node.right, node.data);
	    len = Math.max(len, left + right);
	    if (val == node.data)  return Math.max(left, right) + 1;
	    return 0;
	}
	
	public BinaryTreet()
	{
		root = null;
	}

	/* function to print level order traversal of tree*/
	void printLevelOrder()
	{
		int h = height(root);
		int i;
		for (i=1; i<=h; i++)
			printGivenLevel(root, i);
	}

	/* Compute the "height" of a tree -- the number of
	nodes along the longest path from the root node
	down to the farthest leaf node.*/
	int height(NodeTree root)
	{
		if (root == null)
		return 0;
		else
		{
			/* compute height of each subtree */
			int lheight = height(root.left);
			int rheight = height(root.right);
			
			/* use the larger one */
			if (lheight > rheight)
				return(lheight+1);
			else return(rheight+1); 
		}
	}

	/* Print nodes at the given level */
	void printGivenLevel (NodeTree root ,int level)
	{
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.data + " ");
		else if (level > 1)
		{
			printGivenLevel(root.left, level-1);
			printGivenLevel(root.right, level-1);
		}
	}
	
	/* Driver program to test above functions */
	public static void main(String args[])
	{
		System.out.println("Level order traversal of binary tree is ");
		BinaryTreet tree = new BinaryTreet();
		NodeTree root= new NodeTree(1);
	 root.left= new NodeTree(2);
	root.right= new NodeTree(3);
	root.left.left= new NodeTree(4);
	root.left.left.left= new NodeTree(4);
	
		root.left.left.left.left= new NodeTree(78);
		root.left.right= new NodeTree(5);
		root.left.right.left= new NodeTree(5);
		
	System.out.println("Level order traversal of binary tree is ");
	System.out.println("Ans: "+tree.sumOfLeftLeaves(root));
	}
}
