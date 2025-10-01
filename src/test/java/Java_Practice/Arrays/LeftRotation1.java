package Arrays;

import java.util.Scanner;

public class LeftRotation1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
       
        int[] arr = new int[5];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number of rotations: ");
        int d = sc.nextInt();

        // Perform the left rotation
        leftRotate(arr, d);

        // Print the rotated array
        System.out.println("Array after left rotation:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Method to perform left rotation by d positions
    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;  // Handle cases where d is greater than n

        // Temporary array to hold the first d elements
        int[] temp = new int[d];
        System.arraycopy(arr, 0, temp, 0, d);

        // Shift the remaining elements of the array to the left
        for (int i = 0; i < arr.length - d; i++) {
            arr[i] = arr[i + d];
        }

        // Place the d elements stored in temp at the end of the array
        System.arraycopy(temp, 0, arr, n - d + 0, d);
    }
}
