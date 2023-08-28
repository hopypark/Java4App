package week14.chap02;

import java.io.FileOutputStream;

public class FileOutputStreamExam {

	public static void main(String[] args) {
		String let_it_be = "When I find myself in times of trouble\n"
				+ "Mother Mary comes to me. Speaking words of wisdom, let it be.";
				
		try(FileOutputStream fos = new FileOutputStream("d:/let_it_be.txt")) {
			byte[] byteArray = let_it_be.getBytes();
			fos.write(byteArray);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}



