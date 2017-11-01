package tree;
/*mukul*/
public class BinarySearchTree {
	NodeTree node;
	int key;
	public BinarySearchTree(){
       node=null;
	}
    public void insertNode(NodeTree node){
    	 NodeTree root=this.node;
    	 NodeTree parent=null;
    	 if(root==null)
    	 { this.node =node;
    	 return;
    	 }
    	 while(root!=null)
    	 {
    		 parent=root;
    		 if(node.data<root.data)
    			root=root.left;   // //visit left subtree then
    		else
    			root=root.right;	 
         }
        
    	 if(parent.data<node.data)
    		 parent.right=node;
    	 else
    		 parent.left=node;
    	 
    
    }
	public void printBST() {
		// TODO Auto-generated method stub
		NodeTree root=this.node;
     new BinaryTree().traverse_inorder(root);
			
		}
    
	public void deleteNode(int val){
		//INCOMPLETE SOLUTION-NEED GOOD LOGIC-AVOID NESTED IF ELSE
		NodeTree node = this.node;
		key=val;
		NodeTree parent =null;
		//this have 3 cases
		while(node!=null)
		{
			if(key<node.data)
				node = node.left;
			else if(key>node.data)
				node = node.right;
			else if(key==node.data)
				break;
		}
			if(node.data!=key)
				System.out.println("item doesnt exist");
			else
			{
				//cases 1
				if(node.left==null && node.right==null)
				{
				 if(parent.right.data==key)
				  parent.right=null;
				 else
				  parent.right=null;
				}
				else
				{
					//case 2
					
				}
			}
			
		
	}
	private NodeTree findNode(NodeTree node) {
		
		return node;
	}
	private void traverse_inorder(NodeTree node) {
		
		if(node==null)
			return;
		traverse_inorder(node.left);
		System.out.println(" "+node.data);	
		traverse_inorder(node.right);
	}

// TO PRINT A PAIR WITH GIVEN SUM IN BST
	
	public void pairNodes(int sum){
		// traverse inorder
		
	}
}
    
