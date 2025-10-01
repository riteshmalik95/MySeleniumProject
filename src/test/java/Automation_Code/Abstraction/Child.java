package Abstraction;

//Abstract child class
abstract class Child extends Parent {
	// Constructor
	Child() {
		super();
		System.out.println("Child constructor called");
	}

	@Override
	void m1() {
		System.out.println("Method m1 called");
	}

	@Override
	void m2() {
		System.out.println("Method m2 called");
	}

	void m5() {
		System.out.println("Method m5 called");
	}
}
