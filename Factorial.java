package assignment;

import java.util.Scanner;

public class question17 {

    public static int recursiveFactorial(int n) {
        if (n == 0) return 1;
        return n * recursiveFactorial(n - 1);
    }

    public static int iterativeFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        System.out.println("Factorial of " + n + " (using iteration) is " + iterativeFactorial(n));
        scanner.close();
    }
}
