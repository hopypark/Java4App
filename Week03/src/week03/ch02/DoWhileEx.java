package week03.ch02;

public class DoWhileEx {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {	
			sum += num;		// 합계를 위한 변수 sum에 num을 더하고
			num++;			// num을 1씩 더해 나감
		} while (num <= 10); // num 값이 10보다 작거나 같을 동안 반복
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");			
	}

}

