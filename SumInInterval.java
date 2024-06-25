package assignment;

import java.util.Scanner;

public class question5 {

    public static int calculateSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i * 2;  
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, end;
        System.out.println("Enter the starting number: ");
        start = scanner.nextInt();
        System.out.println("Enter the ending number: ");
        end = scanner.nextInt();
        System.out.println("The sum of double the numbers between " + start + " and " + end + " is: " + calculateSum(start, end));
        scanner.close();
    }
}
