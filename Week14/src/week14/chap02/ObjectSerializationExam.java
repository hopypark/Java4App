package week14.chap02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ObjectSerializationExam {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("d:/user.ser");
				ObjectInputStream in = new ObjectInputStream(fis)){
			User user = (User) in.readObject();			
			System.out.println("ID: " + user.id + ", PW: " + user.password + ", AGE: " + user.age);
		} catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}


class User implements Serializable{
	// 클래스를 직렬화했을 때와 역직렬화했을 때의 클래스가 같은지 확인할 때 사용
	private static final long serialVersionUID = -7671679044858812266L;
	String id;
	String password;
	int age;
	public User(String id, String password, int age) {
		this.id = id;
		this.password = password;
		this.age = age;
	}
}

