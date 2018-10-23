package scannerChallenges;

import java.util.Scanner;

/*Read 10 numbers from the console entered by the user and print the sum of those numbers
 * Create a Scanner object. Use hasNextInt() method from the scanner to validate entered
 * value as an int, if hasNextInt() is false print message Invalid Number, use the 
 * nextInt() method to get each number and add it to the sum. Before entering each number 
 * print the message, "Enter number#x", where X represents the count of total numbers entered*/

public class ReadingUserInputChallenge {

	public static void userInput() {
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=1;i<11;i++) {
			
			System.out.println("Enter number # " + i);
			
			boolean hasNextInt = scanner.hasNextInt();
			
			if(hasNextInt) {
				
				int number = scanner.nextInt();
				result += number;
				
			}else {
				System.out.println("Unable to parse value entered");
			}
		}
				
		System.out.println("Sum of all the numbers is: " +result);
		scanner.close();
	}

}
