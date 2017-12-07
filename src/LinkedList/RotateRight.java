package LinkedList;

public class RotateRight {

	public static void main(String[] args) {
		Node n1 = new Node(new Integer(1));
		n1.next = new Node(new Integer(2));
		n1.next.next = new Node(new Integer(3));
		n1.next.next.next = new Node(new Integer(4));
		n1.next.next.next.next = new Node(new Integer(5));
		Node res = rotateRight(n1, 2);
		while(res!=null){
			System.out.println(" "+res.data);
			res = res.next;
		}
			

	}

public static Node rotateRight(Node head, int k) {
        
        Node dummy = new Node(0);
        dummy.next = head;
        
        int count = 0;
        Node node1 = head;
        Node node2 = head;
        
        while(node1!=null && count!=k){
            node1 =node1.next;
            count++;
        }
        while(node1.next!=null){
            node2 = node2.next;
            node1 = node1.next;
        }
        Node res = node2.next;
        head = res;
        node2.next = null;
        System.out.println("-head-"+head.data+" "+node2.data);
        
        System.out.println("-new -"+head.data);
        while(res.next!=null)
            res = res.next;
        System.out.println("-res -"+res.data);
        res.next = dummy.next;
        System.out.println("-new -"+res.data);
       return head;   
    }
}
