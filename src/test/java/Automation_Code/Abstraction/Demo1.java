package Abstraction;

public class Demo1 extends Demo {
        void m1() {
        	System.out.println("Hello");
        }
        void m2() {
        	System.out.println("Ritesh");
        }
        public static void main(String[] args) {
//        	Demo1 cd= new Demo1();
			Demo cd= new Demo1();
// we can also make our reference variable 
// of type Demo(i.e Abstract class)
			cd.m1();
			cd.m2();
		}
        
}
