package LinkedList;

public class ReverseLinkedList {

	
	public void reverse(Node head){
		Node node = head;
		while(node.next!=null){
			System.out.println("---------------------------");
			Node a = node.next;
	//		System.out.println("a data "+a.data);
			Node b = node.next.next;
	//		System.out.println("b data "+b.data);
			node.next= b;
			a.next=head;
			//node=head;
		//	System.out.println("node data "+node.data +"node next"+node.next.data);
			head=a;
			System.out.println("head data "+head.data);
		}
	
		head.traverseLinkedList();
	}
}
