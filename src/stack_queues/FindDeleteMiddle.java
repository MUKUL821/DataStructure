package stack_queues;

import LinkedList.Node;
/*mukul*/
public class FindDeleteMiddle {

	public Node findMid(){
		Node checker=null;
		checker= Stack.top;
		Node result =Stack.top;
		while(checker.next!=null && checker.next.next!=null)
		{ System.out.println("in");
			//Stack.top= Stack.top.next;
			result= Stack.peekTopNum(1,result);
			checker = Stack.peekTopNum(2,checker); // running in double speed
			//System.out.println("checker n"+checker.next.next+checker.next);
		}
		System.out.println("Mid is"+result.data);
		
	System.out.println("output");
	return result;

		
	}
	
	public void deleteMid(Node mid){
	mid.data=mid.next.data;
	mid.next=mid.next.next;

		
	}
}
