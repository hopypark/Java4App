package week14.chap02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderExam {
	public static void main(String[] args) {		
		try(FileInputStream fis = new FileInputStream("d:/let_it_be_mixed.txt");
				InputStreamReader isr = new InputStreamReader(fis)){
			int data = 0;
			while((data = isr.read()) != -1) {
				System.out.print((char) data);
			}
		}catch(IOException e) { e.printStackTrace(); }

	}
}

