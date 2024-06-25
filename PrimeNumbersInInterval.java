package assignment;

import java.util.Scanner;

public class question9 {

    public static void printPrimesInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, end;
        System.out.println("Enter the starting number: ");
        start = scanner.nextInt();
        System.out.println("Enter the ending number: ");
        end = scanner.nextInt();
        System.out.println("Prime numbers in the given range:");
        printPrimesInRange(start, end);
        scanner.close();
    }
}
