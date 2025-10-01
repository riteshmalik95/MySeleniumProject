package Constructors;

public class Student {
	String name;
	int age;
	String profession;

	Student(String n, int a, String p) {// Parameterized Constructor
		name = n;
		age = a;
		profession = p;
	}

	void display() {
		System.out.println(name + " " + age + " " + profession + " ");
	}

	public static void main(String[] args) {
		Student s = new Student("Ritesh", 29, "Engineer");
		Student s1 = new Student("Vishal", 32, "Doctor");
		s.display();
		s1.display();

	}

}
