package LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {

		Node n1 = new Node(new Integer(4));
		//Node n2 = new Node(new Integer(48));
		
	
		
		//n1.traverseLinkedList();

		/**to reverse the singly linked list**/
	//	ReverseLinkedList rev = new ReverseLinkedList();
	//	rev.reverse(n1);
		
		/**for Nth Number From Last**/
		/**
		NthNumberFromLast obj = new NthNumberFromLast();
		int result= obj.getNumber(n1, 3);
		System.out.println("result is "+result);
		
		**/
		
		/***for finding the pairs equivalent to sum from sorted linkedlist***/
	/**	
		PairEqualToSum pr = new PairEqualToSum();
		pr.pair(n1, 18);
		**/
		
		deleteNodeR obj = new deleteNodeR();
		obj.deleteNode(n1, 4);
		
		while(n1!=null)
		{
			System.out.println(n1.data);
			n1 =n1.next;
		}
		
	}

	
}
