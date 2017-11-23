package levelMedium;

import LinkedList.Node;

public class SortLinkedList {

	public static void main(String[] args) {
		 // 3 - 4 -13 -2-1- 5- 6- 7-12-8
		Node node = new Node(3);
		node.next= new Node(4);
		node.next.next = new Node(13);
		node.next.next.next = new Node(2);
		node.next.next.next.next = new Node(1);
		node.next.next.next.next.next = new Node(5);
		node.next.next.next.next.next.next = new Node(6);
		node.next.next.next.next.next.next.next = new Node(7);
		node.next.next.next.next.next.next.next.next = new Node(12);
		node.next.next.next.next.next.next.next.next.next = new Node(8);
		
		Node res = sortList(node);
		System.out.println("here");
		while(res!=null)
			{System.out.print("res : "+res.data);
		res = res.next;}
		

	}
	 public static Node sortList(Node head) {
		// sort the linked list
		 if (head==null || head.next == null)
			 return head;
		
		 Node fast = head,  slow = head;
		 Node prev = null;
		 while( fast.next!=null && fast.next.next!=null){
			 slow = slow.next;
			 fast = fast.next.next; 
		 }
		 
		 prev = slow.next;
		 slow.next = null;
		 Node l1 = sortList(head);
		 Node l2 = sortList(prev);
		 
		 return merge(l1, l2);

	    }
	 
	 public static Node merge(Node l1, Node l2){
		
		 Node merged  = new Node(0);
		 Node p = merged;
		 
		 while(l1!=null && l2!=null){
			 
			 if((int)l1.data < (int)l2.data){
				
				 p.next = l1;
				 l1 = l1.next;
			
			 }else{
				 
				 p.next = l2;
				 l2 = l2.next;
			 }
				 p = p.next;
		 }
		
		 if(l1!=null)
			 p.next = l1;
		
		 if(l2!=null)
			 p.next = l2;
		 
	
		 return merged.next;
		 
	 }
	 
	    
}
