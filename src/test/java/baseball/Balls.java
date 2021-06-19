package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
	List<Ball> answer;
	public Balls(List<Integer> answer) {
		this.answer = setBall(answer);
	}

	public static List<Ball> setBall(List<Integer> answer) {
		List<Ball> result = new ArrayList<>();
		for ( int i = 0 ; i < answer.size(); i++ ) {
			Ball ball = new Ball(i, answer.get(i));
			result.add(ball);
		}
		return result;
	}
	
	public PlayResult play(List<Integer> userBall) {
		List<Ball> balls = setBall(userBall);
		PlayResult result = new PlayResult();
		for ( Ball oneBall : balls ) {
			result.report(play(oneBall));
		}
		return result;
	}
	
	public BallStatus play(Ball userBall) {
		return answer.stream()
			.map(ball -> ball.play(userBall))
			.filter(BallStatus::isNotNothing)
			.findFirst()
			.orElse(BallStatus.NOTHING);
	}
}
