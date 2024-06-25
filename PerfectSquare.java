package assignment;

import java.util.Scanner;

public class question22 {

    public static boolean checkPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scanner.nextInt();
        if (checkPerfectSquare(n)) {
            System.out.println(n + " is a perfect square");
        } else {
            System.out.println(n + " is not a perfect square");
        }
        scanner.close();
    }
}
