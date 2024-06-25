package assignment;

import java.util.Scanner;

public class question20 {

    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static boolean isStrongNumber(int n) {
        int originalNumber = n;
        int sumOfFactorials = 0;
        while (n > 0) {
            sumOfFactorials += factorial(n % 10);
            n = n / 10;
        }
        return sumOfFactorials == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        if (isStrongNumber(n)) {
            System.out.println(n + " is a strong number");
        } else {
            System.out.println(n + " is not a strong number");
        }
        scanner.close();
    }
}
