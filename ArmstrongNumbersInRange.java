package assignment;

import java.util.Scanner;

public class question14 {

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    public static int digitCount(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static boolean isArmstrong(int number) {
        int count = digitCount(number);
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += power(digit, count);
            temp /= 10;
        }
        return sum == number;
    }

    public static void printArmstrongNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, end;
        System.out.println("Enter the starting number: ");
        start = scanner.nextInt();
        System.out.println("Enter the ending number: ");
        end = scanner.nextInt();
        System.out.println("Armstrong numbers in the range:");
        printArmstrongNumbersInRange(start, end);
        scanner.close();
    }
}
