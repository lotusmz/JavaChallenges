package forLoopChallenges;

public class AllFactors {
	
	public static void printFactor(int number) {
		int initialValue = 1;
		
			if(number < 1 ) {
				System.out.println("Invalid Value");				
			}else {
				
				for(int i=number;i>=initialValue;) {
					
					if(number%initialValue == 0) {
						
						System.out.print(initialValue + " ");
						
					}
					
					initialValue++;
				}
				
			}
		
	}
	
}
