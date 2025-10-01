package Constructors;

public class Temp {
	Temp()
	{
		System.out.println("Hello");
	}
	Temp(int a)
	{
		System.out.println(a);
	}
	Temp(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		new Temp();
		new Temp(10);
		new Temp(10,30);
		

	}

}
