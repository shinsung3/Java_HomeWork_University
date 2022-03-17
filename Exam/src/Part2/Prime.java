package Part2;

public class Prime {
	// Task 2: main method
	// your code here
	public static void main(String[] args) {
		String[] args2 = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		main2(args2);
	}

	public static void main2(String[] args) {
		for (int i = 0; i < args.length; i++) {
			int checkNum = Integer.parseInt(args[i]);
			if (checkNum > 0) {
				if (isNumPrime(checkNum)) {
					System.out.println(checkNum);
				}
			}
		}
	}

	// isNumPrime helper method
	// Returns true for prime number, false otherwise
	static boolean isNumPrime(int num) {
		boolean isPrime = true;

		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}
}
