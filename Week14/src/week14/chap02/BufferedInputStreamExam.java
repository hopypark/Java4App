package week14.chap02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExam {
	public static void main(String[] args) {
		int data = 0;
		// 버퍼(보조 스트림)를 사용하지 않을 경우		
		try(FileInputStream fis = new FileInputStream("d:/Pride_and Prejudice_by_Jane_Austen.txt")){
			long s_time = System.currentTimeMillis();
			while((data = fis.read()) != -1);
			System.out.println("Elapsed Time without Buffer: " + (System.currentTimeMillis() - s_time));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		// 버퍼(보조 스트림)를 사용하는 경우
		try(FileInputStream fis = new FileInputStream("d:/Pride_and Prejudice_by_Jane_Austen.txt"); 
			BufferedInputStream bis = new BufferedInputStream(fis)){ // default buff size=8192			
			long s_time = System.currentTimeMillis();
			while((data = bis.read()) != -1);
			System.out.println("Elapsed Time with Buffer: " + (System.currentTimeMillis() - s_time));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

