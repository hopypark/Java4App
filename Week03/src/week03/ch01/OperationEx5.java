package week03.ch01;

public class OperationEx5 {
	public static void main(String[] args) {
		int num = 0B00000101;	// 십진수 5를 이진수로 표현
		
		System.out.println(num << 2);	// 왼쪽으로 2비트 이동 00010100 (20)
		System.out.println(num >> 2);	// 오른으로 2비트 이동 00000001  (1)
		System.out.println(num >> 2);	// 오른으로 2비트 이동 00000001  (1)
		
		System.out.println(num);
		num = num << 2;
		System.out.println(num);
		
		int age = 10;
		
		if (age >= 8) {
			System.out.println("학교에 다닙니다.");
		}
		
	}
}

