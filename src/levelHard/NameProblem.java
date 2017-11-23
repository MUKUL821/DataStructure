package levelHard;

public class NameProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("res "+ answer("Mukul Kumari Baj"));

	}
	public static String answer(String name){
		
		if(name == null || name.length() <=2)
			return name;
		
		String []name_array = name.split(" ");
		StringBuffer name_split = new StringBuffer();
		name_split.append(name_array[0]+' ');
		
		for(int i =1; i < name_array.length-1; i++){
			name_split.append(name_array[i].charAt(0)+ ". ");
			
		}
		name_split.append(name_array[name_array.length-1]);
		
		
		return name_split.toString();
		
		
	}
	
	
}
