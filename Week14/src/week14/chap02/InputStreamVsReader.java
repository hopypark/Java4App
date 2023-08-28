package week14.chap02;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class InputStreamVsReader {
	public static void main(String[] args) {
		String file = "d:/readme.txt";
		int ch;
		
		System.out.print("바이트 기반: ");
		try (FileInputStream fis = new FileInputStream(file)){
			while((ch=fis.read()) != -1) {
				System.out.print((char) ch);
			}			
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.print("문자 기반: ");
		try (FileReader fr= new FileReader(file)){
			while((ch=fr.read()) != -1) {
				System.out.print((char) ch);			}	
		}catch(IOException e) {
			e.printStackTrace();
		}		
	}
}


