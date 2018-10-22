package forLoopChallenges;

public class SharedDigit {
	
	
	public static boolean hasSharedDigit(int number, int number2) {
		boolean answer = false;
		
			if((number <= 10 || number >= 99) || (number2 <= 10 || number2 >= 99)) {
				
				answer = false;
				
			}else {
				
				 for (int i = number; i > 0; i /= 10) {
			            int aDigit = i % 10;
			            for (int j = number2; j > 0; j /= 10) {
			                int bDigit = j % 10;
			                if (aDigit == bDigit) {
			                    return true;
			                }
			            }
				 }       
			}
		
		return answer;
	}
}
