package week04.ch05;

public class Student {
	int studentID;			// 학번
	String studentName;		// 이름
	int grade;				// 학년
	String address;			// 사는 곳
	
	public void showStudentInfo( ) {
		System.out.println(studentName + ", " + address); // 이름과 주소 출력
	}
}

