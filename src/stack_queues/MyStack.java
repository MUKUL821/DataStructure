 package stack_queues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Program to change infix into postfix
 * this woks only for +-/*
 * USING ARRAY
 * 
 * ***/
/*mukul*/
public class MyStack {
	   private int maxSize;
	   private char[] stackArray;
	   private int top;
	   public MyStack(int s) {
	      maxSize = s;
	      stackArray = new char[maxSize];
	      top = -1;
	   }
	   public void push(char j) {
	      stackArray[++top] = j;
	   }
	   public char pop() {
	      return stackArray[top--];
	   }
	   public char peek() {
	      return stackArray[top];
	   }
	   public boolean isEmpty() {
	      return (top == -1);
	   }
	   public boolean isFull() {
	      return (top == maxSize - 1);
	   }
	   public String expression(String str){
		   String result="";
		   char arr[]= str.toCharArray();
		  
		   for(int i=0;i<arr.length;i++){
			   System.out.println("in"+arr[i]);
			   if(isOperand(arr[i]))
			   { 
				   result+=arr[i];
				   System.out.println("added");		
			   }
			   
			   else if(arr[i]=='(')
				  this.push(arr[i]);
			   else if(arr[i]==')')
			   {
				   while(this.peek()!='(')
				   { result+= this.pop();
				   System.out.println("added ni");	}		   
				   this.pop();
				   
			   }
			   else if(isOperator(arr[i]))
			   {
				while(this.top!=-1 && pres(this.peek())>=pres(arr[i])) 
				{result+=this.pop();System.out.println("added niii");	}	
				
				this.push(arr[i]);
			   }
			   else
				   return "invalid entry";
		    }
		   while (!this.isEmpty()) {
		         result+= this.pop();
		        
		      }
		return result;
		   
		   
	   }
	   private int pres(char peek) {
		   int weight=0;
        switch(peek){
        case '+':
        case '-' : weight=1;break;
        case '*':
        case '/' : weight =2;break;
        
        }
		return weight;
	}
	private boolean isOperator(char ch) {
		// TODO Auto-generated method stub
		System.out.println("operator"+ch);
		return (ch=='*'||ch=='/'||ch=='-'||ch=='+'||ch=='(');
	}
	private boolean isOperand(char ch) {
		// TODO Auto-generated method stub
		System.out.println("operand"+ch);
		return ((ch>='a'&& ch <='z') ||(ch >= 'A' && ch <='Z'));
	}
	public static void main(String[] args) throws IOException {
		   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   System.out.println("enter expression");
		   String str= br.readLine();
		 int len=str.length();
	      MyStack theStack = new MyStack(len); 
	      System.out.println("result is"+ theStack.expression(str));
	      
	     
	     
	      System.out.println("");
	   }
	}
