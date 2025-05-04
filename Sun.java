public class Sun {
	static int findMultiple(int number) {
		return number * 5;
	}

	static void displayPrimeNumbers() {
		int firstFifty = 0;
		System.out.print("First 50 prime numbers are");
		for (int number = 1; firstFifty < 50; number++) {
			int count = number;
			int prime = 0;
			for (;count >= 1; count--) {
				if (number % count == 0) prime++;
			}
			if (prime == 2) {
				System.out.print(" " + number);
				firstFifty++;
			}
		}
	}



}