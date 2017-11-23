package levelHard;

import java.util.Comparator;
import java.util.PriorityQueue;

import LinkedList.Node;

public class MergerKLinkedList {

	public static void main(String[] args) {
		Node t = new Node(5);
		t.next = new Node(6);
		Node t1 = new Node(1);
		t1.next = new Node(6);
		t1.next = new Node(7);
	
		Node t2 = new Node(8);
		t2.next = new Node(10);
		Node [] arr = {t,t1,t2};
		Node res = mergeKLists(arr);
		while(res!=null){
			System.out.println(" "+res.data);
		res = res.next;	
		}

	}
	
	public static Node mergeKLists(Node[] lists) {

		Node res = new Node(0);
		if(lists.length ==0)
			return null;
		
		PriorityQueue<Node> pqueue = new PriorityQueue<Node>(lists.length, new Comparator<Node>(){
			@Override
			public int compare(Node a, Node b){
				return (int)a.data - (int)b.data;
			}
			
		});
		
		Node ls = res;
		for(Node node : lists){
			if(node!=null)
				pqueue.offer(node);
		}
		
		while(!pqueue.isEmpty()){
			Node one = pqueue.poll();
			ls.next = one;
			ls = ls.next;
			System.out.println("pqueue is "+pqueue+ "one "+one.data);
			if(ls.next!=null)
				pqueue.offer(ls.next);
		}
		
		return res.next;
    }
	
}
