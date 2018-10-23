package forLoopChallenges;

public class FlourPackProblem {
	
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		boolean answer = false;
		
			if(bigCount <0 || smallCount <0 || goal <0) {
				
				answer = false;
				
			}else {
				
				int bigKilos = bigCount*5;
				int totalKilos = smallCount + bigKilos;
				if(goal <= totalKilos) {
					
					int bigKilosPack = goal - smallCount;
					
					if(bigKilos%bigKilosPack != 0) {
						
						answer = false;
						
					}else {
						
						answer = true;
					}
					
				}
			}
		
		return answer;
	}
}
