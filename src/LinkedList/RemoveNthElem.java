package LinkedList;

public class RemoveNthElem {

	public static void main(String[] args) {
		Node n1 = new Node(new Integer(4));
		n1.next = new Node(new Integer(15));
	
		Node res = removeNthFromEnd(n1, 1);
		System.out.println(" ans: "+res.data);
	}
	 public static Node removeNthFromEnd(Node head, int n) {
	        
	        Node node = head;
	        Node nodest = head;
	        int start = 0;
	        while(start <= n && node!=null){
	        	node = node.next;
	        	start++;
	        }
	            
	       // System.out.println("start"+start);

	        if(start != n+1)
	            return null;
	         
	        
	        while(node !=null){
	            nodest = nodest.next;
	            node = node.next;
	            
	        }
	            
	        return nodest;    
	        
	        
	    }
}
