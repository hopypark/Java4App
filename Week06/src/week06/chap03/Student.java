package week06.chap03;

public class Student {
	public static int serialNum = 1000;
	int studentID;			// 학번
	String studentName;		// 이름
	int grade;				// 학년
	String address;			// 사는 곳
		
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}

