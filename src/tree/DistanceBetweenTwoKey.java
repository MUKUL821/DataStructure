package tree;

/* A Java Program to find distance between n1 and n2
using one traversal */
public class DistanceBetweenTwoKey 
{

   static int d1 = -1;
   static int d2 = -1;
   static int dist = 0;
    
   static class Node{
       Node left, right;
       int key;
        
       Node(int key){
           this.key = key;
           left = null;
           right = null;
       }
   }

   static int findLevel(Node root, int k, int level)
   {
       // Base Case
       if (root == null)
           return -1;
       if (root.key == k)
           return level;  
       int l = findLevel(root.left, k, level + 1);
     
       return (l != -1)? l : findLevel(root.right, k, level + 1);
   }

   static Node findDistUtil(Node root, int n1, int n2, int lvl){
        
       // Base case
       if (root == null)
           return null;

       if (root.key == n1){
           d1 = lvl;
           return root;
       }
       if (root.key == n2)
       {
           d2 = lvl;
           return root;
       }
        
       Node left_lca = findDistUtil(root.left, n1, n2,  lvl + 1);
       Node right_lca = findDistUtil(root.right, n1, n2,  lvl + 1);

       if (left_lca != null && right_lca != null)
       {
           dist = (d1 + d2) - 2*lvl;
           return root;
       }

       return (left_lca != null)? left_lca : right_lca;    
   }

   static int findDistance(Node root, int n1, int n2){
        d1 = -1;
        d2 = -1;
        dist = 0;
       Node lca = findDistUtil(root, n1, n2, 1);
       System.out.println("di and d2 "+ d1 + " "+d2);
       if (d1 != -1 && d2 != -1)
           return dist;
        
       // If n1 is ancestor of n2, consider n1 as root and find level 
       // of n2 in subtree rooted with n1
       if (d1 != -1)
       {
           dist = findLevel(lca, n2, 0);
           return dist;
       }
        
       // If n2 is ancestor of n1, consider n2 as root and find level 
       // of n1 in subtree rooted with n2
       if (d2 != -1)
       {
           dist = findLevel(lca, n1, 0);
           return dist;
       }
        
       return -1;
   }
    

   // Driver program to test above functions
   public static void main(String[] args) {
        
       // Let us create binary tree given in the above example
       Node  root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right.left = new Node(6);
       root.right.right = new Node(7);
       root.right.left.right = new Node(8);
       
       System.out.println("Dist(4, 5) = "+findDistance(root, 4, 5));
       System.out.println("Dist(4, 6) = "+findDistance(root, 4, 6));
       System.out.println("Dist(3, 4) = "+findDistance(root, 3, 4));
       System.out.println("Dist(2, 4) = "+findDistance(root, 2, 4));
       System.out.println("Dist(18, 5) = " +findDistance(root, 18, 5));
        
   }
}