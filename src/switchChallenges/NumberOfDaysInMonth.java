package switchChallenges;

public class NumberOfDaysInMonth {
	
	public static boolean isLeapYear(int year) {
		boolean result = false;
		
			if(year < 1 || year > 9999) {
				result = false;
			}else {
				
				if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
					result = true;
				}
				
			}
		
		return result;
	}
	
	public static int getDaysInMonth(int month, int year) {
		int result = -1;
		
			if((month>=1&&month<=12)&&(year>1&&year<9999)) {
				
				switch(month) {
				case 1:
					result = 31;
					break;
				case 2:
					if(isLeapYear(year)) {
						result = 29;
					}else {
						result = 28;
					}
					break;
				case 3:
					result = 31;
					break;
				case 4:
					result = 30;
					break;
				case 5: 
					result = 31;
					break;
				case 6:
					result = 30;
					break;
				case 7:
					result = 31;
					break;
				case 8:
					result = 31;
					break;					
				case 9: 
					result = 30;
					break;
				case 10:
					result = 31;
					break;	
				case 11: 
					result = 30;
					break;
				case 12:
					result = 31;
					break;	
				default:
					result = -1;
					break;
				}
				
			}
		
		return result;
	}
}
