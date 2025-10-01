package Automation_Code._interface;

import Automation_Code._interface.Circle;

public class Rectangle implements _interface.Area {
       public void area() {
        	double l = 2.5,b = 3.6,A;
        	A=l*b;
        	System.out.println(A);
        	
        }
       public static void main(String[] args) {
		 _interface.Area a1=new Circle();
		 a1.area();
		 _interface.Area a2=new Rectangle();//Loosely coupled application
		 a2.area();
	}
       
}