package forLoopChallenges;

public class PerfectNumber {
	
	public static boolean isPerfectNumber(int number) {
		boolean answer = false;
		
		int initialValue = 1;
		int perfectNumber = 0;
		
		if(number < 1 ) {
			answer = false;				
		}else {
			
			for(int i=number;i>initialValue;) {
				
				if(number%initialValue == 0) {
					
					perfectNumber += initialValue;
					
				}
				
				initialValue++;
			}
			
			if (perfectNumber == number) {
				
				answer = true;
			
			}
		}
		
		return answer;
	}
}
