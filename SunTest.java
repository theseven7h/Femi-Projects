import java.util.Scanner;

public class SunTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = input.next();
		System.out.print("Enter number: ");
		int number1 = input.nextInt();
		//int number2 = input.nextInt();
		//Uncomment number2 input if needed

		Sun.displayDogAge(name, number1);
		//System.out.println(Sun.displayAge(number1));
		//Sun.displayPrimeNumbers();
		//System.out.println(Sun.findMultiple(number1));
	}
}