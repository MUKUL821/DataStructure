package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/*mukul*/
public class BinaryTree {

	NodeTree root ;
	int heightL,heightR=0;
	BinaryTree (){
		root=null;
	}
	
	
	public void traversal_postorder(){
		traverse_postorder(this.root);
	}
	public void traversal_preorder(){
		traverse_preorder(this.root);
	}
	public void traversal_inorder(){
		traverse_inorder(this.root);
	}

	private void traverse_postorder(NodeTree node) {
		if (node== null)
	            return;
	     // first recur on left subtree
		 traverse_postorder(node.left);
	      // then recur on right subtree
		 traverse_postorder(node.right);
		    // now deal with the node
	        System.out.print(node.data + " ");
	}
	private void traverse_preorder(NodeTree node) {
		if (node== null)
	            return;
	    // now deal with the node
        System.out.print(node.data + " ");
	     // first recur on left subtree
		 traverse_preorder(node.left);
	      // then recur on right subtree
		 traverse_preorder(node.right);
	  	}
	void traverse_inorder(NodeTree node) {
		if (node== null)
	            return;
	     // first recur on left subtree
		 traverse_inorder(node.left);
	      // then recur on right subtree
		  // now deal with the node
	        System.out.print(node.data + " ");
	
		 traverse_inorder(node.right);
	  }

	public void levelTraversal(NodeTree node)
	{
		
		if(node==null)
			return;
		else{
			  Queue<NodeTree> queue = new LinkedList<NodeTree>();
		        queue.add(node);
		        
		        
		        while(!queue.isEmpty()){
		        	NodeTree curr = queue.remove();
		        System.out.println(curr.data);
		        if(curr.left!=null)
		        	queue.add(curr.left);
		        if(curr.right!=null)
		        	queue.add(curr.right);
		        }
		    }
		}
     int lheight,rheight;
	public int height(NodeTree node){
		System.out.println("#######");
		if(node==null)
			return 0;
		 lheight=height(node.left);
		 System.out.println(node.data);
		 rheight=height(node.right);
		 System.out.println(node.data+" "+lheight+ " "+rheight);
		 if(lheight>rheight)
			 return lheight+1;
		 else return rheight+1;
		
	
}


	public void traversal_withoutRecursionNstack() {
	// pending.........
		// trverse till current==null
		//traverse current.left==null ..print n curren=current.right;
		//else pre=current.left; pre=pre.right till its null......see book for further  details
	}

public void printExtremes(){
	
	//pending...do it later
	NodeTree root=this.root;
	boolean first=true;
	int count=0; int level=0;
	while(root!=null){
		Queue<NodeTree> queue=new LinkedList<NodeTree>();
		queue.add(root);
		
		
		while(!queue.isEmpty()){
		
			NodeTree target =queue.remove();
			if(count==Math.pow(2,level) && first)
			System.out.println(target.data);
		
			if(root.left!=null)queue.add(root.left);
			if(root.right!=null)queue.add(root.right);
	}
		//print stack.data;
	
	}
	
}

public void printNthNode(int k, NodeTree node){
	Queue<NodeTree> parent=new LinkedList<NodeTree>();
	Queue<NodeTree> child=new LinkedList<NodeTree>();
	//add root in parent to start wit
	parent.add(node);
	int count=0;
	 NodeTree node_current;
do{
	node_current=parent.remove();
	//System.out.println("current"+node_current.data);
	child.clear();
	while(node_current!=null)
	{
		
	//	System.out.println("...."+node_current.left.data+"   "+node_current.right.data);
		if(node_current.left!=null)
			child.add(node_current.left);
		
		if(node_current.right!=null)
	       child.add(node_current.right);
		
		if(parent.isEmpty())
			node_current=null;
		else
		node_current= parent.remove();
			
	}
	count++;
	System.out.println("size is"+child.size());
	parent.addAll(child);
	
//System.out.println("count"+count+" "+parent.peek().data);
	
}while(!parent.isEmpty() && count<k);

//printing result
System.out.println("nodes are :");
while(!child.isEmpty())
	System.out.print("   "+child.remove().data);
}
}