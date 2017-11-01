package tree;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LevelOrderSearch {

	public static void main(String[] args) {
		NodeTree root = new NodeTree(2);
		root.left = new NodeTree(3);
		root.right = new NodeTree(1);
		root.right.left = new NodeTree(9);
		root.right.right = new NodeTree(10);
		
		ArrayList<ArrayList<Integer>> res = levelOrder(root);
		System.out.println(" "+res);
		
		
		
	}
	
	public static ArrayList<ArrayList<Integer>> levelOrder(NodeTree node){
		ArrayList<ArrayList<Integer>> nodeList = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> nodeValues = new ArrayList<Integer>();
		ArrayList<Integer> record = new ArrayList<Integer>();
		
		 LinkedList<NodeTree> current = new LinkedList<NodeTree>();
		 LinkedList<NodeTree> next = new LinkedList<NodeTree>();
		if(node == null)
			return nodeList;
		
		current.add(node);
		while(!current.isEmpty()){
			NodeTree nd = current.remove();
			
			if(nd.left!=null)
				next.add(nd.left);
			if(nd.right!=null)
				next.add(nd.right);
			nodeValues.add(nd.data);
			
			if(current.isEmpty()){
				current = next;
				next = new LinkedList<NodeTree>();
				nodeList.add(nodeValues);
				nodeValues = new ArrayList<Integer>();
			}
			
		}
		
		
		return nodeList;
	}


}