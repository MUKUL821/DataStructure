package LinkedList;

public class Node {
public Node prev = null;//prev for queue only
public Node next = null;
public Object data;
/*mukul*/
//for tree

 public Node(Object d) { data = d; }
 
 
 void appendToTail(int d) {
 Node end = new Node(d);
 Node n = this;
 while (n.next != null) { n = n.next; }
 n.next = end;
 }
 
 Node deleteNode(Node head, Object d) {
	 Node n = head;
	 if (n.data == d) {
	 return head.next; /* moved head */
	 }
	 while (n.next != null) {
	 if (n.next.data == d) {
	 n.next = n.next.next;
	 return head; /* head didn’t change */
	 }
	 n = n.next;
	 }
	return null;
	 }
 void traverseLinkedList(){
	Node n = this;
	while(n!= null){
		System.out.println("  "+n.data);
		n = n.next;
	}
 }
 }

