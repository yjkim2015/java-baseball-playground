package baseball;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BaseBallTest {
	Balls balls;
	@BeforeEach
	void setUp() {
		balls = new Balls(Arrays.asList(1,2,3));
	}
	
	@Test
	void ballTest() {
		PlayResult result = balls.play(Arrays.asList(2,3,4));
		assertThat(result.getStrike()).isEqualTo(0);
		
		assertThat(result.getBall()).isEqualTo(2);
	}
	
	
	@Test
	void nothingTest() {
		PlayResult result = balls.play(Arrays.asList(5,6,7));
		
		assertThat(result.isNothing()).isTrue();
	}
	
	@Test
	void GameEndTest() {
		PlayResult result = balls.play(Arrays.asList(1,2,3));
		
		assertThat(result.isGameEnd()).isTrue();
	}
}
