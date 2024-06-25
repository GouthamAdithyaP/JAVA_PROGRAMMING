package assignment;

import java.util.Scanner;

public class question23 {

    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static boolean checkHarshadNumber(int number) {
        int sumOfDigits = calculateSumOfDigits(number);
        return number % sumOfDigits == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        if (checkHarshadNumber(n)) {
            System.out.println(n + " is a Harshad number");
        } else {
            System.out.println(n + " is not a Harshad number");
        }
        scanner.close();
    }
}
