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

	static String displayAge(int ageYears) {
		int years = ageYears;
		long months = years * 12;
		long days = years * 365;
		long minutes = days * 1440;  
		long seconds = minutes * 60;

		String ages = """
		Age: 
		%d year(s)
		%,d months
		%,d days
		%,d minutes
		%,d seconds
		""".formatted(years, months, days, minutes, seconds);

		return ages;
	}

	static void displayDogAge(String name, int humanYears) {
		System.out.printf("%s: %d dog year(s) old", name, humanYears * 7);
	}

	static void findMultipleOf7Not5() {
		System.out.print("Multiples of 7 that are not multiples of 5 are");
		for (int number = 2000; number <= 3200; number++) {
			if (number % 7 == 0 && number % 5 != 0) System.out.printf(" %d", number );
			if (number % 7 == 0 && number % 5 != 0 && number + 7 < 3200) System.out.print(",");	
		}
	}

	static int computeSumOfNumber(int number) {
		int rem = 0;
		int sum = 0;
		for (int count = 1; count <= 4; count++) {
			rem = number % 10;
			sum += rem;
			number /= 10;
		}
		return sum;
	}

}