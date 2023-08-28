package week14.chap02;

import java.io.FileInputStream;

public class FileInputStreamExam {
	public static void main(String[] args) {	
		int c;
		
		System.out.println("파일 읽기: c:/windows/system.ini");
		System.out.println();	// 한 줄 띄우기
		try(FileInputStream fis = new FileInputStream("c:/windows/system.ini")){
			while((c = fis.read()) != -1) {
				System.out.print(c); // 읽은 int형을 char형(문자형)으로 출력
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

