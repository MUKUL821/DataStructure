import java.util.PriorityQueue;

class Node{
    int key; Node next; Node root;
    
    Node(int val){
        this.key = val; 
        this.next = null;
    }
}

public class MinStack {
    
    static Node root;
    Node node = null;;
    static PriorityQueue<Integer> pq;
    /** initialize your data structure here. */
    public MinStack() {
    	root = new Node(100);
        pq = new  PriorityQueue<Integer>((x,y) -> x-y);
    }
    
    public void push(int x) {
        pq.add(x);
        //System.out.println("pq is"+ pq);
        node = new Node(x);
        //System.out.println("root is"+node.key);
        node.next = root;
        root = node;
     
    }
    
    public void pop() {
    	//System.out.println("pq is"+pq);
        pq.remove(root.key);
        if(root.next!=null)
           root = root.next;
        else
            root=null;
    }
    
    public int top() {
        if(root!=null)
           return root.key;
        return -1;
        
    }
    
    public int getMin() {
        return (int)pq.peek();
    }


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
	public static void main(String[] args) {

		MinStack obj = new MinStack();
		obj.push(-2);
		obj.push(0);
		obj.push(-3);
		System.out.println(obj.getMin());
		obj.pop();
		System.out.println(obj.top());
		System.out.println(obj.getMin());
						
	}

}
