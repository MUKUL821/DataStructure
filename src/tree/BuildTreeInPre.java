package tree;

import java.util.ArrayList;
import java.util.List;

public class BuildTreeInPre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeTree node = new NodeTree(1);
		node.left = new NodeTree(2);
		node.right = new NodeTree(4);
		int []pre ={4,3,5,1,2,7,8,6,9}; 
		int []ino ={2,1,3,4,5,6,7,8,9}; 
		buildTree(pre, ino);

	}

	public static NodeTree buildTree(int[] preorder, int[] inorder) {

        return helper(preorder, inorder, Integer.MAX_VALUE);
    }
	public static int inIndex =0;
	private static int preIndex=0;
    public static NodeTree helper(int[] preorder, int[] inorder, int target) {
        if (inIndex >= inorder.length || inorder[inIndex] == target) {
            return null;
        }
        NodeTree root = new NodeTree(preorder[preIndex]);
        preIndex++;
        root.left = helper(preorder, inorder, root.data);
        inIndex++;
        //System.out.println("index"+ inIndex );
        //if(root!=null)
        	// System.out.println("root"+ root.data);
        root.right = helper(preorder, inorder, target);
        return root;
    }

}
