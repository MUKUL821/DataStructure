package conceptTest;

import LinkedList.Node;

public class RemoveNthElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(new Integer(4));
		n1.next = new Node(new Integer(1));

		Node res = removeNthFromEnd(n1,2);
		while(res!=null)
		{
			System.out.println(res.data);
			res =res.next;
		}

	}

	public static Node removeNthFromEnd(Node head, int n) {
		 Node start = new Node(0);
	        
	        Node fast = start; Node slow = start;
	        slow.next = head;
	           for(int i=1; i<=n+1; i++)   {
	        	 System.out.println("data:"+fast.data);
	            fast = fast.next;
	        }

	           while(fast != null) {
	            slow = slow.next;
	            fast = fast.next;
	        }

	        slow.next = slow.next.next;
	        return start.next;
    }
}
