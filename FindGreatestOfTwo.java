package assignment;

import java.util.Scanner;

public class question4 {

    public static int findMax(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("The maximum of the two numbers is: " + findMax(num1, num2));
        scanner.close();
    }
}
