package Project1;

public class task7 {

	public static void main(String[] args) {
		
		
		
		// Maximum and minimum number in the array?
		
	
		
		int[]num= {-260,-15,-10,-20,98,40,240};
		
		
		int largest=num[0];
		
		int smallest=num[0];
		
		
		for(int i =0; i<num.length;i++) {
			
			 {
				if(num[i]>largest) {
					
					largest=num[i];
				}
				
				if(num[i]<smallest) {
					smallest=num[i];
				}
			}
		}
		System.out.println(largest);
		
		
		System.out.println("======");
		
		
		System.out.println(smallest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
