package Arrays;

public class updateArray1 {

	public static void main(String[] args) {
		// Declaration and Initialization of an Array
		int[] arr = { 12, 24, 36, 48 };
		// Print the Original Array
		System.out.println("Original Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		arr[0] = 13;
		arr[1] = 25;
		arr[2] = 37;
		arr[3] = 49;
		
		// Print the Updated Array
		System.out.println("\n\nUpdated Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
