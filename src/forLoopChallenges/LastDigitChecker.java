package forLoopChallenges;

/*Class that tests if out of three numbers at least two share the same last digit*/

public class LastDigitChecker {
	
	public static boolean hasSameLastDigit(int a, int b, int c) {
		boolean answer = false;
		
			if((a < 10 || a > 1000) || (b < 10 || b >1000) || (c < 10 || b > 1000)) {
				answer = false;
			}else {
				
				int lastDigitA = a%10;
				int lastDigitB = b%10;
				int lastDigitC = c%10;
				
				if(lastDigitA == lastDigitC || lastDigitA == lastDigitB || lastDigitC == lastDigitB) {
					
					answer = true;
				}
				
			}
		
		return answer;
	}
}
