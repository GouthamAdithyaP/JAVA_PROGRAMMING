package assignment;

import java.util.Scanner;

public class question18 {

    public static int recursivePower(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * recursivePower(base, exponent - 1);
    }

    public static int iterativePower(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base value:");
        int base = scanner.nextInt();
        System.out.println("Enter the exponent value: ");
        int exponent = scanner.nextInt();
        System.out.println(base + " to the power " + exponent + " (using iteration) is: " + iterativePower(base, exponent));
        scanner.close();
    }
}
