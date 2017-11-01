package tree;

public class PathofSum {
	static int maxValue;
	public static void main(String[] args) {
		NodeTree root = new NodeTree(2);
		root.left = new NodeTree(3);
		root.right = new NodeTree(-1);
		root.right.left = new NodeTree(9);
		root.right.right = new NodeTree(10);
		root.right.right.right = new NodeTree(-2);
		sumOfPath(root);
		System.out.println(" "+maxValue);	
	}

	private static int sumOfPath(NodeTree node) {
		if(node ==null)
			return 0;
		   System.out.println("before "+node.data);
	        int left = Math.max(0, sumOfPath(node.left));
	        System.out.println("left "+node.data+ " "+ left);
	        int right = Math.max(0, sumOfPath(node.right));
	        System.out.println("right "+node.data + " "+right);
	        maxValue = Math.max(maxValue, left + right + node.data);
	        System.out.println("maxValue "+maxValue);
	        return Math.max(left, right) + node.data;
	}

}
