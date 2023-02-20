package week08.chap04;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customerKim = new Customer();
		customerKim.setCustomerID(10010);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 1000;
		
		System.out.println(customerKim.showCustomerInfo());
		
		Customer customerLee = new VIPCustomer(10020, "이순신", 12345);
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		
		int price = 10000;
		int kimPrice = customerKim.calcPrice(price);
		int leePrice = customerLee.calcPrice(price);

		System.out.println(customerKim.getCustomerName() + " 님이 " + kimPrice + "원 지불하셨습니다.");
		System.out.println(customerKim.showCustomerInfo());
		System.out.println(customerLee.getCustomerName() + " 님이 " + leePrice + "원 지불하셨습니다.");
		System.out.println(customerLee.showCustomerInfo());		
	}
}


