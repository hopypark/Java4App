package week13.chap02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		FileInputStream fis = null;		
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);	// 예외 클래스의 toString() 메서드 호출
		} finally {
			if (fis != null) {
				try {
					fis.close(); // 파일 리소스 닫기
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("여기는 항상 수행됩니다.");	// 여기는 예외 상관없이 항상 수행
		}		
		System.out.println("여기도 수행됩니다.");	// 예외처리가 되었기 때문에 정상 실행
	}
}


