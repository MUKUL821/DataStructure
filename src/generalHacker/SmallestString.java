package generalHacker;
/*mukul*/
public class SmallestString {

public static void main(String[] args){
	System.out.println("enterr");
	String str = new String("ccdaabcdbb");
	String sub1 = new String("cd");
	String sub2 = new String("ab");
	while(str.length()>0){
		System.out.println("yup");
		if(str.contains(sub1)|| str.contains(sub2))
		{
		str=str.replace(sub1,"");
		str = str.replace(sub2, "");
		System.out.println("output is"+str);
		}
		else
			break;
			
		
	}
	System.out.println("final output is"+str);
	
}
}
