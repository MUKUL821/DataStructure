package LinkedList;

public class deleteNodeR {

	
	Node deleteNode(Node head, Object d) {
		if(head==null)
			return null;
		if(head.next==null && head.data==d)
			return null;
		
		if(head.next.data==d)
		{
			head.next=head.next.next;
			System.out.println("deleted");
			return null;
		}
		if(head.next!=null)
		return deleteNode(head.next,d);
		else
			return null;
		
		 }
}
