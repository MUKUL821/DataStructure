package edu.mukul;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Sort_by_abs_diff {

	public static void main(String [] args){
	    	Scanner sc=new Scanner(System.in);
			System.out.println("enter n n k");
			    int n=sc.nextInt(),k=sc.nextInt();
			    int[] a=new int[n];
			    
			    for(int j=0;j<n;j++)
			    	a[j]=sc.nextInt();
			    
			    System.out.println("entered");	
			    ArrayList<Pair> al = new ArrayList<Pair>();
			    
			    for(int l=0; l<n; l++)
			    al.add(new Pair(a[l], Math.abs(a[l]-k)));
			    System.out.println("sorted");
			    //using inline comparator
			    Collections.sort(al, new Comparator<Pair>(){
			    	
			    	@Override
		            public int compare(Pair obj1,Pair obj2){
			    		Pair node1=(Pair)obj1;
			    		Pair node2=(Pair)obj2;
		    	           return node1.diff - node2.diff;
		    	           //return node2.value - node1.value; for descending order
			    }
	
			    });
			    
			    //Lambda function
			    
			    
			    System.out.println("print");	
			    for(int i = 0; i<n; i++)
			    	System.out.print(" "+ al.get(i).num);
			    
			    
	
	}
	

}

class Pair{
	int num;
	int diff;
	Pair(int num, int diff){
		this.num = num;
		this.diff = diff;
	}
	
}



