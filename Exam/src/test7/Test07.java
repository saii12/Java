package test7;

/* 날짜 : 2023/07/20
 * 이름 : 박한산
 * 내용 : 자바 총정리 연습문제
 * 
 */

interface Player {
	public abstract void play();
}
		
class BaseBallPlayer implements Player {
	@Override
	public void play() {
		System.out.println("야구를 합니다.");
	}
}

class FootBallPlayer implements Player {
	@Override
	public void play() {
		System.out.println("축구를 합니다.");
	}
}

public class Test07 {

	public static void main(String[] args) {
		
		Player p1 = new BaseBallPlayer(); // implements하니까 BaseBallPlayer의 타입은 Player
		Player p2 = new FootBallPlayer(); // implements하니까 FootBallPlayer의 타입은 Player
		
		playGame(p1);
		playGame(p2);
	}
	
	public static void playGame(Player p) {
		p.play();
	}
}
