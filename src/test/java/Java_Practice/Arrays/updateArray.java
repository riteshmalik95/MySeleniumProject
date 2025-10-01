package Arrays;

public class updateArray {

	public static void main(String[] args) {
		// Declare and initialize an Array
		int[] arr = { 10, 20, 30, 40 };
		// Print the original array
		System.out.println("Original Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// Update the elements of an array
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		
        //Print updated Array
		System.out.println("\n\nUpdated Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
