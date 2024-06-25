package assignment;
import java.util.Scanner;

public class question25 {
	public static int calculateSumOfDivisors(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0)
				sum += i;
		}
		return sum;
	}
	
	public static int calculateRatio(int n) {
		int sumOfDivisors = calculateSumOfDivisors(n);
		return sumOfDivisors / n;
	}
	
	public static boolean areAmicablePairs(int a, int b) {
		int ratioA = calculateRatio(a);
		int ratioB = calculateRatio(b);
		return ratioA == ratioB;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		sc.close();
		
		if(areAmicablePairs(a, b)) {
			System.out.println(a + " and " + b + " are amicable pairs");
		} else {
			System.out.println(a + " and " + b + " are not amicable pairs");
		}
	}
}
