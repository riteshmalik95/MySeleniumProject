//package Constructors;
//
//public class Demo {
//	Demo() {
//		new Demo(10);
//		System.out.println("Hello");
//	}
//
//	Demo(int a) {
//		new Demo(10, 30);
//		System.out.println(a);
//	}
//
//	Demo(int a, int b) {
//		System.out.println(a + b);
//	}
//
//	public static void main(String[] args) {
//		new Demo();
//
//	}
//}

package Constructors;

public class Demo {
	Demo() {
		this(10);
		System.out.println("Hello");
	}

	Demo(int a) {
		this(10, 30);
		System.out.println(a);
	}

	Demo(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		new Demo();

	}
}

//package Constructors;
//
//public class Demo {
//	Demo() {
//		
//		System.out.println("Hello");
//		this(10);//Constructor call must be the first statement in the constructor
//	}
//
//	Demo(int a) {
//		this(10, 30);
//		System.out.println(a);
//	}
//
//	Demo(int a, int b) {
//		System.out.println(a + b);
//	}
//
//	public static void main(String[] args) {
//		new Demo();
//
//	}
//}
