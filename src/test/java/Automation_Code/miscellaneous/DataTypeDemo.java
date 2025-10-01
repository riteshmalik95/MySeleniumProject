package miscellaneous;

public class DataTypeDemo {

	public static void main(String[] args) {
		int i=10;
		byte b=100;//Literal to var assignment
		System.out.println(b);
		byte b2=b;//Var to var assignment
		byte i2=b;
		System.out.println(i2);
		//Java is a strictly-typed language
		System.out.println(b);
		System.out.println(b2);
		short s=130;
		System.out.println(s);
		boolean bool=true;
		
		float f=63.2548857623f;
		System.out.println(f);
		
		double d=63.2548857623d;
		System.out.println(d);
		double d2=10.2;
		
		
		char c=97;
		System.out.println(c);
		
		char c2=6500;
		System.out.println(c2);
		
		d=f;
		System.out.println(d);
		
		int i3=10;
		byte b3=(byte)i;
		System.out.println(b3);
		
		
		float f2=45.36f;
		int i4=(int)f2;
		System.out.println(i4);
		
		int i5=133;
		byte b4=(byte)i5;
		System.out.println(b4);
		
		int i6=71;
		char c3=(char)i6;
		System.out.println(c3);
		
		char c4='G';
		int b5= c4;
		System.out.println(b5);
		
		float f3=78.23f;
		char c5=(char)f3;
		System.out.println(c5);
		
		byte b6=(byte)130;
		System.out.println(b6);
		
		short s1=(short)i6;
		System.out.println(s1);
		
		short s2=(byte)i6;
		System.out.println(s2);
		
//		short s3=(int)i6;// Error
		char c6=(char)-1;
		System.out.println((int)c6);
		//Range of char=0-65,535......Total Characters=65,536
		
		int i7=130;
		byte b7=(byte)i7;
		System.out.println(b7);
		
		byte b8=(int)'c';
		System.out.println(b8);//Must not be happened
		
		
		
		
		
	}

}
