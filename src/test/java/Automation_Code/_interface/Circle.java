package Automation_Code._interface;

import static _interface.Area.PI;

public class Circle implements _interface.Area {
       public void area() {
        	double r=3.14,A;
        	A=PI*r*r;
        System.out.println(A);
        }
}
