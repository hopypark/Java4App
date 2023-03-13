package week12.chap02;

public class StringBuilderTest {
	public static void main(String[] args) {
		String javaStr = new String("Java");
		System.out.println("javaStr 문자열 주소: " + System.identityHashCode(javaStr));
		
		StringBuilder builder = new StringBuilder(javaStr);
		System.out.println("연산 전 builder 메모리 주소: " + System.identityHashCode(builder));
		
		builder.append(" and");
		builder.append(" android");
		builder.append(" programming is fun!!!");
		System.out.println("연산 후 builder 메모리 주소: " + System.identityHashCode(builder));
		
		javaStr = builder.toString();
		System.out.println(javaStr);
		System.out.println("새로 만들어진 javaStr 문자열 주소: " + System.identityHashCode(javaStr));

	}
}

