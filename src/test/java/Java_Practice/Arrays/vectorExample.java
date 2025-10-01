package Arrays;

import java.util.Vector;

public class vectorExample {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("Manager");
		vector.add("Director");
		vector.add("Writer");
		vector.add("Blogger"); 
		// Displaying the vector elements
		System.out.println("Vector Elements:" + vector);
		// Accessing the elements
		System.out.println("First element:" + vector.get(2));
		// Removing an Element
		vector.remove("Blogger");
		System.out.println("After removal:" + vector);
		// Checking if element exists
		if (vector.contains("Blogger")) {
			System.out.println("Vector contain Blogger.");
		} else {
			System.out.println("Vector does not contain Blogger.");
		}
		// Iterating over elements
		for (String Artist : vector) {
			System.out.println("Elements:"+Artist);
		}
	}
}
