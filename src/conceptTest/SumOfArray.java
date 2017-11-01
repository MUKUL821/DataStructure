package conceptTest;

import LinkedList.Node;

public class SumOfArray {

	public static void main(String[] args) {
		Node l1 = new Node(new Integer(2));
		l1.next = new Node(new Integer(4));
		l1.next.next = new Node(new Integer(3));
		Node l2 = new Node(new Integer(5));
	
		//243
		//564
		//708
		
		
		Node res = addTwoNumbers(l1,l2);
		//print linkedlist
		System.out.println("-------");
		while(res!=null){
			System.out.print(" "+ res.data);
			res = res.next;
		}

	}
	
	    public static Node addTwoNumbers(Node l1, Node l2) {
	        
	        Node result = new Node(0);
	        Node res = result;
	        int carry=0 , n1=0, n2=0;
	      while(l1!=null || l2!=null){
	    	  carry = 0;
	    	  n1 = l1!=null? (int)l1.data : 0;
	    	  n2 = l2!=null? (int)l2.data :0;
	    	System.out.println("devug"+n1 +""+  n2 +""+ (int)res.data);
	         int sum = n1+n2 + (int)res.data;
	         System.out.print("sum"+sum);
	          if(sum > 9)
	          {
	              carry = sum /10;
	              sum = sum % 10;
	          }
	          System.out.print(" carry"+carry);
	          res.data = sum;
	          System.out.println(" res data"+res.data);
	          
	          l1 = l1!=null? l1.next: null; l2 = l2!=null ? l2.next: null;
	          if(carry>0 || (l1!=null) || (l2!=null)){
	        	  res.next = new Node(carry);
	         res = res.next;}
	          
	      }
	        return result;
	    }

}
