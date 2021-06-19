package baseball;

public class Ball {
	private final int position;
	private final BallNumber ballNo;
	
	public Ball(int position, int ballNo) {
		this.position = position;
		this.ballNo = new BallNumber(ballNo);
	}
	
	public BallStatus play(Ball ball) {
		if ( this.equals(ball) ) return BallStatus.STRIKE;
		
		if ( ball.matchBallNo(ballNo) ) return BallStatus.BALL;
		
		return BallStatus.NOTHING;
	}
	
	public boolean matchBallNo(BallNumber ballNo) {
		return this.ballNo.getNumber() == ballNo.getNumber();
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Ball ) {
			Ball ball = (Ball)obj;
			if ( ball.position == this.position 
					&& ball.ballNo.getNumber() == this.ballNo.getNumber() ) {
				return true;
			}
		}
		return false;
	}
}
