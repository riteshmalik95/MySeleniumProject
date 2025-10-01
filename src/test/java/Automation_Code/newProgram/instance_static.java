package newProgram;

public class instance_static {

    int a = 40;               // Instance variable
    static int b = 25;        // Static variable

    // Instance method
    void m1() {
        System.out.println("Inside m1 (Instance Method):");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // Static method
    static void m2() {
        instance_static z = new instance_static();  // Create object to access 'a'
        System.out.println("Inside m2 (Static Method):");
        System.out.println("a = " + z.a);
        System.out.println("b = " + b);
    }

    // Main method - Entry point
    public static void main(String[] args) {
        // Creating object to call instance method
        instance_static obj = new instance_static();
        obj.a=100;
        instance_static.b=30;
        
        obj.m1();  // Call instance method

        // Call static method directly using class name
//        instance_static.m2();
//        obj.m2();
        m2();
    }
}
