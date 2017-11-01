package LinkedList;

public class NthNumberFromLast {

	
	public int getNumber(Node head, int n){
		Node first = head;
		Node sec = head;
		int count=0;
		while(count!=n && sec.next!=null)
		{
			sec=sec.next;
			count++;
		}
		if(sec.next==null && count!=n){
			System.out.println("not possible");
		return 0;	
		}
		
		if(sec.next==null && count==n)
			return (int)first.data;
		
		while(sec.next!=null)
		{
			first=first.next;
			sec=sec.next;
		}
		
		return (int)first.data;
		
		
	}
}
