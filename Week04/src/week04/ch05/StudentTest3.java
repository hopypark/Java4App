package week04.ch05;

public class StudentTest3 {
	public static void main(String[] args) {
		Student student1 = new Student();	// 첫 번째 학생 생성
		Student student2 = new Student();	// 두 번째 학생 생성
		
		student1.studentName = "홍길동";								
		student2.studentName = "안상수";		// 멤버 변수 사용
		
		System.out.println(student1);
		System.out.println(student2);	// 메서드 사용
	}
}

