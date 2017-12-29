package conceptTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class BitwiseManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m = "101110"; //000 001 010 011
		int n = Integer.valueOf(m);
		int t= 1;
		// 0000 0001 0010 0011 0100 0101 0110 0111 1000 -2: 0010, 1110 = 1100
		//0100=1011+1 = 1100
		System.out.println(" and "+ (t & 0));
		System.out.println(" or "+ (2 | 3));
		System.out.println(" not "+ (~0));
		System.out.println(" xor "+ ((2^5)));
		int[] arr = {3,2,2,2};
		int res = arr[0];
		for(int i= 1; i < arr.length;i++){
			res = res^arr[i];
			System.out.println(" i "+i+"yes  "+ res);
		}
		int mm = 1;
		int x=15;
		//0011//0010 //0000^0011= 
		 while( (x & mm) !=0)
		  {
		    x = x^mm;
		    mm <<= 1;
		    System.out.println(" mm "+mm+"x "+x);
		  }
		
		 System.out.println(" x "+x+"mm"+mm);
		  /* flip the rightmost 0 bit */
		  x = x^mm;
		  System.out.println(" x "+x);
		  
		  //Multiplyyyyyyyy
		  int num = 4;
		  int mul = (num<<2) + num + (num>>1);
		  //(8*x – x)/2 -- ((x<<3) - x)>>1;
		System.out.println(" mul: "+mul);
		System.out.println(" exp "+(0>>2));
		//count bits
		int num2 = 6;
		
		int count=0;
		while(num2 !=0){
			if((num2&1)==1){
				count++;
			}
			num2 >>= 1;	
			
			System.out.println(" num2 "+num2);
				
		}
		System.out.println("count is"+count);
		 
	}
	
	

}
