package forLoopChallenges;

public class AllFactors {
	
	public static void printFactor(int number) {
		int initialValue = number;
		
			if(number < 1 ) {
				System.out.println("Invalid Value");				
			}else {
				
				for(int i=0;i<initialValue;i++) {
					
					if(initialValue%number == 0) {
						
						System.out.println(number);
						
					}
					
					number--;
				}
				
			}
		
	}
	
}
