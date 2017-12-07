
public class DivideTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" divide "+ divide(15,2));
	}
	public static int divide(int dividend, int divisor) {
	  if (divisor<=0 || (dividend == Integer.MIN_VALUE && divisor == -1))
          return Integer.MAX_VALUE;
      int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
      long dvd = Math.abs(dividend);
      long dvs = Math.abs(divisor);
      int res = 0;
      while (dvd >= dvs) { 
          long temp = dvs, multiple = 1;
          System.out.println(" start -------"+ temp);
          while (dvd >= (temp << 1)) {
              temp <<= 1;
              multiple <<= 1;
              System.out.println(" temp and mul"+temp+ " "+multiple);
              
          }
          
          dvd -= temp;
          res += multiple;
          System.out.println(" end -------"+ dvd+ " "+res );
      }
      return sign == 1 ? res : -res; 
      
}

}
