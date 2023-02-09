package week04.constructor;

public class PersonTest {
	public static void main(String[] args) {
		
		Person personLee = new Person();
		personLee.name = "이순신";
		personLee.height = 180.0F;
		personLee.weight = 85.5F;
		
		Person personKim = new Person("김유신", 175, 75);
	}
}
