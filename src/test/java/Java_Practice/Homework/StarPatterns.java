//package Homework;
//
//import Practice.interface1;
//
//public class StarPatterns {
//
//	public static void main(String[] args) {
//		int n=7;
//		for(int i=1;i<=n;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print("*  ");
//		}
//		System.out.println();
//		}
//
//	}
//
//}

package Homework;



public class StarPatterns {

	public static void main(String[] args) {
		int n=7;
		for(int i=n;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("*  ");
		}
		System.out.println();
		}

	}

}

