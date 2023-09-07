package week01.cha02;

public class ConstantVariable {
	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final int MIN_NUM = -999;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
//		MAX_NUM = 1000;	// 오류 발생. 상수는 새로운 값을 할당할 수 없다.
	}
}

