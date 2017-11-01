package stack_queues;

import LinkedList.Node;
/*mukul*/
public class Stack {
	static Node top=null;
	static Object pop() {
		if (top != null) {
			Object item = top.data;
			top = top.next;
			return item;
		}
		return null;
	}
	void push(Object item) {
		Node t = new Node(item);
		t.next = top;
		top = t;
	}
	static Object peek() {
		Object item = top.data;
		//System.out.println("topp"+peektop().toString());
		return item;
	}
	static Node peektop() {
		return top;
	}

 void printList(Stack stack){
	     while(stack.top!=null)
	 			System.out.print("    "+stack.pop());
	}
static Node peekTopNum(int n,Node checker) {

		while(n!=0){
			checker=checker.next;
			n--;
		}
	//	System.out.println("value"+checker.data);

		return checker;
	}
	public static void main(String[] args){

		Stack stack=new Stack();
		System.out.println("inputt");
		stack.push(Integer.parseInt("6"));stack.push(Integer.parseInt("5"));
		stack.push(Integer.parseInt("7"));stack.push(Integer.parseInt("89"));
		stack.push(Integer.parseInt("75"));stack.push(Integer.parseInt("447"));
		stack.push(Integer.parseInt("447"));stack.push(Integer.parseInt("447"));
		
	

	
		/*********************************************************************************/
		/****for implementing StackSort
		 */ 	System.out.println("sort the stack");
		 StackSort stacksort = new StackSort();
	      stacksort.sortUsingOneVar(stack);
		 while(stack.top!=null)
		  System.out.println(stack.pop());

		
	
	
        /*********************************************************************************/
     	//	for implementing midFinder
		/*
		 FindDeleteMiddle findobj = new FindDeleteMiddle();
		 Node mid = findobj.findMid();
		// while(stack.top!=null)
			//  System.out.println(stack.pop());
		 
		 //for implementing delMid
		 findobj.deleteMid(mid);
         System.out.println("yipiee");
         */
   
		// for reversing the stack
	  	System.out.println("Original stack");         
	 //   stack.printList(stack);
         ReverseStack rev = new ReverseStack();
         rev.revUsingOneVar(stack);
     	System.out.println("reverse");         
    stack.printList(stack);

	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(top==null)
			return true;
		return false;
	}
}