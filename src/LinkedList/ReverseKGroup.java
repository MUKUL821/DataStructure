package LinkedList;

public class ReverseKGroup {

	public static void main(String[] args) {
		Node n1 = new Node(new Integer(4));
		n1.next = new Node(new Integer(15));
		n1.next.next = new Node(new Integer(6));
		n1.next.next.next = new Node(new Integer(9));
		n1.next.next.next.next = new Node(new Integer(7));
		n1.next.next.next.next.next = new Node(new Integer(3));
		n1.next.next.next.next.next.next = new Node(new Integer(8));
		//Node res = reverseKGroup(n1, 3);
		Node res = swapPairs(n1);
		System.out.println("************");
		res.traverseLinkedList();

	}

	 public static Node swapPairs(Node head) {
			// 4 15 6 9 7 3 8 
	        if(head == null)
	            return head;

	        if(head.next!=null){
				 Node rev = swapPairs(head.next.next);
				 Node temp = head.next;
				 head.next = rev;
				 temp.next = head;
				 head = temp;
	        }

	        return head;
	    }
	 public static Node reverseKGroup(Node head, int k) {
		 if(head == null || k <= 0)
	            return head;
	        
	        Node curr = head;
	        int count = 0;
	        System.out.println("1. head"+head.data+ "curr"+curr.data);
	        while(curr != null && count != k){
	            curr = curr.next;
	            count++;
	        }
	        
	        if(count == k){
	        	System.out.println("2........ head"+head.data+ "curr"+curr.data);
	            Node rev = reverseKGroup(curr, k);
	            System.out.println("3. head "+head.data+ "curr "+curr.data+" rev "+rev.data);
	            while(count !=0){
	            	System.out.println("•••••  •••••");
	                Node temp = head.next;
	                head.next = rev;
	                rev = head;
	                head = temp;
	                count--;
	            }
	            head = rev;
	            System.out.println("head now is"+head.data);
	        }
	        return head;
	        
	    }

}
