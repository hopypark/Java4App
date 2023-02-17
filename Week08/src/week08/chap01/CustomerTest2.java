package week08.chap01;

public class CustomerTest2 {
	public static void main(String[] args) {
//		VIPCustomer customerLee = new VIPCustomer();
//		
//		customerLee.setCustomerID(10020);
//		customerLee.setCustomerName("이순신");
		
		Customer vc = new VIPCustomer(10020,"이순신",12345);
		vc.bonusPoint = 10000;
		System.out.println(vc.showCustomerInfo());		
	}
}

