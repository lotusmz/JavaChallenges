package forLoopChallenges;

public class EvenDigitSum {
	
	public static int getEvenDigitSum(int number) {
		int answer = 0;

			//validates number must ver greater than 0
			if(number < 0) {
				
				answer = -1;
			}else {
				
				while(number!=0) {
					
					//get the last digit of the number
					int digit = number%10;
					
					//validates if the digit obtained is an even number
					if(digit%2 == 0) {
						//sums values
						answer += digit;
					}
					//drops the last digit
					number /= 10;				
				}				
			}
		
		return answer;
	}	
	
}
