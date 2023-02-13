package week06.chap03;

public class Student1 {
	public static int serialNum = 1000;
	int studentID;			// 학번
	String studentName;		// 이름
	int grade;				// 학년
	String address;			// 사는 곳
	
	public Student1() {
		serialNum++;			// 학생이 생성될 때마다 증가
		studentID = serialNum;	// 증가된 값을 학번 인스턴스 변수에 대입
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}	
}


