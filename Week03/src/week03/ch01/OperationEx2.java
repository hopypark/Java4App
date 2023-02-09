package week03.ch01;

public class OperationEx2 {
	public static void main(String[] args) {
//		int gameScore = 100;		// 게임에서 획득한 점수는 100점
//		
//		int totalScore1 = ++gameScore;		// gameScore에 1만큼 더한 값을 totalScore1에 대입
//		System.out.println(totalScore1);	// 101
//		
//		int totalScore2 = --gameScore;		// gameScore에 1만큼 뺀 값을 totalScore2에 대입
//		System.out.println(totalScore2);	// 100
		int num1 = 10;
		int num2 = 20;
		
		boolean flag = (num1 > 0) && (num2 > 0);
		System.out.println(flag);	// flag는 참
		flag = (num1 < 0) && (num2 > 0);
		System.out.println(flag);	// flag는 거짓
		flag = (num1 > 0) || (num2 > 0);
		System.out.println(flag);	// flag는 참
		
	}
}

