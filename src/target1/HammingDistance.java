package target1;

public class HammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Res : "+hammingDistance(1,4));
//0001 0010: 0101 0010 0001 0000
	}

    public static int hammingDistance(int x, int y) {
        int count =0;
        int number = x^y;
        System.out.println("number"+number);
    
       while(number>0)
        { 
            if( (number&1) == 1)
                count++;
            
            number >>>= 1;
            System.out.println(number);
        }
        
        return count;


    }
}

