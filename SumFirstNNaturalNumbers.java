package assignment;

import java.util.Scanner;

public class question3 {

    public static void calculateSum(int number) {
        int result = number * (number + 1) / 2;
        System.out.println("The sum of the first " + number + " natural numbers is: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int number = scanner.nextInt();
        calculateSum(number);
        scanner.close();
    }
}
