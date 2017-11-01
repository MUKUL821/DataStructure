package stack_queues;
import java.util.*;
/*mukul*/
public class QueueUsingStack {

    Stack temp = new Stack();
    Stack value = new Stack();
 
    // Push element x to the back of queue.
    public void push(int x) {
    	  if(value.isEmpty()){
              value.push(x);
          }else{
              while(!value.isEmpty()){
              	 temp.push(value.pop());
              }
   
              value.push(x);
   
              while(!temp.isEmpty()){
                  value.push(temp.pop());
              }    
          }
      
    }
 
    // Removes the element from in front of queue.
    public void pop() {
        value.pop();
    }
 
    // Get the front element.
    public int peek() {
        return (int) value.peek();
    }
 
    // Return whether the queue is empty.
    public boolean empty() {
        return value.isEmpty();
    }
    
    public static void main(String[] args){
    	QueueUsingStack obj = new QueueUsingStack();
    	System.out.println("start");
    	obj.push(10);obj.push(16);obj.push(1);obj.push(17);obj.push(18);obj.push(9);obj.push(145);
    	int r = obj.peek();
    	System.out.println("result "+ r);
    }
}