package assignment;

import java.util.Scanner;

public class question11 {

    public static int reverseNumber1(int number) {
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    public static int reverseNumber2(int number) {
        if (number == 0) return number;
        return number % 10 + reverseNumber2(number / 10) * 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter the number: ");
        number = scanner.nextInt();
        System.out.println("Reverse of " + number + " is: " + reverseNumber2(number));
        scanner.close();
    }
}
