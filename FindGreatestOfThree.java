package assignment;

import java.util.Scanner;

public class question6 {

    public static int findMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter the first number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        num2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        num3 = scanner.nextInt();
        System.out.println("The greatest number among " + num1 + ", " + num2 + " and " + num3 + " is: " + findMax(num1, num2, num3));
        scanner.close();
    }
}
