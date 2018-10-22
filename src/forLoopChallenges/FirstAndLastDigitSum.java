package forLoopChallenges;

public class FirstAndLastDigitSum {
	
	public static int sumFirstAndLastDigit(int number) {
		int answer = 0;
		int firstDigit = 0;
		int lastDigit = number%10;
	
			if(number < 0) {
								
				answer = -1;
			}else {
				
				while(number !=0) {
					//get the last digit of the number
					firstDigit = number%10;
					//drop the last digit
					number /= 10;
				}
				
				answer = firstDigit + lastDigit;
			}
			
			
		
		return answer;
	}
	
}
