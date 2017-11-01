package tree;

public class TreeMerge {

	public static void main(String[] args) {
		NodeTree bt1= new NodeTree(3);
		NodeTree bt2= new NodeTree(1);
		bt1.left=new NodeTree(7);
		bt1.left.left=new NodeTree(7); 
		bt1.right=new NodeTree(8);
		bt2.left=new NodeTree(2);
		bt2.right=new NodeTree(11);
		bt2.right.left=new NodeTree(88);
		bt2.right.left.right=new NodeTree(10);
		bt2.right.left.right.left=new NodeTree(10);
		NodeTree res = mergeTrees(bt1, bt2);
		traverse(res);
		
		
	}
	
	public static void traverse(NodeTree res){
		if(res==null)
			return;
		traverse(res.left);
		System.out.println(" "+res.data);
		traverse(res.right);	
		
	}
	 public static NodeTree mergeTrees(NodeTree t1, NodeTree t2) {
	        if(t2 == null)
	            return t1;
	        if (t1 == null)
	            return t2;
	           t1.data  = t2.data + t1.data; 

	           t1.left =  mergeTrees(t1.left, t2.left);
	           t1.right =  mergeTrees(t1.right, t2.right);
	    
	        return t1;
	        
	}
}
