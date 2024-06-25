package assignment;

import java.util.Scanner;

public class question10 {

    public static int sumDigits1(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int sumDigits2(int number) {
        if (number == 0) {
            return 0;
        }
        return number % 10 + sumDigits2(number / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter the number: ");
        number = scanner.nextInt();
        int result = sumDigits2(number);
        System.out.println("Sum of digits: " + result);
        scanner.close();
    }
}
