package assignment;
import java.util.Scanner;

public class question24 {
	public static int calculateSumOfDivisors(int number) {
		int sum = 0;
		for(int i = 1; i < number; i++) {
			if(number % i == 0)
				sum += i;
		}
		return sum;
	}
	
	public static boolean isAbundantNumber(int number) {
		int sumOfDivisors = calculateSumOfDivisors(number);
		return sumOfDivisors > number;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scanner.nextInt();
		
		if(isAbundantNumber(n)) {
			System.out.println(n + " is an abundant number");
		} else {
			System.out.println(n + " is not an abundant number");
		}
		
		scanner.close();
	}
}
