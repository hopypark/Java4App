package week14.chap02;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("d:/writeyou.txt")){
			fw.write('A');
			char buff[] = {'B','C','D','E','F','G'};
			
			fw.write(buff);
			fw.write("안녕하세요. 잘 써지네요.");
			fw.write(buff, 1, 2);
			fw.write(65);
		}catch(IOException e) {		
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}

