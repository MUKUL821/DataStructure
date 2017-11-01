package generalHacker;
/*mukul*/
public class CustomNumber {

	public int numberFinder(int arr[]){
		int min=arr[arr.length-1];int max;int res=-1;
		for(int i=arr.length-2;i>0;i--){
			min = Math.min(min, arr[i]);
			boolean checked = false;
			if(arr[i]<=min){
				//int j=i-1;
				int j;
				max= arr[i];
				for( j=i-1; j>=0;j--){
					if(arr[j]> max)
						break;
					
					checked=true;
						
				}
			
				if(j<0 && checked)
					res= arr[i];
					
				
			}
		}
			return res;
			

	}
	public static void main(String[] args) {
		int arr[] = {5, 1, 4, 3, 6, 8, 1, 17, 99};
		int result = new CustomNumber().numberFinder(arr);
System.out.println("result"+result);
	}

}
