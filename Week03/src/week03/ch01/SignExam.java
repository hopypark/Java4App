package week03.ch01;

public class SignExam {

	public static void main(String[] args) {
		int num = 10;
		
		System.out.println(+num);	// 값 10이 그대로 출력
		System.out.println(-num);	// 값 10에 -가 붙어서 -10이 출력되지만 실제로 num값은 바뀌지 않음
		System.out.println(num);	// 값 10이 그대로 출력
		
		num = -num;					// num 값을 음수로 바꿔서 다시 num에 대입
		System.out.println(num);	// 값 -10이 출력됨
	}

}
