package levelHard;

import java.util.ArrayList;
import java.util.HashMap;

public class LRUCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//["LRUCache","put","get","put","get","get"]
		//[[1],[2,1],[2],[3,2],[2],[3]]
		LRUCache obj = new LRUCache(1);
		obj.put(2, 1);
		//obj.put(2, 2);
		System.out.println("got: "+obj.get(2));
		obj.put(3, 2);System.out.println("got: "+obj.get(2));
		//obj.put(4, 4);System.out.println(obj.get(1));
		System.out.println("got: "+obj.get(3));
		//System.out.println(obj.get(4));
	}

	    private static int capacity =0;
	    private static HashMap<Integer, Integer> record = new HashMap<Integer, Integer>();
	    private static  ArrayList<Integer>recordList = new ArrayList<Integer>(); 
	     private static HashMap<Integer, Integer> recordIndex = new HashMap<Integer, Integer>();
	    public LRUCache(int capacity) {
	        this.capacity = capacity;
	    }
	    public static void setCurrent(int key){
	  
	         int index = (recordList.indexOf(key)>-1)? recordList.indexOf(key) : recordList.size(); 
	            recordList.remove(index);
	            recordList.add(recordList.size(), key);
	    }
	    public static int get(int key) {
	       // System.out.println("get"+key);
	        if(record.containsKey(key)){
	        	 int index =  recordList.indexOf(key); 
		         recordList.remove(index);
		         recordList.add(recordList.size(), key);
	           
	        //   System.out.println("record: get"+record);
	            return record.get(key);
	        }
	        
	        return -1;
	    }
	    
	    public static void put(int key, int value) {
	    	//System.out.println("key put is"+key);
	    	//System.out.println("Before- recordlist is "+recordList);
	        if(record.containsKey(key)){
	        	//System.out.println("YES "+recordList+ " "+"KEY"+key);
	        	
	        	recordList.remove(recordList);
	        	recordList.add(recordList.size(),key);
	        	//System.out.println("After- recordlist is "+recordList);
	        }
	           
	        else
	        {
	            if(recordList.size() == capacity)
	            {  
	            	int newkey = recordList.get(0);
	           //   System.out.println("newkey"+newkey);
	                record.remove(newkey);
	                recordList.remove(0);
	            }
	            recordList.add(recordList.size(),key);
	        // System.out.println("After: recordList" + recordList);
	        	 record.put(key, value);
	      // System.out.println(record);
	        }
	    }
	
}
