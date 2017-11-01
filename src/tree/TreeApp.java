package tree;
/*mukul*/
public class TreeApp {

	public static void main(String [] args){
		
		//inputting NodeTrees in tree
		BinaryTree bt= new BinaryTree();
		bt.root=new NodeTree(3);
		bt.root.left=new NodeTree(7);
		bt.root.left.right=new NodeTree(99);
		bt.root.left.left=new NodeTree(55);
		bt.root.right=new NodeTree(83);
		bt.root.right.left=new NodeTree(97);
		bt.root.right.left.left=new NodeTree(9);
		bt.root.right.left.right=new NodeTree(66);
		bt.root.right.left.right.left=new NodeTree(8);
			
		//TREE TRAVERSAL-PRE/IN/POSTORDER
		bt.traversal_postorder();
		
		// FOR LEVEL-WISE TRAVERSAL
		//System.out.println("Level order traversal of binary tree is ");
	//	bt.levelTraversal(bt.root);
		/*
		
		FOR HEIGHT OF TREE
		System.out.println("height of binary tree is "+ bt.height(bt.root));
		
		//MORRIS INORDER TREE TRAVERSAL- WITHOUT RECURSION AND WITHOUT STACK
		System.out.println("Morris inorder traversal");
		bt.traversal_withoutRecursionNstack();
	  
		System.out.println("nodes at kth distant where k is first parameter");
		bt.printNthNode(4, bt.root);
		
		**/
		/******************************BST*******************************************/
		
		//insert the node
		
		BinarySearchTree bst= new BinarySearchTree();
	NodeTree node= new NodeTree(89);
		bst.insertNode(node);
		NodeTree node1= new NodeTree(9);
		NodeTree node3= new NodeTree(1);
		NodeTree node2= new NodeTree(90);
		bst.insertNode(node1);
		bst.insertNode(node2);
		bst.insertNode(node3);
		//bst.printBST();
		//FOR HEIGHT OF TREE
		System.out.println("height of binary tree is "+ bt.height(bt.root));
		
		//bst.deleteNode(89);
	}
}
