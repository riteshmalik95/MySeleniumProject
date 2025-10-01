package codes_practice;

public class greatest_Number {

	public static void main(String[] args) {
		int a = 85;
		int b = 10;
		int c = 98;
		if(a>b && a>c) {
			System.out.println("A is the Greatest Number");
		}
		else if(b>a && b>c){
			System.out.println("B is the greatest number");
			
		}
		else {
			System.out.println("C is the Greatest Number");
			
		}
//Nested if-else		
//		if (a > b) {
//			if (a > c) {
//				System.out.println("A is the Greatest Number");
//			} else {
//				System.out.println("C is the Greatest Number");
//			}
//		} else {
//			if (b > c) {
//				System.out.println("B is the Greatest Number");
//			} else {
//				System.out.println("C is the Greatest Number");
//			}
//		}
	}
}
