package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ballTest {
	Ball ball;
	@BeforeEach
	void setUp(){
		ball = new Ball(1,3);
	}
	
	@Test
	void StrikeTest() {
		assertThat(ball.play(new Ball(1,3))).isEqualTo(BallStatus.STRIKE);
	}
	
	@Test
	void BallTest() {
		assertThat(ball.play(new Ball(2,3))).isEqualTo(BallStatus.BALL);
	}
	
	
	@Test
	void NothingTest() {
		assertThat(ball.play(new Ball(3,2))).isEqualTo(BallStatus.NOTHING);
	}
	
	
	
}
