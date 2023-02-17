package week08.chap01;

public class CustomerTest1 {
	public static void main(String[] args) {
		Customer customerKim = new Customer();
		customerKim.setCustomerID(10010);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 1000;
		System.out.println(customerKim.showCustomerInfo());
		
//		VIPCustomer customerLee = new VIPCustomer();
//		customerLee.setCustomerID(10020);
//		customerLee.setCustomerName("이순신");
//		customerLee.bonusPoint = 10000;
//		System.out.println(customerLee.showCustomerInfo());		
	}
}

