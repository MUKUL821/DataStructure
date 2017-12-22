import LinkedList.Node;

public class PlusOne {
	static class Node{
	       Node next;
	       int key;
	        
	       Node(int key){
	           this.key = key;
	           this.next = null;
	       }
	   }

	public static void main(String[] args) {
		Node n1 = new Node(new Integer(1));
		n1.next = new Node(new Integer(9));
		n1.next.next = new Node(new Integer(9));
		Node res = plusOneIfOpposite(n1);
		if(carry ==1){
			Node newnode = new Node(1);
			newnode.next=res;
			res = newnode;
		}
			
			
		while(res!=null){
			System.out.println(" "+res.key);
			res = res.next;
		}

	}
	// 789 +1 = 7-8-9+1 -----7-9-0 -- 999 -- 1000
	static int carry=1;
	public static Node plusOneIfOpposite(Node root){

		Node node = root;
		
		
		if(node.next!=null)
			plusOneIfOpposite(node.next);
		System.out.println(" dummy  "+ node.key);
		if(node.key==9 && carry!=0){
			node.key = 0;
			carry=1;	
		}
		else{
			if(carry==1){
				node.key = node.key+1;
				carry =0;
			}
		}
			
		return node;
	}
	
	public static Node plusOne(Node root){
	 	// 7 8 9  = > (987) - 8 8 9
		Node dummy = new Node(0);
		dummy.next = root;
		
		Node node = root;
		int carry = 0;
		Node prev = null;
		while(node!=null && node.key == 9 && carry==0){
			node.key = 0;
			prev = node;
			node = node.next;
		}
		
		if(node==null){
			Node new_node = new Node(1);
			if(prev!=null){
				 prev.next = new_node;
			}
			else{
				return new_node;
			}
				
				
		}
		else{
			node.key = node.key+1;
		}
		return dummy.next;
			
	}

}
