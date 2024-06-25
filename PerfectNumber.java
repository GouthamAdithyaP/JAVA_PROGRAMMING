package assignment;

import java.util.Scanner;

public class question21 {

    public static boolean checkPerfectNumber(int number) {
        int sumOfDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        if (checkPerfectNumber(n)) {
            System.out.println(n + " is a perfect number");
        } else {
            System.out.println(n + " is not a perfect number");
        }
        scanner.close();
    }
}
