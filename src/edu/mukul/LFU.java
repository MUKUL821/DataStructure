package edu.mukul;

import java.util.HashMap;
import java.util.Map;

public class LFU {

	private Map<Integer,Integer> map = new HashMap();
	private Map<Integer,Integer> record = new HashMap();
	private Map<Integer,Integer> record_rev = new HashMap();
	private int count =1;
	private int capacity;
	int arr[];
	public LFU(int capacity){
	arr = new int[capacity];	
	this.capacity = capacity;
	
	//assigning the values to the mapper
	
	}
	
	public void put(int a, int b){
		
		int k;
	if(count%capacity == capacity)
		k=capacity; else k = count%capacity;
	record.remove(k);
	 record.put(k,a);
	 record_rev.put(a, k);
	map.put(a,b);
	count++;
	}
	public int get(int a){
		int result = -1;int k;
		if(map.containsKey(a)){
			result = map.get(a);
			int key = record_rev.get(a);
			
			if(count%capacity == capacity)
				k=capacity; else k = count%capacity;
			int val =record.get(k);
		//	if(val)
		//	record.put(k, a);
		//	record.put(key);
			//now swap the vall...
			 record.put(k,a);
			 record_rev.put(a, k);
			//map.put(a,b);
			count++;
			
		}
		return result;
		
			
			
	}
	
	public static void main(String[] args){
		LFU cache = new LFU(2);
		
		
	}
}
