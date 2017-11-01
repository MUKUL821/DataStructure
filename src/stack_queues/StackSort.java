package stack_queues;
/*mukul*/
public class StackSort {

	void sortUsingOneVar(Stack stack){
		if(!stack.isEmpty())
		{		Object temp = stack.pop();
	
		  System.out.println("temp:"+temp);
		sortUsingOneVar(stack);
		System.out.println("item main-temp sent: "+temp);
	sortRecursively(temp, stack);
	}
	}

	private void sortRecursively(Object temp, Stack stack) {
		// TODO Auto-generated method stub
		//check for empty stack;
		if(stack.isEmpty())
			stack.push(temp);
		
		else{int obj =(Integer)stack.peek();
			System.out.println("recurive stack.peek() n temp"+ obj +(Integer)temp);
		if(obj <= (Integer)temp)
		{
		  Object aa =stack.pop();
		  System.out.println("stack.peek is less than temp..so stack.pop="+aa);
		  sortRecursively(temp, stack);
		  stack.push(obj);
		  System.out.println("stack.peek..after pushing stack.peek="+obj);
			
		}else
			stack.push(temp);
	 }
  }
	
}
