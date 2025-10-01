package Homework;

import java.util.Scanner;

public class Table {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int d = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(d + " x " + i + " = " + (d * i));
        }

        scanner.close();
    }
}
