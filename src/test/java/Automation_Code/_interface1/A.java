package _interface1;

public interface A {
	static void m1() {
		System.out.println("Hello");
	}

	default void m2() {
		System.out.println("default");
	}

//	public static void main(String[] args) {
//		m1();
//	}
}
