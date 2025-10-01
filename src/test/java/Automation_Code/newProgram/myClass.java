package newProgram;

public class myClass {
	myClass(){
	System.out.println("Hello");
	}
    myClass(int a){
    	System.out.println(a);	
	}
    myClass(int a,int b){
    	System.out.println(a+b);
	}

	public static void main(String[] args) {
		new myClass();
		new myClass(10);
		new myClass(20,30);
	}

}
