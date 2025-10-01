package codes_practice;

public class ConstructorDemo {
    int x,y;
    ConstructorDemo(){
    	this(20, 40);
    	x=100;
    	y=200;
    }
    ConstructorDemo(int x,int y){
    	this.x=x;
    	this.y=y;
    }
	void sum() {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo cd =new ConstructorDemo();
		cd.sum();
		ConstructorDemo cd1 =new ConstructorDemo();
		cd1.sum();
	}

}
