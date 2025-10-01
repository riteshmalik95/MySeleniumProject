package Abstraction;

public class Demo2 extends Demo {
	void m1() {
    	System.out.println("Compile");
    }
    void m2() {
    	System.out.println("Javacode");
    }
    public static void main(String[] args) {
		Demo2 bd=new Demo2();
		bd.m1();
		bd.m2();
	}
}
