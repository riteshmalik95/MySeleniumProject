package _interface;

public class promo implements A1.T1,A1.T2 {
	public void m1() {
		System.out.println("m1");
	}
	public void m2() {
		System.out.println("m2");
	}

	public static void main(String[] args) {
//		promo p1=new promo();
		A1.T1 p1=new promo();
		p1.m1();
		A1.T2 p2=new promo();
		p2.m2();
		

	}

}
