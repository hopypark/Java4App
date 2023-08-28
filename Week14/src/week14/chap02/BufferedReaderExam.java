package week14.chap02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExam {

	public static void main(String[] args) {

		try(FileReader fr = new FileReader("D:/00.Workspace/01.Lecture/Lect_Java4App_eclipse"
				+ "/Week14/src/week14/chap02/BufferedReaderExam.java")){
			BufferedReader br = new BufferedReader(fr); // doesn't implemented an java.lang.Autocloseable
			String line = "";
			int i = 1;
			while((line = br.readLine()) != null) {
				System.out.printf("%3s: %s\n", i++,line);
			}
			br.close();
		}
		catch(IOException e) { 
			e.printStackTrace(); 
		}
	}
	
}

