package Practice;

public class interface1 {
    interface drawable{
    	void draw();
    }
    class Rectangle implements drawable{
    	public void draw() {
    		System.out.println("Draw a Rectangle");
    	}
    }
	public static void main(String[] args) {
		
		interface1 myinterface= new interface1();
     myinterface.draw();
	}
	private void draw() {
		System.out.println("Draw a Rectangle");
		
	}

}
