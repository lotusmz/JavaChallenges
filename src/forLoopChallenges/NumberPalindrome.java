package forLoopChallenges;

public class NumberPalindrome {
	
	public static boolean isPalindrome(int number) {
		int original = number;
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
					
		return original==reverse;
	}
	
}
