package LinkedList;

public class PairEqualToSum {

	
	public void pair(Node head, int sum){
		Node n = head;
		// Time complexity is O(n2) n O(1) space complexity
		while(n.next!=null &&(int)n.data<sum){
		
			int a1= (int) n.data;
			int diff = sum-a1;
		//	System.out.println(a1+" "+diff+" "+(int)n.data);
			Node node =n;
			while(node.next!=null && (int)node.data<diff)
			{
				node = node.next;
			//	System.out.print(" **"+(int)node.data);
			}
				
		//	System.out.println(" ---"+(int)node.data);
			if(diff==(int)node.data)
				System.out.println("pair"+a1+" "+diff);
			n = n.next;
		}
		
	}
}
