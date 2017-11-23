package target1;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import tree.NodeTree;

public class SerializeCodec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeTree nd = new NodeTree(1);
		nd.left = new NodeTree(2);
		nd.right = new NodeTree(3);
		nd.left.left = new NodeTree(4);
		nd.right.left = new NodeTree(5);
		nd.right.right= new NodeTree(6);
		
		
		System.out.println(" serialize "+  serialize(nd));
		String n = serialize(nd);
		System.out.println(" deserialize "+  deserialize(n));
		
	}


    private static final String spliter = ",";
    private static final String NN = "X";

    // Encodes a tree to a single string.
    public static String serialize(NodeTree root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }

    private static void buildString(NodeTree node, StringBuilder sb) {
        if (node == null) {
            sb.append(NN).append(spliter);
        } else {
            sb.append(node.data).append(spliter);
            buildString(node.left, sb);
            buildString(node.right,sb);
        }
    }
    // Decodes your encoded data to tree.
    public static NodeTree deserialize(String data) {
        Deque<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(spliter)));
        return buildTree(nodes);
    }
    
    private static NodeTree buildTree(Deque<String> nodes) {
        String val = nodes.remove();
        if (val.equals(NN)) return null;
        else {
            NodeTree node = new NodeTree(Integer.valueOf(val));
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }
    }
}