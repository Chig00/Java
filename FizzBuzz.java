import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Max count: ");
		int max = scanner.nextInt();
		
		for (int i = 1; i <= max; i++) {
			if (i % 3 == 0) {
				System.out.print("Fizz ");
			}
			
			if (i % 5 == 0) {
				System.out.print("Buzz");
			}
			
			if (i % 3 != 0 && i % 5 != 0) {
				System.out.print(i);
			}
			
			System.out.println();
		}
	}
}