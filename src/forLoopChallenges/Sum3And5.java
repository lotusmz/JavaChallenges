package forLoopChallenges;

public class Sum3And5 {
	
	public static void SumThreeAndFive() {
		int counter = 0;
		int result = 0;
		
		for(int i=1;i<=1000;i++) {
			
			if(i%3 == 0 && i%5 == 0) {			
				counter ++;
				result += i;
				
				System.out.println("Numero encontrado = "+i);
			}
			
			if(counter == 5) {
				
				break;
			}
			
		}
		
		System.out.println("Total de los números = "+result);

	}
	
}
