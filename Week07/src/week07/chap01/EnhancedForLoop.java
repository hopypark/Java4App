package week07.chap01;

public class EnhancedForLoop {
	public static void main(String[] args) {
		String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};

		for( String lang : strArray) {
			System.out.println(lang);
		}
	}
}

