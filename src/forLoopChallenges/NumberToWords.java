package forLoopChallenges;

public class NumberToWords {
	
	public static void numberToWords(int number) {
		int lastDigit = 0;
		
		if(number < 0) {
			
			System.out.println("Invalid Value");
		}else {
			int tempReversed = number;
			//reverse the number
			number = reverseNumber(number);
			while(number!=0) {
								
				//Obtain the last digit of the number
				lastDigit = number%10;
				
				//Print the digit in text
				switch(lastDigit) {
				
					case 1:
						System.out.print(" One");
						break;
					case 2:
						System.out.print(" Two");
						break;
					case 3:
						System.out.print(" Three");
						break;
					case 4:
						System.out.print(" Four");
						break;	
					case 5:
						System.out.print(" Five");
						break;
					case 6:
						System.out.print(" Six");
						break;
					case 7:
						System.out.print(" Seven");
						break;
					case 8:
						System.out.print(" Eight");
						break;
					case 9:
						System.out.print(" Nine");
						break;
					case 0:
						System.out.print(" Zero");
						break;
					default:
						System.out.print("Input error");
						break;
				}
				
				//Drop the last digit
				number /= 10;		
				
			}
			
			while (getDigitCount(number) > getDigitCount(tempReversed)) {
                tempReversed *= 10;
                System.out.println("Zero");
 
			}
		}
	}
	
	public static int reverseNumber(int number) {
		int reverse = 0;
		
			while(number !=0) {
				//extract the least significant digit				
				int lastDigit = number%10;
				//add last digit to reverse variable
				reverse += lastDigit;
				//drop the last digit
				number /= 10;
				//increase the place value of the reverse variable
				if(number!=0) reverse *=10;
				
			}
		
		return reverse;
	}
	
	public static int getDigitCount(int number) {
		int result = 0;
		
			while(number!=0) {
				
				number /= 10;
				
				result++;
			}
		
		return result;
	}
}
