package stack_queues;

import LinkedList.Node;

public class Queue {
	/*mukul*/
	Node front=null;Node rear=null;
	public void enqueue(Object data){
	Node newelem= new Node(data);
	
		//newelem.next=rear;
		//rear=newelem;
		if(front==null)
			{
			rear=newelem;
			front=rear;
			}
		else {
		rear.next=newelem;
		rear=newelem;}
		
		//else front.next=rear;
		System.out.println("added"+front.data+rear.data+front.next+rear);
		
	}
	public void dequeue(){
		System.out.println("node is"+front.data+front);
		front=front.next;
	}
	public void printQueue(Queue queue){
		System.out.println("Start: ");
		while(front!=null)
			queue.dequeue();
		//queue.dequeue();
	}
	public static void main(String[] args){

		Queue queue=new Queue();
		queue.enqueue(Integer.parseInt("5"));
		queue.enqueue(Integer.parseInt("85"));
		queue.enqueue(Integer.parseInt("6"));
		queue.enqueue(Integer.parseInt("87"));
		queue.enqueue(Integer.parseInt("99"));
		queue.enqueue(Integer.parseInt("77"));
		queue.dequeue();
		queue.enqueue(Integer.parseInt("44"));
		queue.printQueue(queue);
		}
	
	
}
