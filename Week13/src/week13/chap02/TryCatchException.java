package week13.chap02;

public class TryCatchException {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(100/0);
			System.out.println(4);
		} catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("예외: " + e.getMessage());
		} catch(Exception e) {
			System.out.println("ArithmeticException 외의 다른 예외 발생");
		}
		System.out.println(5);
	}
}

