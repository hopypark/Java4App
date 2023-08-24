package week13.chap02;

public class AutoCloseableTest {
	
	public static void main(String[] args) {
		try(AutoCloseableObj obj = new AutoCloseableObj()){	
			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외 부분입니다.");
		}
	}
}


