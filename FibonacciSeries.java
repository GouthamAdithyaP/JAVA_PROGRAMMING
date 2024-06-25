package assignment;

import java.util.Scanner;

public class question15 {

    public static void printFibonacciSequence(int n) {
        if (n <= 0) {
            return;
        } else if (n == 1) {
            System.out.println(0);
            return;
        } else if (n == 2) {
            System.out.println("0 1");
            return;
        }

        int first = 0;
        int second = 1;
        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n: ");
        n = scanner.nextInt();
        System.out.println("Fibonacci sequence up to " + n + ":");
        printFibonacciSequence(n);
        scanner.close();
    }
}
