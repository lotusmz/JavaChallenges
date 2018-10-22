package forLoopChallenges;

public class GreatestCommonDivisor {
	
	public static int getGreatestCommonDivisor(int first, int second) {
		int answer = 0;
		
			if(first < 10 || second < 10) {
				
				answer = -1;
				
			}else {
				
				//define the divisor
				if(first > second) {
					
					answer = first;
					
				}else {
					
					answer = second;
					   //divide the numbers until either on is 0
				}while (first%answer != 0 || second%answer != 0) {
					
					answer --;
				}
				
			}
		
		return answer;
	}
	
}
