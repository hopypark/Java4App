package week08.chap03;

public class OverridingTest3 {
	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerKim = new Customer(10010, "김유신");
		System.out.println(customerKim.getCustomerName() + " 님이 지불해야 햐는 금액은 " 
				+ customerKim.calcPrice(price) + "원입니다.");
		
		VIPCustomer customerLee = new VIPCustomer(10020,"이순신", 12345);
		System.out.println(customerLee.getCustomerName() + " 님이 지불해야 햐는 금액은 " 
				+ customerLee.calcPrice(price) + "원입니다.");
		
		Customer vc = new VIPCustomer(10030,"나몰라", 2000);		
		System.out.println(vc.getCustomerName() + " 님이 지불해야 햐는 금액은 " 
				+ vc.calcPrice(price) + "원입니다.");		
	}
}
