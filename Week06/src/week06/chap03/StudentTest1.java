package week06.chap03;

public class StudentTest1 {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum); // serialNum 변수의 초기값 출력
		studentLee.serialNum++;
		
		Student studentSon = new Student();
		studentLee.setStudentName("손수경");
		System.out.println(studentLee.serialNum); 
		System.out.println(studentSon.serialNum); 		
	}
}

