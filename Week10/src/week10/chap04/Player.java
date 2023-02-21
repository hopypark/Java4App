package week10.chap04;

public class Player {
	private PlayerLevel level; // Player가 가지는 level 변수 선언
	
	public Player() {	// 디폴트 생성자. 처음 생성되면 BeginnerLevel로 시작
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);  	// PlayerLevel의 템플릿 메서드 go()호출 
	}
}


