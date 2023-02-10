package week04.hiding;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public void setDay(int pday) {
		if (month == 2) {
			if(pday < 1 || pday > 28) { // 2월이 28이라고 가정(윤년은 고려하지 않음)
				System.out.println("오류입니다.");
			}else {
				day = pday;
			}
		}
	}
}


