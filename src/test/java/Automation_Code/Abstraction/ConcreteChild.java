package Abstraction;

//Concrete class
public class ConcreteChild extends Child {
	// Constructor
	ConcreteChild() {
		super();
		System.out.println("ConcreteChild constructor called");
	}

	@Override
	void m3() {
		System.out.println("Method m3 called");
	}

	@Override
	void m4() {
		System.out.println("Method m4 called");
	}

	public static void main(String[] args) {
		ConcreteChild ch = new ConcreteChild();
		ch.m1();
		ch.m2();
		ch.m3();
		ch.m4();
		ch.m5();
	}
}
