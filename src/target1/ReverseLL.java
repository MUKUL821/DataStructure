package target1;

import LinkedList.Node;

public class ReverseLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(3);
		node.next= new Node(4);
		node.next.next = new Node(13);
		node.next.next.next = new Node(2);
		node.next.next.next.next = new Node(1);
		node.next.next.next.next.next = new Node(5);
	
     Node res = reverseList(node);
     while(res!=null){
    	 
    	 System.out.print("   "+res.data);
    	 res = res.next;
    
    	 }
     
	}
	 public static Node reverseList(Node head) {
	       
	        if(head==null || head.next ==null)
	        	return head;
	        Node start = head;
	        System.out.println("start is "+start.data);
	        while(start!=null && start.next!=null){
	        	
	        Node  node = start.next;
	         start.next = node.next;
	         node.next = head;
	         head = node;
	    
	    }
	        
	  return head;      
	 }
}
