package Fortinet;

class MultiDimensionArray {
		   
	public static void main(String[] args) {

		      int[][][] a = {
		            {{1,-2, 3}}, 
		            {{-4,-5, 6}}, 
		            {{7, -5, 6}}, 
		      };
		      
		     for (int[] innerArray: a[0]) {
		        for(int data: innerArray) {
		           System.out.println(data);
		        }
		     }
		   }
}