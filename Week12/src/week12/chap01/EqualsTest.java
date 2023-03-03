package week12.chap01;

class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentId + ", " + studentName;
	}
}

public class EqualsTest{
	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "이순신");
		Student studentLee2 = studentLee;	// 주소 복사
		Student studentSoon = new Student(100, "이순신");
		
		if (studentLee == studentLee2) // == 기호로 비교
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else 
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		
		if (studentLee.equals(studentLee2)) // equals() 메서드로 비교
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		else 
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		
		
		
	}
}
