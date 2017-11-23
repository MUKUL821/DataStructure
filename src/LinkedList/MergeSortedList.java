package LinkedList;


public class MergeSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node list1 = new Node(1);
		list1.next =  new Node(4);
		/////
		System.out.println(" "+list1.next);
		Node list2 = new Node(2);
		list2.next = new Node(20);
		list2.next.next = new Node(49);
		Node main =  mergeTwoLists(list1, list2);
		
		while(main!=null){
			System.out.println("yes "+main.data);
			main = main.next;
		}
			
	}	
	  public static Node mergeTwoLists(Node l1, Node l2) {
	        
		  if(l1 == null) return l2;
			if(l2 == null) return l1;
			if((int)l1.data < (int)l2.data){
				System.out.println("back l1"+ l1.data);
				l1.next = mergeTwoLists(l1.next, l2);
				System.out.println("rettn l1");
				return l1;
			} else{
				System.out.println("back l2"+ l2.data);
				l2.next = mergeTwoLists(l1, l2.next);
				System.out.println("rettn l2");
				return l2;
			
	    }
			}

}
