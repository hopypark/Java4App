package week12.chap01;

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() { 	// x,y값을 돌려주도록 toString() 재정의
		return "x = " + x + ", y = " + y;
	}
}

class Circle implements Cloneable{
	Point point;
	int radius;
	
	Circle(int x, int y, int radius){
		this.radius = radius;
		this.point = new Point(x, y);
	}
	
	public String toString() {
		return "원점은 " + point + "이고, 반지름은 " + radius + "입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException{
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle) circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
		
		String str1 = new String("abc");	// 생성자의 매개변수로 문자열 생성
		String str2 = "test";				// 문자열 상수를 가리키는 방식
		
	}
}
