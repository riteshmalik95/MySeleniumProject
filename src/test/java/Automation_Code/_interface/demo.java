//package _interface;
//
//public class demo implements A {
//	public void m1() {
//		System.out.println("m1");
//	}
//	public void m2() {
//		System.out.println("m2");
//	}
//	public void m3() {
//		System.out.println("m3");
//	}
//	public static void main(String[] args) {
//		demo d1=new demo();
//		d1.m1();
//		d1.m2();
//		d1.m3();
//	}
//}
//package _interface;
//
//public class demo implements B {
//	public void m1() {
//		System.out.println("m1");
//	}
//	public void m2() {
//		System.out.println("m2");
//	}
//	public void m3() {
//		System.out.println("m3");
//	}
//	public void m4() {
//		System.out.println("m4");
//	}
//	public void m5() {
//		System.out.println("m5");
//	}
//	public static void main(String[] args) {
//		demo d1=new demo();
//		d1.m1();
//		d1.m2();
//		d1.m3();
//		d1.m4();
//		d1.m5();
//	}
//}
package Automation_Code._interface;

import Automation_Code._interface.A;
import Automation_Code._interface.B;

public class demo implements A, B { //that's called multiple
                                //inheritance in java
	public void m1() {
		System.out.println("m1");
	}
	public void m2() {
		System.out.println("m2");
	}
	public void m3() {
		System.out.println("m3");
	}
	public void m4() {
		System.out.println("m4");
	}
	public void m5() {
		System.out.println("m5");
	}
	public static void main(String[] args) {
		demo d1=new demo();
		d1.m1();
		d1.m2();
		d1.m3();
		d1.m4();
		d1.m5();
	}
}

