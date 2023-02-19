package week08.chap03;

public class OverridingTest1 {
	public static void main(String[] args) {
		Customer customerKim = new Customer(10010, "김유신");
		customerKim.bonusPoint = 1000;
		
		VIPCustomer customerLee = new VIPCustomer(10020,"이순신", 12345);
		customerLee.bonusPoint = 10000;
		
		Customer vc = new VIPCustomer(10030,"나몰라", 2000);
		vc.calcPrice(10000);
		
		int price = 10000; // 가격이 10000원
		System.out.println(customerKim.getCustomerName() + " 님이 지불해야 햐는 금액은 " 
			+ customerKim.calcPrice(price) + "원입니다.");
		System.out.println(customerLee.getCustomerName() + " 님이 지불해야 햐는 금액은 " 
				+ customerLee.calcPrice(price) + "원입니다.");		
	}
}

