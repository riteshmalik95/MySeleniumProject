package Miscellaneous;
//Example of Constructor in Java
public class Car {
	private String model;
	private int year;
	public Car() {
		String model;
		int year;
	}

	Car(String model,int year){
		this.model=model;
		this.year=year;
	}
	void displayInfo() {
		System.out.println("Model:"+model);
		System.out.println("Year:"+year);
	}
	public static void main(String[] args) {
		//Creating an object of Car class using the constructor
		Car myCar=new Car("Maruti Suzuki",2010);
		myCar.displayInfo();
		

	}

}
