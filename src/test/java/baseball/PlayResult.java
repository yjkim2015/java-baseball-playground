package baseball;


public class PlayResult {
	private int strike = 0;
	private int ball = 0; 
	
	public int getStrike() {
		return this.strike;
	}
	
	public int getBall() {
		return this.ball;
	}
	
	public boolean isNothing() {
		return this.strike == 0 && this.ball == 0;
	}
	
	public void report(BallStatus status) {
		if ( status.isStrike() ) {
			this.strike++;
		}
		else if ( status.isBall() ) {
			this.ball++;
		}
	}

	public boolean isGameEnd() {
		return this.strike == 3;
	}
}
