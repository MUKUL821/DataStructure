package conceptTest;

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []num = {1,2,3};
System.out.println("result is"+ canJump(num));
	}
    public static boolean canJump(int[] nums) {
        char []ch = new char[nums.length];
        
        int len = nums.length;
        for(int i = len-1; i>=0; i--){
             ch[i] = 'B';
            if(nums[i]+i >= len-1)
                ch[i] = 'G';
            else
            {   int j=i+1;
                while(j < len && ch[j]!='G')
                    j++;
                System.out.println("j"+ j);
                if(j<len)
                {
                    if(nums[i]>=j-i)
                        ch[i]='G';
                }
            }
            System.out.println("ch val"+ ch[i]+ " i is"+i);
        }
        if(ch[0]=='G')
            return true; 
        else return false;
        
    }
	
}
