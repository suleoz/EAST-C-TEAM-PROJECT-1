package Project1;

public class task5 {

	public static void main(String[] args) {
		
		//Write a java program to check whether a given number is prime or not?
		
		
		
		int num = 11;
		
        boolean isPrime = true;
 
        for (int i=2; i <= num/2; i++)
        {
            if ( num % i == 0)
            {
                isPrime = false;
                break;
            }
        }

        if ( isPrime == true )
            System.out.println(num + " is a prime number");
        
        
        else
            System.out.println(num + " is not a prime number");






		
		
		
		
	}

}
