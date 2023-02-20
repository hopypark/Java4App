package week08.chap05;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerKim = new Customer(10010, "김유신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYoul = new GoldCustomer(10040, "이율곡");
		Customer customerLee = new VIPCustomer(10050, "이순신", 12345);
		
		customerList.add(customerKim);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerLee);
		
		System.out.println("===== 고객 정보 출력 =====");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " 님이 " + cost + "원 지불하였습니다.");
			System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
		}
	}
}


