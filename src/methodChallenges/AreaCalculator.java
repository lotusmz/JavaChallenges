package methodChallenges;

public class AreaCalculator {
	private final static double PI = 3.14159;
	
	public static double area(double radius) {
		double result = radius;
		
		
		if(radius<0) {
			result = -1.0;
		}else {
			result = radius*radius*PI;
		}
		
		return result;
	}
	
	public static double area(double x, double y) {
		double result = 0;
			
		if(x<0 || y<0) {
			result = -1.0;
		}else {
			result = x*y;
		}
		
		return result;
		
	}
}
