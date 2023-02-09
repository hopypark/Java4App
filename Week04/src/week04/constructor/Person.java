package week04.constructor;

public class Person {
	String name;		// 이름
	float height;		// 키
	float weight;		// 몸무게
	
	public Person() {  }
	
	public Person(String pname) { 
		name = pname;
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}

