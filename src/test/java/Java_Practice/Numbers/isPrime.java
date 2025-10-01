package Numbers;

public class isPrime {

	public static void main(String[] args) {
		
		        int counter = 1;
		        
		        // Iterate through numbers from 2 to 100
		        for (int num = 2; num <= 100; num++) {
		            if (isPrime(num)) {
		                System.out.println(counter + ". " + num);
		                counter++;
		            }
		        }
		    }

		    // Method to check if a number is prime
		    public static boolean isPrime(int number) {
		        if (number <= 1) return false; // Numbers less than or equal to 1 are not prime
		        if (number == 2) return true;  // 2 is the only even prime number
		        if (number % 2 == 0) return false; // Other even numbers are not prime
		        
		        // Check for factors from 3 up to the square root of the number
		        for (int i = 3; i * i <= number; i += 2) {
		            if (number % i == 0) {
		                return false;
		            }
		        }
		        
		        return true;
		    }
		}
