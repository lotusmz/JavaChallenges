package methodChallenges;

public class PlayingCat {
	
	public static boolean isCatPlaying(boolean summer, int temperature) {
		Boolean playing = false;
		
		if(summer) {
			if(temperature>=25 && temperature<=45) {
				playing = true;
			}
		}else {
			if(temperature >=25 && temperature<=35) {
				playing = true;
			}
		}
		
		return playing;
	}
}
