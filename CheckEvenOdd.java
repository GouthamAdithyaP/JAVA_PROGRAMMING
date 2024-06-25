package assignment;

import java.util.Scanner;

public class Question2 {

    public static void determineEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

    public static void determineOddEven(int number) {
        if ((number & 1) == 1) {
            System.out.println("The number is odd.");
        } else {
            System.out.println("The number is even.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        determineOddEven(number);
        scanner.close();
    }
}
