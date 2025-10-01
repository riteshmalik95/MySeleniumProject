package Java_Practice.Arrays;
import java.util.ArrayList;
public class arrayList {

	public static void main(String[] args) {
		

		        // Create an ArrayList
		        ArrayList<String> fruits = new ArrayList<>();

		        // Add elements
		        fruits.add("Apple");
		        fruits.add("Banana");
		        fruits.add("Cherry");

		        // Print elements
		        System.out.println("Fruits: " + fruits);

		        // Access an element
		        String secondFruit = fruits.get(1);
		        System.out.println("Second fruit: " + secondFruit);

		        // Modify an element
		        fruits.set(1, "Blueberry");
		        System.out.println("After modification: " + fruits);

		        // Remove an element
		        fruits.remove("Cherry");
		        System.out.println("After removal: " + fruits);

		        // Iterate over the list
		        for (String fruit : fruits) {
		            System.out.println(fruit);
		        }

		        // Size of the list
		        System.out.println("Size of the list: " + fruits.size());

		        // Check if the list is empty
		        System.out.println("Is the list empty? " + fruits.isEmpty());

		        // Clear the list
		        fruits.clear();
		        System.out.println("After clearing, is the list empty? " + fruits.isEmpty());
		    }
		


	}


