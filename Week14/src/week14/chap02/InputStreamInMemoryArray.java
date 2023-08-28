package week14.chap02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class InputStreamInMemoryArray {
	public static void main(String[] args) {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		byte[] temp = new byte[10];	// 스트림이 사용하기 위한 버퍼
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		input.read(temp, 0, temp.length);// temp의 길이만큼 스트림에서 읽어 temp로 저장
		output.write(temp,5, 5); 	// temp배열의 5번째부터 5개 읽어서 스트림에 쓰기
		
		outSrc = output.toByteArray();	// 스트림내용을 배열로 변환
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("Temp Array   : " + Arrays.toString(temp));
		System.out.println("Output Source: " + Arrays.toString(outSrc));		
	}
}
