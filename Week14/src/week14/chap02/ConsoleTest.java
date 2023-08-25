package week14.chap02;

import java.io.Console;

public class ConsoleTest {
	public static void main(String[] args) {
		Console console = System.console();	// 표준입력-키보드
		
		System.out.println("이름: ");	// 이름 - 문자열
		String name = console.readLine();
		System.out.println("직업: ");	// 직업 - 문자열
		String job = console.readLine();
		System.out.println("비밀번호: ");	// 비밀번호
		char[] pass = console.readPassword();
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}
}

