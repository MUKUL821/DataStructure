package LinkedList;

public class ReverseLinkedList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(new Integer(4));
		n1.next = new Node(new Integer(5));
		n1.next.next = new Node(new Integer(4));
		n1.next.next.next = new Node(new Integer(4));




	
		System.out.println(" "+isPalindrome(n1));
	}

public static boolean isPalindrome(Node head) {
        
        if(head == null || head.next==null)
            return true;
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        } 

     
        Node head2 = (fast==null) ? slow : slow.next; 
        Node node = head2;
        Node prev = null;
        while (head2 != null) {
            Node next = head2.next;
            head2.next = prev;
            prev = head2;
            head2 = next;
        }
        

        //now check
        while(head!=null && prev!=null){
            if(!head.data.equals(prev.data))
                return false;
            head = head.next;
            prev=prev.next;
           
        }
       return true; 
    }
	
	public void reverse(Node head){
		Node node = head;
		while(node.next!=null){
			
			Node a = node.next;
			Node b = node.next.next;
			node.next= b;
			a.next=head;
			head=a;
			
		}
	head.traverseLinkedList();
		
	}
}
