package Arrays;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		//Create ArrayList
		ArrayList<String> fruits=new ArrayList<>();
		//Add Elements
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Papaya");
		
		//Print Elements
		System.out.println("Fruits:"+fruits);
		
		//Access an Element
		String secondFruit=fruits.get(1);
		System.out.println("Second Fruit:"+secondFruit);
		
		//Modify an Element
		fruits.remove("Orange");
		System.out.println("After Removal:"+fruits);
		
		//Iterate the List
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		//Size of the List
		System.out.println("Size of the List:"+fruits.size());
		

	}

}
