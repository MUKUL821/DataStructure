package LinkedList;

public class AddTwoList {
 public static int carry = 0;
	public static void main(String[] args) {
		Node list1 = new Node(1987);
		list1.next =  new Node(4432);
		list1.next.next =  new Node(5434);
		/////
		//System.out.println(" "+list1.next);
		Node list2 = new Node(2424);
		list2.next = new Node(8820);
		list2.next.next = new Node(8849);
		sum(list1,list2);

	}
	
	public static Node sum(Node node1, Node node2){
		Node l1 = node1;
		Node l2 = node2;
		if(l1==null)
			return l2;
		if(l2==null)
			return l1;
		Node dummy = new Node(0);
		int len1 =0 , len2 = 0;
		while(l1!=null){
			len1++;
			l1 = l1.next;
		}
			
		while(l2!=null){
			len2++;
			l2 = l2.next;
		}
		l1 = node1;
		l2 = node2;
		
		if(len1>len2){
			while(len1-- >len2)
				l1 = l1.next;
		}
		if(len2>len1){
			while(len2-- >len1)
				l2 = l2.next;
		}
		//Node suml = new Node(0);
		Node suml = findSum(null, l1,l2, 0);
		
		if(carry>0){
			Node nn = new Node(carry);
		     nn.next = suml;
		     suml=nn;
		     
		}	
		while(suml!=null){
			System.out.println(" "+suml.data);
			suml = suml.next;
		}	
		return dummy;
		
		
	}
	private static void traverse(Node suml){
		while(suml!=null){
			System.out.print(" "+suml.data);
			suml = suml.next;
		}
		
		System.out.println(" ");
	}

	private static Node findSum(Node s, Node l1, Node l2, int c) {
		
		Node suml = null;
		if(l1==null && l2==null){
		
			return suml;	
		}
		suml = findSum(s, l1.next, l2.next, c);
		int sum = (int)l1.data + (int)l2.data + carry;
		carry = sum/10000;
		Node node = new Node(sum % 10000);
		node.next = suml;
		suml = node;
		return suml;	
		
	}
}
