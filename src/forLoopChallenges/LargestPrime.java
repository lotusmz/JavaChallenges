 package forLoopChallenges;

 /*Write a method that calculates the larges prime of any given number, 
  * if the number is negative or does not have any prime numbers,
  * the method should return -1 to indicate an invalid value*/
 
public class LargestPrime {

	public static int getLargestPrime(int number) {
		int answer = 0;
		
			if(number == 0 || number == 1 || number < 0) {
				
				answer = -1;
				
			}else {
				
				for(int i=2;i<=number;i++) {
					
					while(number%i == 0) {
						
						number = number/i;
						answer = i;
					}
				}
				
			}
		
		return answer;
	}
	
}
