package assignment;

import java.util.Scanner;

public class question1 {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPositive(number)) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

        scanner.close();
    }
}
