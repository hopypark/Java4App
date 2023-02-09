package week04.ch05;

public class StudentView {

	int add(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	int getTenTotal() {
		int i;
		int total = 0;
		for(i = 1; i <= 10; i++) {
			total += i;
		}
		return total;
	}
	
	void printGreeting(String name) {
		System.out.println(name + "님 안녕하세요");
		return; 	// 반환값 없음
	}
}


