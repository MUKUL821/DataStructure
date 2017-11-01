package edu.mukul;
/*mukul*/
public class UniqueCharInString {
// Cracking the code .. chapter 1- question 1
	
	//ASCII VALUE OF SPACE IS 32
	public static void main(String[] args) {
		String str = "tuyrw yyu jklmnbvc";
		boolean res= check(str);
		System.out.println("res"+ res);

	}

	private static boolean check(String str) {
		
		String st= str.toLowerCase();
		char arr[] = st.toCharArray();
		int record[] = new int[25];
		
		for(int i=0; i<arr.length; i++)
		{ 
			if(arr[i]==32)
				continue;
			int num = (arr[i] - 'a');
			System.out.println(num);
		
		if(record[num]==1)
			return false;
		else
			record[num]= 1;
		
			
		
		}
		return true;
		
	}

}
