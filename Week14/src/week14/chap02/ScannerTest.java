package week14.chap02;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	// 표준입력-키보드
		
		System.out.println("이름: ");	// 이름 - 문자열
		String name = scanner.nextLine();
		System.out.println("직업: ");	// 직업 - 문자열
		String job = scanner.nextLine();
		System.out.println("사번: ");	// 사번 -정수
		int num = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
	}

}

