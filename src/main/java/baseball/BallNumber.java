package baseball;

public class BallNumber {

	public static final int MIN = 1;
	public static final int MAX = 9;
	
	private int no;
	
	public BallNumber(int no) {
		if ( no < MIN || no > MAX ) {
			throw new IllegalArgumentException("1~9사이의 숫자를 입력해주세요");
		}
		this.no = no;
	}
	
	public int getNumber() {
		return this.no;
	}
}

