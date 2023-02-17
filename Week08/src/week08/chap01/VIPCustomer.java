package week08.chap01;

public class VIPCustomer extends Customer {
	// VIP용
	private int agentID;		// VIP 고객 담당 상담원
	double saleRatio;			// 할인율
	
	public VIPCustomer() {
		super();
		customerGrade = "VIP";	// 기본 등급
		bonusRatio = 0.05;		// 기본 적립 비율 5%
		saleRatio = 0.1;		// 할인율 10%
		System.out.println("VIPCustomer() 생성자 호출");		
	}
		
	
	public int getAgentID() {
		return agentID;
	}
}


