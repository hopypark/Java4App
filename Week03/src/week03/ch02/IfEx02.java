package week03.ch02;

public class IfEx02 {
	public static void main(String[] args) {
		int age = 9;
		int charge;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		} else if ( age < 14 ) {
			charge = 2000;
			System.out.println("초등학생입니다.");			
		} else if ( age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생입니다.");			
		} else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는 " + charge + "원 입니다.");
		
//		int ranking = 1;
//		char medalColor;
//
//		switch(ranking) {
//			case 1: medalColor = 'G';
//			case 2: medalColor = 'S';
//			case 3: medalColor = 'B';
//			default: medalColor = 'A';	
//		}
//		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + " 입니다.");
//		
	}
}

