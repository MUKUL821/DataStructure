package edu.mukul;

import java.util.*;
import java.lang.*;
public class Comparator_Usage
{	
	private static final int Integer_MAX = 0;
	public static void main(String[] args) 
	{
	   
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt(),k=sc.nextInt();
		    int[] a=new int[n];
		    for(int j=0;j<n;j++)
		    	a[j]=sc.nextInt();
		     ArrayList<Node> al=new ArrayList<Node>();
		     for(int j=0;j<n;j++)
		       al.add(new Node(a[j],Math.abs(a[j]-k)));
		    
	        Collections.sort(al,new mycomp());
		    for(int j=0;j<n;j++)
		    	System.out.print(al.get(j).key+" ");
	        System.out.println();
		 
		}
	 }
}
	class Node{
	    int key;
	    int value;
	    Node(int key,int value){
	        this.key=key;
	        this.value=value;
	    }
	}
	class mycomp implements Comparator<Node>{
	    public int compare(Node obj1,Node obj2){
	        Node node1=(Node)obj1;
	        Node node2=(Node)obj2;
	        if(node1.value>node2.value){
	            return 1;
	        }
	        else if(node1.value==node2.value){
	            return 0;
	        }
	        return -1;
	    }
	}